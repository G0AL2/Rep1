package o1;

import android.database.Cursor;
import androidx.room.k0;
import androidx.room.n0;
import androidx.room.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o1.z;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class a0 implements z {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f34868a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.i<y> f34869b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.i<y> {
        a(a0 a0Var, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.i
        /* renamed from: a */
        public void bind(z0.k kVar, y yVar) {
            if (yVar.a() == null) {
                kVar.P0(1);
            } else {
                kVar.p0(1, yVar.a());
            }
            if (yVar.b() == null) {
                kVar.P0(2);
            } else {
                kVar.p0(2, yVar.b());
            }
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends t0 {
        b(a0 a0Var, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public a0(k0 k0Var) {
        this.f34868a = k0Var;
        this.f34869b = new a(this, k0Var);
        new b(this, k0Var);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    @Override // o1.z
    public void a(y yVar) {
        this.f34868a.assertNotSuspendingTransaction();
        this.f34868a.beginTransaction();
        try {
            this.f34869b.insert((androidx.room.i<y>) yVar);
            this.f34868a.setTransactionSuccessful();
        } finally {
            this.f34868a.endTransaction();
        }
    }

    @Override // o1.z
    public List<String> b(String str) {
        n0 d10 = n0.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34868a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34868a, d10, false, null);
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

    @Override // o1.z
    public void c(String str, Set<String> set) {
        z.a.a(this, str, set);
    }
}
