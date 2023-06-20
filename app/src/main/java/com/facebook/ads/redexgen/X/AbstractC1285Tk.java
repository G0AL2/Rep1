package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Tk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1285Tk<T> extends L8 {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tk != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC1285Tk(T t10) {
        this.A00 = new WeakReference<>(t10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Tk != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A07() {
        return this.A00.get();
    }
}
