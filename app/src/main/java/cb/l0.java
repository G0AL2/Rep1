package cb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public final class l0 extends i0 implements n0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // cb.n0
    public final void B(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException {
        Parcel X = X();
        X.writeString(str);
        k0.c(X, bundle);
        k0.c(X, bundle2);
        k0.b(X, p0Var);
        Y(9, X);
    }

    @Override // cb.n0
    public final void F(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException {
        Parcel X = X();
        X.writeString(str);
        k0.c(X, bundle);
        k0.c(X, bundle2);
        k0.b(X, p0Var);
        Y(11, X);
    }

    @Override // cb.n0
    public final void P(String str, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel X = X();
        X.writeString(str);
        k0.c(X, bundle);
        k0.b(X, p0Var);
        Y(5, X);
    }

    @Override // cb.n0
    public final void R(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException {
        Parcel X = X();
        X.writeString(str);
        k0.c(X, bundle);
        k0.c(X, bundle2);
        k0.b(X, p0Var);
        Y(6, X);
    }

    @Override // cb.n0
    public final void g(String str, List<Bundle> list, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel X = X();
        X.writeString(str);
        X.writeTypedList(list);
        k0.c(X, bundle);
        k0.b(X, p0Var);
        Y(14, X);
    }

    @Override // cb.n0
    public final void p(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException {
        Parcel X = X();
        X.writeString(str);
        k0.c(X, bundle);
        k0.c(X, bundle2);
        k0.b(X, p0Var);
        Y(7, X);
    }

    @Override // cb.n0
    public final void z(String str, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel X = X();
        X.writeString(str);
        k0.c(X, bundle);
        k0.b(X, p0Var);
        Y(10, X);
    }
}
