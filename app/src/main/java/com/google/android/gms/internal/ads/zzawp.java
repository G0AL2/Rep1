package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawp implements Runnable {
    final /* synthetic */ zzawv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawp(zzawv zzawvVar) {
        this.zza = zzawvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        zzawy zzawyVar;
        zzawv zzawvVar = this.zza;
        z10 = zzawvVar.zzF;
        if (z10) {
            return;
        }
        zzawyVar = zzawvVar.zzo;
        zzawyVar.zze(zzawvVar);
    }
}
