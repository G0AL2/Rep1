package com.vehiclecloud.app.videofetch.rnmedia;

import android.app.Activity;
import android.app.RecoverableSecurityException;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Intent;
import android.content.IntentSender;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import com.vehiclecloud.app.videofetch.rndownloader.util.RN;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import com.vehiclecloud.app.videofetch.rnmedia.codec.MediaMuxerCompat;
import com.vehiclecloud.app.videofetch.rnmedia.codec.QueuedMuxer;
import com.vehiclecloud.app.videofetch.rnmedia.codec.TrackTranscoder;
import com.vehiclecloud.app.videofetch.rnmedia.codec.TransparentTrackTranscoder;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class RNMediaModule extends ReactContextBaseJavaModule {
    public static final String EVENT_PROGRESS = "vcRNMediaProgress";
    public static final String TAG = "RNMediaModule";
    public static final boolean VERBOSE = false;
    private final ExecutorService executor;
    private final ReactApplicationContext reactContext;

    /* loaded from: classes3.dex */
    private static class ConcatVideosTask implements Runnable {
        private static final String AES = "AES";
        private static final String CBC_PKCS5_PADDING = "AES/CBC/PKCS5Padding";
        private final String destPath;
        private final String fileBase;
        private final ReadableArray files;
        private byte[] keyIV;
        private byte[] keySign;
        private final Promise promise;

        public ConcatVideosTask(String str, String str2, ReadableArray readableArray, String str3, String str4, String str5, Promise promise) {
            this.destPath = str;
            this.fileBase = str2;
            this.files = readableArray;
            if (str3 != null && !str3.contains(AES)) {
                promise.reject("EUNSPECIFIED", "Unknown decrypt method:'" + str3 + "'");
            }
            if (str4 != null) {
                this.keySign = str4.getBytes();
            }
            if (str5 != null) {
                this.keyIV = str5.getBytes();
            }
            this.promise = promise;
        }

        private long cloneMediaUsingMuxer() throws Exception {
            MediaExtractor mediaExtractor;
            System.currentTimeMillis();
            MediaMuxer mediaMuxer = new MediaMuxer(this.destPath, 0);
            QueuedMuxer queuedMuxer = new QueuedMuxer(mediaMuxer);
            LinkedList linkedList = new LinkedList();
            int i10 = 0;
            while (true) {
                if (i10 >= this.files.size()) {
                    break;
                }
                String string = this.files.getString(i10);
                if (string == null) {
                    i10++;
                } else {
                    mediaExtractor = new MediaExtractor();
                    mediaExtractor.setDataSource(this.fileBase + string);
                    int trackCount = mediaExtractor.getTrackCount();
                    for (int i11 = 0; i11 < trackCount; i11++) {
                        mediaExtractor.selectTrack(i11);
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i11);
                        if (trackFormat.getString("mime").startsWith("audio/")) {
                            linkedList.addFirst(new AudioTrackTranscoder(i11, queuedMuxer, trackFormat, 0));
                        } else {
                            linkedList.add(new TransparentTrackTranscoder(i11, queuedMuxer, trackFormat, QueuedMuxer.SampleType.VIDEO));
                        }
                    }
                }
            }
            long j10 = 0;
            for (int i12 = 0; i12 < this.files.size(); i12++) {
                try {
                    try {
                        String string2 = this.files.getString(i12);
                        if (string2 != null) {
                            mediaExtractor = new MediaExtractor();
                            mediaExtractor.setDataSource(this.fileBase + string2);
                            try {
                                Iterator it = linkedList.iterator();
                                long j11 = j10;
                                while (it.hasNext()) {
                                    TrackTranscoder trackTranscoder = (TrackTranscoder) it.next();
                                    mediaExtractor.selectTrack(trackTranscoder.getExecutorTrackId());
                                    long trans = trackTranscoder.trans(mediaExtractor, j10, null);
                                    if (trans > j11) {
                                        j11 = trans;
                                    }
                                    mediaExtractor.unselectTrack(trackTranscoder.getExecutorTrackId());
                                }
                                mediaExtractor.release();
                                j10 = j11;
                            } finally {
                            }
                        }
                    } catch (Exception e10) {
                        throw e10;
                    }
                } finally {
                    mediaMuxer.stop();
                    mediaMuxer.release();
                }
            }
            return j10;
        }

        private void concatFiles() throws Exception {
            File file = new File(this.destPath);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                Promise promise = this.promise;
                promise.reject("EUNSPECIFIED", "Failed to create parent directory of '" + this.destPath + "'");
            } else if (file.exists() && !file.delete()) {
                Promise promise2 = this.promise;
                promise2.reject("EUNSPECIFIED", "Failed to delete file: '" + this.destPath + "'");
            } else if (!file.createNewFile()) {
                Promise promise3 = this.promise;
                promise3.reject("ENOENT", "File '" + this.destPath + "' does not exist and could not be created");
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                try {
                    byte[] bArr = new byte[10240];
                    for (int i10 = 0; i10 < this.files.size(); i10++) {
                        String string = this.files.getString(i10);
                        File file2 = new File(this.fileBase + string);
                        if (file2.exists()) {
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            if (this.keySign == null) {
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                            } else {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                while (true) {
                                    int read2 = fileInputStream.read(bArr);
                                    if (read2 <= 0) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, read2);
                                }
                                fileOutputStream.write(decrypt(this.keySign, this.keyIV, byteArrayOutputStream.toByteArray()));
                            }
                            fileInputStream.close();
                        } else {
                            throw new Exception("file not exist:" + this.fileBase + string);
                        }
                    }
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }

        private static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, AES);
            Cipher cipher = Cipher.getInstance(CBC_PKCS5_PADDING);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr3);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WritableMap createMap = Arguments.createMap();
                if (Build.VERSION.SDK_INT < 26 && this.files.size() <= 300 && this.keySign == null) {
                    createMap.putDouble("duration", cloneMediaUsingMuxer());
                    this.promise.resolve(createMap);
                }
                concatFiles();
                createMap.putDouble("duration", 1.0d);
                this.promise.resolve(createMap);
            } catch (Exception e10) {
                this.promise.reject(e10);
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class DeleteVideos extends GuardedAsyncTask<Void, Void> implements ActivityEventListener {
        private static final int DELETE_PERMISSION_REQUEST = 4147;
        private final ReactContext mContext;
        private final Promise mPromise;
        private final ReadableArray mUris;
        private final ContentResolver resolver;

        public DeleteVideos(ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext.getExceptionHandler());
            this.mContext = reactContext;
            this.resolver = reactContext.getContentResolver();
            this.mUris = readableArray;
            this.mPromise = promise;
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            this.mContext.removeActivityEventListener(this);
            if (i11 == -1 && i10 == DELETE_PERMISSION_REQUEST) {
                doInBackgroundGuarded(new Void[0]);
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            Activity currentActivity;
            String[] strArr = {"_id"};
            StringBuilder sb2 = new StringBuilder("?");
            for (int i10 = 1; i10 < this.mUris.size(); i10++) {
                sb2.append(", ?");
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Build.VERSION.SDK_INT >= 29 ? "_id" : "_data");
            sb3.append(" IN (");
            sb3.append((Object) sb2);
            sb3.append(")");
            String sb4 = sb3.toString();
            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            String[] strArr2 = new String[this.mUris.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < this.mUris.size(); i12++) {
                ReadableMap map = this.mUris.getMap(i12);
                if (map != null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        strArr2[i12] = map.getString("id");
                    } else {
                        strArr2[i12] = Uri.parse(map.getString("uri")).getPath();
                    }
                }
            }
            Cursor query = this.resolver.query(uri, strArr, sb4, strArr2, null);
            while (query.moveToNext()) {
                try {
                    try {
                        if (this.resolver.delete(ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, query.getLong(query.getColumnIndexOrThrow("_id"))), null, null) == 1) {
                            i11++;
                        }
                        if (i11 == this.mUris.size()) {
                            this.mPromise.resolve(Boolean.TRUE);
                        } else {
                            Promise promise = this.mPromise;
                            promise.reject("E_UNABLE_TO_DELETE", "Could not delete all media, only deleted " + i11 + " photos.");
                        }
                    } catch (Throwable th) {
                        try {
                            query.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    if (Build.VERSION.SDK_INT >= 29 && (e10 instanceof RecoverableSecurityException) && (currentActivity = this.mContext.getCurrentActivity()) != null) {
                        RecoverableSecurityException recoverableSecurityException = (RecoverableSecurityException) e10;
                        try {
                            this.mContext.addActivityEventListener(this);
                            currentActivity.startIntentSenderForResult(recoverableSecurityException.getUserAction().getActionIntent().getIntentSender(), DELETE_PERMISSION_REQUEST, null, 0, 0, 0, null);
                        } catch (IntentSender.SendIntentException e11) {
                            Log.d(RNMediaModule.TAG, "startIntentSender get ex:", e11);
                        }
                        try {
                            query.close();
                            return;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                    Log.d(RNMediaModule.TAG, "DeleteVideos get ex:", e10);
                    Promise promise2 = this.mPromise;
                    promise2.reject("E_UNABLE_TO_DELETE", "Could not delete all media, only deleted " + i11 + " photos.");
                }
            }
            try {
                query.close();
            } catch (Exception unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class ExtractAudioTask implements Runnable {
        private static final String CONTENT_PREFIX = "content://";
        private static final String EVENT_ERROR = "error";
        private final ContentResolver contentResolver;
        private final String destPath;
        private final ReactApplicationContext reactContext;
        private final String sourcePath;
        private final String taskId;

        public ExtractAudioTask(ReactApplicationContext reactApplicationContext, String str, String str2, String str3) {
            this.reactContext = reactApplicationContext;
            this.contentResolver = reactApplicationContext.getContentResolver();
            this.taskId = str;
            this.sourcePath = str2;
            this.destPath = str3;
        }

        private void cloneMediaUsingMuxer(MediaExtractor mediaExtractor, int i10, String str, int i11) throws IOException {
            TrackTranscoder audioTrackTranscoder;
            TrackTranscoder.Listener listener;
            MediaMuxer mediaMuxer = new MediaMuxer(str, 0);
            MediaMuxerCompat mediaMuxerCompat = new MediaMuxerCompat(mediaMuxer);
            mediaExtractor.selectTrack(i10);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
            long j10 = trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : 0L;
            if (j10 == 0) {
                sendEvent(RNMediaModule.EVENT_PROGRESS, Double.valueOf(-1.0d));
            }
            if (trackFormat.containsKey("aac-profile")) {
                audioTrackTranscoder = new TransparentTrackTranscoder(i10, mediaMuxerCompat, trackFormat, QueuedMuxer.SampleType.AUDIO);
            } else {
                audioTrackTranscoder = new AudioTrackTranscoder(i10, mediaMuxerCompat, trackFormat, i11);
            }
            if (0 == j10) {
                listener = null;
            } else {
                try {
                    try {
                        listener = new TrackTranscoder.Listener(j10) { // from class: com.vehiclecloud.app.videofetch.rnmedia.RNMediaModule.ExtractAudioTask.1
                            long currentLatch;
                            double currentPercent = 0.0d;
                            final long step;
                            final /* synthetic */ long val$totalDuration;

                            {
                                this.val$totalDuration = j10;
                                long j11 = j10 / 100;
                                this.step = j11;
                                this.currentLatch = j11;
                            }

                            @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.TrackTranscoder.Listener
                            public void onWriteSampleData(MediaCodec.BufferInfo bufferInfo) {
                                long j11 = bufferInfo.presentationTimeUs;
                                long j12 = this.currentLatch;
                                if (j11 > j12) {
                                    double d10 = this.currentPercent + 0.01d;
                                    this.currentPercent = d10;
                                    this.currentLatch = j12 + this.step;
                                    ExtractAudioTask.this.sendEvent(RNMediaModule.EVENT_PROGRESS, Double.valueOf(d10));
                                }
                            }
                        };
                    } catch (Exception e10) {
                        throw e10;
                    }
                } finally {
                    mediaMuxer.stop();
                    mediaMuxer.release();
                }
            }
            sendEvent("complete", Double.valueOf(audioTrackTranscoder.trans(mediaExtractor, 0L, listener)));
        }

        private static int selectTrack(MediaExtractor mediaExtractor) {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                if (mediaExtractor.getTrackFormat(i10).getString("mime").startsWith("audio/")) {
                    return i10;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendEvent(String str, Object obj) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("id", this.taskId);
            if (obj != null) {
                if (obj instanceof String) {
                    createMap.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) obj);
                } else {
                    createMap.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, ((Double) obj).doubleValue());
                }
            }
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, createMap);
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaExtractor mediaExtractor = null;
            try {
                try {
                    boolean startsWith = this.sourcePath.startsWith(CONTENT_PREFIX);
                    int i10 = 0;
                    if (!startsWith) {
                        File file = new File(this.sourcePath);
                        if (!file.canRead()) {
                            sendEvent("error", "SOURCE_CAN_NOT_READ");
                            return;
                        }
                        i10 = (int) file.length();
                    }
                    MediaExtractor mediaExtractor2 = new MediaExtractor();
                    try {
                        if (!startsWith) {
                            mediaExtractor2.setDataSource(this.sourcePath);
                        } else {
                            ParcelFileDescriptor openFileDescriptor = this.contentResolver.openFileDescriptor(Uri.parse(this.sourcePath), "r");
                            if (openFileDescriptor == null) {
                                sendEvent("error", "SOURCE_CAN_NOT_READ");
                                mediaExtractor2.release();
                                return;
                            }
                            mediaExtractor2.setDataSource(openFileDescriptor.getFileDescriptor());
                        }
                        int selectTrack = selectTrack(mediaExtractor2);
                        if (selectTrack < 0) {
                            sendEvent("error", "SOURCE_NO_AUDIO_TRACK");
                            mediaExtractor2.release();
                            return;
                        }
                        cloneMediaUsingMuxer(mediaExtractor2, selectTrack, this.destPath, i10);
                        mediaExtractor2.release();
                    } catch (Exception e10) {
                        e = e10;
                        mediaExtractor = mediaExtractor2;
                        sendEvent("error", e.getMessage());
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                    } catch (Throwable th) {
                        th = th;
                        mediaExtractor = mediaExtractor2;
                        if (mediaExtractor != null) {
                            mediaExtractor.release();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* loaded from: classes3.dex */
    private static final class GetVideosTask implements Runnable {
        private static final String DATA_PNG_HEAD = "data:image/png;base64,";
        private static final String ERROR_UNABLE_TO_LOAD = "E_UNABLE_TO_LOAD";
        private static final String ERROR_UNABLE_TO_LOAD_PERMISSION = "E_UNABLE_TO_LOAD_PERMISSION";
        private static final String[] projection;
        private static final String selection = "media_type=3";
        private static final String sortOrder = "date_added DESC, date_modified DESC";
        private final ReadableMap mParams;
        private final Promise mPromise;
        private final ContentResolver mResolver;

        static {
            projection = Build.VERSION.SDK_INT >= 29 ? new String[]{"_id", "_display_name", "date_added", "_size", "duration"} : new String[]{"_id", "_display_name", "date_added", "_data", "_size"};
        }

        public GetVideosTask(ReactContext reactContext, ReadableMap readableMap, Promise promise) {
            this.mParams = readableMap;
            this.mPromise = promise;
            this.mResolver = reactContext.getContentResolver();
        }

        private static void putPageInfo(WritableMap writableMap, int i10, int i11, int i12) {
            WritableMap createMap = Arguments.createMap();
            boolean z10 = i11 == i10;
            createMap.putBoolean("hasMore", z10);
            if (z10) {
                createMap.putInt("endCursor", i12 + i11);
            }
            writableMap.putMap("page", createMap);
        }

        private void putResources(WritableMap writableMap, Cursor cursor) {
            int i10;
            int i11;
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("_display_name");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("date_added");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("_size");
            int i12 = Build.VERSION.SDK_INT;
            int i13 = -1;
            int columnIndexOrThrow5 = i12 >= 29 ? cursor.getColumnIndexOrThrow("duration") : -1;
            int columnIndexOrThrow6 = i12 < 29 ? cursor.getColumnIndexOrThrow("_data") : -1;
            WritableArray createArray = Arguments.createArray();
            while (cursor.moveToNext()) {
                WritableMap createMap = Arguments.createMap();
                long j10 = cursor.getLong(columnIndexOrThrow);
                RN.str(createMap, "id", String.valueOf(j10));
                RN.str(createMap, "type", DownloadResource.TYPE_VIDEO);
                RN.str(createMap, "referer", ImagesContract.LOCAL);
                RN.str(createMap, "title", cursor.getString(columnIndexOrThrow2));
                RN.i(createMap, "syncToGallery", i13);
                RN.i(createMap, "allowedNetworkTypes", 0);
                RN.l(createMap, "createdOn", cursor.getLong(columnIndexOrThrow3));
                RN.l(createMap, DownloadWorker.KEY_OUT_TOTAL_BYTES, cursor.getLong(columnIndexOrThrow4));
                RN.i(createMap, "status", 200);
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = columnIndexOrThrow;
                    i11 = columnIndexOrThrow2;
                    RN.l(createMap, "duration", cursor.getLong(columnIndexOrThrow5));
                    Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10);
                    String uri = withAppendedId.toString();
                    RN.str(createMap, "uri", uri);
                    RN.str(createMap, "fileName", uri);
                    try {
                        Bitmap loadThumbnail = this.mResolver.loadThumbnail(withAppendedId, new Size(640, 480), null);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        loadThumbnail.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putString("src", DATA_PNG_HEAD + encodeToString);
                        createMap2.putInt("width", 640);
                        createMap2.putInt("height", 480);
                        createMap.putMap("poster", createMap2);
                    } catch (IOException e10) {
                        Log.d(RNMediaModule.TAG, "GetVideosTask get thumbnail get ex: ", e10);
                    }
                } else {
                    i10 = columnIndexOrThrow;
                    i11 = columnIndexOrThrow2;
                    String string = cursor.getString(columnIndexOrThrow6);
                    RN.str(createMap, "uri", Uri.parse("file://" + string).toString());
                    RN.str(createMap, "fileName", string);
                }
                createArray.pushMap(createMap);
                columnIndexOrThrow = i10;
                columnIndexOrThrow2 = i11;
                i13 = -1;
            }
            writableMap.putArray("resources", createArray);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = RN.i(this.mParams, "limit", 0);
            int i11 = RN.i(this.mParams, "offset", 0);
            try {
                Cursor query = this.mResolver.query(MediaStore.Files.getContentUri("external").buildUpon().encodedQuery("limit=" + i11 + "," + i10).build(), projection, selection, null, sortOrder);
                if (query == null) {
                    this.mPromise.reject(ERROR_UNABLE_TO_LOAD, "Could not get media");
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                putResources(createMap, query);
                putPageInfo(createMap, query.getCount(), i10, i11);
                query.close();
                this.mPromise.resolve(createMap);
            } catch (SecurityException e10) {
                this.mPromise.reject(ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get media: need READ_EXTERNAL_STORAGE permission", e10);
            }
        }
    }

    public RNMediaModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.executor = Executors.newSingleThreadExecutor();
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void concatVideos(String str, String str2, ReadableArray readableArray, String str3, String str4, String str5, Promise promise) {
        this.executor.execute(new ConcatVideosTask(str, str2, readableArray, str3, str4, str5, promise));
    }

    @ReactMethod
    public void deleteFromMediaStore(ReadableArray readableArray, Promise promise) {
        if (readableArray.size() == 0) {
            promise.reject("E_UNABLE_TO_DELETE", "Need at least one URI to delete");
        } else {
            new DeleteVideos(this.reactContext, readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @ReactMethod
    public void extractAudio(String str, String str2, String str3) {
        this.executor.execute(new ExtractAudioTask(this.reactContext, str, str2, str3));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNMedia";
    }

    @ReactMethod
    public void getVideos(ReadableMap readableMap, Promise promise) {
        this.executor.submit(new GetVideosTask(getReactApplicationContext(), readableMap, promise));
    }

    @ReactMethod
    public void metadata(String str, Promise promise) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
            mediaMetadataRetriever.release();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("duration", extractMetadata);
            createMap.putString("width", extractMetadata2);
            createMap.putString("height", extractMetadata3);
            promise.resolve(createMap);
        } catch (Exception e10) {
            Log.d(TAG, "metadata get ex:", e10);
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void removeListeners(double d10) {
    }

    @ReactMethod
    public void shareFile(ReadableMap readableMap, Promise promise) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(RN.str(readableMap, ImagesContract.URL, "")));
            intent.setType(RN.str(readableMap, "type", ""));
            this.reactContext.getCurrentActivity().startActivity(Intent.createChooser(intent, RN.str(readableMap, "title", "")));
            promise.resolve(null);
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }
}
