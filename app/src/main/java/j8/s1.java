package j8;

import android.os.Bundle;
import j8.g;

/* compiled from: HeartRating.java */
/* loaded from: classes2.dex */
public final class s1 extends u2 {

    /* renamed from: d */
    public static final g.a<s1> f32792d = new g.a() { // from class: j8.r1
        @Override // j8.g.a
        public final g a(Bundle bundle) {
            return s1.d(bundle);
        }
    };

    /* renamed from: b */
    private final boolean f32793b;

    /* renamed from: c */
    private final boolean f32794c;

    public s1() {
        this.f32793b = false;
        this.f32794c = false;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ s1 d(Bundle bundle) {
        return e(bundle);
    }

    public static s1 e(Bundle bundle) {
        ea.a.a(bundle.getInt(c(0), -1) == 0);
        if (bundle.getBoolean(c(1), false)) {
            return new s1(bundle.getBoolean(c(2), false));
        }
        return new s1();
    }

    public boolean equals(Object obj) {
        if (obj instanceof s1) {
            s1 s1Var = (s1) obj;
            return this.f32794c == s1Var.f32794c && this.f32793b == s1Var.f32793b;
        }
        return false;
    }

    public int hashCode() {
        return ib.i.b(Boolean.valueOf(this.f32793b), Boolean.valueOf(this.f32794c));
    }

    public s1(boolean z10) {
        this.f32793b = true;
        this.f32794c = z10;
    }
}
