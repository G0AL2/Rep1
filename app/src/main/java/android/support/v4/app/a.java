package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: INotificationSideChannel.java */
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* compiled from: INotificationSideChannel.java */
    /* renamed from: android.support.v4.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0026a extends Binder implements a {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: INotificationSideChannel.java */
        /* renamed from: android.support.v4.app.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0027a implements a {

            /* renamed from: b  reason: collision with root package name */
            public static a f608b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f609a;

            C0027a(IBinder iBinder) {
                this.f609a = iBinder;
            }

            @Override // android.support.v4.app.a
            public void C(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    if (this.f609a.transact(3, obtain, null, 1) || AbstractBinderC0026a.Y() == null) {
                        return;
                    }
                    AbstractBinderC0026a.Y().C(str);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void T(String str, int i10, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f609a.transact(1, obtain, null, 1) || AbstractBinderC0026a.Y() == null) {
                        return;
                    }
                    AbstractBinderC0026a.Y().T(str, i10, str2, notification);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f609a;
            }

            @Override // android.support.v4.app.a
            public void i(String str, int i10, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    if (this.f609a.transact(2, obtain, null, 1) || AbstractBinderC0026a.Y() == null) {
                        return;
                    }
                    AbstractBinderC0026a.Y().i(str, i10, str2);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static a X(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface != null && (queryLocalInterface instanceof a)) {
                return (a) queryLocalInterface;
            }
            return new C0027a(iBinder);
        }

        public static a Y() {
            return C0027a.f608b;
        }
    }

    void C(String str) throws RemoteException;

    void T(String str, int i10, String str2, Notification notification) throws RemoteException;

    void i(String str, int i10, String str2) throws RemoteException;
}
