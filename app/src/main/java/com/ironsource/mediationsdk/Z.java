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
public final class Z extends aa implements RewardedVideoSmashListener {
    private String A;
    private String B;
    private final Object C;
    private final Object D;

    /* renamed from: a  reason: collision with root package name */
    a f26621a;

    /* renamed from: b  reason: collision with root package name */
    boolean f26622b;

    /* renamed from: j  reason: collision with root package name */
    private Y f26623j;

    /* renamed from: k  reason: collision with root package name */
    private Timer f26624k;

    /* renamed from: l  reason: collision with root package name */
    private int f26625l;

    /* renamed from: m  reason: collision with root package name */
    private String f26626m;

    /* renamed from: n  reason: collision with root package name */
    private String f26627n;

    /* renamed from: o  reason: collision with root package name */
    private String f26628o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f26629p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f26630q;

    /* renamed from: r  reason: collision with root package name */
    private Placement f26631r;

    /* renamed from: s  reason: collision with root package name */
    private long f26632s;

    /* renamed from: t  reason: collision with root package name */
    private String f26633t;

    /* renamed from: u  reason: collision with root package name */
    private JSONObject f26634u;

    /* renamed from: v  reason: collision with root package name */
    private String f26635v;

    /* renamed from: w  reason: collision with root package name */
    private int f26636w;

    /* renamed from: x  reason: collision with root package name */
    private String f26637x;

    /* renamed from: y  reason: collision with root package name */
    private int f26638y;

    /* renamed from: z  reason: collision with root package name */
    private int f26639z;

