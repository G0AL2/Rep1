package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.C1735i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K extends AbstractC1742p implements com.ironsource.environment.j, B, M, ag, InterfaceC1729c, InterfaceC1733g {
    private long A;
    private Boolean B;
    private C1752z C;

    /* renamed from: d  reason: collision with root package name */
    N f26358d;

    /* renamed from: e  reason: collision with root package name */
    C1735i f26359e;

    /* renamed from: f  reason: collision with root package name */
    C1734h f26360f;

    /* renamed from: g  reason: collision with root package name */
    long f26361g;

    /* renamed from: h  reason: collision with root package name */
    final ConcurrentHashMap<String, L> f26362h;

    /* renamed from: i  reason: collision with root package name */
    com.ironsource.mediationsdk.utils.n f26363i;

    /* renamed from: j  reason: collision with root package name */
    int f26364j;

    /* renamed from: k  reason: collision with root package name */
    a f26365k;

    /* renamed from: l  reason: collision with root package name */
    final Object f26366l;

    /* renamed from: m  reason: collision with root package name */
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> f26367m;

    /* renamed from: n  reason: collision with root package name */
    private ConcurrentHashMap<String, C1735i.a> f26368n;

    /* renamed from: o  reason: collision with root package name */
    private com.ironsource.mediationsdk.server.b f26369o;

    /* renamed from: p  reason: collision with root package name */
    private JSONObject f26370p;

    /* renamed from: q  reason: collision with root package name */
    private af f26371q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26372r;

    /* renamed from: s  reason: collision with root package name */
    private String f26373s;

    /* renamed from: t  reason: collision with root package name */
    private int f26374t;

    /* renamed from: u  reason: collision with root package name */
    private NetworkStateReceiver f26375u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f26376v;

    /* renamed from: w  reason: collision with root package name */
    private String f26377w;

    /* renamed from: x  reason: collision with root package name */
    private int f26378x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f26379y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f26380z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public K(List<NetworkSettings> list, com.ironsource.mediationsdk.model.o oVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.f26373s = "";
        this.f26376v = false;
        this.f26364j = 1;
        this.f26366l = new Object();
        long time = new Date().getTime();
        a(IronSourceConstants.RV_MANAGER_INIT_STARTED);
        a(a.RV_STATE_INITIATING);
        this.B = null;
        this.f26378x = oVar.f27282c;
        this.f26379y = oVar.f27283d;
        this.f26377w = "";
        this.f26370p = null;
        com.ironsource.mediationsdk.utils.c cVar = oVar.f27291l;
        this.f26380z = false;
        this.f26358d = new N(cVar.f27422o, cVar.f27414g);
        this.f26367m = new ConcurrentHashMap<>();
        this.f26368n = new ConcurrentHashMap<>();
        this.A = new Date().getTime();
        boolean z10 = cVar.f27412e > 0;
        this.f26372r = z10;
        if (z10) {
            this.f26360f = new C1734h("rewardedVideo", cVar, this);
        }
        this.f26371q = new af(cVar, this);
        this.f26362h = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            AbstractAdapter a10 = C1730d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), false, false);
            if (a10 != null) {
                L l10 = new L(str, str2, networkSettings, this, oVar.f27284e, a10, this.f26364j);
                String k10 = l10.k();
                this.f26362h.put(k10, l10);
                arrayList.add(k10);
            }
        }
        this.f26359e = new C1735i(arrayList, cVar.f27413f);
        this.f26363i = new com.ironsource.mediationsdk.utils.n(new ArrayList(this.f26362h.values()));
        a(IronSourceConstants.RV_MANAGER_INIT_ENDED, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        this.C = new C1752z(oVar.f27288i, this);
        a(cVar.f27416i);
    }

    private String a(com.ironsource.mediationsdk.server.b bVar) {
        L l10 = this.f26362h.get(bVar.a());
        String num = l10 != null ? Integer.toString(l10.i()) : TextUtils.isEmpty(bVar.b()) ? "1" : "2";
        return num + bVar.a();
    }

    private void a(int i10, Map<String, Object> map, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z11 && !TextUtils.isEmpty(this.f26358d.f26415b)) {
            hashMap.put("auctionId", this.f26358d.f26415b);
        }
        JSONObject jSONObject = this.f26370p;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26370p);
        }
        if (z10 && !TextUtils.isEmpty(this.f26377w)) {
            hashMap.put("placement", this.f26377w);
        }
        if (b(i10)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(hashMap, this.f26374t, this.f26373s);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f26364j));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(hashMap)));
    }

    private void a(long j10) {
        if (this.f26363i.a()) {
            a("all smashes are capped");
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            f();
            return;
        }
        a(IronSource.AD_UNIT.REWARDED_VIDEO);
        if (this.f26372r) {
            if (!this.f26368n.isEmpty()) {
                this.f26359e.a(this.f26368n);
                this.f26368n.clear();
            }
            new Timer().schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.K.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    final K k10 = K.this;
                    synchronized (k10.f26366l) {
                        a aVar = k10.f26365k;
                        a aVar2 = a.RV_STATE_AUCTION_IN_PROGRESS;
                        if (aVar != aVar2) {
                            k10.a(aVar2);
                            AsyncTask.execute(new Runnable() { // from class: com.ironsource.mediationsdk.K.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    StringBuilder sb2;
                                    K.a("makeAuction()");
                                    K.this.f26361g = new Date().getTime();
                                    HashMap hashMap = new HashMap();
                                    ArrayList arrayList = new ArrayList();
                                    StringBuilder sb3 = new StringBuilder();
                                    for (L l10 : K.this.f26362h.values()) {
                                        if (!K.this.f26363i.b(l10) && K.this.f26358d.b(l10)) {
                                            if (l10.h()) {
                                                Map<String, Object> a10 = l10.a();
                                                if (a10 != null) {
                                                    hashMap.put(l10.k(), a10);
                                                    sb2 = new StringBuilder();
                                                } else {
                                                    l10.b(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                                                }
                                            } else {
                                                arrayList.add(l10.k());
                                                sb2 = new StringBuilder();
                                            }
                                            sb2.append(l10.i());
                                            sb2.append(l10.k());
                                            sb2.append(",");
                                            sb3.append(sb2.toString());
                                        }
                                    }
                                    if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                                        K.this.b(IronSourceConstants.RV_AUCTION_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                        K.a("makeAuction() failed - No candidates available for auctioning");
                                        K.this.f();
                                        return;
                                    }
                                    K.a("makeAuction() - request waterfall is: " + ((Object) sb3));
                                    K.this.a(1000);
                                    K.this.a(IronSourceConstants.RV_AUCTION_REQUEST);
                                    K.this.a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb3.toString()}}));
                                    C1734h c1734h = K.this.f26360f;
                                    Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                                    K k11 = K.this;
                                    c1734h.a(applicationContext, hashMap, arrayList, k11.f26359e, k11.f26364j, k11.f27313b);
                                }
                            });
                        }
                    }
                }
            }, j10);
            return;
        }
        a("auction fallback flow starting");
        g();
        if (!this.f26358d.a().isEmpty()) {
            a(1000);
            i();
            return;
        }
        a("loadSmashes -  waterfall is empty");
        b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
        f();
    }

    private static void a(L l10, String str) {
        String str2 = l10.k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    private void a(List<com.ironsource.mediationsdk.server.b> list, String str, JSONObject jSONObject) {
        this.f26367m.clear();
        this.f26368n.clear();
        CopyOnWriteArrayList<L> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        StringBuilder sb2 = new StringBuilder();
        for (com.ironsource.mediationsdk.server.b bVar : list) {
            sb2.append(a(bVar) + ",");
            L l10 = this.f26362h.get(bVar.a());
            if (l10 != null) {
                AbstractAdapter a10 = C1730d.a().a(l10.f26735d.f27214a);
                if (a10 != null) {
                    L l11 = new L(l10, this, a10, this.f26364j, str, jSONObject, this.f26374t, this.f26373s);
                    l11.f26736e = true;
                    copyOnWriteArrayList.add(l11);
                    this.f26367m.put(l11.k(), bVar);
                    this.f26368n.put(bVar.a(), C1735i.a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                a("updateWaterfall() - could not find matching smash for auction response item " + bVar.a());
            }
        }
        this.f26358d.a(copyOnWriteArrayList, str);
        if (this.f26358d.b()) {
            b(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfalls hold too many with size=" + this.f26358d.f26414a.size()}}));
        }
        a("updateWaterfall() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            a("Updated waterfall is empty");
        }
        b(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
    }

    private void a(boolean z10, Map<String, Object> map) {
        synchronized (this.f26366l) {
            Boolean bool = this.B;
            if (bool == null || bool.booleanValue() != z10) {
                this.B = Boolean.valueOf(z10);
                long time = new Date().getTime() - this.A;
                this.A = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", Long.valueOf(time));
                b(z10 ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                ac a10 = ac.a();
                N n10 = this.f26358d;
                a10.a(z10, n10.a(n10.f26415b));
            }
        }
    }

    private static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 3);
    }

    private static boolean b(int i10) {
        return i10 == 1003 || i10 == 1302 || i10 == 1301 || i10 == 1303;
    }

    private void c(int i10) {
        a(i10, null, true, true);
    }

    private void c(int i10, Map<String, Object> map) {
        a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    private static void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private void g() {
        List<com.ironsource.mediationsdk.server.b> h10 = h();
        a(h10, "fallback_" + System.currentTimeMillis(), this.f26370p);
    }

    private void g(L l10) {
        String b10 = this.f26367m.get(l10.k()).b();
        l10.b(b10);
        l10.a(b10);
    }

    private List<com.ironsource.mediationsdk.server.b> h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (L l10 : this.f26362h.values()) {
            if (!l10.h() && !this.f26363i.b(l10) && this.f26358d.b(l10)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.server.b(l10.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void i() {
        if (this.f26358d.a().isEmpty()) {
            a("loadSmashes -  waterfall is empty");
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            f();
            return;
        }
        a(a.RV_STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26358d.a().size() && i10 < this.f26378x; i11++) {
            L l10 = this.f26358d.a().get(i11);
            if (l10.f26736e) {
                if (this.f26379y && l10.h()) {
                    if (i10 != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + l10.k() + " as a non bidder is being loaded";
                        a(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + l10.k() + ". No other instances will be loaded at the same time.";
                    a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    g(l10);
                    return;
                }
                g(l10);
                i10++;
            }
        }
    }

    void a(int i10) {
        a(i10, null, false, false);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1733g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f26374t = i11;
        this.f26373s = str2;
        this.f26370p = null;
        g();
        b(IronSourceConstants.RV_AUCTION_FAILED, TextUtils.isEmpty(str) ? a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(j10)}}) : a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j10)}}));
        i();
    }

    void a(int i10, Map<String, Object> map) {
        a(i10, map, false, false);
    }

    @Override // com.ironsource.mediationsdk.B
    public final void a(Context context, boolean z10) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z10, 0);
        try {
            this.f26376v = z10;
            if (z10) {
                if (this.f26375u == null) {
                    this.f26375u = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f26375u, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f26375u != null) {
                context.getApplicationContext().unregisterReceiver(this.f26375u);
            }
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    void a(a aVar) {
        a("current state=" + this.f26365k + ", new state=" + aVar);
        this.f26365k = aVar;
    }

    @Override // com.ironsource.mediationsdk.M
    public final void a(L l10) {
        synchronized (this.f26366l) {
            a(l10, "onLoadSuccess mState=" + this.f26365k);
            if (l10.f26390b == this.f26358d.f26415b && this.f26365k != a.RV_STATE_AUCTION_IN_PROGRESS) {
                this.f26368n.put(l10.k(), C1735i.a.ISAuctionPerformanceLoadedSuccessfully);
                a aVar = this.f26365k;
                a aVar2 = a.RV_STATE_LOADING_SMASHES;
                if (aVar == aVar2) {
                    a(a.RV_STATE_READY_TO_SHOW);
                    b(1003, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f26361g)}}));
                    this.C.a(0L);
                    if (this.f26372r) {
                        com.ironsource.mediationsdk.server.b bVar = this.f26367m.get(l10.k());
                        if (bVar != null) {
                            N n10 = this.f26358d;
                            n10.a(n10.f26415b, bVar.a(""));
                            C1734h.a(bVar, l10.i(), this.f26369o);
                            this.f26360f.a(this.f26358d.a(), this.f26367m, l10.i(), this.f26369o, bVar);
                        } else {
                            String k10 = l10.k();
                            b("onLoadSuccess winner instance " + k10 + " missing from waterfall. auctionId: " + l10.f26390b + " and the current id is " + this.f26358d.f26415b);
                            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                            StringBuilder sb2 = new StringBuilder("Loaded missing ");
                            sb2.append(aVar2);
                            b(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, sb2.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}));
                        }
                    }
                    a(true, (Map<String, Object>) null);
                }
                return;
            }
            a("onLoadSuccess was invoked with auctionId: " + l10.f26390b + " and the current id is " + this.f26358d.f26415b);
            Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            StringBuilder sb3 = new StringBuilder("onLoadSuccess wrong auction ID ");
            sb3.append(this.f26365k);
            l10.b(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr2, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, sb3.toString()}});
        }
    }

    @Override // com.ironsource.mediationsdk.M
    public final void a(L l10, Placement placement) {
        a(l10, "onRewardedVideoAdRewarded");
        ac.a().a(placement, this.f26358d.a(l10.f26390b));
    }

    @Override // com.ironsource.mediationsdk.M
    public final void a(IronSourceError ironSourceError, L l10) {
        com.ironsource.mediationsdk.server.b bVar;
        if (this.f26372r && (bVar = this.f26367m.get(l10.k())) != null) {
            N n10 = this.f26358d;
            n10.a(n10.f26415b, bVar.a(this.f26377w));
        }
        a(l10, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f26380z = false;
        c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
        ac.a().a(ironSourceError, this.f26358d.a(l10.f26390b));
        this.f26368n.put(l10.k(), C1735i.a.ISAuctionPerformanceFailedToShow);
        if (this.f26365k != a.RV_STATE_READY_TO_SHOW) {
            a(false, (Map<String, Object>) null);
        }
        this.f26371q.c();
    }

    @Override // com.ironsource.mediationsdk.B
    public final void a(Placement placement) {
        L l10;
        synchronized (this.f26366l) {
            if (placement == null) {
                c("showRewardedVideo error: empty default placement");
                IronSourceError ironSourceError = new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement");
                ac a10 = ac.a();
                N n10 = this.f26358d;
                a10.a(ironSourceError, n10.a(n10.f26415b));
                a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
                return;
            }
            this.f26377w = placement.getPlacementName();
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 0);
            c(IronSourceConstants.RV_API_SHOW_CALLED);
            if (this.f26380z) {
                c("showRewardedVideo error: can't show ad while an ad is already showing");
                IronSourceError ironSourceError2 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing");
                ac a11 = ac.a();
                N n11 = this.f26358d;
                a11.a(ironSourceError2, n11.a(n11.f26415b));
                c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
            } else if (this.f26365k != a.RV_STATE_READY_TO_SHOW) {
                c("showRewardedVideo error: show called while no ads are available");
                IronSourceError ironSourceError3 = new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available");
                ac a12 = ac.a();
                N n12 = this.f26358d;
                a12.a(ironSourceError3, n12.a(n12.f26415b));
                c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
            } else if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getApplicationContext(), this.f26377w)) {
                String str = "showRewardedVideo error: placement " + this.f26377w + " is capped";
                c(str);
                IronSourceError ironSourceError4 = new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str);
                ac a13 = ac.a();
                N n13 = this.f26358d;
                a13.a(ironSourceError4, n13.a(n13.f26415b));
                c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                Iterator<L> it = this.f26358d.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        l10 = null;
                        break;
                    }
                    l10 = it.next();
                    if (l10.b()) {
                        this.f26380z = true;
                        l10.a(true);
                        a(a.RV_STATE_NOT_LOADED);
                        break;
                    }
                    if (l10.o() != null) {
                        stringBuffer.append(l10.k() + ":" + l10.o() + ",");
                    }
                    l10.a(false);
                }
                if (l10 == null) {
                    a("showRewardedVideo(): No ads to show");
                    ac a14 = ac.a();
                    IronSourceError buildNoAdsToShowError = ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT);
                    N n14 = this.f26358d;
                    a14.a(buildNoAdsToShowError, n14.a(n14.f26415b));
                    HashMap hashMap = new HashMap();
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
                    hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo(): No ads to show");
                    if (stringBuffer.length() != 0) {
                        hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
                    }
                    c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, hashMap);
                    this.f26371q.c();
                    return;
                }
                a("showVideo()");
                this.f26363i.a(l10);
                if (this.f26363i.b(l10)) {
                    l10.b_();
                    IronSourceUtils.sendAutomationLog(l10.k() + " rewarded video is now session capped");
                }
                com.ironsource.mediationsdk.utils.k.e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                    c(IronSourceConstants.RV_CAP_PLACEMENT);
                }
                this.C.a();
                l10.a(placement);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1733g
    public final void a(List<com.ironsource.mediationsdk.server.b> list, String str, com.ironsource.mediationsdk.server.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        a("makeAuction(): success");
        this.f26369o = bVar;
        this.f26374t = i10;
        this.f26370p = jSONObject;
        this.f26373s = "";
        if (!TextUtils.isEmpty(str2)) {
            b(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a(jSONObject2, ad_unit);
        if (this.f27312a.a(ad_unit)) {
            b(IronSourceConstants.RV_AD_UNIT_CAPPED, a.AnonymousClass1.a(new Object[][]{new Object[]{"auctionId", str}}));
            f();
            return;
        }
        a(list, str, this.f26370p);
        b(IronSourceConstants.RV_AUCTION_SUCCESS, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
        i();
    }

    @Override // com.ironsource.environment.j
    public final void a(boolean z10) {
        if (this.f26376v) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z11 = false;
            logger.log(ironSourceTag, "Network Availability Changed To: " + z10, 0);
            Boolean bool = this.B;
            if (bool != null && ((z10 && !bool.booleanValue() && c()) || (!z10 && this.B.booleanValue()))) {
                z11 = true;
            }
            if (z11) {
                a(z10, (Map<String, Object>) null);
            }
        }
    }

    void b(int i10, Map<String, Object> map) {
        a(i10, map, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed A[SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.ironsource.mediationsdk.L r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.K.b(com.ironsource.mediationsdk.L):void");
    }

    @Override // com.ironsource.mediationsdk.M
    public final void b(L l10, Placement placement) {
        a(l10, "onRewardedVideoAdClicked");
        ac.a().b(placement, this.f26358d.a(l10.f26390b));
    }

    @Override // com.ironsource.mediationsdk.M
    public final void c(L l10) {
        this.f26358d.a(l10);
        this.f26364j++;
        a(l10, "onRewardedVideoAdOpened");
        if (this.f26372r) {
            com.ironsource.mediationsdk.server.b bVar = this.f26367m.get(l10.k());
            if (bVar != null) {
                N n10 = this.f26358d;
                n10.a(n10.f26415b, bVar.a(this.f26377w));
                C1734h.a(bVar, l10.i(), this.f26369o, this.f26377w);
                this.f26368n.put(l10.k(), C1735i.a.ISAuctionPerformanceShowedSuccessfully);
                a(bVar, this.f26377w);
            } else {
                String k10 = l10.k();
                b("onRewardedVideoAdOpened showing instance " + k10 + " missing from waterfall");
                b(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f26365k}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}));
            }
        }
        ac.a().a(this.f26358d.a(l10.f26390b));
        a(false, (Map<String, Object>) null);
        this.f26371q.a();
    }

    @Override // com.ironsource.mediationsdk.B
    public final boolean c() {
        if ((!this.f26376v || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f26365k == a.RV_STATE_READY_TO_SHOW && !this.f26380z) {
            Iterator<L> it = this.f26358d.a().iterator();
            while (it.hasNext()) {
                if (it.next().b()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1729c
    public final void c_() {
        a(a.RV_STATE_NOT_LOADED);
        a(false, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.mediationsdk.M
    public final void d(L l10) {
        String str;
        L next;
        a(l10, "onRewardedVideoAdClosed, mediation state: " + this.f26365k.name());
        ac.a().b(this.f26358d.a(l10.f26390b));
        this.f26380z = false;
        boolean z10 = this.f26365k == a.RV_STATE_READY_TO_SHOW;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            Iterator<L> it = this.f26358d.a().iterator();
            while (it.hasNext()) {
                if (it.next().f26389a == L.a.LOADED) {
                    sb2.append(next.k() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb3 = new StringBuilder("otherRVAvailable = ");
        if (sb2.length() > 0) {
            str = "true|" + ((Object) sb2);
        } else {
            str = "false";
        }
        sb3.append(str);
        objArr2[1] = sb3.toString();
        objArr[0] = objArr2;
        l10.a(IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (l10.equals(this.f26358d.f26416c)) {
            this.f26358d.a((L) null);
            if (this.f26365k != a.RV_STATE_READY_TO_SHOW) {
                a(false, (Map<String, Object>) null);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.ag
    public final void e() {
        a("onLoadTriggered: RV load was triggered in " + this.f26365k + " state");
        a(0L);
    }

    @Override // com.ironsource.mediationsdk.M
    public final void e(L l10) {
        a(l10, "onRewardedVideoAdStarted");
        ac.a().b();
    }

    void f() {
        a(a.RV_STATE_NOT_LOADED);
        if (!this.f26380z) {
            a(false, (Map<String, Object>) null);
        }
        this.f26371q.d();
    }

    @Override // com.ironsource.mediationsdk.M
    public final void f(L l10) {
        a(l10, "onRewardedVideoAdEnded");
        ac.a().c();
    }
}
