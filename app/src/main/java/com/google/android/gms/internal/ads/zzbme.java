package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbme extends zzaqx implements zzbmf {
    public zzbme() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbmf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof zzbmf ? (zzbmf) queryLocalInterface : new zzbmd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzblv zzbltVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbltVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                zzbltVar = queryLocalInterface instanceof zzblv ? (zzblv) queryLocalInterface : new zzblt(readStrongBinder);
            }
            String readString = parcel.readString();
            zzaqy.zzc(parcel);
            zze(zzbltVar, readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
