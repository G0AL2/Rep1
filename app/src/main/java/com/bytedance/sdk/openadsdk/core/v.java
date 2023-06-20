package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.core.n;
import com.inmobi.media.jh;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TTAdNativeImpl.java */
/* loaded from: classes.dex */
public class v implements TTAdNative {

    /* renamed from: a  reason: collision with root package name */
    private final n f12756a = m.f();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f12757b;

    public v(Context context) {
        this.f12757b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(AdSlot adSlot) {
        a(adSlot);
        com.bytedance.sdk.component.utils.q.a(adSlot.getNativeAdType() == 0, "Request the type of non-native ad, please do not call the setNativeAdType() method");
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative
    public void loadAppOpenAd(final AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, final int i10) {
        final com.bytedance.sdk.openadsdk.core.a.b bVar = new com.bytedance.sdk.openadsdk.core.a.b(appOpenAdListener);
        a(new com.bytedance.sdk.component.f.g("loadSplashAd b") { // from class: com.bytedance.sdk.openadsdk.core.v.6
            @Override // java.lang.Runnable
            public void run() {
                Method a10;
                try {
                    if (v.this.a(bVar) || (a10 = com.bytedance.sdk.component.utils.w.a("com.bytedance.sdk.openadsdk.TTC2Proxy", "load", Context.class, AdSlot.class, TTAdNative.AppOpenAdListener.class, Integer.TYPE)) == null) {
                        return;
                    }
                    a10.invoke(null, v.this.a(), adSlot, bVar, Integer.valueOf(i10));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.l.c("TTAdNativeImpl", "open component maybe not exist, please check", th);
                }
            }
        }, bVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative
    public void loadBannerExpressAd(final AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        final com.bytedance.sdk.openadsdk.core.a.f fVar = new com.bytedance.sdk.openadsdk.core.a.f(nativeExpressAdListener);
        a(new com.bytedance.sdk.component.f.g("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.core.v.5
            @Override // java.lang.Runnable
            public void run() {
                if (v.this.a(fVar)) {
                    return;
                }
                adSlot.setNativeAdType(1);
                adSlot.setDurationSlotType(1);
                com.bytedance.sdk.openadsdk.core.nativeexpress.d.a(v.this.a()).a(adSlot, 1, fVar, jh.DEFAULT_BITMAP_TIMEOUT);
            }
        }, fVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative
    public void loadFeedAd(final AdSlot adSlot, final TTAdNative.FeedAdListener feedAdListener) {
        final com.bytedance.sdk.openadsdk.core.a.c cVar = new com.bytedance.sdk.openadsdk.core.a.c(feedAdListener);
        a(new com.bytedance.sdk.component.f.g("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.core.v.1
            @Override // java.lang.Runnable
            public void run() {
                if (v.this.a(cVar)) {
                    return;
                }
                try {
                    v.this.c(adSlot);
                    try {
                        Method a10 = com.bytedance.sdk.component.utils.w.a("com.bytedance.sdk.openadsdk.TTC5Proxy", "loadFeed", Context.class, AdSlot.class, TTAdNative.FeedAdListener.class);
                        if (a10 != null) {
                            a10.invoke(null, v.this.a(), adSlot, cVar);
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.l.b("TTAdNativeImpl", "feed component maybe not exist, pls check1", th);
                    }
                } catch (Exception unused) {
                    com.bytedance.sdk.component.utils.l.b("Ad Slot not Valid, please check");
                    feedAdListener.onError(-1, "Ad Slot not Valid, please check");
                }
            }
        }, cVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative
    public void loadFullScreenVideoAd(final AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        final com.bytedance.sdk.openadsdk.core.a.d dVar = new com.bytedance.sdk.openadsdk.core.a.d(fullScreenVideoAdListener);
        a(new com.bytedance.sdk.component.f.g("loadFullScreenVideoAd") { // from class: com.bytedance.sdk.openadsdk.core.v.4
            @Override // java.lang.Runnable
            public void run() {
                if (v.this.a(dVar)) {
                    return;
                }
                try {
                    Method a10 = com.bytedance.sdk.component.utils.w.a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadFull", Context.class, AdSlot.class, TTAdNative.FullScreenVideoAdListener.class);
                    if (a10 != null) {
                        a10.invoke(null, v.this.a(), adSlot, dVar);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.l.b("TTAdNativeImpl", "reward component maybe not exist, pls check2", th);
                }
            }
        }, dVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative
    public void loadNativeAd(final AdSlot adSlot, final TTAdNative.NativeAdListener nativeAdListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        adSlot.setDurationSlotType(adSlot.getNativeAdType());
        final com.bytedance.sdk.openadsdk.core.a.e eVar = new com.bytedance.sdk.openadsdk.core.a.e(nativeAdListener);
        a(new com.bytedance.sdk.component.f.g("loadNativeAd") { // from class: com.bytedance.sdk.openadsdk.core.v.2
            @Override // java.lang.Runnable
            public void run() {
                if (v.this.a(eVar)) {
                    return;
                }
                final long currentTimeMillis2 = System.currentTimeMillis();
                try {
                    v.this.b(adSlot);
                    n nVar = v.this.f12756a;
                    AdSlot adSlot2 = adSlot;
                    nVar.a(adSlot2, null, adSlot2.getNativeAdType(), new n.a() { // from class: com.bytedance.sdk.openadsdk.core.v.2.1
                        @Override // com.bytedance.sdk.openadsdk.core.n.a
                        public void a(int i10, String str) {
                            eVar.onError(i10, str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.n.a
                        public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                            if (aVar.b() != null && !aVar.b().isEmpty()) {
                                List<com.bytedance.sdk.openadsdk.core.e.n> b10 = aVar.b();
                                ArrayList arrayList = new ArrayList(b10.size());
                                for (com.bytedance.sdk.openadsdk.core.e.n nVar2 : b10) {
                                    if (nVar2.ao()) {
                                        arrayList.add(new com.bytedance.sdk.openadsdk.core.f.a(v.this.a(), nVar2, adSlot.getNativeAdType()) { // from class: com.bytedance.sdk.openadsdk.core.v.2.1.1
                                        });
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    if (TextUtils.isEmpty(adSlot.getBidAdm())) {
                                        com.bytedance.sdk.openadsdk.b.e.b(v.this.a(), b10.get(0), com.bytedance.sdk.openadsdk.utils.u.b(adSlot.getDurationSlotType()), currentTimeMillis);
                                    } else {
                                        com.bytedance.sdk.openadsdk.b.e.a(b10.get(0), com.bytedance.sdk.openadsdk.utils.u.b(adSlot.getNativeAdType()), System.currentTimeMillis() - currentTimeMillis2);
                                    }
                                    eVar.onNativeAdLoad(arrayList);
                                    return;
                                }
                                eVar.onError(-4, g.a(-4));
                                bVar.a(-4);
                                com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                                return;
                            }
                            eVar.onError(-3, g.a(-3));
                            bVar.a(-3);
                            com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                        }
                    });
                } catch (Exception unused) {
                    com.bytedance.sdk.component.utils.l.b("Ad Slot not Valid, please check");
                    nativeAdListener.onError(-1, "Ad Slot not Valid, please check");
                }
            }
        }, eVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdNative
    public void loadRewardVideoAd(final AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        final com.bytedance.sdk.openadsdk.core.a.g gVar = new com.bytedance.sdk.openadsdk.core.a.g(rewardVideoAdListener);
        a(new com.bytedance.sdk.component.f.g("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.core.v.3
            @Override // java.lang.Runnable
            public void run() {
                if (v.this.a(gVar)) {
                    return;
                }
                try {
                    Method a10 = com.bytedance.sdk.component.utils.w.a("com.bytedance.sdk.openadsdk.TTC3Proxy", "loadReward", Context.class, AdSlot.class, TTAdNative.RewardVideoAdListener.class);
                    if (a10 != null) {
                        a10.invoke(null, v.this.a(), adSlot, gVar);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.l.b("TTAdNativeImpl", "reward component maybe not exist, pls check1", th);
                }
            }
        }, gVar, adSlot);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AdSlot adSlot) {
        a(adSlot);
        com.bytedance.sdk.component.utils.q.a(adSlot.getNativeAdType() > 0, "Must set the type of requesting native ads, currently supports TYPE_BANNER and TYPE_INTERACTION_AD");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context a() {
        if (this.f12757b == null) {
            this.f12757b = m.a();
        }
        return this.f12757b;
    }

    private void a(AdSlot adSlot) {
        com.bytedance.sdk.component.utils.q.a(adSlot.getImgAcceptedWidth() > 0, "Image material size must be set");
        com.bytedance.sdk.component.utils.q.a(adSlot.getImgAcceptedHeight() > 0, "Image material size must be set");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(com.bytedance.sdk.openadsdk.common.b bVar) {
        if (com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return false;
        }
        if (bVar != null) {
            bVar.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
            return true;
        }
        return true;
    }

    private void a(final com.bytedance.sdk.component.f.g gVar, final com.bytedance.sdk.openadsdk.common.b bVar, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.v.7
            @Override // java.lang.Runnable
            public void run() {
                int e10 = k.e();
                if (e10 != 0 && e10 != 2) {
                    com.bytedance.sdk.openadsdk.b.e.a(adSlot);
                    k.c().post(gVar);
                    return;
                }
                com.bytedance.sdk.component.utils.l.e("TTAdNativeImpl", "please exec TTAdSdk.init before load ad");
                com.bytedance.sdk.openadsdk.common.b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.onError(10000, "Please exec TTAdSdk.init before load ad");
                }
            }
        };
        if (com.bytedance.sdk.openadsdk.utils.t.a()) {
            com.bytedance.sdk.component.f.e.a().execute(runnable);
        } else {
            runnable.run();
        }
    }
}
