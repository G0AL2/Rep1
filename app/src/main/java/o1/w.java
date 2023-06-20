package o1;

import android.database.Cursor;
import androidx.room.k0;
import androidx.room.n0;
import androidx.room.t0;
import androidx.work.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o1.u;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f34934a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.i<u> f34935b;

    /* renamed from: c  reason: collision with root package name */
    private final t0 f34936c;

    /* renamed from: d  reason: collision with root package name */
    private final t0 f34937d;

    /* renamed from: e  reason: collision with root package name */
    private final t0 f34938e;

    /* renamed from: f  reason: collision with root package name */
    private final t0 f34939f;

    /* renamed from: g  reason: collision with root package name */
    private final t0 f34940g;

    /* renamed from: h  reason: collision with root package name */
    private final t0 f34941h;

    /* renamed from: i  reason: collision with root package name */
    private final t0 f34942i;

    /* renamed from: j  reason: collision with root package name */
    private final t0 f34943j;

    /* renamed from: k  reason: collision with root package name */
    private final t0 f34944k;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends t0 {
        a(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends t0 {
        b(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class c extends t0 {
        c(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class d extends t0 {
        d(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class e extends androidx.room.i<u> {
        e(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.i
        /* renamed from: a */
        public void bind(z0.k kVar, u uVar) {
            String str = uVar.f34905a;
            if (str == null) {
                kVar.P0(1);
            } else {
                kVar.p0(1, str);
            }
            b0 b0Var = b0.f34870a;
            kVar.A0(2, b0.j(uVar.f34906b));
            String str2 = uVar.f34907c;
            if (str2 == null) {
                kVar.P0(3);
            } else {
                kVar.p0(3, str2);
            }
            String str3 = uVar.f34908d;
            if (str3 == null) {
                kVar.P0(4);
            } else {
                kVar.p0(4, str3);
            }
            byte[] l10 = androidx.work.e.l(uVar.f34909e);
            if (l10 == null) {
                kVar.P0(5);
            } else {
                kVar.D0(5, l10);
            }
            byte[] l11 = androidx.work.e.l(uVar.f34910f);
            if (l11 == null) {
                kVar.P0(6);
            } else {
                kVar.D0(6, l11);
            }
            kVar.A0(7, uVar.f34911g);
            kVar.A0(8, uVar.f34912h);
            kVar.A0(9, uVar.f34913i);
            kVar.A0(10, uVar.f34915k);
            kVar.A0(11, b0.a(uVar.f34916l));
            kVar.A0(12, uVar.f34917m);
            kVar.A0(13, uVar.f34918n);
            kVar.A0(14, uVar.f34919o);
            kVar.A0(15, uVar.f34920p);
            kVar.A0(16, uVar.f34921q ? 1L : 0L);
            kVar.A0(17, b0.h(uVar.f34922r));
            kVar.A0(18, uVar.g());
            kVar.A0(19, uVar.f());
            androidx.work.c cVar = uVar.f34914j;
            if (cVar != null) {
                kVar.A0(20, b0.g(cVar.d()));
                kVar.A0(21, cVar.g() ? 1L : 0L);
                kVar.A0(22, cVar.h() ? 1L : 0L);
                kVar.A0(23, cVar.f() ? 1L : 0L);
                kVar.A0(24, cVar.i() ? 1L : 0L);
                kVar.A0(25, cVar.b());
                kVar.A0(26, cVar.a());
                byte[] i10 = b0.i(cVar.c());
                if (i10 == null) {
                    kVar.P0(27);
                    return;
                } else {
                    kVar.D0(27, i10);
                    return;
                }
            }
            kVar.P0(20);
            kVar.P0(21);
            kVar.P0(22);
            kVar.P0(23);
            kVar.P0(24);
            kVar.P0(25);
            kVar.P0(26);
            kVar.P0(27);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class f extends androidx.room.h<u> {
        f(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.h
        /* renamed from: a */
        public void bind(z0.k kVar, u uVar) {
            String str = uVar.f34905a;
            if (str == null) {
                kVar.P0(1);
            } else {
                kVar.p0(1, str);
            }
            b0 b0Var = b0.f34870a;
            kVar.A0(2, b0.j(uVar.f34906b));
            String str2 = uVar.f34907c;
            if (str2 == null) {
                kVar.P0(3);
            } else {
                kVar.p0(3, str2);
            }
            String str3 = uVar.f34908d;
            if (str3 == null) {
                kVar.P0(4);
            } else {
                kVar.p0(4, str3);
            }
            byte[] l10 = androidx.work.e.l(uVar.f34909e);
            if (l10 == null) {
                kVar.P0(5);
            } else {
                kVar.D0(5, l10);
            }
            byte[] l11 = androidx.work.e.l(uVar.f34910f);
            if (l11 == null) {
                kVar.P0(6);
            } else {
                kVar.D0(6, l11);
            }
            kVar.A0(7, uVar.f34911g);
            kVar.A0(8, uVar.f34912h);
            kVar.A0(9, uVar.f34913i);
            kVar.A0(10, uVar.f34915k);
            kVar.A0(11, b0.a(uVar.f34916l));
            kVar.A0(12, uVar.f34917m);
            kVar.A0(13, uVar.f34918n);
            kVar.A0(14, uVar.f34919o);
            kVar.A0(15, uVar.f34920p);
            kVar.A0(16, uVar.f34921q ? 1L : 0L);
            kVar.A0(17, b0.h(uVar.f34922r));
            kVar.A0(18, uVar.g());
            kVar.A0(19, uVar.f());
            androidx.work.c cVar = uVar.f34914j;
            if (cVar != null) {
                kVar.A0(20, b0.g(cVar.d()));
                kVar.A0(21, cVar.g() ? 1L : 0L);
                kVar.A0(22, cVar.h() ? 1L : 0L);
                kVar.A0(23, cVar.f() ? 1L : 0L);
                kVar.A0(24, cVar.i() ? 1L : 0L);
                kVar.A0(25, cVar.b());
                kVar.A0(26, cVar.a());
                byte[] i10 = b0.i(cVar.c());
                if (i10 == null) {
                    kVar.P0(27);
                } else {
                    kVar.D0(27, i10);
                }
            } else {
                kVar.P0(20);
                kVar.P0(21);
                kVar.P0(22);
                kVar.P0(23);
                kVar.P0(24);
                kVar.P0(25);
                kVar.P0(26);
                kVar.P0(27);
            }
            String str4 = uVar.f34905a;
            if (str4 == null) {
                kVar.P0(28);
            } else {
                kVar.p0(28, str4);
            }
        }

        @Override // androidx.room.h, androidx.room.t0
        public String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class g extends t0 {
        g(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class h extends t0 {
        h(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class i extends t0 {
        i(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class j extends t0 {
        j(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class k extends t0 {
        k(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class l extends t0 {
        l(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class m extends t0 {
        m(w wVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public w(k0 k0Var) {
        this.f34934a = k0Var;
        this.f34935b = new e(this, k0Var);
        new f(this, k0Var);
        this.f34936c = new g(this, k0Var);
        this.f34937d = new h(this, k0Var);
        this.f34938e = new i(this, k0Var);
        this.f34939f = new j(this, k0Var);
        this.f34940g = new k(this, k0Var);
        this.f34941h = new l(this, k0Var);
        this.f34942i = new m(this, k0Var);
        this.f34943j = new a(this, k0Var);
        this.f34944k = new b(this, k0Var);
        new c(this, k0Var);
        new d(this, k0Var);
    }

    public static List<Class<?>> w() {
        return Collections.emptyList();
    }

    @Override // o1.v
    public void a(String str) {
        this.f34934a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34936c.acquire();
        if (str == null) {
            acquire.P0(1);
        } else {
            acquire.p0(1, str);
        }
        this.f34934a.beginTransaction();
        try {
            acquire.v();
            this.f34934a.setTransactionSuccessful();
        } finally {
            this.f34934a.endTransaction();
            this.f34936c.release(acquire);
        }
    }

    @Override // o1.v
    public void b(String str) {
        this.f34934a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34938e.acquire();
        if (str == null) {
            acquire.P0(1);
        } else {
            acquire.p0(1, str);
        }
        this.f34934a.beginTransaction();
        try {
            acquire.v();
            this.f34934a.setTransactionSuccessful();
        } finally {
            this.f34934a.endTransaction();
            this.f34938e.release(acquire);
        }
    }

    @Override // o1.v
    public List<u> c(long j10) {
        n0 n0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        n0 d10 = n0.d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        d10.A0(1, j10);
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            e10 = y0.a.e(b10, "id");
            e11 = y0.a.e(b10, "state");
            e12 = y0.a.e(b10, "worker_class_name");
            e13 = y0.a.e(b10, "input_merger_class_name");
            e14 = y0.a.e(b10, "input");
            e15 = y0.a.e(b10, "output");
            e16 = y0.a.e(b10, "initial_delay");
            e17 = y0.a.e(b10, "interval_duration");
            e18 = y0.a.e(b10, "flex_duration");
            e19 = y0.a.e(b10, "run_attempt_count");
            e20 = y0.a.e(b10, "backoff_policy");
            e21 = y0.a.e(b10, "backoff_delay_duration");
            e22 = y0.a.e(b10, "last_enqueue_time");
            e23 = y0.a.e(b10, "minimum_retention_duration");
            n0Var = d10;
        } catch (Throwable th) {
            th = th;
            n0Var = d10;
        }
        try {
            int e24 = y0.a.e(b10, "schedule_requested_at");
            int e25 = y0.a.e(b10, "run_in_foreground");
            int e26 = y0.a.e(b10, "out_of_quota_policy");
            int e27 = y0.a.e(b10, "period_count");
            int e28 = y0.a.e(b10, "generation");
            int e29 = y0.a.e(b10, "required_network_type");
            int e30 = y0.a.e(b10, "requires_charging");
            int e31 = y0.a.e(b10, "requires_device_idle");
            int e32 = y0.a.e(b10, "requires_battery_not_low");
            int e33 = y0.a.e(b10, "requires_storage_not_low");
            int e34 = y0.a.e(b10, "trigger_content_update_delay");
            int e35 = y0.a.e(b10, "trigger_max_content_delay");
            int e36 = y0.a.e(b10, "content_uri_triggers");
            int i15 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                int i16 = b10.getInt(e11);
                b0 b0Var = b0.f34870a;
                u.a f10 = b0.f(i16);
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.e g10 = androidx.work.e.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.e g11 = androidx.work.e.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j11 = b10.getLong(e16);
                long j12 = b10.getLong(e17);
                long j13 = b10.getLong(e18);
                int i17 = b10.getInt(e19);
                androidx.work.a c10 = b0.c(b10.getInt(e20));
                long j14 = b10.getLong(e21);
                long j15 = b10.getLong(e22);
                int i18 = i15;
                long j16 = b10.getLong(i18);
                int i19 = e10;
                int i20 = e24;
                long j17 = b10.getLong(i20);
                e24 = i20;
                int i21 = e25;
                if (b10.getInt(i21) != 0) {
                    e25 = i21;
                    i10 = e26;
                    z10 = true;
                } else {
                    e25 = i21;
                    i10 = e26;
                    z10 = false;
                }
                androidx.work.p e37 = b0.e(b10.getInt(i10));
                e26 = i10;
                int i22 = e27;
                int i23 = b10.getInt(i22);
                e27 = i22;
                int i24 = e28;
                int i25 = b10.getInt(i24);
                e28 = i24;
                int i26 = e29;
                androidx.work.m d11 = b0.d(b10.getInt(i26));
                e29 = i26;
                int i27 = e30;
                if (b10.getInt(i27) != 0) {
                    e30 = i27;
                    i11 = e31;
                    z11 = true;
                } else {
                    e30 = i27;
                    i11 = e31;
                    z11 = false;
                }
                if (b10.getInt(i11) != 0) {
                    e31 = i11;
                    i12 = e32;
                    z12 = true;
                } else {
                    e31 = i11;
                    i12 = e32;
                    z12 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e32 = i12;
                    i13 = e33;
                    z13 = true;
                } else {
                    e32 = i12;
                    i13 = e33;
                    z13 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e33 = i13;
                    i14 = e34;
                    z14 = true;
                } else {
                    e33 = i13;
                    i14 = e34;
                    z14 = false;
                }
                long j18 = b10.getLong(i14);
                e34 = i14;
                int i28 = e35;
                long j19 = b10.getLong(i28);
                e35 = i28;
                int i29 = e36;
                e36 = i29;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j11, j12, j13, new androidx.work.c(d11, z11, z12, z13, z14, j18, j19, b0.b(b10.isNull(i29) ? null : b10.getBlob(i29))), i17, c10, j14, j15, j16, j17, z10, e37, i23, i25));
                e10 = i19;
                i15 = i18;
            }
            b10.close();
            n0Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b10.close();
            n0Var.release();
            throw th;
        }
    }

    @Override // o1.v
    public List<u> d() {
        n0 n0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        n0 d10 = n0.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            e10 = y0.a.e(b10, "id");
            e11 = y0.a.e(b10, "state");
            e12 = y0.a.e(b10, "worker_class_name");
            e13 = y0.a.e(b10, "input_merger_class_name");
            e14 = y0.a.e(b10, "input");
            e15 = y0.a.e(b10, "output");
            e16 = y0.a.e(b10, "initial_delay");
            e17 = y0.a.e(b10, "interval_duration");
            e18 = y0.a.e(b10, "flex_duration");
            e19 = y0.a.e(b10, "run_attempt_count");
            e20 = y0.a.e(b10, "backoff_policy");
            e21 = y0.a.e(b10, "backoff_delay_duration");
            e22 = y0.a.e(b10, "last_enqueue_time");
            e23 = y0.a.e(b10, "minimum_retention_duration");
            n0Var = d10;
        } catch (Throwable th) {
            th = th;
            n0Var = d10;
        }
        try {
            int e24 = y0.a.e(b10, "schedule_requested_at");
            int e25 = y0.a.e(b10, "run_in_foreground");
            int e26 = y0.a.e(b10, "out_of_quota_policy");
            int e27 = y0.a.e(b10, "period_count");
            int e28 = y0.a.e(b10, "generation");
            int e29 = y0.a.e(b10, "required_network_type");
            int e30 = y0.a.e(b10, "requires_charging");
            int e31 = y0.a.e(b10, "requires_device_idle");
            int e32 = y0.a.e(b10, "requires_battery_not_low");
            int e33 = y0.a.e(b10, "requires_storage_not_low");
            int e34 = y0.a.e(b10, "trigger_content_update_delay");
            int e35 = y0.a.e(b10, "trigger_max_content_delay");
            int e36 = y0.a.e(b10, "content_uri_triggers");
            int i15 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                int i16 = b10.getInt(e11);
                b0 b0Var = b0.f34870a;
                u.a f10 = b0.f(i16);
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.e g10 = androidx.work.e.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.e g11 = androidx.work.e.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i17 = b10.getInt(e19);
                androidx.work.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                int i18 = i15;
                long j15 = b10.getLong(i18);
                int i19 = e10;
                int i20 = e24;
                long j16 = b10.getLong(i20);
                e24 = i20;
                int i21 = e25;
                if (b10.getInt(i21) != 0) {
                    e25 = i21;
                    i10 = e26;
                    z10 = true;
                } else {
                    e25 = i21;
                    i10 = e26;
                    z10 = false;
                }
                androidx.work.p e37 = b0.e(b10.getInt(i10));
                e26 = i10;
                int i22 = e27;
                int i23 = b10.getInt(i22);
                e27 = i22;
                int i24 = e28;
                int i25 = b10.getInt(i24);
                e28 = i24;
                int i26 = e29;
                androidx.work.m d11 = b0.d(b10.getInt(i26));
                e29 = i26;
                int i27 = e30;
                if (b10.getInt(i27) != 0) {
                    e30 = i27;
                    i11 = e31;
                    z11 = true;
                } else {
                    e30 = i27;
                    i11 = e31;
                    z11 = false;
                }
                if (b10.getInt(i11) != 0) {
                    e31 = i11;
                    i12 = e32;
                    z12 = true;
                } else {
                    e31 = i11;
                    i12 = e32;
                    z12 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e32 = i12;
                    i13 = e33;
                    z13 = true;
                } else {
                    e32 = i12;
                    i13 = e33;
                    z13 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e33 = i13;
                    i14 = e34;
                    z14 = true;
                } else {
                    e33 = i13;
                    i14 = e34;
                    z14 = false;
                }
                long j17 = b10.getLong(i14);
                e34 = i14;
                int i28 = e35;
                long j18 = b10.getLong(i28);
                e35 = i28;
                int i29 = e36;
                e36 = i29;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new androidx.work.c(d11, z11, z12, z13, z14, j17, j18, b0.b(b10.isNull(i29) ? null : b10.getBlob(i29))), i17, c10, j13, j14, j15, j16, z10, e37, i23, i25));
                e10 = i19;
                i15 = i18;
            }
            b10.close();
            n0Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b10.close();
            n0Var.release();
            throw th;
        }
    }

    @Override // o1.v
    public void e(u uVar) {
        this.f34934a.assertNotSuspendingTransaction();
        this.f34934a.beginTransaction();
        try {
            this.f34935b.insert((androidx.room.i<u>) uVar);
            this.f34934a.setTransactionSuccessful();
        } finally {
            this.f34934a.endTransaction();
        }
    }

    @Override // o1.v
    public List<String> f(String str) {
        n0 d10 = n0.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.isNull(0) ? null : b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // o1.v
    public u.a g(String str) {
        n0 d10 = n0.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34934a.assertNotSuspendingTransaction();
        u.a aVar = null;
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                Integer valueOf = b10.isNull(0) ? null : Integer.valueOf(b10.getInt(0));
                if (valueOf != null) {
                    b0 b0Var = b0.f34870a;
                    aVar = b0.f(valueOf.intValue());
                }
            }
            return aVar;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // o1.v
    public u h(String str) {
        n0 n0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        u uVar;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        n0 d10 = n0.d("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            e10 = y0.a.e(b10, "id");
            e11 = y0.a.e(b10, "state");
            e12 = y0.a.e(b10, "worker_class_name");
            e13 = y0.a.e(b10, "input_merger_class_name");
            e14 = y0.a.e(b10, "input");
            e15 = y0.a.e(b10, "output");
            e16 = y0.a.e(b10, "initial_delay");
            e17 = y0.a.e(b10, "interval_duration");
            e18 = y0.a.e(b10, "flex_duration");
            e19 = y0.a.e(b10, "run_attempt_count");
            e20 = y0.a.e(b10, "backoff_policy");
            e21 = y0.a.e(b10, "backoff_delay_duration");
            e22 = y0.a.e(b10, "last_enqueue_time");
            e23 = y0.a.e(b10, "minimum_retention_duration");
            n0Var = d10;
        } catch (Throwable th) {
            th = th;
            n0Var = d10;
        }
        try {
            int e24 = y0.a.e(b10, "schedule_requested_at");
            int e25 = y0.a.e(b10, "run_in_foreground");
            int e26 = y0.a.e(b10, "out_of_quota_policy");
            int e27 = y0.a.e(b10, "period_count");
            int e28 = y0.a.e(b10, "generation");
            int e29 = y0.a.e(b10, "required_network_type");
            int e30 = y0.a.e(b10, "requires_charging");
            int e31 = y0.a.e(b10, "requires_device_idle");
            int e32 = y0.a.e(b10, "requires_battery_not_low");
            int e33 = y0.a.e(b10, "requires_storage_not_low");
            int e34 = y0.a.e(b10, "trigger_content_update_delay");
            int e35 = y0.a.e(b10, "trigger_max_content_delay");
            int e36 = y0.a.e(b10, "content_uri_triggers");
            if (b10.moveToFirst()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                int i15 = b10.getInt(e11);
                b0 b0Var = b0.f34870a;
                u.a f10 = b0.f(i15);
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.e g10 = androidx.work.e.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.e g11 = androidx.work.e.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i16 = b10.getInt(e19);
                androidx.work.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                long j15 = b10.getLong(e23);
                long j16 = b10.getLong(e24);
                if (b10.getInt(e25) != 0) {
                    i10 = e26;
                    z10 = true;
                } else {
                    i10 = e26;
                    z10 = false;
                }
                androidx.work.p e37 = b0.e(b10.getInt(i10));
                int i17 = b10.getInt(e27);
                int i18 = b10.getInt(e28);
                androidx.work.m d11 = b0.d(b10.getInt(e29));
                if (b10.getInt(e30) != 0) {
                    i11 = e31;
                    z11 = true;
                } else {
                    i11 = e31;
                    z11 = false;
                }
                if (b10.getInt(i11) != 0) {
                    i12 = e32;
                    z12 = true;
                } else {
                    i12 = e32;
                    z12 = false;
                }
                if (b10.getInt(i12) != 0) {
                    i13 = e33;
                    z13 = true;
                } else {
                    i13 = e33;
                    z13 = false;
                }
                if (b10.getInt(i13) != 0) {
                    i14 = e34;
                    z14 = true;
                } else {
                    i14 = e34;
                    z14 = false;
                }
                uVar = new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new androidx.work.c(d11, z11, z12, z13, z14, b10.getLong(i14), b10.getLong(e35), b0.b(b10.isNull(e36) ? null : b10.getBlob(e36))), i16, c10, j13, j14, j15, j16, z10, e37, i17, i18);
            } else {
                uVar = null;
            }
            b10.close();
            n0Var.release();
            return uVar;
        } catch (Throwable th2) {
            th = th2;
            b10.close();
            n0Var.release();
            throw th;
        }
    }

    @Override // o1.v
    public void i(String str, long j10) {
        this.f34934a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34940g.acquire();
        acquire.A0(1, j10);
        if (str == null) {
            acquire.P0(2);
        } else {
            acquire.p0(2, str);
        }
        this.f34934a.beginTransaction();
        try {
            acquire.v();
            this.f34934a.setTransactionSuccessful();
        } finally {
            this.f34934a.endTransaction();
            this.f34940g.release(acquire);
        }
    }

    @Override // o1.v
    public List<String> j(String str) {
        n0 d10 = n0.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.isNull(0) ? null : b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // o1.v
    public List<androidx.work.e> k(String str) {
        n0 d10 = n0.d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.e.g(b10.isNull(0) ? null : b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // o1.v
    public List<u> l(int i10) {
        n0 n0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        n0 d10 = n0.d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        d10.A0(1, i10);
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            e10 = y0.a.e(b10, "id");
            e11 = y0.a.e(b10, "state");
            e12 = y0.a.e(b10, "worker_class_name");
            e13 = y0.a.e(b10, "input_merger_class_name");
            e14 = y0.a.e(b10, "input");
            e15 = y0.a.e(b10, "output");
            e16 = y0.a.e(b10, "initial_delay");
            e17 = y0.a.e(b10, "interval_duration");
            e18 = y0.a.e(b10, "flex_duration");
            e19 = y0.a.e(b10, "run_attempt_count");
            e20 = y0.a.e(b10, "backoff_policy");
            e21 = y0.a.e(b10, "backoff_delay_duration");
            e22 = y0.a.e(b10, "last_enqueue_time");
            e23 = y0.a.e(b10, "minimum_retention_duration");
            n0Var = d10;
        } catch (Throwable th) {
            th = th;
            n0Var = d10;
        }
        try {
            int e24 = y0.a.e(b10, "schedule_requested_at");
            int e25 = y0.a.e(b10, "run_in_foreground");
            int e26 = y0.a.e(b10, "out_of_quota_policy");
            int e27 = y0.a.e(b10, "period_count");
            int e28 = y0.a.e(b10, "generation");
            int e29 = y0.a.e(b10, "required_network_type");
            int e30 = y0.a.e(b10, "requires_charging");
            int e31 = y0.a.e(b10, "requires_device_idle");
            int e32 = y0.a.e(b10, "requires_battery_not_low");
            int e33 = y0.a.e(b10, "requires_storage_not_low");
            int e34 = y0.a.e(b10, "trigger_content_update_delay");
            int e35 = y0.a.e(b10, "trigger_max_content_delay");
            int e36 = y0.a.e(b10, "content_uri_triggers");
            int i16 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                int i17 = b10.getInt(e11);
                b0 b0Var = b0.f34870a;
                u.a f10 = b0.f(i17);
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.e g10 = androidx.work.e.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.e g11 = androidx.work.e.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i18 = b10.getInt(e19);
                androidx.work.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                int i19 = i16;
                long j15 = b10.getLong(i19);
                int i20 = e10;
                int i21 = e24;
                long j16 = b10.getLong(i21);
                e24 = i21;
                int i22 = e25;
                if (b10.getInt(i22) != 0) {
                    e25 = i22;
                    i11 = e26;
                    z10 = true;
                } else {
                    e25 = i22;
                    i11 = e26;
                    z10 = false;
                }
                androidx.work.p e37 = b0.e(b10.getInt(i11));
                e26 = i11;
                int i23 = e27;
                int i24 = b10.getInt(i23);
                e27 = i23;
                int i25 = e28;
                int i26 = b10.getInt(i25);
                e28 = i25;
                int i27 = e29;
                androidx.work.m d11 = b0.d(b10.getInt(i27));
                e29 = i27;
                int i28 = e30;
                if (b10.getInt(i28) != 0) {
                    e30 = i28;
                    i12 = e31;
                    z11 = true;
                } else {
                    e30 = i28;
                    i12 = e31;
                    z11 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e31 = i12;
                    i13 = e32;
                    z12 = true;
                } else {
                    e31 = i12;
                    i13 = e32;
                    z12 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e32 = i13;
                    i14 = e33;
                    z13 = true;
                } else {
                    e32 = i13;
                    i14 = e33;
                    z13 = false;
                }
                if (b10.getInt(i14) != 0) {
                    e33 = i14;
                    i15 = e34;
                    z14 = true;
                } else {
                    e33 = i14;
                    i15 = e34;
                    z14 = false;
                }
                long j17 = b10.getLong(i15);
                e34 = i15;
                int i29 = e35;
                long j18 = b10.getLong(i29);
                e35 = i29;
                int i30 = e36;
                e36 = i30;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new androidx.work.c(d11, z11, z12, z13, z14, j17, j18, b0.b(b10.isNull(i30) ? null : b10.getBlob(i30))), i18, c10, j13, j14, j15, j16, z10, e37, i24, i26));
                e10 = i20;
                i16 = i19;
            }
            b10.close();
            n0Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b10.close();
            n0Var.release();
            throw th;
        }
    }

    @Override // o1.v
    public int m() {
        this.f34934a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34944k.acquire();
        this.f34934a.beginTransaction();
        try {
            int v10 = acquire.v();
            this.f34934a.setTransactionSuccessful();
            return v10;
        } finally {
            this.f34934a.endTransaction();
            this.f34944k.release(acquire);
        }
    }

    @Override // o1.v
    public int n(String str, long j10) {
        this.f34934a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34943j.acquire();
        acquire.A0(1, j10);
        if (str == null) {
            acquire.P0(2);
        } else {
            acquire.p0(2, str);
        }
        this.f34934a.beginTransaction();
        try {
            int v10 = acquire.v();
            this.f34934a.setTransactionSuccessful();
            return v10;
        } finally {
            this.f34934a.endTransaction();
            this.f34943j.release(acquire);
        }
    }

    @Override // o1.v
    public List<u.b> o(String str) {
        n0 d10 = n0.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(0) ? null : b10.getString(0);
                int i10 = b10.getInt(1);
                b0 b0Var = b0.f34870a;
                arrayList.add(new u.b(string, b0.f(i10)));
            }
            return arrayList;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // o1.v
    public List<u> p(int i10) {
        n0 n0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        n0 d10 = n0.d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        d10.A0(1, i10);
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            e10 = y0.a.e(b10, "id");
            e11 = y0.a.e(b10, "state");
            e12 = y0.a.e(b10, "worker_class_name");
            e13 = y0.a.e(b10, "input_merger_class_name");
            e14 = y0.a.e(b10, "input");
            e15 = y0.a.e(b10, "output");
            e16 = y0.a.e(b10, "initial_delay");
            e17 = y0.a.e(b10, "interval_duration");
            e18 = y0.a.e(b10, "flex_duration");
            e19 = y0.a.e(b10, "run_attempt_count");
            e20 = y0.a.e(b10, "backoff_policy");
            e21 = y0.a.e(b10, "backoff_delay_duration");
            e22 = y0.a.e(b10, "last_enqueue_time");
            e23 = y0.a.e(b10, "minimum_retention_duration");
            n0Var = d10;
        } catch (Throwable th) {
            th = th;
            n0Var = d10;
        }
        try {
            int e24 = y0.a.e(b10, "schedule_requested_at");
            int e25 = y0.a.e(b10, "run_in_foreground");
            int e26 = y0.a.e(b10, "out_of_quota_policy");
            int e27 = y0.a.e(b10, "period_count");
            int e28 = y0.a.e(b10, "generation");
            int e29 = y0.a.e(b10, "required_network_type");
            int e30 = y0.a.e(b10, "requires_charging");
            int e31 = y0.a.e(b10, "requires_device_idle");
            int e32 = y0.a.e(b10, "requires_battery_not_low");
            int e33 = y0.a.e(b10, "requires_storage_not_low");
            int e34 = y0.a.e(b10, "trigger_content_update_delay");
            int e35 = y0.a.e(b10, "trigger_max_content_delay");
            int e36 = y0.a.e(b10, "content_uri_triggers");
            int i16 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                int i17 = b10.getInt(e11);
                b0 b0Var = b0.f34870a;
                u.a f10 = b0.f(i17);
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.e g10 = androidx.work.e.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.e g11 = androidx.work.e.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i18 = b10.getInt(e19);
                androidx.work.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                int i19 = i16;
                long j15 = b10.getLong(i19);
                int i20 = e10;
                int i21 = e24;
                long j16 = b10.getLong(i21);
                e24 = i21;
                int i22 = e25;
                if (b10.getInt(i22) != 0) {
                    e25 = i22;
                    i11 = e26;
                    z10 = true;
                } else {
                    e25 = i22;
                    i11 = e26;
                    z10 = false;
                }
                androidx.work.p e37 = b0.e(b10.getInt(i11));
                e26 = i11;
                int i23 = e27;
                int i24 = b10.getInt(i23);
                e27 = i23;
                int i25 = e28;
                int i26 = b10.getInt(i25);
                e28 = i25;
                int i27 = e29;
                androidx.work.m d11 = b0.d(b10.getInt(i27));
                e29 = i27;
                int i28 = e30;
                if (b10.getInt(i28) != 0) {
                    e30 = i28;
                    i12 = e31;
                    z11 = true;
                } else {
                    e30 = i28;
                    i12 = e31;
                    z11 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e31 = i12;
                    i13 = e32;
                    z12 = true;
                } else {
                    e31 = i12;
                    i13 = e32;
                    z12 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e32 = i13;
                    i14 = e33;
                    z13 = true;
                } else {
                    e32 = i13;
                    i14 = e33;
                    z13 = false;
                }
                if (b10.getInt(i14) != 0) {
                    e33 = i14;
                    i15 = e34;
                    z14 = true;
                } else {
                    e33 = i14;
                    i15 = e34;
                    z14 = false;
                }
                long j17 = b10.getLong(i15);
                e34 = i15;
                int i29 = e35;
                long j18 = b10.getLong(i29);
                e35 = i29;
                int i30 = e36;
                e36 = i30;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new androidx.work.c(d11, z11, z12, z13, z14, j17, j18, b0.b(b10.isNull(i30) ? null : b10.getBlob(i30))), i18, c10, j13, j14, j15, j16, z10, e37, i24, i26));
                e10 = i20;
                i16 = i19;
            }
            b10.close();
            n0Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b10.close();
            n0Var.release();
            throw th;
        }
    }

    @Override // o1.v
    public int q(u.a aVar, String str) {
        this.f34934a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34937d.acquire();
        b0 b0Var = b0.f34870a;
        acquire.A0(1, b0.j(aVar));
        if (str == null) {
            acquire.P0(2);
        } else {
            acquire.p0(2, str);
        }
        this.f34934a.beginTransaction();
        try {
            int v10 = acquire.v();
            this.f34934a.setTransactionSuccessful();
            return v10;
        } finally {
            this.f34934a.endTransaction();
            this.f34937d.release(acquire);
        }
    }

    @Override // o1.v
    public void r(String str, androidx.work.e eVar) {
        this.f34934a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34939f.acquire();
        byte[] l10 = androidx.work.e.l(eVar);
        if (l10 == null) {
            acquire.P0(1);
        } else {
            acquire.D0(1, l10);
        }
        if (str == null) {
            acquire.P0(2);
        } else {
            acquire.p0(2, str);
        }
        this.f34934a.beginTransaction();
        try {
            acquire.v();
            this.f34934a.setTransactionSuccessful();
        } finally {
            this.f34934a.endTransaction();
            this.f34939f.release(acquire);
        }
    }

    @Override // o1.v
    public List<u> s() {
        n0 n0Var;
        int e10;
        int e11;
        int e12;
        int e13;
        int e14;
        int e15;
        int e16;
        int e17;
        int e18;
        int e19;
        int e20;
        int e21;
        int e22;
        int e23;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        n0 d10 = n0.d("SELECT * FROM workspec WHERE state=1", 0);
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            e10 = y0.a.e(b10, "id");
            e11 = y0.a.e(b10, "state");
            e12 = y0.a.e(b10, "worker_class_name");
            e13 = y0.a.e(b10, "input_merger_class_name");
            e14 = y0.a.e(b10, "input");
            e15 = y0.a.e(b10, "output");
            e16 = y0.a.e(b10, "initial_delay");
            e17 = y0.a.e(b10, "interval_duration");
            e18 = y0.a.e(b10, "flex_duration");
            e19 = y0.a.e(b10, "run_attempt_count");
            e20 = y0.a.e(b10, "backoff_policy");
            e21 = y0.a.e(b10, "backoff_delay_duration");
            e22 = y0.a.e(b10, "last_enqueue_time");
            e23 = y0.a.e(b10, "minimum_retention_duration");
            n0Var = d10;
        } catch (Throwable th) {
            th = th;
            n0Var = d10;
        }
        try {
            int e24 = y0.a.e(b10, "schedule_requested_at");
            int e25 = y0.a.e(b10, "run_in_foreground");
            int e26 = y0.a.e(b10, "out_of_quota_policy");
            int e27 = y0.a.e(b10, "period_count");
            int e28 = y0.a.e(b10, "generation");
            int e29 = y0.a.e(b10, "required_network_type");
            int e30 = y0.a.e(b10, "requires_charging");
            int e31 = y0.a.e(b10, "requires_device_idle");
            int e32 = y0.a.e(b10, "requires_battery_not_low");
            int e33 = y0.a.e(b10, "requires_storage_not_low");
            int e34 = y0.a.e(b10, "trigger_content_update_delay");
            int e35 = y0.a.e(b10, "trigger_max_content_delay");
            int e36 = y0.a.e(b10, "content_uri_triggers");
            int i15 = e23;
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                String string = b10.isNull(e10) ? null : b10.getString(e10);
                int i16 = b10.getInt(e11);
                b0 b0Var = b0.f34870a;
                u.a f10 = b0.f(i16);
                String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                androidx.work.e g10 = androidx.work.e.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                androidx.work.e g11 = androidx.work.e.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                long j10 = b10.getLong(e16);
                long j11 = b10.getLong(e17);
                long j12 = b10.getLong(e18);
                int i17 = b10.getInt(e19);
                androidx.work.a c10 = b0.c(b10.getInt(e20));
                long j13 = b10.getLong(e21);
                long j14 = b10.getLong(e22);
                int i18 = i15;
                long j15 = b10.getLong(i18);
                int i19 = e10;
                int i20 = e24;
                long j16 = b10.getLong(i20);
                e24 = i20;
                int i21 = e25;
                if (b10.getInt(i21) != 0) {
                    e25 = i21;
                    i10 = e26;
                    z10 = true;
                } else {
                    e25 = i21;
                    i10 = e26;
                    z10 = false;
                }
                androidx.work.p e37 = b0.e(b10.getInt(i10));
                e26 = i10;
                int i22 = e27;
                int i23 = b10.getInt(i22);
                e27 = i22;
                int i24 = e28;
                int i25 = b10.getInt(i24);
                e28 = i24;
                int i26 = e29;
                androidx.work.m d11 = b0.d(b10.getInt(i26));
                e29 = i26;
                int i27 = e30;
                if (b10.getInt(i27) != 0) {
                    e30 = i27;
                    i11 = e31;
                    z11 = true;
                } else {
                    e30 = i27;
                    i11 = e31;
                    z11 = false;
                }
                if (b10.getInt(i11) != 0) {
                    e31 = i11;
                    i12 = e32;
                    z12 = true;
                } else {
                    e31 = i11;
                    i12 = e32;
                    z12 = false;
                }
                if (b10.getInt(i12) != 0) {
                    e32 = i12;
                    i13 = e33;
                    z13 = true;
                } else {
                    e32 = i12;
                    i13 = e33;
                    z13 = false;
                }
                if (b10.getInt(i13) != 0) {
                    e33 = i13;
                    i14 = e34;
                    z14 = true;
                } else {
                    e33 = i13;
                    i14 = e34;
                    z14 = false;
                }
                long j17 = b10.getLong(i14);
                e34 = i14;
                int i28 = e35;
                long j18 = b10.getLong(i28);
                e35 = i28;
                int i29 = e36;
                e36 = i29;
                arrayList.add(new u(string, f10, string2, string3, g10, g11, j10, j11, j12, new androidx.work.c(d11, z11, z12, z13, z14, j17, j18, b0.b(b10.isNull(i29) ? null : b10.getBlob(i29))), i17, c10, j13, j14, j15, j16, z10, e37, i23, i25));
                e10 = i19;
                i15 = i18;
            }
            b10.close();
            n0Var.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b10.close();
            n0Var.release();
            throw th;
        }
    }

    @Override // o1.v
    public boolean t() {
        boolean z10 = false;
        n0 d10 = n0.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f34934a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34934a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // o1.v
    public int u(String str) {
        this.f34934a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34942i.acquire();
        if (str == null) {
            acquire.P0(1);
        } else {
            acquire.p0(1, str);
        }
        this.f34934a.beginTransaction();
        try {
            int v10 = acquire.v();
            this.f34934a.setTransactionSuccessful();
            return v10;
        } finally {
            this.f34934a.endTransaction();
            this.f34942i.release(acquire);
        }
    }

    @Override // o1.v
    public int v(String str) {
        this.f34934a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34941h.acquire();
        if (str == null) {
            acquire.P0(1);
        } else {
            acquire.p0(1, str);
        }
        this.f34934a.beginTransaction();
        try {
            int v10 = acquire.v();
            this.f34934a.setTransactionSuccessful();
            return v10;
        } finally {
            this.f34934a.endTransaction();
            this.f34941h.release(acquire);
        }
    }
}
