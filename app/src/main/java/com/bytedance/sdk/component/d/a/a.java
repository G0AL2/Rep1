package com.bytedance.sdk.component.d.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultThreadFactory.java */
/* loaded from: classes.dex */
public class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadGroup f10083a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f10084b = new AtomicInteger(1);

    public a(String str) {
        this.f10083a = new ThreadGroup("tt_img_" + str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f10083a;
        Thread thread = new Thread(threadGroup, runnable, "tt_img_" + this.f10084b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
