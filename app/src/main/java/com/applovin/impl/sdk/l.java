package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class l implements k.a, AppLovinWebViewActivity.EventListener {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f8513a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference<AppLovinWebViewActivity> f8514b;

    /* renamed from: c  reason: collision with root package name */
    private final m f8515c;

    /* renamed from: d  reason: collision with root package name */
    private final v f8516d;

    /* renamed from: e  reason: collision with root package name */
    private AppLovinUserService.OnConsentDialogDismissListener f8517e;

    /* renamed from: f  reason: collision with root package name */
    private k f8518f;

    /* renamed from: g  reason: collision with root package name */
    private WeakReference<Activity> f8519g;

    /* renamed from: h  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.a f8520h;

    /* renamed from: i  reason: collision with root package name */
    private AtomicBoolean f8521i = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(m mVar) {
        this.f8519g = new WeakReference<>(null);
        this.f8515c = mVar;
        this.f8516d = mVar.A();
        if (mVar.N() != null) {
            this.f8519g = new WeakReference<>(mVar.N());
        }
        m.a(m.M()).a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.l.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                l.this.f8519g = new WeakReference(activity);
            }
        });
        this.f8518f = new k(this, mVar);
    }

    private void a(boolean z10, long j10) {
        g();
        if (z10) {
            a(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(m mVar) {
        if (d()) {
            if (v.a()) {
                v.i("AppLovinSdk", "Consent dialog already showing");
            }
            return false;
        } else if (!com.applovin.impl.sdk.utils.h.a(mVar.L())) {
            if (v.a()) {
                v.i("AppLovinSdk", "No internet available, skip showing of consent dialog");
            }
            return false;
        } else if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.as)).booleanValue()) {
            if (v.a()) {
                this.f8516d.e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        } else if (StringUtils.isValidString((String) mVar.a(com.applovin.impl.sdk.c.b.at))) {
            return true;
        } else {
            if (v.a()) {
                this.f8516d.e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            }
            return false;
        }
    }

    private void g() {
        this.f8515c.af().b(this.f8520h);
        if (d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = f8514b.get();
            f8514b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f8517e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f8517e = null;
                }
            }
        }
    }

    @Override // com.applovin.impl.sdk.k.a
    public void a() {
        final Activity activity = this.f8519g.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.l.5
                @Override // java.lang.Runnable
                public void run() {
                    l.this.a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f8515c.a(com.applovin.impl.sdk.c.b.av)).longValue());
        }
    }

    public void a(final long j10) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.4
            @Override // java.lang.Runnable
            public void run() {
                if (v.a()) {
                    l.this.f8516d.b("ConsentDialogManager", "Scheduling repeating consent alert");
                }
                l.this.f8518f.a(j10, l.this.f8515c, l.this);
            }
        });
    }

    public void a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.3
            @Override // java.lang.Runnable
            public void run() {
                l lVar = l.this;
                if (!lVar.a(lVar.f8515c) || l.f8513a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener2 = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener2 != null) {
                        onConsentDialogDismissListener2.onDismiss();
                        return;
                    }
                    return;
                }
                l.this.f8519g = new WeakReference(activity);
                l.this.f8517e = onConsentDialogDismissListener;
                l.this.f8520h = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.l.3.1
                    @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity2) {
                        if (activity2 instanceof AppLovinWebViewActivity) {
                            if (!l.this.d() || l.f8514b.get() != activity2) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity2;
                                WeakReference unused = l.f8514b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) l.this.f8515c.a(com.applovin.impl.sdk.c.b.at), l.this);
                            }
                            l.f8513a.set(false);
                        }
                    }
                };
                l.this.f8515c.af().a(l.this.f8520h);
                Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, l.this.f8515c.z());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) l.this.f8515c.a(com.applovin.impl.sdk.c.b.au));
                activity.startActivity(intent);
            }
        });
    }

    @Override // com.applovin.impl.sdk.k.a
    public void b() {
    }

    public void c() {
        if (this.f8521i.getAndSet(true)) {
            return;
        }
        final String str = (String) this.f8515c.a(com.applovin.impl.sdk.c.b.at);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.l.2
            @Override // java.lang.Runnable
            public void run() {
                WebView tryToCreateWebView = Utils.tryToCreateWebView(l.this.f8515c.L(), "preloading consent dialog");
                if (tryToCreateWebView == null) {
                    return;
                }
                tryToCreateWebView.loadUrl(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        WeakReference<AppLovinWebViewActivity> weakReference = f8514b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    @Override // com.applovin.sdk.AppLovinWebViewActivity.EventListener
    public void onReceivedEvent(String str) {
        boolean booleanValue;
        m mVar;
        com.applovin.impl.sdk.c.b<Long> bVar;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.f8515c.L());
            g();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.f8515c.L());
            booleanValue = ((Boolean) this.f8515c.a(com.applovin.impl.sdk.c.b.aw)).booleanValue();
            mVar = this.f8515c;
            bVar = com.applovin.impl.sdk.c.b.aB;
        } else if (RNAdsEvents.EVENT_CLOSED.equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f8515c.a(com.applovin.impl.sdk.c.b.ax)).booleanValue();
            mVar = this.f8515c;
            bVar = com.applovin.impl.sdk.c.b.aC;
        } else if (!AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            return;
        } else {
            booleanValue = ((Boolean) this.f8515c.a(com.applovin.impl.sdk.c.b.ay)).booleanValue();
            mVar = this.f8515c;
            bVar = com.applovin.impl.sdk.c.b.aD;
        }
        a(booleanValue, ((Long) mVar.a(bVar)).longValue());
    }
}
