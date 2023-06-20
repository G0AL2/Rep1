package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class VG implements GY {
    public static byte[] A04;
    public final int A00;
    public final List<VH> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{5};
    }

    public VG(List<VH> list) {
        this.A01 = list;
        this.A00 = list.size();
        this.A02 = new long[this.A00 * 2];
        for (int i10 = 0; i10 < this.A00; i10++) {
            VH vh = list.get(i10);
            int i11 = i10 * 2;
            this.A02[i11] = vh.A01;
            this.A02[i11 + 1] = vh.A00;
        }
        long[] jArr = this.A02;
        this.A03 = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final List<GX> A6B(long j10) {
        ArrayList arrayList = null;
        VH cue = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i10 = 0; i10 < this.A00; i10++) {
            long[] jArr = this.A02;
            if (jArr[i10 * 2] <= j10 && j10 < jArr[(i10 * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                VH vh = this.A01.get(i10);
                if (vh.A00()) {
                    if (cue == null) {
                        cue = vh;
                    } else {
                        String A00 = A00(0, 1, 126);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(cue.A0C).append((CharSequence) A00).append(vh.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) A00).append(vh.A0C);
                        }
                    }
                } else {
                    arrayList.add(vh);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new VH(normalCueTextBuilder));
        } else if (cue != null) {
            arrayList.add(cue);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final long A6b(int i10) {
        boolean z10 = true;
        IK.A03(i10 >= 0);
        if (i10 >= this.A03.length) {
            z10 = false;
        }
        IK.A03(z10);
        return this.A03[i10];
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A6c() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.GY
    public final int A70(long j10) {
        int A0A = C1020Iz.A0A(this.A03, j10, false, false);
        if (A0A < this.A03.length) {
            return A0A;
        }
        return -1;
    }
}
