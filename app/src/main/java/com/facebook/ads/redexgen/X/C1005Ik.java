package com.facebook.ads.redexgen.X;

import com.inmobi.media.fq;

/* renamed from: com.facebook.ads.redexgen.X.Ik  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1005Ik {
    public static String[] A04 = {"c84vrcH31LBgkMTCK1bohHlXVMnz9AJR", "d1OdysF2oEJNIHjT9033ROKyCX5j9bI3", "fxcqndjlyXUHbVpCK9jm", "aT6eQk8J7bmxuuGVWtHexoeTGFRtLCio", "ywK9OdvkymoDgjlaSqX1MXgGISTKD1G", "kvGKIZl1lyVjOHyD1SwfLq7Qy0hyNYJA", "P5ZowT1yJlaZidguBbmn", "kEUPdIGxbWMHKqV30QNAKk8CqZCFjcZl"};
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C1005Ik(byte[] bArr, int i10, int i11) {
        A08(bArr, i10, i11);
    }

    private int A00() {
        int i10 = 0;
        while (!A0A()) {
            i10++;
        }
        int i11 = (1 << i10) - 1;
        if (A04[5].charAt(7) != 'Z') {
            String[] strArr = A04;
            strArr[1] = "EO6sj55N530JbeetbwPxyBKxcCLP9BzL";
            strArr[0] = "oyZlo8wPjIkpHiFdOrp6pSDhzRhw9ZCk";
            return i11 + (i10 > 0 ? A05(i10) : 0);
        }
        throw new RuntimeException();
    }

    private void A01() {
        int i10;
        int i11 = this.A02;
        IK.A04(i11 >= 0 && (i11 < (i10 = this.A01) || (i11 == i10 && this.A00 == 0)));
    }

    private boolean A02(int i10) {
        if (2 <= i10 && i10 < this.A01) {
            byte[] bArr = this.A03;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final int A03() {
        int A00 = A00();
        return (A00 % 2 == 0 ? -1 : 1) * ((A00 + 1) / 2);
    }

    public final int A04() {
        return A00();
    }

    public final int A05(int i10) {
        int i11;
        int i12 = 0;
        this.A00 += i10;
        while (true) {
            i11 = this.A00;
            if (i11 <= 8) {
                break;
            }
            this.A00 = i11 - 8;
            byte[] bArr = this.A03;
            int i13 = this.A02;
            i12 |= (bArr[i13] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << this.A00;
            if (!A02(i13 + 1)) {
                r4 = 1;
            }
            this.A02 = i13 + r4;
        }
        byte[] bArr2 = this.A03;
        int i14 = this.A02;
        int i15 = (i12 | ((bArr2[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11))) & ((-1) >>> (32 - i10));
        if (i11 == 8) {
            this.A00 = 0;
            this.A02 = i14 + (A02(i14 + 1) ? 2 : 1);
        }
        A01();
        String[] strArr = A04;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[1] = "VwcsjLhlZd9I2ct9XMdPqerwWVhD9SnY";
        strArr2[0] = "SEOCmBzyD2oxYau0L8QhU7fYZrlA9WRm";
        return i15;
    }

    public final void A06() {
        int i10 = this.A00 + 1;
        this.A00 = i10;
        if (i10 == 8) {
            this.A00 = 0;
            int i11 = this.A02;
            this.A02 = i11 + (A02(i11 + 1) ? 2 : 1);
        }
        A01();
    }

    public final void A07(int numBytes) {
        int i10 = this.A02;
        int i11 = numBytes / 8;
        this.A02 += i11;
        this.A00 += numBytes - (i11 * 8);
        int i12 = this.A00;
        if (i12 > 7) {
            this.A02++;
            this.A00 = i12 - 8;
        }
        while (true) {
            i10++;
            int i13 = this.A02;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[2].length()) {
                break;
            }
            String[] strArr2 = A04;
            strArr2[7] = "16ru2e8lXVuKccLj62CTuGGODJDTLMLs";
            strArr2[3] = "ss2rTXlJnNbrcKU9GLjWVNttz382myoQ";
            if (i10 <= i13) {
                boolean A02 = A02(i10);
                String[] strArr3 = A04;
                if (strArr3[6].length() != strArr3[2].length()) {
                    break;
                }
                String[] strArr4 = A04;
                strArr4[6] = "8iP0ukDWZhsNH03XWb9d";
                strArr4[2] = "2ETrOFK8hCpKH2QuP6pQ";
                if (A02) {
                    this.A02++;
                    i10 += 2;
                }
            } else {
                A01();
                return;
            }
        }
        throw new RuntimeException();
    }

    public final void A08(byte[] bArr, int i10, int i11) {
        this.A03 = bArr;
        this.A02 = i10;
        this.A01 = i11;
        this.A00 = 0;
        A01();
    }

    public final boolean A09() {
        int initialBitOffset = this.A02;
        int leadingZeros = this.A00;
        int i10 = 0;
        while (this.A02 < this.A01 && !A0A()) {
            i10++;
        }
        boolean z10 = this.A02 == this.A01;
        this.A02 = initialBitOffset;
        this.A00 = leadingZeros;
        if (A04[5].charAt(7) != 'Z') {
            String[] strArr = A04;
            strArr[7] = "4CnifSrgKpd7e7K0x8WVIkfErouhzSPT";
            strArr[3] = "4ZydgevgZqNlOfL3PtmcBBhuPOTZ7C4b";
            return !z10 && A0B((i10 * 2) + 1);
        }
        throw new RuntimeException();
    }

    public final boolean A0A() {
        boolean z10 = (this.A03[this.A02] & (128 >> this.A00)) != 0;
        A06();
        return z10;
    }

    public final boolean A0B(int numBytes) {
        int newByteOffset = this.A02;
        int i10 = numBytes / 8;
        int i11 = this.A02 + i10;
        int i12 = (this.A00 + numBytes) - (i10 * 8);
        if (i12 > 7) {
            i11++;
            i12 -= 8;
        }
        int i13 = newByteOffset + 1;
        while (i13 <= i11 && i11 < this.A01) {
            if (A02(i13)) {
                i11++;
                i13 += 2;
            }
            i13++;
        }
        int newBitOffset = this.A01;
        if (i11 >= newBitOffset) {
            return i11 == newBitOffset && i12 == 0;
        }
        return true;
    }
}
