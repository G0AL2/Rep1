package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public interface j extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements j {

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: androidx.room.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0074a implements j {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f3916a;

            C0074a(IBinder iBinder) {
                this.f3916a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3916a;
            }

            @Override // androidx.room.j
            public void d(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f3916a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static j X(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof j)) {
                return (j) queryLocalInterface;
            }
            return new C0074a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                d(parcel.createStringArray());
                return true;
            }
        }
    }

    void d(String[] strArr) throws RemoteException;
}
