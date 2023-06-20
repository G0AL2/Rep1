package xa;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: MaterialShapeUtils.java */
/* loaded from: classes3.dex */
public class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return b();
            }
            return new e();
        }
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d b() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f c() {
        return new f();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).T(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.N()) {
            gVar.X(com.google.android.material.internal.h.b(view));
        }
    }
}
