package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class AT implements Comparable<AT> {
    public int A00;
    public long A01;
    @Nullable
    public Object A02;
    public final C0826As A03;

    public AT(C0826As c0826As) {
        this.A03 = c0826As;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(@NonNull AT at) {
        if ((this.A02 == null) != (at.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        } else if (this.A02 == null) {
            return 0;
        } else {
            int i10 = this.A00 - at.A00;
            if (i10 != 0) {
                return i10;
            }
            return C1020Iz.A07(this.A01, at.A01);
        }
    }

    public final void A01(int i10, long j10, Object obj) {
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = obj;
    }
}
