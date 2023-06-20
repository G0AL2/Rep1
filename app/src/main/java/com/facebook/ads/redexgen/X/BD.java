package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class BD {
    public static final BD A04 = new BC().A00();
    public AudioAttributes A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public BD(int i10, int i11, int i12) {
        this.A01 = i10;
        this.A02 = i11;
        this.A03 = i12;
    }

    @TargetApi(21)
    public final AudioAttributes A00() {
        if (this.A00 == null) {
            this.A00 = new AudioAttributes.Builder().setContentType(this.A01).setFlags(this.A02).setUsage(this.A03).build();
        }
        return this.A00;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BD bd2 = (BD) obj;
        return this.A01 == bd2.A01 && this.A02 == bd2.A02 && this.A03 == bd2.A03;
    }

    public final int hashCode() {
        int result = this.A02;
        return (((((17 * 31) + this.A01) * 31) + result) * 31) + this.A03;
    }
}
