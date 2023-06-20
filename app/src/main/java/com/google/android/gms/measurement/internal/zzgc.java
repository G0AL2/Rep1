package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzgc implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzgf zza;
    private final String zzb;

    public zzgc(zzgf zzgfVar, String str) {
        this.zza = zzgfVar;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.zza.zzs.zzaz().zzd().zzb(this.zzb, th);
    }
}
