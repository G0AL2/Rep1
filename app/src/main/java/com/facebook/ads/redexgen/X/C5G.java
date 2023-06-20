package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5G  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C5G {
    public static C0R A00(Context context, C8W c8w) {
        C1399Xx sdkContext = A07(context);
        C0U A6i = c8w.A6i(sdkContext);
        if (A6i != null) {
            return A6i.A9T();
        }
        return new C1685dq();
    }

    public static C1400Xy A01(Activity activity) {
        return new C1400Xy(activity, A08(), A00(activity, A08()));
    }

    public static C1400Xy A02(Context context) {
        return new C1400Xy(context, A08(), new C1685dq());
    }

    public static C1400Xy A03(Context context) {
        return new C1400Xy(context, A08(), A00(context, A08()));
    }

    public static C1400Xy A04(Context context) {
        if (JR.A0o(context)) {
            return new C1400Xy(context, A08(), A00(context, A08()));
        }
        return A02(context);
    }

    public static C1400Xy A05(Context context) {
        return new C1400Xy(context, A08(), A00(context, A08()));
    }

    public static C0904El A06(Context context) {
        return new C0904El(context, A08(), A08().A6i(A07(context)));
    }

    public static C1399Xx A07(Context context) {
        return new C1399Xx(context, A08());
    }

    public static synchronized C8W A08() {
        XW A02;
        synchronized (C5G.class) {
            A02 = XW.A02();
        }
        return A02;
    }
}
