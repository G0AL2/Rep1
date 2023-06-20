package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XA implements InterfaceC0835Bc {
    public static byte[] A01;
    public final /* synthetic */ X9 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{44, 32, 114, 70, 87, 90, 92, 103, 65, 82, 80, 88, 67, 109, 100, 101, 120, 99, 100, 109, 42, 99, 103, 122, 101, 121, 121, 99, 104, 102, 115, 42, 102, 107, 120, 109, 111, 42, 107, Byte.MAX_VALUE, 110, 99, 101, 42, 102, 107, 126, 111, 100, 105, 115, 48, 42, 33, 2, 7, 0, 27, 29, 7, 1, 82, 19, 7, 22, 27, 29, 82, 6, 27, 31, 23, 1, 6, 19, 31, 2, 82, 90, 20, 0, 19, 31, 23, 82, 2, 29, 1, 27, 6, 27, 29, 28, 82, 31, 27, 1, 31, 19, 6, 17, 26, 91, 72, 82, 88, 123, 126, 121, 98, 100, 126, 120, 43, 106, 126, 111, 98, 100, 43, Byte.MAX_VALUE, 98, 102, 110, 120, Byte.MAX_VALUE, 106, 102, 123, 43, 35, 120, 114, 120, Byte.MAX_VALUE, 110, 102, 43, 104, 103, 100, 104, 96, 43, 102, 98, 120, 102, 106, Byte.MAX_VALUE, 104, 99, 34, 49, 43};
    }

    public XA(X9 x92) {
        this.A00 = x92;
    }

    public /* synthetic */ XA(X9 x92, C0838Bf c0838Bf) {
        this(x92);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0835Bc
    public final void ABB(long j10) {
        Log.w(A00(2, 10, 37), A00(12, 41, 28) + j10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0835Bc
    public final void ABv(long j10, long j11, long j12, long j13) {
        long A03;
        long A04;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A00(53, 52, 100));
        sb2.append(j10);
        String A00 = A00(0, 2, 22);
        sb2.append(A00);
        sb2.append(j11);
        sb2.append(A00);
        sb2.append(j12);
        sb2.append(A00);
        sb2.append(j13);
        sb2.append(A00);
        A03 = this.A00.A03();
        sb2.append(A03);
        sb2.append(A00);
        A04 = this.A00.A04();
        sb2.append(A04);
        String sb3 = sb2.toString();
        if (!X9.A0q) {
            Log.w(A00(2, 10, 37), sb3);
            return;
        }
        throw new C0841Bi(sb3, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0835Bc
    public final void ACU(long j10, long j11, long j12, long j13) {
        long A03;
        long A04;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A00(105, 50, 29));
        sb2.append(j10);
        String A00 = A00(0, 2, 22);
        sb2.append(A00);
        sb2.append(j11);
        sb2.append(A00);
        sb2.append(j12);
        sb2.append(A00);
        sb2.append(j13);
        sb2.append(A00);
        A03 = this.A00.A03();
        sb2.append(A03);
        sb2.append(A00);
        A04 = this.A00.A04();
        sb2.append(A04);
        String sb3 = sb2.toString();
        if (!X9.A0q) {
            Log.w(A00(2, 10, 37), sb3);
            return;
        }
        throw new C0841Bi(sb3, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0835Bc
    public final void ACc(int i10, long j10) {
        BW bw;
        long j11;
        BW bw2;
        bw = this.A00.A0R;
        if (bw != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j11 = this.A00.A0E;
            long j12 = elapsedRealtime - j11;
            bw2 = this.A00.A0R;
            bw2.ACd(i10, j10, j12);
        }
    }
}
