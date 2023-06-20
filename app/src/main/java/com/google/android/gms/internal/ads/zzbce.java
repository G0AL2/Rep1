package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbce extends zzaqw implements zzbcg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final com.google.android.gms.ads.internal.client.zzbs zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final com.google.android.gms.ads.internal.client.zzdh zzf() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        com.google.android.gms.ads.internal.client.zzdh zzb = com.google.android.gms.ads.internal.client.zzdg.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzg(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzd(zza, z10);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzdeVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzi(IObjectWrapper iObjectWrapper, zzbcn zzbcnVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbcnVar);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzj(zzbck zzbckVar) throws RemoteException {
        throw null;
    }
}
