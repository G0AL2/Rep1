package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W6 implements InterfaceC0879Di {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0870Co A03;
    public boolean A04;
    public final C1004Ij A05 = new C1004Ij(10);

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{25, 62, 72, 56, 54, 71, 57, 62, 67, 60, -11, 62, 67, 75, 54, 65, 62, 57, -11, 30, 25, 8, -11, 73, 54, 60, -16, 11, -38, -7, 12, 8, 11, 12, 25, 89, 104, 104, 100, 97, 91, 89, 108, 97, 103, 102, 39, 97, 92, 43};
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A48(C1004Ij c1004Ij) {
        if (!this.A04) {
            return;
        }
        int A04 = c1004Ij.A04();
        int i10 = this.A00;
        if (i10 < 10) {
            int min = Math.min(A04, 10 - i10);
            System.arraycopy(c1004Ij.A00, c1004Ij.A06(), this.A05.A00, this.A00, min);
            if (this.A00 + min == 10) {
                this.A05.A0Y(0);
                if (73 != this.A05.A0E() || 68 != this.A05.A0E() || 51 != this.A05.A0E()) {
                    Log.w(A00(26, 9, 44), A00(0, 26, 90));
                    this.A04 = false;
                    return;
                }
                this.A05.A0Z(3);
                this.A01 = this.A05.A0D() + 10;
            }
        }
        int min2 = Math.min(A04, this.A01 - this.A00);
        this.A03.AEG(c1004Ij, min2);
        this.A00 += min2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A4V(InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        c0893Dw.A05();
        this.A03 = interfaceC0862Ce.AFD(c0893Dw.A03(), 4);
        this.A03.A5V(Format.A0B(c0893Dw.A04(), A00(35, 15, 125), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD3() {
        int i10;
        if (!this.A04 || (i10 = this.A01) == 0 || this.A00 != i10) {
            return;
        }
        this.A03.AEH(this.A02, 1, i10, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD4(long j10, boolean z10) {
        if (!z10) {
            return;
        }
        this.A04 = true;
        this.A02 = j10;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AEK() {
        this.A04 = false;
    }
}
