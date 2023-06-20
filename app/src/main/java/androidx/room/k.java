package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.j;

/* compiled from: IMultiInstanceInvalidationService.java */
/* loaded from: classes.dex */
public interface k extends IInterface {

    /* compiled from: IMultiInstanceInvalidationService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements k {

        /* compiled from: IMultiInstanceInvalidationService.java */
        /* renamed from: androidx.room.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0075a implements k {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f3917a;

            C0075a(IBinder iBinder) {
                this.f3917a = iBinder;
            }

            @Override // androidx.room.k
            public int D(j jVar, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(jVar);
                    obtain.writeString(str);
                    this.f3917a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.k
            public void V(j jVar, int i10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(jVar);
                    obtain.writeInt(i10);
                    this.f3917a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3917a;
            }

            @Override // androidx.room.k
            public void k(int i10, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f3917a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static k X(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof k)) {
                return (k) queryLocalInterface;
            }
            return new C0075a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            if (i10 == 1) {
                int D = D(j.a.X(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(D);
            } else if (i10 == 2) {
                V(j.a.X(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else if (i10 != 3) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                k(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    int D(j jVar, String str) throws RemoteException;

    void V(j jVar, int i10) throws RemoteException;

    void k(int i10, String[] strArr) throws RemoteException;
}
