package j8;

import android.os.Bundle;
import j8.g;

/* compiled from: Rating.java */
/* loaded from: classes2.dex */
public abstract class u2 implements g {

    /* renamed from: a */
    public static final g.a<u2> f32809a = new g.a() { // from class: j8.t2
        @Override // j8.g.a
        public final g a(Bundle bundle) {
            return u2.a(bundle);
        }
    };

    public static /* synthetic */ u2 a(Bundle bundle) {
        return b(bundle);
    }

    public static u2 b(Bundle bundle) {
        int i10 = bundle.getInt(c(0), -1);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return i3.f32487d.a(bundle);
                    }
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Unknown RatingType: ");
                    sb2.append(i10);
                    throw new IllegalArgumentException(sb2.toString());
                }
                return e3.f32383d.a(bundle);
            }
            return l2.f32613c.a(bundle);
        }
        return s1.f32792d.a(bundle);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }
}
