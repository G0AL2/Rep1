package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes3.dex */
public final class a extends IronSourceLogger {
    private a() {
        super("console");
    }

    public a(int i10) {
        super("console", 0);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i10) {
        StringBuilder sb2 = new StringBuilder("UIThread: ");
        sb2.append(Looper.getMainLooper() == Looper.myLooper());
        sb2.append(" ");
        String sb3 = sb2.toString();
        if (i10 == 0) {
            Log.v("ironSourceSDK: " + ironSourceTag, sb3 + str);
        } else if (i10 == 1) {
            Log.i("ironSourceSDK: " + ironSourceTag, str);
        } else if (i10 == 2) {
            Log.w("ironSourceSDK: " + ironSourceTag, str);
        } else if (i10 != 3) {
        } else {
            Log.e("ironSourceSDK: " + ironSourceTag, str);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + Log.getStackTraceString(th) + "]", 3);
    }
}
