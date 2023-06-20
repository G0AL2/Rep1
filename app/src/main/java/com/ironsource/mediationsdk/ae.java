package com.ironsource.mediationsdk;

import android.util.Log;
import com.ironsource.mediationsdk.AbstractC1728b;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ae extends AbstractC1728b implements RewardedVideoSmashListener {

    /* renamed from: r  reason: collision with root package name */
    JSONObject f26958r;

    /* renamed from: s  reason: collision with root package name */
    com.ironsource.mediationsdk.sdk.m f26959s;

    /* renamed from: t  reason: collision with root package name */
    AtomicBoolean f26960t;

    /* renamed from: u  reason: collision with root package name */
    long f26961u;

    /* renamed from: v  reason: collision with root package name */
    String f26962v;

    /* renamed from: w  reason: collision with root package name */
    public int f26963w;

    /* renamed from: x  reason: collision with root package name */
    private int f26964x;

    /* renamed from: y  reason: collision with root package name */
    private final String f26965y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ae(NetworkSettings networkSettings, int i10) {
        super(networkSettings);
        this.f26965y = IronSourceConstants.REQUEST_URL;
        JSONObject rewardedVideoSettings = networkSettings.getRewardedVideoSettings();
        this.f26958r = rewardedVideoSettings;
        this.f26988k = rewardedVideoSettings.optInt("maxAdsPerIteration", 99);
        this.f26989l = this.f26958r.optInt("maxAdsPerSession", 99);
        this.f26990m = this.f26958r.optInt("maxAdsPerDay", 99);
        this.f26962v = this.f26958r.optString(IronSourceConstants.REQUEST_URL);
        this.f26960t = new AtomicBoolean(false);
        this.f26964x = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, Object[][] objArr) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(this);
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e10) {
                this.f26994q.log(IronSourceLogger.IronSourceTag.INTERNAL, "RewardedVideoSmash logProviderEvent " + Log.getStackTraceString(e10), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i10, providerAdditionalData));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC1728b
    public final void g() {
        this.f26985h = 0;
        a(o() ? AbstractC1728b.a.AVAILABLE : AbstractC1728b.a.NOT_AVAILABLE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.ironsource.mediationsdk.AbstractC1728b
    public final void h() {
        try {
            e();
            Timer timer = new Timer();
            this.f26986i = timer;
            timer.schedule(new TimerTask() { // from class: com.ironsource.mediationsdk.ae.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    synchronized (ae.this) {
                        cancel();
                        if (ae.this.f26959s != null) {
                            String str = "Timeout for " + ae.this.f26981d;
                            ae.this.f26994q.log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                            ae.this.a(AbstractC1728b.a.NOT_AVAILABLE);
                            long time = new Date().getTime() - ae.this.f26961u;
                            if (ae.this.f26960t.compareAndSet(true, false)) {
                                ae.this.a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{"duration", Long.valueOf(time)}});
                                ae.this.a((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(time)}});
                            } else {
                                ae.this.a((int) IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{"duration", Long.valueOf(time)}});
                            }
                            ae.this.f26959s.a(false, ae.this);
                        }
                    }
                }
            }, this.f26964x * 1000);
        } catch (Exception e10) {
            a("startInitTimer", e10.getLocalizedMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractC1728b
    final void i() {
    }

    @Override // com.ironsource.mediationsdk.AbstractC1728b
    protected final String k() {
        return IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE;
    }

    public final void n() {
        this.f26993p = null;
        if (this.f26979b != null) {
            AbstractC1728b.a aVar = this.f26978a;
            if (aVar != AbstractC1728b.a.CAPPED_PER_DAY && aVar != AbstractC1728b.a.CAPPED_PER_SESSION) {
                this.f26960t.set(true);
                this.f26961u = new Date().getTime();
            }
            IronSourceLoggerManager ironSourceLoggerManager = this.f26994q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f26981d + ":fetchRewardedVideoForAutomaticLoad()", 1);
            this.f26979b.fetchRewardedVideoForAutomaticLoad(this.f26958r, this);
        }
    }

    public final boolean o() {
        if (this.f26979b != null) {
            IronSourceLoggerManager ironSourceLoggerManager = this.f26994q;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, this.f26981d + ":isRewardedVideoAvailable()", 1);
            return this.f26979b.isRewardedVideoAvailable(this.f26958r);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        com.ironsource.mediationsdk.sdk.m mVar = this.f26959s;
        if (mVar != null) {
            mVar.f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        com.ironsource.mediationsdk.sdk.m mVar = this.f26959s;
        if (mVar != null) {
            mVar.b(this);
        }
        n();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        com.ironsource.mediationsdk.sdk.m mVar = this.f26959s;
        if (mVar != null) {
            mVar.d(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        com.ironsource.mediationsdk.sdk.m mVar = this.f26959s;
        if (mVar != null) {
            mVar.a(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        com.ironsource.mediationsdk.sdk.m mVar = this.f26959s;
        if (mVar != null) {
            mVar.e(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        com.ironsource.mediationsdk.sdk.m mVar = this.f26959s;
        if (mVar != null) {
            mVar.a(ironSourceError, this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        com.ironsource.mediationsdk.sdk.m mVar = this.f26959s;
        if (mVar != null) {
            mVar.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        com.ironsource.mediationsdk.sdk.m mVar = this.f26959s;
        if (mVar != null) {
            mVar.g(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final synchronized void onRewardedVideoAvailabilityChanged(boolean z10) {
        e();
        if (this.f26960t.compareAndSet(true, false)) {
            a(z10 ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f26961u)}});
        } else {
            a(z10 ? IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE : IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, (Object[][]) null);
        }
        if (!c()) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.info(this.f26981d + ": is capped or exhausted");
        } else if ((!z10 || this.f26978a == AbstractC1728b.a.AVAILABLE) && (z10 || this.f26978a == AbstractC1728b.a.NOT_AVAILABLE)) {
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.info(this.f26981d + ": state remains " + z10 + " in smash, mediation remains unchanged");
        } else {
            a(z10 ? AbstractC1728b.a.AVAILABLE : AbstractC1728b.a.NOT_AVAILABLE);
            if (z10) {
                this.f26992o = Long.valueOf(System.currentTimeMillis());
            }
            com.ironsource.mediationsdk.sdk.m mVar = this.f26959s;
            if (mVar != null) {
                mVar.a(z10, this);
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        long time = new Date().getTime() - this.f26961u;
        if (ironSourceError.getErrorCode() == 1058) {
            a(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(time)}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f26993p = Long.valueOf(System.currentTimeMillis());
        }
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(time)}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }
}
