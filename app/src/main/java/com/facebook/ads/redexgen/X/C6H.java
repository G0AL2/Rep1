package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.facebook.ads.redexgen.X.6H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6H<T> {
    public final int A00;
    public final LinkedBlockingDeque<T> A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    public C6H(int i10) {
        this.A01 = new LinkedBlockingDeque<>(i10);
        this.A00 = i10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    public final synchronized int A00() {
        return this.A01.remainingCapacity();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    @Nullable
    public final synchronized T A01() {
        if (!this.A01.isEmpty()) {
            return this.A01.peekFirst();
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    @Nullable
    public final synchronized T A02() {
        if (!this.A01.isEmpty()) {
            return this.A01.peekLast();
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    public final synchronized List<T> A03() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<T> it = this.A01.iterator();
        while (it.hasNext()) {
            T dataObject = it.next();
            arrayList.add(dataObject);
        }
        return arrayList;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<T> */
    public final synchronized void A04(T t10) {
        if (this.A00 <= 0) {
            return;
        }
        if (!this.A01.isEmpty() && A00() == 0) {
            this.A01.removeFirst();
        }
        this.A01.offer(t10);
    }
}
