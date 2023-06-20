package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import fm.castbox.mediation.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

@o6.a(name = RNCWebViewModule.MODULE_NAME)
/* loaded from: classes3.dex */
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    protected static final d shouldOverrideUrlLoadingLock = new d();
    private DownloadManager.Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private File outputImage;
    private File outputVideo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f28362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f28363b;

        a(String str, String str2) {
            this.f28362a = str;
            this.f28363b = str2;
        }

        @Override // com.facebook.react.modules.core.f
        public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
            if (i10 != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(RNCWebViewModule.this.getCurrentActivity().getApplicationContext(), this.f28363b, 1).show();
            } else if (RNCWebViewModule.this.downloadRequest != null) {
                RNCWebViewModule.this.downloadFile(this.f28362a);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f28365a;

        static {
            int[] iArr = new int[c.values().length];
            f28365a = iArr;
            try {
                iArr[c.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28365a[c.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO(DownloadResource.TYPE_VIDEO);
        

        /* renamed from: a  reason: collision with root package name */
        private final String f28370a;

        c(String str) {
            this.f28370a = str;
        }
    }

    /* loaded from: classes3.dex */
    protected static class d {

        /* renamed from: a  reason: collision with root package name */
        private int f28371a = 1;

        /* renamed from: b  reason: collision with root package name */
        private final HashMap<Integer, AtomicReference<a>> f28372b = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes3.dex */
        public enum a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected d() {
        }

        public synchronized AtomicReference<a> a(Integer num) {
            return this.f28372b.get(num);
        }

        public synchronized h0.d<Integer, AtomicReference<a>> b() {
            int i10;
            AtomicReference<a> atomicReference;
            i10 = this.f28371a;
            this.f28371a = i10 + 1;
            atomicReference = new AtomicReference<>(a.UNDECIDED);
            this.f28372b.put(Integer.valueOf(i10), atomicReference);
            return new h0.d<>(Integer.valueOf(i10), atomicReference);
        }

        public synchronized void c(Integer num) {
            this.f28372b.remove(num);
        }
    }

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.IMAGE.f28370a));
    }

    private Boolean acceptsVideo(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return Boolean.FALSE;
        }
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.VIDEO.f28370a));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (noAcceptTypesSet(strArr).booleanValue()) {
            return new String[]{c.DEFAULT.f28370a};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str.matches("\\.\\w+")) {
                String mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(".", ""));
                if (mimeTypeFromExtension != null) {
                    strArr2[i10] = mimeTypeFromExtension;
                } else {
                    strArr2[i10] = str;
                }
            } else {
                strArr2[i10] = str;
            }
        }
        return strArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File getCapturedFile(com.reactnativecommunity.webview.RNCWebViewModule.c r7) throws java.io.IOException {
        /*
            r6 = this;
            int[] r0 = com.reactnativecommunity.webview.RNCWebViewModule.b.f28365a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 1
            java.lang.String r1 = ""
            if (r7 == r0) goto L1a
            r0 = 2
            if (r7 == r0) goto L13
            r7 = r1
            r0 = r7
            goto L23
        L13:
            java.lang.String r1 = android.os.Environment.DIRECTORY_MOVIES
            java.lang.String r7 = "video-"
            java.lang.String r0 = ".mp4"
            goto L20
        L1a:
            java.lang.String r1 = android.os.Environment.DIRECTORY_PICTURES
            java.lang.String r7 = "image-"
            java.lang.String r0 = ".jpg"
        L20:
            r5 = r1
            r1 = r7
            r7 = r5
        L23:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 >= r4) goto L4d
            java.io.File r7 = android.os.Environment.getExternalStoragePublicDirectory(r7)
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r2)
            goto L5a
        L4d:
            com.facebook.react.bridge.ReactApplicationContext r7 = r6.getReactApplicationContext()
            r2 = 0
            java.io.File r7 = r7.getExternalFilesDir(r2)
            java.io.File r0 = java.io.File.createTempFile(r1, r0, r7)
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewModule.getCapturedFile(com.reactnativecommunity.webview.RNCWebViewModule$c):java.io.File");
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? c.DEFAULT.f28370a : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(File file) {
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return FileProvider.e(reactApplicationContext, packageName + ".fileprovider", file);
    }

    private e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if (currentActivity instanceof e) {
                return (e) currentActivity;
            }
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
    }

    private Intent getPhotoIntent() {
        Intent intent;
        Exception e10;
        try {
            File capturedFile = getCapturedFile(c.IMAGE);
            this.outputImage = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
            } catch (IOException e11) {
                e10 = e11;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e12) {
                e10 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e13) {
            intent = null;
            e10 = e13;
        }
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i10) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i11 = 0; i11 < itemCount; i11++) {
                uriArr[i11] = intent.getClipData().getItemAt(i11).getUri();
            }
            return uriArr;
        } else if (intent.getData() == null || i10 != -1 || Build.VERSION.SDK_INT < 21) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i10, intent);
        }
    }

    private Intent getVideoIntent() {
        Intent intent;
        Exception e10;
        try {
            File capturedFile = getCapturedFile(c.VIDEO);
            this.outputVideo = capturedFile;
            Uri outputUri = getOutputUri(capturedFile);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
            } catch (IOException e11) {
                e10 = e11;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            } catch (IllegalArgumentException e12) {
                e10 = e12;
                Log.e("CREATE FILE", "Error occurred while creating the File", e10);
                e10.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e13) {
            intent = null;
            e10 = e13;
        }
        return intent;
    }

    private f getWebviewFileDownloaderPermissionListener(String str, String str2) {
        return new a(str, str2);
    }

    private Boolean noAcceptTypesSet(String[] strArr) {
        boolean z10 = true;
        if (strArr.length != 0 && (strArr.length != 1 || strArr[0] == null || strArr[0].length() != 0)) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public void downloadFile(String str) {
        try {
            ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
            Toast.makeText(getCurrentActivity().getApplicationContext(), str, 1).show();
        } catch (IllegalArgumentException e10) {
            Log.w("RNCWebViewModule", "Unsupported URI, aborting download", e10);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public boolean grantFileDownloaderPermissions(String str, String str2) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28) {
            return true;
        }
        boolean z10 = androidx.core.content.b.a(getCurrentActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z10 && i10 >= 23) {
            getPermissionAwareActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, getWebviewFileDownloaderPermissionListener(str, str2));
        }
        return z10;
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        Boolean bool = Boolean.FALSE;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            bool = Boolean.TRUE;
        }
        if (i10 >= 16 && i10 <= 18) {
            bool = Boolean.TRUE;
        }
        promise.resolve(bool);
    }

    protected boolean needsCameraPermission() {
        try {
            if (Arrays.asList(getCurrentActivity().getPackageManager().getPackageInfo(getReactApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA")) {
                if (androidx.core.content.b.a(getCurrentActivity(), "android.permission.CAMERA") != 0) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
            return;
        }
        File file = this.outputImage;
        boolean z10 = file != null && file.length() > 0;
        File file2 = this.outputVideo;
        boolean z11 = file2 != null && file2.length() > 0;
        if (i10 != 1) {
            if (i10 == 3) {
                if (i11 != -1) {
                    this.filePathCallbackLegacy.onReceiveValue(null);
                } else if (z10) {
                    this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputImage));
                } else if (z11) {
                    this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputVideo));
                } else {
                    this.filePathCallbackLegacy.onReceiveValue(intent.getData());
                }
            }
        } else if (i11 != -1) {
            ValueCallback<Uri[]> valueCallback = this.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else if (z10) {
            this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputImage)});
        } else if (z11) {
            this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputVideo)});
        } else {
            this.filePathCallback.onReceiveValue(getSelectedFiles(intent, i11));
        }
        File file3 = this.outputImage;
        if (file3 != null && !z10) {
            file3.delete();
        }
        File file4 = this.outputVideo;
        if (file4 != null && !z11) {
            file4.delete();
        }
        this.filePathCallback = null;
        this.filePathCallbackLegacy = null;
        this.outputImage = null;
        this.outputVideo = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
    public void onShouldStartLoadWithRequestCallback(boolean z10, int i10) {
        AtomicReference<d.a> a10 = shouldOverrideUrlLoadingLock.a(Integer.valueOf(i10));
        if (a10 != null) {
            synchronized (a10) {
                a10.set(z10 ? d.a.DO_NOT_OVERRIDE : d.a.SHOULD_OVERRIDE);
                a10.notify();
            }
        }
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
            arrayList.add(photoIntent);
        }
        if (acceptsVideo(str).booleanValue() && (videoIntent = getVideoIntent()) != null) {
            arrayList.add(videoIntent);
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(createChooser, 3);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, c.DEFAULT.f28370a).booleanValue() || arrayContainsString(acceptedMimeType, c.IMAGE.f28370a).booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return Boolean.FALSE;
        }
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, c.DEFAULT.f28370a).booleanValue() || arrayContainsString(acceptedMimeType, c.VIDEO.f28370a).booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z10) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(c.DEFAULT.f28370a);
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z10);
        return intent;
    }

    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z10) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
                arrayList.add(photoIntent);
            }
            if (acceptsVideo(strArr).booleanValue() && (videoIntent = getVideoIntent()) != null) {
                arrayList.add(videoIntent);
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z10);
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent, 1);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
        return true;
    }
}
