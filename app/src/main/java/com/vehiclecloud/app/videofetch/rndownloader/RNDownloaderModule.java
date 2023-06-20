package com.vehiclecloud.app.videofetch.rndownloader;

import android.content.Context;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule;
import com.vehiclecloud.app.videofetch.rndownloader.data.AppDatabase;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceHeader;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceFolder;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceId;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceLatestOpenedOn;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceMergedFileName;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceStatus;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceStatusAndDuration;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceTotalBytes;
import com.vehiclecloud.app.videofetch.rndownloader.media.CommonParser;
import com.vehiclecloud.app.videofetch.rndownloader.media.DashParser;
import com.vehiclecloud.app.videofetch.rndownloader.media.HlsParser;
import com.vehiclecloud.app.videofetch.rndownloader.media.StreamingParser;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadNotifier;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import com.vehiclecloud.app.videofetch.rndownloader.util.FS;
import com.vehiclecloud.app.videofetch.rndownloader.util.FileUtils;
import com.vehiclecloud.app.videofetch.rndownloader.util.RN;
import com.vehiclecloud.app.videofetch.rndownloader.util.Scopes;
import fm.castbox.mediation.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb.t;
import jb.y;

/* loaded from: classes3.dex */
public class RNDownloaderModule extends ReactContextBaseJavaModule {
    public static final String TAG = "RNDownloaderModule";
    private DownloadNotifier mDownloadNotifier;
    private Downloads mDownloads;
    private static final Object sharedLock = new Object();
    private static final List<Integer> WORKING_STATUS = y.j(Integer.valueOf((int) DownloadResource.STATUS_PENDING), Integer.valueOf((int) DownloadResource.STATUS_RUNNING), Integer.valueOf((int) DownloadResource.STATUS_PAUSED_BY_APP), Integer.valueOf((int) DownloadResource.STATUS_WAITING_TO_RETRY));

    /* loaded from: classes3.dex */
    public static final class FolderUpdater extends Updater<DownloadResourceFolder> {
        private final Context context;

        public FolderUpdater(Context context, Downloads downloads, ReadableArray readableArray, Promise promise) {
            super(downloads, readableArray, promise);
            this.context = context;
        }

        public static /* synthetic */ void a(FolderUpdater folderUpdater, ArrayList arrayList) {
            folderUpdater.lambda$update$1(arrayList);
        }

        public static /* synthetic */ void b(FolderUpdater folderUpdater, List list) {
            folderUpdater.lambda$update$0(list);
        }

        private boolean isDownloading(int i10) {
            return i10 == 192 || i10 == 190;
        }

        public /* synthetic */ void lambda$update$0(List list) {
            this.mDownloads.downloadInfoDao.updateAllFolder(list);
        }

        public /* synthetic */ void lambda$update$1(ArrayList arrayList) {
            this.mDownloads.enqueue(arrayList);
        }

        private void move(String str, String str2) {
            try {
                new File(str).renameTo(new File(str2));
            } catch (Exception unused) {
            }
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        protected void update(final List<DownloadResourceFolder> list) {
            final ArrayList arrayList = new ArrayList();
            for (DownloadResourceFolder downloadResourceFolder : list) {
                if (isDownloading(downloadResourceFolder.status)) {
                    DownloadResourceWithHeaders withHeadersById = this.mDownloads.downloadInfoDao.getWithHeadersById(downloadResourceFolder.f28601id);
                    DownloadResource downloadResource = withHeadersById.resource;
                    if (downloadResource.workerId != null && isDownloading(downloadResource.status)) {
                        this.mDownloads.downloadInfoDao.updateStatus(new DownloadResourceStatus(downloadResourceFolder.f28601id, DownloadResource.STATUS_CANCELED));
                        this.mDownloads.cancelWork(withHeadersById.resource.workerId);
                        DownloadResource downloadResource2 = withHeadersById.resource;
                        downloadResource2.folder = downloadResourceFolder.folder;
                        downloadResource2.fileName = downloadResourceFolder.fileName;
                        downloadResource2.mergedFileName = downloadResourceFolder.mergedFileName;
                        downloadResource2.workerId = null;
                        arrayList.add(withHeadersById);
                    }
                }
                move(downloadResourceFolder.fileNameFrom, downloadResourceFolder.fileName);
                String str = downloadResourceFolder.mergedFileName;
                if (str != null) {
                    move(downloadResourceFolder.mergedFileNameFrom, str);
                }
            }
            AppDatabase.getInstance(this.context).runInTransaction(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.o
                @Override // java.lang.Runnable
                public final void run() {
                    RNDownloaderModule.FolderUpdater.b(RNDownloaderModule.FolderUpdater.this, list);
                }
            });
            Scopes.io().postDelayed(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.n
                @Override // java.lang.Runnable
                public final void run() {
                    RNDownloaderModule.FolderUpdater.a(RNDownloaderModule.FolderUpdater.this, arrayList);
                }
            }, 1000L);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        public DownloadResourceFolder parse(ReadableMap readableMap) {
            return new DownloadResourceFolder(RN.str(readableMap, "id", ""), RN.str(readableMap, "folder", (String) null), RN.str(readableMap, "fileName", (String) null), RN.str(readableMap, "fileNameFrom", (String) null), RN.str(readableMap, "mergedFileName", (String) null), RN.str(readableMap, "mergedFileNameFrom", (String) null), RN.i(readableMap, "status", 200));
        }
    }

