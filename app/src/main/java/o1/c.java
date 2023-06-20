package o1;

import android.database.Cursor;
import androidx.room.k0;
import androidx.room.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f34875a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.i<o1.a> f34876b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.i<o1.a> {
        a(c cVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.i
        /* renamed from: a */
        public void bind(z0.k kVar, o1.a aVar) {
            if (aVar.b() == null) {
                kVar.P0(1);
            } else {
                kVar.p0(1, aVar.b());
            }
            if (aVar.a() == null) {
                kVar.P0(2);
            } else {
                kVar.p0(2, aVar.a());
            }
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public c(k0 k0Var) {
        this.f34875a = k0Var;
        this.f34876b = new a(this, k0Var);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    @Override // o1.b
    public List<String> a(String str) {
        n0 d10 = n0.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34875a.assertNotSuspendingTransaction();
        Cursor b10 = y0.b.b(this.f34875a, d10, false, null);
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

    @Override // o1.b
    public boolean b(String str) {
        n0 d10 = n0.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34875a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor b10 = y0.b.b(this.f34875a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            d10.release();
        }
    }

    @Override // o1.b
    public void c(o1.a aVar) {
        this.f34875a.assertNotSuspendingTransaction();
        this.f34875a.beginTransaction();
        try {
            this.f34876b.insert((androidx.room.i<o1.a>) aVar);
            this.f34875a.setTransactionSuccessful();
        } finally {
            this.f34875a.endTransaction();
        }
    }

    @Override // o1.b
    public boolean d(String str) {
        n0 d10 = n0.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34875a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor b10 = y0.b.b(this.f34875a, d10, false, null);
        try {
            if (b10.moveToFirst()) {
                z10 = b10.getInt(0) != 0;
            }
            return z10;
        } finally {
            b10.close();
            d10.release();
        }
    }
}
