package cb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class s0 extends i0 implements t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // cb.t0
    public final void a(Bundle bundle) throws RemoteException {
        Parcel X = X();
        k0.c(X, bundle);
        Y(3, X);
    }

    @Override // cb.t0
    public final void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel X = X();
        k0.c(X, bundle);
        k0.c(X, bundle2);
        Y(2, X);
    }

    @Override // cb.t0
    public final void c(Bundle bundle) throws RemoteException {
        Parcel X = X();
        k0.c(X, bundle);
        Y(4, X);
    }
}
