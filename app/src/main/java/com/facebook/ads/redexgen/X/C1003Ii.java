package com.facebook.ads.redexgen.X;

import com.inmobi.media.fq;

/* renamed from: com.facebook.ads.redexgen.X.Ii  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1003Ii {
    public static String[] A04 = {"RHSjJGYddlOPzslamo8j", "no2wrOKISs4wdINa", "E7xZIMZbElFQthX5cbe1zXMBiqq9Oct2", "NQ4djAykaRRiHV2nkQWoiztobM3LGBfO", "EDikhWaymQH2jtWvDyx1vViO84FhvN", "TllFBKS94wZfNNX6FcczOhdwmX6snrOZ", "CS63JXje", "QpZzHKHty24GTaxrVVV4B8DIrBZ4Gw8P"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C1003Ii() {
    }

    public C1003Ii(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C1003Ii(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A02 = i10;
    }

    private void A00() {
        int i10;
        int i11 = this.A03;
        IK.A04(i11 >= 0 && (i11 < (i10 = this.A02) || (i11 == i10 && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        IK.A04(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int returnValue) {
        int i10;
        if (returnValue == 0) {
            return 0;
        }
        int i11 = 0;
        this.A01 += returnValue;
        while (true) {
            i10 = this.A01;
            if (i10 <= 8) {
                break;
            }
            this.A01 = i10 - 8;
            byte[] bArr = this.A00;
            int i12 = this.A03;
            this.A03 = i12 + 1;
            i11 |= (bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << this.A01;
        }
        byte[] bArr2 = this.A00;
        int i13 = this.A03;
        int i14 = (i11 | ((bArr2[i13] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i10))) & ((-1) >>> (32 - returnValue));
        if (i10 == 8) {
            this.A01 = 0;
            this.A03 = i13 + 1;
        }
        A00();
        return i14;
    }

    public final void A05() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A06() {
        int i10 = this.A01 + 1;
        this.A01 = i10;
        if (i10 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A07(int i10) {
        this.A03 = i10 / 8;
        this.A01 = i10 - (this.A03 * 8);
        A00();
    }

    public final void A08(int i10) {
        int i11 = i10 / 8;
        this.A03 += i11;
        this.A01 += i10 - (i11 * 8);
        int i12 = this.A01;
        if (i12 > 7) {
            this.A03++;
            this.A01 = i12 - 8;
        }
        A00();
    }

    public final void A09(int i10) {
        IK.A04(this.A01 == 0);
        this.A03 += i10;
        A00();
    }

    public final void A0A(int i10, int firstByteReadSize) {
        if (firstByteReadSize < 32) {
            i10 &= (1 << firstByteReadSize) - 1;
        }
        int min = Math.min(8 - this.A01, firstByteReadSize);
        int firstByteRightPaddingSize = this.A01;
        int i11 = (8 - firstByteRightPaddingSize) - min;
        byte[] bArr = this.A00;
        int i12 = this.A03;
        bArr[i12] = (byte) (bArr[i12] & ((65280 >> firstByteRightPaddingSize) | ((1 << i11) - 1)));
        int firstByteInputBits = bArr[i12];
        bArr[i12] = (byte) (firstByteInputBits | ((i10 >>> (firstByteReadSize - min)) << i11));
        int i13 = firstByteReadSize - min;
        int i14 = i12 + 1;
        while (i13 > 8) {
            this.A00[i14] = (byte) (i10 >>> (i13 - 8));
            i13 -= 8;
            i14++;
        }
        int currentByteIndex = 8 - i13;
        byte[] bArr2 = this.A00;
        bArr2[i14] = (byte) (bArr2[i14] & ((1 << currentByteIndex) - 1));
        int lastByteInput = i10 & ((1 << i13) - 1);
        byte b10 = (byte) (bArr2[i14] | (lastByteInput << currentByteIndex));
        if (A04[3].charAt(20) != 'i') {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[4] = "HDn8cIfTWSkx257fNKtZvpUDi4vYZW";
        strArr[6] = "YQkUGCO4";
        bArr2[i14] = b10;
        A08(firstByteReadSize);
        A00();
    }

    public final void A0B(byte[] bArr) {
        A0C(bArr, bArr.length);
    }

    public final void A0C(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i10;
    }

    public final void A0D(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.A00;
            int i13 = this.A03;
            this.A03 = i13 + 1;
            byte b10 = bArr2[i13];
            int i14 = this.A01;
            bArr[i10] = (byte) (b10 << i14);
            bArr[i10] = (byte) (((255 & bArr2[this.A03]) >> (8 - i14)) | bArr[i10]);
            i10++;
        }
        int i15 = i11 & 7;
        if (i15 != 0) {
            bArr[i12] = (byte) (bArr[i12] & (255 >> i15));
            int i16 = this.A01;
            if (i16 + i15 > 8) {
                int i17 = bArr[i12];
                byte[] bArr3 = this.A00;
                int i18 = this.A03;
                this.A03 = i18 + 1;
                bArr[i12] = (byte) (i17 | ((bArr3[i18] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << i16));
                this.A01 = i16 - 8;
            }
            this.A01 += i15;
            byte[] bArr4 = this.A00;
            int i19 = this.A03;
            int i20 = this.A01;
            bArr[i12] = (byte) (bArr[i12] | ((byte) (((255 & bArr4[i19]) >> (8 - i20)) << (8 - i15))));
            if (i20 == 8) {
                this.A01 = 0;
                this.A03 = i19 + 1;
            }
            A00();
        }
    }

    public final void A0E(byte[] bArr, int i10, int i11) {
        IK.A04(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i10, i11);
        this.A03 += i11;
        A00();
    }

    public final boolean A0F() {
        boolean z10 = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A06();
        return z10;
    }
}
