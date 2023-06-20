package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.b.c;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class T extends aa implements c.a, BannerSmashListener {

    /* renamed from: a  reason: collision with root package name */
    String f26522a;

    /* renamed from: b  reason: collision with root package name */
    private com.ironsource.mediationsdk.c.b f26523b;

    /* renamed from: j  reason: collision with root package name */
    private com.ironsource.mediationsdk.b.c f26524j;

    /* renamed from: k  reason: collision with root package name */
    private a f26525k;

    /* renamed from: l  reason: collision with root package name */
    private S f26526l;

    /* renamed from: m  reason: collision with root package name */
    private IronSourceBannerLayout f26527m;

    /* renamed from: n  reason: collision with root package name */
    private JSONObject f26528n;

    /* renamed from: o  reason: collision with root package name */
    private int f26529o;

    /* renamed from: p  reason: collision with root package name */
    private String f26530p;

    /* renamed from: q  reason: collision with root package name */
    private com.ironsource.mediationsdk.model.f f26531q;

    /* renamed from: r  reason: collision with root package name */
    private final Object f26532r;

    /* renamed from: s  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.f f26533s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f26534t;

    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        INIT_IN_PROGRESS,
        READY_TO_LOAD,
        LOADING,
        LOADED,
        LOAD_FAILED,
        DESTROYED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(com.ironsource.mediationsdk.c.b bVar, S s10, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2, boolean z10) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getBannerSettings(), IronSource.AD_UNIT.BANNER), abstractAdapter);
        this.f26532r = new Object();
        this.f26525k = a.NONE;
        this.f26523b = bVar;
        this.f26524j = new com.ironsource.mediationsdk.b.c(bVar.f());
        this.f26526l = s10;
        this.f26739h = i10;
        this.f26522a = str;
        this.f26529o = i11;
        this.f26530p = str2;
        this.f26528n = jSONObject;
        this.f26534t = z10;
        this.f26734c.addBannerListener(this);
        if (h()) {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T(com.ironsource.mediationsdk.c.b bVar, S s10, NetworkSettings networkSettings, AbstractAdapter abstractAdapter, int i10, boolean z10) {
        this(bVar, s10, networkSettings, abstractAdapter, i10, "", null, 0, "", z10);
    }

    private void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(r() + "state = " + aVar.name());
        synchronized (this.f26532r) {
            this.f26525k = aVar;
        }
    }

    private void a(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 606) {
            a(this.f26534t ? IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL : IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f26533s))}});
        } else {
            a(this.f26534t ? IronSourceConstants.BN_INSTANCE_RELOAD_ERROR : IronSourceConstants.BN_INSTANCE_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f26533s))}});
        }
        S s10 = this.f26526l;
        if (s10 != null) {
            s10.a(ironSourceError, this);
        }
    }

    private void a(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        if (!a(a.READY_TO_LOAD, a.LOADING)) {
            ironLog.error("wrong state - state = " + this.f26525k);
            return;
        }
        this.f26533s = new com.ironsource.mediationsdk.utils.f();
        a(this.f26534t ? IronSourceConstants.BN_INSTANCE_RELOAD : 3002, (Object[][]) null);
        if (this.f26734c != null) {
            try {
                if (h()) {
                    this.f26734c.loadBannerForBidding(this.f26527m, this.f26737f, this, str);
                } else {
                    this.f26734c.loadBanner(this.f26527m, this.f26737f, this);
                }
            } catch (Exception e10) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("Exception while trying to load banner from " + this.f26734c.getProviderName() + ", exception =  " + e10.getLocalizedMessage());
                e10.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, e10.getLocalizedMessage()));
                a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e10.getLocalizedMessage()}});
            }
        }
    }

    private static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        int i10;
        try {
            String description = iSBannerSize.getDescription();
            char c10 = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            if (c10 == 0) {
                i10 = 1;
            } else if (c10 == 1) {
                i10 = 2;
            } else if (c10 == 2) {
                i10 = 3;
            } else if (c10 != 3) {
                if (c10 != 4) {
                    return;
                }
                map.put("bannerAdSize", 6);
                map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                return;
            } else {
                i10 = 5;
            }
            map.put("bannerAdSize", i10);
        } catch (Exception e10) {
            IronLog.INTERNAL.error(Log.getStackTraceString(e10));
        }
    }

    private static boolean a(int i10) {
        return i10 == 3005 || i10 == 3002 || i10 == 3012 || i10 == 3015 || i10 == 3008 || i10 == 3305 || i10 == 3300 || i10 == 3306 || i10 == 3307 || i10 == 3302 || i10 == 3303 || i10 == 3304 || i10 == 3009;
    }

    private boolean a(a aVar, a aVar2) {
        boolean z10;
        synchronized (this.f26532r) {
            if (this.f26525k == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(r() + "set state from '" + this.f26525k + "' to '" + aVar2 + "'");
                z10 = true;
                this.f26525k = aVar2;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private void b(int i10) {
        a(i10, (Object[][]) null);
    }

    private void f() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(r() + "isBidder = " + h());
        a(a.INIT_IN_PROGRESS);
        g();
        try {
            if (this.f26734c != null) {
                if (h()) {
                    this.f26734c.initBannerForBidding(this.f26523b.a(), this.f26523b.b(), this.f26737f, this);
                } else {
                    this.f26734c.initBanners(this.f26523b.a(), this.f26523b.b(), this.f26737f, this);
                }
            }
        } catch (Throwable th) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to init banner from " + this.f26734c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            onBannerInitFailed(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, th.getLocalizedMessage()));
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
        }
    }

    private void g() {
        if (this.f26734c == null) {
            return;
        }
        try {
            String str = J.a().f26340l;
            if (!TextUtils.isEmpty(str)) {
                this.f26734c.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f26734c.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to set custom params from " + this.f26734c.getProviderName() + ", exception =  " + e10.getLocalizedMessage());
            e10.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_internal)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e10.getLocalizedMessage()}});
        }
    }

    private boolean q() {
        boolean z10;
        synchronized (this.f26532r) {
            z10 = this.f26525k == a.LOADED;
        }
        return z10;
    }

    private String r() {
        return String.format("%s - ", p());
    }

    private boolean s() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f26527m;
        return ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed();
    }

    public final void a() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        a(a.DESTROYED);
        AbstractAdapter abstractAdapter = this.f26734c;
        if (abstractAdapter == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            abstractAdapter.destroyBanner(this.f26735d.f27214a.getBannerSettings());
        } catch (Exception e10) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("Exception while trying to destroy banner from " + this.f26734c.getProviderName() + ", exception =  " + e10.getLocalizedMessage());
            e10.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_destroy)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e10.getLocalizedMessage()}});
        }
        b(IronSourceConstants.BN_INSTANCE_DESTROY);
    }

    public final void a(int i10, Object[][] objArr) {
        Map<String, Object> n10 = n();
        if (s()) {
            n10.put(IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed");
        } else {
            a(n10, this.f26527m.getSize());
        }
        if (!TextUtils.isEmpty(this.f26522a)) {
            n10.put("auctionId", this.f26522a);
        }
        JSONObject jSONObject = this.f26528n;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26528n);
        }
        com.ironsource.mediationsdk.model.f fVar = this.f26531q;
        if (fVar != null) {
            n10.put("placement", fVar.getPlacementName());
        }
        if (a(i10)) {
            com.ironsource.mediationsdk.a.d.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f26529o, this.f26530p);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f26739h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronLog.INTERNAL.error(k() + " smash: BN sendMediationEvent " + Log.getStackTraceString(e10));
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(n10)));
    }

    public final void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.f fVar, String str) {
        S s10;
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        this.f26531q = fVar;
        if (!C1741o.a(ironSourceBannerLayout)) {
            String str2 = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            ironLog.verbose(str2);
            s10 = this.f26526l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, str2);
        } else if (this.f26734c != null) {
            this.f26527m = ironSourceBannerLayout;
            this.f26524j.a((c.a) this);
            try {
                if (h()) {
                    a(str);
                    return;
                } else {
                    f();
                    return;
                }
            } catch (Throwable th) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.error("exception = " + th.getLocalizedMessage());
                th.printStackTrace();
                onBannerAdLoadFailed(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, th.getLocalizedMessage()));
                return;
            }
        } else {
            ironLog.verbose("mAdapter is null");
            s10 = this.f26526l;
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_ADAPTER, "mAdapter is null");
        }
        s10.a(ironSourceError, this);
    }

    @Override // com.ironsource.mediationsdk.b.c.a
    public final void b() {
        IronSourceError ironSourceError;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        a aVar = a.INIT_IN_PROGRESS;
        a aVar2 = a.LOAD_FAILED;
        if (a(aVar, aVar2)) {
            ironLog.verbose("init timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, "Timed out");
        } else if (!a(a.LOADING, aVar2)) {
            ironLog.error("unexpected state - " + this.f26525k);
            return;
        } else {
            ironLog.verbose("load timed out");
            ironSourceError = new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_LOAD_TIMEOUT, "Timed out");
        }
        a(ironSourceError);
    }

    public final Map<String, Object> c() {
        AbstractAdapter abstractAdapter;
        try {
            if (!h() || (abstractAdapter = this.f26734c) == null) {
                return null;
            }
            return abstractAdapter.getBannerBiddingData(this.f26737f);
        } catch (Throwable th) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Exception while trying to getBannerBiddingData from " + this.f26734c.getProviderName() + ", exception =  " + th.getLocalizedMessage());
            th.printStackTrace();
            a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.aa
    public final void d() {
        this.f26524j.c();
        super.d();
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdClicked() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_CLICK, (Object[][]) null);
        S s10 = this.f26526l;
        if (s10 != null) {
            s10.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLeftApplication() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_LEAVE_APP, (Object[][]) null);
        S s10 = this.f26526l;
        if (s10 != null) {
            s10.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoadFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(r() + "error = " + ironSourceError);
        this.f26524j.d();
        if (a(a.LOADING, a.LOAD_FAILED)) {
            a(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose(p());
        this.f26524j.d();
        if (!a(a.LOADING, a.LOADED)) {
            a(this.f26534t ? IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS : IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, (Object[][]) null);
            return;
        }
        a(this.f26534t ? IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS : 3005, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f26533s))}});
        S s10 = this.f26526l;
        if (s10 != null) {
            s10.a(this, view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenDismissed() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, (Object[][]) null);
        S s10 = this.f26526l;
        if (s10 != null) {
            s10.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdScreenPresented() {
        IronLog.INTERNAL.verbose(p());
        a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, (Object[][]) null);
        S s10 = this.f26526l;
        if (s10 != null) {
            s10.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerAdShown() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(p());
        if (q()) {
            a(IronSourceConstants.BN_INSTANCE_SHOW, (Object[][]) null);
            S s10 = this.f26526l;
            if (s10 != null) {
                s10.e(this);
                return;
            }
            return;
        }
        ironLog.warning("wrong state - mState = " + this.f26525k);
        Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1};
        a(IronSourceConstants.TROUBLESHOOTING_BN_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Wrong State - " + this.f26525k}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(r() + "error = " + ironSourceError);
        this.f26524j.d();
        if (!a(a.INIT_IN_PROGRESS, a.NONE)) {
            ironLog.warning("wrong state - mState = " + this.f26525k);
            return;
        }
        S s10 = this.f26526l;
        if (s10 != null) {
            s10.a(new IronSourceError(IronSourceError.ERROR_BN_INSTANCE_INIT_ERROR, "Banner init failed"), this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public final void onBannerInitSuccess() {
        IronLog.INTERNAL.verbose(p());
        if (!a(a.INIT_IN_PROGRESS, a.READY_TO_LOAD) || h()) {
            return;
        }
        if (C1741o.a(this.f26527m)) {
            a((String) null);
        } else {
            this.f26526l.a(new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, this.f26527m == null ? "banner is null" : "banner is destroyed"), this);
        }
    }
}
