package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.l;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* loaded from: classes.dex */
public class b extends com.fyber.inneractive.sdk.flow.c<f, com.fyber.inneractive.sdk.dv.a> implements d {

    /* renamed from: h  reason: collision with root package name */
    public boolean f17084h = !l.a("com.google.android.gms.ads.InterstitialAd");

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17085a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            f17085a = iArr;
            try {
                iArr[UnitDisplayType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17085a[UnitDisplayType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17085a[UnitDisplayType.MRECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17085a[UnitDisplayType.REWARDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.c
    public String b() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.c
    public void e() {
        com.fyber.inneractive.sdk.dv.a cVar;
        Response response = this.f17197b;
        if (response != 0 && ((f) response).f20178s != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f17196a;
            if (inneractiveAdRequest != null) {
                boolean muteVideo = inneractiveAdRequest.getMuteVideo();
                try {
                    MobileAds.setAppMuted(muteVideo);
                    MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
                } catch (Throwable unused) {
                }
            }
            f fVar = (f) this.f17197b;
            UnitDisplayType unitDisplayType = fVar.f20173n;
            QueryInfo queryInfo = fVar.f20178s.f17095a;
            int i10 = a.f17085a[unitDisplayType.ordinal()];
            if (i10 != 1) {
                if (i10 == 2 || i10 == 3) {
                    cVar = new com.fyber.inneractive.sdk.dv.banner.a(c(), this.f17201f, (f) this.f17197b);
                } else if (i10 != 4) {
                    cVar = null;
                } else if (this.f17084h) {
                    cVar = new com.fyber.inneractive.sdk.dv.rewarded.a(c(), this.f17201f, (f) this.f17197b);
                } else {
                    cVar = new com.fyber.inneractive.sdk.dv.rewarded.b(c(), this.f17201f, (f) this.f17197b);
                }
            } else if (this.f17084h) {
                cVar = new com.fyber.inneractive.sdk.dv.interstitial.b(c(), this.f17201f, (f) this.f17197b);
            } else {
                cVar = new com.fyber.inneractive.sdk.dv.interstitial.c(c(), this.f17201f, (f) this.f17197b);
            }
            this.f17198c = cVar;
            if (queryInfo != null && cVar != null) {
                ((com.fyber.inneractive.sdk.dv.a) this.f17198c).a(new AdRequest.Builder().setAdInfo(new AdInfo(queryInfo, ((f) this.f17197b).B)).build(), this);
                return;
            } else {
                f();
                return;
            }
        }
        f();
    }

    public void f() {
        a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
    }
}
