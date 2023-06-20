package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class o implements AppLovinInterstitialAdDialog {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.m f7083a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f7084b;

    /* renamed from: c  reason: collision with root package name */
    private volatile AppLovinAdLoadListener f7085c;

    /* renamed from: d  reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f7086d;

    /* renamed from: e  reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f7087e;

    /* renamed from: f  reason: collision with root package name */
    private volatile AppLovinAdClickListener f7088f;

    /* renamed from: g  reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.e f7089g;

    /* renamed from: h  reason: collision with root package name */
    private volatile e.b f7090h;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f7091i;

    /* renamed from: j  reason: collision with root package name */
    private AppLovinFullscreenAdViewObserver f7092j;

    /* renamed from: k  reason: collision with root package name */
    private com.applovin.impl.adview.activity.b.a f7093k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.adview.o$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f7095a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f7096b;

        AnonymousClass2(Context context, long j10) {
            this.f7095a = context;
            this.f7096b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            new Handler(this.f7095a.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.o.2.1
                @Override // java.lang.Runnable
                public void run() {
                    if (o.this.f7091i == null || o.this.f7092j == null) {
                        if (com.applovin.impl.sdk.v.a()) {
                            o.this.f7083a.A().b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                        }
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        o.this.a(anonymousClass2.f7095a);
                        return;
                    }
                    if (com.applovin.impl.sdk.v.a()) {
                        com.applovin.impl.sdk.v A = o.this.f7083a.A();
                        A.b("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + o.this.f7091i + ")");
                    }
                    o.this.f7091i.setBackgroundColor(-16777216);
                    com.applovin.impl.sdk.ad.e eVar = o.this.f7089g;
                    AppLovinAdClickListener appLovinAdClickListener = o.this.f7088f;
                    AppLovinAdDisplayListener appLovinAdDisplayListener = o.this.f7086d;
                    AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener = o.this.f7087e;
                    o oVar = o.this;
                    com.applovin.impl.adview.activity.b.a.a(eVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener, oVar.f7083a, (Activity) oVar.f(), new a.InterfaceC0111a() { // from class: com.applovin.impl.adview.o.2.1.1
                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0111a
                        public void a(com.applovin.impl.adview.activity.b.a aVar) {
                            o.this.f7093k = aVar;
                            o.this.f7092j.setPresenter(aVar);
                            aVar.a(o.this.f7091i);
                        }

                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0111a
                        public void a(String str, Throwable th) {
                            o.a(o.this.f7089g, o.this.f7086d, str, th, null);
                        }
                    });
                }
            }, this.f7096b);
        }
    }

    public o(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f7083a = appLovinSdk.coreSdk;
        this.f7084b = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i10) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.o.5
            @Override // java.lang.Runnable
            public void run() {
                if (o.this.f7085c != null) {
                    o.this.f7085c.failedToReceiveAd(i10);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Intent intent = new Intent(context, AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f7083a.z());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, Context context) {
        if (this.f7083a.af().b() == null) {
            this.f7083a.T().a(com.applovin.impl.sdk.d.f.f8330m);
        }
        this.f7089g = eVar;
        this.f7090h = this.f7089g.p();
        long max = Math.max(0L, ((Long) this.f7083a.a(com.applovin.impl.sdk.c.b.f8211cl)).longValue());
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v A = this.f7083a.A();
            A.b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(eVar, context, new AnonymousClass2(context, max));
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(eVar.N()) || !eVar.ah() || com.applovin.impl.sdk.utils.h.a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(eVar.ai()).setMessage(eVar.aj()).setPositiveButton(eVar.ak(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.o.3
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        if (com.applovin.impl.sdk.v.a()) {
            com.applovin.impl.sdk.v.c("InterstitialAdDialogWrapper", str, th);
        }
        if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.g) {
            com.applovin.impl.sdk.utils.j.a(appLovinAdDisplayListener, str);
        } else {
            com.applovin.impl.sdk.utils.j.b(appLovinAdDisplayListener, eVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    private void a(AppLovinAd appLovinAd) {
        if (this.f7086d != null) {
            this.f7086d.adHidden(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.o.4
            @Override // java.lang.Runnable
            public void run() {
                if (o.this.f7085c != null) {
                    o.this.f7085c.adReceived(appLovinAd);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context f() {
        return this.f7084b.get();
    }

    public com.applovin.impl.sdk.ad.e a() {
        return this.f7089g;
    }

    protected void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7083a.u().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    public AppLovinAdVideoPlaybackListener b() {
        return this.f7087e;
    }

    public AppLovinAdDisplayListener c() {
        return this.f7086d;
    }

    public AppLovinAdClickListener d() {
        return this.f7088f;
    }

    public void e() {
        this.f7091i = null;
        this.f7092j = null;
        this.f7088f = null;
        this.f7085c = null;
        this.f7087e = null;
        this.f7086d = null;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f7088f = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f7086d = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7085c = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f7087e = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.o.1
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                o.this.b(appLovinAd);
                o.this.showAndRender(appLovinAd);
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i10) {
                o.this.a(i10);
            }
        });
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        Context f10 = f();
        if (f10 == null) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.i("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            }
            a(appLovinAd);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f7083a);
        if (maybeRetrieveNonDummyAd == null) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.i("InterstitialAdDialogWrapper", "Failed to show ad: " + appLovinAd);
            }
            a(appLovinAd);
        } else if (((AppLovinAdImpl) maybeRetrieveNonDummyAd).hasShown() && ((Boolean) this.f7083a.a(com.applovin.impl.sdk.c.b.bZ)).booleanValue()) {
            throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
        } else {
            if (maybeRetrieveNonDummyAd instanceof com.applovin.impl.sdk.ad.e) {
                a((com.applovin.impl.sdk.ad.e) maybeRetrieveNonDummyAd, f10);
                return;
            }
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v A = this.f7083a.A();
                A.e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + maybeRetrieveNonDummyAd + "'");
            }
            a(maybeRetrieveNonDummyAd);
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        if (viewGroup == null || iVar == null) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null containerView or lifecycle");
            }
            a(appLovinAd);
            return;
        }
        this.f7091i = viewGroup;
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(iVar, this, this.f7083a);
        this.f7092j = appLovinFullscreenAdViewObserver;
        iVar.a(appLovinFullscreenAdViewObserver);
        showAndRender(appLovinAd);
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
