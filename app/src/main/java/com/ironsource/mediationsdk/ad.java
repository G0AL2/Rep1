package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.AbstractC1728b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ad extends AbstractC1727a implements com.ironsource.environment.j, InterfaceC1729c, com.ironsource.mediationsdk.sdk.m, com.ironsource.mediationsdk.utils.d {

    /* renamed from: m  reason: collision with root package name */
    com.ironsource.mediationsdk.sdk.j f26797m;

    /* renamed from: o  reason: collision with root package name */
    int f26799o;

    /* renamed from: p  reason: collision with root package name */
    C1752z f26800p;

    /* renamed from: s  reason: collision with root package name */
    private NetworkStateReceiver f26803s;

    /* renamed from: t  reason: collision with root package name */
    private Placement f26804t;

    /* renamed from: q  reason: collision with root package name */
    private final String f26801q = ad.class.getSimpleName();

    /* renamed from: u  reason: collision with root package name */
    private Timer f26805u = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26802r = false;

    /* renamed from: n  reason: collision with root package name */
    boolean f26798n = false;

    /* renamed from: y  reason: collision with root package name */
    private boolean f26809y = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f26807w = false;

    /* renamed from: x  reason: collision with root package name */
    private long f26808x = new Date().getTime();

    /* renamed from: v  reason: collision with root package name */
    private List<AbstractC1728b.a> f26806v = Arrays.asList(AbstractC1728b.a.INIT_FAILED, AbstractC1728b.a.CAPPED_PER_SESSION, AbstractC1728b.a.EXHAUSTED, AbstractC1728b.a.CAPPED_PER_DAY);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ad() {
        this.f26648a = new com.ironsource.mediationsdk.utils.e("rewarded_video", this);
    }

    private void a(int i10) {
        a(i10, (Object[][]) null);
    }

    private void a(int i10, AbstractC1728b abstractC1728b, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(abstractC1728b);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, providerAdditionalData));
    }

    private void a(int i10, Object[][] objArr) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoManager logMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, mediationAdditionalData));
    }

    private synchronized void a(AbstractC1728b abstractC1728b, int i10) {
        com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getCurrentActiveActivity(), this.f26804t);
        if (com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getCurrentActiveActivity(), p())) {
            a(IronSourceConstants.RV_CAP_PLACEMENT, new Object[][]{new Object[]{"placement", p()}});
        }
        this.f26648a.a(abstractC1728b);
        Placement placement = this.f26804t;
        if (placement != null) {
            if (this.f26798n) {
                a(((ae) abstractC1728b).f26962v, true, placement.getPlacementId());
                int placementId = this.f26804t.getPlacementId();
                for (int i11 = 0; i11 < i10 && i11 < this.f26650c.size(); i11++) {
                    if (!this.f26806v.contains(this.f26650c.get(i11).f26978a)) {
                        a(((ae) this.f26650c.get(i11)).f26962v, false, placementId);
                    }
                }
            }
            String p10 = p();
            a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, abstractC1728b, new Object[][]{new Object[]{"placement", p10}, new Object[]{"status", InneractiveMediationDefs.SHOW_HOUSE_AD_YES}});
            for (int i12 = 0; i12 < this.f26650c.size() && i12 < i10; i12++) {
                AbstractC1728b abstractC1728b2 = this.f26650c.get(i12);
                AbstractC1728b.a aVar = abstractC1728b2.f26978a;
                if (aVar == AbstractC1728b.a.NOT_AVAILABLE || aVar == AbstractC1728b.a.NEEDS_RELOAD) {
                    a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, abstractC1728b2, new Object[][]{new Object[]{"placement", p10}, new Object[]{"status", "false"}});
                }
            }
        } else {
            this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
        a(IronSourceConstants.RV_INSTANCE_SHOW, abstractC1728b, this.f26804t != null ? new Object[][]{new Object[]{"placement", p()}} : null);
        this.f26809y = true;
        this.f26800p.a();
        ((ae) abstractC1728b).f26963w = com.ironsource.mediationsdk.utils.o.a().b(1);
        ae aeVar = (ae) abstractC1728b;
        if (aeVar.f26979b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = aeVar.f26994q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, aeVar.f26981d + ":showRewardedVideo()", 1);
            aeVar.d();
            aeVar.f26979b.showRewardedVideo(aeVar.f26958r, aeVar);
        }
    }

    private synchronized void a(String str, final boolean z10, final int i10) {
        final String str2;
        try {
            str2 = ("" + str) + "&sdkVersion=" + IronSourceUtils.getSDKVersion();
            Thread thread = new Thread(new Runnable() { // from class: com.ironsource.mediationsdk.server.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str3 = str2;
                    boolean z11 = z10;
                    try {
                        new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str3, z11, i10)));
                        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NETWORK;
                        logger.log(ironSourceTag, "callRequestURL(reqUrl:" + str3 + ", hit:" + z11 + ")", 1);
                    } catch (Throwable th) {
                        StringBuilder sb2 = new StringBuilder("callRequestURL(reqUrl:");
                        if (str3 == null) {
                            sb2.append("null");
                        } else {
                            sb2.append(str3);
                        }
                        sb2.append(", hit:");
                        sb2.append(z11);
                        sb2.append(")");
                        IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
                        IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NETWORK;
                        logger2.log(ironSourceTag2, sb2.toString() + ", e:" + Log.getStackTraceString(th), 0);
                    }
                }
            }, "callAsyncRequestURL");
            thread.setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
            thread.start();
        } catch (Throwable th) {
            this.f26655h.logException(IronSourceLogger.IronSourceTag.NETWORK, "reportImpression:(providerURL:" + str2 + ", hit:" + z10 + ")", th);
        }
    }

    private synchronized void a(Map<String, Object> map) {
        AbstractC1728b abstractC1728b = this.f26651d;
        if (abstractC1728b != null && !this.f26658k) {
            this.f26658k = true;
            if (h((ae) abstractC1728b) == null) {
                this.f26797m.onRewardedVideoAvailabilityChanged(this.f26657j.booleanValue());
            }
            return;
        }
        if (!k()) {
            this.f26797m.a(this.f26657j.booleanValue(), map);
        } else if (a(true, false)) {
            this.f26797m.onRewardedVideoAvailabilityChanged(this.f26657j.booleanValue());
        }
    }

    private synchronized boolean a(boolean z10, boolean z11) {
        boolean z12;
        Boolean bool;
        z12 = false;
        Boolean bool2 = this.f26657j;
        if (bool2 == null) {
            d();
            if (z10) {
                bool = Boolean.TRUE;
            } else if (!k() && h()) {
                bool = Boolean.FALSE;
            }
            this.f26657j = bool;
            z12 = true;
        } else {
            if (z10 && !bool2.booleanValue()) {
                bool = Boolean.TRUE;
            } else if (!z10 && this.f26657j.booleanValue() && ((!j() || z11) && !k())) {
                bool = Boolean.FALSE;
            }
            this.f26657j = bool;
            z12 = true;
        }
        return z12;
    }

    private void b(boolean z10) {
        if (!z10 && c()) {
            a(1000, (Object[][]) null);
            a(1003, new Object[][]{new Object[]{"duration", 0}});
            this.f26807w = false;
        } else if (i()) {
            a(1000, (Object[][]) null);
            this.f26807w = true;
            this.f26808x = new Date().getTime();
        }
    }

    private AbstractAdapter f() {
        AbstractAdapter abstractAdapter = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26650c.size() && abstractAdapter == null; i11++) {
            if (this.f26650c.get(i11).f26978a == AbstractC1728b.a.AVAILABLE || this.f26650c.get(i11).f26978a == AbstractC1728b.a.INITIATED) {
                i10++;
                if (i10 >= this.f26649b) {
                    break;
                }
            } else if (this.f26650c.get(i11).f26978a == AbstractC1728b.a.NOT_INITIATED && (abstractAdapter = h((ae) this.f26650c.get(i11))) == null) {
                this.f26650c.get(i11).a(AbstractC1728b.a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    private synchronized AbstractAdapter h(ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager.log(ironSourceTag, this.f26801q + ":startAdapter(" + aeVar.f26981d + ")", 1);
        C1730d a10 = C1730d.a();
        NetworkSettings networkSettings = aeVar.f26980c;
        AbstractAdapter a11 = a10.a(networkSettings, networkSettings.getRewardedVideoSettings(), false, false);
        if (a11 == null) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f26655h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager2.log(ironSourceTag2, aeVar.f26981d + " is configured in IronSource's platform, but the adapter is not integrated", 2);
            return null;
        }
        aeVar.f26979b = a11;
        aeVar.a(AbstractC1728b.a.INITIATED);
        b((AbstractC1728b) aeVar);
        a(1001, aeVar, (Object[][]) null);
        String str = this.f26654g;
        String str2 = this.f26653f;
        aeVar.h();
        if (aeVar.f26979b != null) {
            aeVar.f26960t.set(true);
            aeVar.f26961u = new Date().getTime();
            aeVar.f26979b.addRewardedVideoListener(aeVar);
            IronSourceLoggerManager ironSourceLoggerManager3 = aeVar.f26994q;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager3.log(ironSourceTag3, aeVar.f26981d + ":initRewardedVideo()", 1);
            aeVar.f26979b.initRewardedVideo(str, str2, aeVar.f26958r, aeVar);
        }
        return a11;
    }

    private synchronized boolean h() {
        int i10;
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        i10 = 0;
        while (it.hasNext()) {
            AbstractC1728b.a aVar = it.next().f26978a;
            if (aVar == AbstractC1728b.a.INIT_FAILED || aVar == AbstractC1728b.a.CAPPED_PER_DAY || aVar == AbstractC1728b.a.CAPPED_PER_SESSION || aVar == AbstractC1728b.a.NOT_AVAILABLE || aVar == AbstractC1728b.a.NEEDS_RELOAD || aVar == AbstractC1728b.a.EXHAUSTED) {
                i10++;
            }
        }
        return this.f26650c.size() == i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0007, B:6:0x000d, B:8:0x0019, B:10:0x001d, B:12:0x0021, B:14:0x0025, B:16:0x0029), top: B:25:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean i() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r3.f26650c     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L32
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L32
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.AbstractC1728b) r1     // Catch: java.lang.Throwable -> L32
            com.ironsource.mediationsdk.b$a r1 = r1.f26978a     // Catch: java.lang.Throwable -> L32
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC1728b.a.NOT_AVAILABLE     // Catch: java.lang.Throwable -> L32
            if (r1 == r2) goto L2d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC1728b.a.NEEDS_RELOAD     // Catch: java.lang.Throwable -> L32
            if (r1 == r2) goto L2d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC1728b.a.AVAILABLE     // Catch: java.lang.Throwable -> L32
            if (r1 == r2) goto L2d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC1728b.a.INITIATED     // Catch: java.lang.Throwable -> L32
            if (r1 == r2) goto L2d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC1728b.a.INIT_PENDING     // Catch: java.lang.Throwable -> L32
            if (r1 == r2) goto L2d
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC1728b.a.LOAD_PENDING     // Catch: java.lang.Throwable -> L32
            if (r1 != r2) goto L7
        L2d:
            r0 = 1
        L2e:
            monitor-exit(r3)
            return r0
        L30:
            r0 = 0
            goto L2e
        L32:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.ad.i():boolean");
    }

    private synchronized boolean j() {
        boolean z10;
        z10 = false;
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f26978a == AbstractC1728b.a.AVAILABLE) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    private synchronized boolean k() {
        AbstractC1728b abstractC1728b = this.f26651d;
        if (abstractC1728b != null) {
            return ((ae) abstractC1728b).o();
        }
        return false;
    }

    private synchronized void l() {
        if (f() != null) {
            return;
        }
        AbstractC1728b.a[] aVarArr = {AbstractC1728b.a.NOT_AVAILABLE, AbstractC1728b.a.NEEDS_RELOAD, AbstractC1728b.a.CAPPED_PER_SESSION, AbstractC1728b.a.CAPPED_PER_DAY};
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            for (int i11 = 0; i11 < 4; i11++) {
                if (next.f26978a == aVarArr[i11]) {
                    i10++;
                }
            }
        }
        if (i10 < this.f26650c.size()) {
            m();
            return;
        }
        if (a(false, false)) {
            a((Map<String, Object>) null);
        }
    }

    private synchronized void m() {
        if (n()) {
            this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Reset Iteration", 0);
            Iterator<AbstractC1728b> it = this.f26650c.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                AbstractC1728b next = it.next();
                if (next.f26978a == AbstractC1728b.a.EXHAUSTED) {
                    next.g();
                }
                if (next.f26978a == AbstractC1728b.a.AVAILABLE) {
                    z10 = true;
                }
            }
            this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "End of Reset Iteration", 0);
            if (a(z10, false)) {
                this.f26797m.onRewardedVideoAvailabilityChanged(this.f26657j.booleanValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0007, B:6:0x000d, B:8:0x0019, B:10:0x001d), top: B:19:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized boolean n() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r3.f26650c     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L26
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.AbstractC1728b) r1     // Catch: java.lang.Throwable -> L26
            com.ironsource.mediationsdk.b$a r1 = r1.f26978a     // Catch: java.lang.Throwable -> L26
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC1728b.a.NOT_INITIATED     // Catch: java.lang.Throwable -> L26
            if (r1 == r2) goto L21
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC1728b.a.INITIATED     // Catch: java.lang.Throwable -> L26
            if (r1 == r2) goto L21
            com.ironsource.mediationsdk.b$a r2 = com.ironsource.mediationsdk.AbstractC1728b.a.AVAILABLE     // Catch: java.lang.Throwable -> L26
            if (r1 != r2) goto L7
        L21:
            r0 = 0
        L22:
            monitor-exit(r3)
            return r0
        L24:
            r0 = 1
            goto L22
        L26:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.ad.n():boolean");
    }

    private void o() {
        for (int i10 = 0; i10 < this.f26650c.size(); i10++) {
            String providerTypeForReflection = this.f26650c.get(i10).f26980c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C1730d.a().a(this.f26650c.get(i10).f26980c, this.f26650c.get(i10).f26980c.getRewardedVideoSettings(), false, false);
                return;
            }
        }
    }

    private String p() {
        Placement placement = this.f26804t;
        return placement == null ? "" : placement.getPlacementName();
    }

    private void q() {
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        long j10 = Long.MAX_VALUE;
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            if (next.f26978a == AbstractC1728b.a.AVAILABLE && next.l() != null && next.l().longValue() < j10) {
                j10 = next.l().longValue();
            }
        }
        if (j10 != Long.MAX_VALUE) {
            this.f26800p.a(System.currentTimeMillis() - j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC1727a
    public final void a(Context context, boolean z10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f26801q + " Should Track Network State: " + z10, 0);
        try {
            this.f26656i = z10;
            if (z10) {
                if (this.f26803s == null) {
                    this.f26803s = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f26803s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f26803s != null) {
                context.getApplicationContext().unregisterReceiver(this.f26803s);
            }
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void a(ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f26981d + ":onRewardedVideoAdOpened()", 1);
        a(1005, aeVar, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f26963w)}});
        this.f26797m.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void a(IronSourceError ironSourceError, ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f26981d + ":onRewardedVideoAdShowFailed(" + ironSourceError + ")", 1);
        this.f26809y = false;
        a(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, aeVar, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f26963w)}});
        b(false);
        this.f26797m.onRewardedVideoAdShowFailed(ironSourceError);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Placement placement) {
        this.f26804t = placement;
        this.f26797m.f27340f = placement.getPlacementName();
    }

    public final synchronized void a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.f26801q + ":showRewardedVideo(placementName: " + str + ")", 1);
        this.f26797m.f27340f = str;
        a(IronSourceConstants.RV_API_SHOW_CALLED, new Object[][]{new Object[]{"placement", str}});
        if (this.f26809y) {
            this.f26655h.log(ironSourceTag, "showRewardedVideo error: can't show ad while an ad is already showing", 3);
            this.f26797m.onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, "showRewardedVideo error: can't show ad while an ad is already showing"));
        } else if (this.f26656i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            this.f26655h.log(ironSourceTag, "showRewardedVideo error: can't show ad when there's no internet connection", 3);
            this.f26797m.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < this.f26650c.size(); i10++) {
                AbstractC1728b abstractC1728b = this.f26650c.get(i10);
                IronSourceLoggerManager ironSourceLoggerManager2 = this.f26655h;
                IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager2.log(ironSourceTag2, "showRewardedVideo, iterating on: " + abstractC1728b.f26981d + ", Status: " + abstractC1728b.f26978a, 0);
                if (abstractC1728b.f26978a == AbstractC1728b.a.AVAILABLE) {
                    if (((ae) abstractC1728b).o()) {
                        a(abstractC1728b, i10);
                        if (this.f26659l && !abstractC1728b.equals(this.f26652e)) {
                            b();
                        }
                        if (abstractC1728b.b()) {
                            abstractC1728b.a(AbstractC1728b.a.CAPPED_PER_SESSION);
                            a(IronSourceConstants.RV_CAP_SESSION, abstractC1728b, (Object[][]) null);
                            l();
                            return;
                        } else if (this.f26648a.c(abstractC1728b)) {
                            abstractC1728b.a(AbstractC1728b.a.CAPPED_PER_DAY);
                            a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, abstractC1728b, new Object[][]{new Object[]{"status", InneractiveMediationDefs.SHOW_HOUSE_AD_YES}});
                            l();
                            return;
                        } else {
                            if (abstractC1728b.a()) {
                                f();
                                m();
                            }
                            return;
                        }
                    }
                    if (abstractC1728b.m() != null) {
                        stringBuffer.append(abstractC1728b.f26981d + ":" + abstractC1728b.m() + ",");
                    }
                    a(false, (ae) abstractC1728b);
                    Exception exc = new Exception("FailedToShowVideoException");
                    IronSourceLoggerManager ironSourceLoggerManager3 = this.f26655h;
                    ironSourceLoggerManager3.logException(ironSourceTag2, abstractC1728b.f26981d + " Failed to show video", exc);
                }
            }
            if (k()) {
                a(this.f26651d, this.f26650c.size());
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            this.f26797m.a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT), hashMap);
        }
    }

    public final synchronized void a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.f26801q + ":initRewardedVideo(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        a(IronSourceConstants.RV_MANAGER_INIT_STARTED);
        this.f26654g = str;
        this.f26653f = str2;
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            if (this.f26648a.b(next)) {
                a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", "false"}});
            }
            if (this.f26648a.c(next)) {
                next.a(AbstractC1728b.a.CAPPED_PER_DAY);
                i10++;
            }
        }
        if (i10 == this.f26650c.size()) {
            this.f26797m.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        a(1000);
        this.f26797m.f27340f = null;
        this.f26807w = true;
        this.f26808x = new Date().getTime();
        a(IronSourceConstants.RV_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
        o();
        for (int i11 = 0; i11 < this.f26649b && i11 < this.f26650c.size() && f() != null; i11++) {
        }
    }

    @Override // com.ironsource.environment.j
    public final void a(boolean z10) {
        Boolean bool;
        if (this.f26656i) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z11 = false;
            ironSourceLoggerManager.log(ironSourceTag, "Network Availability Changed To: " + z10, 0);
            Boolean bool2 = this.f26657j;
            if (bool2 != null) {
                if (z10 && !bool2.booleanValue() && j()) {
                    bool = Boolean.TRUE;
                } else if (!z10 && this.f26657j.booleanValue()) {
                    bool = Boolean.FALSE;
                }
                this.f26657j = bool;
                z11 = true;
            }
            if (z11) {
                this.f26802r = !z10;
                this.f26797m.onRewardedVideoAvailabilityChanged(z10);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final synchronized void a(boolean z10, ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f26981d + ": onRewardedVideoAvailabilityChanged(available:" + z10 + ")", 1);
        if (this.f26802r) {
            return;
        }
        if (z10 && this.f26807w) {
            this.f26807w = false;
            a(1003, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f26808x)}});
            q();
        }
        if (aeVar.equals(this.f26651d)) {
            if (a(z10, false)) {
                this.f26797m.onRewardedVideoAvailabilityChanged(this.f26657j.booleanValue());
            }
            return;
        }
        if (aeVar.equals(this.f26652e)) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f26655h;
            ironSourceLoggerManager2.log(ironSourceTag, aeVar.f26981d + " is a premium adapter, canShowPremium: " + a(), 1);
            if (!a()) {
                aeVar.a(AbstractC1728b.a.CAPPED_PER_SESSION);
                if (a(false, false)) {
                    this.f26797m.onRewardedVideoAvailabilityChanged(this.f26657j.booleanValue());
                }
                return;
            }
        }
        if (!this.f26648a.c(aeVar)) {
            if (!z10 || !aeVar.c()) {
                if (a(false, false)) {
                    a((Map<String, Object>) null);
                }
                f();
                m();
            } else if (a(true, false)) {
                this.f26797m.onRewardedVideoAvailabilityChanged(this.f26657j.booleanValue());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC1727a
    protected final synchronized void b() {
        super.b();
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            if (next.equals(this.f26652e)) {
                next.a(AbstractC1728b.a.CAPPED_PER_SESSION);
                f();
                return;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void b(ae aeVar) {
        String str;
        AbstractC1728b next;
        this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, aeVar.f26981d + ":onRewardedVideoAdClosed()", 1);
        this.f26809y = false;
        StringBuilder sb2 = new StringBuilder();
        try {
            Iterator<AbstractC1728b> it = this.f26650c.iterator();
            while (it.hasNext()) {
                if (((ae) it.next()).o()) {
                    sb2.append(next.f26981d + ";");
                }
            }
        } catch (Throwable unused) {
            this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "Failed to check RV availability", 0);
        }
        Object[][] objArr = new Object[3];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "placement";
        objArr2[1] = p();
        objArr[0] = objArr2;
        Object[] objArr3 = new Object[2];
        objArr3[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb3 = new StringBuilder("otherRVAvailable = ");
        if (sb2.length() > 0) {
            str = "true|" + ((Object) sb2);
        } else {
            str = "false";
        }
        sb3.append(str);
        objArr3[1] = sb3.toString();
        objArr[1] = objArr3;
        Object[] objArr4 = new Object[2];
        objArr4[0] = IronSourceConstants.KEY_SESSION_DEPTH;
        objArr4[1] = Integer.valueOf(aeVar.f26963w);
        objArr[2] = objArr4;
        a(IronSourceConstants.RV_INSTANCE_CLOSED, aeVar, objArr);
        com.ironsource.mediationsdk.utils.o.a().a(1);
        if (!aeVar.b() && !this.f26648a.c(aeVar)) {
            a(1001, aeVar, (Object[][]) null);
        }
        b(false);
        this.f26797m.onRewardedVideoAdClosed();
        q();
        Iterator<AbstractC1728b> it2 = this.f26650c.iterator();
        while (it2.hasNext()) {
            AbstractC1728b next2 = it2.next();
            IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "Fetch on ad closed, iterating on: " + next2.f26981d + ", Status: " + next2.f26978a, 0);
            AbstractC1728b.a aVar = next2.f26978a;
            if (aVar == AbstractC1728b.a.NOT_AVAILABLE || aVar == AbstractC1728b.a.NEEDS_RELOAD) {
                try {
                    if (!next2.f26981d.equals(aeVar.f26981d)) {
                        this.f26655h.log(ironSourceTag, next2.f26981d + ":reload smash", 1);
                        ((ae) next2).n();
                        a(1001, next2, (Object[][]) null);
                    }
                } catch (Throwable th) {
                    this.f26655h.log(IronSourceLogger.IronSourceTag.NATIVE, next2.f26981d + " Failed to call fetchVideo(), " + th.getLocalizedMessage(), 1);
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void c(ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f26981d + ":onRewardedVideoAdStarted()", 1);
        a(IronSourceConstants.RV_INSTANCE_STARTED, aeVar, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f26963w)}});
        this.f26797m.onRewardedVideoAdStarted();
    }

    public final synchronized boolean c() {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, this.f26801q + ":isRewardedVideoAvailable()", 1);
        if (!this.f26656i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            Iterator<AbstractC1728b> it = this.f26650c.iterator();
            while (it.hasNext()) {
                AbstractC1728b next = it.next();
                if (next.c() && ((ae) next).o()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.InterfaceC1729c
    public final void c_() {
        if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext()) || this.f26657j == null) {
            IronLog.INTERNAL.info("while reloading mediation due to expiration, internet loss occurred");
            a(IronSourceConstants.TROUBLESHOOTING_RV_TRADITIONAL_RELOAD_FAILED_INTERNET_LOSS, (Object[][]) null);
            return;
        }
        if (a(false, true)) {
            a(a.AnonymousClass1.a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        }
        b(true);
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            AbstractC1728b.a aVar = next.f26978a;
            if (aVar == AbstractC1728b.a.AVAILABLE || aVar == AbstractC1728b.a.NOT_AVAILABLE) {
                next.a(AbstractC1728b.a.NEEDS_RELOAD);
            }
        }
        Iterator<AbstractC1728b> it2 = this.f26650c.iterator();
        while (it2.hasNext()) {
            AbstractC1728b next2 = it2.next();
            if (next2.f26978a == AbstractC1728b.a.NEEDS_RELOAD) {
                try {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.info(next2.f26981d + ":reload smash");
                    a(1001, next2, (Object[][]) null);
                    ((ae) next2).n();
                } catch (Throwable th) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.error(next2.f26981d + " Failed to call fetchVideo(), " + th.getLocalizedMessage());
                }
            }
        }
    }

    void d() {
        if (this.f26799o <= 0) {
            this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "load interval is not set, ignoring", 1);
            return;
        }
        Timer timer = this.f26805u;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f26805u = timer2;
        timer2.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.ad.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                cancel();
                ad.this.e();
                ad.this.d();
            }
        }, this.f26799o * 1000);
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void d(ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f26981d + ":onRewardedVideoAdEnded()", 1);
        a(IronSourceConstants.RV_INSTANCE_ENDED, aeVar, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f26963w)}});
        this.f26797m.onRewardedVideoAdEnded();
    }

    synchronized void e() {
        Boolean bool;
        if (IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity()) && (bool = this.f26657j) != null) {
            if (!bool.booleanValue()) {
                a(102, (Object[][]) null);
                a(1000, (Object[][]) null);
                this.f26807w = true;
                Iterator<AbstractC1728b> it = this.f26650c.iterator();
                while (it.hasNext()) {
                    AbstractC1728b next = it.next();
                    if (next.f26978a == AbstractC1728b.a.NOT_AVAILABLE) {
                        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                        ironSourceLoggerManager.log(ironSourceTag, "Fetch from timer: " + next.f26981d + ":reload smash", 1);
                        a(1001, next, (Object[][]) null);
                        ((ae) next).n();
                    }
                }
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void e(ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f26981d + ":onRewardedVideoAdRewarded()", 1);
        if (this.f26804t == null) {
            this.f26804t = J.a().f26337i.f27494c.f27233a.a();
        }
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(aeVar);
        try {
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, aeVar.f26963w);
            if (this.f26804t != null) {
                providerAdditionalData.put("placement", p());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f26804t.getRewardName());
                providerAdditionalData.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, this.f26804t.getRewardAmount());
            } else {
                this.f26655h.log(ironSourceTag, "mCurrentPlacement is null", 3);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, providerAdditionalData);
        if (!TextUtils.isEmpty(this.f26654g)) {
            cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), aeVar.j()));
            if (!TextUtils.isEmpty(J.a().f26341m)) {
                cVar.a(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, J.a().f26341m);
            }
            Map<String, String> map = J.a().f26342n;
            if (map != null) {
                for (String str : map.keySet()) {
                    cVar.a("custom_" + str, map.get(str));
                }
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(cVar);
        Placement placement = this.f26804t;
        if (placement != null) {
            this.f26797m.onRewardedVideoAdRewarded(placement);
        } else {
            this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "mCurrentPlacement is null", 3);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void f(ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f26981d + ":onRewardedVideoAdClicked()", 1);
        if (this.f26804t == null) {
            this.f26804t = J.a().f26337i.f27494c.f27233a.a();
        }
        if (this.f26804t == null) {
            this.f26655h.log(ironSourceTag, "mCurrentPlacement is null", 3);
            return;
        }
        a(1006, aeVar, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f26963w)}});
        this.f26797m.onRewardedVideoAdClicked(this.f26804t);
    }

    @Override // com.ironsource.mediationsdk.utils.d
    public final void g() {
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            if (next.f26978a == AbstractC1728b.a.CAPPED_PER_DAY) {
                a(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", "false"}});
                next.a(AbstractC1728b.a.NOT_AVAILABLE);
                if (((ae) next).o() && next.c()) {
                    next.a(AbstractC1728b.a.AVAILABLE);
                    z10 = true;
                }
            }
        }
        if (z10 && a(true, false)) {
            this.f26797m.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.m
    public final void g(ae aeVar) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, aeVar.f26981d + ":onRewardedVideoAdVisible()", 1);
        if (this.f26804t != null) {
            a(IronSourceConstants.RV_INSTANCE_VISIBLE, aeVar, new Object[][]{new Object[]{"placement", p()}, new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(aeVar.f26963w)}});
        } else {
            this.f26655h.log(ironSourceTag, "mCurrentPlacement is null", 3);
        }
    }
}