    /* loaded from: classes3.dex */
    private static final class LatestOpenedOnUpdater extends Updater<DownloadResourceLatestOpenedOn> {
        public LatestOpenedOnUpdater(Downloads downloads, ReadableArray readableArray, Promise promise) {
            super(downloads, readableArray, promise);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        protected void update(List<DownloadResourceLatestOpenedOn> list) {
            this.mDownloads.downloadInfoDao.updateAllLatestOpenedOn(list);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        public DownloadResourceLatestOpenedOn parse(ReadableMap readableMap) {
            return new DownloadResourceLatestOpenedOn(RN.str(readableMap, "id", ""), RN.l(readableMap, "latestOpenedOn", 0L));
        }
    }

    /* loaded from: classes3.dex */
    private static final class StatusAndDurationUpdater extends Updater<DownloadResourceStatusAndDuration> {
        public StatusAndDurationUpdater(Downloads downloads, ReadableArray readableArray, Promise promise) {
            super(downloads, readableArray, promise);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        protected void update(List<DownloadResourceStatusAndDuration> list) {
            this.mDownloads.downloadInfoDao.updateAllStatusAndDuration(list);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        public DownloadResourceStatusAndDuration parse(ReadableMap readableMap) {
            return new DownloadResourceStatusAndDuration(RN.str(readableMap, "id", ""), RN.i(readableMap, "status", 0), RN.i(readableMap, "duration", 0));
        }
    }

    /* loaded from: classes3.dex */
    private static final class StatusUpdater extends Updater<DownloadResourceStatus> {
        public StatusUpdater(Downloads downloads, ReadableArray readableArray, Promise promise) {
            super(downloads, readableArray, promise);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        protected void update(List<DownloadResourceStatus> list) {
            this.mDownloads.downloadInfoDao.updateAllStatus(list);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        public DownloadResourceStatus parse(ReadableMap readableMap) {
            return new DownloadResourceStatus(RN.str(readableMap, "id", ""), RN.i(readableMap, "status", 0));
        }
    }

    /* loaded from: classes3.dex */
    private static final class TotalBytesUpdater extends Updater<DownloadResourceTotalBytes> {
        public TotalBytesUpdater(Downloads downloads, ReadableArray readableArray, Promise promise) {
            super(downloads, readableArray, promise);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        protected void update(List<DownloadResourceTotalBytes> list) {
            this.mDownloads.downloadInfoDao.updateAllTotalBytes(list);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.RNDownloaderModule.Updater
        public DownloadResourceTotalBytes parse(ReadableMap readableMap) {
            return new DownloadResourceTotalBytes(RN.str(readableMap, "id", ""), RN.l(readableMap, DownloadWorker.KEY_OUT_TOTAL_BYTES, 0L));
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Updater<T> implements Runnable {
        private final ReadableArray data;
        protected final Downloads mDownloads;
        private final Promise promise;

        public Updater(Downloads downloads, ReadableArray readableArray, Promise promise) {
            this.mDownloads = downloads;
            this.data = readableArray;
            this.promise = promise;
        }

        private List<T> parseList() {
            ArrayList arrayList = new ArrayList(this.data.size());
            for (int i10 = 0; i10 < this.data.size(); i10++) {
                ReadableMap map = this.data.getMap(i10);
                if (map != null) {
                    arrayList.add(parse(map));
                }
            }
            return arrayList;
        }

        protected abstract T parse(ReadableMap readableMap);

        @Override // java.lang.Runnable
        public void run() {
            try {
                update(parseList());
                this.promise.resolve(null);
            } catch (Exception e10) {
                Log.e(RNDownloaderModule.TAG, "updateResources get ex:", e10);
                this.promise.reject(e10);
            }
        }

        protected abstract void update(List<T> list);
    }

    public RNDownloaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private static ReadableMap convertResourceToMap(DownloadResource downloadResource) {
        WritableMap createMap = Arguments.createMap();
        RN.str(createMap, "id", downloadResource.f28597id);
        RN.str(createMap, "type", downloadResource.type);
        RN.str(createMap, "fileExt", downloadResource.fileExt);
        RN.str(createMap, DownloadWorker.KEY_OUT_MIME_TYPE, downloadResource.mimeType);
        RN.str(createMap, "trigger", downloadResource.trigger);
        RN.str(createMap, "referer", downloadResource.referer);
        RN.str(createMap, "uri", downloadResource.uri);
        RN.i(createMap, "width", downloadResource.width);
        RN.i(createMap, "height", downloadResource.height);
        RN.str(createMap, "fileName", downloadResource.fileName);
        RN.str(createMap, "mergedFileName", downloadResource.mergedFileName);
        RN.str(createMap, "title", downloadResource.title);
        RN.str(createMap, "remark", downloadResource.remark);
        RN.str(createMap, "tags", downloadResource.tags);
        RN.i(createMap, "duration", downloadResource.duration);
        DownloadResource.Poster poster = downloadResource.poster;
        if (poster != null) {
            WritableMap createMap2 = Arguments.createMap();
            RN.str(createMap2, "src", poster.src);
            RN.i(createMap2, "width", poster.width);
            RN.i(createMap2, "height", poster.height);
            createMap.putMap("poster", createMap2);
        }
        if (downloadResource.author != null) {
            WritableMap createMap3 = Arguments.createMap();
            DownloadResource.Author author = downloadResource.author;
            RN.str(createMap3, "name", author.name);
            RN.str(createMap3, "id", author.f28598id);
            RN.str(createMap3, "avatar", author.avatar);
            createMap.putMap("author", createMap3);
        }
        RN.i(createMap, "status", downloadResource.status);
        RN.i(createMap, "allowedNetworkTypes", downloadResource.allowedNetworkTypes);
        RN.i(createMap, "numFailed", downloadResource.numFailed);
        RN.l(createMap, DownloadWorker.KEY_OUT_TOTAL_BYTES, downloadResource.totalBytes);
        RN.l(createMap, DownloadWorker.KEY_OUT_CURRENT_BYTES, downloadResource.currentBytes);
        RN.l(createMap, DownloadWorker.KEY_OUT_SPEED, downloadResource.speed);
        RN.i(createMap, DownloadWorker.KEY_OUT_PROGRESS, downloadResource.progress);
        RN.str(createMap, DownloadWorker.KEY_OUT_E_TAG, downloadResource.eTag);
        RN.i(createMap, DownloadWorker.KEY_OUT_ACCEPT_PARTIAL, downloadResource.acceptPartial);
        RN.l(createMap, "latestOpenedOn", downloadResource.latestOpenedOn);
        RN.str(createMap, "folder", downloadResource.folder);
        RN.str(createMap, "hotSharePath", downloadResource.hotSharePath);
        RN.i(createMap, "retryTimes", downloadResource.retryTimes);
        RN.l(createMap, "downloadStartedOn", downloadResource.downloadStartedOn);
        RN.l(createMap, "downloadEndOn", downloadResource.downloadEndOn);
        RN.i(createMap, "syncToGallery", downloadResource.syncToGallery);
        RN.str(createMap, DownloadWorker.KEY_OUT_WORKER_ID, downloadResource.workerId);
        RN.l(createMap, "createdOn", downloadResource.createdOn);
        return createMap;
    }

    public static /* synthetic */ void g(RNDownloaderModule rNDownloaderModule, int i10) {
        rNDownloaderModule.lambda$onNetworkTypeChanged$7(i10);
    }

    public static /* synthetic */ void i(RNDownloaderModule rNDownloaderModule, DownloadResource downloadResource) {
        rNDownloaderModule.lambda$removeResources$2(downloadResource);
    }

    public static /* synthetic */ void j(RNDownloaderModule rNDownloaderModule, ReadableArray readableArray, Promise promise) {
        rNDownloaderModule.lambda$concatResources$5(readableArray, promise);
    }

    public static /* synthetic */ void k(RNDownloaderModule rNDownloaderModule, ReadableArray readableArray, Promise promise) {
        rNDownloaderModule.lambda$insertResources$0(readableArray, promise);
    }

    public static /* synthetic */ void l(RNDownloaderModule rNDownloaderModule, ReadableArray readableArray, Promise promise) {
        rNDownloaderModule.lambda$removeResources$3(readableArray, promise);
    }

    public /* synthetic */ void lambda$concatResources$5(ReadableArray readableArray, Promise promise) {
        List<String> parseResourceIds = parseResourceIds(readableArray);
        WritableArray createArray = Arguments.createArray();
        for (String str : parseResourceIds) {
            DownloadResource byId = this.mDownloads.downloadInfoDao.getById(str);
            String str2 = StreamingParser.segmentsDir(byId) + ".mp4";
            try {
                if (HlsParser.EXTENSION.equals(byId.fileExt)) {
                    HlsParser.concat(byId, str2);
                } else if (DashParser.EXTENSION.equals(byId.fileExt)) {
                    DashParser.concat(byId, str2);
                }
                this.mDownloads.downloadInfoDao.updateMergedFileName(new DownloadResourceMergedFileName(str, str2));
                WritableMap createMap = Arguments.createMap();
                createMap.putString("id", str);
                createMap.putString("mergedFileName", str2);
                createArray.pushMap(createMap);
            } catch (Exception e10) {
                promise.reject(e10);
                return;
            }
        }
        promise.resolve(createArray);
    }

    public /* synthetic */ void lambda$getAllResources$1(Promise promise) {
        List<DownloadResource> all = this.mDownloads.downloadInfoDao.getAll();
        WritableMap createMap = Arguments.createMap();
        for (DownloadResource downloadResource : all) {
            createMap.putMap(downloadResource.f28597id, convertResourceToMap(downloadResource));
        }
        promise.resolve(createMap);
    }

    public static /* synthetic */ void lambda$getContentLengthForSources$4(ReadableMap readableMap, Promise promise) {
        String string;
        if (!readableMap.hasKey("sources")) {
            promise.resolve(null);
            return;
        }
        ReadableArray array = readableMap.getArray("sources");
        if (array == null) {
            promise.resolve(null);
            return;
        }
        List<DownloadResourceHeader> parseHeaders = parseHeaders("", readableMap);
        WritableMap createMap = Arguments.createMap();
        for (int i10 = 0; i10 < array.size(); i10++) {
            ReadableMap map = array.getMap(i10);
            if (map != null && map.hasKey("src") && (string = map.getString("src")) != null) {
                String str = RN.str(map, "type", (String) null);
                try {
                    if (HlsParser.EXTENSION.equals(str)) {
                        HlsParser.getContentLengthForSource(string, parseHeaders, createMap);
                    } else if (DashParser.EXTENSION.equals(str)) {
                        int i11 = RN.i(map, "width", 0);
                        if (i11 != 0) {
                            DashParser.getContentLengthForSource(string, i11, parseHeaders, createMap);
                        }
                    } else {
                        CommonParser.getContentLengthForSource(string, parseHeaders, createMap);
                    }
                } catch (Exception e10) {
                    Log.d(TAG, "getContentLengthForSources get ex:", e10);
                    promise.reject(e10);
                }
            }
        }
        promise.resolve(createMap);
    }

    public /* synthetic */ void lambda$insertResources$0(ReadableArray readableArray, Promise promise) {
        try {
            this.mDownloads.downloadInfoDao.saveAll(parseResources(readableArray));
            promise.resolve(null);
        } catch (Exception e10) {
            Log.e(TAG, "insertResources get ex:", e10);
            promise.reject(e10);
        }
    }

    public /* synthetic */ void lambda$onNetworkTypeChanged$7(int i10) {
        this.mDownloads.downloadInfoDao.updateFileItemsNetworkType(i10);
        Downloads downloads = this.mDownloads;
        downloads.enqueue(y.k(downloads.downloadInfoDao.loadAllFilesByStatus(WORKING_STATUS), new ib.f() { // from class: com.vehiclecloud.app.videofetch.rndownloader.f
            @Override // ib.f
            public final Object apply(Object obj) {
                return RNDownloaderModule.n((DownloadResource) obj);
            }
        }));
    }

    public /* synthetic */ void lambda$removeResources$2(DownloadResource downloadResource) {
        this.mDownloadNotifier.cancelResourceAllNotifications(downloadResource.f28597id);
    }

    public /* synthetic */ void lambda$removeResources$3(ReadableArray readableArray, Promise promise) {
        List<String> parseResourceIds = parseResourceIds(readableArray);
        ArrayList arrayList = new ArrayList(parseResourceIds.size());
        for (String str : parseResourceIds) {
            arrayList.add(new DownloadResourceId(str));
            final DownloadResource byId = this.mDownloads.downloadInfoDao.getById(str);
            if (byId != null) {
                String str2 = byId.workerId;
                if (str2 != null) {
                    this.mDownloads.cancelWork(str2);
                }
                Scopes.io().postDelayed(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        RNDownloaderModule.i(RNDownloaderModule.this, byId);
                    }
                }, 300L);
                try {
                    if (!HlsParser.EXTENSION.equals(byId.fileExt) && !DashParser.EXTENSION.equals(byId.fileExt)) {
                        CommonParser.rmFiles(byId);
                    }
                    StreamingParser.rmFiles(byId);
                } catch (IOException e10) {
                    Log.d(TAG, "removeResources get ex:", e10);
                }
            }
        }
        this.mDownloads.downloadInfoDao.deleteAllByIds(arrayList);
        promise.resolve(null);
    }

    public static /* synthetic */ void m(RNDownloaderModule rNDownloaderModule, Promise promise) {
        rNDownloaderModule.lambda$getAllResources$1(promise);
    }

    public static /* synthetic */ DownloadResourceWithHeaders n(DownloadResource downloadResource) {
        return DownloadResourceWithHeaders.create(downloadResource, null);
    }

    public static /* synthetic */ void o(ReadableMap readableMap, Promise promise) {
        lambda$getContentLengthForSources$4(readableMap, promise);
    }

    private static List<DownloadResourceHeader> parseHeaders(String str, ReadableMap readableMap) {
        ReadableMap map;
        ArrayList arrayList = null;
        if (readableMap == null) {
            return null;
        }
        if (readableMap.hasKey("headers") && (map = readableMap.getMap("headers")) != null) {
            arrayList = new ArrayList();
            Iterator<Map.Entry<String, Object>> entryIterator = map.getEntryIterator();
            while (entryIterator.hasNext()) {
                Map.Entry<String, Object> next = entryIterator.next();
                arrayList.add(DownloadResourceHeader.create(str, next.getKey(), next.getValue().toString()));
            }
        }
        return arrayList;
    }

    private static DownloadResource parseResource(ReadableMap readableMap) {
        ReadableMap map;
        DownloadResource downloadResource = new DownloadResource();
        downloadResource.f28597id = RN.str(readableMap, "id", "");
        downloadResource.type = RN.str(readableMap, "type", DownloadResource.TYPE_VIDEO);
        downloadResource.fileExt = RN.str(readableMap, "fileExt", (String) null);
        downloadResource.mimeType = RN.str(readableMap, DownloadWorker.KEY_OUT_MIME_TYPE, (String) null);
        downloadResource.trigger = RN.str(readableMap, "trigger", "webview");
        downloadResource.referer = RN.str(readableMap, "referer", "");
        downloadResource.uri = RN.str(readableMap, "uri", "");
        downloadResource.width = RN.i(readableMap, "width", 0);
        downloadResource.height = RN.i(readableMap, "height", 0);
        downloadResource.fileName = RN.str(readableMap, "fileName", "");
        downloadResource.mergedFileName = RN.str(readableMap, "mergedFileName", (String) null);
        downloadResource.title = RN.str(readableMap, "title", (String) null);
        downloadResource.remark = RN.str(readableMap, "remark", (String) null);
        downloadResource.tags = RN.str(readableMap, "tags", (String) null);
        downloadResource.duration = RN.i(readableMap, "duration", 0);
        if (readableMap.hasKey("poster") && (map = readableMap.getMap("poster")) != null) {
            DownloadResource.Poster poster = new DownloadResource.Poster();
            poster.src = RN.str(map, "src", "");
            poster.width = RN.i(map, "width", 0);
            poster.height = RN.i(map, "height", 0);
            downloadResource.poster = poster;
        }
        if (readableMap.hasKey("author")) {
            ReadableMap map2 = readableMap.getMap("author");
            DownloadResource.Author author = new DownloadResource.Author();
            author.name = RN.str(map2, "name", "");
            author.f28598id = RN.str(map2, "id", (String) null);
            author.avatar = RN.str(map2, "avatar", (String) null);
            downloadResource.author = author;
        }
        downloadResource.status = RN.i(readableMap, "status", (int) DownloadResource.STATUS_PENDING);
        downloadResource.allowedNetworkTypes = RN.i(readableMap, "allowedNetworkTypes", 0);
        downloadResource.numFailed = RN.i(readableMap, "numFailed", 0);
        downloadResource.totalBytes = RN.l(readableMap, DownloadWorker.KEY_OUT_TOTAL_BYTES, 0L);
        downloadResource.currentBytes = RN.l(readableMap, DownloadWorker.KEY_OUT_CURRENT_BYTES, 0L);
        downloadResource.speed = RN.l(readableMap, DownloadWorker.KEY_OUT_SPEED, 0L);
        downloadResource.progress = RN.i(readableMap, DownloadWorker.KEY_OUT_PROGRESS, 0);
        downloadResource.eTag = RN.str(readableMap, DownloadWorker.KEY_OUT_E_TAG, (String) null);
        downloadResource.acceptPartial = RN.i(readableMap, DownloadWorker.KEY_OUT_ACCEPT_PARTIAL, -1);
        downloadResource.latestOpenedOn = RN.l(readableMap, "latestOpenedOn", 0L);
        downloadResource.folder = RN.str(readableMap, "folder", (String) null);
        downloadResource.hotSharePath = RN.str(readableMap, "hotSharePath", (String) null);
        downloadResource.retryTimes = RN.i(readableMap, "retryTimes", 0);
        downloadResource.downloadStartedOn = RN.l(readableMap, "downloadStartedOn", 0L);
        downloadResource.downloadEndOn = RN.l(readableMap, "downloadEndOn", 0L);
        downloadResource.syncToGallery = RN.i(readableMap, "syncToGallery", 0);
        downloadResource.workerId = RN.str(readableMap, DownloadWorker.KEY_OUT_WORKER_ID, (String) null);
        downloadResource.createdOn = readableMap.hasKey("createdOn") ? RN.l(readableMap, "createdOn", 0L) : System.currentTimeMillis();
        return downloadResource;
    }

    private static List<String> parseResourceIds(ReadableArray readableArray) {
        String str;
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            ReadableMap map = readableArray.getMap(i10);
            if (map != null && (str = RN.str(map, "id", (String) null)) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static List<DownloadResource> parseResources(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            ReadableMap map = readableArray.getMap(i10);
            if (map != null) {
                arrayList.add(parseResource(map));
            }
        }
        return arrayList;
    }

    private static List<DownloadResourceWithHeaders> parseResourcesWithHeaders(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            ReadableMap map = readableArray.getMap(i10);
            if (map != null) {
                DownloadResource parseResource = parseResource(map);
                arrayList.add(DownloadResourceWithHeaders.create(parseResource, parseHeaders(parseResource.f28597id, map)));
            }
        }
        Log.d(TAG, "parseResources: " + arrayList);
        return arrayList;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
    public String buildUniqueFileWithExtension(String str, String str2, String str3) {
        return FileUtils.INSTANCE.buildUniqueFileWithExtension(str, str2, str3).getPath();
    }

    @ReactMethod
    public void cancelResources(ReadableArray readableArray, Promise promise) {
        synchronized (sharedLock) {
            try {
                this.mDownloads.cancel(this.mDownloads.downloadInfoDao.getWorkerIdByIds(parseResourceIds(readableArray)));
                promise.resolve(null);
            } catch (Exception e10) {
                Log.e(TAG, "cancelResources get ex:", e10);
                promise.reject(e10);
            }
        }
    }

    @ReactMethod
    public void concatResources(final ReadableArray readableArray, final Promise promise) {
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.j
            @Override // java.lang.Runnable
            public final void run() {
                RNDownloaderModule.j(RNDownloaderModule.this, readableArray, promise);
            }
        });
    }

    @ReactMethod
    public void downloadResources(ReadableArray readableArray, Promise promise) {
        try {
            this.mDownloads.enqueue(parseResourcesWithHeaders(readableArray));
            promise.resolve(null);
        } catch (Exception e10) {
            Log.e(TAG, "downloadResources get ex:", e10);
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void getAllResources(ReadableMap readableMap, final Promise promise) {
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.i
            @Override // java.lang.Runnable
            public final void run() {
                RNDownloaderModule.m(RNDownloaderModule.this, promise);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        String absolutePath;
        File externalFilesDir = getReactApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            absolutePath = externalFilesDir.getAbsolutePath();
        } else {
            absolutePath = getReactApplicationContext().getFilesDir().getAbsolutePath();
        }
        return t.l("documents", absolutePath);
    }

    @ReactMethod
    public void getContentLengthForSources(final ReadableMap readableMap, final Promise promise) {
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.g
            @Override // java.lang.Runnable
            public final void run() {
                RNDownloaderModule.o(ReadableMap.this, promise);
            }
        });
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public boolean hasConstants() {
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mDownloads = new Downloads(getReactApplicationContext());
        this.mDownloadNotifier = DownloadNotifier.getInstance(getReactApplicationContext());
    }

    @ReactMethod
    public void insertResources(final ReadableArray readableArray, final Promise promise) {
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.k
            @Override // java.lang.Runnable
            public final void run() {
                RNDownloaderModule.k(RNDownloaderModule.this, readableArray, promise);
            }
        });
    }

    @ReactMethod
    public void onNetworkTypeChanged(final int i10) {
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.h
            @Override // java.lang.Runnable
            public final void run() {
                RNDownloaderModule.g(RNDownloaderModule.this, i10);
            }
        });
    }

    @ReactMethod
    public void parseDashRepresentation(ReadableMap readableMap, Promise promise) {
        String string = readableMap.getString("uri");
        if (string == null) {
            promise.resolve(null);
        } else {
            DashParser.parseRepresentation(string, parseHeaders("", readableMap), promise);
        }
    }

    @ReactMethod
    public void parseHlsMasterPlaylist(ReadableMap readableMap, Promise promise) {
        String string = readableMap.getString("uri");
        if (string == null) {
            promise.resolve(null);
        } else {
            HlsParser.parseMasterPlaylist(string, parseHeaders("", readableMap), promise);
        }
    }

    @ReactMethod
    public void removeListeners(double d10) {
    }

    @ReactMethod
    public void removeResources(final ReadableArray readableArray, final Promise promise) {
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.l
            @Override // java.lang.Runnable
            public final void run() {
                RNDownloaderModule.l(RNDownloaderModule.this, readableArray, promise);
            }
        });
    }

    @ReactMethod
    public void syncResourceToMediaStore(ReadableArray readableArray, Promise promise) {
        if (readableArray.size() == 0) {
            promise.reject("E_UNABLE_TO_DELETE", "Need at least one URI to delete");
            return;
        }
        try {
            for (DownloadResource downloadResource : parseResources(readableArray)) {
                FS.insertResourceToMediaStore(getReactApplicationContext(), downloadResource);
            }
            promise.resolve(null);
        } catch (Exception e10) {
            Log.e(TAG, "saveResourceToGallery get ex:", e10);
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void updateResourcesFolder(ReadableArray readableArray, Promise promise) {
        Scopes.io().post(new FolderUpdater(getReactApplicationContext(), this.mDownloads, readableArray, promise));
    }

    @ReactMethod
    public void updateResourcesLatestOpenedOn(ReadableArray readableArray, Promise promise) {
        Scopes.io().post(new LatestOpenedOnUpdater(this.mDownloads, readableArray, promise));
    }

    @ReactMethod
    public void updateResourcesStatus(ReadableArray readableArray, Promise promise) {
        Scopes.io().post(new StatusUpdater(this.mDownloads, readableArray, promise));
    }

    @ReactMethod
    public void updateResourcesStatusAndDuration(ReadableArray readableArray, Promise promise) {
        Scopes.io().post(new StatusAndDurationUpdater(this.mDownloads, readableArray, promise));
    }

    @ReactMethod
    public void updateResourcesTotalBytes(ReadableArray readableArray, Promise promise) {
        Scopes.io().post(new TotalBytesUpdater(this.mDownloads, readableArray, promise));
    }
}
