package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: classes.dex */
public class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f14450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f14451b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f14452c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f14453d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Map f14454e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f14455f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f14456g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Method f14457h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Method f14458i;

        a(List list, Map map, List list2, List list3, Map map2, List list4, List list5, Method method, Method method2) {
            this.f14450a = list;
            this.f14451b = map;
            this.f14452c = list2;
            this.f14453d = list3;
            this.f14454e = map2;
            this.f14455f = list4;
            this.f14456g = list5;
            this.f14457h = method;
            this.f14458i = method2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getReturnType().isPrimitive()) {
                if (method.getReturnType().equals(Void.TYPE)) {
                    Iterator it = this.f14450a.iterator();
                    while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.f14451b))) {
                    }
                    for (Method method2 : this.f14452c) {
                        if (DynamicLoaderFallback.equalsMethods(method, method2) && DynamicLoaderFallback.reportError(obj, this.f14451b)) {
                            return null;
                        }
                    }
                    return null;
                }
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            } else if (method.getReturnType().equals(String.class)) {
                return "";
            } else {
                Object newProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                Iterator it2 = this.f14453d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f14454e.get(obj), (AdListener) objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method method3 : this.f14455f) {
                    if (DynamicLoaderFallback.equalsMethods(method, method3)) {
                        this.f14454e.put(newProxyInstance, obj);
                    }
                }
                for (Method method4 : this.f14456g) {
                    if (DynamicLoaderFallback.equalsMethods(method, method4)) {
                        for (Object obj2 : objArr) {
                            if (obj2 instanceof Ad) {
                                this.f14451b.put(newProxyInstance, (Ad) obj2);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f14457h)) {
                    this.f14451b.put(objArr[1], (Ad) objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f14458i)) {
                    this.f14451b.put(objArr[1], (Ad) objArr[0]);
                }
                return newProxyInstance;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdListener f14459a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ad f14460b;

        b(AdListener adListener, Ad ad2) {
            this.f14459a = adListener;
            this.f14460b = ad2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14459a.onError(this.f14460b, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder."));
        }
    }

    DynamicLoaderFallback() {
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        c cVar = new c(null);
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.c(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(cVar.b());
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(cVar.b());
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.b());
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.b());
        dynamicLoader.createNativeAdApi(null, null);
        Method b10 = cVar.b();
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method b11 = cVar.b();
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.c(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(cVar.b());
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(cVar.b());
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.c(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.b());
        interstitialAdApi.loadAd(null);
        arrayList2.add(cVar.b());
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.c(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.b());
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(cVar.b());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        AdViewApi adViewApi = (AdViewApi) cVar.c(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.b());
        adViewApi.loadAd(null);
        arrayList2.add(cVar.b());
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.b());
        ((AdView.AdViewLoadConfigBuilder) cVar.c(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.c(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.c(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.c(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(cVar.b());
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, b10, b11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad2 = map.get(obj);
        if (adListener != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad2), 500L);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private Method f14461a;

        /* renamed from: b  reason: collision with root package name */
        private final InvocationHandler f14462b;

        /* loaded from: classes.dex */
        class a implements InvocationHandler {
            a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                c.this.f14461a = method;
                return null;
            }
        }

        private c() {
            this.f14462b = new a();
        }

        Method b() {
            return this.f14461a;
        }

        public <T> T c(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f14462b));
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }
}
