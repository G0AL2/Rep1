package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.D;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ac;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    IronSource.AD_UNIT f26865a;

    public b(IronSource.AD_UNIT ad_unit) {
        this.f26865a = ad_unit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(IronSourceError ironSourceError) {
        IronSource.AD_UNIT ad_unit = this.f26865a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            D.a().a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ac.a().a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.f26865a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(IronSourceError ironSourceError, AdInfo adInfo) {
        IronSource.AD_UNIT ad_unit = this.f26865a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            D.a().a(ironSourceError, adInfo);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ac.a().a(ironSourceError, adInfo);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.f26865a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z10, AdInfo adInfo) {
        if (this.f26865a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ac.a().a(z10, adInfo);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + this.f26865a);
    }
}
