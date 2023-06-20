package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzble extends zzaqx implements zzblf {
    public zzble() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzblf zzbB(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzblf ? (zzblf) queryLocalInterface : new zzbld(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbky zzbkwVar;
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzbw(readString, asInterface);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzaqy.zzc(parcel);
                IObjectWrapper zzb = zzb(readString2);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, zzb);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzbA(asInterface2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                zzaqy.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzbx(asInterface3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzd(asInterface4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbkwVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbkwVar = queryLocalInterface instanceof zzbky ? (zzbky) queryLocalInterface : new zzbkw(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zzby(zzbkwVar);
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzbz(asInterface5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
