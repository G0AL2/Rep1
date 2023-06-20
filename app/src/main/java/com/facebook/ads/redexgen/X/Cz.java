package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class Cz {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(InterfaceC0861Cd interfaceC0861Cd, int i10, int i11) throws IOException, InterruptedException {
        if (!this.A04) {
            interfaceC0861Cd.AD7(this.A05, 0, 10);
            interfaceC0861Cd.AEB();
            if (BA.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i10;
            this.A01 = 0;
        }
        this.A01 += i11;
    }

    public final void A02(Cy cy) {
        if (this.A04 && this.A02 > 0) {
            cy.A0W.AEH(this.A03, this.A00, this.A01, 0, cy.A0V);
            this.A02 = 0;
        }
    }

    public final void A03(Cy cy, long j10) {
        if (!this.A04) {
            return;
        }
        int i10 = this.A02;
        this.A02 = i10 + 1;
        if (i10 == 0) {
            this.A03 = j10;
        }
        if (this.A02 < 16) {
            return;
        }
        cy.A0W.AEH(this.A03, this.A00, this.A01, 0, cy.A0V);
        this.A02 = 0;
    }
}
