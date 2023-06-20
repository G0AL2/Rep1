package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class UQ implements OF {
    public static String[] A01 = {"PnhhxO44eyGR", "6RYeLXmAClA1SiGKn201px", "WqNcg2MFF", "kFMGwY5yNNV", "mQRpAL1oxGJgw", "Eqf6jMIzeI3tCjJb", "9imsVe3tjkVzhTosgYrmf1lKW7QE2MSM", "NRYl8cTHkwcGHXULnCD2cakkWnkUWd4e"};
    public final /* synthetic */ UN A00;

    public UQ(UN un) {
        this.A00 = un;
    }

    @Override // com.facebook.ads.redexgen.X.OF
    public final void AAx(boolean z10) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        InterfaceC1045Jy interfaceC1045Jy;
        InterfaceC1045Jy interfaceC1045Jy2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z10);
        atomicBoolean2 = this.A00.A0E;
        if (atomicBoolean2.get()) {
            interfaceC1045Jy = this.A00.A02;
            if (interfaceC1045Jy != null) {
                UN un = this.A00;
                String[] strArr = A01;
                if (strArr[5].length() == strArr[3].length()) {
                    throw new RuntimeException();
                }
                A01[2] = "moHDWw2Q1";
                interfaceC1045Jy2 = un.A02;
                interfaceC1045Jy2.ABk(z10);
            }
        }
    }
}
