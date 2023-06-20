package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbcu {
    private final Runnable zza = new zzbcq(this);
    private final Object zzb = new Object();
    private zzbcx zzc;
    private Context zzd;
    private zzbda zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzh(zzbcu zzbcuVar) {
        synchronized (zzbcuVar.zzb) {
            zzbcx zzbcxVar = zzbcuVar.zzc;
            if (zzbcxVar == null) {
                return;
            }
            if (zzbcxVar.isConnected() || zzbcuVar.zzc.isConnecting()) {
                zzbcuVar.zzc.disconnect();
            }
            zzbcuVar.zzc = null;
            zzbcuVar.zze = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzb) {
            if (this.zzd != null && this.zzc == null) {
                zzbcx zzd = zzd(new zzbcs(this), new zzbct(this));
                this.zzc = zzd;
                zzd.checkAvailabilityAndConnect();
            }
        }
    }

    public final long zza(zzbcy zzbcyVar) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                return -2L;
            }
            if (this.zzc.zzp()) {
                try {
                    return this.zze.zze(zzbcyVar);
                } catch (RemoteException e10) {
                    zzcfi.zzh("Unable to call into cache service.", e10);
                }
            }
            return -2L;
        }
    }

    public final zzbcv zzb(zzbcy zzbcyVar) {
        synchronized (this.zzb) {
            if (this.zze == null) {
                return new zzbcv();
            }
            try {
                if (this.zzc.zzp()) {
                    return this.zze.zzg(zzbcyVar);
                }
                return this.zze.zzf(zzbcyVar);
            } catch (RemoteException e10) {
                zzcfi.zzh("Unable to call into cache service.", e10);
                return new zzbcv();
            }
        }
    }

    @VisibleForTesting
    protected final synchronized zzbcx zzd(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzbcx(this.zzd, com.google.android.gms.ads.internal.zzt.zzt().zzb(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd != null) {
                return;
            }
            this.zzd = context.getApplicationContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdl)).booleanValue()) {
                zzl();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdk)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(new zzbcr(this));
                }
            }
        }
    }

    public final void zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdm)).booleanValue()) {
            synchronized (this.zzb) {
                zzl();
                zzfnw zzfnwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfnwVar.removeCallbacks(this.zza);
                zzfnwVar.postDelayed(this.zza, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdn)).longValue());
            }
        }
    }
}
