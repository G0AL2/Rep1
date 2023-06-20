package com.chartboost.sdk.impl;

import com.chartboost.sdk.Events.ChartboostCacheError;
import com.chartboost.sdk.Events.ChartboostError;
import com.chartboost.sdk.Events.ChartboostShowError;
import com.chartboost.sdk.Model.CBError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f13934a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13935b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13936c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13937d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13938e;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final int f13939a;

        /* renamed from: b  reason: collision with root package name */
        private final String f13940b;

        /* renamed from: c  reason: collision with root package name */
        private final CBError.CBImpressionError f13941c;

        /* renamed from: d  reason: collision with root package name */
        private final ChartboostError f13942d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f13943e;

        /* renamed from: f  reason: collision with root package name */
        private final String f13944f;

        public a(int i10, String str, CBError.CBImpressionError cBImpressionError, ChartboostError chartboostError, boolean z10, String str2) {
            this.f13939a = i10;
            this.f13940b = str;
            this.f13941c = cBImpressionError;
            this.f13942d = chartboostError;
            this.f13943e = z10;
            this.f13944f = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            switch (this.f13939a) {
                case 0:
                    c.this.a(this.f13940b, this.f13944f);
                    return;
                case 1:
                    c.this.b(this.f13940b, this.f13944f);
                    return;
                case 2:
                    c.this.c(this.f13940b, this.f13944f);
                    return;
                case 3:
                    c.this.d(this.f13940b, this.f13944f);
                    return;
                case 4:
                    c.this.a(this.f13940b, this.f13941c, this.f13943e, this.f13944f);
                    return;
                case 5:
                    c.this.e(this.f13940b, this.f13944f);
                    return;
                case 6:
                    c.this.a(this.f13940b, this.f13944f, (ChartboostCacheError) this.f13942d);
                    return;
                case 7:
                    c.this.a(this.f13940b, this.f13944f, (ChartboostShowError) this.f13942d);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int i10, String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        this.f13934a = i10;
        this.f13935b = str;
        this.f13936c = str3;
        this.f13937d = str4;
        this.f13938e = z11;
    }

    public static c b() {
        return new c(0, IronSourceConstants.INTERSTITIAL_AD_UNIT, "/interstitial/get", "webview/%s/interstitial/get", "/interstitial/show", false, false);
    }

    public static c c() {
        return new c(1, "Rewarded", "/reward/get", "webview/%s/reward/get", "/reward/show", true, false);
    }

    public void a(String str, String str2) {
        m1.d(new com.chartboost.sdk.Tracking.c("cache_finish_success", "", this.f13935b, str));
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.f13879d;
        if (aVar != null) {
            int i10 = this.f13934a;
            if (i10 == 0) {
                aVar.didCacheInterstitial(str);
            } else if (i10 != 1) {
            } else {
                aVar.didCacheRewardedVideo(str);
            }
        }
    }

    public void a(String str, String str2, ChartboostCacheError chartboostCacheError) {
    }

    public void a(String str, String str2, ChartboostShowError chartboostShowError) {
    }

    public void d(String str, String str2) {
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.f13879d;
        if (aVar != null) {
            int i10 = this.f13934a;
            if (i10 == 0) {
                aVar.didDismissInterstitial(str);
            } else if (i10 != 1) {
            } else {
                aVar.didDismissRewardedVideo(str);
            }
        }
    }

    public void e(String str, String str2) {
        com.chartboost.sdk.f a10 = com.chartboost.sdk.f.a();
        if (a10 != null) {
            a10.a(this.f13934a);
        }
        m1.d(new com.chartboost.sdk.Tracking.c("show_finish_success", "", this.f13935b, str));
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.f13879d;
        if (aVar != null) {
            int i10 = this.f13934a;
            if (i10 == 0) {
                aVar.didDisplayInterstitial(str);
            } else if (i10 != 1) {
            } else {
                aVar.didDisplayRewardedVideo(str);
            }
        }
    }

    public void b(String str, String str2) {
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.f13879d;
        if (aVar != null) {
            int i10 = this.f13934a;
            if (i10 == 0) {
                aVar.didClickInterstitial(str);
            } else if (i10 != 1) {
            } else {
                aVar.didClickRewardedVideo(str);
            }
        }
    }

    public void c(String str, String str2) {
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.f13879d;
        if (aVar != null) {
            int i10 = this.f13934a;
            if (i10 == 0) {
                aVar.didCloseInterstitial(str);
            } else if (i10 != 1) {
            } else {
                aVar.didCloseRewardedVideo(str);
            }
        }
    }

    public void a(String str, CBError.CBImpressionError cBImpressionError, boolean z10, String str2) {
        if (z10) {
            m1.d(new com.chartboost.sdk.Tracking.c("show_finish_failure", cBImpressionError.name(), this.f13935b, str));
        } else {
            m1.d(new com.chartboost.sdk.Tracking.c("cache_finish_failure", cBImpressionError.name(), this.f13935b, str));
        }
        cBImpressionError.setAdId(str2);
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.f13879d;
        if (aVar != null) {
            int i10 = this.f13934a;
            if (i10 == 0) {
                aVar.didFailToLoadInterstitial(str, cBImpressionError);
            } else if (i10 != 1) {
            } else {
                aVar.didFailToLoadRewardedVideo(str, cBImpressionError);
            }
        }
    }

    public boolean b(String str) {
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.f13879d;
        if (aVar == null || this.f13934a != 0) {
            return true;
        }
        return aVar.shouldRequestInterstitial(str);
    }

    public boolean a(String str) {
        com.chartboost.sdk.impl.a aVar = com.chartboost.sdk.g.f13879d;
        if (aVar != null) {
            int i10 = this.f13934a;
            if (i10 != 0) {
                if (i10 != 1) {
                    return true;
                }
                return aVar.shouldDisplayRewardedVideo(str);
            }
            return aVar.shouldDisplayInterstitial(str);
        }
        return true;
    }

    public String a() {
        return this.f13935b;
    }
}
