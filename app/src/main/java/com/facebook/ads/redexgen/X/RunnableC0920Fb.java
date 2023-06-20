package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Fb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0920Fb implements Runnable {
    public static String[] A02 = {"WoRssMEMKAHHv5eOYWv6bcyCNlOXOf", "pA2", "3fT7OOiQOTO0YPgLHZKt2Q997Hb2Xix9", "WvgPUzUWGb7Do3xsV3", "Ec3vTQmgAcMNirmUvkhwoL1JefVS29Et", "cLkVqjW9ihOrHUtkcRLXNZqcrrO72e", "NZCcSFELY0AlwKVNvcWKAmZ3Ywu7Rk3n", "YvU"};
    public final /* synthetic */ C0930Fl A00;
    public final /* synthetic */ InterfaceC0933Fo A01;

    public RunnableC0920Fb(C0930Fl c0930Fl, InterfaceC0933Fo interfaceC0933Fo) {
        this.A00 = c0930Fl;
        this.A01 = interfaceC0933Fo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (L0.A02(this)) {
            return;
        }
        try {
            this.A01.ABU(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            L0.A00(th, this);
            if (A02[4].charAt(31) != 't') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "YLN";
            strArr[1] = "t0z";
        }
    }
}
