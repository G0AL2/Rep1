package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface ICommonPermissionListener extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements ICommonPermissionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onDenied(String str) throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
        public void onGranted() throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements ICommonPermissionListener {

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a implements ICommonPermissionListener {

            /* renamed from: a  reason: collision with root package name */
            public static ICommonPermissionListener f10567a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f10568b;

            a(IBinder iBinder) {
                this.f10568b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10568b;
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onDenied(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    obtain.writeString(str);
                    if (!this.f10568b.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDenied(str);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.ICommonPermissionListener
            public void onGranted() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                    if (!this.f10568b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onGranted();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.bytedance.sdk.openadsdk.ICommonPermissionListener");
        }

        public static ICommonPermissionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ICommonPermissionListener)) {
                return (ICommonPermissionListener) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static ICommonPermissionListener getDefaultImpl() {
            return a.f10567a;
        }

        public static boolean setDefaultImpl(ICommonPermissionListener iCommonPermissionListener) {
            if (a.f10567a != null || iCommonPermissionListener == null) {
                return false;
            }
            a.f10567a = iCommonPermissionListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                onGranted();
                parcel2.writeNoException();
                return true;
            } else if (i10 != 2) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                return true;
            } else {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.ICommonPermissionListener");
                onDenied(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
        }
    }

    void onDenied(String str) throws RemoteException;

    void onGranted() throws RemoteException;
}
