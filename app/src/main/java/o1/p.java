package o1;

import android.database.Cursor;
import androidx.room.k0;
import androidx.room.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f34895a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.i<n> f34896b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.i<n> {
        a(p pVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.i
        /* renamed from: a */
        public void bind(z0.k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.P0(1);
            } else {
                kVar.p0(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.P0(2);
            } else {
                kVar.p0(2, nVar.b());
            }
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public p(k0 k0Var) {
        this.f34895a = k0Var;
        this.f34896b = new a(this, k0Var);
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }

    @Override // o1.o
    public void a(n nVar) {
        this.f34895a.assertNotSuspendingTransaction();
        this.f34895a.beginTransaction();
        try {
            this.f34896b.insert((androidx.room.i<n>) nVar);
            this.f34895a.setTransactionSuccessful();
        } finally {
            this.f34895a.endTransaction();
        }
    }

    @Override // o1.o
    public List<String> b(String str) {
        n0 d10 = n0.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34895a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34895a, d10, false, null);
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
}
