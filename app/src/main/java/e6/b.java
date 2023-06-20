package e6;

import android.graphics.Bitmap;
import android.os.Build;

/* compiled from: TransformationUtils.java */
/* loaded from: classes.dex */
public final class b {
    public static boolean a(a aVar, c4.a<Bitmap> aVar2) {
        if (aVar == null || aVar2 == null) {
            return false;
        }
        Bitmap y10 = aVar2.y();
        if (Build.VERSION.SDK_INT >= 12 && aVar.a()) {
            y10.setHasAlpha(true);
        }
        aVar.transform(y10);
        return true;
    }
}
