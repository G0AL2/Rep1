package androidx.work.impl;

import android.os.Build;
import androidx.room.k0;
import androidx.room.m0;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y0.e;
import z0.h;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b  reason: collision with root package name */
    private volatile o1.v f4463b;

    /* renamed from: c  reason: collision with root package name */
    private volatile o1.b f4464c;

    /* renamed from: d  reason: collision with root package name */
    private volatile o1.z f4465d;

    /* renamed from: e  reason: collision with root package name */
    private volatile o1.j f4466e;

    /* renamed from: f  reason: collision with root package name */
    private volatile o1.o f4467f;

    /* renamed from: g  reason: collision with root package name */
    private volatile o1.r f4468g;

    /* renamed from: h  reason: collision with root package name */
    private volatile o1.e f4469h;

    /* renamed from: i  reason: collision with root package name */
    private volatile o1.g f4470i;

    /* loaded from: classes.dex */
    class a extends m0.b {
        a(int i10) {
            super(i10);
        }

        @Override // androidx.room.m0.b
        public void createAllTables(z0.g gVar) {
            gVar.s("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.s("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.s("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.s("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.s("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.s("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.s("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.s("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.s("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.s("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.s("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.s("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.s("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.s("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.s("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // androidx.room.m0.b
        public void dropAllTables(z0.g gVar) {
            gVar.s("DROP TABLE IF EXISTS `Dependency`");
            gVar.s("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.s("DROP TABLE IF EXISTS `WorkTag`");
            gVar.s("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.s("DROP TABLE IF EXISTS `WorkName`");
            gVar.s("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.s("DROP TABLE IF EXISTS `Preference`");
            if (((k0) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((k0) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((k0.b) ((k0) WorkDatabase_Impl.this).mCallbacks.get(i10)).b(gVar);
                }
            }
        }

        @Override // androidx.room.m0.b
        public void onCreate(z0.g gVar) {
            if (((k0) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((k0) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((k0.b) ((k0) WorkDatabase_Impl.this).mCallbacks.get(i10)).a(gVar);
                }
            }
        }

        @Override // androidx.room.m0.b
        public void onOpen(z0.g gVar) {
            ((k0) WorkDatabase_Impl.this).mDatabase = gVar;
            gVar.s("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(gVar);
            if (((k0) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((k0) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((k0.b) ((k0) WorkDatabase_Impl.this).mCallbacks.get(i10)).c(gVar);
                }
            }
        }

        @Override // androidx.room.m0.b
        public void onPostMigrate(z0.g gVar) {
        }

        @Override // androidx.room.m0.b
        public void onPreMigrate(z0.g gVar) {
            y0.b.a(gVar);
        }

        @Override // androidx.room.m0.b
        public m0.c onValidateSchema(z0.g gVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new e.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new e.C0540e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new e.C0540e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            y0.e eVar = new y0.e("Dependency", hashMap, hashSet, hashSet2);
            y0.e a10 = y0.e.a(gVar, "Dependency");
            if (!eVar.equals(a10)) {
                return new m0.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new e.a("id", "TEXT", true, 1, null, 1));
            hashMap2.put("state", new e.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new e.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new e.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new e.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new e.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new e.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new e.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new e.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new e.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new e.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new e.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("last_enqueue_time", new e.a("last_enqueue_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new e.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new e.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new e.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new e.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_count", new e.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new e.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("required_network_type", new e.a("required_network_type", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_charging", new e.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new e.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new e.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new e.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new e.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new e.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new e.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new e.C0540e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new e.C0540e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            y0.e eVar2 = new y0.e("WorkSpec", hashMap2, hashSet3, hashSet4);
            y0.e a11 = y0.e.a(gVar, "WorkSpec");
            if (!eVar2.equals(a11)) {
                return new m0.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new e.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new e.C0540e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            y0.e eVar3 = new y0.e("WorkTag", hashMap3, hashSet5, hashSet6);
            y0.e a12 = y0.e.a(gVar, "WorkTag");
            if (!eVar3.equals(a12)) {
                return new m0.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("generation", new e.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new e.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            y0.e eVar4 = new y0.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            y0.e a13 = y0.e.a(gVar, "SystemIdInfo");
            if (!eVar4.equals(a13)) {
                return new m0.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new e.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new e.C0540e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            y0.e eVar5 = new y0.e("WorkName", hashMap5, hashSet8, hashSet9);
            y0.e a14 = y0.e.a(gVar, "WorkName");
            if (!eVar5.equals(a14)) {
                return new m0.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new e.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put(DownloadWorker.KEY_OUT_PROGRESS, new e.a(DownloadWorker.KEY_OUT_PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new e.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            y0.e eVar6 = new y0.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            y0.e a15 = y0.e.a(gVar, "WorkProgress");
            if (!eVar6.equals(a15)) {
                return new m0.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new e.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new e.a("long_value", "INTEGER", false, 0, null, 1));
            y0.e eVar7 = new y0.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
            y0.e a16 = y0.e.a(gVar, "Preference");
            if (!eVar7.equals(a16)) {
                return new m0.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a16);
            }
            return new m0.c(true, null);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public o1.b b() {
        o1.b bVar;
        if (this.f4464c != null) {
            return this.f4464c;
        }
        synchronized (this) {
            if (this.f4464c == null) {
                this.f4464c = new o1.c(this);
            }
            bVar = this.f4464c;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o1.e c() {
        o1.e eVar;
        if (this.f4469h != null) {
            return this.f4469h;
        }
        synchronized (this) {
            if (this.f4469h == null) {
                this.f4469h = new o1.f(this);
            }
            eVar = this.f4469h;
        }
        return eVar;
    }

    @Override // androidx.room.k0
    public void clearAllTables() {
        super.assertNotMainThread();
        z0.g F0 = super.getOpenHelper().F0();
        boolean z10 = Build.VERSION.SDK_INT >= 21;
        if (!z10) {
            try {
                F0.s("PRAGMA foreign_keys = FALSE");
            } finally {
                super.endTransaction();
                if (!z10) {
                    F0.s("PRAGMA foreign_keys = TRUE");
                }
                F0.I0("PRAGMA wal_checkpoint(FULL)").close();
                if (!F0.S0()) {
                    F0.s("VACUUM");
                }
            }
        }
        super.beginTransaction();
        if (z10) {
            F0.s("PRAGMA defer_foreign_keys = TRUE");
        }
        F0.s("DELETE FROM `Dependency`");
        F0.s("DELETE FROM `WorkSpec`");
        F0.s("DELETE FROM `WorkTag`");
        F0.s("DELETE FROM `SystemIdInfo`");
        F0.s("DELETE FROM `WorkName`");
        F0.s("DELETE FROM `WorkProgress`");
        F0.s("DELETE FROM `Preference`");
        super.setTransactionSuccessful();
    }

    @Override // androidx.room.k0
    protected androidx.room.o createInvalidationTracker() {
        return new androidx.room.o(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.k0
    protected z0.h createOpenHelper(androidx.room.f fVar) {
        return fVar.f3893c.a(h.b.a(fVar.f3891a).d(fVar.f3892b).c(new m0(fVar, new a(16), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e")).b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public o1.g d() {
        o1.g gVar;
        if (this.f4470i != null) {
            return this.f4470i;
        }
        synchronized (this) {
            if (this.f4470i == null) {
                this.f4470i = new o1.h(this);
            }
            gVar = this.f4470i;
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o1.j e() {
        o1.j jVar;
        if (this.f4466e != null) {
            return this.f4466e;
        }
        synchronized (this) {
            if (this.f4466e == null) {
                this.f4466e = new o1.k(this);
            }
            jVar = this.f4466e;
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o1.o f() {
        o1.o oVar;
        if (this.f4467f != null) {
            return this.f4467f;
        }
        synchronized (this) {
            if (this.f4467f == null) {
                this.f4467f = new o1.p(this);
            }
            oVar = this.f4467f;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o1.r g() {
        o1.r rVar;
        if (this.f4468g != null) {
            return this.f4468g;
        }
        synchronized (this) {
            if (this.f4468g == null) {
                this.f4468g = new o1.s(this);
            }
            rVar = this.f4468g;
        }
        return rVar;
    }

    @Override // androidx.room.k0
    public List<x0.b> getAutoMigrations(Map<Class<? extends x0.a>, x0.a> map) {
        return Arrays.asList(new c0(), new d0());
    }

    @Override // androidx.room.k0
    public Set<Class<? extends x0.a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.k0
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(o1.v.class, o1.w.w());
        hashMap.put(o1.b.class, o1.c.e());
        hashMap.put(o1.z.class, o1.a0.d());
        hashMap.put(o1.j.class, o1.k.h());
        hashMap.put(o1.o.class, o1.p.c());
        hashMap.put(o1.r.class, o1.s.d());
        hashMap.put(o1.e.class, o1.f.c());
        hashMap.put(o1.g.class, o1.h.g());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o1.v h() {
        o1.v vVar;
        if (this.f4463b != null) {
            return this.f4463b;
        }
        synchronized (this) {
            if (this.f4463b == null) {
                this.f4463b = new o1.w(this);
            }
            vVar = this.f4463b;
        }
        return vVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public o1.z i() {
        o1.z zVar;
        if (this.f4465d != null) {
            return this.f4465d;
        }
        synchronized (this) {
            if (this.f4465d == null) {
                this.f4465d = new o1.a0(this);
            }
            zVar = this.f4465d;
        }
        return zVar;
    }
}
