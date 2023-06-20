package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class WL extends DY {
    public static byte[] A01;
    public static String[] A02 = {"nsRNjMJCINzttEcy6gRH", "iLBhdjTg3OKb8ywbNnp8pgqKlG", "RImCZo78JGnCd", "MQCM5Bft3v5AKfjxIzCtQe6XKQuHj9cI", "eIxys3n1xHnYXLY6XFR5ULs5u2Lm7Uxd", "C5r06ne3nHFGIipq1ktKTjeYxK5IlnNR", "VUYnCtCcQXjB1sQxVfFNmblLRJpOLxas", "bjyChy1rj1vSDo4qa0ykMaouAr"};
    public static final int A03;
    public static final byte[] A04;
    public boolean A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{119, -104, -99, -101, -59, -39, -56, -51, -45, -109, -45, -44, -39, -41};
    }

    static {
        A02();
        A03 = C1020Iz.A08(A01(0, 4, 33));
        A04 = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    }

    private long A00(byte[] bArr) {
        int i10;
        int i11;
        int i12 = bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i13 = i12 & 3;
        if (i13 == 0) {
            i10 = 1;
        } else if (i13 != 1 && i13 != 2) {
            i10 = bArr[1] & 63;
        } else {
            i10 = 2;
        }
        int i14 = i12 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i11 = IronSourceConstants.IS_INSTANCE_NOT_FOUND << i15;
        } else if (i14 >= 12) {
            int length = i15 & 1;
            i11 = 10000 << length;
        } else {
            String[] strArr = A02;
            String str = strArr[0];
            String str2 = strArr[2];
            int length2 = str.length();
            int length3 = str2.length();
            if (length2 == length3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[0] = "5xugLvQ3PcyvpmKVP2TF";
            strArr2[2] = "0gGe0pFYIsJYF";
            if (i15 == 3) {
                i11 = 60000;
            } else {
                i11 = 10000 << i15;
            }
        }
        return i10 * i11;
    }

    private void A03(List<byte[]> list, int i10) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((i10 * 1000000000) / 48000).array());
    }

    public static boolean A04(C1004Ij c1004Ij) {
        int A042 = c1004Ij.A04();
        byte[] bArr = A04;
        if (A042 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c1004Ij.A0c(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, A04);
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final long A07(C1004Ij c1004Ij) {
        return A04(A00(c1004Ij.A00));
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final void A09(boolean z10) {
        super.A09(z10);
        if (z10) {
            this.A00 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.DY
    public final boolean A0A(C1004Ij c1004Ij, long j10, DX dx) throws IOException, InterruptedException {
        if (!this.A00) {
            byte[] copyOf = Arrays.copyOf(c1004Ij.A00, c1004Ij.A07());
            int i10 = copyOf[9] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
            int channelCount = (copyOf[11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            A03(arrayList, channelCount | (copyOf[10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED));
            A03(arrayList, 3840);
            dx.A00 = Format.A07(null, A01(4, 10, 93), null, -1, -1, i10, 48000, arrayList, null, 0, null);
            this.A00 = true;
            return true;
        }
        boolean z10 = c1004Ij.A08() == A03;
        c1004Ij.A0Y(0);
        return z10;
    }
}
