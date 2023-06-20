package l6;

import android.view.View;
import com.facebook.react.uimanager.r;
import com.facebook.yoga.n;

/* compiled from: LayoutMetricsConversions.java */
/* loaded from: classes.dex */
public class a {
    public static float a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 0) {
            return Float.POSITIVE_INFINITY;
        }
        return size;
    }

    public static float b(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        return 0.0f;
    }

    public static n c(float f10, float f11) {
        if (f10 == f11) {
            return n.EXACTLY;
        }
        if (Float.isInfinite(f11)) {
            return n.UNDEFINED;
        }
        return n.AT_MOST;
    }

    public static float d(float f10, float f11) {
        if (f10 == f11) {
            return r.c(f11);
        }
        if (Float.isInfinite(f11)) {
            return Float.POSITIVE_INFINITY;
        }
        return r.c(f11);
    }
}
