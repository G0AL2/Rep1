package com.ironsource.mediationsdk;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class af {

    /* renamed from: a  reason: collision with root package name */
    ag f26967a;

    /* renamed from: b  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.c f26968b;

    /* renamed from: c  reason: collision with root package name */
    private Timer f26969c = null;

    public af(com.ironsource.mediationsdk.utils.c cVar, ag agVar) {
        this.f26968b = cVar;
        this.f26967a = agVar;
    }

    private void e() {
        Timer timer = this.f26969c;
        if (timer != null) {
            timer.cancel();
            this.f26969c = null;
        }
    }

    public final synchronized void a() {
        if (this.f26968b.f27420m) {
            e();
            Timer timer = new Timer();
            this.f26969c = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.af.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    af.this.f26967a.e();
                }
            }, this.f26968b.f27418k);
        }
    }

    public final synchronized void b() {
        if (!this.f26968b.f27420m) {
            e();
            Timer timer = new Timer();
            this.f26969c = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.af.2
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    af.this.f26967a.e();
                }
            }, this.f26968b.f27418k);
        }
    }

    public final void c() {
        synchronized (this) {
            e();
        }
        this.f26967a.e();
    }

    public final synchronized void d() {
        e();
        Timer timer = new Timer();
        this.f26969c = timer;
        timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.af.3
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                af.this.f26967a.e();
            }
        }, this.f26968b.f27417j);
    }
}
