package com.ironsource.environment;

import android.os.Build;
import java.lang.Thread;

/* loaded from: classes3.dex */
public final class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f26139a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f26139a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT >= 19) {
            StackTraceElement[] stackTrace2 = th.getStackTrace();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(th.toString());
            sb2.append(System.lineSeparator());
            boolean z10 = false;
            for (StackTraceElement stackTraceElement : stackTrace2) {
                sb2.append(stackTraceElement.toString());
                sb2.append(";" + System.lineSeparator());
                if (stackTraceElement.toString().contains(e.a().f26151i)) {
                    z10 = true;
                }
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                sb2.append("--CAUSE");
                sb2.append(System.lineSeparator());
                sb2.append(cause.toString());
                sb2.append(System.lineSeparator());
                for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                    sb2.append(stackTraceElement2.toString());
                    sb2.append(";" + System.lineSeparator());
                    if (stackTraceElement2.toString().contains(e.a().f26151i)) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(System.currentTimeMillis());
                new c(sb3, sb4.toString(), "Crash").d();
            }
            this.f26139a.uncaughtException(thread, th);
        }
    }
}
