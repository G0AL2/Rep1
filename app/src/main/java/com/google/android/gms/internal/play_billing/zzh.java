package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes2.dex */
public class zzh implements IInterface {
    private final IBinder zza;
    private final String zzb = "com.android.vending.billing.IInAppBillingService";

    /* JADX INFO: Access modifiers changed from: protected */
    public zzh(IBinder iBinder, String str) {
        this.zza = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zzo() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel zzp(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zza.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzq(int i10, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(IronSourceConstants.RV_INSTANCE_SHOW, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
