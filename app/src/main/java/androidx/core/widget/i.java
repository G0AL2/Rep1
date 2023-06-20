package androidx.core.widget;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.z;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PopupWindowCompat.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Method f2812a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2813b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f2814c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f2815d;

    /* compiled from: PopupWindowCompat.java */
    /* loaded from: classes.dex */
    static class a {
        static void a(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
            popupWindow.showAsDropDown(view, i10, i11, i12);
        }
    }

    /* compiled from: PopupWindowCompat.java */
    /* loaded from: classes.dex */
    static class b {
        static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        static void c(PopupWindow popupWindow, boolean z10) {
            popupWindow.setOverlapAnchor(z10);
        }

        static void d(PopupWindow popupWindow, int i10) {
            popupWindow.setWindowLayoutType(i10);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            b.c(popupWindow, z10);
        } else if (i10 >= 21) {
            if (!f2815d) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2814c = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e10);
                }
                f2815d = true;
            }
            Field field = f2814c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z10));
                } catch (IllegalAccessException e11) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e11);
                }
            }
        }
    }

    public static void b(PopupWindow popupWindow, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            b.d(popupWindow, i10);
            return;
        }
        if (!f2813b) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2812a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2813b = true;
        }
        Method method = f2812a;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i10));
            } catch (Exception unused2) {
            }
        }
    }

    public static void c(PopupWindow popupWindow, View view, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 19) {
            a.a(popupWindow, view, i10, i11, i12);
            return;
        }
        if ((androidx.core.view.e.b(i12, z.C(view)) & 7) == 5) {
            i10 -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i10, i11);
    }
}
