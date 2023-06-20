package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* loaded from: assets/audience_network.dex */
public class I8 implements Comparable<I8> {
    public final long A00;
    public final long A01;
    public final long A02;
    @Nullable
    public final File A03;
    public final String A04;
    public final boolean A05;

    public I8(String str, long j10, long j11, long j12, @Nullable File file) {
        this.A04 = str;
        this.A02 = j10;
        this.A01 = j11;
        this.A05 = file != null;
        this.A03 = file;
        this.A00 = j12;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull I8 i82) {
        if (!this.A04.equals(i82.A04)) {
            return this.A04.compareTo(i82.A04);
        }
        long j10 = this.A02 - i82.A02;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final boolean A01() {
        return !this.A05;
    }

    public final boolean A02() {
        return this.A01 == -1;
    }
}
