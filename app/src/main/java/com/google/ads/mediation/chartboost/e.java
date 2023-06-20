package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.text.TextUtils;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.ChartboostDelegate;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.google.android.gms.ads.AdError;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: ChartboostSingleton.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, WeakReference<com.google.ads.mediation.chartboost.a>> f20494a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, WeakReference<com.google.ads.mediation.chartboost.a>> f20495b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, WeakReference<com.google.ads.mediation.chartboost.a>> f20496c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f20497d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f20498e;

    /* renamed from: f  reason: collision with root package name */
    private static b f20499f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChartboostSingleton.java */
    /* loaded from: classes2.dex */
    public static final class b extends ChartboostDelegate {
        private b() {
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didCacheInterstitial(String str) {
            super.didCacheInterstitial(str);
            com.google.ads.mediation.chartboost.a m10 = e.m(str);
            if (m10 != null) {
                m10.didCacheInterstitial(str);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didCacheRewardedVideo(String str) {
            super.didCacheRewardedVideo(str);
            com.google.ads.mediation.chartboost.a n10 = e.n(str);
            if (n10 != null) {
                n10.didCacheRewardedVideo(str);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didClickInterstitial(String str) {
            super.didClickInterstitial(str);
            com.google.ads.mediation.chartboost.a m10 = e.m(str);
            if (m10 != null) {
                m10.didClickInterstitial(str);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didClickRewardedVideo(String str) {
            super.didClickRewardedVideo(str);
            com.google.ads.mediation.chartboost.a n10 = e.n(str);
            if (n10 != null) {
                n10.didClickRewardedVideo(str);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didCompleteInterstitial(String str) {
            super.didCompleteInterstitial(str);
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didCompleteRewardedVideo(String str, int i10) {
            super.didCompleteRewardedVideo(str, i10);
            com.google.ads.mediation.chartboost.a n10 = e.n(str);
            if (n10 != null) {
                n10.didCompleteRewardedVideo(str, i10);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didDismissInterstitial(String str) {
            super.didDismissInterstitial(str);
            com.google.ads.mediation.chartboost.a m10 = e.m(str);
            if (m10 != null) {
                m10.didDismissInterstitial(str);
            }
            e.f20494a.remove(str);
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didDismissRewardedVideo(String str) {
            super.didDismissRewardedVideo(str);
            com.google.ads.mediation.chartboost.a n10 = e.n(str);
            if (n10 != null) {
                n10.didDismissRewardedVideo(str);
            }
            e.f20495b.remove(str);
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didDisplayInterstitial(String str) {
            super.didDisplayInterstitial(str);
            com.google.ads.mediation.chartboost.a m10 = e.m(str);
            if (m10 != null) {
                m10.didDisplayInterstitial(str);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didDisplayRewardedVideo(String str) {
            super.didDisplayRewardedVideo(str);
            com.google.ads.mediation.chartboost.a n10 = e.n(str);
            if (n10 != null) {
                n10.didDisplayRewardedVideo(str);
            }
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didFailToLoadInterstitial(String str, CBError.CBImpressionError cBImpressionError) {
            super.didFailToLoadInterstitial(str, cBImpressionError);
            com.google.ads.mediation.chartboost.a m10 = e.m(str);
            if (m10 != null) {
                m10.didFailToLoadInterstitial(str, cBImpressionError);
            }
            e.f20494a.remove(str);
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didFailToLoadRewardedVideo(String str, CBError.CBImpressionError cBImpressionError) {
            super.didFailToLoadRewardedVideo(str, cBImpressionError);
            com.google.ads.mediation.chartboost.a n10 = e.n(str);
            if (n10 != null) {
                n10.didFailToLoadRewardedVideo(str, cBImpressionError);
            }
            e.f20495b.remove(str);
        }

        @Override // com.chartboost.sdk.ChartboostDelegate, com.chartboost.sdk.impl.a
        public void didInitialize() {
            super.didInitialize();
            boolean unused = e.f20498e = false;
            boolean unused2 = e.f20497d = true;
            for (WeakReference weakReference : e.f20494a.values()) {
                if (weakReference.get() != null) {
                    ((com.google.ads.mediation.chartboost.a) weakReference.get()).didInitialize();
                }
            }
            for (WeakReference weakReference2 : e.f20495b.values()) {
                if (weakReference2.get() != null) {
                    ((com.google.ads.mediation.chartboost.a) weakReference2.get()).didInitialize();
                }
            }
            for (WeakReference weakReference3 : e.f20496c.values()) {
                if (weakReference3.get() != null) {
                    ((com.google.ads.mediation.chartboost.a) weakReference3.get()).didInitialize();
                }
            }
        }
    }

    private static void h(String str, com.google.ads.mediation.chartboost.a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            return;
        }
        f20496c.put(str, new WeakReference<>(aVar));
    }

    private static void i(String str, com.google.ads.mediation.chartboost.a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            return;
        }
        f20494a.put(str, new WeakReference<>(aVar));
    }

    private static void j(String str, com.google.ads.mediation.chartboost.a aVar) {
        if (TextUtils.isEmpty(str) || aVar == null) {
            return;
        }
        f20495b.put(str, new WeakReference<>(aVar));
    }

    private static com.google.ads.mediation.chartboost.a k(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, WeakReference<com.google.ads.mediation.chartboost.a>> hashMap = f20496c;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).get();
        }
        return null;
    }

    private static b l() {
        if (f20499f == null) {
            f20499f = new b();
        }
        return f20499f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.ads.mediation.chartboost.a m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, WeakReference<com.google.ads.mediation.chartboost.a>> hashMap = f20494a;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.ads.mediation.chartboost.a n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, WeakReference<com.google.ads.mediation.chartboost.a>> hashMap = f20495b;
        if (hashMap.containsKey(str)) {
            return hashMap.get(str).get();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void o(com.google.ads.mediation.chartboost.a aVar) {
        String f10 = aVar.a().f();
        if (Chartboost.hasInterstitial(f10)) {
            aVar.didCacheInterstitial(f10);
        } else {
            Chartboost.cacheInterstitial(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void p(com.google.ads.mediation.chartboost.a aVar) {
        String f10 = aVar.a().f();
        if (Chartboost.hasRewardedVideo(f10)) {
            aVar.didCacheRewardedVideo(f10);
        } else {
            Chartboost.cacheRewardedVideo(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void q(com.google.ads.mediation.chartboost.a aVar) {
        String f10 = aVar.a().f();
        if (TextUtils.isEmpty(f10)) {
            return;
        }
        HashMap<String, WeakReference<com.google.ads.mediation.chartboost.a>> hashMap = f20496c;
        if (hashMap.containsKey(f10) && aVar.equals(hashMap.get(f10).get())) {
            hashMap.remove(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void r(com.google.ads.mediation.chartboost.a aVar) {
        Chartboost.showInterstitial(aVar.a().f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void s(com.google.ads.mediation.chartboost.a aVar) {
        Chartboost.showRewardedVideo(aVar.a().f());
    }

    private static void t(Context context, c cVar, com.google.ads.mediation.chartboost.a aVar) {
        if (cVar.d() != null && !TextUtils.isEmpty(cVar.e())) {
            Chartboost.setFramework(cVar.d(), cVar.e());
        }
        if (f20498e) {
            return;
        }
        if (f20497d) {
            aVar.didInitialize();
            return;
        }
        f20498e = true;
        Chartboost.setDelegate(l());
        Chartboost.startWithAppId(context, cVar.a(), cVar.b());
        Chartboost.setMediation(Chartboost.CBMediation.CBMediationAdMob, Chartboost.getSDKVersion(), "8.4.3.1");
        Chartboost.setLoggingLevel(CBLogging.Level.INTEGRATION);
        Chartboost.setAutoCacheAds(false);
    }

    public static void u(Context context, com.google.ads.mediation.chartboost.a aVar) {
        String f10 = aVar.a().f();
        if (k(f10) != null) {
            aVar.b(new AdError(101, String.format("An ad has already been requested for the location: %s.", f10), "com.google.ads.mediation.chartboost"));
            return;
        }
        h(f10, aVar);
        t(context, aVar.a(), aVar);
    }

    public static void v(Context context, com.google.ads.mediation.chartboost.a aVar) {
        String f10 = aVar.a().f();
        if (m(f10) != null) {
            aVar.b(new AdError(101, String.format("An ad has already been requested for the location: %s.", f10), "com.google.ads.mediation.chartboost"));
            return;
        }
        i(f10, aVar);
        t(context, aVar.a(), aVar);
    }

    public static void w(Context context, com.google.ads.mediation.chartboost.a aVar) {
        String f10 = aVar.a().f();
        if (n(f10) != null) {
            aVar.b(new AdError(101, String.format("An ad has already been requested for the location: %s.", f10), "com.google.ads.mediation.chartboost"));
            return;
        }
        j(f10, aVar);
        t(context, aVar.a(), aVar);
    }
}
