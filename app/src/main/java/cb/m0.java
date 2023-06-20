package cb;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class m0 extends j0 implements n0 {
    public static n0 Y(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new l0(iBinder);
    }
}
