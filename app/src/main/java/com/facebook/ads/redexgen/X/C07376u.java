package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.6u  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07376u<T> {
    public final int A00;
    public final int A01;
    public final T A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6u != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    public C07376u(T bundledSignalMetadataKey, int i10, int i11) {
        this.A02 = bundledSignalMetadataKey;
        this.A00 = i10;
        this.A01 = i11;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6u != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    private boolean A00() {
        int i10;
        int i11 = this.A00;
        return i11 > 0 && i11 < 9999 && (i10 = this.A01) > 0 && i10 < 10000 && i11 < i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6u != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    public final T A01() {
        return this.A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6u != com.facebook.ads.internal.botdetection.signals.model.BundledSignalMetadata<T> */
    public final boolean A02() {
        return A00() && Build.VERSION.SDK_INT >= this.A00 && Build.VERSION.SDK_INT < this.A01;
    }
}
