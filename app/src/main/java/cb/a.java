package cb;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class a extends j0 implements b {
    public static b Y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new u0(iBinder);
    }
}
