package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Fg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0925Fg implements Runnable {
    public static String[] A06 = {"MFzmm2XpKtQDQZ1nrLFzIVLfypAdXqn0", "St6NP3oa8jPcs9ySqX58Qb7cq6M0Lslj", "FY6GSV0T1DmbxtheDZWAefy5bW4XMUrK", "e7zVVEHUrXPHmOTr9XrOqtCewhDOezV9", "rRe4XoYawEGGgKvf4FFgivRzu7z94IPy", "2sUcpRkbdiQEA9XQnsePPVJ2ZVsexJIi", "YygzZHUIY4dTUEusYM1qdSBaSuhDwAUc", "5Y8Iu0wedn9Jl3yvaaWMiUkpwoVz8Vqp"};
    public final /* synthetic */ C0930Fl A00;
    public final /* synthetic */ C0931Fm A01;
    public final /* synthetic */ C0932Fn A02;
    public final /* synthetic */ InterfaceC0933Fo A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public RunnableC0925Fg(C0930Fl c0930Fl, InterfaceC0933Fo interfaceC0933Fo, C0931Fm c0931Fm, C0932Fn c0932Fn, IOException iOException, boolean z10) {
        this.A00 = c0930Fl;
        this.A03 = interfaceC0933Fo;
        this.A01 = c0931Fm;
        this.A02 = c0932Fn;
        this.A04 = iOException;
        this.A05 = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A03.ABJ(this.A00.A00, this.A00.A01, this.A01, this.A02, this.A04, this.A05);
        } catch (Throwable th) {
            String[] strArr = A06;
            if (strArr[7].charAt(1) != strArr[2].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[7] = "5YuzUPqIN2qUpgzcgBPCGBub3XZtkUQJ";
            strArr2[2] = "DYAXZKj6jF9OEHVnXiKZJEzpdMmcnACr";
            L0.A00(th, this);
        }
    }
}
