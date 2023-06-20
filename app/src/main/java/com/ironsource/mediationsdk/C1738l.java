package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.l  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1738l {

    /* renamed from: b  reason: collision with root package name */
    private static C1738l f27140b;

    /* renamed from: a  reason: collision with root package name */
    int f27141a;

    /* renamed from: c  reason: collision with root package name */
    private long f27142c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f27143d = false;

    private C1738l() {
    }

    public static synchronized C1738l a() {
        C1738l c1738l;
        synchronized (C1738l.class) {
            if (f27140b == null) {
                f27140b = new C1738l();
            }
            c1738l = f27140b;
        }
        return c1738l;
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        a(ironSourceBannerLayout, ironSourceError, false);
    }

    public final void a(final IronSourceBannerLayout ironSourceBannerLayout, final IronSourceError ironSourceError, final boolean z10) {
        synchronized (this) {
            if (this.f27143d) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f27142c;
            int i10 = this.f27141a;
            if (currentTimeMillis > i10 * 1000) {
                b(ironSourceBannerLayout, ironSourceError, z10);
                return;
            }
            this.f27143d = true;
            long j10 = (i10 * 1000) - currentTimeMillis;
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("delaying callback by " + j10);
            com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.f26160a;
            com.ironsource.environment.e.c.b(new Runnable() { // from class: com.ironsource.mediationsdk.l.1
                @Override // java.lang.Runnable
                public final void run() {
                    C1738l.this.b(ironSourceBannerLayout, ironSourceError, z10);
                }
            }, j10);
        }
    }

    void b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError, boolean z10) {
        if (ironSourceBannerLayout != null) {
            this.f27142c = System.currentTimeMillis();
            this.f27143d = false;
            ironSourceBannerLayout.a(ironSourceError, z10);
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this) {
            z10 = this.f27143d;
        }
        return z10;
    }
}
