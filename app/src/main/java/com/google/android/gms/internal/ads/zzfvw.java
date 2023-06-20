package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfvw extends TimeoutException {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfvw(String str, zzfvu zzfvuVar) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
