package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f27401a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27402b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27403c = false;

    public final void a(IronSource.AD_UNIT ad_unit, boolean z10) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f27401a = z10;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f27402b = z10;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f27403c = z10;
        }
    }

    public final boolean a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f27401a;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f27402b;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f27403c;
        }
        return false;
    }
}
