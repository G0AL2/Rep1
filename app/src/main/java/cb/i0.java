package cb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public class i0 implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f5440a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5441b;

    /* JADX INFO: Access modifiers changed from: protected */
    public i0(IBinder iBinder, String str) {
        this.f5440a = iBinder;
        this.f5441b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel X() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5441b);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Y(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f5440a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5440a;
    }
}
