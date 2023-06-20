package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeha extends zzcav implements zzddd {
    private zzcaw zza;
    private zzddc zzb;
    private zzdjr zzc;

    @Override // com.google.android.gms.internal.ads.zzddd
    public final synchronized void zza(zzddc zzddcVar) {
        this.zzb = zzddcVar;
    }

    public final synchronized void zzc(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    public final synchronized void zzd(zzdjr zzdjrVar) {
        this.zzc = zzdjrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            ((zzejt) zzcawVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            zzcawVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzddc zzddcVar = this.zzb;
        if (zzddcVar != null) {
            zzddcVar.zza(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            ((zzejt) zzcawVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzddc zzddcVar = this.zzb;
        if (zzddcVar != null) {
            zzddcVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            ((zzejt) zzcawVar).zza.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzdjr zzdjrVar = this.zzc;
        if (zzdjrVar != null) {
            zzcfi.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzejs) zzdjrVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzdjr zzdjrVar = this.zzc;
        if (zzdjrVar != null) {
            Executor zzc = zzeju.zzc(((zzejs) zzdjrVar).zzd);
            final zzfbx zzfbxVar = ((zzejs) zzdjrVar).zza;
            final zzfbl zzfblVar = ((zzejs) zzdjrVar).zzb;
            final zzefg zzefgVar = ((zzejs) zzdjrVar).zzc;
            final zzejs zzejsVar = (zzejs) zzdjrVar;
            zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejr
                @Override // java.lang.Runnable
                public final void run() {
                    zzejs zzejsVar2 = zzejs.this;
                    zzfbx zzfbxVar2 = zzfbxVar;
                    zzfbl zzfblVar2 = zzfblVar;
                    zzefg zzefgVar2 = zzefgVar;
                    zzeju zzejuVar = zzejsVar2.zzd;
                    zzeju.zze(zzfbxVar2, zzfblVar2, zzefgVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzcax zzcaxVar) throws RemoteException {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            ((zzejt) zzcawVar).zzd.zza(zzcaxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            ((zzejt) zzcawVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar != null) {
            ((zzejt) zzcawVar).zzd.zzc();
        }
    }
}
