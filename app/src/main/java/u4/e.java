package u4;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableUtils.java */
/* loaded from: classes.dex */
public class e {
    public static void a(Drawable drawable, Drawable drawable2) {
        if (drawable2 == null || drawable == null || drawable == drawable2) {
            return;
        }
        drawable.setBounds(drawable2.getBounds());
        drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
        drawable.setLevel(drawable2.getLevel());
        drawable.setVisible(drawable2.isVisible(), false);
        drawable.setState(drawable2.getState());
    }

    public static int b(int i10) {
        int i11 = i10 >>> 24;
        if (i11 == 255) {
            return -1;
        }
        return i11 == 0 ? -2 : -3;
    }

    public static int c(int i10, int i11) {
        if (i11 == 255) {
            return i10;
        }
        if (i11 == 0) {
            return i10 & 16777215;
        }
        return (i10 & 16777215) | ((((i10 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24);
    }

    public static void d(Drawable drawable, Drawable.Callback callback, s sVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof r) {
                ((r) drawable).c(sVar);
            }
        }
    }

    public static void e(Drawable drawable, d dVar) {
        if (drawable == null || dVar == null) {
            return;
        }
        dVar.a(drawable);
    }
}
