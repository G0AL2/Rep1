package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class AM extends Exception {
    public final int A00;
    public final int A01;

    public AM(int i10, String str, Throwable th, int i11) {
        super(str, th);
        this.A01 = i10;
        this.A00 = i11;
    }

    public static AM A00(IOException iOException) {
        return new AM(0, null, iOException, -1);
    }

    public static AM A01(Exception exc, int i10) {
        return new AM(1, null, exc, i10);
    }

    public static AM A02(RuntimeException runtimeException) {
        return new AM(2, null, runtimeException, -1);
    }
}
