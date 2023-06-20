package com.facebook.react.bridge;

import g6.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@a
/* loaded from: classes.dex */
public class BackgroundExecutor {
    private static final String TAG = "FabricBackgroundExecutor";
    private final ExecutorService mExecutorService = Executors.newFixedThreadPool(1);

    @a
    private BackgroundExecutor() {
    }

    @a
    private void queueRunnable(Runnable runnable) {
        if (runnable == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("runnable is null"));
            return;
        }
        ExecutorService executorService = this.mExecutorService;
        if (executorService == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("executorService is null"));
        } else {
            executorService.execute(runnable);
        }
    }
}
