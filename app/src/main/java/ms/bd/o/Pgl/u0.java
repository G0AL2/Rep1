package ms.bd.o.Pgl;

import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: classes3.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    private static int f34585a;

    public static String a(Context context) {
        if (context != null) {
            try {
                new DisplayMetrics();
                f34585a = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable unused) {
            }
        }
        return "" + f34585a;
    }
}
