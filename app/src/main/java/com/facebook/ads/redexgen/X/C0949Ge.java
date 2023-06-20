package com.facebook.ads.redexgen.X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ge  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0949Ge {
    public static String[] A08 = {"cHi9U0Pg", "VGea8qk0EPS8OqQ4obSD5aeRlTRdn39K", "J", "J", "UkvFMUtno93mVTdlP0lNSPxeQZ", "4fCjFf2htdfAP", "I6h5KAyxQwYPDLtwjcMWBd", "QYcuKDWzo7FBs229Db5R79YAEK36tHpY"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final List<C0948Gd> A06 = new ArrayList();
    public final List<SpannableString> A07 = new ArrayList();
    public final StringBuilder A05 = new StringBuilder();

    public C0949Ge(int i10, int i11) {
        A09(i10);
        A0A(i11);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.text.SpannableString A00() {
        /*
            Method dump skipped, instructions count: 191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0949Ge.A00():android.text.SpannableString");
    }

    public static void A01(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
    }

    public static void A03(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        if (i12 == -1) {
            return;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
    }

    public final int A04() {
        return this.A03;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.GX A05() {
        /*
            r16 = this;
            r3 = r16
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            r4 = 0
        L8:
            java.util.List<android.text.SpannableString> r0 = r3.A07
            int r0 = r0.size()
            if (r4 >= r0) goto L49
            java.util.List<android.text.SpannableString> r0 = r3.A07
            java.lang.Object r5 = r0.get(r4)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0949Ge.A08
            r0 = 7
            r1 = r2[r0]
            r0 = 1
            r2 = r2[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L32
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L32:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0949Ge.A08
            java.lang.String r1 = "JfGeCXNtH9OkzyiNPcVTkTkkVF"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "U8fcuMPJKIItC"
            r0 = 5
            r2[r0] = r1
            r8.append(r5)
            r0 = 10
            r8.append(r0)
            int r4 = r4 + 1
            goto L8
        L49:
            android.text.SpannableString r0 = r16.A00()
            r8.append(r0)
            int r0 = r8.length()
            if (r0 != 0) goto L58
            r0 = 0
            return r0
        L58:
            int r7 = r3.A02
            int r0 = r3.A04
            int r7 = r7 + r0
            int r6 = 32 - r7
            int r0 = r8.length()
            int r6 = r6 - r0
            int r5 = r7 - r6
            int r0 = r3.A00
            r4 = 2
            if (r0 != r4) goto L97
            int r1 = java.lang.Math.abs(r5)
            r0 = 3
            if (r1 < r0) goto L74
            if (r6 >= 0) goto L97
        L74:
            r13 = 1056964608(0x3f000000, float:0.5)
            r14 = 1
        L77:
            int r1 = r3.A00
            r0 = 1
            if (r1 == r0) goto L81
            int r1 = r3.A03
            r0 = 7
            if (r1 <= r0) goto L93
        L81:
            r12 = 2
            int r0 = r3.A03
            int r0 = r0 + (-15)
            int r0 = r0 + (-2)
        L88:
            com.facebook.ads.redexgen.X.GX r7 = new com.facebook.ads.redexgen.X.GX
            android.text.Layout$Alignment r9 = android.text.Layout.Alignment.ALIGN_NORMAL
            float r10 = (float) r0
            r11 = 1
            r15 = 1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        L93:
            r12 = 0
            int r0 = r3.A03
            goto L88
        L97:
            int r0 = r3.A00
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            r1 = 1107296256(0x42000000, float:32.0)
            if (r0 != r4) goto Lad
            if (r5 <= 0) goto Lad
            int r0 = 32 - r6
            float r0 = (float) r0
            float r0 = r0 / r1
            float r13 = r13 * r0
            float r13 = r13 + r2
            r14 = 2
            goto L77
        Lad:
            float r0 = (float) r7
            float r0 = r0 / r1
            float r13 = r13 * r0
            float r13 = r13 + r2
            r14 = 0
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0949Ge.A05():com.facebook.ads.redexgen.X.GX");
    }

    public final void A06() {
        int length = this.A05.length();
        if (length > 0) {
            this.A05.delete(length - 1, length);
            for (int size = this.A06.size() - 1; size >= 0; size--) {
                List<C0948Gd> list = this.A06;
                String[] strArr = A08;
                String str = strArr[2];
                String str2 = strArr[3];
                int length2 = str.length();
                int i10 = str2.length();
                if (length2 != i10) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A08;
                strArr2[0] = "cQse4OX3";
                strArr2[6] = "MGHTHr2HMLcimDeu5sZkGF";
                C0948Gd c0948Gd = list.get(size);
                int i11 = c0948Gd.A00;
                if (i11 == length) {
                    int i12 = c0948Gd.A00;
                    c0948Gd.A00 = i12 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void A07() {
        this.A07.add(A00());
        this.A05.setLength(0);
        this.A06.clear();
        int min = Math.min(this.A01, this.A03);
        while (this.A07.size() >= min) {
            this.A07.remove(0);
        }
    }

    public final void A08(char c10) {
        this.A05.append(c10);
    }

    public final void A09(int i10) {
        this.A00 = i10;
        this.A06.clear();
        this.A07.clear();
        this.A05.setLength(0);
        this.A03 = 15;
        this.A02 = 0;
        this.A04 = 0;
    }

    public final void A0A(int i10) {
        this.A01 = i10;
    }

    public final void A0B(int i10) {
        this.A02 = i10;
    }

    public final void A0C(int i10) {
        this.A03 = i10;
    }

    public final void A0D(int i10) {
        this.A04 = i10;
    }

    public final void A0E(int i10, boolean z10) {
        this.A06.add(new C0948Gd(i10, z10, this.A05.length()));
    }

    public final boolean A0F() {
        if (this.A06.isEmpty() && this.A07.isEmpty()) {
            StringBuilder sb2 = this.A05;
            String[] strArr = A08;
            if (strArr[0].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "ONSLHBaiVChTiCDyCbz7MeGvMb5ZJwv8";
            strArr2[1] = "WV9KVve3dIDV1UZxgbczLfOjx2KW4DPJ";
            if (sb2.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.A05.toString();
    }
}
