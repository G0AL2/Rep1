package com.vehiclecloud.app.videofetch.rndownloader;

import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.x;
import androidx.work.c;
import androidx.work.e;
import androidx.work.n;
import androidx.work.p;
import androidx.work.u;
import androidx.work.v;
import androidx.work.w;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.vehiclecloud.app.videofetch.rndownloader.Downloads;
import com.vehiclecloud.app.videofetch.rndownloader.data.AppDatabase;
import com.vehiclecloud.app.videofetch.rndownloader.data.DownloadResourceDao;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceHeader;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceWithHeaders;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceStatus;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.partial.DownloadResourceWorkerId;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import com.vehiclecloud.app.videofetch.rndownloader.util.Scopes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jb.s;

/* loaded from: classes3.dex */
public final class Downloads {
    public final DownloadResourceDao downloadInfoDao;
    private LiveData<List<u>> liveData;
    private final x<List<u>> observer;
    private final ProgressEmitter progressEmitter;
    private final v workManager;

    /* loaded from: classes3.dex */
    public static final class ProgressEmitter implements Runnable {
        public static final String EVENT_PROGRESS = "vcRNDownloaderProgress";
        private static final long INTERVAL = 1000;
        private final DownloadResourceDao downloadInfoDao;
        private final DeviceEventManagerModule.RCTDeviceEventEmitter rctDeviceEventEmitter;
        private final Object shareLock = new Object();
        private final AtomicBoolean scheduled = new AtomicBoolean(false);
        private final HashMap<UUID, androidx.work.e> progressMap = new HashMap<>();
        private final HashSet<UUID> runningWorkIds = new HashSet<>();
        private final HashSet<UUID> waitingCancelWorkIds = new HashSet<>();
        private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        public ProgressEmitter(DownloadResourceDao downloadResourceDao, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter) {
            this.downloadInfoDao = downloadResourceDao;
            this.rctDeviceEventEmitter = rCTDeviceEventEmitter;
        }

        public static /* synthetic */ void a(ProgressEmitter progressEmitter, u uVar) {
            progressEmitter.lambda$progress$0(uVar);
        }

        public /* synthetic */ void lambda$progress$0(u uVar) {
            synchronized (this.shareLock) {
                timber.log.a.d("progress: %s; %s", uVar.a(), uVar.c());
                if (this.runningWorkIds.contains(uVar.a())) {
                    DownloadResource byWorkerId = this.downloadInfoDao.getByWorkerId(uVar.a().toString());
                    if (byWorkerId == null) {
                        return;
                    }
                    postDelayed();
                    this.runningWorkIds.remove(uVar.a());
                    this.progressMap.put(uVar.a(), new e.a().g("id", byWorkerId.f28597id).g(DownloadWorker.KEY_OUT_WORKER_ID, byWorkerId.workerId).f(DownloadWorker.KEY_OUT_TOTAL_BYTES, byWorkerId.totalBytes).e("duration", byWorkerId.duration).e("status", byWorkerId.status).a());
                }
            }
        }

        private void postDelayed() {
            if (this.scheduled.get()) {
                return;
            }
            this.scheduled.set(true);
            this.executor.schedule(this, 1000L, TimeUnit.MILLISECONDS);
        }

