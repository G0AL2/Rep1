package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Q implements com.ironsource.mediationsdk.sdk.g {

    /* renamed from: a  reason: collision with root package name */
    com.ironsource.mediationsdk.sdk.k f26474a;

    /* renamed from: b  reason: collision with root package name */
    com.ironsource.mediationsdk.sdk.g f26475b;

    /* renamed from: g  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.l f26480g;

    /* renamed from: h  reason: collision with root package name */
    private NetworkSettings f26481h;

    /* renamed from: i  reason: collision with root package name */
    private String f26482i;

    /* renamed from: c  reason: collision with root package name */
    private final String f26476c = Q.class.getName();

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f26478e = new AtomicBoolean(true);

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f26479f = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private IronSourceLoggerManager f26477d = IronSourceLoggerManager.getLogger();

    private synchronized void a(IronSourceError ironSourceError) {
        AtomicBoolean atomicBoolean = this.f26479f;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        AtomicBoolean atomicBoolean2 = this.f26478e;
        if (atomicBoolean2 != null) {
            atomicBoolean2.set(true);
        }
        com.ironsource.mediationsdk.sdk.g gVar = this.f26475b;
        if (gVar != null) {
            gVar.a(false, ironSourceError);
        }
    }

    private AbstractAdapter b(String str) {
        try {
            J a10 = J.a();
            AbstractAdapter b10 = a10.b(str);
            if (b10 == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + str.toLowerCase(Locale.ENGLISH) + "." + str + "Adapter");
                b10 = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
                if (b10 == null) {
                    return null;
                }
            }
            a10.a(b10);
            return b10;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26477d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f26477d;
            ironSourceLoggerManager2.logException(ironSourceTag, this.f26476c + ":startOfferwallAdapter", th);
            return null;
        }
    }

    public final void a(String str) {
        com.ironsource.mediationsdk.sdk.k kVar;
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.f26475b.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.f26482i = str;
            com.ironsource.mediationsdk.model.j a10 = this.f26480g.f27494c.f27235c.a(str);
            if (a10 == null) {
                IronSourceLoggerManager ironSourceLoggerManager = this.f26477d;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a10 = this.f26480g.f27494c.f27235c.a();
                if (a10 == null) {
                    this.f26477d.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.f26477d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
            AtomicBoolean atomicBoolean = this.f26479f;
            if (atomicBoolean == null || !atomicBoolean.get() || (kVar = this.f26474a) == null) {
                return;
            }
            kVar.showOfferwall(String.valueOf(a10.f27252a), this.f26481h.getRewardedVideoSettings());
        } catch (Exception e10) {
            this.f26477d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0036, B:7:0x003a, B:9:0x003e, B:12:0x0045, B:14:0x0050, B:16:0x0054, B:19:0x0061, B:21:0x006b, B:24:0x0078, B:26:0x007e, B:29:0x008b, B:31:0x0093, B:32:0x0096, B:34:0x009e, B:38:0x00db, B:37:0x00c1), top: B:46:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[Catch: all -> 0x00f4, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0036, B:7:0x003a, B:9:0x003e, B:12:0x0045, B:14:0x0050, B:16:0x0054, B:19:0x0061, B:21:0x006b, B:24:0x0078, B:26:0x007e, B:29:0x008b, B:31:0x0093, B:32:0x0096, B:34:0x009e, B:38:0x00db, B:37:0x00c1), top: B:46:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.Q.a(java.lang.String, java.lang.String):void");
    }

    @Override // com.ironsource.mediationsdk.sdk.g
    public final void a(boolean z10, IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26477d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallAvailable(isAvailable: " + z10 + ")", 1);
        if (!z10) {
            a(ironSourceError);
            return;
        }
        this.f26479f.set(true);
        com.ironsource.mediationsdk.sdk.g gVar = this.f26475b;
        if (gVar != null) {
            gVar.onOfferwallAvailable(true);
        }
    }

    public final synchronized boolean a() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f26479f;
        return atomicBoolean != null ? atomicBoolean.get() : false;
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26477d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        com.ironsource.mediationsdk.sdk.g gVar = this.f26475b;
        if (gVar != null) {
            gVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final boolean onOfferwallAdCredited(int i10, int i11, boolean z10) {
        this.f26477d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        com.ironsource.mediationsdk.sdk.g gVar = this.f26475b;
        if (gVar != null) {
            return gVar.onOfferwallAdCredited(i10, i11, z10);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallAvailable(boolean z10) {
        a(z10, (IronSourceError) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallClosed() {
        this.f26477d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        com.ironsource.mediationsdk.sdk.g gVar = this.f26475b;
        if (gVar != null) {
            gVar.onOfferwallClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallOpened() {
        this.f26477d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int b10 = com.ironsource.mediationsdk.utils.o.a().b(0);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.f26482i)) {
                mediationAdditionalData.put("placement", this.f26482i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, b10);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.OFFERWALL_OPENED, mediationAdditionalData));
        com.ironsource.mediationsdk.utils.o.a().a(0);
        com.ironsource.mediationsdk.sdk.g gVar = this.f26475b;
        if (gVar != null) {
            gVar.onOfferwallOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.f26477d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        com.ironsource.mediationsdk.sdk.g gVar = this.f26475b;
        if (gVar != null) {
            gVar.onOfferwallShowFailed(ironSourceError);
        }
    }
}
