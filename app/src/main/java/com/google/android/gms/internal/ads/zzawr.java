package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzawr implements Runnable {
    final /* synthetic */ IOException zza;
    final /* synthetic */ zzawv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawr(zzawv zzawvVar, IOException iOException) {
        this.zzb = zzawvVar;
        this.zza = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaww zzawwVar;
        zzawwVar = this.zzb.zze;
        zzawwVar.zzi(this.zza);
    }
}
