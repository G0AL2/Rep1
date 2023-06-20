package com.ironsource.mediationsdk.adunit.d.a;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1732f;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.b;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.b.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.f;
import com.ironsource.mediationsdk.utils.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class c<Listener extends com.ironsource.mediationsdk.adunit.c.a.b> implements AdapterAdListener, NetworkInitializationListener, com.ironsource.mediationsdk.adunit.b.c, c.a, n.a {

    /* renamed from: a  reason: collision with root package name */
    protected com.ironsource.mediationsdk.adunit.d.a f26924a;

    /* renamed from: b  reason: collision with root package name */
    protected Listener f26925b;

    /* renamed from: c  reason: collision with root package name */
    protected d f26926c;

    /* renamed from: d  reason: collision with root package name */
    protected a f26927d;

    /* renamed from: e  reason: collision with root package name */
    protected Placement f26928e;

    /* renamed from: f  reason: collision with root package name */
    protected AdData f26929f;

    /* renamed from: g  reason: collision with root package name */
    protected Object f26930g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private BaseAdAdapter<?, AdapterAdListener> f26931h;

    /* renamed from: i  reason: collision with root package name */
    private com.ironsource.mediationsdk.model.a f26932i;

    /* renamed from: j  reason: collision with root package name */
    private JSONObject f26933j;

    /* renamed from: k  reason: collision with root package name */
    private String f26934k;

    /* renamed from: l  reason: collision with root package name */
    private Long f26935l;

    /* renamed from: m  reason: collision with root package name */
    private f f26936m;

    /* renamed from: n  reason: collision with root package name */
    private com.ironsource.mediationsdk.b.c f26937n;

    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        SHOWING,
        FAILED
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdAdapter<?, ?> baseAdAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        this.f26924a = aVar;
        this.f26925b = listener;
        this.f26926c = new d(aVar.f26913a, d.b.PROVIDER, this);
        this.f26932i = aVar2;
        this.f26933j = aVar2.f27215b;
        this.f26931h = baseAdAdapter;
        this.f26937n = new com.ironsource.mediationsdk.b.c(this.f26924a.f26916d * 1000);
        a(a.NONE);
    }

    private void a(AdapterErrorType adapterErrorType, int i10, String str, long j10) {
        d dVar = this.f26926c;
        if (dVar != null) {
            if (adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_NO_FILL) {
                dVar.f26838b.b(j10, i10);
            } else if (TextUtils.isEmpty(str)) {
                this.f26926c.f26838b.a(j10, i10);
            } else {
                this.f26926c.f26838b.a(j10, i10, str);
            }
        }
    }

    private boolean a() {
        return this.f26927d == a.INIT_IN_PROGRESS;
    }

    /* JADX WARN: Type inference failed for: r2v38, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    /* JADX WARN: Type inference failed for: r2v39, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    @Override // com.ironsource.mediationsdk.adunit.b.c
    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap hashMap = new HashMap();
        try {
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f26931h;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, baseAdAdapter != null ? baseAdAdapter.getNetworkAdapter().getAdapterVersion() : "");
            BaseAdAdapter<?, AdapterAdListener> baseAdAdapter2 = this.f26931h;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, baseAdAdapter2 != null ? baseAdAdapter2.getNetworkAdapter().getNetworkSDKVersion() : "");
        } catch (Exception unused) {
            IronLog.INTERNAL.error(c("could not get adapter version for event data" + m()));
        }
        hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f26932i.f27214a.getSubProviderId());
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f26932i.f27214a.getAdSourceNameForEvents());
        hashMap.put("instanceType", Integer.valueOf(l()));
        boolean z10 = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f26934k)) {
            hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f26934k);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f26924a.f26917e));
        JSONObject jSONObject = this.f26924a.f26918f;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26924a.f26918f);
        }
        if (!TextUtils.isEmpty(this.f26924a.f26919g)) {
            hashMap.put("auctionId", this.f26924a.f26919g);
        }
        if (bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_NO_FILL && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_OPENED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_CLOSED && bVar != com.ironsource.mediationsdk.adunit.b.b.SHOW_AD && bVar != com.ironsource.mediationsdk.adunit.b.b.SHOW_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_CLICKED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_REWARDED) {
            z10 = false;
        }
        if (z10) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f26924a.f26920h));
            if (!TextUtils.isEmpty(this.f26924a.f26921i)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f26924a.f26921i);
            }
        }
        if (!TextUtils.isEmpty(this.f26924a.f26915c.getCustomNetwork())) {
            hashMap.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, this.f26924a.f26915c.getCustomNetwork());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("to " + aVar));
        this.f26927d = aVar;
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface] */
    public final void a(String str) {
        try {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(c(""));
            boolean z10 = false;
            this.f26926c.f26838b.a(false);
            this.f26935l = null;
            this.f26936m = new f();
            HashMap hashMap = new HashMap();
            hashMap.put(DataKeys.USER_ID, this.f26924a.f26914b);
            hashMap.putAll(com.ironsource.mediationsdk.c.b.a(this.f26933j));
            this.f26929f = new AdData(str, hashMap);
            synchronized (this.f26930g) {
                if (this.f26927d != a.NONE) {
                    z10 = true;
                } else {
                    a(a.INIT_IN_PROGRESS);
                }
            }
            if (z10) {
                String str2 = "loadAd - incorrect state while loading, state = " + this.f26927d;
                ironLog.error(c(str2));
                this.f26926c.f26841e.m(str2);
                onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f26924a.f26913a), str2);
                return;
            }
            this.f26937n.a((c.a) this);
            ?? networkAdapter = this.f26931h.getNetworkAdapter();
            if (networkAdapter != 0) {
                networkAdapter.init(this.f26929f, ContextProvider.getInstance().getApplicationContext(), this);
                return;
            }
            String str3 = "loadAd - network adapter not available " + m();
            ironLog.error(c(str3));
            this.f26926c.f26841e.a(str3);
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f26924a.f26913a), str3);
        } catch (Throwable th) {
            String str4 = "loadAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(c(str4));
            d dVar = this.f26926c;
            if (dVar != null) {
                dVar.f26841e.m(str4);
            }
            onInitFailed(com.ironsource.mediationsdk.adunit.a.a.a(this.f26924a.f26913a), str4);
        }
    }

    @Override // com.ironsource.mediationsdk.b.c.a
    public final void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("state = " + this.f26927d + ", isBidder = " + i()));
        long a10 = f.a(this.f26936m);
        synchronized (this.f26930g) {
            if (!d()) {
                String format = String.format("unexpected timeout for %s, state - %s, error - %s", m(), this.f26927d, Integer.valueOf((int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT));
                d dVar = this.f26926c;
                if (dVar != null) {
                    dVar.f26841e.l(format);
                }
                return;
            }
            a(a.FAILED);
            d dVar2 = this.f26926c;
            if (dVar2 != null) {
                dVar2.f26838b.a(a10, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT);
                this.f26926c.f26838b.a(a10, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, "time out");
            }
            Listener listener = this.f26925b;
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("time out");
            f.a(this.f26936m);
            listener.a(buildLoadFailedError, this);
        }
    }

    public final void b(String str) {
        C1732f.a();
        this.f26934k = C1732f.d(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        String str2 = this.f26924a.f26913a.name() + " - " + m() + " - state = " + this.f26927d;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str2 + " - " + str;
    }

    public void c() {
        BaseAdAdapter<?, AdapterAdListener> baseAdAdapter = this.f26931h;
        if (baseAdAdapter != null) {
            try {
                baseAdAdapter.releaseMemory();
                this.f26931h = null;
            } catch (Exception e10) {
                String str = "Exception while calling adapter.releaseMemory() from " + this.f26932i.f27214a.getProviderName() + " - " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(c(str));
                this.f26926c.f26841e.m(str);
            }
        }
        d dVar = this.f26926c;
        if (dVar != null) {
            dVar.a();
            this.f26926c = null;
        }
        com.ironsource.mediationsdk.b.c cVar = this.f26937n;
        if (cVar != null) {
            cVar.c();
            this.f26937n = null;
        }
    }

    public final boolean d() {
        a aVar = this.f26927d;
        return aVar == a.INIT_IN_PROGRESS || aVar == a.LOADING;
    }

    public final boolean e() {
        return this.f26927d == a.LOADED;
    }

    public final boolean f() {
        return this.f26927d != a.FAILED;
    }

    public final void g() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.f26926c;
        if (dVar != null) {
            dVar.f26840d.a();
        }
    }

    public final Long h() {
        return this.f26935l;
    }

    public final boolean i() {
        return this.f26932i.f27216c;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final int j() {
        return this.f26932i.f27218e;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final String k() {
        return this.f26932i.f27214a.getProviderName();
    }

    public final int l() {
        return this.f26932i.f27217d;
    }

    public final String m() {
        return String.format("%s %s", k(), Integer.valueOf(hashCode()));
    }

    public final String n() {
        return this.f26932i.f27214a.getProviderTypeForReflection();
    }

    public final String o() {
        return this.f26924a.f26919g;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(c(""));
        d dVar = this.f26926c;
        if (dVar != null) {
            dVar.f26840d.d(q());
        }
        this.f26925b.b(this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadFailed(AdapterErrorType adapterErrorType, int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("error = " + i10 + ", " + str));
        com.ironsource.mediationsdk.b.c cVar = this.f26937n;
        if (cVar != null) {
            cVar.d();
        }
        long a10 = f.a(this.f26936m);
        synchronized (this.f26930g) {
            a aVar = this.f26927d;
            if (aVar == a.LOADING) {
                a(adapterErrorType, i10, str, a10);
                a(a.FAILED);
                this.f26925b.a(new IronSourceError(i10, str), this);
            } else if (aVar == a.FAILED) {
                a(adapterErrorType, i10, str, a10);
            } else if (aVar == a.LOADED && adapterErrorType == AdapterErrorType.ADAPTER_ERROR_TYPE_AD_EXPIRED) {
                this.f26935l = Long.valueOf(System.currentTimeMillis());
                d dVar = this.f26926c;
                if (dVar != null) {
                    dVar.f26841e.p(String.format("ad expired for %s", this.f26932i.f27214a.getProviderName()));
                }
            } else {
                String format = String.format("unexpected load failed for %s, state - %s, error - %s, %s", m(), this.f26927d, Integer.valueOf(i10), str);
                d dVar2 = this.f26926c;
                if (dVar2 != null) {
                    dVar2.f26841e.i(format);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdLoadSuccess() {
        IronLog.INTERNAL.verbose(c(""));
        com.ironsource.mediationsdk.b.c cVar = this.f26937n;
        if (cVar != null) {
            cVar.d();
        }
        a aVar = this.f26927d;
        if (aVar == a.LOADING) {
            long a10 = f.a(this.f26936m);
            d dVar = this.f26926c;
            if (dVar != null) {
                dVar.f26838b.a(a10, false);
            }
            a(a.LOADED);
            this.f26925b.a(this);
        } else if (aVar != a.FAILED) {
            String format = String.format("unexpected load success for %s, state - %s", m(), this.f26927d);
            d dVar2 = this.f26926c;
            if (dVar2 != null) {
                dVar2.f26841e.h(format);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitFailed(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c("error = " + i10 + ", " + str));
        if (!a()) {
            if (this.f26927d != a.FAILED) {
                String format = String.format("unexpected init failed for %s, state - %s, error - %s, %s", m(), this.f26927d, Integer.valueOf(i10), str);
                d dVar = this.f26926c;
                if (dVar != null) {
                    dVar.f26841e.e(format);
                    return;
                }
                return;
            }
            return;
        }
        com.ironsource.mediationsdk.b.c cVar = this.f26937n;
        if (cVar != null) {
            cVar.d();
        }
        a(a.FAILED);
        Listener listener = this.f26925b;
        IronSourceError ironSourceError = new IronSourceError(i10, str);
        f.a(this.f26936m);
        listener.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
    public void onInitSuccess() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(c(""));
        if (!a()) {
            if (this.f26927d != a.FAILED) {
                String format = String.format("unexpected init success for %s, state - %s", m(), this.f26927d);
                d dVar = this.f26926c;
                if (dVar != null) {
                    dVar.f26841e.d(format);
                    return;
                }
                return;
            }
            return;
        }
        com.ironsource.mediationsdk.b.c cVar = this.f26937n;
        if (cVar != null) {
            cVar.d();
        }
        a(a.READY_TO_LOAD);
        ironLog.verbose(c(""));
        a(a.LOADING);
        try {
            this.f26937n.a((c.a) this);
            this.f26931h.loadAd(this.f26929f, ContextProvider.getInstance().getCurrentActiveActivity(), this);
        } catch (Throwable th) {
            String str = "unexpected error while calling adapter.loadAd() - " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(c(str));
            d dVar2 = this.f26926c;
            if (dVar2 != null) {
                dVar2.f26841e.m(str);
            }
            onAdLoadFailed(AdapterErrorType.ADAPTER_ERROR_TYPE_INTERNAL, IronSourceError.ERROR_CODE_GENERIC, str);
        }
    }

    public final boolean p() {
        return this.f26927d == a.SHOWING;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String q() {
        Placement placement = this.f26928e;
        return placement == null ? "" : placement.getPlacementName();
    }
}
