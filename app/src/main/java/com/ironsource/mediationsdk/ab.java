package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;

/* loaded from: classes3.dex */
public final class ab {

    /* renamed from: b  reason: collision with root package name */
    private static final ab f26741b = new ab();

    /* renamed from: a  reason: collision with root package name */
    ISDemandOnlyRewardedVideoListener f26742a = null;

    private ab() {
    }

    public static ab a() {
        return f26741b;
    }

    static /* synthetic */ void a(ab abVar, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(final String str, final IronSourceError ironSourceError) {
        if (this.f26742a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.ab.2
                @Override // java.lang.Runnable
                public final void run() {
                    ab.this.f26742a.onRewardedVideoAdLoadFailed(str, ironSourceError);
                    ab abVar = ab.this;
                    ab.a(abVar, "onRewardedVideoAdLoadFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage());
                }
            });
        }
    }

    public final void b(final String str, final IronSourceError ironSourceError) {
        if (this.f26742a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.ab.5
                @Override // java.lang.Runnable
                public final void run() {
                    ab.this.f26742a.onRewardedVideoAdShowFailed(str, ironSourceError);
                    ab abVar = ab.this;
                    ab.a(abVar, "onRewardedVideoAdShowFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage());
                }
            });
        }
    }
}
