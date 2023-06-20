package y0;

import qe.k;

/* compiled from: StringUtil.kt */
/* loaded from: classes.dex */
public final class d {
    public static final void a(StringBuilder sb2, int i10) {
        k.f(sb2, "builder");
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("?");
            if (i11 < i10 - 1) {
                sb2.append(",");
            }
        }
    }

    public static final StringBuilder b() {
        return new StringBuilder();
    }
}
