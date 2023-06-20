package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Dr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0888Dr {
    public static byte[] A02;
    public final List<Format> A00;
    public final InterfaceC0870Co[] A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-91, -54, -46, -67, -56, -59, -64, 124, -65, -56, -53, -49, -63, -64, 124, -65, -67, -52, -48, -59, -53, -54, 124, -55, -59, -55, -63, 124, -48, -43, -52, -63, 124, -52, -50, -53, -46, -59, -64, -63, -64, -106, 124, -110, -95, -95, -99, -102, -108, -110, -91, -102, -96, -97, 96, -108, -106, -110, 94, 103, 97, 105, -33, -18, -18, -22, -25, -31, -33, -14, -25, -19, -20, -83, -31, -29, -33, -85, -75, -82, -74};
    }

    public C0888Dr(List<Format> list) {
        this.A00 = list;
        this.A01 = new InterfaceC0870Co[list.size()];
    }

    public final void A02(long j10, C1004Ij c1004Ij) {
        C0953Gi.A03(j10, c1004Ij, this.A01);
    }

    public final void A03(InterfaceC0862Ce interfaceC0862Ce, C0893Dw c0893Dw) {
        for (int i10 = 0; i10 < this.A01.length; i10++) {
            c0893Dw.A05();
            InterfaceC0870Co AFD = interfaceC0862Ce.AFD(c0893Dw.A03(), 3);
            Format format = this.A00.get(i10);
            String str = format.A0O;
            boolean z10 = A00(43, 19, 42).equals(str) || A00(62, 19, 119).equals(str);
            IK.A05(z10, A00(0, 43, 85) + str);
            AFD.A5V(Format.A08(format.A0M != null ? format.A0M : c0893Dw.A04(), str, null, -1, format.A0D, format.A0N, format.A03, null));
            this.A01[i10] = AFD;
        }
    }
}
