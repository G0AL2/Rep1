package com.bytedance.sdk.component.f;

import java.util.concurrent.ThreadFactory;

/* compiled from: TTThreadFactory.java */
/* loaded from: classes.dex */
public class h implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadGroup f10442a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10443b;

    /* renamed from: c  reason: collision with root package name */
    private int f10444c;

    public h(int i10, String str) {
        this.f10444c = i10;
        this.f10442a = new ThreadGroup("tt_pangle_group_" + str);
        this.f10443b = "tt_pangle_thread_" + str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f10442a, runnable, this.f10443b);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        int i10 = this.f10444c;
        if (i10 > 10 || i10 < 1) {
            this.f10444c = 5;
        }
        thread.setPriority(this.f10444c);
        return thread;
    }
}
