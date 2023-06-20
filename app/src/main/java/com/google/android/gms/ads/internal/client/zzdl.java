package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdl extends zzaqw implements zzdn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze() throws RemoteException {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzf(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzd(zza, z10);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzg() throws RemoteException {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzh() throws RemoteException {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzi() throws RemoteException {
        zzbl(1, zza());
    }
}
