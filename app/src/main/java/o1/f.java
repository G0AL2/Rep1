package o1;

import android.database.Cursor;
import androidx.room.k0;
import androidx.room.n0;
import java.util.Collections;
import java.util.List;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final k0 f34879a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.i<d> f34880b;

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.i<d> {
        a(f fVar, k0 k0Var) {
            super(k0Var);
        }

        @Override // androidx.room.i
        /* renamed from: a */
        public void bind(z0.k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.P0(1);
            } else {
                kVar.p0(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.P0(2);
            } else {
                kVar.A0(2, dVar.b().longValue());
            }
        }

        @Override // androidx.room.t0
        public String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public f(k0 k0Var) {
        this.f34879a = k0Var;
        this.f34880b = new a(this, k0Var);
    }

    public static List<Class<?>> c() {
        return Collections.emptyList();
    }

    @Override // o1.e
    public void a(d dVar) {
        this.f34879a.assertNotSuspendingTransaction();
        this.f34879a.beginTransaction();
        try {
            this.f34880b.insert((androidx.room.i<d>) dVar);
            this.f34879a.setTransactionSuccessful();
        } finally {
            this.f34879a.endTransaction();
        }
    }

    @Override // o1.e
    public Long b(String str) {
        n0 d10 = n0.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            d10.P0(1);
        } else {
            d10.p0(1, str);
        }
        this.f34879a.assertNotSuspendingTransaction();
        Long l10 = null;
        Cursor b10 = y0.b.b(this.f34879a, d10, false, null);
        try {
            if (b10.moveToFirst() && !b10.isNull(0)) {
                l10 = Long.valueOf(b10.getLong(0));
            }
            return l10;
        } finally {
            b10.close();
            d10.release();
        }
    }
}
