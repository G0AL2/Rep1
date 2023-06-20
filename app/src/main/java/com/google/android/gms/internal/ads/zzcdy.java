package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcdy extends zzaqx implements zzcdz {
    public zzcdy() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcdz zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzcdz ? (zzcdz) queryLocalInterface : new zzcdx(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaqx
    protected final boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzcdw zzcdwVar = null;
        switch (i10) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzced zzcedVar = (zzced) zzaqy.zza(parcel, zzced.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzcdwVar = queryLocalInterface instanceof zzcdw ? (zzcdw) queryLocalInterface : new zzcdu(readStrongBinder);
                }
                zzaqy.zzc(parcel);
                zze(asInterface, zzcedVar, zzcdwVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzj(asInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                parcel2.writeNoException();
                zzaqy.zzg(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbyk zzb = zzbyj.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzl(createTypedArrayList, asInterface3, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbyk zzb2 = zzbyj.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzk(createTypedArrayList2, asInterface4, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzaqy.zzc(parcel);
                zzf((zzbyt) zzaqy.zza(parcel, zzbyt.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzi(asInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbyk zzb3 = zzbyj.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzh(createTypedArrayList3, asInterface6, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbyk zzb4 = zzbyj.zzb(parcel.readStrongBinder());
                zzaqy.zzc(parcel);
                zzg(createTypedArrayList4, asInterface7, zzb4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
