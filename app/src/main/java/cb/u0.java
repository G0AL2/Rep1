package cb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class u0 extends i0 implements b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // cb.b
    public final void m(String str, Bundle bundle, d dVar) throws RemoteException {
        Parcel X = X();
        X.writeString(str);
        k0.c(X, bundle);
        k0.b(X, dVar);
        Y(2, X);
    }
}
