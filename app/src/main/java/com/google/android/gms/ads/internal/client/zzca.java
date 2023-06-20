package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzbxv;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzcdz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzca extends zzaqw implements zzcc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbua zzbuaVar, int i10) throws RemoteException {
        zzbo zzbmVar;
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(3, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbmVar = queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(readStrongBinder);
        }
        zzbk.recycle();
        return zzbmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbua zzbuaVar, int i10) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzqVar);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(13, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbua zzbuaVar, int i10) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzqVar);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbua zzbuaVar, int i10) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzqVar);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i10) throws RemoteException {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(10, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzcm zzckVar;
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(9, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzckVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzckVar = queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(readStrongBinder);
        }
        zzbk.recycle();
        return zzckVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzblf zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, iObjectWrapper2);
        Parcel zzbk = zzbk(5, zza);
        zzblf zzbB = zzble.zzbB(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzbB;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbll zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, iObjectWrapper2);
        zzaqy.zzg(zza, iObjectWrapper3);
        Parcel zzbk = zzbk(11, zza);
        zzbll zze = zzblk.zze(zzbk.readStrongBinder());
        zzbk.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbpk zzj(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10, zzbph zzbphVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        zzaqy.zzg(zza, zzbphVar);
        Parcel zzbk = zzbk(16, zza);
        zzbpk zzb = zzbpj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxl zzk(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(15, zza);
        zzbxl zzb = zzbxk.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxv zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(8, zza);
        zzbxv zzF = zzbxu.zzF(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcao zzm(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcbe zzn(IObjectWrapper iObjectWrapper, String str, zzbua zzbuaVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(12, zza);
        zzcbe zzq = zzcbd.zzq(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcdz zzo(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(14, zza);
        zzcdz zzb = zzcdy.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }
}
