package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IResultReceiver.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: IResultReceiver.java */
    /* renamed from: android.support.v4.os.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0030a extends Binder implements a {

        /* compiled from: IResultReceiver.java */
        /* renamed from: android.support.v4.os.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0031a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f677a;

            C0031a(IBinder iBinder) {
                this.f677a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f677a;
            }
        }

        public AbstractBinderC0030a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        public static a X(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0031a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                n(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    void n(int i10, Bundle bundle) throws RemoteException;
}
