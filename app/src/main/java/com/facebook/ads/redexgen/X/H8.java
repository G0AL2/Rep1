package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class H8 {
    public static byte[] A0A;
    public static String[] A0B = {"vgym8n4g3kPlzh8iIq", "NAoY0yaTEmpVmZayfLtjrx2aw", "ggOUAOLNPEguk0iXJXBNHZqvAgJ9VjZi", "bSLHaz9YBJes6EAuclteHitymP7rzXdw", "k7dBXXWTHLUA1jWUqySLqUHdC1ziQrAg", "4aJsL2pYaVARsHZq", "XLH0fnwqDlKe4VeoBMSsI84BU", "G62i1"};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Layout.Alignment A08;
    public SpannableStringBuilder A09;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0B;
            if (strArr[2].charAt(3) == strArr[4].charAt(3)) {
                throw new RuntimeException();
            }
            A0B[7] = "dE6A8";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 82);
            i13++;
        }
    }

    public static void A02() {
        A0A = new byte[]{-32, -7, -3, -16, -18, -6, -14, -7, -12, 5, -16, -17, -85, -20, -9, -12, -14, -7, -8, -16, -7, -1, -59, -85, 11, 25, 22, 42, 40, 40, -9, 41, 25, -10, 41, 29, 32, 24, 25, 38};
    }

    static {
        A02();
    }

    public H8() {
        A0E();
    }

    private H8 A00() {
        if (this.A08 == null) {
            this.A05 = RecyclerView.UNDEFINED_DURATION;
        } else {
            int i10 = H7.A00[this.A08.ordinal()];
            if (i10 == 1) {
                this.A05 = 0;
            } else if (A0B[5].length() != 16) {
                throw new RuntimeException();
            } else {
                A0B[1] = "CkNmrc0J4D9ywVj";
                if (i10 == 2) {
                    this.A05 = 1;
                } else if (i10 != 3) {
                    Log.w(A01(24, 16, 98), A01(0, 24, 57) + this.A08);
                    this.A05 = 0;
                } else {
                    this.A05 = 2;
                }
            }
        }
        return this;
    }

    public final H8 A03(float f10) {
        this.A00 = f10;
        return this;
    }

    public final H8 A04(float f10) {
        this.A01 = f10;
        return this;
    }

    public final H8 A05(float f10) {
        this.A02 = f10;
        return this;
    }

    public final H8 A06(int i10) {
        this.A03 = i10;
        return this;
    }

    public final H8 A07(int i10) {
        this.A04 = i10;
        return this;
    }

    public final H8 A08(int i10) {
        this.A05 = i10;
        return this;
    }

    public final H8 A09(long j10) {
        this.A06 = j10;
        return this;
    }

    public final H8 A0A(long j10) {
        this.A07 = j10;
        return this;
    }

    public final H8 A0B(Layout.Alignment alignment) {
        this.A08 = alignment;
        return this;
    }

    public final H8 A0C(SpannableStringBuilder spannableStringBuilder) {
        this.A09 = spannableStringBuilder;
        return this;
    }

    public final VH A0D() {
        if (this.A01 != Float.MIN_VALUE) {
            int i10 = this.A05;
            if (A0B[5].length() != 16) {
                throw new RuntimeException();
            }
            A0B[1] = "AZWqxPkc";
            if (i10 == Integer.MIN_VALUE) {
                A00();
            }
        }
        return new VH(this.A07, this.A06, this.A09, this.A08, this.A00, this.A04, this.A03, this.A01, this.A05, this.A02);
    }

    public final void A0E() {
        this.A07 = 0L;
        this.A06 = 0L;
        this.A09 = null;
        this.A08 = null;
        this.A00 = Float.MIN_VALUE;
        this.A04 = RecyclerView.UNDEFINED_DURATION;
        this.A03 = RecyclerView.UNDEFINED_DURATION;
        this.A01 = Float.MIN_VALUE;
        this.A05 = RecyclerView.UNDEFINED_DURATION;
        this.A02 = Float.MIN_VALUE;
    }
}
