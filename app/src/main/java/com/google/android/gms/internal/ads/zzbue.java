package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbue extends zzaqw implements zzbug {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbue(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zze() throws RemoteException {
        zzbl(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzf() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(23, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzi(int i10, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeString(str);
        zzbl(22, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzj(int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(24, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbl(21, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzm() throws RemoteException {
        zzbl(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzn() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzo() throws RemoteException {
        zzbl(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzp() throws RemoteException {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzr(zzblv zzblvVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzblvVar);
        zza.writeString(str);
        zzbl(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzs(zzcax zzcaxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzt(zzcbb zzcbbVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcbbVar);
        zzbl(16, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzu() throws RemoteException {
        zzbl(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzv() throws RemoteException {
        zzbl(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzw() throws RemoteException {
        zzbl(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzx() throws RemoteException {
        zzbl(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbug
    public final void zzy() throws RemoteException {
        zzbl(13, zza());
    }
}
