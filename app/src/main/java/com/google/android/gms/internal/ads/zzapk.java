package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapk implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzapl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapk(zzapl zzaplVar) {
        this.zza = zzaplVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        long j10;
        long j11;
        long j12;
        if (z10) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzapl zzaplVar = this.zza;
        j10 = zzaplVar.zzc;
        if (j10 > 0) {
            j11 = zzaplVar.zzc;
            if (currentTimeMillis >= j11) {
                j12 = zzaplVar.zzc;
                zzaplVar.zzd = currentTimeMillis - j12;
            }
        }
        this.zza.zze = false;
    }
}
