package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber {
    private volatile AppLovinAdClickListener A;

    /* renamed from: a  reason: collision with root package name */
    private Context f6981a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f6982b;

    /* renamed from: c  reason: collision with root package name */
    private com.applovin.impl.sdk.m f6983c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAdServiceImpl f6984d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.sdk.v f6985e;

    /* renamed from: f  reason: collision with root package name */
    private AppLovinCommunicator f6986f;

    /* renamed from: g  reason: collision with root package name */
    private AppLovinAdSize f6987g;

    /* renamed from: h  reason: collision with root package name */
    private String f6988h;

    /* renamed from: i  reason: collision with root package name */
    private com.applovin.impl.sdk.d.d f6989i;

    /* renamed from: j  reason: collision with root package name */
    private e f6990j;

    /* renamed from: k  reason: collision with root package name */
    private c f6991k;

    /* renamed from: l  reason: collision with root package name */
    private d f6992l;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f6993m;

    /* renamed from: n  reason: collision with root package name */
    private Runnable f6994n;

    /* renamed from: x  reason: collision with root package name */
    private volatile AppLovinAdLoadListener f7004x;

    /* renamed from: y  reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f7005y;

    /* renamed from: z  reason: collision with root package name */
    private volatile AppLovinAdViewEventListener f7006z;

    /* renamed from: o  reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.e f6995o = null;

    /* renamed from: p  reason: collision with root package name */
    private volatile AppLovinAd f6996p = null;

    /* renamed from: q  reason: collision with root package name */
    private l f6997q = null;

    /* renamed from: r  reason: collision with root package name */
    private l f6998r = null;

    /* renamed from: s  reason: collision with root package name */
    private final AtomicReference<AppLovinAd> f6999s = new AtomicReference<>();

    /* renamed from: t  reason: collision with root package name */
    private final AtomicBoolean f7000t = new AtomicBoolean();

    /* renamed from: u  reason: collision with root package name */
    private volatile boolean f7001u = false;

    /* renamed from: v  reason: collision with root package name */
    private volatile boolean f7002v = false;

    /* renamed from: w  reason: collision with root package name */
    private volatile boolean f7003w = false;
    private volatile g B = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f6992l != null) {
                b.this.f6992l.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.adview.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0112b implements Runnable {
        private RunnableC0112b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f6995o != null) {
                if (b.this.f6992l == null) {
                    if (com.applovin.impl.sdk.v.a()) {
                        com.applovin.impl.sdk.v.i("AppLovinAdView", "Unable to render advertisement for ad #" + b.this.f6995o.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    }
                    com.applovin.impl.sdk.utils.j.a(b.this.f7006z, b.this.f6995o, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    return;
                }
                b.this.x();
                if (com.applovin.impl.sdk.v.a()) {
                    com.applovin.impl.sdk.v vVar = b.this.f6985e;
                    vVar.b("AppLovinAdView", "Rendering advertisement ad for #" + b.this.f6995o.getAdIdNumber() + "...");
                }
                b.b(b.this.f6992l, b.this.f6995o.getSize());
                b.this.f6992l.a(b.this.f6995o);
                if (b.this.f6995o.getSize() != AppLovinAdSize.INTERSTITIAL && !b.this.f7002v) {
                    b bVar = b.this;
                    bVar.f6989i = new com.applovin.impl.sdk.d.d(bVar.f6995o, b.this.f6983c);
                    b.this.f6989i.a();
                    b.this.f6992l.setStatsManagerHelper(b.this.f6989i);
                    b.this.f6995o.setHasShown(true);
                }
                if (b.this.f6992l.getStatsManagerHelper() != null) {
                    b.this.f6992l.getStatsManagerHelper().a(b.this.f6995o.z() ? 0L : 1L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements AppLovinAdLoadListener {

        /* renamed from: a  reason: collision with root package name */
        private final b f7025a;

        c(b bVar, com.applovin.impl.sdk.m mVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (mVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f7025a = bVar;
        }

        private b a() {
            return this.f7025a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            b a10 = a();
            if (a10 != null) {
                a10.b(appLovinAd);
            } else if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i10) {
            b a10 = a();
            if (a10 != null) {
                a10.a(i10);
            }
        }
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.m mVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        this.f6983c = mVar;
        this.f6984d = mVar.u();
        this.f6985e = mVar.A();
        this.f6986f = AppLovinCommunicator.getInstance(context);
        this.f6987g = appLovinAdSize;
        this.f6988h = str;
        if (!(context instanceof AppLovinFullscreenActivity)) {
            context = context.getApplicationContext();
        }
        this.f6981a = context;
        this.f6982b = appLovinAdView;
        this.f6990j = new e(this, mVar);
        this.f6994n = new a();
        this.f6993m = new RunnableC0112b();
        this.f6991k = new c(this, mVar);
        a(appLovinAdSize);
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int applyDimension = label.equals(appLovinAdSize2.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        int applyDimension2 = appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel()) ? -1 : appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(10);
            layoutParams2.addRule(9);
        }
        view.setLayoutParams(layoutParams);
    }

    private void t() {
        com.applovin.impl.sdk.v vVar;
        if (com.applovin.impl.sdk.v.a() && (vVar = this.f6985e) != null) {
            vVar.b("AppLovinAdView", "Destroying...");
        }
        d dVar = this.f6992l;
        if (dVar != null) {
            ViewParent parent = dVar.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f6992l);
            }
            this.f6992l.removeAllViews();
            this.f6992l.loadUrl("about:blank");
            this.f6992l.onPause();
            this.f6992l.destroyDrawingCache();
            this.f6992l.destroy();
            this.f6992l = null;
        }
        this.f7004x = null;
        this.f7005y = null;
        this.A = null;
        this.f7006z = null;
        this.f7002v = true;
    }

    private void u() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f6997q != null) {
                    if (com.applovin.impl.sdk.v.a()) {
                        com.applovin.impl.sdk.v vVar = b.this.f6985e;
                        vVar.b("AppLovinAdView", "Detaching expanded ad: " + b.this.f6997q.a());
                    }
                    b bVar = b.this;
                    bVar.f6998r = bVar.f6997q;
                    b.this.f6997q = null;
                    b bVar2 = b.this;
                    bVar2.a(bVar2.f6987g);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.10
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.sdk.ad.a a10;
                if (b.this.f6998r == null && b.this.f6997q == null) {
                    return;
                }
                if (b.this.f6998r != null) {
                    a10 = b.this.f6998r.a();
                    b.this.f6998r.dismiss();
                    b.this.f6998r = null;
                } else {
                    a10 = b.this.f6997q.a();
                    b.this.f6997q.dismiss();
                    b.this.f6997q = null;
                }
                com.applovin.impl.sdk.utils.j.b(b.this.f7006z, a10, (AppLovinAdView) b.this.f6982b);
            }
        });
    }

    private void w() {
        com.applovin.impl.sdk.d.d dVar = this.f6989i;
        if (dVar != null) {
            dVar.c();
            this.f6989i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.ad.e eVar = this.f6995o;
            com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
            kVar.a().a(eVar).a(r());
            if (!Utils.isBML(eVar.getSize())) {
                kVar.a().a("Fullscreen Ad Properties").b(eVar);
            }
            kVar.a(this.f6983c);
            kVar.a();
            this.f6985e.b("AppLovinAdView", kVar.toString());
        }
    }

    public void a() {
        if (this.f6983c != null && this.f6991k != null && this.f6981a != null && this.f7001u) {
            this.f6984d.loadNextAd(this.f6988h, this.f6987g, this.f6991k);
        } else if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v.g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    void a(final int i10) {
        if (!this.f7002v) {
            a(this.f6994n);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (b.this.f7004x != null) {
                        b.this.f7004x.failedToReceiveAd(i10);
                    }
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.v.a()) {
                        com.applovin.impl.sdk.v.c("AppLovinAdView", "Exception while running app load  callback", th);
                    }
                }
            }
        });
    }

    public void a(final PointF pointF) {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f6997q == null && (b.this.f6995o instanceof com.applovin.impl.sdk.ad.a) && b.this.f6992l != null) {
                    com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) b.this.f6995o;
                    Activity retrieveParentActivity = b.this.f6981a instanceof Activity ? (Activity) b.this.f6981a : Utils.retrieveParentActivity(b.this.f6992l, b.this.f6983c);
                    if (retrieveParentActivity != null) {
                        if (b.this.f6982b != null) {
                            b.this.f6982b.removeView(b.this.f6992l);
                        }
                        b.this.f6997q = new l(aVar, b.this.f6992l, retrieveParentActivity, b.this.f6983c);
                        b.this.f6997q.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.b.6.1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public void onDismiss(DialogInterface dialogInterface) {
                                b.this.k();
                            }
                        });
                        b.this.f6997q.show();
                        com.applovin.impl.sdk.utils.j.a(b.this.f7006z, b.this.f6995o, (AppLovinAdView) b.this.f6982b);
                        if (b.this.f6989i != null) {
                            b.this.f6989i.d();
                        }
                        if (b.this.f6995o.isOpenMeasurementEnabled()) {
                            b.this.f6995o.o().a((View) b.this.f6997q.b());
                            return;
                        }
                        return;
                    }
                    if (com.applovin.impl.sdk.v.a()) {
                        com.applovin.impl.sdk.v.i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                    }
                    Uri j10 = aVar.j();
                    if (j10 != null) {
                        AppLovinAdServiceImpl appLovinAdServiceImpl = b.this.f6984d;
                        AppLovinAdView r10 = b.this.r();
                        b bVar = b.this;
                        appLovinAdServiceImpl.trackAndLaunchClick(aVar, r10, bVar, j10, pointF, bVar.f7003w);
                        if (b.this.f6989i != null) {
                            b.this.f6989i.b();
                        }
                    }
                    b.this.f6992l.a("javascript:al_onFailedExpand();");
                }
            }
        });
    }

    public void a(final WebView webView) {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.4
            @Override // java.lang.Runnable
            public void run() {
                webView.setVisibility(0);
            }
        });
        try {
            if (this.f6995o != this.f6996p) {
                this.f6996p = this.f6995o;
                if (this.f7005y != null) {
                    com.applovin.impl.sdk.utils.j.a(this.f7005y, this.f6995o);
                    this.f6992l.a("javascript:al_onAdViewRendered();");
                }
                if ((this.f6995o instanceof com.applovin.impl.sdk.ad.a) && this.f6995o.isOpenMeasurementEnabled()) {
                    this.f6983c.S().a(new z(this.f6983c, new Runnable() { // from class: com.applovin.impl.adview.b.5
                        @Override // java.lang.Runnable
                        public void run() {
                            b.this.f6995o.o().b(webView);
                            b.this.f6995o.o().a((View) webView);
                            b.this.f6995o.o().c();
                            b.this.f6995o.o().d();
                        }
                    }), o.a.MAIN, 500L);
                }
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.c("AppLovinAdView", "Exception while notifying ad display listener", th);
            }
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
                return;
            }
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.sdk.utils.b.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.coreSdk, appLovinAdSize2, str, context);
            if (com.applovin.impl.sdk.utils.b.b(attributeSet)) {
                a();
            }
        }
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f7006z = appLovinAdViewEventListener;
    }

    public void a(g gVar) {
        this.B = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        if (appLovinAdView != null) {
            this.f6984d.trackAndLaunchClick(eVar, appLovinAdView, this, uri, pointF, this.f7003w);
        } else if (com.applovin.impl.sdk.v.a()) {
            this.f6985e.e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        com.applovin.impl.sdk.utils.j.a(this.A, eVar);
    }

    public void a(com.applovin.impl.sdk.d.d dVar) {
        d dVar2 = this.f6992l;
        if (dVar2 != null) {
            dVar2.setStatsManagerHelper(dVar);
        }
    }

    public void a(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        Utils.validateAdSdkKey(appLovinAd, this.f6983c);
        if (!this.f7001u) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
                return;
            }
            return;
        }
        com.applovin.impl.sdk.ad.e eVar = (com.applovin.impl.sdk.ad.e) Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f6983c);
        if (eVar == null || eVar == this.f6995o) {
            if (eVar == null) {
                if (com.applovin.impl.sdk.v.a()) {
                    this.f6985e.d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v vVar = this.f6985e;
                vVar.d("AppLovinAdView", "Ad #" + eVar.getAdIdNumber() + " is already showing, ignoring");
            }
            if (((Boolean) this.f6983c.a(com.applovin.impl.sdk.c.b.bZ)).booleanValue()) {
                throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
            }
            return;
        }
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar2 = this.f6985e;
            vVar2.b("AppLovinAdView", "Rendering ad #" + eVar.getAdIdNumber() + " (" + eVar.getSize() + ")");
        }
        com.applovin.impl.sdk.utils.j.b(this.f7005y, this.f6995o);
        if (eVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
            w();
        }
        if (this.f6995o != null && this.f6995o.isOpenMeasurementEnabled()) {
            this.f6995o.o().e();
        }
        this.f6999s.set(null);
        this.f6996p = null;
        this.f6995o = eVar;
        if (!this.f7002v && Utils.isBML(this.f6987g)) {
            this.f6983c.u().trackImpression(eVar);
        }
        if (this.f6997q != null) {
            u();
        }
        a(this.f6993m);
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.A = appLovinAdClickListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f7005y = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7004x = appLovinAdLoadListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            d dVar = new d(this.f6990j, this.f6983c, this.f6981a);
            this.f6992l = dVar;
            dVar.setBackgroundColor(0);
            this.f6992l.setWillNotCacheDrawing(false);
            this.f6982b.setBackgroundColor(0);
            this.f6982b.addView(this.f6992l);
            b(this.f6992l, appLovinAdSize);
            if (!this.f7001u) {
                a(this.f6994n);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f6992l.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
                }
            });
            this.f7001u = true;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            }
            this.f7000t.set(true);
        }
    }

    public AppLovinAdSize b() {
        return this.f6987g;
    }

    void b(final AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            if (com.applovin.impl.sdk.v.a()) {
                this.f6985e.e("AppLovinAdView", "No provided when to the view controller");
            }
            a(-1);
            return;
        }
        if (this.f7002v) {
            this.f6999s.set(appLovinAd);
            if (com.applovin.impl.sdk.v.a()) {
                this.f6985e.b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
            }
        } else {
            a(appLovinAd);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.8
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f7000t.compareAndSet(true, false)) {
                    b bVar = b.this;
                    bVar.a(bVar.f6987g);
                }
                try {
                    if (b.this.f7004x != null) {
                        b.this.f7004x.adReceived(appLovinAd);
                    }
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.v.a()) {
                        com.applovin.impl.sdk.v.i("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                    }
                }
            }
        });
    }

    public String c() {
        return this.f6988h;
    }

    public void d() {
        if (!this.f7001u || this.f7002v) {
            return;
        }
        this.f7002v = true;
    }

    public void e() {
        if (this.f7001u) {
            AppLovinAd andSet = this.f6999s.getAndSet(null);
            if (andSet != null) {
                a(andSet);
            }
            this.f7002v = false;
        }
    }

    public void f() {
        if (this.f6992l != null && this.f6997q != null) {
            k();
        }
        t();
    }

    public AppLovinAdViewEventListener g() {
        return this.f7006z;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return b.class.getSimpleName();
    }

    public g h() {
        return this.B;
    }

    public void i() {
        if (com.applovin.impl.sdk.utils.b.a(this.f6992l)) {
            this.f6983c.T().a(com.applovin.impl.sdk.d.f.f8330m);
        }
    }

    public void j() {
        if (this.f7001u) {
            com.applovin.impl.sdk.utils.j.b(this.f7005y, this.f6995o);
            if (this.f6995o != null && this.f6995o.isOpenMeasurementEnabled() && Utils.isBML(this.f6995o.getSize())) {
                this.f6995o.o().e();
            }
            if (this.f6992l == null || this.f6997q == null) {
                if (com.applovin.impl.sdk.v.a()) {
                    this.f6985e.b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.v.a()) {
                this.f6985e.b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
            }
            u();
        }
    }

    public void k() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.7
            @Override // java.lang.Runnable
            public void run() {
                b.this.v();
                if (b.this.f6982b == null || b.this.f6992l == null || b.this.f6992l.getParent() != null) {
                    return;
                }
                b.this.f6982b.addView(b.this.f6992l);
                b.b(b.this.f6992l, b.this.f6995o.getSize());
                if (b.this.f6995o.isOpenMeasurementEnabled()) {
                    b.this.f6995o.o().a((View) b.this.f6992l);
                }
            }
        });
    }

    public void l() {
        if (this.f6997q != null || this.f6998r != null) {
            k();
            return;
        }
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v vVar = this.f6985e;
            vVar.b("AppLovinAdView", "Ad: " + this.f6995o + " closed.");
        }
        a(this.f6994n);
        com.applovin.impl.sdk.utils.j.b(this.f7005y, this.f6995o);
        this.f6995o = null;
    }

    public void m() {
        this.f7003w = true;
    }

    public void n() {
        this.f7003w = false;
    }

    public void o() {
        if (!(this.f6981a instanceof k) || this.f6995o == null) {
            return;
        }
        if (this.f6995o.F() == e.a.DISMISS) {
            ((k) this.f6981a).dismiss();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.this.s().loadUrl("chrome://crash");
                }
            });
        }
    }

    public com.applovin.impl.sdk.ad.e p() {
        return this.f6995o;
    }

    public com.applovin.impl.sdk.m q() {
        return this.f6983c;
    }

    public AppLovinAdView r() {
        return (AppLovinAdView) this.f6982b;
    }

    public d s() {
        return this.f6992l;
    }
}
