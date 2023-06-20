package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements b.a, e.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f7264a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.b f7265b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.mediation.b f7266c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f7267d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.mediation.a.c f7268e;

    /* renamed from: f  reason: collision with root package name */
    private c f7269f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f7270g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7271h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7272i;

    /* renamed from: j  reason: collision with root package name */
    private WeakReference<Activity> f7273j;

    /* renamed from: k  reason: collision with root package name */
    private WeakReference<ViewGroup> f7274k;

    /* renamed from: l  reason: collision with root package name */
    private WeakReference<i> f7275l;
    protected final b listenerWrapper;

    /* loaded from: classes.dex */
    public interface a {
        Activity getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0115a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            j.d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z10 = MaxFullscreenAdImpl.this.f7272i;
            MaxFullscreenAdImpl.this.f7272i = false;
            final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) maxAd;
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd);
                    if (!z10 && cVar.B() && MaxFullscreenAdImpl.this.sdk.I().a(MaxFullscreenAdImpl.this.adUnitId)) {
                        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MaxFullscreenAdImpl.this.f7272i = true;
                                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                                maxFullscreenAdImpl.loadAd(maxFullscreenAdImpl.f7264a.getActivity());
                            }
                        });
                    } else {
                        j.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
                    }
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f7272i = false;
            MaxFullscreenAdImpl.this.f7265b.a();
            j.b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f7272i = false;
            MaxFullscreenAdImpl.this.f7266c.a(maxAd);
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(maxAd);
                    j.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.b();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.2
                @Override // java.lang.Runnable
                public void run() {
                    j.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a((com.applovin.impl.mediation.a.c) maxAd);
            if (MaxFullscreenAdImpl.this.f7270g.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            } else {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!MaxFullscreenAdImpl.this.f7272i) {
                            j.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                            return;
                        }
                        Activity activity = (Activity) MaxFullscreenAdImpl.this.f7273j.get();
                        if (activity == null) {
                            activity = MaxFullscreenAdImpl.this.sdk.an();
                        }
                        Activity activity2 = activity;
                        if (MaxFullscreenAdImpl.this.f7271h) {
                            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                            maxFullscreenAdImpl.showAd(maxFullscreenAdImpl.f7268e.getPlacement(), MaxFullscreenAdImpl.this.f7268e.Z(), (ViewGroup) MaxFullscreenAdImpl.this.f7274k.get(), (i) MaxFullscreenAdImpl.this.f7275l.get(), activity2);
                            return;
                        }
                        MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                        maxFullscreenAdImpl2.showAd(maxFullscreenAdImpl2.f7268e.getPlacement(), MaxFullscreenAdImpl.this.f7268e.Z(), activity2);
                    }
                });
            }
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            j.a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            j.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            j.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            j.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, m mVar) {
        super(str, maxAdFormat, str2, mVar);
        this.f7267d = new Object();
        this.f7268e = null;
        this.f7269f = c.IDLE;
        this.f7270g = new AtomicBoolean();
        this.f7273j = new WeakReference<>(null);
        this.f7274k = new WeakReference<>(null);
        this.f7275l = new WeakReference<>(null);
        this.f7264a = aVar;
        b bVar = new b();
        this.listenerWrapper = bVar;
        this.f7265b = new com.applovin.impl.sdk.b(mVar, this);
        this.f7266c = new com.applovin.impl.mediation.b(mVar, bVar);
        mVar.B().a(this);
        if (v.a()) {
            v.f(str2, "Created new " + str2 + " (" + this + ")");
        }
    }

    private void a() {
        com.applovin.impl.mediation.a.c cVar;
        synchronized (this.f7267d) {
            cVar = this.f7268e;
            this.f7268e = null;
        }
        this.sdk.E().destroyAd(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar) {
        long u10 = cVar.u() - (SystemClock.elapsedRealtime() - cVar.q());
        if (u10 <= TimeUnit.SECONDS.toMillis(2L)) {
            if (v.a()) {
                this.logger.b(this.tag, "Loaded an expired ad, running expire logic...");
            }
            onAdExpired();
            return;
        }
        this.f7268e = cVar;
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Handle ad loaded for regular ad: " + cVar);
            v vVar2 = this.logger;
            String str2 = this.tag;
            vVar2.b(str2, "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(u10) + " seconds from now for " + getAdUnitId() + "...");
        }
        this.f7265b.a(u10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z10;
        v vVar;
        String str;
        String str2;
        String str3;
        String str4;
        c cVar2 = this.f7269f;
        synchronized (this.f7267d) {
            c cVar3 = c.IDLE;
            z10 = true;
            if (cVar2 != cVar3) {
                c cVar4 = c.LOADING;
                if (cVar2 != cVar4) {
                    c cVar5 = c.READY;
                    if (cVar2 != cVar5) {
                        c cVar6 = c.SHOWING;
                        if (cVar2 != cVar6) {
                            if (cVar2 == c.DESTROYED) {
                                if (v.a()) {
                                    str3 = this.tag;
                                    str4 = "No operations are allowed on a destroyed instance";
                                    v.i(str3, str4);
                                }
                            } else if (v.a()) {
                                vVar = this.logger;
                                str = this.tag;
                                str2 = "Unknown state: " + this.f7269f;
                                vVar.e(str, str2);
                            }
                            z10 = false;
                        } else if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                if (v.a()) {
                                    str3 = this.tag;
                                    str4 = "Can not load another ad while the ad is showing";
                                    v.i(str3, str4);
                                }
                                z10 = false;
                            } else if (cVar == cVar5) {
                                if (v.a()) {
                                    vVar = this.logger;
                                    str = this.tag;
                                    str2 = "An ad is already showing, ignoring";
                                    vVar.e(str, str2);
                                }
                                z10 = false;
                            } else {
                                if (cVar == cVar6) {
                                    if (v.a()) {
                                        str3 = this.tag;
                                        str4 = "The ad is already showing, not showing another one";
                                        v.i(str3, str4);
                                    }
                                } else if (cVar != c.DESTROYED) {
                                    if (v.a()) {
                                        vVar = this.logger;
                                        str = this.tag;
                                        str2 = "Unable to transition to: " + cVar;
                                        vVar.e(str, str2);
                                    }
                                }
                                z10 = false;
                            }
                        }
                    } else if (cVar != cVar3) {
                        if (cVar == cVar4) {
                            if (v.a()) {
                                str3 = this.tag;
                                str4 = "An ad is already loaded";
                                v.i(str3, str4);
                            }
                        } else if (cVar == cVar5) {
                            if (v.a()) {
                                vVar = this.logger;
                                str = this.tag;
                                str2 = "An ad is already marked as ready";
                                vVar.e(str, str2);
                            }
                        } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                            if (v.a()) {
                                vVar = this.logger;
                                str = this.tag;
                                str2 = "Unable to transition to: " + cVar;
                                vVar.e(str, str2);
                            }
                        }
                        z10 = false;
                    }
                } else if (cVar != cVar3) {
                    if (cVar == cVar4) {
                        if (v.a()) {
                            str3 = this.tag;
                            str4 = "An ad is already loading";
                            v.i(str3, str4);
                        }
                        z10 = false;
                    } else if (cVar != c.READY) {
                        if (cVar == c.SHOWING) {
                            if (v.a()) {
                                str3 = this.tag;
                                str4 = "An ad is not ready to be shown yet";
                                v.i(str3, str4);
                            }
                        } else if (cVar != c.DESTROYED) {
                            if (v.a()) {
                                vVar = this.logger;
                                str = this.tag;
                                str2 = "Unable to transition to: " + cVar;
                                vVar.e(str, str2);
                            }
                        }
                        z10 = false;
                    }
                }
            } else if (cVar != c.LOADING && cVar != c.DESTROYED) {
                if (cVar == c.SHOWING) {
                    if (v.a()) {
                        str3 = this.tag;
                        str4 = "No ad is loading or loaded";
                        v.i(str3, str4);
                    }
                } else if (v.a()) {
                    vVar = this.logger;
                    str = this.tag;
                    str2 = "Unable to transition to: " + cVar;
                    vVar.e(str, str2);
                }
                z10 = false;
            }
            if (z10) {
                if (v.a()) {
                    this.logger.b(this.tag, "Transitioning from " + this.f7269f + " to " + cVar + "...");
                }
                this.f7269f = cVar;
            } else if (v.a()) {
                this.logger.d(this.tag, "Not allowed transition from " + this.f7269f + " to " + cVar);
            }
        }
        if (!z10 || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f7265b.a();
        a();
        this.sdk.F().b((com.applovin.impl.mediation.a.a) maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        this.f7266c.b(this.f7268e);
        this.f7268e.d(str);
        this.f7268e.e(str2);
        if (v.a()) {
            v vVar = this.logger;
            String str3 = this.tag;
            vVar.b(str3, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f7268e + "...");
        }
        a((com.applovin.impl.mediation.a.a) this.f7268e);
    }

    private boolean a(Activity activity) {
        if (activity != null) {
            if (!isReady()) {
                String str = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
                if (v.a()) {
                    v.i(this.tag, str);
                }
                j.a(this.adListener, (MaxAd) this.f7268e, (MaxError) new MaxErrorImpl(-24, str), true);
                return false;
            }
            if (Utils.getAlwaysFinishActivitiesSetting(activity) != 0 && this.sdk.p().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
                if (Utils.isPubInDebugMode(activity, this.sdk)) {
                    throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                }
                if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.T)).booleanValue()) {
                    if (v.a()) {
                        v.i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    }
                    j.a(this.adListener, (MaxAd) this.f7268e, (MaxError) new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!"), true);
                    return false;
                }
            }
            if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.A)).booleanValue() && (this.sdk.ae().a() || this.sdk.ae().b())) {
                if (v.a()) {
                    v.i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                }
                j.a(this.adListener, (MaxAd) this.f7268e, (MaxError) new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing"), true);
                return false;
            } else if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.B)).booleanValue() && !h.a(activity)) {
                if (v.a()) {
                    v.i(this.tag, "Attempting to show ad with no internet connection");
                }
                j.a(this.adListener, (MaxAd) this.f7268e, (MaxError) new MaxErrorImpl(-1009), true);
                return false;
            } else {
                String str2 = this.sdk.p().getExtraParameters().get("fullscreen_ads_block_showing_if_activity_is_finishing");
                if (((StringUtils.isValidString(str2) && Boolean.valueOf(str2).booleanValue()) || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.C)).booleanValue()) && activity.isFinishing()) {
                    if (v.a()) {
                        v.i(this.tag, "Attempting to show ad when activity is finishing");
                    }
                    j.a(this.adListener, (MaxAd) this.f7268e, (MaxError) new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing"), true);
                    return false;
                }
                return true;
            }
        }
        throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.applovin.impl.mediation.a.c cVar;
        if (this.f7270g.compareAndSet(true, false)) {
            synchronized (this.f7267d) {
                cVar = this.f7268e;
                this.f7268e = null;
            }
            this.sdk.E().destroyAd(cVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f7267d) {
                    if (MaxFullscreenAdImpl.this.f7268e != null) {
                        if (v.a()) {
                            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                            v vVar = maxFullscreenAdImpl.logger;
                            String str = maxFullscreenAdImpl.tag;
                            vVar.b(str, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f7268e + "...");
                        }
                        MaxFullscreenAdImpl.this.sdk.E().destroyAd(MaxFullscreenAdImpl.this.f7268e);
                    }
                }
                MaxFullscreenAdImpl.this.sdk.B().b(MaxFullscreenAdImpl.this);
                MaxFullscreenAdImpl.super.destroy();
            }
        });
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f7267d) {
            com.applovin.impl.mediation.a.c cVar = this.f7268e;
            z10 = cVar != null && cVar.e() && this.f7269f == c.READY;
        }
        return z10;
    }

    public void loadAd(final Activity activity) {
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (!isReady()) {
            a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    Context context = activity;
                    if (context == null) {
                        context = MaxFullscreenAdImpl.this.sdk.an() != null ? MaxFullscreenAdImpl.this.sdk.an() : MaxFullscreenAdImpl.this.sdk.L();
                    }
                    Context context2 = context;
                    MediationServiceImpl E = MaxFullscreenAdImpl.this.sdk.E();
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    E.loadAd(maxFullscreenAdImpl.adUnitId, null, maxFullscreenAdImpl.adFormat, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context2, maxFullscreenAdImpl.listenerWrapper);
                }
            });
            return;
        }
        if (v.a()) {
            v vVar2 = this.logger;
            String str2 = this.tag;
            vVar2.b(str2, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        j.a(this.adListener, (MaxAd) this.f7268e, true);
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired() {
        if (v.a()) {
            v vVar = this.logger;
            String str = this.tag;
            vVar.b(str, "Ad expired " + getAdUnitId());
        }
        this.f7270g.set(true);
        Activity activity = this.f7264a.getActivity();
        if (activity == null && (activity = this.sdk.af().a()) == null) {
            b();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.E().loadAd(this.adUnitId, null, this.adFormat, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
    }

    @Override // com.applovin.impl.sdk.e.a
    public void onCreativeIdGenerated(String str, String str2) {
        com.applovin.impl.mediation.a.c cVar = this.f7268e;
        if (cVar == null || !cVar.f().equalsIgnoreCase(str)) {
            return;
        }
        j.a(this.adReviewListener, str2, this.f7268e);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        if (activity == null) {
            activity = this.sdk.an();
        }
        if (a(activity)) {
            a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(str, str2);
                    MaxFullscreenAdImpl.this.f7271h = false;
                    MaxFullscreenAdImpl.this.f7273j = new WeakReference(activity);
                    MaxFullscreenAdImpl.this.sdk.E().showFullscreenAd(MaxFullscreenAdImpl.this.f7268e, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final i iVar, Activity activity) {
        if (viewGroup == null || iVar == null) {
            if (v.a()) {
                v.i(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            }
            j.a(this.adListener, (MaxAd) this.f7268e, (MaxError) new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle."), true);
            return;
        }
        if (activity == null) {
            activity = this.sdk.an();
        }
        final Activity activity2 = activity;
        if (a(activity2)) {
            a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(str, str2);
                    MaxFullscreenAdImpl.this.f7271h = true;
                    MaxFullscreenAdImpl.this.f7273j = new WeakReference(activity2);
                    MaxFullscreenAdImpl.this.f7274k = new WeakReference(viewGroup);
                    MaxFullscreenAdImpl.this.f7275l = new WeakReference(iVar);
                    MaxFullscreenAdImpl.this.sdk.E().showFullscreenAd(MaxFullscreenAdImpl.this.f7268e, viewGroup, iVar, activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f7264a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }
}
