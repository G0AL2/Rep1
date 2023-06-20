package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMediaSession.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* compiled from: IMediaSession.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0029a implements b {

            /* renamed from: b  reason: collision with root package name */
            public static b f666b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f667a;

            C0029a(IBinder iBinder) {
                this.f667a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f667a;
            }

            @Override // android.support.v4.media.session.b
            public void q(android.support.v4.media.session.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (!this.f667a.transact(3, obtain, obtain2, 0) && a.Y() != null) {
                        a.Y().q(aVar);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static b X(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                return (b) queryLocalInterface;
            }
            return new C0029a(iBinder);
        }

        public static b Y() {
            return C0029a.f666b;
        }
    }

    void q(android.support.v4.media.session.a aVar) throws RemoteException;
}
