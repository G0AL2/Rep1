package com.ironsource.mediationsdk.adunit.c;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.j;
import com.ironsource.mediationsdk.C1730d;
import com.ironsource.mediationsdk.C1734h;
import com.ironsource.mediationsdk.C1735i;
import com.ironsource.mediationsdk.C1744r;
import com.ironsource.mediationsdk.C1752z;
import com.ironsource.mediationsdk.D;
import com.ironsource.mediationsdk.InterfaceC1729c;
import com.ironsource.mediationsdk.InterfaceC1733g;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.ac;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBidderInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.b.i;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.ag;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.m;
import com.ironsource.mediationsdk.utils.n;
import com.ironsource.mediationsdk.utils.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class e<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>, Adapter extends BaseAdAdapter<?, ? extends AdapterAdListener>> implements j, com.ironsource.mediationsdk.adunit.b.c, com.ironsource.mediationsdk.adunit.c.a.b, com.ironsource.mediationsdk.adunit.e.b, ag, InterfaceC1729c, InterfaceC1733g {

    /* renamed from: a  reason: collision with root package name */
    protected com.ironsource.mediationsdk.adunit.e.a<Smash> f26878a;

    /* renamed from: b  reason: collision with root package name */
    protected ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> f26879b;

    /* renamed from: c  reason: collision with root package name */
    protected ConcurrentHashMap<String, C1735i.a> f26880c;

    /* renamed from: d  reason: collision with root package name */
    protected C1734h f26881d;

    /* renamed from: e  reason: collision with root package name */
    protected C1735i f26882e;

    /* renamed from: f  reason: collision with root package name */
    protected int f26883f;

    /* renamed from: h  reason: collision with root package name */
    protected JSONObject f26885h;

    /* renamed from: i  reason: collision with root package name */
    protected com.ironsource.mediationsdk.server.b f26886i;

    /* renamed from: j  reason: collision with root package name */
    protected Placement f26887j;

    /* renamed from: l  reason: collision with root package name */
    protected n f26889l;

    /* renamed from: m  reason: collision with root package name */
    protected com.ironsource.mediationsdk.adunit.c.a f26890m;

    /* renamed from: n  reason: collision with root package name */
    protected a f26891n;

    /* renamed from: o  reason: collision with root package name */
    protected c f26892o;

    /* renamed from: p  reason: collision with root package name */
    protected C1752z f26893p;

    /* renamed from: q  reason: collision with root package name */
    protected com.ironsource.mediationsdk.adunit.b.d f26894q;

    /* renamed from: r  reason: collision with root package name */
    protected b f26895r;

    /* renamed from: s  reason: collision with root package name */
    protected IronSourceSegment f26896s;

    /* renamed from: u  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.f f26898u;

    /* renamed from: v  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.f f26899v;

    /* renamed from: w  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.a f26900w;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f26902y;

    /* renamed from: z  reason: collision with root package name */
    private Set<ImpressionDataListener> f26903z;

    /* renamed from: g  reason: collision with root package name */
    protected String f26884g = "";

    /* renamed from: k  reason: collision with root package name */
    protected boolean f26888k = false;

    /* renamed from: t  reason: collision with root package name */
    protected final Object f26897t = new Object();

    /* renamed from: x  reason: collision with root package name */
    private long f26901x = 0;

    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        READY_TO_LOAD,
        AUCTION,
        LOADING,
        READY_TO_SHOW,
        SHOWING
    }

    public e(com.ironsource.mediationsdk.adunit.c.a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        this.f26903z = new HashSet();
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("adUnit = " + aVar.f26856a + ", loading mode = " + aVar.f26863h.f26866a);
        com.ironsource.mediationsdk.utils.f fVar = new com.ironsource.mediationsdk.utils.f();
        this.f26896s = ironSourceSegment;
        this.f26890m = aVar;
        this.f26894q = new com.ironsource.mediationsdk.adunit.b.d(aVar.f26856a, d.b.MEDIATION, this);
        this.f26895r = new b(this.f26890m.f26856a);
        this.f26892o = new c(this.f26890m.f26863h, this);
        a(a.NONE);
        this.f26903z = set;
        com.ironsource.mediationsdk.utils.c cVar = this.f26890m.f26859d;
        this.f26878a = new com.ironsource.mediationsdk.adunit.e.a<>(cVar.f27422o, cVar.f27414g, this);
        this.f26894q.f26837a.a();
        this.f26879b = new ConcurrentHashMap<>();
        this.f26880c = new ConcurrentHashMap<>();
        this.f26887j = null;
        C1744r a10 = C1744r.a();
        com.ironsource.mediationsdk.adunit.c.a aVar2 = this.f26890m;
        a10.a(aVar2.f26856a, aVar2.f26861f);
        this.f26885h = new JSONObject();
        if (this.f26890m.a()) {
            this.f26881d = new C1734h(this.f26890m.f26856a.toString(), this.f26890m.f26859d, this);
        }
        com.ironsource.mediationsdk.adunit.c.a aVar3 = this.f26890m;
        a(aVar3.f26858c, aVar3.f26859d.f27413f);
        k();
        l();
        this.f26898u = new com.ironsource.mediationsdk.utils.f();
        a(a.READY_TO_LOAD);
        this.f26894q.f26837a.a(com.ironsource.mediationsdk.utils.f.a(fVar));
        this.f26893p = new C1752z(aVar.f26864i, this);
        this.f26900w = new com.ironsource.mediationsdk.utils.a();
        if (this.f26890m.f26863h.b()) {
            ironLog.verbose("first automatic load");
            d();
        }
    }

    private static String a(com.ironsource.mediationsdk.server.b bVar, int i10) {
        return String.format("%s%s", Integer.valueOf(i10), bVar.a());
    }

    private String a(List<com.ironsource.mediationsdk.server.b> list, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("waterfall.size() = " + list.size()));
        StringBuilder sb2 = new StringBuilder();
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.ironsource.mediationsdk.server.b bVar = list.get(i10);
            Smash b10 = b(bVar, str);
            if (b10 != null) {
                copyOnWriteArrayList.add(b10);
                sb2.append(a(bVar, b10.l()));
            }
            if (i10 != list.size() - 1) {
                sb2.append(",");
            }
        }
        this.f26878a.a(this.f26890m.f26863h.f26866a, copyOnWriteArrayList, str);
        IronLog.INTERNAL.verbose(a("updateWaterfall() - next waterfall is " + sb2.toString()));
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, boolean z10) {
        a(a.READY_TO_LOAD);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("errorCode = " + i10 + ", errorReason = " + str));
        if (this.f26890m.f26863h.a()) {
            if (z10) {
                this.f26894q.f26838b.a(com.ironsource.mediationsdk.utils.f.a(this.f26899v), i10, str);
            }
            C1744r.a().a(this.f26890m.f26856a, new IronSourceError(i10, str));
        } else {
            if (z10) {
                this.f26894q.f26841e.a(i10, str);
            }
            a(false, false);
        }
        this.f26892o.a();
    }

    private void a(List<NetworkSettings> list, int i10) {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            arrayList.add(networkSettings.getProviderName());
        }
        this.f26882e = new C1735i(arrayList, i10);
    }

    private boolean a(a aVar, a aVar2) {
        boolean z10;
        synchronized (this.f26897t) {
            if (this.f26891n == aVar) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose(a("set state from '" + this.f26891n + "' to '" + aVar2 + "'"));
                z10 = true;
                this.f26891n = aVar2;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(NetworkSettings networkSettings) {
        AdapterBaseInterface a10 = C1730d.a().a(networkSettings, this.f26890m.f26856a);
        return (a10 instanceof AdapterSettingsInterface) && this.f26878a.a(this.f26890m.f26863h.f26866a, networkSettings.getProviderInstanceName(), networkSettings.getProviderTypeForReflection(), ((AdapterSettingsInterface) a10).getLoadWhileShowSupportedState(networkSettings));
    }

    private Smash b(com.ironsource.mediationsdk.server.b bVar, String str) {
        NetworkSettings a10 = this.f26890m.a(bVar.a());
        if (a10 != null) {
            C1730d.a().a(a10, this.f26890m.f26856a);
            Adapter a11 = a(a10, this.f26890m.f26856a);
            if (a11 != null) {
                Smash a12 = a(a10, (NetworkSettings) a11, o.a().b(this.f26890m.f26856a), str);
                this.f26879b.put(a12.k(), bVar);
                this.f26880c.put(bVar.a(), C1735i.a.ISAuctionPerformanceDidntAttemptToLoad);
                return a12;
            }
            String str2 = "addSmashToWaterfall - could not load ad adapter for " + a10.getProviderInstanceName();
            IronLog.INTERNAL.error(a(str2));
            this.f26894q.f26841e.b(str2);
        } else {
            String str3 = "could not find matching provider settings for auction response item - item = " + bVar.a();
            IronLog.INTERNAL.error(a(str3));
            this.f26894q.f26841e.c(str3);
        }
        return null;
    }

    private void c(Smash smash) {
        IronLog.INTERNAL.verbose(a(""));
        String b10 = this.f26879b.get(smash.k()).b();
        smash.b(b10);
        smash.a(b10);
    }

    private boolean i() {
        boolean z10;
        synchronized (this.f26897t) {
            z10 = this.f26891n == a.LOADING;
        }
        return z10;
    }

    private boolean j() {
        boolean z10;
        synchronized (this.f26897t) {
            z10 = this.f26891n == a.AUCTION;
        }
        return z10;
    }

    private void k() {
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : this.f26890m.f26858c) {
            arrayList.add(new m(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f26890m.f26856a)));
        }
        this.f26889l = new n(arrayList);
    }

    private void l() {
        JSONObject jSONObject;
        IronLog.INTERNAL.verbose(a(""));
        for (NetworkSettings networkSettings : this.f26890m.f26858c) {
            if (networkSettings.isIronSource() || networkSettings.isBidder(this.f26890m.f26856a)) {
                HashMap hashMap = new HashMap();
                hashMap.put(DataKeys.USER_ID, this.f26890m.f26857b);
                IronSource.AD_UNIT ad_unit = this.f26890m.f26856a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    jSONObject = networkSettings.getInterstitialSettings();
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    jSONObject = networkSettings.getRewardedVideoSettings();
                } else {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("ad unit not supported - " + this.f26890m.f26856a);
                    jSONObject = new JSONObject();
                }
                hashMap.putAll(com.ironsource.mediationsdk.c.b.a(jSONObject));
                AdData adData = new AdData(null, hashMap);
                AdapterBaseInterface a10 = C1730d.a().a(networkSettings, this.f26890m.f26856a);
                if (a10 != null) {
                    try {
                        a10.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
                    } catch (Exception e10) {
                        i iVar = this.f26894q.f26841e;
                        iVar.a("initNetworks - exception while calling networkAdapter.init - " + e10);
                    }
                } else {
                    this.f26894q.f26841e.a("initNetworks - could not load network adapter");
                }
            }
        }
    }

    private void m() {
        IronLog.INTERNAL.verbose(a(""));
        a(n(), t());
    }

    private List<com.ironsource.mediationsdk.server.b> n() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (NetworkSettings networkSettings : this.f26890m.f26858c) {
            m mVar = new m(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(this.f26890m.f26856a));
            if (!networkSettings.isBidder(this.f26890m.f26856a) && !this.f26889l.b(mVar) && a(networkSettings)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.server.b(mVar.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void o() {
        Iterator<Smash> it = p().iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    private ArrayList<Smash> p() {
        IronLog.INTERNAL.verbose(a("mWaterfall.size() = " + this.f26878a.a().size()));
        ArrayList<Smash> arrayList = new ArrayList<>();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= this.f26878a.a().size() || i11 >= this.f26890m.f26860e) {
                break;
            }
            Smash smash = this.f26878a.a().get(i10);
            if (smash.f()) {
                if (smash.d() || smash.e()) {
                    IronLog.INTERNAL.verbose("smash = " + smash.m());
                } else if (!smash.i()) {
                    arrayList.add(smash);
                } else if (i11 == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + smash.k() + ". No other instances will be loaded at the same time.";
                    IronLog.INTERNAL.verbose(a(str));
                    IronSourceUtils.sendAutomationLog(str);
                    arrayList.add(smash);
                    i11++;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + smash.k() + " as a non bidder is being loaded";
                    IronLog.INTERNAL.verbose(a(str2));
                    IronSourceUtils.sendAutomationLog(str2);
                }
                i11++;
            } else {
                IronLog.INTERNAL.verbose(a(String.format("smash %s is not ready to load", smash.m())));
            }
            i10++;
        }
        if (i11 == 0) {
            a(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "Mediation No fill", true);
        }
        return arrayList;
    }

    private void q() {
        IronLog.INTERNAL.verbose(a(""));
        synchronized (this.f26897t) {
            a aVar = this.f26891n;
            a aVar2 = a.AUCTION;
            if (aVar == aVar2) {
                return;
            }
            a(aVar2);
            long a10 = this.f26890m.f26859d.f27416i - com.ironsource.mediationsdk.utils.f.a(this.f26898u);
            if (a10 > 0) {
                new Timer().schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.adunit.c.e.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        e.this.r();
                    }
                }, a10);
            } else {
                r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        IronLog.INTERNAL.verbose(a(""));
        AsyncTask.execute(new Runnable() { // from class: com.ironsource.mediationsdk.adunit.c.e.2
            @Override // java.lang.Runnable
            public final void run() {
                int i10;
                e.this.f26885h = new JSONObject();
                e.this.f26894q.f26839c.a();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                StringBuilder sb2 = new StringBuilder();
                for (NetworkSettings networkSettings : e.this.f26890m.f26858c) {
                    if (!e.this.f26889l.b(new m(networkSettings.getProviderInstanceName(), networkSettings.getMaxAdsPerSession(e.this.f26890m.f26856a))) && e.this.a(networkSettings)) {
                        if (networkSettings.isBidder(e.this.f26890m.f26856a)) {
                            AdapterBaseInterface a10 = C1730d.a().a(networkSettings, e.this.f26890m.f26856a);
                            if (a10 instanceof AdapterBidderInterface) {
                                try {
                                    Map<String, Object> biddingData = ((AdapterBidderInterface) a10).getBiddingData(ContextProvider.getInstance().getApplicationContext());
                                    if (biddingData != null) {
                                        hashMap.put(networkSettings.getProviderInstanceName(), biddingData);
                                        sb2.append(networkSettings.getInstanceType(e.this.f26890m.f26856a) + networkSettings.getProviderInstanceName() + ",");
                                    } else {
                                        e.this.f26894q.f26841e.a(networkSettings.getProviderDefaultInstance(), a10.getAdapterVersion(), a10.getNetworkSDKVersion(), networkSettings.getSubProviderId(), "Missing bidding data");
                                    }
                                } catch (Exception e10) {
                                    i iVar = e.this.f26894q.f26841e;
                                    iVar.m("exception while calling networkAdapter.getBiddingData - " + e10);
                                }
                            } else {
                                e.this.f26894q.f26841e.a(a10 == null ? "could not load network adapter" : "network adapter does not implementing AdapterBidderInterface");
                            }
                        } else {
                            arrayList.add(networkSettings.getProviderInstanceName());
                            sb2.append(networkSettings.getInstanceType(e.this.f26890m.f26856a) + networkSettings.getProviderInstanceName() + ",");
                        }
                    }
                }
                IronLog ironLog = IronLog.INTERNAL;
                e eVar = e.this;
                ironLog.verbose(eVar.a("auction waterfallString = " + ((Object) sb2)));
                if (hashMap.size() != 0 || arrayList.size() != 0) {
                    e.this.f26894q.f26839c.a(sb2.toString());
                    e eVar2 = e.this;
                    if (eVar2.f26881d == null) {
                        ironLog.error(eVar2.a("mAuctionHandler is null"));
                        return;
                    }
                    int b10 = o.a().b(e.this.f26890m.f26856a);
                    C1734h c1734h = e.this.f26881d;
                    Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                    e eVar3 = e.this;
                    c1734h.a(applicationContext, hashMap, arrayList, eVar3.f26882e, b10, eVar3.f26896s);
                    return;
                }
                ironLog.verbose(e.this.a("auction failed - no candidates"));
                e.this.f26894q.f26839c.a(0L, 1005, "No candidates available for auctioning");
                e eVar4 = e.this;
                IronSource.AD_UNIT ad_unit = eVar4.f26890m.f26856a;
                if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
                    i10 = IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
                } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
                    i10 = IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
                } else {
                    ironLog.warning("ad unit not supported - " + ad_unit);
                    i10 = IronSourceError.ERROR_CODE_GENERIC;
                }
                eVar4.a(i10, "no auction candidates", true);
            }
        });
    }

    private void s() {
        this.f26900w.a(this.f26890m.f26856a, false);
    }

    private static String t() {
        return "fallback_" + System.currentTimeMillis();
    }

    protected abstract Adapter a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit);

    protected abstract Smash a(NetworkSettings networkSettings, Adapter adapter, int i10, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str) {
        String name = this.f26890m.f26856a.name();
        if (TextUtils.isEmpty(str)) {
            return name;
        }
        return name + " - " + str;
    }

    @Override // com.ironsource.mediationsdk.adunit.b.c
    public final Map<String, Object> a(com.ironsource.mediationsdk.adunit.b.b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        boolean z10 = true;
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f26878a.f26947b)) {
            hashMap.put("auctionId", this.f26878a.f26947b);
        }
        JSONObject jSONObject = this.f26885h;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26885h);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(o.a().b(this.f26890m.f26856a)));
        if (bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.LOAD_AD_FAILED_WITH_REASON && bVar != com.ironsource.mediationsdk.adunit.b.b.AUCTION_SUCCESS && bVar != com.ironsource.mediationsdk.adunit.b.b.AUCTION_FAILED && bVar != com.ironsource.mediationsdk.adunit.b.b.AD_UNIT_CAPPED) {
            z10 = false;
        }
        if (z10) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f26883f));
            if (!TextUtils.isEmpty(this.f26884g)) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f26884g);
            }
        }
        return hashMap;
    }

    @Override // com.ironsource.mediationsdk.adunit.e.b
    public final void a(int i10) {
        i iVar = this.f26894q.f26841e;
        iVar.o("waterfalls hold too many with size = " + i10);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1733g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        IronLog ironLog = IronLog.INTERNAL;
        String str3 = "";
        ironLog.verbose(a(""));
        if (!j()) {
            this.f26894q.f26841e.g("unexpected auction fail - error = " + i10 + ", " + str);
            return;
        }
        String str4 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        ironLog.verbose(a(str4));
        StringBuilder sb2 = new StringBuilder();
        IronSource.AD_UNIT ad_unit = this.f26890m.f26856a;
        if (ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO)) {
            str3 = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        } else if (ad_unit.equals(IronSource.AD_UNIT.INTERSTITIAL)) {
            str3 = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        } else if (ad_unit.equals(IronSource.AD_UNIT.BANNER)) {
            str3 = "BN";
        }
        sb2.append(str3);
        sb2.append(": ");
        sb2.append(str4);
        IronSourceUtils.sendAutomationLog(sb2.toString());
        this.f26883f = i11;
        this.f26884g = str2;
        this.f26885h = new JSONObject();
        m();
        this.f26894q.f26839c.a(j10, i10, str);
        a(a.LOADING);
        o();
    }

    public final void a(IronSourceSegment ironSourceSegment) {
        this.f26896s = ironSourceSegment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(a aVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("from " + this.f26891n + " to " + aVar));
        synchronized (this.f26897t) {
            this.f26891n = aVar;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    public final void a(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(cVar.m()));
        if (cVar.o() != this.f26878a.f26947b) {
            String str = "onLoadSuccess was invoked with state = " + this.f26891n + " auctionId: " + cVar.o() + " and the current id is " + this.f26878a.f26947b;
            ironLog.verbose(str);
            this.f26894q.f26841e.h(str);
            return;
        }
        this.f26880c.put(cVar.k(), C1735i.a.ISAuctionPerformanceLoadedSuccessfully);
        if (!a(a.LOADING, a.READY_TO_SHOW)) {
            this.f26894q.f26841e.h(String.format("unexpected load success for smash - %s", cVar.m()));
            return;
        }
        long a10 = com.ironsource.mediationsdk.utils.f.a(this.f26899v);
        com.ironsource.mediationsdk.adunit.c.a aVar = this.f26890m;
        this.f26894q.f26838b.a(a10, aVar.f26856a == IronSource.AD_UNIT.REWARDED_VIDEO && aVar.f26863h.f26866a == a.EnumC0342a.MANUAL);
        if (this.f26890m.f26863h.b()) {
            this.f26893p.a(0L);
        }
        if (this.f26890m.a()) {
            com.ironsource.mediationsdk.server.b bVar = this.f26879b.get(cVar.k());
            if (bVar != null) {
                com.ironsource.mediationsdk.adunit.e.a<Smash> aVar2 = this.f26878a;
                aVar2.a(aVar2.f26947b, bVar.a(""));
                C1734h.a(bVar, cVar.l(), this.f26886i);
                ArrayList arrayList = new ArrayList();
                Iterator<Smash> it = this.f26878a.a().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().k());
                }
                C1734h.a(arrayList, this.f26879b, cVar.l(), this.f26886i, bVar);
            } else {
                String k10 = cVar.k();
                String str2 = "winner instance missing from waterfall - " + k10;
                ironLog.verbose(a(str2));
                this.f26894q.f26841e.a(1010, str2, k10);
            }
        }
        if (!this.f26890m.f26863h.a()) {
            a(true, false);
            return;
        }
        b bVar2 = this.f26895r;
        final AdInfo a11 = this.f26878a.a(cVar.o());
        IronSource.AD_UNIT ad_unit = bVar2.f26865a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            D.a().a(a11);
        } else if (ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            IronLog.INTERNAL.warning("ad unit not supported - " + bVar2.f26865a);
        } else {
            final ac a12 = ac.a();
            RewardedVideoListener rewardedVideoListener = a12.f26760a;
            if (rewardedVideoListener != null && (rewardedVideoListener instanceof RewardedVideoManualListener)) {
                com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a12.f26760a != null) {
                            ((RewardedVideoManualListener) a12.f26760a).onRewardedVideoAdReady();
                            ac.a(a12, "onRewardedVideoAdReady()");
                        }
                    }
                });
            }
            LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = a12.f26761b;
            if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
                return;
            }
            com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.ac.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (a12.f26761b != null) {
                        ((LevelPlayRewardedVideoManualListener) a12.f26761b).onAdReady(a12.f(a11));
                        IronLog ironLog2 = IronLog.CALLBACK;
                        ironLog2.info("onAdReady() adInfo = " + a12.f(a11));
                    }
                }
            });
        }
    }

    public final void a(ImpressionDataListener impressionDataListener) {
        this.f26903z.add(impressionDataListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[LOOP:0: B:18:0x0087->B:20:0x008d, LOOP_END] */
    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError r6, com.ironsource.mediationsdk.adunit.d.a.c<?> r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r5.f26897t
            monitor-enter(r1)
            com.ironsource.mediationsdk.logger.IronLog r2 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            r3.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = r7.m()     // Catch: java.lang.Throwable -> Lcc
            r3.append(r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = " - error = "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lcc
            r3.append(r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = r5.a(r3)     // Catch: java.lang.Throwable -> Lcc
            r2.verbose(r3)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = r7.o()     // Catch: java.lang.Throwable -> Lcc
            com.ironsource.mediationsdk.adunit.e.a<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>> r4 = r5.f26878a     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = r4.f26947b     // Catch: java.lang.Throwable -> Lcc
            if (r3 != r4) goto L98
            com.ironsource.mediationsdk.adunit.c.e$a r3 = r5.f26891n     // Catch: java.lang.Throwable -> Lcc
            com.ironsource.mediationsdk.adunit.c.e$a r4 = com.ironsource.mediationsdk.adunit.c.e.a.AUCTION     // Catch: java.lang.Throwable -> Lcc
            if (r3 != r4) goto L3a
            goto L98
        L3a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.i$a> r2 = r5.f26880c     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = r7.k()     // Catch: java.lang.Throwable -> Lcc
            com.ironsource.mediationsdk.i$a r4 = com.ironsource.mediationsdk.C1735i.a.ISAuctionPerformanceFailedToLoad     // Catch: java.lang.Throwable -> Lcc
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Lcc
            boolean r2 = r5.i()     // Catch: java.lang.Throwable -> Lcc
            if (r2 != 0) goto L7e
            boolean r2 = r5.f()     // Catch: java.lang.Throwable -> Lcc
            if (r2 == 0) goto L52
            goto L7e
        L52:
            com.ironsource.mediationsdk.adunit.b.d r2 = r5.f26894q     // Catch: java.lang.Throwable -> Lcc
            com.ironsource.mediationsdk.adunit.b.i r2 = r2.f26841e     // Catch: java.lang.Throwable -> Lcc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = "unexpected load failed for state - "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lcc
            com.ironsource.mediationsdk.adunit.c.e$a r4 = r5.f26891n     // Catch: java.lang.Throwable -> Lcc
            r3.append(r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = " smash - "
            r3.append(r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = r7.m()     // Catch: java.lang.Throwable -> Lcc
            r3.append(r7)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = ", error - "
            r3.append(r7)     // Catch: java.lang.Throwable -> Lcc
            r3.append(r6)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> Lcc
            r2.i(r6)     // Catch: java.lang.Throwable -> Lcc
            goto L82
        L7e:
            java.util.ArrayList r0 = r5.p()     // Catch: java.lang.Throwable -> Lcc
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lcc
            java.util.Iterator r6 = r0.iterator()
        L87:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L97
            java.lang.Object r7 = r6.next()
            com.ironsource.mediationsdk.adunit.d.a.c r7 = (com.ironsource.mediationsdk.adunit.d.a.c) r7
            r5.c(r7)
            goto L87
        L97:
            return
        L98:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = "onAdLoadFailed was invoked with state ="
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lcc
            com.ironsource.mediationsdk.adunit.c.e$a r0 = r5.f26891n     // Catch: java.lang.Throwable -> Lcc
            r6.append(r0)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r0 = " auctionId: "
            r6.append(r0)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = r7.o()     // Catch: java.lang.Throwable -> Lcc
            r6.append(r7)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = " and the current id is "
            r6.append(r7)     // Catch: java.lang.Throwable -> Lcc
            com.ironsource.mediationsdk.adunit.e.a<Smash extends com.ironsource.mediationsdk.adunit.d.a.c<?>> r7 = r5.f26878a     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r7 = r7.f26947b     // Catch: java.lang.Throwable -> Lcc
            r6.append(r7)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lcc
            r2.verbose(r6)     // Catch: java.lang.Throwable -> Lcc
            com.ironsource.mediationsdk.adunit.b.d r7 = r5.f26894q     // Catch: java.lang.Throwable -> Lcc
            com.ironsource.mediationsdk.adunit.b.i r7 = r7.f26841e     // Catch: java.lang.Throwable -> Lcc
            r7.i(r6)     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lcc
            return
        Lcc:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lcc
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.e.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.adunit.d.a.c):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(com.ironsource.mediationsdk.server.b bVar, String str) {
        if (bVar == null) {
            IronLog.INTERNAL.verbose(a("no auctionResponseItem or listener"));
            return;
        }
        ImpressionData a10 = bVar.a(str);
        if (a10 != null) {
            for (ImpressionDataListener impressionDataListener : this.f26903z) {
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info(a("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a10));
                impressionDataListener.onImpressionSuccess(a10);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1733g
    public final void a(List<com.ironsource.mediationsdk.server.b> list, String str, com.ironsource.mediationsdk.server.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        IronLog.INTERNAL.verbose(a(""));
        if (!j()) {
            i iVar = this.f26894q.f26841e;
            iVar.f("unexpected auction success for auctionId - " + str);
            return;
        }
        this.f26884g = "";
        this.f26883f = i10;
        this.f26886i = bVar;
        this.f26885h = jSONObject;
        if (!TextUtils.isEmpty(str2)) {
            this.f26894q.f26841e.b(i11, str2);
        }
        this.f26900w.a(this.f26890m.f26856a, jSONObject2 != null ? jSONObject2.optBoolean("isAdUnitCapped", false) : false);
        if (this.f26900w.a(this.f26890m.f26856a)) {
            this.f26894q.f26839c.c(str);
            a(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped", false);
            return;
        }
        String a10 = a(list, str);
        this.f26894q.f26839c.a(j10);
        this.f26894q.f26839c.b(a10);
        a(a.LOADING);
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (b() != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r3.f26902y.booleanValue() != false) goto L8;
     */
    @Override // com.ironsource.environment.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.f26888k
            if (r0 == 0) goto L48
            com.ironsource.mediationsdk.adunit.c.a r0 = r3.f26890m
            com.ironsource.mediationsdk.adunit.c.b.a r0 = r0.f26863h
            boolean r0 = r0.a()
            if (r0 == 0) goto Lf
            goto L48
        Lf:
            com.ironsource.mediationsdk.logger.IronLog r0 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "network availability changed to - "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.verbose(r1)
            java.lang.Boolean r0 = r3.f26902y
            r1 = 0
            if (r0 != 0) goto L29
        L27:
            r2 = 0
            goto L43
        L29:
            r2 = 1
            if (r4 == 0) goto L39
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L39
            boolean r0 = r3.b()
            if (r0 == 0) goto L39
            goto L43
        L39:
            if (r4 != 0) goto L27
            java.lang.Boolean r0 = r3.f26902y
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
        L43:
            if (r2 == 0) goto L48
            r3.a(r4, r1)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.e.a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(boolean z10, boolean z11) {
        synchronized (this.f26897t) {
            Boolean bool = this.f26902y;
            if (bool == null || bool.booleanValue() != z10) {
                this.f26902y = Boolean.valueOf(z10);
                long j10 = 0;
                if (this.f26901x != 0) {
                    j10 = new Date().getTime() - this.f26901x;
                }
                this.f26901x = new Date().getTime();
                this.f26894q.f26838b.a(z10, j10, z11);
                b bVar = this.f26895r;
                com.ironsource.mediationsdk.adunit.e.a<Smash> aVar = this.f26878a;
                bVar.a(z10, aVar.a(aVar.f26947b));
            }
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.a.b
    public final void b(com.ironsource.mediationsdk.adunit.d.a.c<?> cVar) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(cVar.m()));
        b bVar = this.f26895r;
        Placement placement = this.f26887j;
        AdInfo a10 = this.f26878a.a(cVar.o());
        IronSource.AD_UNIT ad_unit = bVar.f26865a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            D.a().e(a10);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            ac.a().b(placement, a10);
        } else {
            ironLog.warning("ad unit not supported - " + bVar.f26865a);
        }
    }

    public final void b(ImpressionDataListener impressionDataListener) {
        this.f26903z.remove(impressionDataListener);
    }

    public final void b(boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("track = " + z10));
        this.f26888k = z10;
    }

    protected abstract boolean b();

    @Override // com.ironsource.mediationsdk.InterfaceC1729c
    public final void c_() {
        if (this.f26890m.f26863h.b()) {
            a(a.READY_TO_LOAD);
            a(false, true);
            d();
        }
    }

    public final void d() {
        a aVar;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a(""));
        synchronized (this.f26897t) {
            boolean z10 = true;
            if (this.f26890m.f26863h.b() && this.f26889l.a()) {
                ironLog.verbose(a("all smashes are capped"));
                a(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, "all smashes are capped", true);
                return;
            }
            a.EnumC0342a enumC0342a = this.f26890m.f26863h.f26866a;
            a.EnumC0342a enumC0342a2 = a.EnumC0342a.AUTOMATIC_LOAD_WHILE_SHOW;
            if (enumC0342a != enumC0342a2 && this.f26891n == a.SHOWING) {
                IronLog.API.error(a("load cannot be invoked while showing an ad"));
                IronSourceError ironSourceError = new IronSourceError(com.ironsource.mediationsdk.adunit.a.a.b(this.f26890m.f26856a), "load cannot be invoked while showing an ad");
                if (this.f26890m.f26863h.a()) {
                    this.f26895r.a(ironSourceError);
                } else {
                    this.f26895r.a(false, (AdInfo) null);
                }
            } else if (enumC0342a != enumC0342a2 && (((aVar = this.f26891n) != a.READY_TO_LOAD && aVar != a.READY_TO_SHOW) || C1744r.a().a(this.f26890m.f26856a))) {
                IronLog.API.error(a("load is already in progress"));
            } else {
                this.f26885h = new JSONObject();
                s();
                com.ironsource.mediationsdk.adunit.c.a aVar2 = this.f26890m;
                if (aVar2.f26856a != IronSource.AD_UNIT.REWARDED_VIDEO || aVar2.f26863h.f26866a != a.EnumC0342a.MANUAL) {
                    z10 = false;
                }
                this.f26894q.f26838b.a(z10);
                this.f26899v = new com.ironsource.mediationsdk.utils.f();
                if (this.f26890m.a()) {
                    if (!this.f26880c.isEmpty()) {
                        this.f26882e.a(this.f26880c);
                        this.f26880c.clear();
                    }
                    q();
                } else {
                    a(a.LOADING);
                }
                if (this.f26890m.a()) {
                    return;
                }
                m();
                o();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ag
    public final void e() {
        IronLog.INTERNAL.verbose(a(""));
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f() {
        boolean z10;
        synchronized (this.f26897t) {
            z10 = this.f26891n == a.READY_TO_SHOW;
        }
        return z10;
    }

    public final void g() {
        this.f26903z.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String h() {
        Placement placement = this.f26887j;
        return placement == null ? "" : placement.getPlacementName();
    }
}
