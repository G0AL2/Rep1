package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public final class FM extends AbstractC1285Tk<C1631cw> {
    public static String[] A00 = {"ByMq6MLqhjUJsdWB3RBIp", "zuOr3", "msyHKBX3wHVeYE5obxbctQprcgEzI02t", "I3sOgeRwcNYGF4oixOV5Q17", "dcB", "ibtCqc8qysdz0E5AMIDmPhuL1XZA", "mNtKCg4kzaH6sXUtb2oDuqx2", "ObFvkEusatMYzjWaq72f4FkWXHrQjerH"};

    public FM(C1631cw c1631cw) {
        super(c1631cw);
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A06() {
        C1400Xy c1400Xy;
        Handler handler;
        Runnable runnable;
        C1631cw A07 = A07();
        if (A07 == null) {
            return;
        }
        c1400Xy = A07.A08;
        String[] strArr = A00;
        if (strArr[3].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        A00[5] = "SiVLKh";
        if (C1103Mj.A02(c1400Xy)) {
            A07.A07();
            return;
        }
        handler = A07.A05;
        runnable = A07.A0C;
        handler.postDelayed(runnable, 5000L);
    }
}
