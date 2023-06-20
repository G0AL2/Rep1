package com.ironsource.mediationsdk.logger;

import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes3.dex */
public final class b extends IronSourceLogger {

    /* renamed from: c  reason: collision with root package name */
    public LogListener f27158c;

    private b() {
        super("publisher");
    }

    public b(LogListener logListener, int i10) {
        super("publisher", 1);
        this.f27158c = null;
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final synchronized void log(final IronSourceLogger.IronSourceTag ironSourceTag, final String str, final int i10) {
        com.ironsource.environment.e.c.f26160a.a(new Runnable() { // from class: com.ironsource.mediationsdk.logger.b.1
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.f27158c == null || str == null) {
                    return;
                }
                b.this.f27158c.onLog(ironSourceTag, str, i10);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
