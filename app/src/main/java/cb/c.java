package cb;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public abstract class c extends j0 implements d {
    public c() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // cb.j0
    protected final boolean X(int i10, Parcel parcel) throws RemoteException {
        if (i10 == 2) {
            a((Bundle) k0.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
