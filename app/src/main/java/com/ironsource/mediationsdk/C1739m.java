package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1740n;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.m  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1739m implements com.ironsource.mediationsdk.sdk.a {

    /* renamed from: a  reason: collision with root package name */
    private C1740n f27163a;

    /* renamed from: b  reason: collision with root package name */
    private IronSourceBannerLayout f27164b;

    /* renamed from: c  reason: collision with root package name */
    private com.ironsource.mediationsdk.model.f f27165c;

    /* renamed from: f  reason: collision with root package name */
    private String f27168f;

    /* renamed from: g  reason: collision with root package name */
    private String f27169g;

    /* renamed from: i  reason: collision with root package name */
    private long f27171i;

    /* renamed from: j  reason: collision with root package name */
    private Timer f27172j;

    /* renamed from: m  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.f f27175m;

    /* renamed from: n  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.f f27176n;

    /* renamed from: o  reason: collision with root package name */
    private int f27177o;

    /* renamed from: p  reason: collision with root package name */
    private int f27178p;

    /* renamed from: h  reason: collision with root package name */
    private final CopyOnWriteArrayList<C1740n> f27170h = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private IronSourceLoggerManager f27167e = IronSourceLoggerManager.getLogger();

    /* renamed from: d  reason: collision with root package name */
    private a f27166d = a.NOT_INITIATED;

    /* renamed from: l  reason: collision with root package name */
    private AtomicBoolean f27174l = new AtomicBoolean();

    /* renamed from: k  reason: collision with root package name */
    private AtomicBoolean f27173k = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.m$a */
    /* loaded from: classes3.dex */
    public enum a {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C1739m(List<NetworkSettings> list, String str, String str2, long j10, int i10, int i11) {
        this.f27168f = str;
        this.f27169g = str2;
        this.f27171i = i10;
        C1738l.a().f27141a = i11;
        for (int i12 = 0; i12 < list.size(); i12++) {
            NetworkSettings networkSettings = list.get(i12);
            AbstractAdapter a10 = C1730d.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a10 == null || !C1731e.a().a(a10)) {
                a(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.f27170h.add(new C1740n(this, networkSettings, a10, j10, i12 + 1));
            }
        }
        this.f27165c = null;
        a(a.READY_TO_LOAD);
    }

    private void a(int i10) {
        a(i10, (Object[][]) null);
    }

    private void a(int i10, C1740n c1740n) {
        a(i10, c1740n, (Object[][]) null);
    }

    private void a(int i10, C1740n c1740n, Object[][] objArr) {
        a(i10, c1740n, objArr, this.f27178p);
    }

    private void a(int i10, C1740n c1740n, Object[][] objArr, int i11) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(c1740n);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.f27164b;
            if (ironSourceBannerLayout != null) {
                a(providerAdditionalData, ironSourceBannerLayout.getSize());
            }
            com.ironsource.mediationsdk.model.f fVar = this.f27165c;
            if (fVar != null) {
                providerAdditionalData.put("placement", fVar.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i11);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e10) {
            this.f27167e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e10), 3);
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, providerAdditionalData));
    }

    private void a(int i10, Object[][] objArr) {
        a(i10, objArr, this.f27178p);
    }

    private void a(int i10, Object[][] objArr, int i11) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.f27164b;
            if (ironSourceBannerLayout != null) {
                a(mediationAdditionalData, ironSourceBannerLayout.getSize());
            }
            com.ironsource.mediationsdk.model.f fVar = this.f27165c;
            if (fVar != null) {
                mediationAdditionalData.put("placement", fVar.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i11);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e10) {
            this.f27167e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e10), 3);
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i10, mediationAdditionalData));
    }

    private void a(a aVar) {
        this.f27166d = aVar;
        a("state=" + aVar.name());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void a(com.ironsource.mediationsdk.C1739m r9) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C1739m.a(com.ironsource.mediationsdk.m):void");
    }

    private void a(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f27167e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    private void a(JSONObject jSONObject, ISBannerSize iSBannerSize) {
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
                jSONObject.put("bannerAdSize", 1);
            } else if (c10 == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c10 == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c10 == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c10 != 4) {
            } else {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e10) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f27167e;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "sendProviderEvent " + Log.getStackTraceString(e10), 3);
        }
    }

    private boolean a() {
        IronSourceBannerLayout ironSourceBannerLayout = this.f27164b;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    private void b() {
        Iterator<C1740n> it = this.f27170h.iterator();
        while (it.hasNext()) {
            it.next().f27298d = true;
        }
    }

    private void b(C1740n c1740n, View view, FrameLayout.LayoutParams layoutParams) {
        this.f27163a = c1740n;
        this.f27164b.a(view, layoutParams);
    }

    private void b(C1740n c1740n, View view, FrameLayout.LayoutParams layoutParams, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z10 + " smash - " + c1740n.a());
        a(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, c1740n, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27176n))}});
        a(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27175m))}});
        this.f27177o = com.ironsource.mediationsdk.utils.o.a().b(3);
        com.ironsource.mediationsdk.utils.o.a().a(3);
        if (z10) {
            b(c1740n, view, layoutParams);
        }
        d();
    }

    private boolean c() {
        Iterator<C1740n> it = this.f27170h.iterator();
        while (it.hasNext()) {
            C1740n next = it.next();
            if (next.f27298d && this.f27163a != next) {
                a(this.f27166d == a.FIRST_LOAD_IN_PROGRESS ? 3002 : IronSourceConstants.BN_INSTANCE_RELOAD, next, (Object[][]) null);
                this.f27176n = new com.ironsource.mediationsdk.utils.f();
                next.a(this.f27164b.a(), this.f27168f, this.f27169g);
                return true;
            }
        }
        return false;
    }

    private void d() {
        try {
            e();
            if (this.f27171i > 0) {
                Timer timer = new Timer();
                this.f27172j = timer;
                timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.m.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        C1739m.a(C1739m.this);
                    }
                }, this.f27171i * 1000);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void e() {
        Timer timer = this.f27172j;
        if (timer != null) {
            timer.cancel();
            this.f27172j = null;
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.f27167e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.f27167e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            a(IronSourceConstants.BN_DESTROY, (Object[][]) null, this.f27177o);
            e();
            C1740n c1740n = this.f27163a;
            if (c1740n != null) {
                a(IronSourceConstants.BN_INSTANCE_DESTROY, c1740n, (Object[][]) null);
                C1740n c1740n2 = this.f27163a;
                c1740n2.a("destroyBanner()");
                AbstractAdapter abstractAdapter = c1740n2.f27295a;
                if (abstractAdapter == null) {
                    c1740n2.a("destroyBanner() mAdapter == null");
                } else {
                    abstractAdapter.destroyBanner(c1740n2.f27296b.getBannerSettings());
                    c1740n2.a(C1740n.a.DESTROYED);
                }
                this.f27163a = null;
            }
            ironSourceBannerLayout.b();
            this.f27164b = null;
            this.f27165c = null;
            a(a.READY_TO_LOAD);
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.f fVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (fVar != null && !TextUtils.isEmpty(fVar.getPlacementName())) {
                        a aVar = this.f27166d;
                        a aVar2 = a.READY_TO_LOAD;
                        if (aVar == aVar2 && !C1738l.a().b()) {
                            this.f27178p = com.ironsource.mediationsdk.utils.o.a().b(3);
                            a(a.FIRST_LOAD_IN_PROGRESS);
                            this.f27164b = ironSourceBannerLayout;
                            this.f27165c = fVar;
                            a(3001, (Object[][]) null);
                            if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), fVar.getPlacementName())) {
                                C1738l a10 = C1738l.a();
                                a10.a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, "placement " + fVar.getPlacementName() + " is capped"));
                                a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED)}});
                                a(aVar2);
                                return;
                            }
                            this.f27175m = new com.ironsource.mediationsdk.utils.f();
                            Iterator<C1740n> it = this.f27170h.iterator();
                            while (it.hasNext()) {
                                it.next().f27298d = true;
                            }
                            this.f27176n = new com.ironsource.mediationsdk.utils.f();
                            C1740n c1740n = this.f27170h.get(0);
                            a(3002, c1740n, (Object[][]) null);
                            c1740n.a(ironSourceBannerLayout.a(), this.f27168f, this.f27169g);
                            return;
                        }
                        this.f27167e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                        return;
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = fVar == null ? "placement is null" : "placement name is empty";
                    this.f27167e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e10) {
                C1738l a11 = C1738l.a();
                a11.a(ironSourceBannerLayout, new IronSourceError(IronSourceError.ERROR_BN_LOAD_EXCEPTION, "loadBanner() failed " + e10.getMessage()), false);
                a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_EXCEPTION)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e10.getMessage()}});
                a(a.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.f27167e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(IronSourceError ironSourceError, C1740n c1740n, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + c1740n.a());
        a aVar = this.f27166d;
        a aVar2 = a.FIRST_LOAD_IN_PROGRESS;
        if (aVar != aVar2 && aVar != a.LOAD_IN_PROGRESS) {
            a("onBannerAdLoadFailed " + c1740n.a() + " wrong state=" + this.f27166d.name());
            return;
        }
        if (z10) {
            a(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, c1740n, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27176n))}});
        } else {
            a(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, c1740n, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27176n))}});
        }
        if (c()) {
            return;
        }
        if (this.f27166d == aVar2) {
            C1738l.a().a(this.f27164b, new IronSourceError(IronSourceError.ERROR_BN_LOAD_NO_FILL, "No ads to show"), false);
            a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_LOAD_NO_FILL)}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27175m))}});
            a(a.READY_TO_LOAD);
            return;
        }
        a(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27175m))}});
        a(a.RELOAD_IN_PROGRESS);
        d();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C1740n c1740n) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1740n.a());
        Object[][] objArr = null;
        if (a()) {
            C1737k.a().d(null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.f27177o);
        a(IronSourceConstants.BN_INSTANCE_CLICK, c1740n, objArr, this.f27177o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C1740n c1740n, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1740n.a());
        a aVar = this.f27166d;
        if (aVar != a.FIRST_LOAD_IN_PROGRESS) {
            if (aVar != a.LOAD_IN_PROGRESS) {
                a(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, c1740n, (Object[][]) null);
                return;
            }
            a(a.RELOAD_IN_PROGRESS);
            b(c1740n, view, layoutParams, true);
            return;
        }
        a(3005, c1740n, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27176n))}});
        b(c1740n, view, layoutParams);
        com.ironsource.mediationsdk.model.f fVar = this.f27165c;
        String placementName = fVar != null ? fVar.getPlacementName() : "";
        com.ironsource.mediationsdk.utils.k.f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
        if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
            a(IronSourceConstants.BN_PLACEMENT_CAPPED, (Object[][]) null);
        }
        a(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27175m))}});
        this.f27164b.a((AdInfo) null, false);
        this.f27177o = com.ironsource.mediationsdk.utils.o.a().b(3);
        com.ironsource.mediationsdk.utils.o.a().a(3);
        a(a.RELOAD_IN_PROGRESS);
        d();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C1740n c1740n, View view, FrameLayout.LayoutParams layoutParams, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1740n.a());
        if (this.f27166d == a.RELOAD_IN_PROGRESS) {
            IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            b(c1740n, view, layoutParams, z10);
            return;
        }
        a("onBannerAdReloaded " + c1740n.a() + " wrong state=" + this.f27166d.name());
        a(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, c1740n, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void b(IronSourceError ironSourceError, C1740n c1740n, boolean z10) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + c1740n.a());
        if (this.f27166d != a.RELOAD_IN_PROGRESS) {
            a("onBannerAdReloadFailed " + c1740n.a() + " wrong state=" + this.f27166d.name());
            return;
        }
        if (z10) {
            a(IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, c1740n, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27176n))}});
        } else {
            a(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, c1740n, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27176n))}});
        }
        if (this.f27170h.size() == 1) {
            a(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.f27175m))}});
            d();
            return;
        }
        a(a.LOAD_IN_PROGRESS);
        b();
        c();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void b(C1740n c1740n) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1740n.a());
        Object[][] objArr = null;
        if (a()) {
            C1737k.a().b((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.f27177o);
        a(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, c1740n, objArr, this.f27177o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void c(C1740n c1740n) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1740n.a());
        Object[][] objArr = null;
        if (a()) {
            C1737k.a().a((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.f27177o);
        a(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, c1740n, objArr, this.f27177o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void d(C1740n c1740n) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1740n.a());
        Object[][] objArr = null;
        if (a()) {
            C1737k.a().c(null);
        } else {
            objArr = new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "banner is destroyed"}};
        }
        a(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.f27177o);
        a(IronSourceConstants.BN_INSTANCE_LEAVE_APP, c1740n, objArr, this.f27177o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void e(C1740n c1740n) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1740n.a());
        a(IronSourceConstants.BN_CALLBACK_SHOW, (Object[][]) null);
        a(IronSourceConstants.BN_INSTANCE_SHOW, c1740n, (Object[][]) null);
    }
}
