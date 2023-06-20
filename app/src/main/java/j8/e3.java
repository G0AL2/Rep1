package j8;

import android.os.Bundle;
import j8.g;

/* compiled from: StarRating.java */
/* loaded from: classes2.dex */
public final class e3 extends u2 {

    /* renamed from: d */
    public static final g.a<e3> f32383d = new g.a() { // from class: j8.d3
        @Override // j8.g.a
        public final g a(Bundle bundle) {
            return e3.d(bundle);
        }
    };

    /* renamed from: b */
    private final int f32384b;

    /* renamed from: c */
    private final float f32385c;

    public e3(int i10) {
        ea.a.b(i10 > 0, "maxStars must be a positive integer");
        this.f32384b = i10;
        this.f32385c = -1.0f;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ e3 d(Bundle bundle) {
        return e(bundle);
    }

    public static e3 e(Bundle bundle) {
        ea.a.a(bundle.getInt(c(0), -1) == 2);
        int i10 = bundle.getInt(c(1), 5);
        float f10 = bundle.getFloat(c(2), -1.0f);
        if (f10 == -1.0f) {
            return new e3(i10);
        }
        return new e3(i10, f10);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e3) {
            e3 e3Var = (e3) obj;
            return this.f32384b == e3Var.f32384b && this.f32385c == e3Var.f32385c;
        }
        return false;
    }

    public int hashCode() {
        return ib.i.b(Integer.valueOf(this.f32384b), Float.valueOf(this.f32385c));
    }

    public e3(int i10, float f10) {
        boolean z10 = true;
        ea.a.b(i10 > 0, "maxStars must be a positive integer");
        ea.a.b((f10 < 0.0f || f10 > ((float) i10)) ? false : false, "starRating is out of range [0, maxStars]");
        this.f32384b = i10;
        this.f32385c = f10;
    }
}
