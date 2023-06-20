package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.mediationsdk.r  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1744r {

    /* renamed from: a  reason: collision with root package name */
    private static final C1744r f27319a = new C1744r();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Long> f27320b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Boolean> f27321c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private int f27322d;

    /* renamed from: e  reason: collision with root package name */
    private int f27323e;

    private C1744r() {
    }

    public static synchronized C1744r a() {
        C1744r c1744r;
        synchronized (C1744r.class) {
            c1744r = f27319a;
        }
        return c1744r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IronSource.AD_UNIT ad_unit, IronSourceError ironSourceError) {
        this.f27320b.put(ad_unit.toString(), Long.valueOf(System.currentTimeMillis()));
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            D.a().a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ac.a().a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final void a(IronSource.AD_UNIT ad_unit, int i10) {
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f27322d = i10;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f27323e = i10;
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
        }
    }

    public final synchronized void a(final IronSource.AD_UNIT ad_unit, final IronSourceError ironSourceError) {
        int i10;
        if (a(ad_unit)) {
            return;
        }
        final String ad_unit2 = ad_unit.toString();
        if (!this.f27320b.containsKey(ad_unit2)) {
            b(ad_unit, ironSourceError);
            return;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            i10 = this.f27322d;
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            i10 = this.f27323e;
        } else {
            IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
            i10 = 0;
        }
        long j10 = i10 * 1000;
        long currentTimeMillis = System.currentTimeMillis() - this.f27320b.get(ad_unit2).longValue();
        if (currentTimeMillis > j10) {
            b(ad_unit, ironSourceError);
            return;
        }
        this.f27321c.put(ad_unit2, Boolean.TRUE);
        long j11 = j10 - currentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j11);
        com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.f26160a;
        com.ironsource.environment.e.c.a(new Runnable() { // from class: com.ironsource.mediationsdk.r.1
            @Override // java.lang.Runnable
            public final void run() {
                IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
                C1744r.this.b(ad_unit, ironSourceError);
                C1744r.this.f27321c.put(ad_unit2, Boolean.FALSE);
            }
        }, j11);
    }

    public final synchronized boolean a(IronSource.AD_UNIT ad_unit) {
        if (this.f27321c.containsKey(ad_unit.toString())) {
            return this.f27321c.get(ad_unit.toString()).booleanValue();
        }
        return false;
    }
}
