package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqz extends zzaqw implements zzarb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zza.writeString("GMA_SDK");
        zzbl(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zzf() throws RemoteException {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray(null);
        zzbl(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zzi(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbl(5, zza);
    }
}
