package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzarf extends Exception {
    private zzarf(int i10, String str, Throwable th, int i11) {
        super(null, th);
    }

    public static zzarf zza(Exception exc, int i10) {
        return new zzarf(1, null, exc, i10);
    }

    public static zzarf zzb(IOException iOException) {
        return new zzarf(0, null, iOException, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzarf zzc(RuntimeException runtimeException) {
        return new zzarf(2, null, runtimeException, -1);
    }
}
