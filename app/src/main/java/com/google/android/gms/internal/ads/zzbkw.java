package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbkw extends zzaqw implements zzbky {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final float zze() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final float zzf() throws RemoteException {
        Parcel zzbk = zzbk(6, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final float zzg() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final com.google.android.gms.ads.internal.client.zzdk zzh() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        com.google.android.gms.ads.internal.client.zzdk zzb = com.google.android.gms.ads.internal.client.zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final IObjectWrapper zzi() throws RemoteException {
        Parcel zzbk = zzbk(4, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzbk.readStrongBinder());
        zzbk.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final boolean zzk() throws RemoteException {
        Parcel zzbk = zzbk(8, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbky
    public final void zzl(zzbmj zzbmjVar) throws RemoteException {
        throw null;
    }
}
