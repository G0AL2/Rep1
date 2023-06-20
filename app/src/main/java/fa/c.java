package fa;

import ea.a0;

/* compiled from: DolbyVisionConfig.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f30207a;

    private c(int i10, int i11, String str) {
        this.f30207a = str;
    }

    public static c a(a0 a0Var) {
        String str;
        a0Var.Q(2);
        int D = a0Var.D();
        int i10 = D >> 1;
        int D2 = ((a0Var.D() >> 3) & 31) | ((D & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = D2 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(str.length() + 24 + str2.length());
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(D2);
        return new c(i10, D2, sb2.toString());
    }
}
