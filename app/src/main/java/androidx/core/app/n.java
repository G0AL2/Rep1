package androidx.core.app;

import android.app.RemoteInput;

/* compiled from: RemoteInput.java */
/* loaded from: classes.dex */
public final class n {
    static RemoteInput a(n nVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nVarArr.length];
        for (int i10 = 0; i10 < nVarArr.length; i10++) {
            remoteInputArr[i10] = a(nVarArr[i10]);
        }
        return remoteInputArr;
    }
}
