package cb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class q0 extends j0 implements r0 {
    public q0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // cb.j0
    protected final boolean X(int i10, Parcel parcel) throws RemoteException {
        t0 t0Var = null;
        if (i10 == 2) {
            Bundle bundle = (Bundle) k0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                t0Var = queryLocalInterface instanceof t0 ? (t0) queryLocalInterface : new s0(readStrongBinder);
            }
            l(bundle, t0Var);
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) k0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                t0Var = queryLocalInterface2 instanceof t0 ? (t0) queryLocalInterface2 : new s0(readStrongBinder2);
            }
            o(t0Var);
            return true;
        }
    }
}
