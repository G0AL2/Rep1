package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

/* compiled from: CheckedTextViewCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: CheckedTextViewCompat.java */
    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f2807a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f2808b;

        static Drawable a(CheckedTextView checkedTextView) {
            if (!f2808b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f2807a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e10) {
                    Log.i("CheckedTextViewCompat", "Failed to retrieve mCheckMarkDrawable field", e10);
                }
                f2808b = true;
            }
            Field field = f2807a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e11) {
                    Log.i("CheckedTextViewCompat", "Failed to get check mark drawable via reflection", e11);
                    f2807a = null;
                }
            }
            return null;
        }
    }

    /* compiled from: CheckedTextViewCompat.java */
    /* loaded from: classes.dex */
    private static class b {
        static Drawable a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* compiled from: CheckedTextViewCompat.java */
    /* renamed from: androidx.core.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0054c {
        static void a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    public static Drawable a(CheckedTextView checkedTextView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return b.a(checkedTextView);
        }
        return a.a(checkedTextView);
    }

    public static void b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0054c.a(checkedTextView, colorStateList);
        } else if (checkedTextView instanceof l) {
            ((l) checkedTextView).setSupportCheckMarkTintList(colorStateList);
        }
    }

    public static void c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0054c.b(checkedTextView, mode);
        } else if (checkedTextView instanceof l) {
            ((l) checkedTextView).setSupportCheckMarkTintMode(mode);
        }
    }
}
