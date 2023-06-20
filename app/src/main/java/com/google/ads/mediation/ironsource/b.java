package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IronSourceManager.java */
/* loaded from: classes2.dex */
public class b implements ISDemandOnlyRewardedVideoListener, ISDemandOnlyInterstitialListener {

    /* renamed from: e  reason: collision with root package name */
    private static final b f20693e = new b();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f20694a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, WeakReference<IronSourceMediationAdapter>> f20695b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, WeakReference<IronSourceAdapter>> f20696c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<IronSourceMediationAdapter> f20697d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IronSourceManager.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(AdError adError);

        void b();
    }

    private b() {
        IronSource.setISDemandOnlyRewardedVideoListener(this);
        IronSource.setISDemandOnlyInterstitialListener(this);
    }

    private boolean a(String str) {
        WeakReference<IronSourceAdapter> weakReference = this.f20696c.get(str);
        return weakReference == null || weakReference.get() == null;
    }

    private boolean b(String str) {
        WeakReference<IronSourceMediationAdapter> weakReference = this.f20695b.get(str);
        return weakReference == null || weakReference.get() == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b c() {
        return f20693e;
    }

    private void g(String str, WeakReference<IronSourceAdapter> weakReference) {
        if (weakReference.get() == null) {
            Log.e(com.google.ads.mediation.ironsource.a.f20691a, "IronSource interstitial adapter weak reference has been lost.");
        } else {
            this.f20696c.put(str, weakReference);
        }
    }

    private void h(String str, WeakReference<IronSourceMediationAdapter> weakReference) {
        if (weakReference.get() == null) {
            Log.e(com.google.ads.mediation.ironsource.a.f20691a, "IronSource rewarded adapter weak reference has been lost.");
        } else {
            this.f20695b.put(str, weakReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Context context, String str, a aVar) {
        if (this.f20694a.get()) {
            aVar.b();
        } else if (!(context instanceof Activity)) {
            aVar.a(new AdError(102, "IronSource SDK requires an Activity context to initialize.", IronSourceMediationAdapter.ERROR_DOMAIN));
        } else {
            Activity activity = (Activity) context;
            if (TextUtils.isEmpty(str)) {
                aVar.a(new AdError(101, "Missing or invalid app key.", IronSourceMediationAdapter.ERROR_DOMAIN));
                return;
            }
            IronSource.setMediationType("AdMob310");
            String str2 = com.google.ads.mediation.ironsource.a.f20691a;
            Log.d(str2, "Initializing IronSource SDK with app key: " + str);
            IronSource.initISDemandOnly(activity, str, IronSource.AD_UNIT.INTERSTITIAL, IronSource.AD_UNIT.REWARDED_VIDEO);
            this.f20694a.set(true);
            aVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, IronSourceAdapter ironSourceAdapter) {
        if (TextUtils.isEmpty(str)) {
            ironSourceAdapter.onAdFailedToLoad(new AdError(101, "Missing or invalid instance ID.", IronSourceMediationAdapter.ERROR_DOMAIN));
        } else if (!a(str)) {
            ironSourceAdapter.onAdFailedToLoad(new AdError(103, String.format("An ad is already loading for instance ID: %s", str), IronSourceMediationAdapter.ERROR_DOMAIN));
        } else {
            g(str, new WeakReference<>(ironSourceAdapter));
            IronSource.loadISDemandOnlyInterstitial(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(String str, IronSourceMediationAdapter ironSourceMediationAdapter) {
        if (TextUtils.isEmpty(str)) {
            ironSourceMediationAdapter.onAdFailedToLoad(new AdError(101, "Missing or invalid instance ID.", IronSourceMediationAdapter.ERROR_DOMAIN));
        } else if (!b(str)) {
            ironSourceMediationAdapter.onAdFailedToLoad(new AdError(103, String.format("An ad is already loading for instance ID: %s", str), IronSourceMediationAdapter.ERROR_DOMAIN));
        } else {
            h(str, new WeakReference<>(ironSourceMediationAdapter));
            IronSource.loadISDemandOnlyRewardedVideo(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(String str) {
        IronSource.showISDemandOnlyInterstitial(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(String str, IronSourceMediationAdapter ironSourceMediationAdapter) {
        WeakReference<IronSourceMediationAdapter> weakReference = this.f20695b.get(str);
        if (weakReference != null && weakReference.get() != null && ironSourceMediationAdapter.equals(weakReference.get())) {
            this.f20697d = weakReference;
            IronSource.showISDemandOnlyRewardedVideo(str);
            return;
        }
        ironSourceMediationAdapter.onAdFailedToShow(new AdError(104, "IronSource adapter does not have authority to show this instance.", IronSourceMediationAdapter.ERROR_DOMAIN));
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        IronSourceAdapter ironSourceAdapter;
        WeakReference<IronSourceAdapter> weakReference = this.f20696c.get(str);
        if (weakReference == null || (ironSourceAdapter = weakReference.get()) == null) {
            return;
        }
        ironSourceAdapter.onInterstitialAdClicked(str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        WeakReference<IronSourceAdapter> weakReference = this.f20696c.get(str);
        if (weakReference != null) {
            IronSourceAdapter ironSourceAdapter = weakReference.get();
            if (ironSourceAdapter != null) {
                ironSourceAdapter.onInterstitialAdClosed(str);
            }
            this.f20696c.remove(str);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        WeakReference<IronSourceAdapter> weakReference = this.f20696c.get(str);
        if (weakReference != null) {
            IronSourceAdapter ironSourceAdapter = weakReference.get();
            if (ironSourceAdapter != null) {
                ironSourceAdapter.onInterstitialAdLoadFailed(str, ironSourceError);
            }
            this.f20696c.remove(str);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        IronSourceAdapter ironSourceAdapter;
        WeakReference<IronSourceAdapter> weakReference = this.f20696c.get(str);
        if (weakReference == null || (ironSourceAdapter = weakReference.get()) == null) {
            return;
        }
        ironSourceAdapter.onInterstitialAdOpened(str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        IronSourceAdapter ironSourceAdapter;
        WeakReference<IronSourceAdapter> weakReference = this.f20696c.get(str);
        if (weakReference == null || (ironSourceAdapter = weakReference.get()) == null) {
            return;
        }
        ironSourceAdapter.onInterstitialAdReady(str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        WeakReference<IronSourceAdapter> weakReference = this.f20696c.get(str);
        if (weakReference != null) {
            IronSourceAdapter ironSourceAdapter = weakReference.get();
            if (ironSourceAdapter != null) {
                ironSourceAdapter.onInterstitialAdShowFailed(str, ironSourceError);
            }
            this.f20696c.remove(str);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        WeakReference<IronSourceMediationAdapter> weakReference = this.f20697d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f20697d.get().onRewardedVideoAdClicked(str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        WeakReference<IronSourceMediationAdapter> weakReference = this.f20697d;
        if (weakReference != null && weakReference.get() != null) {
            this.f20697d.get().onRewardedVideoAdClosed(str);
        }
        this.f20695b.remove(str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        WeakReference<IronSourceMediationAdapter> weakReference = this.f20695b.get(str);
        if (weakReference != null) {
            IronSourceMediationAdapter ironSourceMediationAdapter = weakReference.get();
            if (ironSourceMediationAdapter != null) {
                ironSourceMediationAdapter.onRewardedVideoAdLoadFailed(str, ironSourceError);
            }
            this.f20695b.remove(str);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        IronSourceMediationAdapter ironSourceMediationAdapter;
        WeakReference<IronSourceMediationAdapter> weakReference = this.f20695b.get(str);
        if (weakReference == null || (ironSourceMediationAdapter = weakReference.get()) == null) {
            return;
        }
        ironSourceMediationAdapter.onRewardedVideoAdLoadSuccess(str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        WeakReference<IronSourceMediationAdapter> weakReference = this.f20697d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f20697d.get().onRewardedVideoAdOpened(str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        WeakReference<IronSourceMediationAdapter> weakReference = this.f20697d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f20697d.get().onRewardedVideoAdRewarded(str);
    }

    @Override // com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        WeakReference<IronSourceMediationAdapter> weakReference = this.f20697d;
        if (weakReference != null && weakReference.get() != null) {
            this.f20697d.get().onRewardedVideoAdShowFailed(str, ironSourceError);
        }
        this.f20695b.remove(str);
    }
}
