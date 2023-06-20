package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.3P  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3P {
    public static String[] A01 = {"el7YtyQobuGYp8qUnEWwGAo9eb5IMR8f", "BjlmtcQqBka41jhChDLZKaESgBphWA9m", "aKAY7r1GVGPP18xn5ioe", "SajdHZC8", "nRs3vifuwuv", "vQYmc1GWKj3CI1v3wMvKFH0VmcpB3A8S", "tuFyi1rHy9z46G0g3HP9J8Pe4WgIo7s9", "jDUjvWDGqsgivCcWfJbzlnhujFfNRoy6"};
    public final Object A00;

    public C3P(Object obj) {
        this.A00 = obj;
    }

    public static C3P A00(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C3P(obj);
    }

    public static Object A01(C3P c3p) {
        if (c3p == null) {
            return null;
        }
        return c3p.A00;
    }

    public final int A02() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public final int A03() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public final int A04() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetRight();
        }
        return 0;
    }

    public final int A05() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.A00).getSystemWindowInsetTop();
        }
        return 0;
    }

    public final C3P A06(int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new C3P(((WindowInsets) this.A00).replaceSystemWindowInsets(i10, i11, i12, i13));
        }
        return null;
    }

    public final boolean A07() {
        if (Build.VERSION.SDK_INT >= 21) {
            Object obj = this.A00;
            if (A01[7].charAt(25) != 'F') {
                throw new RuntimeException();
            }
            A01[7] = "MrGsAgnRdViYEdRwgZNSAOYKXFurzaLs";
            return ((WindowInsets) obj).isConsumed();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3P c3p = (C3P) obj;
        Object obj2 = this.A00;
        return obj2 == null ? c3p.A00 == null : obj2.equals(c3p.A00);
    }

    public final int hashCode() {
        Object obj = this.A00;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
