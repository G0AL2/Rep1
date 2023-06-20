package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.i;
import com.applovin.impl.adview.n;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.b.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.utils.o;
import com.applovin.impl.sdk.utils.q;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.e f6869a;

    /* renamed from: b  reason: collision with root package name */
    protected final m f6870b;

    /* renamed from: c  reason: collision with root package name */
    protected final v f6871c;

    /* renamed from: d  reason: collision with root package name */
    protected final com.applovin.impl.sdk.d.d f6872d;

    /* renamed from: e  reason: collision with root package name */
    protected Activity f6873e;

    /* renamed from: f  reason: collision with root package name */
    protected AppLovinAdView f6874f;

    /* renamed from: g  reason: collision with root package name */
    protected final com.applovin.impl.adview.m f6875g;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f6881m;

    /* renamed from: n  reason: collision with root package name */
    protected AppLovinAdClickListener f6882n;

    /* renamed from: o  reason: collision with root package name */
    protected AppLovinAdDisplayListener f6883o;

    /* renamed from: p  reason: collision with root package name */
    protected AppLovinAdVideoPlaybackListener f6884p;

    /* renamed from: q  reason: collision with root package name */
    protected final com.applovin.impl.sdk.b.b f6885q;

    /* renamed from: r  reason: collision with root package name */
    protected o f6886r;

    /* renamed from: t  reason: collision with root package name */
    private final com.applovin.impl.sdk.utils.a f6888t;

    /* renamed from: u  reason: collision with root package name */
    private final AppLovinBroadcastManager.Receiver f6889u;

    /* renamed from: v  reason: collision with root package name */
    private final h.a f6890v;

    /* renamed from: y  reason: collision with root package name */
    private long f6893y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f6894z;

    /* renamed from: s  reason: collision with root package name */
    private final Handler f6887s = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    protected final long f6876h = SystemClock.elapsedRealtime();

    /* renamed from: w  reason: collision with root package name */
    private final AtomicBoolean f6891w = new AtomicBoolean();

    /* renamed from: x  reason: collision with root package name */
    private final AtomicBoolean f6892x = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    protected long f6877i = -1;
    private int A = 0;
    private final ArrayList<Long> B = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    protected int f6878j = 0;

    /* renamed from: k  reason: collision with root package name */
    protected int f6879k = 0;

    /* renamed from: l  reason: collision with root package name */
    protected int f6880l = h.f8485a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.adview.activity.b.a$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.m f6905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f6906b;

        AnonymousClass7(com.applovin.impl.adview.m mVar, Runnable runnable) {
            this.f6905a = mVar;
            this.f6906b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7.1
                @Override // java.lang.Runnable
                public void run() {
                    q.a(AnonymousClass7.this.f6905a, 400L, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass7.this.f6905a.bringToFront();
                            AnonymousClass7.this.f6906b.run();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0111a {
        void a(a aVar);

        void a(String str, Throwable th);
    }

    /* loaded from: classes.dex */
    private class b implements View.OnClickListener, AppLovinAdClickListener {
        private b() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            if (v.a()) {
                a.this.f6871c.b("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            j.a(a.this.f6882n, appLovinAd);
            a.this.f6872d.b();
            a.this.f6879k++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (view != aVar.f6875g || !((Boolean) aVar.f6870b.a(com.applovin.impl.sdk.c.b.cn)).booleanValue()) {
                if (v.a()) {
                    v vVar = a.this.f6871c;
                    vVar.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            a.c(a.this);
            if (a.this.f6869a.V()) {
                a aVar2 = a.this;
                aVar2.b("javascript:al_onCloseButtonTapped(" + a.this.A + "," + a.this.f6878j + "," + a.this.f6879k + ");");
            }
            List<Integer> t10 = a.this.f6869a.t();
            if (v.a()) {
                v vVar2 = a.this.f6871c;
                vVar2.b("AppLovinFullscreenActivity", "Handling close button tap " + a.this.A + " with multi close delay: " + t10);
            }
            if (t10 == null || t10.size() <= a.this.A) {
                a.this.h();
                return;
            }
            a.this.B.add(Long.valueOf(SystemClock.elapsedRealtime() - a.this.f6877i));
            List<i.a> v10 = a.this.f6869a.v();
            if (v10 != null && v10.size() > a.this.A) {
                a aVar3 = a.this;
                aVar3.f6875g.a(v10.get(aVar3.A));
            }
            if (v.a()) {
                v vVar3 = a.this.f6871c;
                vVar3.b("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + t10.get(a.this.A));
            }
            a.this.f6875g.setVisibility(8);
            a aVar4 = a.this;
            aVar4.a(aVar4.f6875g, t10.get(aVar4.A).intValue(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f6877i = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(final com.applovin.impl.sdk.ad.e eVar, Activity activity, final m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f6869a = eVar;
        this.f6870b = mVar;
        this.f6871c = mVar.A();
        this.f6873e = activity;
        this.f6882n = appLovinAdClickListener;
        this.f6883o = appLovinAdDisplayListener;
        this.f6884p = appLovinAdVideoPlaybackListener;
        com.applovin.impl.sdk.b.b bVar = new com.applovin.impl.sdk.b.b(activity, mVar);
        this.f6885q = bVar;
        bVar.a(this);
        com.applovin.impl.sdk.d.d dVar = new com.applovin.impl.sdk.d.d(eVar, mVar);
        this.f6872d = dVar;
        b bVar2 = new b();
        n nVar = new n(mVar.Y(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f6874f = nVar;
        nVar.setAdClickListener(bVar2);
        this.f6874f.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.impl.adview.activity.b.a.1
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                if (v.a()) {
                    a.this.f6871c.b("AppLovinFullscreenActivity", "Web content rendered");
                }
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                if (v.a()) {
                    a.this.f6871c.b("AppLovinFullscreenActivity", "Closing from WebView");
                }
                a.this.h();
            }
        });
        this.f6874f.getController().a(dVar);
        mVar.u().trackImpression(eVar);
        List<Integer> t10 = eVar.t();
        if (eVar.s() >= 0 || t10 != null) {
            com.applovin.impl.adview.m mVar2 = new com.applovin.impl.adview.m(eVar.u(), activity);
            this.f6875g = mVar2;
            mVar2.setVisibility(8);
            mVar2.setOnClickListener(bVar2);
        } else {
            this.f6875g = null;
        }
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cp)).booleanValue()) {
            this.f6889u = new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.adview.activity.b.a.2
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    mVar.u().trackAppKilled(eVar);
                    mVar.aj().unregisterReceiver(this);
                }
            };
        } else {
            this.f6889u = null;
        }
        if (eVar.al()) {
            this.f6890v = new h.a() { // from class: com.applovin.impl.adview.activity.b.a.3
                @Override // com.applovin.impl.sdk.h.a
                public void a(int i10) {
                    String str;
                    a aVar = a.this;
                    if (aVar.f6880l != h.f8485a) {
                        aVar.f6881m = true;
                    }
                    com.applovin.impl.adview.d s10 = aVar.f6874f.getController().s();
                    if (!h.a(i10) || h.a(a.this.f6880l)) {
                        str = i10 == 2 ? "javascript:al_muteSwitchOff();" : "javascript:al_muteSwitchOff();";
                        a.this.f6880l = i10;
                    }
                    str = "javascript:al_muteSwitchOn();";
                    s10.a(str);
                    a.this.f6880l = i10;
                }
            };
        } else {
            this.f6890v = null;
        }
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.eC)).booleanValue()) {
            this.f6888t = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.activity.b.a.4
                @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity2, Bundle bundle) {
                    if (a.this.f6892x.get()) {
                        return;
                    }
                    if (activity2.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity2.getApplicationContext()))) {
                        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                v.i("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                                try {
                                    a.this.h();
                                } catch (Throwable th) {
                                    v.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
                                    try {
                                        a.this.n();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        });
                    }
                }
            };
        } else {
            this.f6888t = null;
        }
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, m mVar, Activity activity, InterfaceC0111a interfaceC0111a) {
        a bVar;
        boolean z10 = eVar.aH() && Utils.checkExoPlayerEligibility(mVar);
        if (eVar instanceof com.applovin.impl.a.a) {
            if (z10) {
                try {
                    bVar = new c(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th) {
                    if (v.a()) {
                        mVar.A().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    }
                    Utils.isExoPlayerEligible = Boolean.FALSE;
                    try {
                        bVar = new d(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th2) {
                        interfaceC0111a.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + mVar + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    bVar = new d(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    interfaceC0111a.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + mVar + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (!eVar.hasVideoUrl()) {
            try {
                bVar = new com.applovin.impl.adview.activity.b.b(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th4) {
                interfaceC0111a.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + mVar + " and throwable: " + th4.getMessage(), th4);
                return;
            }
        } else if (eVar.aK()) {
            try {
                bVar = new g(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th5) {
                interfaceC0111a.a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + mVar + " and throwable: " + th5.getMessage(), th5);
                return;
            }
        } else if (z10) {
            try {
                bVar = new e(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th6) {
                if (v.a()) {
                    mVar.A().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th6);
                }
                Utils.isExoPlayerEligible = Boolean.FALSE;
                try {
                    bVar = new f(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th7) {
                    interfaceC0111a.a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + mVar + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                bVar = new f(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th8) {
                interfaceC0111a.a("Failed to create FullscreenVideoAdPresenter with sdk: " + mVar + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        bVar.c();
        interfaceC0111a.a(bVar);
    }

    static /* synthetic */ int c(a aVar) {
        int i10 = aVar.A;
        aVar.A = i10 + 1;
        return i10;
    }

    private void c() {
        if (this.f6889u != null) {
            this.f6870b.aj().registerReceiver(this.f6889u, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
        if (this.f6890v != null) {
            this.f6870b.ai().a(this.f6890v);
        }
        if (this.f6888t != null) {
            this.f6870b.af().a(this.f6888t);
        }
    }

    public void a(int i10, KeyEvent keyEvent) {
        if (this.f6871c == null || !v.a()) {
            return;
        }
        v vVar = this.f6871c;
        vVar.c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i10 + ", " + keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i10, boolean z10, boolean z11, long j10) {
        if (this.f6891w.compareAndSet(false, true)) {
            if (this.f6869a.hasVideoUrl() || t()) {
                j.a(this.f6884p, this.f6869a, i10, z11);
            }
            if (this.f6869a.hasVideoUrl()) {
                this.f6872d.c(i10);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6876h;
            this.f6870b.u().trackVideoEnd(this.f6869a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i10, z10);
            long elapsedRealtime2 = this.f6877i != -1 ? SystemClock.elapsedRealtime() - this.f6877i : -1L;
            this.f6870b.u().trackFullScreenAdClosed(this.f6869a, elapsedRealtime2, this.B, j10, this.f6881m, this.f6880l);
            if (v.a()) {
                v vVar = this.f6871c;
                vVar.b("AppLovinFullscreenActivity", "Video ad ended at percent: " + i10 + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j10 + "ms, closeTimeMillis: " + elapsedRealtime2 + "ms");
            }
        }
    }

    public abstract void a(long j10);

    public void a(Configuration configuration) {
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public abstract void a(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(com.applovin.impl.adview.m mVar, long j10, Runnable runnable) {
        if (j10 >= ((Long) this.f6870b.a(com.applovin.impl.sdk.c.b.cm)).longValue()) {
            return;
        }
        this.f6870b.S().a(new z(this.f6870b, new AnonymousClass7(mVar, runnable)), o.a.MAIN, TimeUnit.SECONDS.toMillis(j10), true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Runnable runnable, long j10) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j10, this.f6887s);
    }

    protected void a(String str) {
        if (this.f6869a.W()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final String str, long j10) {
        if (j10 >= 0) {
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.6
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinAdView appLovinAdView;
                    com.applovin.impl.adview.d s10;
                    if (!StringUtils.isValidString(str) || (appLovinAdView = a.this.f6874f) == null || (s10 = appLovinAdView.getController().s()) == null) {
                        return;
                    }
                    s10.a(str);
                }
            }, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z10) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z10, this.f6869a, this.f6870b, this.f6873e);
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (!((Boolean) this.f6870b.a(com.applovin.impl.sdk.c.b.eG)).booleanValue()) {
            this.f6869a.a();
            return;
        }
        throw new IllegalStateException("Missing cached resource(s): " + checkCachedResourcesExist);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z10, long j10) {
        if (this.f6869a.U()) {
            a(z10 ? "javascript:al_mute();" : "javascript:al_unmute();", j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(long j10) {
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.b("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds...");
        }
        this.f6886r = com.applovin.impl.sdk.utils.o.a(j10, this.f6870b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.8
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f6869a.ag().getAndSet(true)) {
                    return;
                }
                a aVar = a.this;
                a.this.f6870b.S().a(new com.applovin.impl.sdk.e.v(aVar.f6869a, aVar.f6870b), o.a.REWARD);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str) {
        a(str, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z10) {
        a(z10, ((Long) this.f6870b.a(com.applovin.impl.sdk.c.b.cC)).longValue());
        j.a(this.f6883o, this.f6869a);
        this.f6870b.ae().a(this.f6869a);
        this.f6870b.ak().a(this.f6869a);
        if (this.f6869a.hasVideoUrl() || t()) {
            j.a(this.f6884p, this.f6869a);
        }
        new com.applovin.impl.adview.activity.b(this.f6873e).a(this.f6869a);
        this.f6872d.a();
        this.f6869a.setHasShown(true);
    }

    public void c(boolean z10) {
        if (v.a()) {
            v vVar = this.f6871c;
            vVar.c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z10);
        }
        a("javascript:al_onWindowFocusChanged( " + z10 + " );");
    }

    public abstract void d();

    public abstract void e();

    public void f() {
        if (v.a()) {
            this.f6871c.c("AppLovinFullscreenActivity", "onResume()");
        }
        this.f6872d.d(SystemClock.elapsedRealtime() - this.f6893y);
        a("javascript:al_onAppResumed();");
        q();
        if (this.f6885q.c()) {
            this.f6885q.a();
        }
    }

    public void g() {
        if (v.a()) {
            this.f6871c.c("AppLovinFullscreenActivity", "onPause()");
        }
        this.f6893y = SystemClock.elapsedRealtime();
        a("javascript:al_onAppPaused();");
        if (this.f6885q.c()) {
            this.f6885q.a();
        }
        p();
    }

    public void h() {
        this.f6894z = true;
        if (v.a()) {
            this.f6871c.c("AppLovinFullscreenActivity", "dismiss()");
        }
        com.applovin.impl.sdk.ad.e eVar = this.f6869a;
        if (eVar != null) {
            eVar.o().e();
        }
        this.f6887s.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f6869a.T());
        n();
        this.f6872d.c();
        if (this.f6889u != null) {
            com.applovin.impl.sdk.utils.o.a(TimeUnit.SECONDS.toMillis(2L), this.f6870b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.5
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f6873e.stopService(new Intent(a.this.f6873e.getApplicationContext(), AppKilledService.class));
                    a.this.f6870b.aj().unregisterReceiver(a.this.f6889u);
                }
            });
        }
        if (this.f6890v != null) {
            this.f6870b.ai().b(this.f6890v);
        }
        if (this.f6888t != null) {
            this.f6870b.af().b(this.f6888t);
        }
        if (o()) {
            this.f6873e.finish();
            return;
        }
        if (v.a()) {
            this.f6870b.A().b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        k();
    }

    public boolean i() {
        return this.f6894z;
    }

    public void j() {
        if (v.a()) {
            this.f6871c.c("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public void k() {
        AppLovinAdView appLovinAdView = this.f6874f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f6874f.destroy();
            this.f6874f = null;
            if ((parent instanceof ViewGroup) && o()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        n();
        this.f6882n = null;
        this.f6883o = null;
        this.f6884p = null;
        this.f6873e = null;
    }

    public void l() {
        if (v.a()) {
            this.f6871c.c("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f6869a.V()) {
            b("javascript:onBackPressed();");
        }
    }

    protected abstract void m();

    protected void n() {
        if (this.f6892x.compareAndSet(false, true)) {
            j.b(this.f6883o, this.f6869a);
            this.f6870b.ae().b(this.f6869a);
            this.f6870b.ak().a();
        }
    }

    protected boolean o() {
        return this.f6873e instanceof AppLovinFullscreenActivity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
        com.applovin.impl.sdk.utils.o oVar = this.f6886r;
        if (oVar != null) {
            oVar.b();
        }
    }

    protected void q() {
        com.applovin.impl.sdk.utils.o oVar = this.f6886r;
        if (oVar != null) {
            oVar.c();
        }
    }

    protected abstract boolean r();

    protected abstract boolean s();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        return AppLovinAdType.INCENTIVIZED == this.f6869a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f6869a.getType();
    }

    protected abstract void u();
}
