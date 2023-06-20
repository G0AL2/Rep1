package com.facebook.ads.redexgen.X;

import android.net.Uri;

/* loaded from: assets/audience_network.dex */
public final class G7 {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final Uri[] A03;

    public G7() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    public G7(int i10, int[] iArr, Uri[] uriArr, long[] jArr) {
        IK.A03(iArr.length == uriArr.length);
        this.A00 = i10;
        this.A01 = iArr;
        this.A03 = uriArr;
        this.A02 = jArr;
    }

    public final int A00() {
        return A01(-1);
    }

    public final int A01(int i10) {
        int i11 = i10 + 1;
        while (true) {
            int[] iArr = this.A01;
            if (i11 >= iArr.length || iArr[i11] == 0 || iArr[i11] == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final boolean A02() {
        return this.A00 == -1 || A00() < this.A00;
    }
}
