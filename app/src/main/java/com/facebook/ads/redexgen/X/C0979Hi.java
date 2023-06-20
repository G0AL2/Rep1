package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0979Hi {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    @Nullable
    public final String A05;
    @Nullable
    public final byte[] A06;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-110, -122, 122, -105, -86, -105, -119, -90, -101, -103, -111, -60};
    }

    public C0979Hi(Uri uri, long j10, long j11, long j12, @Nullable String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    public C0979Hi(Uri uri, long j10, long j11, @Nullable String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    public C0979Hi(Uri uri, long j10, long j11, @Nullable String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    public C0979Hi(Uri uri, @Nullable byte[] bArr, long j10, long j11, long j12, @Nullable String str, int i10) {
        boolean z10 = true;
        IK.A03(j10 >= 0);
        IK.A03(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        IK.A03(z10);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j10;
        this.A03 = j11;
        this.A02 = j12;
        this.A05 = str;
        this.A00 = i10;
    }

    public final boolean A02(int i10) {
        return (this.A00 & i10) == i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A00(2, 9, 26));
        sb2.append(this.A04);
        String A00 = A00(0, 2, 74);
        sb2.append(A00);
        sb2.append(Arrays.toString(this.A06));
        sb2.append(A00);
        sb2.append(this.A01);
        sb2.append(A00);
        sb2.append(this.A03);
        sb2.append(A00);
        sb2.append(this.A02);
        sb2.append(A00);
        sb2.append(this.A05);
        sb2.append(A00);
        sb2.append(this.A00);
        sb2.append(A00(11, 1, 75));
        return sb2.toString();
    }
}
