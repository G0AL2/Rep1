package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1735i;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
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
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class U extends AbstractC1742p implements A, V, InterfaceC1733g {

    /* renamed from: d  reason: collision with root package name */
    com.ironsource.mediationsdk.utils.n f26543d;

    /* renamed from: e  reason: collision with root package name */
    final ConcurrentHashMap<String, W> f26544e;

    /* renamed from: f  reason: collision with root package name */
    String f26545f;

    /* renamed from: g  reason: collision with root package name */
    JSONObject f26546g;

    /* renamed from: h  reason: collision with root package name */
    C1734h f26547h;

    /* renamed from: i  reason: collision with root package name */
    C1735i f26548i;

    /* renamed from: j  reason: collision with root package name */
    long f26549j;

    /* renamed from: k  reason: collision with root package name */
    long f26550k;

    /* renamed from: l  reason: collision with root package name */
    private a f26551l;

    /* renamed from: m  reason: collision with root package name */
    private CopyOnWriteArrayList<W> f26552m;

    /* renamed from: n  reason: collision with root package name */
    private ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> f26553n;

    /* renamed from: o  reason: collision with root package name */
    private ConcurrentHashMap<String, C1735i.a> f26554o;

    /* renamed from: p  reason: collision with root package name */
    private com.ironsource.mediationsdk.server.b f26555p;

    /* renamed from: q  reason: collision with root package name */
    private String f26556q;

    /* renamed from: r  reason: collision with root package name */
    private int f26557r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f26558s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f26559t;

    /* renamed from: u  reason: collision with root package name */
    private long f26560u;

    /* renamed from: v  reason: collision with root package name */
    private int f26561v;

    /* renamed from: w  reason: collision with root package name */
    private String f26562w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f26563x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum a {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    public U(List<NetworkSettings> list, com.ironsource.mediationsdk.model.h hVar, String str, String str2, int i10, HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        super(hashSet, ironSourceSegment);
        this.f26562w = "";
        this.f26563x = false;
        long time = new Date().getTime();
        a(IronSourceConstants.IS_MANAGER_INIT_STARTED);
        a(a.STATE_NOT_INITIALIZED);
        this.f26544e = new ConcurrentHashMap<>();
        this.f26552m = new CopyOnWriteArrayList<>();
        this.f26553n = new ConcurrentHashMap<>();
        this.f26554o = new ConcurrentHashMap<>();
        this.f26556q = "";
        this.f26545f = "";
        this.f26546g = null;
        this.f26557r = hVar.f27240c;
        this.f26558s = hVar.f27241d;
        C1744r.a().a(IronSource.AD_UNIT.INTERSTITIAL, i10);
        com.ironsource.mediationsdk.utils.c cVar = hVar.f27246i;
        this.f26550k = cVar.f27416i;
        boolean z10 = cVar.f27412e > 0;
        this.f26559t = z10;
        if (z10) {
            this.f26547h = new C1734h("interstitial", cVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings networkSettings : list) {
            AbstractAdapter a10 = C1730d.a().a(networkSettings, networkSettings.getInterstitialSettings(), false, false);
            if (a10 != null) {
                C1731e a11 = C1731e.a();
                if (a11.a(a10, a11.f27033a, "interstitial")) {
                    W w10 = new W(str, str2, networkSettings, this, hVar.f27242e, a10);
                    String k10 = w10.k();
                    this.f26544e.put(k10, w10);
                    arrayList.add(k10);
                }
            }
        }
        this.f26548i = new C1735i(arrayList, cVar.f27413f);
        this.f26543d = new com.ironsource.mediationsdk.utils.n(new ArrayList(this.f26544e.values()));
        for (W w11 : this.f26544e.values()) {
            if (w11.h()) {
                w11.b();
            }
        }
        this.f26549j = new Date().getTime();
        a(a.STATE_READY_TO_LOAD);
        a(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    private String a(com.ironsource.mediationsdk.server.b bVar) {
        W w10 = this.f26544e.get(bVar.a());
        String num = w10 != null ? Integer.toString(w10.i()) : TextUtils.isEmpty(bVar.b()) ? "1" : "2";
        return num + bVar.a();
    }

    private void a(int i10) {
        a(i10, (Object[][]) null, false);
    }

    private void a(int i10, W w10) {
        a(i10, w10, (Object[][]) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, W w10, Object[][] objArr) {
        a(i10, w10, objArr, false);
    }

    private void a(int i10, W w10, Object[][] objArr, boolean z10) {
        Map<String, Object> n10 = w10.n();
        if (!TextUtils.isEmpty(this.f26545f)) {
            n10.put("auctionId", this.f26545f);
        }
        JSONObject jSONObject = this.f26546g;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26546g);
        }
        if (z10 && !TextUtils.isEmpty(this.f26556q)) {
            n10.put("placement", this.f26556q);
        }
        if (c(i10)) {
            com.ironsource.mediationsdk.a.d.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f26561v, this.f26562w);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(n10)));
    }

    private void a(int i10, Object[][] objArr) {
        a(i10, objArr, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object[][] objArr, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f26545f)) {
            hashMap.put("auctionId", this.f26545f);
        }
        JSONObject jSONObject = this.f26546g;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26546g);
        }
        if (z10 && !TextUtils.isEmpty(this.f26556q)) {
            hashMap.put("placement", this.f26556q);
        }
        if (c(i10)) {
            com.ironsource.mediationsdk.a.d.d();
            com.ironsource.mediationsdk.a.b.a(hashMap, this.f26561v, this.f26562w);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                b("sendMediationEvent " + e10.getMessage());
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(hashMap)));
    }

    private static void a(W w10, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + w10.k() + " : " + str, 0);
    }

    private void a(List<com.ironsource.mediationsdk.server.b> list) {
        this.f26552m.clear();
        this.f26553n.clear();
        this.f26554o.clear();
        StringBuilder sb2 = new StringBuilder();
        for (com.ironsource.mediationsdk.server.b bVar : list) {
            sb2.append(a(bVar) + ",");
            W w10 = this.f26544e.get(bVar.a());
            if (w10 != null) {
                w10.f26736e = true;
                this.f26552m.add(w10);
                this.f26553n.put(w10.k(), bVar);
                this.f26554o.put(bVar.a(), C1735i.a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                b("updateWaterfall() - could not find matching smash for auction response item " + bVar.a());
            }
        }
        b("updateWaterfall() - next waterfall is " + sb2.toString());
        if (sb2.length() == 0) {
            b("Updated waterfall is empty");
        }
        a(IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}});
    }

    private void b(int i10) {
        a(i10, (Object[][]) null, true);
    }

    private void b(int i10, W w10) {
        a(i10, w10, (Object[][]) null, true);
    }

    private void b(int i10, W w10, Object[][] objArr) {
        a(i10, w10, objArr, true);
    }

    private void b(int i10, Object[][] objArr) {
        a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, objArr, true);
    }

    static void b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgIsManager " + str, 0);
    }

    private static void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    private static boolean c(int i10) {
        return i10 == 2002 || i10 == 2003 || i10 == 2200 || i10 == 2213 || i10 == 2005 || i10 == 2204 || i10 == 2201 || i10 == 2203 || i10 == 2006 || i10 == 2004 || i10 == 2110 || i10 == 2301 || i10 == 2300 || i10 == 2303;
    }

    private void g() {
        List<com.ironsource.mediationsdk.server.b> h10 = h();
        this.f26545f = AbstractC1742p.d();
        a(h10);
    }

    private void g(W w10) {
        String b10 = this.f26553n.get(w10.k()).b();
        w10.b(b10);
        a(2002, w10);
        w10.a(b10);
    }

    private List<com.ironsource.mediationsdk.server.b> h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (W w10 : this.f26544e.values()) {
            if (!w10.h() && !this.f26543d.b(w10)) {
                copyOnWriteArrayList.add(new com.ironsource.mediationsdk.server.b(w10.k()));
            }
        }
        return copyOnWriteArrayList;
    }

    private void i() {
        if (this.f26552m.isEmpty()) {
            a(a.STATE_READY_TO_LOAD);
            a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Empty waterfall"}}, false);
            C1744r.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, "Empty waterfall"));
            return;
        }
        a(a.STATE_LOADING_SMASHES);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26552m.size() && i10 < this.f26557r; i11++) {
            W w10 = this.f26552m.get(i11);
            if (w10.f26736e) {
                if (this.f26558s && w10.h()) {
                    if (i10 != 0) {
                        String str = "Advanced Loading: Won't start loading bidder " + w10.k() + " as a non bidder is being loaded";
                        b(str);
                        IronSourceUtils.sendAutomationLog(str);
                        return;
                    }
                    String str2 = "Advanced Loading: Starting to load bidder " + w10.k() + ". No other instances will be loaded at the same time.";
                    b(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    g(w10);
                    return;
                }
                g(w10);
                i10++;
            }
        }
    }

    void a() {
        a(a.STATE_AUCTION);
        AsyncTask.execute(new Runnable() { // from class: com.ironsource.mediationsdk.U.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                U u10 = U.this;
                u10.f26545f = "";
                u10.f26546g = null;
                StringBuilder sb3 = new StringBuilder();
                long time = new Date().getTime();
                U u11 = U.this;
                long j10 = u11.f26550k - (time - u11.f26549j);
                if (j10 > 0) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("delaying auction by " + j10);
                    com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.f26160a;
                    com.ironsource.environment.e.c.b(new Runnable() { // from class: com.ironsource.mediationsdk.U.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            U.this.a();
                        }
                    }, j10);
                    return;
                }
                u11.a(2000, (Object[][]) null, false);
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (W w10 : U.this.f26544e.values()) {
                    if (!U.this.f26543d.b(w10)) {
                        if (w10.h()) {
                            Map<String, Object> a10 = w10.a();
                            if (a10 != null) {
                                hashMap.put(w10.k(), a10);
                                sb2 = new StringBuilder();
                            } else {
                                U.this.a(IronSourceConstants.TROUBLESHOOTING_IS_BIDDING_DATA_MISSING, w10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Missing bidding data"}});
                            }
                        } else {
                            arrayList.add(w10.k());
                            sb2 = new StringBuilder();
                        }
                        sb2.append(w10.i());
                        sb2.append(w10.k());
                        sb2.append(",");
                        sb3.append(sb2.toString());
                    }
                }
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    U.this.a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}, false);
                    U.b("makeAuction() failed - No candidates available for auctioning");
                    C1744r.a().a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(1005, "No candidates available for auctioning"));
                    U.this.a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
                    U.this.a(a.STATE_READY_TO_LOAD);
                    return;
                }
                U.this.a((int) IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb3.toString()}}, false);
                int b10 = com.ironsource.mediationsdk.utils.o.a().b(2);
                C1734h c1734h = U.this.f26547h;
                if (c1734h != null) {
                    Context applicationContext = ContextProvider.getInstance().getApplicationContext();
                    U u12 = U.this;
                    c1734h.a(applicationContext, hashMap, arrayList, u12.f26548i, b10, u12.f27313b);
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1733g
    public final void a(int i10, String str, int i11, String str2, long j10) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i10 + " - " + str + ")";
        b(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.f26561v = i11;
        this.f26562w = str2;
        this.f26546g = null;
        g();
        if (TextUtils.isEmpty(str)) {
            a(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(j10)}});
        } else {
            a(IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j10)}});
        }
        i();
    }

    void a(a aVar) {
        this.f26551l = aVar;
        b("state=" + aVar);
    }

    @Override // com.ironsource.mediationsdk.V
    public final void a(W w10) {
        synchronized (this) {
            a(w10, "onInterstitialAdOpened");
            b(IronSourceConstants.IS_INSTANCE_OPENED, w10);
            if (this.f26559t) {
                com.ironsource.mediationsdk.server.b bVar = this.f26553n.get(w10.k());
                if (bVar != null) {
                    a(bVar.a(this.f26556q));
                    C1734h.a(bVar, w10.i(), this.f26555p, this.f26556q);
                    this.f26554o.put(w10.k(), C1735i.a.ISAuctionPerformanceShowedSuccessfully);
                    a(bVar, this.f26556q);
                } else {
                    String k10 = w10.k();
                    b("onInterstitialAdOpened showing instance " + k10 + " missing from waterfall");
                    Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.NOTIFICATIONS_ERROR_SHOWING_NOT_FOUND)};
                    a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f26551l}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}});
                }
            }
            D.a().b(this.f27314c);
        }
    }

    @Override // com.ironsource.mediationsdk.V
    public final void a(W w10, long j10) {
        synchronized (this) {
            a(w10, "onInterstitialAdReady");
            a(2003, w10, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
            if (this.f26554o.containsKey(w10.k())) {
                this.f26554o.put(w10.k(), C1735i.a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.f26551l == a.STATE_LOADING_SMASHES) {
                a(a.STATE_READY_TO_SHOW);
                a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f26560u)}});
                if (this.f26559t) {
                    com.ironsource.mediationsdk.server.b bVar = this.f26553n.get(w10.k());
                    if (bVar != null) {
                        a(bVar.a(""));
                        C1734h.a(bVar, w10.i(), this.f26555p);
                        this.f26547h.a(this.f26552m, this.f26553n, w10.i(), this.f26555p, bVar);
                    } else {
                        String k10 = w10.k();
                        b("onInterstitialAdReady winner instance " + k10 + " missing from waterfall");
                        a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k10}});
                    }
                }
                D.a().a(this.f27314c);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.V
    public final void a(IronSourceError ironSourceError, W w10) {
        com.ironsource.mediationsdk.server.b bVar;
        synchronized (this) {
            if (this.f26559t && (bVar = this.f26553n.get(w10.k())) != null) {
                a(bVar.a(this.f26556q));
            }
            a(w10, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            D.a().a(ironSourceError, this.f27314c);
            b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, w10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            this.f26554o.put(w10.k(), C1735i.a.ISAuctionPerformanceFailedToShow);
            a(a.STATE_READY_TO_LOAD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0144 A[SYNTHETIC] */
    @Override // com.ironsource.mediationsdk.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.ironsource.mediationsdk.logger.IronSourceError r9, com.ironsource.mediationsdk.W r10, long r11) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.U.a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.W, long):void");
    }

    public final synchronized void a(String str) {
        a aVar = this.f26551l;
        if (aVar == a.STATE_SHOWING) {
            c("showInterstitial error: can't show ad while an ad is already showing");
            D.a().a(new IronSourceError(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing"), this.f27314c);
            a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showInterstitial error: can't show ad while an ad is already showing"}}, false);
        } else if (aVar != a.STATE_READY_TO_SHOW) {
            b("showInterstitial() error state=" + this.f26551l.toString());
            c("showInterstitial error: show called while no ads are available");
            D.a().a(new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "showInterstitial error: show called while no ads are available"), this.f27314c);
            a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showInterstitial error: show called while no ads are available"}});
        } else if (str == null) {
            c("showInterstitial error: empty default placement");
            D.a().a(new IronSourceError(IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT, "showInterstitial error: empty default placement"), this.f27314c);
            a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showInterstitial error: empty default placement"}});
        } else {
            this.f26556q = str;
            b(2100);
            if (com.ironsource.mediationsdk.utils.k.a(ContextProvider.getInstance().getApplicationContext(), str)) {
                String str2 = "placement " + this.f26556q + " is capped";
                c(str2);
                D.a().a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str2), this.f27314c);
                b(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}});
                return;
            }
            Iterator<W> it = this.f26552m.iterator();
            while (it.hasNext()) {
                W next = it.next();
                if (next.g()) {
                    a(a.STATE_SHOWING);
                    next.c();
                    b(IronSourceConstants.IS_INSTANCE_SHOW, next);
                    this.f26543d.a(next);
                    if (this.f26543d.b(next)) {
                        next.f();
                        a(IronSourceConstants.IS_CAP_SESSION, next);
                        IronSourceUtils.sendAutomationLog(next.k() + " was session capped");
                    }
                    com.ironsource.mediationsdk.utils.k.d(ContextProvider.getInstance().getApplicationContext(), str);
                    if (com.ironsource.mediationsdk.utils.k.a(ContextProvider.getInstance().getApplicationContext(), str)) {
                        b(IronSourceConstants.IS_CAP_PLACEMENT);
                    }
                    return;
                }
                b("showInterstitial " + next.k() + " isReadyToShow() == false");
            }
            D.a().a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.INTERSTITIAL_AD_UNIT), this.f27314c);
            b(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Show Fail - No ads to show"}});
        }
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1733g
    public final void a(List<com.ironsource.mediationsdk.server.b> list, String str, com.ironsource.mediationsdk.server.b bVar, JSONObject jSONObject, JSONObject jSONObject2, int i10, long j10, int i11, String str2) {
        this.f26545f = str;
        this.f26555p = bVar;
        this.f26546g = jSONObject;
        this.f26561v = i10;
        this.f26562w = "";
        if (!TextUtils.isEmpty(str2)) {
            a(IronSourceConstants.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i11)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}}, false);
        }
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        a(jSONObject2, ad_unit);
        if (this.f27312a.a(ad_unit)) {
            a(IronSourceConstants.IS_AD_UNIT_CAPPED, new Object[][]{new Object[]{"auctionId", str}}, false);
            a(a.STATE_READY_TO_LOAD);
            C1744r.a().a(ad_unit, new IronSourceError(IronSourceError.ERROR_AD_UNIT_CAPPED, "Ad unit is capped"));
            return;
        }
        a(IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}}, false);
        a(list);
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z10) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Should Track Network State: " + z10, 0);
        this.f26563x = z10;
    }

    @Override // com.ironsource.mediationsdk.V
    public final void b(W w10) {
        synchronized (this) {
            a(w10, "onInterstitialAdClosed");
            b(IronSourceConstants.IS_INSTANCE_CLOSED, w10, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.o.a().b(2))}});
            com.ironsource.mediationsdk.utils.o.a().a(2);
            D.a().c(this.f27314c);
            a(a.STATE_READY_TO_LOAD);
        }
    }

    @Override // com.ironsource.mediationsdk.V
    public final void b(IronSourceError ironSourceError, W w10) {
        a(IronSourceConstants.IS_INSTANCE_INIT_FAILED, w10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
    }

    @Override // com.ironsource.mediationsdk.V
    public final void c(W w10) {
        a(w10, "onInterstitialAdShowSucceeded");
        D.a().d(this.f27314c);
        b(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, w10);
    }

    @Override // com.ironsource.mediationsdk.V
    public final void d(W w10) {
        a(w10, "onInterstitialAdClicked");
        D.a().e(this.f27314c);
        b(2006, w10);
    }

    public final synchronized void e() {
        a aVar = this.f26551l;
        if (aVar == a.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            D.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial: load cannot be invoked while showing an ad"));
            return;
        }
        if (aVar == a.STATE_READY_TO_LOAD || aVar == a.STATE_READY_TO_SHOW) {
            C1744r a10 = C1744r.a();
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            if (!a10.a(ad_unit)) {
                this.f26545f = "";
                this.f26556q = "";
                this.f26546g = null;
                a(ad_unit);
                a_();
                a(2001, (Object[][]) null, false);
                this.f26560u = new Date().getTime();
                if (!this.f26559t) {
                    g();
                    i();
                    return;
                }
                if (!this.f26554o.isEmpty()) {
                    this.f26548i.a(this.f26554o);
                    this.f26554o.clear();
                }
                a();
                return;
            }
        }
        b("loadInterstitial: load is already in progress");
    }

    @Override // com.ironsource.mediationsdk.V
    public final void e(W w10) {
        a(w10, "onInterstitialAdVisible");
    }

    @Override // com.ironsource.mediationsdk.V
    public final void f(W w10) {
        a(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, w10);
    }

    public final synchronized boolean f() {
        if ((!this.f26563x || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f26551l == a.STATE_READY_TO_SHOW) {
            Iterator<W> it = this.f26552m.iterator();
            while (it.hasNext()) {
                if (it.next().g()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
