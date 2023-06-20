package o1;

import androidx.room.k0;
import androidx.room.t0;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f34899a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.i<q> f34900b;

    /* renamed from: c  reason: collision with root package name */
    private final t0 f34901c;

    /* renamed from: d  reason: collision with root package name */
    private final t0 f34902d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.i<q> {
        a(s sVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.i
        /* renamed from: a */
        public void bind(z0.k kVar, q qVar) {
            if (qVar.b() == null) {
                kVar.P0(1);
            } else {
                kVar.p0(1, qVar.b());
            }
            byte[] l10 = androidx.work.e.l(qVar.a());
            if (l10 == null) {
                kVar.P0(2);
            } else {
                kVar.D0(2, l10);
            }
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends t0 {
        b(s sVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    class c extends t0 {
        c(s sVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(k0 k0Var) {
        this.f34899a = k0Var;
        this.f34900b = new a(this, k0Var);
        this.f34901c = new b(this, k0Var);
        this.f34902d = new c(this, k0Var);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    @Override // o1.r
    public void a(String str) {
        this.f34899a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34901c.acquire();
        if (str == null) {
            acquire.P0(1);
        } else {
            acquire.p0(1, str);
        }
        this.f34899a.beginTransaction();
        try {
            acquire.v();
            this.f34899a.setTransactionSuccessful();
        } finally {
            this.f34899a.endTransaction();
            this.f34901c.release(acquire);
        }
    }

    @Override // o1.r
    public void b() {
        this.f34899a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34902d.acquire();
        this.f34899a.beginTransaction();
        try {
            acquire.v();
            this.f34899a.setTransactionSuccessful();
        } finally {
            this.f34899a.endTransaction();
            this.f34902d.release(acquire);
        }
    }

    @Override // o1.r
    public void c(q qVar) {
        this.f34899a.assertNotSuspendingTransaction();
        this.f34899a.beginTransaction();
        try {
            this.f34900b.insert((androidx.room.i<q>) qVar);
            this.f34899a.setTransactionSuccessful();
        } finally {
            this.f34899a.endTransaction();
        }
    }
}
