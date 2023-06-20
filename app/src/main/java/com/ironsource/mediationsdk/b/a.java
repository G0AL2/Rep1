package com.ironsource.mediationsdk.b;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f27000a;

    /* renamed from: b  reason: collision with root package name */
    private Timer f27001b;

    /* renamed from: c  reason: collision with root package name */
    private long f27002c;

    public a(long j10) {
        this.f27002c = j10;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(T t10) {
        if ((this.f27002c <= 0) || t10 == null) {
            return;
        }
        this.f27000a = t10;
        b();
        Timer timer = new Timer();
        this.f27001b = timer;
        timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.b.a.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                a.this.a();
            }
        }, this.f27002c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b() {
        Timer timer = this.f27001b;
        if (timer != null) {
            timer.cancel();
            this.f27001b = null;
        }
    }

    public final void c() {
        this.f27000a = null;
    }
}
