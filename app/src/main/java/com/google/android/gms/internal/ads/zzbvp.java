package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzbvp extends zzaqx implements zzbvq {
    public zzbvp() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zzg();
        } else if (i10 == 3) {
            String readString = parcel.readString();
            zzaqy.zzc(parcel);
            zze(readString);
        } else if (i10 != 4) {
            return false;
        } else {
            zzaqy.zzc(parcel);
            zzf((com.google.android.gms.ads.internal.client.zze) zzaqy.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
