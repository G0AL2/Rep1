package j8;

import android.os.Bundle;
import j8.g;

/* compiled from: PercentageRating.java */
/* loaded from: classes2.dex */
public final class l2 extends u2 {

    /* renamed from: c */
    public static final g.a<l2> f32613c = new g.a() { // from class: j8.k2
        @Override // j8.g.a
        public final g a(Bundle bundle) {
            return l2.d(bundle);
        }
    };

    /* renamed from: b */
    private final float f32614b;

    public l2() {
        this.f32614b = -1.0f;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ l2 d(Bundle bundle) {
        return e(bundle);
    }

    public static l2 e(Bundle bundle) {
        ea.a.a(bundle.getInt(c(0), -1) == 1);
        float f10 = bundle.getFloat(c(1), -1.0f);
        return f10 == -1.0f ? new l2() : new l2(f10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof l2) && this.f32614b == ((l2) obj).f32614b;
    }

    public int hashCode() {
        return ib.i.b(Float.valueOf(this.f32614b));
    }

    public l2(float f10) {
        ea.a.b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f32614b = f10;
    }
}
