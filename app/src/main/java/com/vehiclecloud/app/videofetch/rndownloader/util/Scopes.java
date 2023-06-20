package com.vehiclecloud.app.videofetch.rndownloader.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class Scopes {
    private static final IHandler ioHandler = new IHandler() { // from class: com.vehiclecloud.app.videofetch.rndownloader.util.Scopes.1
        private final ScheduledExecutorService executor = Executors.newScheduledThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 2, 3)));

        @Override // com.vehiclecloud.app.videofetch.rndownloader.util.Scopes.IHandler
        public void post(Runnable runnable) {
            this.executor.submit(runnable);
        }

        @Override // com.vehiclecloud.app.videofetch.rndownloader.util.Scopes.IHandler
        public ScheduledFuture<?> postDelayed(Runnable runnable, long j10) {
            return this.executor.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        }
    };

    /* loaded from: classes3.dex */
    public interface IHandler {
        void post(Runnable runnable);

        ScheduledFuture<?> postDelayed(Runnable runnable, long j10);
    }

    private Scopes() {
    }

    public static IHandler io() {
        return ioHandler;
    }

    public static Handler main() {
        return new Handler(Looper.getMainLooper());
    }
}
