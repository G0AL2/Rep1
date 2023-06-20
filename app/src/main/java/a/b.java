package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: ICustomTabsService.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: ICustomTabsService.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ICustomTabsService.java */
        /* renamed from: a.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a implements b {

            /* renamed from: b  reason: collision with root package name */
            public static b f1b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f2a;

            C0001a(IBinder iBinder) {
                this.f2a = iBinder;
            }

            @Override // a.b
            public boolean E(a.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (!this.f2a.transact(3, obtain, obtain2, 0) && a.Y() != null) {
                        return a.Y().E(aVar);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // a.b
            public boolean H(long j10) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j10);
                    if (!this.f2a.transact(2, obtain, obtain2, 0) && a.Y() != null) {
                        return a.Y().H(j10);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // a.b
            public boolean I(a.a aVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f2a.transact(10, obtain, obtain2, 0) && a.Y() != null) {
                        return a.Y().I(aVar, bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2a;
            }
        }

        public static b X(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0001a(iBinder);
        }

        public static b Y() {
            return C0001a.f1b;
        }
    }

    boolean E(a.a aVar) throws RemoteException;

    boolean H(long j10) throws RemoteException;

    boolean I(a.a aVar, Bundle bundle) throws RemoteException;
}
