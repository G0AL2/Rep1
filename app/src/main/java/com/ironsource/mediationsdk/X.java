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
public final class X extends AbstractC1742p implements com.ironsource.environment.j, B, Y, ag, InterfaceC1729c, InterfaceC1733g {
    private Boolean A;
    private a B;
    private int C;
    private String D;
    private boolean E;
    private NetworkStateReceiver F;
    private C1752z G;

    /* renamed from: d  reason: collision with root package name */
    final ConcurrentHashMap<String, Z> f26589d;

    /* renamed from: e  reason: collision with root package name */
    com.ironsource.mediationsdk.utils.n f26590e;

    /* renamed from: f  reason: collision with root package name */
    C1734h f26591f;

    /* renamed from: g  reason: collision with root package name */
    C1735i f26592g;

    /* renamed from: h  reason: collision with root package name */
    String f26593h;

    /* renamed from: i  reason: collision with root package name */
    JSONObject f26594i;

    /* renamed from: j  reason: collision with root package name */
    int f26595j;

    /* renamed from: k  reason: collision with root package name */
    long f26596k;

    /* renamed from: l  reason: collision with root package name */
    private CopyOnWriteArrayList<Z> f26597l;

    /* renamed from: m  reason: collision with root package name */
    private List<com.ironsource.mediationsdk.server.b> f26598m;

    /* renamed from: n  reason: collision with root package name */
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> f26599n;

    /* renamed from: o  reason: collision with root package name */
    private ConcurrentHashMap<String, C1735i.a> f26600o;

    /* renamed from: p  reason: collision with root package name */
    private com.ironsource.mediationsdk.server.b f26601p;

    /* renamed from: q  reason: collision with root package name */
    private af f26602q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26603r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f26604s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f26605t;

    /* renamed from: u  reason: collision with root package name */
    private String f26606u;

    /* renamed from: v  reason: collision with root package name */
    private long f26607v;

    /* renamed from: w  reason: collision with root package name */
    private long f26608w;

    /* renamed from: x  reason: collision with root package name */
    private int f26609x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f26610y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f26611z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    public X(List<NetworkSettings> list, com.ironsource.mediationsdk.model.o oVar, String str, String str2, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.f26595j = 1;
        this.D = "";
        this.E = false;
        long time = new Date().getTime();
        a(IronSourceConstants.RV_MANAGER_INIT_STARTED);
        a(a.RV_STATE_INITIATING);
        this.A = null;
        this.f26609x = oVar.f27282c;
        this.f26610y = oVar.f27283d;
        this.f26606u = "";
        com.ironsource.mediationsdk.utils.c cVar = oVar.f27291l;
        this.f26611z = false;
        this.f26597l = new CopyOnWriteArrayList<>();
        this.f26598m = new ArrayList();
        this.f26599n = new ConcurrentHashMap<>();
        this.f26600o = new ConcurrentHashMap<>();
        this.f26608w = new Date().getTime();
        boolean z10 = cVar.f27412e > 0;
        this.f26603r = z10;
        this.f26604s = cVar.f27420m;
        this.f26605t = !cVar.f27421n;
        this.f26607v = cVar.f27419l;
        if (z10) {
            this.f26591f = new C1734h("rewardedVideo", cVar, this);
        }
        this.f26602q = new af(cVar, this);
        this.f26589d = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            AbstractAdapter a10 = C1730d.a().a(networkSettings, networkSettings.getRewardedVideoSettings(), false, false);
            if (a10 != null) {
                C1731e a11 = C1731e.a();
                if (a11.a(a10, a11.f27034b, "rewarded video")) {
                    Z z11 = new Z(str, str2, networkSettings, this, oVar.f27284e, a10);
                    String k10 = z11.k();
                    this.f26589d.put(k10, z11);
                    arrayList.add(k10);
                }
            }
        }
        this.f26592g = new C1735i(arrayList, cVar.f27413f);
        this.f26590e = new com.ironsource.mediationsdk.utils.n(new ArrayList(this.f26589d.values()));
        for (Z z12 : this.f26589d.values()) {
            if (z12.h()) {
                z12.b();
            }
        }
        a(IronSourceConstants.RV_MANAGER_INIT_ENDED, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        this.G = new C1752z(oVar.f27288i, this);
        a(cVar.f27416i);
    }

