package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractC1728b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.O;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.k;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class G extends AbstractC1727a implements com.ironsource.mediationsdk.sdk.i, com.ironsource.mediationsdk.utils.d, com.ironsource.mediationsdk.utils.i {

    /* renamed from: m  reason: collision with root package name */
    com.ironsource.mediationsdk.sdk.j f26261m;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26266r;

    /* renamed from: s  reason: collision with root package name */
    private InterstitialPlacement f26267s;

    /* renamed from: w  reason: collision with root package name */
    private long f26271w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f26272x;

    /* renamed from: o  reason: collision with root package name */
    private final String f26263o = G.class.getName();

    /* renamed from: v  reason: collision with root package name */
    private CopyOnWriteArraySet<String> f26270v = new CopyOnWriteArraySet<>();

    /* renamed from: u  reason: collision with root package name */
    private Map<String, H> f26269u = new ConcurrentHashMap();

    /* renamed from: n  reason: collision with root package name */
    C1744r f26262n = C1744r.a();

    /* renamed from: t  reason: collision with root package name */
    private boolean f26268t = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f26265q = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f26264p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G() {
        this.f26648a = new com.ironsource.mediationsdk.utils.e("interstitial", this);
        this.f26272x = false;
    }

    private int a(AbstractC1728b.a... aVarArr) {
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            for (AbstractC1728b.a aVar : aVarArr) {
                if (next.f26978a == aVar) {
                    i10++;
                }
            }
        }
        return i10;
    }

    private void a(int i10, AbstractC1728b abstractC1728b, Object[][] objArr) {
        a(i10, abstractC1728b, objArr, false);
    }

    private void a(int i10, AbstractC1728b abstractC1728b, Object[][] objArr, boolean z10) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(abstractC1728b);
        if (z10) {
            try {
                InterstitialPlacement interstitialPlacement = this.f26267s;
                if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                    providerAdditionalData.put("placement", this.f26267s.getPlacementName());
                }
            } catch (Exception e10) {
                this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, providerAdditionalData));
    }

    private void a(int i10, Object[][] objArr) {
        a(i10, objArr, false);
    }

    private void a(int i10, Object[][] objArr, boolean z10) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        if (z10) {
            try {
                InterstitialPlacement interstitialPlacement = this.f26267s;
                if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                    mediationAdditionalData.put("placement", this.f26267s.getPlacementName());
                }
            } catch (Exception e10) {
                this.f26655h.log(IronSourceLogger.IronSourceTag.INTERNAL, "InterstitialManager logMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        if (objArr != null) {
            for (Object[] objArr2 : objArr) {
                mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
            }
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, mediationAdditionalData));
    }

    private void b(int i10, AbstractC1728b abstractC1728b, Object[][] objArr) {
        a(i10, abstractC1728b, objArr, true);
    }

    private void c(AbstractC1728b abstractC1728b) {
        if (abstractC1728b.c()) {
            abstractC1728b.a(AbstractC1728b.a.INITIATED);
            return;
        }
        i();
        h();
    }

    private synchronized AbstractAdapter g(H h10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager.log(ironSourceTag, this.f26263o + ":startAdapter(" + h10.j() + ")", 1);
        C1730d a10 = C1730d.a();
        NetworkSettings networkSettings = h10.f26980c;
        AbstractAdapter a11 = a10.a(networkSettings, networkSettings.getInterstitialSettings(), false, false);
        if (a11 == null) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f26655h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager2.log(ironSourceTag2, h10.f26981d + " is configured in IronSource's platform, but the adapter is not integrated", 2);
            return null;
        }
        h10.f26979b = a11;
        h10.a(AbstractC1728b.a.INIT_PENDING);
        b((AbstractC1728b) h10);
        String str = this.f26654g;
        String str2 = this.f26653f;
        h10.h();
        AbstractAdapter abstractAdapter = h10.f26979b;
        if (abstractAdapter != null) {
            abstractAdapter.addInterstitialListener(h10);
            IronSourceLoggerManager ironSourceLoggerManager3 = h10.f26994q;
            IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager3.log(ironSourceTag3, h10.f26981d + ":initInterstitial()", 1);
            h10.f26979b.initInterstitial(str, str2, h10.f26273r, h10);
        }
        return a11;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void h() {
        /*
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r5.f26650c
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.AbstractC1728b) r1
            com.ironsource.mediationsdk.b$a r1 = r1.f26978a
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC1728b.a.NOT_INITIATED
            if (r1 == r3) goto L29
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC1728b.a.INIT_PENDING
            if (r1 == r3) goto L29
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC1728b.a.INITIATED
            if (r1 == r3) goto L29
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC1728b.a.LOAD_PENDING
            if (r1 == r3) goto L29
            com.ironsource.mediationsdk.b$a r3 = com.ironsource.mediationsdk.AbstractC1728b.a.AVAILABLE
            if (r1 != r3) goto L6
        L29:
            r0 = 0
            goto L2c
        L2b:
            r0 = 1
        L2c:
            if (r0 == 0) goto L5c
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f26655h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "Reset Iteration"
            r0.log(r1, r3, r2)
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.b> r0 = r5.f26650c
            java.util.Iterator r0 = r0.iterator()
        L3d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            com.ironsource.mediationsdk.b r1 = (com.ironsource.mediationsdk.AbstractC1728b) r1
            com.ironsource.mediationsdk.b$a r3 = r1.f26978a
            com.ironsource.mediationsdk.b$a r4 = com.ironsource.mediationsdk.AbstractC1728b.a.EXHAUSTED
            if (r3 != r4) goto L3d
            r1.g()
            goto L3d
        L53:
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r5.f26655h
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL
            java.lang.String r3 = "End of Reset Iteration"
            r0.log(r1, r3, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.G.h():void");
    }

    private synchronized void h(H h10) {
        a(2002, h10, (Object[][]) null);
        h10.i();
        if (h10.f26979b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = h10.f26994q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
            ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":loadInterstitial()", 1);
            h10.f26275t = new Date().getTime();
            h10.f26979b.loadInterstitial(h10.f26273r, h10);
        }
    }

    private AbstractAdapter i() {
        AbstractAdapter abstractAdapter = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26650c.size() && abstractAdapter == null; i11++) {
            if (this.f26650c.get(i11).f26978a == AbstractC1728b.a.AVAILABLE || this.f26650c.get(i11).f26978a == AbstractC1728b.a.INITIATED || this.f26650c.get(i11).f26978a == AbstractC1728b.a.INIT_PENDING || this.f26650c.get(i11).f26978a == AbstractC1728b.a.LOAD_PENDING) {
                i10++;
                if (i10 >= this.f26649b) {
                    break;
                }
            } else if (this.f26650c.get(i11).f26978a == AbstractC1728b.a.NOT_INITIATED && (abstractAdapter = g((H) this.f26650c.get(i11))) == null) {
                this.f26650c.get(i11).a(AbstractC1728b.a.INIT_FAILED);
            }
        }
        return abstractAdapter;
    }

    private synchronized void j() {
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            AbstractC1728b.a aVar = next.f26978a;
            if (aVar == AbstractC1728b.a.AVAILABLE || aVar == AbstractC1728b.a.LOAD_PENDING || aVar == AbstractC1728b.a.NOT_AVAILABLE) {
                next.a(AbstractC1728b.a.INITIATED);
            }
        }
    }

    private void k() {
        for (int i10 = 0; i10 < this.f26650c.size(); i10++) {
            String providerTypeForReflection = this.f26650c.get(i10).f26980c.getProviderTypeForReflection();
            if (providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME) || providerTypeForReflection.equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME)) {
                C1730d.a().a(this.f26650c.get(i10).f26980c, this.f26650c.get(i10).f26980c.getInterstitialSettings(), false, false);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC1727a
    public final void a(Context context, boolean z10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, this.f26263o + " Should Track Network State: " + z10, 0);
        this.f26656i = z10;
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final synchronized void a(H h10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + " :onInterstitialInitSuccess()", 1);
        a(IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, h10, (Object[][]) null);
        this.f26266r = true;
        if (this.f26264p) {
            AbstractC1728b.a aVar = AbstractC1728b.a.LOAD_PENDING;
            if (a(AbstractC1728b.a.AVAILABLE, aVar) < this.f26649b) {
                h10.a(aVar);
                h(h10);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final synchronized void a(H h10, long j10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":onInterstitialAdReady()", 1);
        a(2003, h10, new Object[][]{new Object[]{"duration", Long.valueOf(j10)}});
        long time = new Date().getTime() - this.f26271w;
        h10.a(AbstractC1728b.a.AVAILABLE);
        this.f26265q = false;
        if (this.f26268t) {
            this.f26268t = false;
            this.f26261m.onInterstitialAdReady();
            a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(time)}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final synchronized void a(IronSourceError ironSourceError, H h10) {
        AbstractC1728b.a aVar;
        try {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":onInterstitialInitFailed(" + ironSourceError + ")", 1);
            a(IronSourceConstants.IS_INSTANCE_INIT_FAILED, h10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            aVar = AbstractC1728b.a.INIT_FAILED;
        } catch (Exception e10) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f26655h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
            ironSourceLoggerManager2.logException(ironSourceTag2, "onInterstitialInitFailed(error:" + ironSourceError + ", provider:" + h10.j() + ")", e10);
        }
        if (a(aVar) < this.f26650c.size()) {
            if (i() == null && this.f26264p && a(aVar, AbstractC1728b.a.NOT_AVAILABLE, AbstractC1728b.a.CAPPED_PER_SESSION, AbstractC1728b.a.CAPPED_PER_DAY, AbstractC1728b.a.EXHAUSTED) >= this.f26650c.size()) {
                this.f26262n.a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
                a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}});
                this.f26268t = false;
            }
            h();
            return;
        }
        IronSourceLoggerManager ironSourceLoggerManager3 = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager3.log(ironSourceTag3, "Smart Loading - initialization failed - no adapters are initiated and no more left to init, error: " + ironSourceError.getErrorMessage(), 2);
        if (this.f26264p) {
            this.f26262n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildGenericError("no ads to show"));
            a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_GENERIC)}});
            this.f26268t = false;
        }
        this.f26266r = true;
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final synchronized void a(IronSourceError ironSourceError, H h10, long j10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        IronSourceUtils.sendAutomationLog(h10.f26981d + ":onInterstitialAdLoadFailed(" + ironSourceError + ")");
        if (ironSourceError.getErrorCode() == 1158) {
            a(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL, h10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(j10)}});
        } else {
            a(IronSourceConstants.IS_INSTANCE_LOAD_FAILED, h10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(j10)}});
        }
        h10.a(AbstractC1728b.a.NOT_AVAILABLE);
        int a10 = a(AbstractC1728b.a.AVAILABLE, AbstractC1728b.a.LOAD_PENDING);
        if (a10 >= this.f26649b) {
            return;
        }
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            if (next.f26978a == AbstractC1728b.a.INITIATED) {
                next.a(AbstractC1728b.a.LOAD_PENDING);
                h((H) next);
                return;
            }
        }
        if (i() != null) {
            return;
        }
        if (this.f26264p && a10 + a(AbstractC1728b.a.INIT_PENDING) == 0) {
            h();
            this.f26265q = false;
            this.f26262n.a(IronSource.AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "No ads to show"));
            a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW)}});
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(InterstitialPlacement interstitialPlacement) {
        this.f26267s = interstitialPlacement;
        this.f26261m.f27339e = interstitialPlacement;
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(String str) {
        if (this.f26264p) {
            this.f26262n.a(IronSource.AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            this.f26264p = false;
            this.f26265q = false;
        }
    }

    public final synchronized void a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager.log(ironSourceTag, this.f26263o + ":initInterstitial(appKey: " + str + ", userId: " + str2 + ")", 1);
        long time = new Date().getTime();
        a(IronSourceConstants.IS_MANAGER_INIT_STARTED, (Object[][]) null);
        this.f26654g = str;
        this.f26653f = str2;
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            if (this.f26648a.b(next)) {
                a(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", "false"}});
            }
            if (this.f26648a.c(next)) {
                next.a(AbstractC1728b.a.CAPPED_PER_DAY);
                i10++;
            }
        }
        if (i10 == this.f26650c.size()) {
            this.f26266r = true;
        }
        k();
        for (int i11 = 0; i11 < this.f26649b && i() != null; i11++) {
        }
        a(IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void a(List<IronSource.AD_UNIT> list, boolean z10, com.ironsource.mediationsdk.model.g gVar) {
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void b(H h10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":onInterstitialAdOpened()", 1);
        b(IronSourceConstants.IS_INSTANCE_OPENED, h10, null);
        this.f26261m.onInterstitialAdOpened();
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void b(IronSourceError ironSourceError, H h10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, h10, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        this.f26272x = false;
        c((AbstractC1728b) h10);
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        while (it.hasNext()) {
            if (it.next().f26978a == AbstractC1728b.a.AVAILABLE) {
                this.f26264p = true;
                InterstitialPlacement interstitialPlacement = this.f26267s;
                if (interstitialPlacement != null) {
                    interstitialPlacement.getPlacementName();
                }
                d();
                return;
            }
        }
        this.f26261m.onInterstitialAdShowFailed(ironSourceError);
    }

    public final synchronized void c() {
        try {
            if (this.f26272x) {
                this.f26655h.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial cannot be invoked while showing an ad", 3);
                D.a().a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial cannot be invoked while showing an ad"));
                return;
            }
            this.f26267s = null;
            this.f26261m.f27339e = null;
            if (!this.f26265q) {
                C1744r c1744r = this.f26262n;
                IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
                if (!c1744r.a(ad_unit)) {
                    O.a b10 = O.a().b();
                    if (b10 == O.a.NOT_INIT) {
                        this.f26655h.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                        return;
                    } else if (b10 == O.a.INIT_IN_PROGRESS) {
                        if (O.a().c()) {
                            this.f26655h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                            this.f26262n.a(ad_unit, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                            return;
                        }
                        this.f26271w = new Date().getTime();
                        a(2001, (Object[][]) null);
                        this.f26264p = true;
                        this.f26268t = true;
                        return;
                    } else if (b10 == O.a.INIT_FAILED) {
                        this.f26655h.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        this.f26262n.a(ad_unit, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else if (this.f26650c.size() == 0) {
                        this.f26655h.log(IronSourceLogger.IronSourceTag.API, "the server response does not contain interstitial data", 3);
                        this.f26262n.a(ad_unit, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    } else {
                        this.f26271w = new Date().getTime();
                        a(2001, (Object[][]) null);
                        this.f26268t = true;
                        j();
                        if (a(AbstractC1728b.a.INITIATED) == 0) {
                            if (!this.f26266r) {
                                this.f26264p = true;
                                return;
                            }
                            IronSourceError buildGenericError = ErrorBuilder.buildGenericError("no ads to load");
                            this.f26655h.log(IronSourceLogger.IronSourceTag.API, buildGenericError.getErrorMessage(), 1);
                            this.f26262n.a(ad_unit, buildGenericError);
                            a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildGenericError.getErrorCode())}});
                            this.f26268t = false;
                            return;
                        }
                        this.f26264p = true;
                        this.f26265q = true;
                        Iterator<AbstractC1728b> it = this.f26650c.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            AbstractC1728b next = it.next();
                            if (next.f26978a == AbstractC1728b.a.INITIATED) {
                                next.a(AbstractC1728b.a.LOAD_PENDING);
                                h((H) next);
                                i10++;
                                if (i10 >= this.f26649b) {
                                    return;
                                }
                            }
                        }
                        return;
                    }
                }
            }
            this.f26655h.log(IronSourceLogger.IronSourceTag.API, "Load Interstitial is already in progress", 3);
        } catch (Exception e10) {
            e10.printStackTrace();
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadInterstitial exception " + e10.getMessage());
            this.f26655h.log(IronSourceLogger.IronSourceTag.API, buildLoadFailedError.getErrorMessage(), 3);
            this.f26262n.a(IronSource.AD_UNIT.INTERSTITIAL, buildLoadFailedError);
            if (this.f26268t) {
                this.f26268t = false;
                a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildLoadFailedError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e10.getMessage()}});
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void c(H h10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":onInterstitialAdClosed()", 1);
        this.f26272x = false;
        b(IronSourceConstants.IS_INSTANCE_CLOSED, h10, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(com.ironsource.mediationsdk.utils.o.a().b(2))}});
        com.ironsource.mediationsdk.utils.o.a().a(2);
        this.f26261m.onInterstitialAdClosed();
    }

    public final void d() {
        if (this.f26272x) {
            this.f26655h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad while an ad is already showing", 3);
            this.f26261m.onInterstitialAdShowFailed(new IronSourceError(IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW, "showInterstitial error: can't show ad while an ad is already showing"));
        } else if (!this.f26264p) {
            this.f26655h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial failed - You need to load interstitial before showing it", 3);
            this.f26261m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - You need to load interstitial before showing it"));
        } else if (this.f26656i && !IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            this.f26655h.log(IronSourceLogger.IronSourceTag.API, "showInterstitial error: can't show ad when there's no internet connection", 3);
            this.f26261m.onInterstitialAdShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
        } else {
            for (int i10 = 0; i10 < this.f26650c.size(); i10++) {
                AbstractC1728b abstractC1728b = this.f26650c.get(i10);
                if (abstractC1728b.f26978a == AbstractC1728b.a.AVAILABLE) {
                    com.ironsource.mediationsdk.utils.k.c(ContextProvider.getInstance().getCurrentActiveActivity(), this.f26267s);
                    if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), this.f26267s) != k.a.f27478d) {
                        a(IronSourceConstants.IS_CAP_PLACEMENT, (Object[][]) null, true);
                    }
                    b(IronSourceConstants.IS_INSTANCE_SHOW, abstractC1728b, null);
                    this.f26272x = true;
                    H h10 = (H) abstractC1728b;
                    if (h10.f26979b != null) {
                        IronSourceLoggerManager ironSourceLoggerManager = h10.f26994q;
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":showInterstitial()", 1);
                        h10.d();
                        h10.f26979b.showInterstitial(h10.f26273r, h10);
                    }
                    if (abstractC1728b.b()) {
                        a(IronSourceConstants.IS_CAP_SESSION, abstractC1728b, (Object[][]) null);
                    }
                    this.f26648a.a(abstractC1728b);
                    if (this.f26648a.c(abstractC1728b)) {
                        abstractC1728b.a(AbstractC1728b.a.CAPPED_PER_DAY);
                        a(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, abstractC1728b, new Object[][]{new Object[]{"status", InneractiveMediationDefs.SHOW_HOUSE_AD_YES}});
                    }
                    this.f26264p = false;
                    if (abstractC1728b.c()) {
                        return;
                    }
                    i();
                    return;
                }
            }
            this.f26261m.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.INTERSTITIAL_AD_UNIT, "showInterstitial failed - No adapters ready to show"));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void d(H h10) {
        AbstractC1728b.a aVar;
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":onInterstitialAdShowSucceeded()", 1);
        b(IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, h10, null);
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            if (next.f26978a == AbstractC1728b.a.AVAILABLE) {
                c(next);
                z10 = true;
            }
        }
        if (!z10 && ((aVar = h10.f26978a) == AbstractC1728b.a.CAPPED_PER_SESSION || aVar == AbstractC1728b.a.EXHAUSTED || aVar == AbstractC1728b.a.CAPPED_PER_DAY)) {
            h();
        }
        j();
        this.f26261m.onInterstitialAdShowSucceeded();
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void e(H h10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":onInterstitialAdClicked()", 1);
        b(2006, h10, null);
        this.f26261m.onInterstitialAdClicked();
    }

    public final synchronized boolean e() {
        boolean z10;
        if (!this.f26656i || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
            Iterator<AbstractC1728b> it = this.f26650c.iterator();
            while (it.hasNext()) {
                AbstractC1728b next = it.next();
                if (next.f26978a == AbstractC1728b.a.AVAILABLE) {
                    H h10 = (H) next;
                    if (h10.f26979b != null) {
                        IronSourceLoggerManager ironSourceLoggerManager = h10.f26994q;
                        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":isInterstitialReady()", 1);
                        z10 = h10.f26979b.isInterstitialReady(h10.f26273r);
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.utils.i
    public final void f() {
        if (this.f26264p) {
            IronSourceError buildInitFailedError = ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            this.f26262n.a(IronSource.AD_UNIT.INTERSTITIAL, buildInitFailedError);
            this.f26264p = false;
            this.f26265q = false;
            if (this.f26268t) {
                a(IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(buildInitFailedError.getErrorCode())}}, false);
                this.f26268t = false;
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.i
    public final void f(H h10) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26655h;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, h10.f26981d + ":onInterstitialAdVisible()", 1);
    }

    @Override // com.ironsource.mediationsdk.utils.d
    public final void g() {
        Iterator<AbstractC1728b> it = this.f26650c.iterator();
        while (it.hasNext()) {
            AbstractC1728b next = it.next();
            if (next.f26978a == AbstractC1728b.a.CAPPED_PER_DAY) {
                a(IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, next, new Object[][]{new Object[]{"status", "false"}});
                next.a(next.b() ? AbstractC1728b.a.CAPPED_PER_SESSION : next.a() ? AbstractC1728b.a.EXHAUSTED : AbstractC1728b.a.INITIATED);
            }
        }
    }
}
