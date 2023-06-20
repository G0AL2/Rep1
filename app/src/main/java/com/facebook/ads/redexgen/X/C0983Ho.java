package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ho  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0983Ho extends IOException {
    public final int A00;
    public final C0979Hi A01;

    public C0983Ho(IOException iOException, C0979Hi c0979Hi, int i10) {
        super(iOException);
        this.A01 = c0979Hi;
        this.A00 = i10;
    }

    public C0983Ho(String str, C0979Hi c0979Hi, int i10) {
        super(str);
        this.A01 = c0979Hi;
        this.A00 = i10;
    }

    public C0983Ho(String str, IOException iOException, C0979Hi c0979Hi, int i10) {
        super(str, iOException);
        this.A01 = c0979Hi;
        this.A00 = i10;
    }
}
