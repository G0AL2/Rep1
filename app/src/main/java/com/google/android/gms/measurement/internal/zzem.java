package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzem extends com.google.android.gms.internal.measurement.zzbm implements zzeo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzem(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final String zzd(zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zze(zzp zzpVar, boolean z10) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, z10);
        Parcel zzb = zzb(7, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzll.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zzf(String str, String str2, zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        Parcel zzb = zzb(16, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzab.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zzg(String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzab.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zzh(String str, String str2, boolean z10, zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, z10);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        Parcel zzb = zzb(14, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzll.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final List zzi(String str, String str2, String str3, boolean z10) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        com.google.android.gms.internal.measurement.zzbo.zzd(zza, z10);
        Parcel zzb = zzb(15, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzll.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzj(zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzk(zzav zzavVar, zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzavVar);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzl(zzav zzavVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzm(zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzn(zzab zzabVar, zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzabVar);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzo(zzab zzabVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzp(zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzq(long j10, String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j10);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzr(Bundle bundle, zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, bundle);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzs(zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final void zzt(zzll zzllVar, zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzllVar);
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzpVar);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzeo
    public final byte[] zzu(zzav zzavVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.measurement.zzbo.zze(zza, zzavVar);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }
}
