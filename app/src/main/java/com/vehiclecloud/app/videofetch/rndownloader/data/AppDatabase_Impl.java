package com.vehiclecloud.app.videofetch.rndownloader.data;

import androidx.room.f;
import androidx.room.k0;
import androidx.room.m0;
import androidx.room.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x0.a;
import y0.b;
import y0.e;
import z0.g;
import z0.h;

/* loaded from: classes3.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile DownloadResourceDao _downloadResourceDao;

    @Override // androidx.room.k0
    public void clearAllTables() {
        super.assertNotMainThread();
        g F0 = super.getOpenHelper().F0();
        try {
            super.beginTransaction();
            F0.s("DELETE FROM `DownloadResource`");
            F0.s("DELETE FROM `DownloadResourceHeader`");
            F0.s("DELETE FROM `DownloadTask`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            F0.I0("PRAGMA wal_checkpoint(FULL)").close();
            if (!F0.S0()) {
                F0.s("VACUUM");
            }
        }
    }

    @Override // androidx.room.k0
    protected o createInvalidationTracker() {
        return new o(this, new HashMap(0), new HashMap(0), "DownloadResource", "DownloadResourceHeader", "DownloadTask");
    }

    @Override // androidx.room.k0
    protected h createOpenHelper(f fVar) {
        return fVar.f3893c.a(h.b.a(fVar.f3891a).d(fVar.f3892b).c(new m0(fVar, new m0.b(3) { // from class: com.vehiclecloud.app.videofetch.rndownloader.data.AppDatabase_Impl.1
            @Override // androidx.room.m0.b
            public void createAllTables(g gVar) {
                gVar.s("CREATE TABLE IF NOT EXISTS `DownloadResource` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `fileExt` TEXT, `mergedFileName` TEXT, `trigger` TEXT, `referer` TEXT, `title` TEXT, `remark` TEXT, `tags` TEXT, `duration` INTEGER NOT NULL, `userAgent` TEXT, `allowedNetworkTypes` INTEGER NOT NULL, `latestOpenedOn` INTEGER NOT NULL, `folder` TEXT, `hotSharePath` TEXT, `parentalGuide` INTEGER NOT NULL, `createdOn` INTEGER NOT NULL, `syncToGallery` INTEGER NOT NULL, `workerId` TEXT, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `uri` TEXT NOT NULL, `fileName` TEXT NOT NULL, `mimeType` TEXT, `eTag` TEXT, `acceptPartial` INTEGER NOT NULL, `rangeStart` INTEGER NOT NULL, `rangeEnd` INTEGER NOT NULL, `totalBytes` INTEGER NOT NULL, `currentBytes` INTEGER NOT NULL, `speed` INTEGER NOT NULL, `progress` INTEGER NOT NULL, `retryTimes` INTEGER NOT NULL, `status` INTEGER NOT NULL, `numFailed` INTEGER NOT NULL, `downloadStartedOn` INTEGER NOT NULL, `downloadEndOn` INTEGER NOT NULL, `posterSrc` TEXT, `posterWidth` INTEGER, `posterHeight` INTEGER, `authorId` TEXT, `authorName` TEXT, `authorAvatar` TEXT, PRIMARY KEY(`id`))");
                gVar.s("CREATE TABLE IF NOT EXISTS `DownloadResourceHeader` (`resourceId` TEXT NOT NULL, `header` TEXT NOT NULL, `value` TEXT NOT NULL, PRIMARY KEY(`resourceId`, `header`))");
                gVar.s("CREATE TABLE IF NOT EXISTS `DownloadTask` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `resourceId` TEXT NOT NULL, `uri` TEXT NOT NULL, `fileName` TEXT NOT NULL, `mimeType` TEXT, `eTag` TEXT, `acceptPartial` INTEGER NOT NULL, `rangeStart` INTEGER NOT NULL, `rangeEnd` INTEGER NOT NULL, `totalBytes` INTEGER NOT NULL, `currentBytes` INTEGER NOT NULL, `speed` INTEGER NOT NULL, `progress` INTEGER NOT NULL, `retryTimes` INTEGER NOT NULL, `status` INTEGER NOT NULL, `numFailed` INTEGER NOT NULL, `downloadStartedOn` INTEGER NOT NULL, `downloadEndOn` INTEGER NOT NULL)");
                gVar.s("CREATE INDEX IF NOT EXISTS `index_DownloadTask_resourceId` ON `DownloadTask` (`resourceId`)");
                gVar.s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                gVar.s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8bbd4425cf7dde4f6c7dbeabd10bc422')");
            }

            @Override // androidx.room.m0.b
            public void dropAllTables(g gVar) {
                gVar.s("DROP TABLE IF EXISTS `DownloadResource`");
                gVar.s("DROP TABLE IF EXISTS `DownloadResourceHeader`");
                gVar.s("DROP TABLE IF EXISTS `DownloadTask`");
                if (((k0) AppDatabase_Impl.this).mCallbacks != null) {
                    int size = ((k0) AppDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((k0.b) ((k0) AppDatabase_Impl.this).mCallbacks.get(i10)).b(gVar);
                    }
                }
            }

            @Override // androidx.room.m0.b
            public void onCreate(g gVar) {
                if (((k0) AppDatabase_Impl.this).mCallbacks != null) {
                    int size = ((k0) AppDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((k0.b) ((k0) AppDatabase_Impl.this).mCallbacks.get(i10)).a(gVar);
                    }
                }
            }

            @Override // androidx.room.m0.b
            public void onOpen(g gVar) {
                ((k0) AppDatabase_Impl.this).mDatabase = gVar;
                AppDatabase_Impl.this.internalInitInvalidationTracker(gVar);
                if (((k0) AppDatabase_Impl.this).mCallbacks != null) {
                    int size = ((k0) AppDatabase_Impl.this).mCallbacks.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((k0.b) ((k0) AppDatabase_Impl.this).mCallbacks.get(i10)).c(gVar);
                    }
                }
            }

            @Override // androidx.room.m0.b
            public void onPostMigrate(g gVar) {
            }

            @Override // androidx.room.m0.b
            public void onPreMigrate(g gVar) {
                b.a(gVar);
            }

            @Override // androidx.room.m0.b
            public m0.c onValidateSchema(g gVar) {
                HashMap hashMap = new HashMap(43);
                hashMap.put("id", new e.a("id", "TEXT", true, 1, null, 1));
                hashMap.put("type", new e.a("type", "TEXT", true, 0, null, 1));
                hashMap.put("fileExt", new e.a("fileExt", "TEXT", false, 0, null, 1));
                hashMap.put("mergedFileName", new e.a("mergedFileName", "TEXT", false, 0, null, 1));
                hashMap.put("trigger", new e.a("trigger", "TEXT", false, 0, null, 1));
                hashMap.put("referer", new e.a("referer", "TEXT", false, 0, null, 1));
                hashMap.put("title", new e.a("title", "TEXT", false, 0, null, 1));
                hashMap.put("remark", new e.a("remark", "TEXT", false, 0, null, 1));
                hashMap.put("tags", new e.a("tags", "TEXT", false, 0, null, 1));
                hashMap.put("duration", new e.a("duration", "INTEGER", true, 0, null, 1));
                hashMap.put("userAgent", new e.a("userAgent", "TEXT", false, 0, null, 1));
                hashMap.put("allowedNetworkTypes", new e.a("allowedNetworkTypes", "INTEGER", true, 0, null, 1));
                hashMap.put("latestOpenedOn", new e.a("latestOpenedOn", "INTEGER", true, 0, null, 1));
                hashMap.put("folder", new e.a("folder", "TEXT", false, 0, null, 1));
                hashMap.put("hotSharePath", new e.a("hotSharePath", "TEXT", false, 0, null, 1));
                hashMap.put("parentalGuide", new e.a("parentalGuide", "INTEGER", true, 0, null, 1));
                hashMap.put("createdOn", new e.a("createdOn", "INTEGER", true, 0, null, 1));
                hashMap.put("syncToGallery", new e.a("syncToGallery", "INTEGER", true, 0, null, 1));
                hashMap.put(DownloadWorker.KEY_OUT_WORKER_ID, new e.a(DownloadWorker.KEY_OUT_WORKER_ID, "TEXT", false, 0, null, 1));
                hashMap.put("width", new e.a("width", "INTEGER", true, 0, null, 1));
                hashMap.put("height", new e.a("height", "INTEGER", true, 0, null, 1));
                hashMap.put("uri", new e.a("uri", "TEXT", true, 0, null, 1));
                hashMap.put("fileName", new e.a("fileName", "TEXT", true, 0, null, 1));
                hashMap.put(DownloadWorker.KEY_OUT_MIME_TYPE, new e.a(DownloadWorker.KEY_OUT_MIME_TYPE, "TEXT", false, 0, null, 1));
                hashMap.put(DownloadWorker.KEY_OUT_E_TAG, new e.a(DownloadWorker.KEY_OUT_E_TAG, "TEXT", false, 0, null, 1));
                hashMap.put(DownloadWorker.KEY_OUT_ACCEPT_PARTIAL, new e.a(DownloadWorker.KEY_OUT_ACCEPT_PARTIAL, "INTEGER", true, 0, null, 1));
                hashMap.put("rangeStart", new e.a("rangeStart", "INTEGER", true, 0, null, 1));
                hashMap.put("rangeEnd", new e.a("rangeEnd", "INTEGER", true, 0, null, 1));
                hashMap.put(DownloadWorker.KEY_OUT_TOTAL_BYTES, new e.a(DownloadWorker.KEY_OUT_TOTAL_BYTES, "INTEGER", true, 0, null, 1));
                hashMap.put(DownloadWorker.KEY_OUT_CURRENT_BYTES, new e.a(DownloadWorker.KEY_OUT_CURRENT_BYTES, "INTEGER", true, 0, null, 1));
                hashMap.put(DownloadWorker.KEY_OUT_SPEED, new e.a(DownloadWorker.KEY_OUT_SPEED, "INTEGER", true, 0, null, 1));
                hashMap.put(DownloadWorker.KEY_OUT_PROGRESS, new e.a(DownloadWorker.KEY_OUT_PROGRESS, "INTEGER", true, 0, null, 1));
                hashMap.put("retryTimes", new e.a("retryTimes", "INTEGER", true, 0, null, 1));
                hashMap.put("status", new e.a("status", "INTEGER", true, 0, null, 1));
                hashMap.put("numFailed", new e.a("numFailed", "INTEGER", true, 0, null, 1));
                hashMap.put("downloadStartedOn", new e.a("downloadStartedOn", "INTEGER", true, 0, null, 1));
                hashMap.put("downloadEndOn", new e.a("downloadEndOn", "INTEGER", true, 0, null, 1));
                hashMap.put("posterSrc", new e.a("posterSrc", "TEXT", false, 0, null, 1));
                hashMap.put("posterWidth", new e.a("posterWidth", "INTEGER", false, 0, null, 1));
                hashMap.put("posterHeight", new e.a("posterHeight", "INTEGER", false, 0, null, 1));
                hashMap.put("authorId", new e.a("authorId", "TEXT", false, 0, null, 1));
                hashMap.put("authorName", new e.a("authorName", "TEXT", false, 0, null, 1));
                hashMap.put("authorAvatar", new e.a("authorAvatar", "TEXT", false, 0, null, 1));
                e eVar = new e("DownloadResource", hashMap, new HashSet(0), new HashSet(0));
                e a10 = e.a(gVar, "DownloadResource");
                if (!eVar.equals(a10)) {
                    return new m0.c(false, "DownloadResource(com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource).\n Expected:\n" + eVar + "\n Found:\n" + a10);
                }
                HashMap hashMap2 = new HashMap(3);
                hashMap2.put("resourceId", new e.a("resourceId", "TEXT", true, 1, null, 1));
                hashMap2.put("header", new e.a("header", "TEXT", true, 2, null, 1));
                hashMap2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, new e.a(AppMeasurementSdk.ConditionalUserProperty.VALUE, "TEXT", true, 0, null, 1));
                e eVar2 = new e("DownloadResourceHeader", hashMap2, new HashSet(0), new HashSet(0));
                e a11 = e.a(gVar, "DownloadResourceHeader");
                if (!eVar2.equals(a11)) {
                    return new m0.c(false, "DownloadResourceHeader(com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceHeader).\n Expected:\n" + eVar2 + "\n Found:\n" + a11);
                }
                HashMap hashMap3 = new HashMap(18);
                hashMap3.put("id", new e.a("id", "INTEGER", false, 1, null, 1));
                hashMap3.put("resourceId", new e.a("resourceId", "TEXT", true, 0, null, 1));
                hashMap3.put("uri", new e.a("uri", "TEXT", true, 0, null, 1));
                hashMap3.put("fileName", new e.a("fileName", "TEXT", true, 0, null, 1));
                hashMap3.put(DownloadWorker.KEY_OUT_MIME_TYPE, new e.a(DownloadWorker.KEY_OUT_MIME_TYPE, "TEXT", false, 0, null, 1));
                hashMap3.put(DownloadWorker.KEY_OUT_E_TAG, new e.a(DownloadWorker.KEY_OUT_E_TAG, "TEXT", false, 0, null, 1));
                hashMap3.put(DownloadWorker.KEY_OUT_ACCEPT_PARTIAL, new e.a(DownloadWorker.KEY_OUT_ACCEPT_PARTIAL, "INTEGER", true, 0, null, 1));
                hashMap3.put("rangeStart", new e.a("rangeStart", "INTEGER", true, 0, null, 1));
                hashMap3.put("rangeEnd", new e.a("rangeEnd", "INTEGER", true, 0, null, 1));
                hashMap3.put(DownloadWorker.KEY_OUT_TOTAL_BYTES, new e.a(DownloadWorker.KEY_OUT_TOTAL_BYTES, "INTEGER", true, 0, null, 1));
                hashMap3.put(DownloadWorker.KEY_OUT_CURRENT_BYTES, new e.a(DownloadWorker.KEY_OUT_CURRENT_BYTES, "INTEGER", true, 0, null, 1));
                hashMap3.put(DownloadWorker.KEY_OUT_SPEED, new e.a(DownloadWorker.KEY_OUT_SPEED, "INTEGER", true, 0, null, 1));
                hashMap3.put(DownloadWorker.KEY_OUT_PROGRESS, new e.a(DownloadWorker.KEY_OUT_PROGRESS, "INTEGER", true, 0, null, 1));
                hashMap3.put("retryTimes", new e.a("retryTimes", "INTEGER", true, 0, null, 1));
                hashMap3.put("status", new e.a("status", "INTEGER", true, 0, null, 1));
                hashMap3.put("numFailed", new e.a("numFailed", "INTEGER", true, 0, null, 1));
                hashMap3.put("downloadStartedOn", new e.a("downloadStartedOn", "INTEGER", true, 0, null, 1));
                hashMap3.put("downloadEndOn", new e.a("downloadEndOn", "INTEGER", true, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new e.C0540e("index_DownloadTask_resourceId", false, Arrays.asList("resourceId"), Arrays.asList("ASC")));
                e eVar3 = new e("DownloadTask", hashMap3, hashSet, hashSet2);
                e a12 = e.a(gVar, "DownloadTask");
                if (!eVar3.equals(a12)) {
                    return new m0.c(false, "DownloadTask(com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadTask).\n Expected:\n" + eVar3 + "\n Found:\n" + a12);
                }
                return new m0.c(true, null);
            }
        }, "8bbd4425cf7dde4f6c7dbeabd10bc422", "c364ab5a1982132882d24e50e3a9e717")).b());
    }

    @Override // androidx.room.k0
    public List<x0.b> getAutoMigrations(Map<Class<? extends a>, a> map) {
        return Arrays.asList(new x0.b[0]);
    }

    @Override // com.vehiclecloud.app.videofetch.rndownloader.data.AppDatabase
    public DownloadResourceDao getDownloadResourceDao() {
        DownloadResourceDao downloadResourceDao;
        if (this._downloadResourceDao != null) {
            return this._downloadResourceDao;
        }
        synchronized (this) {
            if (this._downloadResourceDao == null) {
                this._downloadResourceDao = new DownloadResourceDao_Impl(this);
            }
            downloadResourceDao = this._downloadResourceDao;
        }
        return downloadResourceDao;
    }

    @Override // androidx.room.k0
    public Set<Class<? extends a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.k0
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(DownloadResourceDao.class, DownloadResourceDao_Impl.getRequiredConverters());
        return hashMap;
    }
}
