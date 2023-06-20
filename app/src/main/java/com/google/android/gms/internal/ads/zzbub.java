package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbub extends zzaqw implements zzbud {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzA(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzB(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzlVar);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbugVar);
        zzbl(32, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzD() throws RemoteException {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzE() throws RemoteException {
        zzbl(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzF(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzd(zza, z10);
        zzbl(25, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzG() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(37, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzI(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(30, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzJ() throws RemoteException {
        zzbl(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final boolean zzK() throws RemoteException {
        Parcel zzbk = zzbk(22, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final boolean zzL() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final zzbul zzM() throws RemoteException {
        zzbul zzbulVar;
        Parcel zzbk = zzbk(15, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbulVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbulVar = queryLocalInterface instanceof zzbul ? (zzbul) queryLocalInterface : new zzbul(readStrongBinder);
        }
        zzbk.recycle();
        return zzbulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final zzbum zzN() throws RemoteException {
        zzbum zzbumVar;
        Parcel zzbk = zzbk(16, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbumVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbumVar = queryLocalInterface instanceof zzbum ? (zzbum) queryLocalInterface : new zzbum(readStrongBinder);
        }
        zzbk.recycle();
        return zzbumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final com.google.android.gms.ads.internal.client.zzdk zzh() throws RemoteException {
        Parcel zzbk = zzbk(26, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final zzblv zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final zzbuj zzj() throws RemoteException {
        zzbuj zzbuhVar;
        Parcel zzbk = zzbk(36, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbuhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbuhVar = queryLocalInterface instanceof zzbuj ? (zzbuj) queryLocalInterface : new zzbuh(readStrongBinder);
        }
        zzbk.recycle();
        return zzbuhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final zzbup zzk() throws RemoteException {
        zzbup zzbunVar;
        Parcel zzbk = zzbk(27, zza());
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbunVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbunVar = queryLocalInterface instanceof zzbup ? (zzbup) queryLocalInterface : new zzbun(readStrongBinder);
        }
        zzbk.recycle();
        return zzbunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final zzbwg zzl() throws RemoteException {
        Parcel zzbk = zzbk(33, zza());
        zzbwg zzbwgVar = (zzbwg) zzaqy.zza(zzbk, zzbwg.CREATOR);
        zzbk.recycle();
        return zzbwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final zzbwg zzm() throws RemoteException {
        Parcel zzbk = zzbk(34, zza());
        zzbwg zzbwgVar = (zzbwg) zzaqy.zza(zzbk, zzbwg.CREATOR);
        zzbk.recycle();
        return zzbwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzo() throws RemoteException {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzcaw zzcawVar, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzlVar);
        zza.writeString(null);
        zzaqy.zzg(zza, zzcawVar);
        zza.writeString(str2);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzq(IObjectWrapper iObjectWrapper, zzbqk zzbqkVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbqkVar);
        zza.writeTypedList(list);
        zzbl(31, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzr(IObjectWrapper iObjectWrapper, zzcaw zzcawVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzcawVar);
        zza.writeStringList(list);
        zzbl(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzlVar);
        zza.writeString(str);
        zzbl(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbug zzbugVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzqVar);
        zzaqy.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zzg(zza, zzbugVar);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzqVar);
        zzaqy.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zzg(zza, zzbugVar);
        zzbl(35, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbug zzbugVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zzg(zza, zzbugVar);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbug zzbugVar, zzbkp zzbkpVar, List list) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzlVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zzg(zza, zzbugVar);
        zzaqy.zze(zza, zzbkpVar);
        zza.writeStringList(list);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzlVar);
        zza.writeString(str);
        zzaqy.zzg(zza, zzbugVar);
        zzbl(28, zza);
    }
}
