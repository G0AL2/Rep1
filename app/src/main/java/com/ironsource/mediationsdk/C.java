package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: b  reason: collision with root package name */
    private static final C f26215b = new C();

    /* renamed from: a  reason: collision with root package name */
    ISDemandOnlyInterstitialListener f26216a = null;

    private C() {
    }

    public static C a() {
        return f26215b;
    }

    static /* synthetic */ void a(C c10, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(final String str, final IronSourceError ironSourceError) {
        if (this.f26216a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.C.2
                @Override // java.lang.Runnable
                public final void run() {
                    C.this.f26216a.onInterstitialAdLoadFailed(str, ironSourceError);
                    C c10 = C.this;
                    C.a(c10, "onInterstitialAdLoadFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage());
                }
            });
        }
    }

    public final void b(final String str, final IronSourceError ironSourceError) {
        if (this.f26216a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ironsource.mediationsdk.C.5
                @Override // java.lang.Runnable
                public final void run() {
                    C.this.f26216a.onInterstitialAdShowFailed(str, ironSourceError);
                    C c10 = C.this;
                    C.a(c10, "onInterstitialAdShowFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage());
                }
            });
        }
    }
}
