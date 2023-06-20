package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjt implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzp zzc;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zzd;
    final /* synthetic */ zzkb zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjt(zzkb zzkbVar, String str, String str2, zzp zzpVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zze = zzkbVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpVar;
        this.zzd = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgi zzgiVar;
        zzeo zzeoVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zzkb zzkbVar = this.zze;
                zzeoVar = zzkbVar.zzb;
                if (zzeoVar == null) {
                    zzkbVar.zzs.zzaz().zzd().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                    zzgiVar = this.zze.zzs;
                } else {
                    Preconditions.checkNotNull(this.zzc);
                    arrayList = zzlp.zzH(zzeoVar.zzf(this.zza, this.zzb, this.zzc));
                    this.zze.zzQ();
                    zzgiVar = this.zze.zzs;
                }
            } catch (RemoteException e10) {
                this.zze.zzs.zzaz().zzd().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, e10);
                zzgiVar = this.zze.zzs;
            }
            zzgiVar.zzv().zzQ(this.zzd, arrayList);
        } catch (Throwable th) {
            this.zze.zzs.zzv().zzQ(this.zzd, arrayList);
            throw th;
        }
    }
}
