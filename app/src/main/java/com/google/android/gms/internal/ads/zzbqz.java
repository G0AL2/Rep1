package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbqz extends zzaqw implements zzbrb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zze(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzeVar);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrb
    public final void zzg(zzbqv zzbqvVar) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbqvVar);
        zzbl(1, zza);
    }
}
