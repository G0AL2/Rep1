package com.bytedance.sdk.openadsdk;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IAppOpenAdInteractionListener extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IAppOpenAdInteractionListener {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdClicked() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdShow() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdSkip() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onAdTimeOver() throws RemoteException {
        }

        @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
        public void onDestroy() throws RemoteException {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IAppOpenAdInteractionListener {

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class a implements IAppOpenAdInteractionListener {

            /* renamed from: a  reason: collision with root package name */
            public static IAppOpenAdInteractionListener f10561a;

            /* renamed from: b  reason: collision with root package name */
            private IBinder f10562b;

            a(IBinder iBinder) {
                this.f10562b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f10562b;
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdClicked() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f10562b.transact(3, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdClicked();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdShow() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f10562b.transact(2, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdShow();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdSkip() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f10562b.transact(4, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdSkip();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onAdTimeOver() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f10562b.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onAdTimeOver();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
            public void onDestroy() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                    if (!this.f10562b.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        Stub.getDefaultImpl().onDestroy();
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
            attachInterface(this, "com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
        }

        public static IAppOpenAdInteractionListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAppOpenAdInteractionListener)) {
                return (IAppOpenAdInteractionListener) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static IAppOpenAdInteractionListener getDefaultImpl() {
            return a.f10561a;
        }

        public static boolean setDefaultImpl(IAppOpenAdInteractionListener iAppOpenAdInteractionListener) {
            if (a.f10561a != null || iAppOpenAdInteractionListener == null) {
                return false;
            }
            a.f10561a = iAppOpenAdInteractionListener;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onDestroy();
                parcel2.writeNoException();
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdShow();
                parcel2.writeNoException();
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdClicked();
                parcel2.writeNoException();
                return true;
            } else if (i10 == 4) {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdSkip();
                parcel2.writeNoException();
                return true;
            } else if (i10 != 5) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                return true;
            } else {
                parcel.enforceInterface("com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener");
                onAdTimeOver();
                parcel2.writeNoException();
                return true;
            }
        }
    }

    void onAdClicked() throws RemoteException;

    void onAdShow() throws RemoteException;

    void onAdSkip() throws RemoteException;

    void onAdTimeOver() throws RemoteException;

    void onDestroy() throws RemoteException;
}