    private String a(com.ironsource.mediationsdk.server.b bVar) {
        Z z10 = this.f26589d.get(bVar.a());
        String num = z10 != null ? Integer.toString(z10.i()) : TextUtils.isEmpty(bVar.b()) ? "1" : "2";
        return num + bVar.a();
    }

    private void a(int i10, Map<String, Object> map, boolean z10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (z11 && !TextUtils.isEmpty(this.f26593h)) {
            hashMap.put("auctionId", this.f26593h);
        }
        JSONObject jSONObject = this.f26594i;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26594i);
        }
        if (z10 && !TextUtils.isEmpty(this.f26606u)) {
            hashMap.put("placement", this.f26606u);
        }
        if (c(i10)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(hashMap, this.C, this.D);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f26595j));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "ProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(hashMap)));
    }

    private void a(long j10) {
        if (this.f26590e.a()) {
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            g();
            return;
        }
        a_();
        if (this.f26603r) {
            if (!this.f26600o.isEmpty()) {
                this.f26592g.a(this.f26600o);
                this.f26600o.clear();
            }
            new Timer().schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.X.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    final X x10 = X.this;
                    x10.a(a.RV_STATE_AUCTION_IN_PROGRESS);
                    AsyncTask.execute(new Runnable() { // from class: com.ironsource.mediationsdk.X.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2;
                            X.a("makeAuction()");
                            X x11 = X.this;
                            x11.f26593h = "";
                            x11.f26594i = null;
                            x11.a(IronSource.AD_UNIT.REWARDED_VIDEO);
                            X.this.f26596k = new Date().getTime();
                            HashMap hashMap = new HashMap();
                            ArrayList arrayList = new ArrayList();
                            StringBuilder sb3 = new StringBuilder();
                            for (Z z10 : X.this.f26589d.values()) {
                                if (z10.h()) {
                                    z10.f26622b = false;
                                }
                                if (!X.this.f26590e.b(z10)) {
                                    if (z10.h()) {
                                        Map<String, Object> a10 = z10.a();
                                        if (a10 != null) {
                                            hashMap.put(z10.k(), a10);
                                            sb2 = new StringBuilder();
                                        } else {
                                            z10.b(IronSourceConstants.TROUBLESHOOTING_RV_BIDDING_DATA_MISSING, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                                        }
                                    } else {
                                        arrayList.add(z10.k());
                                        sb2 = new StringBuilder();
                                    }
                                    sb2.append(z10.i());
                                    sb2.append(z10.k());
                                    sb2.append(",");
                                    sb3.append(sb2.toString());
                                }
                            }
                            if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                                X.this.b(IronSourceConstants.RV_AUCTION_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                X.a("makeAuction() failed - No candidates available for auctioning");
                                X.this.g();
                                return;
                            }
                            X.a("makeAuction() - request waterfall is: " + ((Object) sb3));
                            X.this.a(1000);
                            X.this.a(IronSourceConstants.RV_AUCTION_REQUEST);
                            X.this.a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb3.toString()}}));
                            C1734h c1734h = X.this.f26591f;
                            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                            X x12 = X.this;
                            c1734h.a(applicationContext, hashMap, arrayList, x12.f26592g, x12.f26595j, x12.f27313b);
                        }
                    });
                }
            }, j10);
            return;
        }
        IronLog.INTERNAL.verbose("auction is disabled, fallback flow will occur");
        h();
        if (this.f26598m.isEmpty()) {
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            g();
            return;
        }
        a(1000);
        if (this.f26605t && this.f26611z) {
            return;
        }
        f();
    }

    static void a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 0);
    }

    private void a(List<com.ironsource.mediationsdk.server.b> list) {
        this.f26598m = list;
        StringBuilder sb2 = new StringBuilder();
        Iterator<com.ironsource.mediationsdk.server.b> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(a(it.next()) + ",");
        }
        a("updateNextWaterfallToLoad() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            a("Updated waterfall is empty");
        }
        b(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
    }

    private void a(boolean z10, Map<String, Object> map) {
        Boolean bool = this.A;
        if (bool == null || bool.booleanValue() != z10) {
            this.A = Boolean.valueOf(z10);
            long time = new Date().getTime() - this.f26608w;
            this.f26608w = new Date().getTime();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("duration", Long.valueOf(time));
            b(z10 ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
            ac.a().a(z10, this.f27314c);
        }
    }

    private void b(int i10) {
        a(i10, new HashMap(), true, true);
    }

    private static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 3);
    }

    private void b(List<com.ironsource.mediationsdk.server.b> list) {
        this.f26597l.clear();
        this.f26599n.clear();
        this.f26600o.clear();
        for (com.ironsource.mediationsdk.server.b bVar : list) {
            Z z10 = this.f26589d.get(bVar.a());
            if (z10 != null) {
                z10.f26736e = true;
                this.f26597l.add(z10);
                this.f26599n.put(z10.k(), bVar);
                this.f26600o.put(bVar.a(), C1735i.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                a("updateWaterfall() - could not find matching smash for auction response item " + bVar.a());
            }
        }
        this.f26598m.clear();
    }

    private void b(boolean z10) {
        a(z10, new HashMap());
    }

    private void c(int i10, Map<String, Object> map) {
        a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    private static void c(Z z10, String str) {
        String str2 = z10.k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str2, 0);
    }

    private static void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private static boolean c(int i10) {
        return i10 == 1003 || i10 == 1302 || i10 == 1301 || i10 == 1303;
    }

    private void e(Z z10) {
        String b10 = this.f26599n.get(z10.k()).b();
        C1732f.a();
        z10.a(b10, this.f26593h, this.f26594i, this.C, this.D, this.f26595j, C1732f.d(b10));
    }

    private void h() {
        this.f26593h = AbstractC1742p.d();
        a(i());
    }

    private List<com.ironsource.mediationsdk.server.b> i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (Z z10 : this.f26589d.values()) {
            if (!z10.h() && !this.f26590e.b(z10)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.server.b(z10.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void j() {
        if (this.f26597l.isEmpty()) {
            b(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            g();
            return;
        }
        a(a.RV_STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26597l.size() && i10 < this.f26609x; i11++) {
            Z z10 = this.f26597l.get(i11);
            if (z10.f26736e) {
                if (this.f26610y && z10.h()) {
                    if (i10 != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + z10.k() + " as a non bidder is being loaded";
                        a(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + z10.k() + ". No other instances will be loaded at the same time.";
                    a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    e(z10);
                    return;
                }
                e(z10);
                i10++;
            }
        }
    }

    void a(int i10) {
        a(i10, new HashMap(), false, false);
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1733g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.C = i11;
        this.D = str2;
        this.f26594i = null;
        h();
        b(IronSourceConstants.RV_AUCTION_FAILED, TextUtils.isEmpty(str) ? a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(j10)}}) : a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j10)}}));
        if (this.f26605t && this.f26611z) {
            return;
        }
        f();
    }

    void a(int i10, Map<String, Object> map) {
        a(i10, map, false, false);
    }

    @Override // com.ironsource.mediationsdk.B
    public final void a(Context context, boolean z10) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager Should Track Network State: " + z10, 0);
        try {
            this.E = z10;
            if (z10) {
                if (this.F == null) {
                    this.F = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.F, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.F != null) {
                context.getApplicationContext().unregisterReceiver(this.F);
            }
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    void a(a aVar) {
        a("current state=" + this.B + ", new state=" + aVar);
        this.B = aVar;
    }

    @Override // com.ironsource.mediationsdk.Y
    public final void a(Z z10) {
        synchronized (this) {
            this.f26595j++;
            c(z10, "onRewardedVideoAdOpened");
            if (this.f26603r) {
                com.ironsource.mediationsdk.server.b bVar = this.f26599n.get(z10.k());
                if (bVar != null) {
                    a(bVar.a(this.f26606u));
                    C1734h.a(bVar, z10.i(), this.f26601p, this.f26606u);
                    this.f26600o.put(z10.k(), C1735i.a.ISAuctionPerformanceShowedSuccessfully);
                    a(bVar, this.f26606u);
                } else {
                    String k10 = z10.k();
                    b("onRewardedVideoAdOpened showing instance " + k10 + " missing from waterfall");
                    b(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.B}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}));
                }
            }
            ac.a().a(this.f27314c);
            this.f26602q.a();
        }
    }

    @Override // com.ironsource.mediationsdk.Y
    public final void a(Z z10, Placement placement) {
        c(z10, "onRewardedVideoAdRewarded");
        ac.a().a(placement, this.f27314c);
    }

    @Override // com.ironsource.mediationsdk.Y
    public final synchronized void a(Z z10, String str) {
        c(z10, "onLoadSuccess ");
        String str2 = this.f26593h;
        if (str2 != null && !str.equalsIgnoreCase(str2)) {
            a("onLoadSuccess was invoked with auctionId: " + str + " and the current id is " + this.f26593h);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 2};
            StringBuilder sb2 = new StringBuilder("onLoadSuccess wrong auction ID ");
            sb2.append(this.B);
            z10.b(IronSourceConstants.RV_MANAGER_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, sb2.toString()}});
            return;
        }
        a aVar = this.B;
        this.f26600o.put(z10.k(), C1735i.a.ISAuctionPerformanceLoadedSuccessfully);
        if (this.B == a.RV_STATE_LOADING_SMASHES) {
            a(a.RV_STATE_READY_TO_SHOW);
            b(1003, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f26596k)}}));
            this.G.a(0L);
            if (this.f26603r) {
                com.ironsource.mediationsdk.server.b bVar = this.f26599n.get(z10.k());
                if (bVar != null) {
                    a(bVar.a(""));
                    C1734h.a(bVar, z10.i(), this.f26601p);
                    this.f26591f.a(this.f26597l, this.f26599n, z10.i(), this.f26601p, bVar);
                } else {
                    String k10 = z10.k();
                    b("onLoadSuccess winner instance " + k10 + " missing from waterfall. auctionId: " + str + " and the current id is " + this.f26593h);
                    Object[] objArr2 = {IronSourceConstants.EVENTS_ERROR_CODE, 1010};
                    StringBuilder sb3 = new StringBuilder("Loaded missing ");
                    sb3.append(aVar);
                    b(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, a.AnonymousClass1.a(new Object[][]{objArr2, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, sb3.toString()}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}}));
                }
            }
            b(true);
        }
    }

    @Override // com.ironsource.mediationsdk.Y
    public final void a(IronSourceError ironSourceError, Z z10) {
        com.ironsource.mediationsdk.server.b bVar;
        synchronized (this) {
            if (this.f26603r && (bVar = this.f26599n.get(z10.k())) != null) {
                a(bVar.a(this.f26606u));
            }
            c(z10, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
            c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
            ac.a().a(ironSourceError, this.f27314c);
            this.f26611z = false;
            this.f26600o.put(z10.k(), C1735i.a.ISAuctionPerformanceFailedToShow);
            if (this.B != a.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
            this.f26602q.c();
        }
    }

    @Override // com.ironsource.mediationsdk.B
    public final synchronized void a(Placement placement) {
        if (placement == null) {
            c("showRewardedVideo error: empty default placement");
            ac.a().a(new IronSourceError(IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, "showRewardedVideo error: empty default placement"), this.f27314c);
            a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
            return;
        }
        this.f26606u = placement.getPlacementName();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 0);
        b(IronSourceConstants.RV_API_SHOW_CALLED);
        if (this.f26611z) {
            c("showRewardedVideo error: can't show ad while an ad is already showing");
            ac.a().a(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing"), this.f27314c);
            c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
        } else if (this.B != a.RV_STATE_READY_TO_SHOW) {
            c("showRewardedVideo error: show called while no ads are available");
            ac.a().a(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, "showRewardedVideo error: show called while no ads are available"), this.f27314c);
            c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
        } else if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getApplicationContext(), this.f26606u)) {
            String str = "showRewardedVideo error: placement " + this.f26606u + " is capped";
            c(str);
            ac.a().a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str), this.f27314c);
            c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<Z> it = this.f26597l.iterator();
            while (it.hasNext()) {
                Z next = it.next();
                if (next.c()) {
                    this.f26611z = true;
                    next.a(true, this.f26595j);
                    a("showVideo()");
                    this.f26590e.a(next);
                    if (this.f26590e.b(next)) {
                        next.f();
                        IronSourceUtils.sendAutomationLog(next.k() + " rewarded video is now session capped");
                    }
                    com.ironsource.mediationsdk.utils.k.e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                    if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                        b(IronSourceConstants.RV_CAP_PLACEMENT);
                    }
                    this.G.a();
                    next.a(placement, this.f26595j);
                    a(a.RV_STATE_NOT_LOADED);
                    return;
                }
                if (next.o() != null) {
                    stringBuffer.append(next.k() + ":" + next.o() + ",");
                }
                next.a(false, this.f26595j);
            }
            a("showRewardedVideo(): No ads to show");
            ac.a().a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT), this.f27314c);
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo(): No ads to show");
            if (stringBuffer.length() != 0) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            }
            c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, hashMap);
            this.f26602q.c();
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1733g
    public final void a(List<com.ironsource.mediationsdk.server.b> list, String str, com.ironsource.mediationsdk.server.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        a("makeAuction(): success");
        this.f26593h = str;
        this.f26601p = bVar;
        this.f26594i = jSONObject;
        this.C = i10;
        this.D = "";
        if (!TextUtils.isEmpty(str2)) {
            b(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}));
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a(jSONObject2, ad_unit);
        if (this.f27312a.a(ad_unit)) {
            b(IronSourceConstants.RV_AD_UNIT_CAPPED, a.AnonymousClass1.a(new Object[][]{new Object[]{"auctionId", str}}));
            g();
            return;
        }
        b(IronSourceConstants.RV_AUCTION_SUCCESS, a.AnonymousClass1.a(new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}));
        a(list);
        if (this.f26605t && this.f26611z) {
            return;
        }
        f();
    }

    @Override // com.ironsource.environment.j
    public final void a(boolean z10) {
        if (this.E) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z11 = false;
            logger.log(ironSourceTag, "Network Availability Changed To: " + z10, 0);
            Boolean bool = this.A;
            if (bool != null && ((z10 && !bool.booleanValue() && c()) || (!z10 && this.A.booleanValue()))) {
                z11 = true;
            }
            if (z11) {
                b(z10);
            }
        }
    }

    void b(int i10, Map<String, Object> map) {
        a(i10, map, false, true);
    }

    @Override // com.ironsource.mediationsdk.Y
    public final void b(Z z10) {
        synchronized (this) {
            z10.a(IronSourceConstants.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = false"}});
            c(z10, "onRewardedVideoAdClosed, mediation state: " + this.B.name());
            ac.a().b(this.f27314c);
            this.f26611z = false;
            if (this.B != a.RV_STATE_READY_TO_SHOW) {
                b(false);
            }
            if (this.f26604s) {
                List<com.ironsource.mediationsdk.server.b> list = this.f26598m;
                if (list != null && list.size() > 0) {
                    new Timer().schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.X.3
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public final void run() {
                            X.this.f();
                        }
                    }, this.f26607v);
                }
            } else {
                this.f26602q.b();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.Y
    public final void b(Z z10, Placement placement) {
        c(z10, "onRewardedVideoAdClicked");
        ac.a().b(placement, this.f27314c);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e A[SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.ironsource.mediationsdk.Z r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.X.b(com.ironsource.mediationsdk.Z, java.lang.String):void");
    }

    @Override // com.ironsource.mediationsdk.Y
    public final void c(Z z10) {
        c(z10, "onRewardedVideoAdStarted");
        ac.a().b();
    }

    @Override // com.ironsource.mediationsdk.B
    public final synchronized boolean c() {
        if (!this.E || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) {
            if (this.B == a.RV_STATE_READY_TO_SHOW && !this.f26611z) {
                Iterator<Z> it = this.f26597l.iterator();
                while (it.hasNext()) {
                    if (it.next().c()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1729c
    public final void c_() {
        a(a.RV_STATE_NOT_LOADED);
        a(false, a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        a(0L);
    }

    @Override // com.ironsource.mediationsdk.Y
    public final void d(Z z10) {
        c(z10, "onRewardedVideoAdEnded");
        ac.a().c();
    }

    @Override // com.ironsource.mediationsdk.ag
    public final synchronized void e() {
        a("onLoadTriggered: RV load was triggered in " + this.B + " state");
        a(0L);
    }

    void f() {
        b(this.f26598m);
        j();
    }

    void g() {
        a(a.RV_STATE_NOT_LOADED);
        b(false);
        this.f26602q.d();
    }
}
