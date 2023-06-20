package com.unity3d.scar.adapter.common;

/* compiled from: DispatchGroup.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private int f28483a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f28484b;

    public a() {
        this.f28483a = 0;
        this.f28483a = 0;
    }

    private void d() {
        Runnable runnable;
        if (this.f28483a > 0 || (runnable = this.f28484b) == null) {
            return;
        }
        runnable.run();
    }

    public synchronized void a() {
        this.f28483a++;
    }

    public synchronized void b() {
        this.f28483a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f28484b = runnable;
        d();
    }
}
