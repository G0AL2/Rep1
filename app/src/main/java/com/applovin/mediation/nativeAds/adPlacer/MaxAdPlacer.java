package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.b.a.a;
import com.applovin.impl.mediation.b.a.b;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public class MaxAdPlacer implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private AppLovinSdkUtils.Size f9045a;

    /* renamed from: b  reason: collision with root package name */
    private MaxNativeAdViewBinder f9046b;

    /* renamed from: c  reason: collision with root package name */
    private final a f9047c;

    /* renamed from: d  reason: collision with root package name */
    private final b f9048d;

    /* renamed from: e  reason: collision with root package name */
    private Listener f9049e;
    protected final v logger;
    protected final m sdk;

    /* loaded from: classes.dex */
    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i10);

        void onAdRemoved(int i10);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f9045a = AppLovinSdkUtils.Size.ZERO;
        m mVar = appLovinSdk.coreSdk;
        this.sdk = mVar;
        v A = mVar.A();
        this.logger = A;
        this.f9047c = new a(maxAdPlacerSettings);
        this.f9048d = new b(maxAdPlacerSettings.getAdUnitId(), maxAdPlacerSettings.getMaxPreloadedAdCount(), context, this);
        A.b("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
    }

    private void a() {
        int a10;
        while (this.f9048d.b() && (a10 = this.f9047c.a()) != -1) {
            v vVar = this.logger;
            vVar.b("MaxAdPlacer", "Placing ad at position: " + a10);
            this.f9047c.a(this.f9048d.d(), a10);
            Listener listener = this.f9049e;
            if (listener != null) {
                listener.onAdLoaded(a10);
            }
        }
    }

    private void a(Collection<Integer> collection, Runnable runnable) {
        for (Integer num : collection) {
            this.f9048d.a(this.f9047c.c(num.intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        v vVar = this.logger;
        vVar.b("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        if (this.f9049e != null) {
            for (Integer num2 : collection) {
                this.f9049e.onAdRemoved(num2.intValue());
            }
        }
    }

    public void clearAds() {
        a(this.f9047c.b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.1
            @Override // java.lang.Runnable
            public void run() {
                MaxAdPlacer.this.logger.b("MaxAdPlacer", "Clearing all cached ads");
                MaxAdPlacer.this.f9047c.c();
                MaxAdPlacer.this.f9048d.e();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i10) {
        final Collection<Integer> d10 = this.f9047c.d(i10);
        if (!d10.isEmpty()) {
            a(d10, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.2
                @Override // java.lang.Runnable
                public void run() {
                    v vVar = MaxAdPlacer.this.logger;
                    vVar.b("MaxAdPlacer", "Clearing trailing ads after position " + i10);
                    MaxAdPlacer.this.f9047c.a(d10);
                }
            });
        }
        return d10;
    }

    public void destroy() {
        this.logger.b("MaxAdPlacer", "Destroying ad placer");
        clearAds();
        this.f9048d.a();
    }

    public long getAdItemId(int i10) {
        if (isFilledPosition(i10)) {
            return -System.identityHashCode(this.f9047c.c(i10));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i10, int i11) {
        if (isFilledPosition(i10)) {
            AppLovinSdkUtils.Size size = this.f9045a;
            boolean z10 = size != AppLovinSdkUtils.Size.ZERO;
            int min = Math.min(z10 ? size.getWidth() : 360, i11);
            d dVar = (d) this.f9047c.c(i10);
            if ("small_template_1".equalsIgnoreCase(dVar.v())) {
                return new AppLovinSdkUtils.Size(min, z10 ? this.f9045a.getHeight() : 120);
            } else if ("medium_template_1".equalsIgnoreCase(dVar.v())) {
                return new AppLovinSdkUtils.Size(min, (int) (min / (z10 ? this.f9045a.getWidth() / this.f9045a.getHeight() : 1.2d)));
            } else if (z10) {
                return this.f9045a;
            } else {
                if (dVar.u() != null) {
                    View mainView = dVar.u().getMainView();
                    return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
                }
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i10) {
        return this.f9047c.e(i10);
    }

    public int getAdjustedPosition(int i10) {
        return this.f9047c.f(i10);
    }

    public int getOriginalPosition(int i10) {
        return this.f9047c.g(i10);
    }

    public void insertItem(int i10) {
        v vVar = this.logger;
        vVar.b("MaxAdPlacer", "Inserting item at position: " + i10);
        this.f9047c.h(i10);
    }

    public boolean isAdPosition(int i10) {
        return this.f9047c.a(i10);
    }

    public boolean isFilledPosition(int i10) {
        return this.f9047c.b(i10);
    }

    public void loadAds() {
        this.logger.b("MaxAdPlacer", "Loading ads");
        this.f9048d.c();
    }

    public void moveItem(int i10, int i11) {
        this.f9047c.b(i10, i11);
    }

    @Override // com.applovin.impl.mediation.b.a.b.a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f9049e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.mediation.b.a.b.a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f9049e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.mediation.b.a.b.a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        v vVar = this.logger;
        vVar.e("MaxAdPlacer", "Native ad failed to load: " + maxError);
    }

    @Override // com.applovin.impl.mediation.b.a.b.a
    public void onNativeAdLoaded() {
        this.logger.b("MaxAdPlacer", "Native ad enqueued");
        a();
    }

    public void removeItem(final int i10) {
        a(isFilledPosition(i10) ? Collections.singletonList(Integer.valueOf(i10)) : Collections.emptyList(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.3
            @Override // java.lang.Runnable
            public void run() {
                v vVar = MaxAdPlacer.this.logger;
                vVar.b("MaxAdPlacer", "Removing item at position: " + i10);
                MaxAdPlacer.this.f9047c.i(i10);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void renderAd(int r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.b.a.a r0 = r6.f9047c
            com.applovin.mediation.MaxAd r0 = r0.c(r7)
            java.lang.String r1 = "MaxAdPlacer"
            if (r0 != 0) goto L21
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "An ad is not available for position: "
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.b(r1, r7)
            return
        L21:
            r2 = r0
            com.applovin.impl.mediation.a.d r2 = (com.applovin.impl.mediation.a.d) r2
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = r2.u()
            if (r2 == 0) goto L41
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Using pre-rendered ad at position: "
        L33:
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r0.b(r1, r7)
            goto L78
        L41:
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r2 = r6.f9046b
            java.lang.String r3 = "Unable to render ad at position: "
            if (r2 == 0) goto La0
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = new com.applovin.mediation.nativeAds.MaxNativeAdView
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r6.f9046b
            android.content.Context r5 = r8.getContext()
            r2.<init>(r4, r5)
            com.applovin.impl.mediation.b.a.b r4 = r6.f9048d
            boolean r0 = r4.a(r2, r0)
            if (r0 == 0) goto L64
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Rendered ad at position: "
            goto L33
        L64:
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r0.e(r1, r7)
        L78:
            int r7 = r8.getChildCount()
        L7c:
            if (r7 < 0) goto L8c
            android.view.View r0 = r8.getChildAt(r7)
            boolean r0 = r0 instanceof com.applovin.mediation.nativeAds.MaxNativeAdView
            if (r0 == 0) goto L89
            r8.removeViewAt(r7)
        L89:
            int r7 = r7 + (-1)
            goto L7c
        L8c:
            android.view.ViewParent r7 = r2.getParent()
            if (r7 == 0) goto L9b
            android.view.ViewParent r7 = r2.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r2)
        L9b:
            r7 = -1
            r8.addView(r2, r7, r7)
            return
        La0:
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r7)
            java.lang.String r7 = ". If you're using a custom ad template, check that nativeAdViewBinder is set."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.e(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.renderAd(int, android.view.ViewGroup):void");
    }

    public void setAdSize(int i10, int i11) {
        this.f9045a = new AppLovinSdkUtils.Size(i10, i11);
    }

    public void setListener(Listener listener) {
        this.f9049e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f9046b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i10, int i11) {
        this.f9047c.a(i10, i11);
        if (i10 == -1 || i11 == -1) {
            return;
        }
        a();
    }
}