    /* loaded from: classes3.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public Z(String str, String str2, NetworkSettings networkSettings, Y y10, int i10, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.C = new Object();
        this.D = new Object();
        this.f26621a = a.NO_INIT;
        this.f26626m = str;
        this.f26627n = str2;
        this.f26623j = y10;
        this.f26624k = null;
        this.f26625l = i10;
        this.f26734c.addRewardedVideoListener(this);
        this.f26629p = false;
        this.f26630q = false;
        this.f26622b = false;
        this.f26631r = null;
        this.f26633t = "";
        this.f26634u = null;
        this.f26739h = 1;
        g();
    }

    private void a(int i10) {
        a(i10, null, false);
    }

    private void a(int i10, Object[][] objArr, boolean z10) {
        Placement placement;
        Map<String, Object> n10 = n();
        if (!TextUtils.isEmpty(this.f26633t)) {
            n10.put("auctionId", this.f26633t);
        }
        JSONObject jSONObject = this.f26634u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26634u);
        }
        if (z10 && (placement = this.f26631r) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n10.put("placement", this.f26631r.getPlacementName());
        }
        if (b(i10)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f26636w, this.f26637x);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f26739h));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n10.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " smash: RV sendMediationEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, new JSONObject(n10)));
        if (i10 == 1203) {
            com.ironsource.mediationsdk.utils.o.a().a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        a("current state=" + this.f26621a + ", new state=" + aVar);
        synchronized (this.D) {
            this.f26621a = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + k() + " : " + str, 0);
    }

    private void a(String str, String str2, int i10, String str3, int i11, String str4) {
        this.f26635v = str2;
        this.f26628o = str;
        this.f26638y = i10;
        this.B = str3;
        this.f26639z = i11;
        this.A = str4;
    }

    private static boolean b(int i10) {
        return i10 == 1001 || i10 == 1002 || i10 == 1200 || i10 == 1213 || i10 == 1212 || i10 == 1005 || i10 == 1203 || i10 == 1201 || i10 == 1202 || i10 == 1006 || i10 == 1010;
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + k() + " : " + str, 3);
    }

    private void g() {
        this.f26635v = "";
        this.f26638y = -1;
        this.B = "";
        this.f26628o = "";
        this.f26639z = this.f26739h;
        this.A = "";
    }

    private boolean q() {
        try {
            return this.f26734c.isRewardedVideoAvailable(this.f26737f);
        } catch (Exception e10) {
            c("isRewardedVideoAvailable exception: " + e10.getLocalizedMessage());
            e10.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_isReadyException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, e10.getLocalizedMessage()}});
            return false;
        }
    }

    private void r() {
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
            a("setCustomParams() " + e10.getMessage());
        }
    }

    private void s() {
        synchronized (this.C) {
            Timer timer = this.f26624k;
            if (timer != null) {
                timer.cancel();
                this.f26624k = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long t() {
        return new Date().getTime() - this.f26632s;
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.f26734c.getRewardedVideoBiddingData(this.f26737f);
            }
            return null;
        } catch (Throwable th) {
            c("getBiddingData exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_biddingDataException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            return null;
        }
    }

    public final void a(int i10, Object[][] objArr) {
        a(i10, objArr, true);
    }

    public final void a(Placement placement, int i10) {
        s();
        a("showVideo()");
        this.f26631r = placement;
        this.f26739h = i10;
        a(a.SHOW_IN_PROGRESS);
        a(IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.f26734c.showRewardedVideo(this.f26737f, this);
        } catch (Throwable th) {
            c("showVideo exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void a(String str, String str2, JSONObject jSONObject, int i10, String str3, int i11, String str4) {
        a aVar;
        a aVar2;
        a("loadVideo() auctionId: " + str2 + " state: " + this.f26621a);
        this.f26740i = null;
        this.f26736e = false;
        this.f26622b = true;
        synchronized (this.D) {
            aVar = this.f26621a;
            aVar2 = a.LOAD_IN_PROGRESS;
            if (aVar != aVar2 && aVar != a.SHOW_IN_PROGRESS) {
                a(aVar2);
            }
        }
        if (aVar == aVar2) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during load"}});
            this.f26630q = true;
            a(str, str2, i10, str3, i11, str4);
            this.f26623j.b(this, str2);
        } else if (aVar == a.SHOW_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showInProgress)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "load during show"}});
            this.f26629p = true;
            a(str, str2, i10, str3, i11, str4);
        } else {
            this.f26738g = str4;
            this.f26633t = str2;
            this.f26634u = jSONObject;
            this.f26636w = i10;
            this.f26637x = str3;
            this.f26739h = i11;
            synchronized (this.C) {
                s();
                Timer timer = new Timer();
                this.f26624k = timer;
                timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.Z.1
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        int i12;
                        String str5;
                        boolean z10;
                        int i13;
                        String str6 = "Rewarded Video - load instance time out";
                        synchronized (Z.this.D) {
                            a aVar3 = Z.this.f26621a;
                            a aVar4 = a.LOAD_IN_PROGRESS;
                            if (aVar3 != aVar4 && Z.this.f26621a != a.INIT_IN_PROGRESS) {
                                i13 = 0;
                                z10 = false;
                            }
                            if (Z.this.f26621a == aVar4) {
                                str5 = "Rewarded Video - load instance time out";
                                i12 = IronSourceError.ERROR_LOAD_FAILED_TIMEOUT;
                            } else {
                                i12 = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                                str5 = "Rewarded Video - init instance time out";
                            }
                            Z.this.a(a.NOT_LOADED);
                            z10 = true;
                            String str7 = str5;
                            i13 = i12;
                            str6 = str7;
                        }
                        Z.this.a(str6);
                        if (!z10) {
                            Z.this.b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{"duration", Long.valueOf(Z.this.t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, Z.this.f26621a.name()}});
                            return;
                        }
                        Z.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i13)}, new Object[]{"duration", Long.valueOf(Z.this.t())}});
                        Z.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i13)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str6}, new Object[]{"duration", Long.valueOf(Z.this.t())}});
                        Y y10 = Z.this.f26623j;
                        Z z11 = Z.this;
                        y10.b(z11, z11.f26633t);
                    }
                }, this.f26625l * 1000);
            }
            this.f26632s = new Date().getTime();
            a(1001);
            try {
                if (h()) {
                    this.f26734c.loadRewardedVideoForBidding(this.f26737f, this, str);
                } else if (aVar != a.NO_INIT) {
                    this.f26734c.fetchRewardedVideoForAutomaticLoad(this.f26737f, this);
                } else {
                    r();
                    this.f26734c.initRewardedVideo(this.f26626m, this.f26627n, this.f26737f, this);
                }
            } catch (Throwable th) {
                c("loadRewardedVideoForBidding exception: " + th.getLocalizedMessage());
                th.printStackTrace();
                onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, th.getLocalizedMessage()));
                b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadException)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, th.getLocalizedMessage()}});
            }
        }
    }

    public final void a(boolean z10, int i10) {
        this.f26739h = i10;
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z10 ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false";
        objArr[0] = objArr2;
        a(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    public final void b() {
        a("initForBidding()");
        a(a.INIT_IN_PROGRESS);
        r();
        try {
            this.f26734c.initRewardedVideoForBidding(this.f26626m, this.f26627n, this.f26737f, this);
        } catch (Throwable th) {
            c("initForBidding exception: " + th.getLocalizedMessage());
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void b(int i10, Object[][] objArr) {
        a(i10, objArr, false);
    }

    public final boolean c() {
        return h() ? this.f26622b && this.f26621a == a.LOADED && q() : q();
    }

    public final void f() {
        this.f26734c.setMediationState(AbstractC1728b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        a(IronSourceConstants.RV_CAP_SESSION, null, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.f26623j.b(this, this.f26631r);
        a(1006, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.D) {
            if (this.f26621a != a.SHOW_IN_PROGRESS) {
                a(IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_adClosed)};
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "adClosed: " + this.f26621a}});
                return;
            }
            a(a.NOT_LOADED);
            this.f26623j.b(this);
            if (this.f26629p) {
                a("onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding");
                this.f26629p = false;
                a(this.f26628o, this.f26635v, this.f26634u, this.f26638y, this.B, this.f26639z, this.A);
                g();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.f26623j.d(this);
        a(IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.f26623j.a(this);
        a(1005, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        this.f26623j.a(this, this.f26631r);
        Map<String, Object> n10 = n();
        Placement placement = this.f26631r;
        if (placement != null) {
            n10.put("placement", placement.getPlacementName());
            n10.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f26631r.getRewardName());
            n10.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f26631r.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(J.a().f26341m)) {
            n10.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, J.a().f26341m);
        }
        if (J.a().f26342n != null) {
            for (String str : J.a().f26342n.keySet()) {
                n10.put("custom_" + str, J.a().f26342n.get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f26633t)) {
            n10.put("auctionId", this.f26633t);
        }
        JSONObject jSONObject = this.f26634u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n10.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f26634u);
        }
        if (b(1010)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n10, this.f26636w, this.f26637x);
        }
        n10.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f26739h));
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, new JSONObject(n10));
        cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), k()));
        com.ironsource.mediationsdk.a.h.d().b(cVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        a(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
        synchronized (this.D) {
            if (this.f26621a == a.SHOW_IN_PROGRESS) {
                a(a.NOT_LOADED);
                this.f26623j.a(ironSourceError, this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showFailed: " + this.f26621a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.f26623j.c(this);
        a(IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        a(IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z10) {
        boolean z11;
        a("onRewardedVideoAvailabilityChanged available=" + z10 + " state=" + this.f26621a.name());
        synchronized (this.D) {
            if (this.f26621a == a.LOAD_IN_PROGRESS) {
                a(z10 ? a.LOADED : a.NOT_LOADED);
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f26621a.name()}});
                return;
            } else {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(t())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f26621a.name()}});
                return;
            }
        }
        s();
        b(z10 ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(t())}});
        if (!this.f26630q) {
            if (z10) {
                this.f26623j.a(this, this.f26633t);
                return;
            } else {
                this.f26623j.b(this, this.f26633t);
                return;
            }
        }
        this.f26630q = false;
        a("onRewardedVideoAvailabilityChanged to " + z10 + "and mShouldLoadAfterLoad is true - calling loadVideo");
        a(this.f26628o, this.f26635v, this.f26634u, this.f26638y, this.B, this.f26639z, this.A);
        g();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        s();
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(t())}});
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(t())}});
        synchronized (this.D) {
            if (this.f26621a == a.INIT_IN_PROGRESS) {
                a(a.NO_INIT);
                this.f26623j.b(this, this.f26633t);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initFailed: " + this.f26621a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.D) {
            if (this.f26621a == a.INIT_IN_PROGRESS) {
                a(a.NOT_LOADED);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initSuccess)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "initSuccess: " + this.f26621a}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(t())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f26740i = Long.valueOf(System.currentTimeMillis());
        }
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(t())}}, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }
}
