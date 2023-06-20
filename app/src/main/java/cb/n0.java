package cb;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public interface n0 extends IInterface {
    void B(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException;

    void F(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException;

    void P(String str, Bundle bundle, p0 p0Var) throws RemoteException;

    void R(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException;

    void g(String str, List<Bundle> list, Bundle bundle, p0 p0Var) throws RemoteException;

    void p(String str, Bundle bundle, Bundle bundle2, p0 p0Var) throws RemoteException;

    void z(String str, Bundle bundle, p0 p0Var) throws RemoteException;
}
