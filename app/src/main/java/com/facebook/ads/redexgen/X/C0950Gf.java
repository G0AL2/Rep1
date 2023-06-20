package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Gf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0950Gf {
    public static byte[] A0M;
    public static String[] A0N = {"GlVHckn51Vanl7Vih5Esv8zIqIMxBgkG", "Gu0mdIpKDUd91D8731Vgkf2rQInnPX0q", "LYxm1SmSDrFGckkqyRDu581qL7t4zqdr", "wLzi90m5JnQ3vlsc62fZXtuMGM726oCo", "LMTGU1aow53O5naV", "g0ywSDs0rh9PJAouvJPa5HkBHtmUXg07", "15rANKJrnjVxjOAN", "gGGCjWA2OtQnSQFuntVJeMpfRqk0w0Oj"};
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public static final int[] A0R;
    public static final int[] A0S;
    public static final int[] A0T;
    public static final int[] A0U;
    public static final int[] A0V;
    public static final int[] A0W;
    public static final int[] A0X;
    public static final boolean[] A0Y;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final List<SpannableString> A0L = new ArrayList();
    public final SpannableStringBuilder A0K = new SpannableStringBuilder();

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] ^ i12) ^ 47;
            String[] strArr = A0N;
            if (strArr[1].charAt(25) != strArr[0].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[7] = "EGk9np7aMhyDNRiub589ymbWmiZaYsnv";
            strArr2[5] = "MoHjhkGHxknM09OundQuhqQ3IVB6xBhn";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0M = new byte[]{87, 108, 103, 122, 114, 103, 97, 118, 103, 102, 34, 104, 119, 113, 118, 107, 100, 107, 97, 99, 118, 107, 109, 108, 34, 116, 99, 110, 119, 103, 56, 34};
    }

    static {
        A04();
        A0P = A01(2, 2, 2, 0);
        A0O = A01(0, 0, 0, 0);
        A0Q = A01(0, 0, 0, 3);
        A0V = new int[]{0, 0, 0, 0, 0, 2, 0};
        A0W = new int[]{0, 0, 0, 0, 0, 0, 2};
        A0X = new int[]{3, 3, 3, 3, 3, 3, 1};
        A0Y = new boolean[]{false, false, false, true, true, true, false};
        int i10 = A0O;
        int i11 = A0Q;
        A0U = new int[]{i10, i11, i10, i10, i11, i10, i10};
        A0T = new int[]{0, 1, 2, 3, 4, 3, 4};
        A0S = new int[]{0, 0, 0, 0, 0, 3, 3};
        A0R = new int[]{i10, i10, i10, i10, i10, i11, i11};
    }

    public C0950Gf() {
        A08();
    }

    public static int A00(int i10, int i11, int i12) {
        return A01(i10, i11, i12, 0);
    }

    public static int A01(int i10, int i11, int alpha, int i12) {
        int i13;
        IK.A00(i10, 0, 4);
        IK.A00(i11, 0, 4);
        IK.A00(alpha, 0, 4);
        IK.A00(i12, 0, 4);
        if (i12 == 0 || i12 == 1) {
            i13 = 255;
        } else if (i12 == 2) {
            i13 = 127;
        } else if (i12 != 3) {
            i13 = 255;
        } else {
            i13 = 0;
        }
        return Color.argb(i13, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, alpha > 1 ? 255 : 0);
    }

    private final SpannableString A02() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A0K);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            int length2 = this.A06;
            if (length2 != -1) {
                StyleSpan styleSpan = new StyleSpan(2);
                int length3 = this.A06;
                spannableStringBuilder.setSpan(styleSpan, length3, length, 33);
            }
            int length4 = this.A0C;
            if (length4 != -1) {
                UnderlineSpan underlineSpan = new UnderlineSpan();
                int length5 = this.A0C;
                spannableStringBuilder.setSpan(underlineSpan, length5, length, 33);
            }
            int length6 = this.A04;
            if (length6 != -1) {
                int length7 = this.A03;
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(length7);
                int length8 = this.A04;
                spannableStringBuilder.setSpan(foregroundColorSpan, length8, length, 33);
            }
            int length9 = this.A02;
            if (length9 != -1) {
                int length10 = this.A01;
                BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(length10);
                int length11 = this.A02;
                spannableStringBuilder.setSpan(backgroundColorSpan, length11, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0016 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.VQ A05() {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0950Gf.A05():com.facebook.ads.redexgen.X.VQ");
    }

    public final void A06() {
        int length = this.A0K.length();
        if (length > 0) {
            this.A0K.delete(length - 1, length);
        }
    }

    public final void A07() {
        this.A0L.clear();
        this.A0K.clear();
        this.A06 = -1;
        this.A0C = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0A = 0;
    }

    public final void A08() {
        A07();
        this.A0G = false;
        this.A0J = false;
        this.A09 = 4;
        this.A0H = false;
        this.A0D = 0;
        this.A05 = 0;
        this.A00 = 0;
        this.A0B = 15;
        this.A0I = true;
        this.A07 = 0;
        this.A0F = 0;
        this.A08 = 0;
        int i10 = A0O;
        this.A0E = i10;
        this.A03 = A0P;
        this.A01 = i10;
    }

    public final void A09(char c10) {
        if (c10 == '\n') {
            this.A0L.add(A02());
            this.A0K.clear();
            if (this.A06 != -1) {
                this.A06 = 0;
            }
            if (this.A0C != -1) {
                this.A0C = 0;
            }
            if (this.A04 != -1) {
                this.A04 = 0;
            }
            if (this.A02 != -1) {
                this.A02 = 0;
            }
            while (true) {
                boolean z10 = this.A0I;
                if (A0N[3].charAt(24) == '0') {
                    throw new RuntimeException();
                }
                String[] strArr = A0N;
                strArr[7] = "aB8IqMkBKAtMJJQueiQkJXGZRWNVG1wc";
                strArr[5] = "HNBMfcg7Bwld4TPuQ9QkuhinF76Nerqg";
                if ((z10 && this.A0L.size() >= this.A0B) || this.A0L.size() >= 15) {
                    this.A0L.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.A0K.append(c10);
        }
    }

    public final void A0A(int i10, int i11) {
        if (this.A0A != i10) {
            A09('\n');
        }
        this.A0A = i10;
    }

    public final void A0B(int i10, int i11, int i12) {
        int i13;
        int i14;
        if (this.A04 != -1 && (i14 = this.A03) != i10) {
            this.A0K.setSpan(new ForegroundColorSpan(i14), this.A04, this.A0K.length(), 33);
        }
        if (i10 != A0P) {
            this.A04 = this.A0K.length();
            this.A03 = i10;
        }
        if (this.A02 != -1 && (i13 = this.A01) != i11) {
            this.A0K.setSpan(new BackgroundColorSpan(i13), this.A02, this.A0K.length(), 33);
        }
        if (i11 != A0O) {
            this.A02 = this.A0K.length();
            String[] strArr = A0N;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[6] = "OSAarCZoTwMbWIGA";
            strArr2[4] = "WpQvoscifbPqGooX";
            this.A01 = i11;
        }
    }

    public final void A0C(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
        if (this.A06 != -1) {
            if (!z10) {
                this.A0K.setSpan(new StyleSpan(2), this.A06, this.A0K.length(), 33);
                this.A06 = -1;
            }
        } else if (z10) {
            this.A06 = this.A0K.length();
        }
        if (this.A0C != -1) {
            if (!z11) {
                this.A0K.setSpan(new UnderlineSpan(), this.A0C, this.A0K.length(), 33);
                this.A0C = -1;
            }
        } else if (!z11) {
        } else {
            this.A0C = this.A0K.length();
        }
    }

    public final void A0D(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        this.A0E = i10;
        this.A07 = i15;
    }

    public final void A0E(boolean z10) {
        this.A0J = z10;
    }

    public final void A0F(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.A0G = true;
        this.A0J = z10;
        this.A0I = z11;
        this.A09 = i10;
        this.A0H = z13;
        this.A0D = i11;
        this.A05 = i12;
        this.A00 = i15;
        if (this.A0B != i13 + 1) {
            this.A0B = i13 + 1;
            while (true) {
                if (z11) {
                    int size = this.A0L.size();
                    String[] strArr = A0N;
                    if (strArr[7].charAt(15) != strArr[5].charAt(15)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0N;
                    strArr2[7] = "EXpWdjiBi1mKPV7ugtu9QNhbKu2j8WKd";
                    strArr2[5] = "slA42LvVtkzyGudujTr9E5uQpxev7D1e";
                    if (size >= this.A0B) {
                        continue;
                        this.A0L.remove(0);
                    }
                }
                if (this.A0L.size() < 15) {
                    break;
                }
                this.A0L.remove(0);
            }
        }
        if (i16 != 0 && this.A0F != i16) {
            this.A0F = i16;
            int windowStyleIdIndex = i16 - 1;
            A0D(A0U[windowStyleIdIndex], A0Q, A0Y[windowStyleIdIndex], 0, A0W[windowStyleIdIndex], A0X[windowStyleIdIndex], A0V[windowStyleIdIndex]);
        }
        if (i17 != 0 && this.A08 != i17) {
            this.A08 = i17;
            int penStyleIdIndex = i17 - 1;
            A0C(0, 1, 1, false, false, A0S[penStyleIdIndex], A0T[penStyleIdIndex]);
            A0B(A0P, A0R[penStyleIdIndex], A0O);
        }
    }

    public final boolean A0G() {
        return this.A0G;
    }

    public final boolean A0H() {
        return !A0G() || (this.A0L.isEmpty() && this.A0K.length() == 0);
    }

    public final boolean A0I() {
        return this.A0J;
    }
}
