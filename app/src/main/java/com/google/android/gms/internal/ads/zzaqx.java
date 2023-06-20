package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-base@@21.1.0 */
/* loaded from: classes2.dex */
public class zzaqx extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzaqx(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zzbI(i10, parcel, parcel2, i11);
    }

    protected boolean zzbI(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        throw null;
    }
}
