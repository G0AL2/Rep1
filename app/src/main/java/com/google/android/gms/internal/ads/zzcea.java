package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcea extends zzaqw implements zzcec {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcea(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcec
    public final zzcdz zze(IObjectWrapper iObjectWrapper, zzbua zzbuaVar, int i10) throws RemoteException {
        zzcdz zzcdxVar;
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbuaVar);
        zza.writeInt(221908000);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzcdxVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcdxVar = queryLocalInterface instanceof zzcdz ? (zzcdz) queryLocalInterface : new zzcdx(readStrongBinder);
        }
        zzbk.recycle();
        return zzcdxVar;
    }
}
