package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.mediationsdk.z  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1752z {

    /* renamed from: a  reason: collision with root package name */
    InterfaceC1729c f27564a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f27565b = new Runnable() { // from class: com.ironsource.mediationsdk.z.1
        @Override // java.lang.Runnable
        public final void run() {
            IronLog.INTERNAL.verbose("loaded ads are expired");
            InterfaceC1729c interfaceC1729c = C1752z.this.f27564a;
            if (interfaceC1729c != null) {
                interfaceC1729c.c_();
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private int f27566c;

    /* renamed from: d  reason: collision with root package name */
    private com.ironsource.lifecycle.f f27567d;

    public C1752z(int i10, InterfaceC1729c interfaceC1729c) {
        this.f27566c = 0;
        this.f27564a = interfaceC1729c;
        this.f27566c = i10;
    }

    private boolean b() {
        return this.f27566c > 0;
    }

    public final void a() {
        if (!b() || this.f27567d == null) {
            return;
        }
        IronLog.INTERNAL.verbose("canceling expiration timer");
        this.f27567d.c();
        this.f27567d = null;
    }

    public final void a(long j10) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis(this.f27566c) - Math.max(j10, 0L);
            if (millis <= 0) {
                IronLog.INTERNAL.verbose("no delay - onAdExpired called");
                this.f27564a.c_();
                return;
            }
            a();
            this.f27567d = new com.ironsource.lifecycle.f(millis, this.f27565b, true);
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) millis);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("loaded ads will expire on: " + calendar.getTime() + " in " + String.format("%.2f", Double.valueOf((millis / 1000.0d) / 60.0d)) + " minutes");
        }
    }
}
