package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfmy extends zzaqx implements zzfmz {
    public zzfmy() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzaqy.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzaqy.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzaqy.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                zzaqy.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                zzaqy.zzc(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzaqy.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
