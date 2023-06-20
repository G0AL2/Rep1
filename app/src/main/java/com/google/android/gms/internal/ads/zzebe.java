package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzebe extends zzeay {
    private String zzg;
    private int zzh = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebe(Context context) {
        this.zzf = new zzbzg(context, com.google.android.gms.ads.internal.zzt.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i10 = this.zzh;
                    if (i10 == 2) {
                        this.zzf.zzp().zze(this.zze, new zzeax(this));
                    } else if (i10 == 3) {
                        this.zzf.zzp().zzh(this.zzg, new zzeax(this));
                    } else {
                        this.zza.zze(new zzebn(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzebn(1));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeay, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzcfi.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zze(new zzebn(1));
    }

    public final zzfvl zzb(zzbzv zzbzvVar) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 2) {
                return zzfvc.zzh(new zzebn(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbzvVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzebe.this.zza();
                    }
                }, zzcfv.zzf);
                return this.zza;
            }
        }
    }

    public final zzfvl zzc(String str) {
        synchronized (this.zzb) {
            int i10 = this.zzh;
            if (i10 != 1 && i10 != 3) {
                return zzfvc.zzh(new zzebn(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzebe.this.zza();
                    }
                }, zzcfv.zzf);
                return this.zza;
            }
        }
    }
}
