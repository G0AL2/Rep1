package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: com.facebook.ads.redexgen.X.38  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass38 {
    public static final AnonymousClass37 A00;

    static {
        if (Build.VERSION.SDK_INT >= 26) {
            A00 = new C0O() { // from class: com.facebook.ads.redexgen.X.04
            };
        } else if (Build.VERSION.SDK_INT >= 24) {
            A00 = new C0O();
        } else if (Build.VERSION.SDK_INT >= 23) {
            A00 = new C0Y();
        } else if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C05660a();
        } else if (Build.VERSION.SDK_INT >= 19) {
            A00 = new C05690d();
        } else if (Build.VERSION.SDK_INT >= 18) {
            A00 = new C05971g();
        } else if (Build.VERSION.SDK_INT >= 17) {
            A00 = new C3W();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new FI();
        } else if (Build.VERSION.SDK_INT >= 15) {
            A00 = new C1600cO();
        } else {
            A00 = new AnonymousClass37();
        }
    }

    public static int A00(View view) {
        return A00.A03(view);
    }

    public static int A01(View view) {
        return A00.A04(view);
    }

    public static int A02(View view) {
        return A00.A05(view);
    }

    public static int A03(View view) {
        return A00.A06(view);
    }

    public static Display A04(@NonNull View view) {
        return A00.A07(view);
    }

    public static C3P A05(View view, C3P c3p) {
        return A00.A08(view, c3p);
    }

    public static C3P A06(View view, C3P c3p) {
        return A00.A09(view, c3p);
    }

    public static void A07(View view) {
        A00.A0A(view);
    }

    public static void A08(@NonNull View view) {
        A00.A0B(view);
    }

    public static void A09(View view, int i10) {
        A00.A0C(view, i10);
    }

    public static void A0A(View view, Drawable drawable) {
        A00.A0D(view, drawable);
    }

    public static void A0B(View view, C06282m c06282m) {
        A00.A0E(view, c06282m);
    }

    public static void A0C(View view, InterfaceC06342s interfaceC06342s) {
        A00.A0F(view, interfaceC06342s);
    }

    public static void A0D(View view, Runnable runnable) {
        A00.A0G(view, runnable);
    }

    public static void A0E(View view, Runnable runnable, long j10) {
        A00.A0H(view, runnable, j10);
    }

    public static boolean A0F(View view) {
        return A00.A0K(view);
    }

    public static boolean A0G(View view) {
        return A00.A0I(view);
    }

    public static boolean A0H(View view) {
        return A00.A0J(view);
    }
}
