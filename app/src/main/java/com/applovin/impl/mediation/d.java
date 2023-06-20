package com.applovin.impl.mediation;

import android.content.Context;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.c.b;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final m f7416a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, b> f7417b = new HashMap(4);

    /* renamed from: c  reason: collision with root package name */
    private final Object f7418c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.a.a> f7419d = new HashMap(4);

    /* renamed from: e  reason: collision with root package name */
    private final Object f7420e = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0115a {

        /* renamed from: a  reason: collision with root package name */
        private final m f7428a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<Context> f7429b;

        /* renamed from: c  reason: collision with root package name */
        private final d f7430c;

        /* renamed from: d  reason: collision with root package name */
        private final b f7431d;

        /* renamed from: e  reason: collision with root package name */
        private final MaxAdFormat f7432e;

        /* renamed from: f  reason: collision with root package name */
        private final Map<String, Object> f7433f;

        /* renamed from: g  reason: collision with root package name */
        private final Map<String, Object> f7434g;

        /* renamed from: h  reason: collision with root package name */
        private final int f7435h;

        private a(Map<String, Object> map, Map<String, Object> map2, b bVar, MaxAdFormat maxAdFormat, d dVar, m mVar, Context context) {
            this.f7428a = mVar;
            this.f7429b = new WeakReference<>(context);
            this.f7430c = dVar;
            this.f7431d = bVar;
            this.f7432e = maxAdFormat;
            this.f7434g = map2;
            this.f7433f = map;
            this.f7435h = CollectionUtils.getBoolean(map2, "disable_auto_retries") ? -1 : (maxAdFormat.isAdViewAd() && CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) ? Math.min(2, ((Integer) mVar.a(com.applovin.impl.sdk.c.a.N)).intValue()) : ((Integer) mVar.a(com.applovin.impl.sdk.c.a.N)).intValue();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (this.f7428a.a(com.applovin.impl.sdk.c.a.O, this.f7432e) && this.f7431d.f7442c < this.f7435h) {
                b.e(this.f7431d);
                final int pow = (int) Math.pow(2.0d, this.f7431d.f7442c);
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.d.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f7434g.put("retry_delay_sec", Integer.valueOf(pow));
                        a.this.f7434g.put("retry_attempt", Integer.valueOf(a.this.f7431d.f7442c));
                        Context context = (Context) a.this.f7429b.get();
                        if (context == null) {
                            context = a.this.f7428a.L();
                        }
                        a.this.f7430c.a(str, a.this.f7432e, a.this.f7433f, a.this.f7434g, context, a.this);
                    }
                }, TimeUnit.SECONDS.toMillis(pow));
                return;
            }
            this.f7431d.f7442c = 0;
            this.f7431d.f7441b.set(false);
            if (this.f7431d.f7443d != null) {
                ((MaxErrorImpl) maxError).setLoadTag(this.f7431d.f7440a);
                j.a(this.f7431d.f7443d, str, maxError);
                this.f7431d.f7443d = null;
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) maxAd;
            aVar.a(this.f7431d.f7440a);
            this.f7431d.f7442c = 0;
            if (this.f7431d.f7443d != null) {
                aVar.g().e().a(this.f7431d.f7443d);
                this.f7431d.f7443d.onAdLoaded(aVar);
                if (aVar.d().endsWith("load")) {
                    this.f7431d.f7443d.onAdRevenuePaid(aVar);
                }
                this.f7431d.f7443d = null;
                if ((this.f7428a.b(com.applovin.impl.sdk.c.a.M).contains(maxAd.getAdUnitId()) || this.f7428a.a(com.applovin.impl.sdk.c.a.L, maxAd.getFormat())) && !this.f7428a.J().a() && !this.f7428a.J().b()) {
                    Context context = this.f7429b.get();
                    if (context == null) {
                        context = this.f7428a.L();
                    }
                    this.f7430c.a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f7433f, this.f7434g, context, this);
                    return;
                }
            } else {
                this.f7430c.a(aVar);
            }
            this.f7431d.f7441b.set(false);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f7440a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicBoolean f7441b;

        /* renamed from: c  reason: collision with root package name */
        private int f7442c;

        /* renamed from: d  reason: collision with root package name */
        private volatile a.InterfaceC0115a f7443d;

        private b(String str) {
            this.f7441b = new AtomicBoolean();
            this.f7440a = str;
        }

        static /* synthetic */ int e(b bVar) {
            int i10 = bVar.f7442c;
            bVar.f7442c = i10 + 1;
            return i10;
        }
    }

    public d(m mVar) {
        this.f7416a = mVar;
    }

    private b a(String str, String str2) {
        String str3;
        b bVar;
        synchronized (this.f7418c) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (StringUtils.isValidString(str2)) {
                str3 = Constants.FILENAME_SEQUENCE_SEPARATOR + str2;
            } else {
                str3 = "";
            }
            sb2.append(str3);
            String sb3 = sb2.toString();
            bVar = this.f7417b.get(sb3);
            if (bVar == null) {
                bVar = new b(str2);
                this.f7417b.put(sb3, bVar);
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.a aVar) {
        synchronized (this.f7420e) {
            if (this.f7419d.containsKey(aVar.getAdUnitId()) && v.a()) {
                v.i("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.f7419d.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final MaxAdFormat maxAdFormat, final Map<String, Object> map, final Map<String, Object> map2, final Context context, final a.InterfaceC0115a interfaceC0115a) {
        this.f7416a.S().a(new com.applovin.impl.mediation.c.b(maxAdFormat, map, context, this.f7416a, new b.a() { // from class: com.applovin.impl.mediation.d.1
            @Override // com.applovin.impl.mediation.c.b.a
            public void a(JSONArray jSONArray) {
                d.this.f7416a.S().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.mediation.c.c(str, maxAdFormat, map, map2, jSONArray, context, d.this.f7416a, interfaceC0115a));
            }
        }), com.applovin.impl.mediation.d.c.a(maxAdFormat));
    }

    private com.applovin.impl.mediation.a.a b(String str) {
        com.applovin.impl.mediation.a.a aVar;
        synchronized (this.f7420e) {
            aVar = this.f7419d.get(str);
            this.f7419d.remove(str);
        }
        return aVar;
    }

    public void a(String str, String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0115a interfaceC0115a) {
        com.applovin.impl.mediation.a.a b10 = (this.f7416a.J().b() || Utils.isDspDemoApp(this.f7416a.L())) ? null : b(str);
        if (b10 != null) {
            b10.a(str2);
            b10.g().e().a(interfaceC0115a);
            interfaceC0115a.onAdLoaded(b10);
            if (b10.d().endsWith("load")) {
                interfaceC0115a.onAdRevenuePaid(b10);
            }
        }
        b a10 = a(str, str2);
        if (a10.f7441b.compareAndSet(false, true)) {
            if (b10 == null) {
                a10.f7443d = interfaceC0115a;
            }
            a(str, maxAdFormat, map, map2, context, new a(map, map2, a10, maxAdFormat, this, this.f7416a, context));
            return;
        }
        if (a10.f7443d != null && a10.f7443d != interfaceC0115a && v.a()) {
            v.h("MediationAdLoadManager", "Attempting to load ad for same ad unit id (" + str + ") while another ad load is already in progress!");
        }
        a10.f7443d = interfaceC0115a;
    }

    public boolean a(String str) {
        boolean z10;
        synchronized (this.f7420e) {
            z10 = this.f7419d.get(str) != null;
        }
        return z10;
    }
}
