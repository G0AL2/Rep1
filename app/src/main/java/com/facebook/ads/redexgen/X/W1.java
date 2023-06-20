package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.inmobi.media.fq;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class W1 implements InterfaceC0860Cc {
    public static String[] A08 = {"", "mExdGVP0maPlz", "mtU4GW9lJGPRgwi7WTtJ47xTDMOD9Jvz", "mnVK2jaR5CYO63Y95SEKprVffrLm5k0s", "WHnhbYArFQVibafDHBFVvoYN0aOa9WUH", "bzekXst0bt0AdcZvIiwJXkkJcIHRgIjU", "gyTL2jV1VgKAzlNybmW", "q"};
    public static final InterfaceC0863Cf A09 = new W2();
    public long A00;
    public InterfaceC0862Ce A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C0886Dp> A05;
    public final C1004Ij A06;
    public final C1016Iv A07;

    public W1() {
        this(new C1016Iv(0L));
    }

    public W1(C1016Iv c1016Iv) {
        this.A07 = c1016Iv;
        this.A06 = new C1004Ij(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void A8I(InterfaceC0862Ce interfaceC0862Ce) {
        this.A01 = interfaceC0862Ce;
        interfaceC0862Ce.AEM(new C1366Wq(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
        r10.AEt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
        r9.A06.A0W(r5);
        r10.readFully(r9.A06.A00, 0, r5);
        r9.A06.A0Y(6);
        r4.A03(r9.A06);
        r1 = r9.A06;
        r1.A0X(r1.A05());
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int ADX(com.facebook.ads.redexgen.X.InterfaceC0861Cd r10, com.facebook.ads.redexgen.X.C0865Cj r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W1.ADX(com.facebook.ads.redexgen.X.Cd, com.facebook.ads.redexgen.X.Cj):int");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final void AEL(long j10, long j11) {
        this.A07.A08();
        for (int i10 = 0; i10 < this.A05.size(); i10++) {
            this.A05.valueAt(i10).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0860Cc
    public final boolean AEv(InterfaceC0861Cd interfaceC0861Cd) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        interfaceC0861Cd.AD7(bArr, 0, 14);
        if (442 == (((bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            if (A08[7].length() != 3) {
                A08[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
                interfaceC0861Cd.A3K(bArr[13] & 7);
                interfaceC0861Cd.AD7(bArr, 0, 3);
                return 1 == ((bArr[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | (((bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8)));
            }
            throw new RuntimeException();
        }
        return false;
    }
}
