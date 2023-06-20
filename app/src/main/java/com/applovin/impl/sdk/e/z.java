package com.applovin.impl.sdk.e;

/* loaded from: classes.dex */
public class z extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f8467a;

    public z(com.applovin.impl.sdk.m mVar, Runnable runnable) {
        this(mVar, false, runnable);
    }

    public z(com.applovin.impl.sdk.m mVar, boolean z10, Runnable runnable) {
        super("TaskRunnable", mVar, z10);
        this.f8467a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8467a.run();
    }
}
