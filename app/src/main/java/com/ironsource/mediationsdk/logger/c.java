package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.lang.Thread;

/* loaded from: classes3.dex */
public final class c implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.logException(ironSourceTag, "Thread name =" + thread.getName(), th);
    }
}
