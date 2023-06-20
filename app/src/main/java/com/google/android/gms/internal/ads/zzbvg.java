package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbvg extends zzaqx implements zzbvh {
    public zzbvg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            zzg(asInterface);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzaqy.zzc(parcel);
            zze(readString);
        } else if (i10 == 3) {
            zzaqy.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        } else if (i10 != 4) {
            return false;
        } else {
            zzbuj zzb = zzbui.zzb(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
