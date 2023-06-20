package com.google.android.gms.internal.play_billing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes2.dex */
public class zzi extends Binder implements IInterface {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzi(String str) {
        attachInterface(this, "com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 > 16777215) {
            if (super.onTransact(i10, parcel, parcel2, i11)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zzb(i10, parcel, parcel2, i11);
    }

    protected boolean zzb(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        throw null;
    }
}
