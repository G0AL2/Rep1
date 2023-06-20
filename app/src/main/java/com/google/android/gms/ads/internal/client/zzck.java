package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbua;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzck extends zzaqw implements zzcm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() throws RemoteException {
        Parcel zzbk = zzbk(9, zza());
        String readString = zzbk.readString();
        zzbk.recycle();
        return readString;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() throws RemoteException {
        Parcel zzbk = zzbk(13, zza());
        ArrayList createTypedArrayList = zzbk.createTypedArrayList(zzbqg.CREATOR);
        zzbk.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() throws RemoteException {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() throws RemoteException {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcyVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcyVar);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbua zzbuaVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbuaVar);
        zzbl(11, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzd(zza, z10);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f10) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbqn zzbqnVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbqnVar);
        zzbl(12, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzez zzezVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzezVar);
        zzbl(14, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() throws RemoteException {
        Parcel zzbk = zzbk(8, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
