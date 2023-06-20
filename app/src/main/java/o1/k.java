package o1;

import android.database.Cursor;
import androidx.room.k0;
import androidx.room.n0;
import androidx.room.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o1.j;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f34887a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.i<i> f34888b;

    /* renamed from: c  reason: collision with root package name */
    private final t0 f34889c;

    /* renamed from: d  reason: collision with root package name */
    private final t0 f34890d;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.i<i> {
        a(k kVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.i
        /* renamed from: a */
        public void bind(z0.k kVar, i iVar) {
            String str = iVar.f34884a;
            if (str == null) {
                kVar.P0(1);
            } else {
                kVar.p0(1, str);
            }
            kVar.A0(2, iVar.a());
            kVar.A0(3, iVar.f34886c);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends t0 {
        b(k kVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    class c extends t0 {
        c(k kVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(k0 k0Var) {
        this.f34887a = k0Var;
        this.f34888b = new a(this, k0Var);
        this.f34889c = new b(this, k0Var);
        this.f34890d = new c(this, k0Var);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    @Override // o1.j
    public void a(m mVar) {
        j.a.b(this, mVar);
    }

    @Override // o1.j
    public void b(i iVar) {
        this.f34887a.assertNotSuspendingTransaction();
        this.f34887a.beginTransaction();
        try {
            this.f34888b.insert((androidx.room.i<i>) iVar);
            this.f34887a.setTransactionSuccessful();
        } finally {
            this.f34887a.endTransaction();
        }
    }

    @Override // o1.j
    public i c(String str, int i10) {
        n0 d10 = n0.d("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        d10.A0(2, i10);
        this.f34887a.assertNotSuspendingTransaction();
        i iVar = null;
        String string = null;
        Cursor b10 = y0.b.b(this.f34887a, d10, false, null);
        try {
            int e10 = y0.a.e(b10, "work_spec_id");
            int e11 = y0.a.e(b10, "generation");
            int e12 = y0.a.e(b10, "system_id");
            if (b10.moveToFirst()) {
                if (!b10.isNull(e10)) {
                    string = b10.getString(e10);
                }
                iVar = new i(string, b10.getInt(e11), b10.getInt(e12));
            }
            return iVar;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // o1.j
    public List<String> d() {
        n0 d10 = n0.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f34887a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34887a, d10, false, null);
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

    @Override // o1.j
    public void e(String str, int i10) {
        this.f34887a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34889c.acquire();
        if (str == null) {
            acquire.P0(1);
        } else {
            acquire.p0(1, str);
        }
        acquire.A0(2, i10);
        this.f34887a.beginTransaction();
        try {
            acquire.v();
            this.f34887a.setTransactionSuccessful();
        } finally {
            this.f34887a.endTransaction();
            this.f34889c.release(acquire);
        }
    }

    @Override // o1.j
    public void f(String str) {
        this.f34887a.assertNotSuspendingTransaction();
        z0.k acquire = this.f34890d.acquire();
        if (str == null) {
            acquire.P0(1);
        } else {
            acquire.p0(1, str);
        }
        this.f34887a.beginTransaction();
        try {
            acquire.v();
            this.f34887a.setTransactionSuccessful();
        } finally {
            this.f34887a.endTransaction();
            this.f34890d.release(acquire);
        }
    }

    @Override // o1.j
    public i g(m mVar) {
        return j.a.a(this, mVar);
    }
}
