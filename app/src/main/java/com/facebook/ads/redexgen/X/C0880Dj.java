package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0880Dj {
    public static String[] A04 = {"fOExADNBYdlDWlbdLr9FKIDbfh2Wb1rp", "7", "Qt2wlMjRQQ4qWijHKbqrgXlkTG6BMnXX", "0gfrwT7HQoixTXE6fbcieZWPZxWYDLvm", "s1cytPLymz9SSkagkEgBtQdGModclRoX", "i09lyNhAkSqFQiPYURX06", "GTgJRlsu81UpuNTgSBbivcMs7zrnCeeB", "wkZQk9aN3EzwRMfzeUqCcSppBSpZ8xUO"};
    public static final byte[] A05 = {0, 0, 1};
    public int A00;
    public int A01;
    public byte[] A02;
    public boolean A03;

    public C0880Dj(int i10) {
        this.A02 = new byte[i10];
    }

    public final void A00() {
        this.A03 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A01(byte[] bArr, int i10, int i11) {
        if (!this.A03) {
            return;
        }
        int i12 = i11 - i10;
        byte[] bArr2 = this.A02;
        int length = bArr2.length;
        int i13 = this.A00;
        if (length < i13 + i12) {
            this.A02 = Arrays.copyOf(bArr2, (i13 + i12) * 2);
        }
        System.arraycopy(bArr, i10, this.A02, this.A00, i12);
        this.A00 += i12;
    }

    public final boolean A02(int i10, int i11) {
        if (this.A03) {
            this.A00 -= i11;
            int i12 = this.A01;
            String[] strArr = A04;
            if (strArr[7].charAt(17) == strArr[2].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "emegRlYzfUt2VPGJUiIYNrPqCOpIpCO8";
            strArr2[2] = "fTMWdmHNSPpkmFXnKlnCifd3toy29TVe";
            if (i12 == 0) {
                if (A04[0].charAt(20) != 'K') {
                    throw new RuntimeException();
                }
                A04[1] = "E";
                if (i10 == 181) {
                    this.A01 = this.A00;
                }
            }
            this.A03 = false;
            String[] strArr3 = A04;
            if (strArr3[3].charAt(31) != strArr3[4].charAt(31)) {
                A04[1] = "H";
                return true;
            }
            throw new RuntimeException();
        } else if (i10 == 179) {
            this.A03 = true;
        }
        byte[] bArr = A05;
        A01(bArr, 0, bArr.length);
        return false;
    }
}
