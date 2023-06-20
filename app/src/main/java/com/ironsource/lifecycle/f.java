package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private Timer f26208a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26209b;

    /* renamed from: c  reason: collision with root package name */
    private Long f26210c;

    /* renamed from: d  reason: collision with root package name */
    private long f26211d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f26212e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            f.this.f26212e.run();
        }
    }

    public f(long j10, Runnable runnable, boolean z10) {
        this.f26211d = j10;
        this.f26212e = runnable;
        this.f26209b = false;
        this.f26210c = null;
        this.f26209b = true;
        d.a().a(this);
        this.f26210c = Long.valueOf(System.currentTimeMillis() + this.f26211d);
        if (d.a().b()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.f26208a == null) {
            Timer timer = new Timer();
            this.f26208a = timer;
            timer.schedule(new a(), this.f26211d);
            Calendar.getInstance().setTimeInMillis(this.f26210c.longValue());
        }
    }

    private void e() {
        Timer timer = this.f26208a;
        if (timer != null) {
            timer.cancel();
            this.f26208a = null;
        }
    }

    @Override // com.ironsource.lifecycle.c
    public final void a() {
        Long l10;
        if (this.f26208a == null && (l10 = this.f26210c) != null) {
            long longValue = l10.longValue() - System.currentTimeMillis();
            this.f26211d = longValue;
            if (longValue > 0) {
                d();
                return;
            }
            c();
            this.f26212e.run();
        }
    }

    @Override // com.ironsource.lifecycle.c
    public final void b() {
        if (this.f26208a != null) {
            e();
        }
    }

    public final void c() {
        e();
        this.f26209b = false;
        this.f26210c = null;
        d a10 = d.a();
        if (a10.f26194f.contains(this)) {
            a10.f26194f.remove(this);
        }
    }
}
