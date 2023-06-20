package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbvr extends zzaqw implements zzbvt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final com.google.android.gms.ads.internal.client.zzdk zze() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final zzbwg zzf() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        zzbwg zzbwgVar = (zzbwg) zzaqy.zza(zzbk, zzbwg.CREATOR);
        zzbk.recycle();
        return zzbwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final zzbwg zzg() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        zzbwg zzbwgVar = (zzbwg) zzaqy.zza(zzbk, zzbwg.CREATOR);
        zzbk.recycle();
        return zzbwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbvw zzbvwVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzaqy.zze(zza, bundle);
        zzaqy.zze(zza, bundle2);
        zzaqy.zze(zza, zzqVar);
        zzaqy.zzg(zza, zzbvwVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvh zzbvhVar, zzbug zzbugVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzlVar);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvhVar);
        zzaqy.zzg(zza, zzbugVar);
        zzaqy.zze(zza, zzqVar);
        zzbl(13, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvh zzbvhVar, zzbug zzbugVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzlVar);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvhVar);
        zzaqy.zzg(zza, zzbugVar);
        zzaqy.zze(zza, zzqVar);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvk zzbvkVar, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzlVar);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvkVar);
        zzaqy.zzg(zza, zzbugVar);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvn zzbvnVar, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzlVar);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvnVar);
        zzaqy.zzg(zza, zzbugVar);
        zzbl(18, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvn zzbvnVar, zzbug zzbugVar, zzbkp zzbkpVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzlVar);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvnVar);
        zzaqy.zzg(zza, zzbugVar);
        zzaqy.zze(zza, zzbkpVar);
        zzbl(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvq zzbvqVar, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzlVar);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvqVar);
        zzaqy.zzg(zza, zzbugVar);
        zzbl(20, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbvq zzbvqVar, zzbug zzbugVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzaqy.zze(zza, zzlVar);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbvqVar);
        zzaqy.zzg(zza, zzbugVar);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final void zzp(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(19, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(15, zza);
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbvt
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(17, zza);
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
