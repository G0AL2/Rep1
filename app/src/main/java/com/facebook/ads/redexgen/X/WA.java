package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WA implements InterfaceC0879Di {
    public static byte[] A06;
    public static String[] A07 = {"Jiy", "2wEJIBTa4RvP8yrIwKSodHRjo9", "akcZBAKpF", "EuZb8kUx1OZ", "XeLxT4hCbfpB8vk3L3qpbFThh9kK", "oaj", "R8TqjunyKtvNfOkCV", "nGIequV"};
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final List<C0890Dt> A04;
    public final InterfaceC0870Co[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 112, 98, 118, 103, 97, 118, 103};
    }

    static {
        A01();
    }

    public WA(List<C0890Dt> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0870Co[list.size()];
    }

    private boolean A02(C1004Ij c1004Ij, int i10) {
        if (c1004Ij.A04() == 0) {
            return false;
        }
        if (c1004Ij.A0E() != i10) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A48(C1004Ij c1004Ij) {
        InterfaceC0870Co[] interfaceC0870CoArr;
        if (this.A03) {
            if (this.A00 == 2 && !A02(c1004Ij, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c1004Ij, 0)) {
                return;
            }
            int A062 = c1004Ij.A06();
            int A04 = c1004Ij.A04();
            for (InterfaceC0870Co output : this.A05) {
                c1004Ij.A0Y(A062);
                output.AEG(c1004Ij, A04);
            }
            this.A01 += A04;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void A4V(InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        int i10 = 0;
        while (true) {
            InterfaceC0870Co[] interfaceC0870CoArr = this.A05;
            String[] strArr = A07;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "6Yign7KSgGvnaQ3UG";
            strArr2[0] = "Q7U";
            if (i10 < interfaceC0870CoArr.length) {
                C0890Dt c0890Dt = this.A04.get(i10);
                c0893Dw.A05();
                InterfaceC0870Co AFD = interfaceC0862Ce.AFD(c0893Dw.A03(), 3);
                AFD.A5V(Format.A0A(c0893Dw.A04(), A00(0, 19, 88), null, -1, 0, Collections.singletonList(c0890Dt.A02), c0890Dt.A01, null));
                this.A05[i10] = AFD;
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD3() {
        if (this.A03) {
            for (InterfaceC0870Co interfaceC0870Co : this.A05) {
                interfaceC0870Co.AEH(this.A02, 1, this.A01, 0, null);
            }
            this.A03 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AD4(long j10, boolean z10) {
        if (!z10) {
            return;
        }
        this.A03 = true;
        this.A02 = j10;
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0879Di
    public final void AEK() {
        this.A03 = false;
    }
}
