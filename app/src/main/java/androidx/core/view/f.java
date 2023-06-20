package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: KeyEventDispatcher.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f2672a = false;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2673b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2674c = false;

    /* renamed from: d  reason: collision with root package name */
    private static Field f2675d;

    /* compiled from: KeyEventDispatcher.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    private static boolean a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2672a) {
            try {
                f2673b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f2672a = true;
        }
        Method method = f2673b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (z.i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f10 = f(dialog);
        if (f10 == null || !f10.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (z.i(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        return true;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        return z.j(view, keyEvent);
    }

    public static boolean e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return c((Dialog) callback, keyEvent);
        }
        return (view != null && z.i(view, keyEvent)) || aVar.superDispatchKeyEvent(keyEvent);
    }

    private static DialogInterface.OnKeyListener f(Dialog dialog) {
        if (!f2674c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2675d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2674c = true;
        }
        Field field = f2675d;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }
}
