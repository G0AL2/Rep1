package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.aa;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.utils.q;
import com.applovin.impl.sdk.v;
import com.applovin.impl.sdk.z;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements aa.a, d.a, e.a {
    private boolean A;
    private boolean B;

    /* renamed from: a  reason: collision with root package name */
    private final Context f7228a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxAdView f7229b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7230c;

    /* renamed from: d  reason: collision with root package name */
    private final View f7231d;

    /* renamed from: e  reason: collision with root package name */
    private long f7232e;

    /* renamed from: f  reason: collision with root package name */
    private com.applovin.impl.mediation.a.b f7233f;

    /* renamed from: g  reason: collision with root package name */
    private String f7234g;

    /* renamed from: h  reason: collision with root package name */
    private String f7235h;

    /* renamed from: i  reason: collision with root package name */
    private String f7236i;

    /* renamed from: j  reason: collision with root package name */
    private String f7237j;

    /* renamed from: k  reason: collision with root package name */
    private final a f7238k;

    /* renamed from: l  reason: collision with root package name */
    private final c f7239l;

    /* renamed from: m  reason: collision with root package name */
    private final d f7240m;

    /* renamed from: n  reason: collision with root package name */
    private final z f7241n;

    /* renamed from: o  reason: collision with root package name */
    private final aa f7242o;

    /* renamed from: p  reason: collision with root package name */
    private final Object f7243p;

    /* renamed from: q  reason: collision with root package name */
    private com.applovin.impl.mediation.a.b f7244q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f7245r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f7246s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f7247t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f7248u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f7249v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f7250w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f7251x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f7252y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f7253z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends b {
        private a() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            if (v.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                v vVar = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                vVar.b(str2, "Calling ad load failed callback for publisher: " + MaxAdViewImpl.this.adListener);
            }
            j.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f7249v) {
                if (v.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    v vVar = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    vVar.b(str, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.E().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
            bVar.d(MaxAdViewImpl.this.f7236i);
            bVar.e(MaxAdViewImpl.this.f7237j);
            if (bVar.w() == null) {
                MaxAdViewImpl.this.sdk.E().destroyAd(bVar);
                onAdLoadFailed(bVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            MaxAdViewImpl.this.a(bVar);
            if (bVar.y()) {
                long z10 = bVar.z();
                if (v.a()) {
                    v A = MaxAdViewImpl.this.sdk.A();
                    String str2 = MaxAdViewImpl.this.tag;
                    A.b(str2, "Scheduling banner ad refresh " + z10 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                }
                MaxAdViewImpl.this.f7240m.a(z10);
                if (MaxAdViewImpl.this.f7240m.f() || MaxAdViewImpl.this.f7246s) {
                    if (v.a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.b(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f7240m.d();
                }
            }
            if (v.a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                v vVar2 = maxAdViewImpl3.logger;
                String str3 = maxAdViewImpl3.tag;
                vVar2.b(str3, "Calling ad load success callback for publisher: " + MaxAdViewImpl.this.adListener);
            }
            j.a(MaxAdViewImpl.this.adListener, maxAd, true);
        }
    }

    /* loaded from: classes.dex */
    private abstract class b implements a.InterfaceC0115a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f7261a;

        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7244q)) {
                j.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7244q)) {
                if ((MaxAdViewImpl.this.f7244q.A() || MaxAdViewImpl.this.f7253z) && this.f7261a) {
                    this.f7261a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                j.h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f7244q)) {
                j.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7244q)) {
                j.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7244q)) {
                if ((MaxAdViewImpl.this.f7244q.A() || MaxAdViewImpl.this.f7253z) && !MaxAdViewImpl.this.f7240m.f()) {
                    this.f7261a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                j.g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f7244q)) {
                j.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            j.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* loaded from: classes.dex */
    private class c extends b {
        private c() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            if (v.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                v vVar = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                vVar.b(str2, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f7249v) {
                if (v.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Successfully pre-cached ad for refresh");
                }
                MaxAdViewImpl.this.a(maxAd);
                return;
            }
            if (v.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                v vVar = maxAdViewImpl2.logger;
                String str = maxAdViewImpl2.tag;
                vVar.b(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.E().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, m mVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", mVar);
        this.f7230c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f7232e = Long.MAX_VALUE;
        this.f7243p = new Object();
        this.f7244q = null;
        this.f7249v = false;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f7228a = context.getApplicationContext();
        this.f7229b = maxAdView;
        this.f7231d = view;
        this.f7238k = new a();
        this.f7239l = new c();
        this.f7240m = new d(mVar, this);
        this.f7241n = new z(maxAdView, mVar);
        this.f7242o = new aa(maxAdView, mVar, this);
        mVar.B().a(this);
        if (v.a()) {
            v vVar = this.logger;
            String str2 = this.tag;
            vVar.b(str2, "Created new MaxAdView (" + this + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.b bVar;
        MaxAdView maxAdView = this.f7229b;
        if (maxAdView != null) {
            com.applovin.impl.sdk.utils.b.a(maxAdView, this.f7231d);
        }
        this.f7242o.a();
        synchronized (this.f7243p) {
            bVar = this.f7244q;
        }
        if (bVar != null) {
            this.sdk.E().destroyAd(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        if (!Utils.bitMaskContainsFlag(j10, ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.f8189y)).longValue()) || this.A) {
            if (v.a()) {
                this.logger.b(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
            }
            this.f7245r = false;
            b();
            return;
        }
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Undesired flags matched - current: " + Long.toBinaryString(j10) + ", undesired: " + Long.toBinaryString(j10));
            this.logger.b(this.tag, "Waiting for refresh timer to manually fire request");
        }
        this.f7245r = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, com.applovin.impl.mediation.a.b bVar) {
        int u10 = bVar.u();
        int v10 = bVar.v();
        int dpToPx = u10 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), u10);
        int dpToPx2 = v10 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), v10) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx2);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = dpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (v.a()) {
                this.logger.b(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + dpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i10 : q.a(this.f7229b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i10);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.applovin.impl.mediation.a.b bVar) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 305
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.AnonymousClass2.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, long j10) {
        if (v.a()) {
            this.logger.b(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.E().processViewabilityAdImpressionPostback(bVar, j10, this.f7238k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final a.InterfaceC0115a interfaceC0115a) {
        if (!e()) {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MaxAdViewImpl.this.f7244q != null) {
                        long a10 = MaxAdViewImpl.this.f7241n.a(MaxAdViewImpl.this.f7244q);
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.extraParameters.put("visible_ad_ad_unit_id", maxAdViewImpl.f7244q.getAdUnitId());
                        MaxAdViewImpl.this.extraParameters.put("viewability_flags", Long.valueOf(a10));
                    } else {
                        MaxAdViewImpl.this.extraParameters.remove("visible_ad_ad_unit_id");
                        MaxAdViewImpl.this.extraParameters.remove("viewability_flags");
                    }
                    int pxToDp = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f7229b.getContext(), MaxAdViewImpl.this.f7229b.getWidth());
                    int pxToDp2 = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f7229b.getContext(), MaxAdViewImpl.this.f7229b.getHeight());
                    MaxAdViewImpl.this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
                    MaxAdViewImpl.this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    maxAdViewImpl2.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(maxAdViewImpl2.f7240m.f() || MaxAdViewImpl.this.f7246s));
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    maxAdViewImpl3.extraParameters.put("auto_retries_disabled", Boolean.valueOf(maxAdViewImpl3.f7251x));
                    if (v.a()) {
                        MaxAdViewImpl maxAdViewImpl4 = MaxAdViewImpl.this;
                        v vVar = maxAdViewImpl4.logger;
                        String str = maxAdViewImpl4.tag;
                        vVar.b(str, "Loading " + MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + interfaceC0115a + "...");
                    }
                    MediationServiceImpl E = MaxAdViewImpl.this.sdk.E();
                    MaxAdViewImpl maxAdViewImpl5 = MaxAdViewImpl.this;
                    String str2 = maxAdViewImpl5.adUnitId;
                    String str3 = maxAdViewImpl5.f7230c;
                    MaxAdViewImpl maxAdViewImpl6 = MaxAdViewImpl.this;
                    E.loadAd(str2, str3, maxAdViewImpl6.adFormat, maxAdViewImpl6.localExtraParameters, maxAdViewImpl6.extraParameters, maxAdViewImpl6.f7228a, interfaceC0115a);
                }
            });
        } else if (v.a()) {
            v.i(this.tag, "Failed to load new ad - this instance is already destroyed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f7248u = false;
        if (!this.f7247t) {
            if (v.a()) {
                this.logger.b(this.tag, "Saving pre-cache ad...");
            }
            this.f7233f = (com.applovin.impl.mediation.a.b) maxAd;
            return;
        }
        this.f7247t = false;
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
        }
        this.f7238k.onAdLoaded(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (this.sdk.b(com.applovin.impl.sdk.c.a.f8179o).contains(String.valueOf(maxError.getCode()))) {
            if (v.a()) {
                v A = this.sdk.A();
                String str = this.tag;
                A.b(str, "Ignoring banner ad refresh for error code " + maxError.getCode());
            }
        } else if (this.f7246s || this.f7240m.f()) {
            if (this.f7248u) {
                this.logger.b(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
                this.f7248u = false;
            }
            if (this.f7247t) {
                this.logger.b(this.tag, "Refresh pre-cache failed - calling ad load failed callback for publisher");
                j.a(this.adListener, this.adUnitId, maxError);
            }
        } else {
            this.f7245r = true;
            this.f7248u = false;
            long longValue = ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.f8178n)).longValue();
            if (longValue >= 0) {
                if (v.a()) {
                    v A2 = this.sdk.A();
                    String str2 = this.tag;
                    A2.b(str2, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f7240m.a(longValue);
            }
        }
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (v.a()) {
                v vVar = this.logger;
                String str3 = this.tag;
                vVar.b(str3, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f7250w = Boolean.parseBoolean(str2);
        } else if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (v.a()) {
                v vVar2 = this.logger;
                String str4 = this.tag;
                vVar2.b(str4, "Updated disable auto-retries to: " + str2);
            }
            this.f7251x = Boolean.parseBoolean(str2);
        } else if ("disable_precache".equalsIgnoreCase(str)) {
            if (v.a()) {
                v vVar3 = this.logger;
                String str5 = this.tag;
                vVar3.b(str5, "Updated precached disabled to: " + str2);
            }
            this.f7252y = Boolean.parseBoolean(str2);
        } else if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (v.a()) {
                v vVar4 = this.logger;
                String str6 = this.tag;
                vVar4.b(str6, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.f7253z = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (v.a()) {
                v vVar5 = this.logger;
                String str7 = this.tag;
                vVar5.b(str7, "Updated force precache to: " + str2);
            }
            this.A = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (v.a()) {
                v vVar6 = this.logger;
                String str8 = this.tag;
                vVar6.b(str8, "Updated is adaptive banner to: " + str2);
            }
            this.B = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    private void b() {
        if (d()) {
            if (v.a()) {
                this.logger.b(this.tag, "Scheduling refresh precache request now");
            }
            this.f7248u = true;
            this.sdk.S().a(new com.applovin.impl.sdk.e.z(this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    if (v.a()) {
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Loading ad for pre-cache request...");
                    }
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    maxAdViewImpl2.a(maxAdViewImpl2.f7239l);
                }
            }), com.applovin.impl.mediation.d.c.a(this.adFormat));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.applovin.impl.mediation.a.b bVar) {
        int height = this.f7229b.getHeight();
        int width = this.f7229b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f7228a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f7228a, width);
            MaxAdFormat format = bVar.getFormat();
            int height2 = (this.B ? format.getAdaptiveSize(pxToDp2, this.f7228a) : format.getSize()).getHeight();
            int width2 = format.getSize().getWidth();
            if (v.a()) {
                if (pxToDp < height2 || pxToDp2 < width2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("\n**************************************************\n`MaxAdView` size ");
                    sb2.append(pxToDp2);
                    sb2.append("x");
                    sb2.append(pxToDp);
                    sb2.append(" dp smaller than required ");
                    sb2.append(this.B ? "adaptive " : "");
                    sb2.append("size: ");
                    sb2.append(width2);
                    sb2.append("x");
                    sb2.append(height2);
                    sb2.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                    this.logger.e("AppLovinSdk", sb2.toString());
                }
            }
        }
    }

    private void c() {
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Rendering for cached ad: " + this.f7233f + "...");
        }
        this.f7238k.onAdLoaded(this.f7233f);
        this.f7233f = null;
    }

    private boolean d() {
        if (this.f7252y) {
            return false;
        }
        return ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f8190z)).booleanValue();
    }

    private boolean e() {
        boolean z10;
        synchronized (this.f7243p) {
            z10 = this.f7249v;
        }
        return z10;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a();
        if (this.f7233f != null) {
            this.sdk.E().destroyAd(this.f7233f);
        }
        synchronized (this.f7243p) {
            this.f7249v = true;
        }
        this.f7240m.c();
        this.sdk.B().b(this);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f7236i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
        if (com.applovin.impl.sdk.v.a() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
        if (com.applovin.impl.sdk.v.a() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r5.logger.b(r5.tag, "Loading ad...");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadAd() {
        /*
            r5 = this;
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L2d
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ""
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = " Loading ad for "
            r2.append(r3)
            java.lang.String r3 = r5.adUnitId
            r2.append(r3)
            java.lang.String r3 = "..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.b(r1, r2)
        L2d:
            boolean r0 = r5.f7250w
            r1 = 1
            if (r0 != 0) goto L45
            com.applovin.impl.sdk.m r0 = r5.sdk
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.c.a.f8185u
            java.lang.Object r0 = r0.a(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L43
            goto L45
        L43:
            r0 = 0
            goto L46
        L45:
            r0 = 1
        L46:
            if (r0 == 0) goto L86
            com.applovin.impl.sdk.d r2 = r5.f7240m
            boolean r2 = r2.f()
            if (r2 != 0) goto L86
            com.applovin.impl.sdk.d r2 = r5.f7240m
            boolean r2 = r2.a()
            if (r2 == 0) goto L86
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L85
            java.lang.String r0 = r5.tag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to load a new ad. An ad refresh has already been scheduled in "
            r1.append(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.applovin.impl.sdk.d r3 = r5.f7240m
            long r3 = r3.b()
            long r2 = r2.toSeconds(r3)
            r1.append(r2)
            java.lang.String r2 = " seconds."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.applovin.impl.sdk.v.i(r0, r1)
        L85:
            return
        L86:
            java.lang.String r2 = "Loading ad..."
            if (r0 == 0) goto Lbe
            com.applovin.impl.mediation.a.b r0 = r5.f7233f
            if (r0 == 0) goto La1
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L9d
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            java.lang.String r2 = "Rendering cached ad"
            r0.b(r1, r2)
        L9d:
            r5.c()
            goto Ld0
        La1:
            boolean r0 = r5.f7248u
            if (r0 == 0) goto Lb7
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto Lb4
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r2 = r5.tag
            java.lang.String r3 = "Waiting for precache ad to load to render"
            r0.b(r2, r3)
        Lb4:
            r5.f7247t = r1
            goto Ld0
        Lb7:
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto Lcb
            goto Lc4
        Lbe:
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto Lcb
        Lc4:
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            r0.b(r1, r2)
        Lcb:
            com.applovin.impl.mediation.ads.MaxAdViewImpl$a r0 = r5.f7238k
            r5.a(r0)
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.loadAd():void");
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdRefresh() {
        v vVar;
        String str;
        String str2;
        this.f7247t = false;
        if (this.f7233f != null) {
            c();
        } else if (!d()) {
            if (v.a()) {
                vVar = this.logger;
                str = this.tag;
                str2 = "Refreshing ad from network...";
                vVar.b(str, str2);
            }
            loadAd();
        } else if (!this.f7245r) {
            if (v.a()) {
                this.logger.e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f7247t = true;
        } else {
            if (v.a()) {
                vVar = this.logger;
                str = this.tag;
                str2 = "Refreshing ad from network due to viewability requirements not met for refresh request...";
                vVar.b(str, str2);
            }
            loadAd();
        }
    }

    @Override // com.applovin.impl.sdk.e.a
    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.b bVar = this.f7244q;
        if (bVar != null && bVar.f().equalsIgnoreCase(str)) {
            j.a(this.adReviewListener, str2, this.f7244q);
            return;
        }
        com.applovin.impl.mediation.a.b bVar2 = this.f7233f;
        if (bVar2 == null || !bVar2.f().equalsIgnoreCase(str)) {
            return;
        }
        this.f7235h = str;
        this.f7234g = str2;
    }

    @Override // com.applovin.impl.sdk.aa.a
    public void onLogVisibilityImpression() {
        a(this.f7244q, this.f7241n.a(this.f7244q));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f8183s)).booleanValue() && this.f7240m.a()) {
            if (q.a(i10)) {
                if (v.a()) {
                    this.logger.b(this.tag, "Ad view visible");
                }
                this.f7240m.h();
                return;
            }
            if (v.a()) {
                this.logger.b(this.tag, "Ad view hidden");
            }
            this.f7240m.g();
        }
    }

    public void setCustomData(String str) {
        if (this.f7244q != null) {
            String str2 = this.tag;
            v.i(str2, "Custom data for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this custom data, please set the custom data before loading the " + this.adFormat.getLabel() + ".");
        }
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f7237j = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (v.a() && this.f7244q != null) {
            String str2 = this.tag;
            v.i(str2, "Placement for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this placement, please set the placement before loading the " + this.adFormat.getLabel() + ".");
        }
        this.f7236i = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f7232e = i10;
    }

    public void startAutoRefresh() {
        v vVar;
        String str;
        String str2;
        this.f7246s = false;
        if (this.f7240m.f()) {
            this.f7240m.e();
            if (!v.a()) {
                return;
            }
            vVar = this.logger;
            str = this.tag;
            str2 = "Resumed auto-refresh with remaining time: " + this.f7240m.b() + "ms";
        } else if (!v.a()) {
            return;
        } else {
            vVar = this.logger;
            str = this.tag;
            str2 = "Ignoring call to startAutoRefresh() - ad refresh is not paused";
        }
        vVar.b(str, str2);
    }

    public void stopAutoRefresh() {
        if (this.f7244q == null) {
            if (this.f7250w || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.f8185u)).booleanValue()) {
                this.f7246s = true;
                return;
            } else if (v.a()) {
                v.h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            } else {
                return;
            }
        }
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Pausing auto-refresh with remaining time: " + this.f7240m.b() + "ms");
        }
        this.f7240m.d();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f7229b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        sb2.append(e());
        sb2.append('}');
        return sb2.toString();
    }
}
