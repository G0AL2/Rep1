package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzp zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zze;
    final /* synthetic */ zzkb zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjc(zzkb zzkbVar, String str, String str2, zzp zzpVar, boolean z10, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzf = zzkbVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzpVar;
        this.zzd = z10;
        this.zze = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        RemoteException e10;
        zzeo zzeoVar;
        Bundle bundle2 = new Bundle();
        try {
            zzkb zzkbVar = this.zzf;
            zzeoVar = zzkbVar.zzb;
            if (zzeoVar == null) {
                zzkbVar.zzs.zzaz().zzd().zzc("Failed to get user properties; not connected to service", this.zza, this.zzb);
                this.zzf.zzs.zzv().zzR(this.zze, bundle2);
                return;
            }
            Preconditions.checkNotNull(this.zzc);
            List<zzll> zzh = zzeoVar.zzh(this.zza, this.zzb, this.zzd, this.zzc);
            bundle = new Bundle();
            if (zzh != null) {
                for (zzll zzllVar : zzh) {
                    String str = zzllVar.zze;
                    if (str != null) {
                        bundle.putString(zzllVar.zzb, str);
                    } else {
                        Long l10 = zzllVar.zzd;
                        if (l10 != null) {
                            bundle.putLong(zzllVar.zzb, l10.longValue());
                        } else {
                            Double d10 = zzllVar.zzg;
                            if (d10 != null) {
                                bundle.putDouble(zzllVar.zzb, d10.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.zzf.zzQ();
                    this.zzf.zzs.zzv().zzR(this.zze, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle2 = bundle;
                    this.zzf.zzs.zzv().zzR(this.zze, bundle2);
                    throw th;
                }
            } catch (RemoteException e11) {
                e10 = e11;
                this.zzf.zzs.zzaz().zzd().zzc("Failed to get user properties; remote exception", this.zza, e10);
                this.zzf.zzs.zzv().zzR(this.zze, bundle);
            }
        } catch (RemoteException e12) {
            bundle = bundle2;
            e10 = e12;
        } catch (Throwable th2) {
            th = th2;
            this.zzf.zzs.zzv().zzR(this.zze, bundle2);
            throw th;
        }
    }
}
