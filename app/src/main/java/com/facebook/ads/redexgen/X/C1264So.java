package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* renamed from: com.facebook.ads.redexgen.X.So  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1264So implements O0 {
    public final /* synthetic */ C1262Sm A00;

    public C1264So(C1262Sm c1262Sm) {
        this.A00 = c1262Sm;
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABg(String str) {
        C1139Nt c1139Nt;
        C1139Nt c1139Nt2;
        this.A00.A0I = false;
        c1139Nt = this.A00.A0C;
        c1139Nt.setProgress(100);
        c1139Nt2 = this.A00.A0C;
        MS.A0N(c1139Nt2, 8);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABi(String str) {
        C1139Nt c1139Nt;
        C1138Ns c1138Ns;
        this.A00.A0I = true;
        c1139Nt = this.A00.A0C;
        MS.A0N(c1139Nt, 0);
        c1138Ns = this.A00.A0B;
        c1138Ns.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void ABz(int i10) {
        boolean z10;
        C1139Nt c1139Nt;
        z10 = this.A00.A0I;
        if (z10) {
            c1139Nt = this.A00.A0C;
            c1139Nt.setProgress(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final void AC4(String str) {
        C1138Ns c1138Ns;
        c1138Ns = this.A00.A0B;
        c1138Ns.setTitle(str);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    @RequiresApi(api = 26)
    public final void AC6() {
        C1155Oj c1155Oj;
        c1155Oj = this.A00.A0E;
        c1155Oj.A09().AAF(14);
    }
}
