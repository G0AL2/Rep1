package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzfc implements Runnable {
    private final zzfa zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfc(String str, zzfa zzfaVar, int i10, Throwable th, byte[] bArr, Map map, zzfb zzfbVar) {
        Preconditions.checkNotNull(zzfaVar);
        this.zza = zzfaVar;
        this.zzb = i10;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
