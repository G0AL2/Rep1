package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.ag;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    com.ironsource.mediationsdk.adunit.c.b.a f26874a;

    /* renamed from: b  reason: collision with root package name */
    ag f26875b;

    /* renamed from: c  reason: collision with root package name */
    private Timer f26876c;

    public c(com.ironsource.mediationsdk.adunit.c.b.a aVar, ag agVar) {
        this.f26874a = aVar;
        this.f26875b = agVar;
    }

    private void c() {
        Timer timer = this.f26876c;
        if (timer != null) {
            timer.cancel();
            this.f26876c = null;
        }
    }

    public final void a() {
        com.ironsource.mediationsdk.adunit.c.b.a aVar = this.f26874a;
        if (aVar.f26866a != a.EnumC0342a.MANUAL) {
            a(aVar.f26868c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j10) {
        c();
        Timer timer = new Timer();
        this.f26876c = timer;
        timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.adunit.c.c.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                c.this.f26875b.e();
            }
        }, j10);
    }

    public final void b() {
        if (this.f26874a.f26866a != a.EnumC0342a.MANUAL) {
            a(0L);
        }
    }
}