        public void progress(final u uVar) {
            timber.log.a.d("progress: %s; %s; %s", uVar.a(), uVar.c(), uVar.b());
            if (this.waitingCancelWorkIds.contains(uVar.a())) {
                if (uVar.c() == u.a.CANCELLED) {
                    this.waitingCancelWorkIds.remove(uVar.a());
                }
            } else if (uVar.c() == u.a.RUNNING) {
                synchronized (this.shareLock) {
                    postDelayed();
                    this.runningWorkIds.add(uVar.a());
                    androidx.work.e b10 = uVar.b();
                    HashMap<UUID, androidx.work.e> hashMap = this.progressMap;
                    UUID a10 = uVar.a();
                    if (this.progressMap.containsKey(uVar.a())) {
                        e.a aVar = new e.a();
                        androidx.work.e eVar = this.progressMap.get(uVar.a());
                        Objects.requireNonNull(eVar);
                        b10 = aVar.c(eVar).c(b10).a();
                    }
                    hashMap.put(a10, b10);
                }
            } else {
                this.executor.execute(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        Downloads.ProgressEmitter.a(Downloads.ProgressEmitter.this, uVar);
                    }
                });
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.scheduled.set(false);
            if (this.progressMap.isEmpty()) {
                return;
            }
            synchronized (this.shareLock) {
                WritableMap createMap = Arguments.createMap();
                for (Map.Entry<UUID, androidx.work.e> entry : this.progressMap.entrySet()) {
                    androidx.work.e value = entry.getValue();
                    WritableMap createMap2 = Arguments.createMap();
                    String j10 = value.j("id");
                    if (j10 != null) {
                        for (Map.Entry<String, Object> entry2 : value.i().entrySet()) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                Class<?> cls = value2.getClass();
                                String key = entry2.getKey();
                                if (Integer.class.equals(cls)) {
                                    createMap2.putInt(key, ((Integer) value2).intValue());
                                } else if (Long.class.equals(cls)) {
                                    createMap2.putDouble(key, ((Long) value2).longValue());
                                } else if (String.class.equals(cls)) {
                                    createMap2.putString(key, (String) value2);
                                }
                            }
                        }
                        createMap.putMap(j10, createMap2);
                    }
                }
                timber.log.a.d("emit: %s", createMap);
                this.rctDeviceEventEmitter.emit(EVENT_PROGRESS, createMap);
                this.progressMap.clear();
            }
        }

        public void stop(UUID uuid) {
            synchronized (this.shareLock) {
                this.progressMap.remove(uuid);
                this.runningWorkIds.remove(uuid);
            }
        }

        public void waitingWorkCancel(UUID uuid) {
            synchronized (this.shareLock) {
                this.waitingCancelWorkIds.add(uuid);
            }
        }
    }

    public Downloads(ReactApplicationContext reactApplicationContext) {
        timber.log.a.d("Downloads constructor.", new Object[0]);
        this.workManager = v.g(reactApplicationContext);
        DownloadResourceDao downloadResourceDao = AppDatabase.getInstance(reactApplicationContext).getDownloadResourceDao();
        this.downloadInfoDao = downloadResourceDao;
        this.progressEmitter = new ProgressEmitter(downloadResourceDao, (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class));
        this.observer = new x() { // from class: com.vehiclecloud.app.videofetch.rndownloader.a
            @Override // androidx.lifecycle.x
            public final void a(Object obj) {
                Downloads.a(Downloads.this, (List) obj);
            }
        };
        initObserver();
    }

    public static /* synthetic */ void a(Downloads downloads, List list) {
        downloads.lambda$new$0(list);
    }

    public static /* synthetic */ void b(Downloads downloads) {
        downloads.lambda$initObserver$3();
    }

    public static /* synthetic */ void c(Downloads downloads, ArrayList arrayList) {
        downloads.lambda$cancel$2(arrayList);
    }

    public static /* synthetic */ void d(Downloads downloads, DownloadResourceWithHeaders downloadResourceWithHeaders, androidx.work.n nVar) {
        downloads.lambda$enqueue$1(downloadResourceWithHeaders, nVar);
    }

    private void initObserver() {
        try {
            this.liveData = this.workManager.h(w.a.c(s.w(u.a.RUNNING, u.a.SUCCEEDED, u.a.FAILED, u.a.BLOCKED, u.a.CANCELLED)).b());
            Scopes.main().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.b
                @Override // java.lang.Runnable
                public final void run() {
                    Downloads.b(Downloads.this);
                }
            });
        } catch (Exception e10) {
            timber.log.a.e(e10, "initObserver get ex", new Object[0]);
        }
    }

    public /* synthetic */ void lambda$cancel$2(ArrayList arrayList) {
        this.downloadInfoDao.updateAllStatus(arrayList);
    }

    public /* synthetic */ void lambda$enqueue$1(DownloadResourceWithHeaders downloadResourceWithHeaders, androidx.work.n nVar) {
        DownloadResource byId = this.downloadInfoDao.getById(downloadResourceWithHeaders.resource.f28597id);
        if (byId == null || byId.status != 200) {
            this.downloadInfoDao.save(downloadResourceWithHeaders.resource);
            List<DownloadResourceHeader> list = downloadResourceWithHeaders.headers;
            if (list != null && !list.isEmpty()) {
                this.downloadInfoDao.saveHeaders(downloadResourceWithHeaders.headers);
            }
            v vVar = this.workManager;
            vVar.e("down_" + downloadResourceWithHeaders.resource.f28597id, androidx.work.f.REPLACE, nVar);
        }
    }

    public /* synthetic */ void lambda$initObserver$3() {
        this.liveData.j(this.observer);
    }

    public /* synthetic */ void lambda$new$0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            timber.log.a.d("observer workInfo: %s; %s; %s", uVar.a(), uVar.c(), uVar.b());
            this.progressEmitter.progress(uVar);
        }
    }

    public void cancel(List<DownloadResourceWorkerId> list) {
        final ArrayList arrayList = new ArrayList(list.size());
        for (DownloadResourceWorkerId downloadResourceWorkerId : list) {
            String str = downloadResourceWorkerId.workerId;
            if (str != null) {
                cancelWork(str);
            }
            arrayList.add(new DownloadResourceStatus(downloadResourceWorkerId.f28609id, DownloadResource.STATUS_CANCELED));
        }
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.d
            @Override // java.lang.Runnable
            public final void run() {
                Downloads.c(Downloads.this, arrayList);
            }
        });
    }

    public void cancelWork(String str) {
        try {
            UUID fromString = UUID.fromString(str);
            this.progressEmitter.stop(fromString);
            this.workManager.b(fromString).a().get();
            this.progressEmitter.waitingWorkCancel(fromString);
        } catch (Exception e10) {
            timber.log.a.e(e10, "cancelWorkById get ex:", new Object[0]);
        }
        timber.log.a.d("cancel: %s", str);
    }

    public void enqueue(List<DownloadResourceWithHeaders> list) {
        for (final DownloadResourceWithHeaders downloadResourceWithHeaders : list) {
            n.a i10 = new n.a(DownloadWorker.class).m(new e.a().g("id", downloadResourceWithHeaders.resource.f28597id).a()).i(new c.a().c(true).b(downloadResourceWithHeaders.resource.allowedNetworkTypes == 1 ? androidx.work.m.UNMETERED : androidx.work.m.CONNECTED).a());
            if (Build.VERSION.SDK_INT >= 29) {
                i10.j(p.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
            }
            String str = downloadResourceWithHeaders.resource.workerId;
            if (str != null) {
                i10.k(UUID.fromString(str));
            }
            final androidx.work.n b10 = i10.b();
            downloadResourceWithHeaders.resource.workerId = b10.a().toString();
            Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.c
                @Override // java.lang.Runnable
                public final void run() {
                    Downloads.d(Downloads.this, downloadResourceWithHeaders, b10);
                }
            });
        }
    }
}
