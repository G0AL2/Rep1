package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

/* renamed from: com.ironsource.mediationsdk.j  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1736j {

    /* renamed from: b  reason: collision with root package name */
    private static final C1736j f27109b = new C1736j();

    /* renamed from: a  reason: collision with root package name */
    ISDemandOnlyBannerListener f27110a = null;

    private C1736j() {
    }

    public static C1736j a() {
        return f27109b;
    }

    public final void a(final IronSourceError ironSourceError) {
        if (this.f27110a != null) {
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.j.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (C1736j.this.f27110a != null) {
                        C1736j.this.f27110a.onBannerAdLoadFailed(ironSourceError);
                    }
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onBannerAdLoadFailed() error = " + ironSourceError.getErrorMessage());
                }
            });
        }
    }
}
