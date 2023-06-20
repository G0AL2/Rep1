package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.AbstractC1728b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class L extends aa implements RewardedVideoSmashListener {

    /* renamed from: a  reason: collision with root package name */
    a f26389a;

    /* renamed from: b  reason: collision with root package name */
    String f26390b;

    /* renamed from: j  reason: collision with root package name */
    private M f26391j;

    /* renamed from: k  reason: collision with root package name */
    private Timer f26392k;

    /* renamed from: l  reason: collision with root package name */
    private int f26393l;

    /* renamed from: m  reason: collision with root package name */
    private String f26394m;

    /* renamed from: n  reason: collision with root package name */
    private String f26395n;

    /* renamed from: o  reason: collision with root package name */
    private Placement f26396o;

    /* renamed from: p  reason: collision with root package name */
    private long f26397p;

    /* renamed from: q  reason: collision with root package name */
    private JSONObject f26398q;

    /* renamed from: r  reason: collision with root package name */
    private int f26399r;

    /* renamed from: s  reason: collision with root package name */
    private String f26400s;

    /* renamed from: t  reason: collision with root package name */
    private final Object f26401t;

    /* renamed from: u  reason: collision with root package name */
    private final Object f26402u;

    /* renamed from: v  reason: collision with root package name */
    private long f26403v;

    /* loaded from: classes3.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public L(L l10, M m10, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2) {
        this(l10.f26394m, l10.f26395n, l10.f26735d.f27214a, m10, l10.f26393l, abstractAdapter, i10);
        this.f26390b = str;
        this.f26398q = jSONObject;
        this.f26399r = i11;
        this.f26400s = str2;
    }

    public L(String str, String str2, NetworkSettings networkSettings, M m10, int i10, AbstractAdapter abstractAdapter, int i11) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f26401t = new Object();
        this.f26402u = new Object();
        this.f26394m = str;
        this.f26395n = str2;
        this.f26391j = m10;
        this.f26392k = null;
        this.f26393l = i10;
        this.f26734c.updateRewardedVideoListener(this);
        this.f26739h = i11;
        this.f26389a = a.NO_INIT;
        this.f26403v = 0L;
        if (this.f26735d.f27216c) {
            c("initForBidding()");
            a(a.INIT_IN_PROGRESS);
            g();
            try {
                this.f26734c.initRewardedVideoForBidding(this.f26394m, this.f26395n, this.f26737f, this);
            } catch (Throwable th) {
                d("initForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
            }
        }
    }

    private void a(int i10) {
        a(i10, null, false);
    }

    private void a(int i10, Object[][] objArr, boolean z10) {
        Placement placement;
        Map<String, Object> n10 = n();
        if (!TextUtils.isEmpty(this.f26390b)) {
            n10.put("auctionId", this.f26390b);
        }
        JSONObject jSONObject = this.f26398q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26398q);
        }
        if (z10 && (placement = this.f26396o) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n10.put("placement", this.f26396o.getPlacementName());
        }
        if (b(i10)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f26399r, this.f26400s);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f26739h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(n10)));
        if (i10 == 1203) {
            com.ironsource.mediationsdk.utils.o.a().a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        c("current state=" + this.f26389a + ", new state=" + aVar);
        synchronized (this.f26401t) {
            this.f26389a = aVar;
        }
    }

    private static boolean b(int i10) {
        return i10 == 1001 || i10 == 1002 || i10 == 1200 || i10 == 1212 || i10 == 1213 || i10 == 1005 || i10 == 1203 || i10 == 1201 || i10 == 1202 || i10 == 1006 || i10 == 1010;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + k() + " " + hashCode() + "  : " + str, 0);
    }

    private void d(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + k() + " " + hashCode() + " : " + str, 3);
    }

    private boolean f() {
        try {
            return this.f26734c.isRewardedVideoAvailable(this.f26737f);
        } catch (Exception e10) {
            d("isRewardedVideoAvailable exception: " + e10.getLocalizedMessage());
            e10.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e10.getLocalizedMessage()}});
            return false;
        }
    }

    private void g() {
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
            c("setCustomParams() " + e10.getMessage());
        }
    }

    private void q() {
        synchronized (this.f26402u) {
            Timer timer = this.f26392k;
            if (timer != null) {
                timer.cancel();
                this.f26392k = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        return new Date().getTime() - this.f26397p;
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.f26734c.getRewardedVideoBiddingData(this.f26737f);
            }
            return null;
        } catch (Throwable th) {
            d("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    public final void a(int i10, Object[][] objArr) {
        a(i10, objArr, true);
    }

    public final void a(Placement placement) {
        q();
        c("showVideo()");
        this.f26396o = placement;
        a(a.SHOW_IN_PROGRESS);
        a(IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f26734c.showRewardedVideo(this.f26737f, this);
        } catch (Throwable th) {
            d("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void a(String str) {
        a aVar;
        a aVar2;
        c("loadVideo() auctionId: " + this.f26390b + " state: " + this.f26389a);
        this.f26740i = null;
        this.f26736e = false;
        synchronized (this.f26401t) {
            aVar = this.f26389a;
            aVar2 = a.LOAD_IN_PROGRESS;
            if (aVar != aVar2 && aVar != a.SHOW_IN_PROGRESS) {
                a(aVar2);
            }
        }
        if (aVar == aVar2) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
        } else if (aVar == a.SHOW_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
        } else {
            synchronized (this.f26402u) {
                Timer timer = new Timer();
                this.f26392k = timer;
                timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.L.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        int i10;
                        boolean z10;
                        a aVar3 = L.this.f26389a;
                        a aVar4 = a.LOAD_IN_PROGRESS;
                        String str2 = "Rewarded Video - load instance time out";
                        if (aVar3 == aVar4 || L.this.f26389a == a.INIT_IN_PROGRESS) {
                            if (L.this.f26389a == aVar4) {
                                i10 = IronSourceError.ERROR_LOAD_FAILED_TIMEOUT;
                            } else {
                                i10 = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                                str2 = "Rewarded Video - init instance time out";
                            }
                            L.this.a(a.NOT_LOADED);
                            z10 = true;
                        } else {
                            i10 = 0;
                            z10 = false;
                        }
                        L.this.c(str2);
                        if (!z10) {
                            L.this.b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{"duration", Long.valueOf(L.this.r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, L.this.f26389a.name()}});
                            return;
                        }
                        L.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"duration", Long.valueOf(L.this.r())}});
                        L.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str2}, new Object[]{"duration", Long.valueOf(L.this.r())}});
                        L.this.f26391j.b(L.this);
                    }
                }, this.f26393l * 1000);
            }
            this.f26397p = new Date().getTime();
            a(1001);
            try {
                if (h()) {
                    this.f26734c.loadRewardedVideoForBidding(this.f26737f, this, str);
                    return;
                }
                g();
                this.f26734c.initRewardedVideo(this.f26394m, this.f26395n, this.f26737f, this);
            } catch (Throwable th) {
                d("loadVideo exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(h() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    public final void a(boolean z10) {
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z10 ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false";
        objArr[0] = objArr2;
        a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    public final void b(int i10, Object[][] objArr) {
        a(i10, objArr, false);
    }

    public final boolean b() {
        return h() ? this.f26389a == a.LOADED && f() : f();
    }

    public final void b_() {
        this.f26734c.setMediationState(AbstractC1728b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        a(IronSourceConstants.RV_CAP_SESSION, null, false);
    }

    public final LoadWhileShowSupportState c() {
        try {
            return this.f26734c.getLoadWhileShowSupportState(this.f26737f);
        } catch (Exception e10) {
            d("Exception while calling adapter.getLoadWhileShowSupportState() - " + e10.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    @Override // com.ironsource.mediationsdk.aa
    public final int e() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        c("onRewardedVideoAdClicked");
        this.f26391j.b(this, this.f26396o);
        a(1006, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        c("onRewardedVideoAdClosed");
        synchronized (this.f26401t) {
            if (this.f26389a == a.SHOW_IN_PROGRESS) {
                a(a.ENDED);
                this.f26403v = new Date().getTime();
                this.f26391j.d(this);
                return;
            }
            a(IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_adClosed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.f26389a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        c("onRewardedVideoAdEnded");
        this.f26391j.f(this);
        a(IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        c("onRewardedVideoAdOpened");
        this.f26391j.c(this);
        a(1005, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        c("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f26391j.a(this, this.f26396o);
        Map<String, Object> n10 = n();
        Placement placement = this.f26396o;
        if (placement != null) {
            n10.put("placement", placement.getPlacementName());
            n10.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f26396o.getRewardName());
            n10.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f26396o.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(J.a().f26341m)) {
            n10.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, J.a().f26341m);
        }
        if (J.a().f26342n != null) {
            for (String str : J.a().f26342n.keySet()) {
                n10.put("custom_" + str, J.a().f26342n.get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f26390b)) {
            n10.put("auctionId", this.f26390b);
        }
        JSONObject jSONObject = this.f26398q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26398q);
        }
        if (b(1010)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f26399r, this.f26400s);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f26739h));
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, new JSONObject(n10));
        cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), k()));
        long j10 = this.f26403v;
        if (j10 != 0) {
            long j11 = time - j10;
            c("onRewardedVideoAdRewarded timeAfterClosed=" + j11);
            cVar.a("duration", Long.valueOf(j11));
        }
        com.ironsource.mediationsdk.a.h.d().b(cVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        c("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        a(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.f26401t) {
            if (this.f26389a == a.SHOW_IN_PROGRESS) {
                a(a.ENDED);
                this.f26391j.a(ironSourceError, this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f26389a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        c("onRewardedVideoAdStarted");
        this.f26391j.e(this);
        a(IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        c("onRewardedVideoAdVisible");
        a(IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z10) {
        boolean z11;
        c("onRewardedVideoAvailabilityChanged available=" + z10 + " state=" + this.f26389a.name());
        synchronized (this.f26401t) {
            if (this.f26389a == a.LOAD_IN_PROGRESS) {
                a(z10 ? a.LOADED : a.NOT_LOADED);
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f26389a.name()}});
                return;
            } else {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(r())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f26389a.name()}});
                return;
            }
        }
        q();
        b(z10 ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(r())}});
        if (z10) {
            this.f26391j.a(this);
        } else {
            this.f26391j.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        c("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        q();
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(r())}});
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(r())}});
        synchronized (this.f26401t) {
            if (this.f26389a == a.INIT_IN_PROGRESS) {
                a(a.NO_INIT);
                this.f26391j.b(this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f26389a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        c("onRewardedVideoInitSuccess");
        synchronized (this.f26401t) {
            if (this.f26389a == a.INIT_IN_PROGRESS) {
                a(a.NOT_LOADED);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initSuccess)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f26389a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(r())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f26740i = Long.valueOf(System.currentTimeMillis());
        }
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(r())}}, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }
}
