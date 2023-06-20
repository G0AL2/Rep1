package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class h implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadFactory f6062a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f6063b = new AtomicInteger(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(b bVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6062a.newThread(runnable);
        int andIncrement = this.f6063b.getAndIncrement();
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("PlayBillingLibrary-");
        sb2.append(andIncrement);
        newThread.setName(sb2.toString());
        return newThread;
    }
}
