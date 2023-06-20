package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapa implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzapc zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapa(zzapc zzapcVar, int i10, boolean z10) {
        this.zzb = zzapcVar;
        this.zza = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaly zzalyVar;
        zzapc zzapcVar = this.zzb;
        int i10 = this.zza;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzapcVar.zza.getPackageManager().getPackageInfo(zzapcVar.zza.getPackageName(), 0);
            Context context = zzapcVar.zza;
            zzalyVar = zzflc.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzalyVar = null;
        }
        this.zzb.zzm = zzalyVar;
        if (this.zza < 4) {
            if (zzalyVar != null && zzalyVar.zzai() && !zzalyVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzalyVar.zzaj() && zzalyVar.zzf().zze() && zzalyVar.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
