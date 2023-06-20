package com.facebook.ads.redexgen.X;

import android.text.Layout;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class H1 {
    public static byte[] A0E;
    public static String[] A0F = {"2rOgL1VomfnKNDiiRLuB00t6jlAsVhoY", "blpdILmRLbT", "Q9OLsQLUoF7pzn2H7oHAPqzaTlo", "IgUEYrnqH0RZ2n7W3ZHj4VjlBM", "n8fBnn3PQrJSANOZTiJccAVsijjqnybh", "oA8yODG3hMHEtxJpNaiPqvWS7JkBcEtN", "bFjb4zLN3GxOZucD", "uX14XJHhFZ25Rtk0OR0uxRe4gWkBD2Kq"};
    public float A00;
    public int A01;
    public int A03;
    public Layout.Alignment A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final H1 A0D;
    public int A06 = -1;
    public int A07 = -1;
    public int A02 = -1;
    public int A05 = -1;
    public int A04 = -1;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-54, -23, -21, -13, -17, -6, -9, -3, -10, -20, -88, -21, -9, -12, -9, -6, -88, -16, -23, -5, -88, -10, -9, -4, -88, -22, -19, -19, -10, -88, -20, -19, -18, -15, -10, -19, -20, -74, -111, -70, -71, -65, 107, -82, -70, -73, -70, -67, 107, -77, -84, -66, 107, -71, -70, -65, 107, -83, -80, -80, -71, 107, -81, -80, -79, -76, -71, -80, -81, 121};
    }

    static {
        A02();
    }

    private H1 A00(H1 h12, boolean z10) {
        if (h12 != null) {
            if (!this.A0C && h12.A0C) {
                A0B(h12.A03);
            }
            if (this.A02 == -1) {
                this.A02 = h12.A02;
            }
            if (this.A05 == -1) {
                this.A05 = h12.A05;
            }
            if (this.A09 == null) {
                this.A09 = h12.A09;
            }
            int i10 = this.A06;
            String[] strArr = A0F;
            if (strArr[3].length() != strArr[2].length()) {
                String[] strArr2 = A0F;
                strArr2[3] = "GJ9o7fjOWymoLqPdmAP22QCuE8";
                strArr2[2] = "Jy9OzO36lYOLR5YZRxirEWXZRi5";
                if (i10 == -1) {
                    this.A06 = h12.A06;
                }
                if (this.A07 == -1) {
                    this.A07 = h12.A07;
                }
                if (this.A08 == null) {
                    this.A08 = h12.A08;
                }
                if (this.A04 == -1) {
                    this.A04 = h12.A04;
                    this.A00 = h12.A00;
                }
                if (z10) {
                    boolean z11 = this.A0B;
                    if (A0F[0].charAt(7) != 'w') {
                        A0F[7] = "6vVTartgCZkYp9tsszmaRxNx1O7KVPUV";
                        if (!z11 && h12.A0B) {
                            A0A(h12.A01);
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return this;
    }

    public final float A03() {
        return this.A00;
    }

    public final int A04() {
        if (this.A0B) {
            return this.A01;
        }
        throw new IllegalStateException(A01(0, 38, 126));
    }

    public final int A05() {
        if (this.A0C) {
            return this.A03;
        }
        throw new IllegalStateException(A01(38, 32, 65));
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        if (this.A02 == -1 && this.A05 == -1) {
            return -1;
        }
        return (this.A02 == 1 ? 1 : 0) | (this.A05 == 1 ? 2 : 0);
    }

    public final Layout.Alignment A08() {
        return this.A08;
    }

    public final H1 A09(float f10) {
        this.A00 = f10;
        return this;
    }

    public final H1 A0A(int i10) {
        this.A01 = i10;
        this.A0B = true;
        return this;
    }

    public final H1 A0B(int i10) {
        IK.A04(this.A0D == null);
        this.A03 = i10;
        this.A0C = true;
        return this;
    }

    public final H1 A0C(int i10) {
        this.A04 = i10;
        return this;
    }

    public final H1 A0D(Layout.Alignment alignment) {
        this.A08 = alignment;
        return this;
    }

    public final H1 A0E(H1 h12) {
        return A00(h12, true);
    }

    public final H1 A0F(String str) {
        IK.A04(this.A0D == null);
        this.A09 = str;
        return this;
    }

    public final H1 A0G(String str) {
        this.A0A = str;
        return this;
    }

    public final H1 A0H(boolean z10) {
        IK.A04(this.A0D == null);
        this.A02 = z10 ? 1 : 0;
        return this;
    }

    public final H1 A0I(boolean z10) {
        IK.A04(this.A0D == null);
        this.A05 = z10 ? 1 : 0;
        return this;
    }

    public final H1 A0J(boolean z10) {
        IK.A04(this.A0D == null);
        this.A06 = z10 ? 1 : 0;
        return this;
    }

    public final H1 A0K(boolean z10) {
        IK.A04(this.A0D == null);
        this.A07 = z10 ? 1 : 0;
        if (A0F[7].charAt(17) != 'b') {
            A0F[5] = "92ha12DsR5eF5zJ1dM6CQDThJYn4roQH";
            return this;
        }
        throw new RuntimeException();
    }

    public final String A0L() {
        return this.A09;
    }

    public final String A0M() {
        return this.A0A;
    }

    public final boolean A0N() {
        return this.A0B;
    }

    public final boolean A0O() {
        return this.A0C;
    }

    public final boolean A0P() {
        return this.A06 == 1;
    }

    public final boolean A0Q() {
        return this.A07 == 1;
    }
}
