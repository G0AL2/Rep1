package j8;

import android.os.Bundle;
import j8.g;

/* compiled from: ThumbRating.java */
/* loaded from: classes2.dex */
public final class i3 extends u2 {

    /* renamed from: d */
    public static final g.a<i3> f32487d = new g.a() { // from class: j8.h3
        @Override // j8.g.a
        public final g a(Bundle bundle) {
            return i3.d(bundle);
        }
    };

    /* renamed from: b */
    private final boolean f32488b;

    /* renamed from: c */
    private final boolean f32489c;

    public i3() {
        this.f32488b = false;
        this.f32489c = false;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ i3 d(Bundle bundle) {
        return e(bundle);
    }

    public static i3 e(Bundle bundle) {
        ea.a.a(bundle.getInt(c(0), -1) == 3);
        if (bundle.getBoolean(c(1), false)) {
            return new i3(bundle.getBoolean(c(2), false));
        }
        return new i3();
    }

    public boolean equals(Object obj) {
        if (obj instanceof i3) {
            i3 i3Var = (i3) obj;
            return this.f32489c == i3Var.f32489c && this.f32488b == i3Var.f32488b;
        }
        return false;
    }

    public int hashCode() {
        return ib.i.b(Boolean.valueOf(this.f32488b), Boolean.valueOf(this.f32489c));
    }

    public i3(boolean z10) {
        this.f32488b = true;
        this.f32489c = z10;
    }
}
