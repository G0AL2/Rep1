package com.applovin.impl.mediation.b.a;

import android.content.Context;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes.dex */
public class b extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a  reason: collision with root package name */
    private final int f7338a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxNativeAdLoader f7339b;

    /* renamed from: c  reason: collision with root package name */
    private final Queue<MaxAd> f7340c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f7341d = false;

    /* renamed from: e  reason: collision with root package name */
    private final Object f7342e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private a f7343f;

    /* loaded from: classes.dex */
    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public b(String str, int i10, Context context, a aVar) {
        this.f7338a = i10;
        this.f7343f = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(str, context);
        this.f7339b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
    }

    public void a() {
        this.f7343f = null;
        e();
        this.f7339b.destroy();
    }

    public void a(MaxAd maxAd) {
        this.f7339b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f7339b.render(maxNativeAdView, maxAd);
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f7342e) {
            z10 = !this.f7340c.isEmpty();
        }
        return z10;
    }

    public void c() {
        synchronized (this.f7342e) {
            if (!this.f7341d && this.f7340c.size() < this.f7338a) {
                this.f7341d = true;
                this.f7339b.loadAd();
            }
        }
    }

    public MaxAd d() {
        MaxAd remove;
        synchronized (this.f7342e) {
            remove = this.f7340c.remove();
            c();
        }
        return remove;
    }

    public void e() {
        synchronized (this.f7342e) {
            for (MaxAd maxAd : this.f7340c) {
                a(maxAd);
            }
            this.f7340c.clear();
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f7343f;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f7343f;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f7343f;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f7342e) {
            this.f7340c.add(maxAd);
            this.f7341d = false;
            c();
        }
        a aVar = this.f7343f;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }
}
