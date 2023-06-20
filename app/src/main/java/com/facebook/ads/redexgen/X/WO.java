package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WO extends DY {
    public static byte[] A02;
    public static String[] A03 = {"RjYCDLb2NANzCnedRKoQM0GQ", "QX5lqyT5r1TYXy6sq6A", "sDmzmZu2Epi", "QleORMZQxcHxPLUcnR0aaEPVJ", "tBrVRsKa63H7cOEQm0uGMqa5cwtrVWSW", "PEwzIbtLaNn1pzRcppb", "zVqUyH", "ZIYCsXe3luBjtUiXTHmKPLmA"};
    public WP A00;
    public IW A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{6, 18, 3, 14, 8, 72, 1, 11, 6, 4};
    }

    static {
        A03();
    }

    private int A00(C1004Ij c1004Ij) {
        int i10 = (c1004Ij.A00[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        switch (i10) {
            case 1:
                return DownloadResource.STATUS_RUNNING;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
            case 7:
                c1004Ij.A0Z(4);
                c1004Ij.A0O();
                int A0E = i10 == 6 ? c1004Ij.A0E() : c1004Ij.A0I();
                c1004Ij.A0Y(0);
                return A0E + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static boolean A04(C1004Ij c1004Ij) {
        return c1004Ij.A04() >= 5 && c1004Ij.A0E() == 127 && c1004Ij.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final long A07(C1004Ij c1004Ij) {
        if (!A05(c1004Ij.A00)) {
            return -1L;
        }
        int A00 = A00(c1004Ij);
        String[] strArr = A03;
        if (strArr[2].length() != strArr[0].length()) {
            String[] strArr2 = A03;
            strArr2[2] = "M0DKrSciZtY";
            strArr2[0] = "bwyyvFLni8GVBC8P6VU38e20";
            return A00;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final boolean A0A(C1004Ij c1004Ij, long j10, DX dx) throws IOException, InterruptedException {
        byte[] bArr = c1004Ij.A00;
        if (this.A01 == null) {
            this.A01 = new IW(bArr, 17);
            byte[] data = Arrays.copyOfRange(bArr, 9, c1004Ij.A07());
            data[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(data);
            dx.A00 = Format.A07(null, A02(0, 10, 95), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, singletonList, null, 0, null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.A00 = new WP(this);
            this.A00.A01(c1004Ij);
            return true;
        } else if (!A05(bArr)) {
            return true;
        } else {
            WP wp = this.A00;
            if (wp != null) {
                wp.A00(j10);
                dx.A01 = this.A00;
            }
            return false;
        }
    }
}
