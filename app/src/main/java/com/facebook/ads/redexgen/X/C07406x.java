package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6x  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07406x {
    public final Map<Integer, C6H<C7A>> A00;
    @Nullable
    public static C07406x A02 = null;
    public static long A01 = 0;

    public C07406x(Map<Integer, C6H<C7A>> map) {
        this.A00 = map;
    }

    public static synchronized long A00() {
        long j10;
        synchronized (C07406x.class) {
            j10 = A01;
        }
        return j10;
    }

    @SuppressLint({"UseSparseArrays"})
    public static C07406x A01() {
        if (A02 == null) {
            A02 = new C07406x(Collections.synchronizedMap(new HashMap()));
        }
        return A02;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A02(C6H<C7A> c6h, int i10) {
        int i11 = 0;
        boolean z10 = false;
        if (c6h.A00() == 0) {
            z10 = true;
            i11 = c6h.A01().A05();
        }
        int updatedSize = i10 - i11;
        A01 += (z10 ? 0 : 4) + updatedSize;
    }

    @SuppressLint({"PublicMethodReturnMutableCollection"})
    public final Map<Integer, C6H<C7A>> A03() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    public final synchronized void A04(int i10, C6H<C7A> c6h, int i11) {
        this.A00.put(Integer.valueOf(i10), c6h);
        A02(c6h, i11);
    }
}
