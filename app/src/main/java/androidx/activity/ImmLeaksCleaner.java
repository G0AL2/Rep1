package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements m {

    /* renamed from: b  reason: collision with root package name */
    private static int f693b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f694c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f695d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f696e;

    /* renamed from: a  reason: collision with root package name */
    private Activity f697a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImmLeaksCleaner(Activity activity) {
        this.f697a = activity;
    }

    private static void g() {
        try {
            f693b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f695d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f696e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f694c = declaredField3;
            declaredField3.setAccessible(true);
            f693b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.m
    public void b(p pVar, i.b bVar) {
        if (bVar != i.b.ON_DESTROY) {
            return;
        }
        if (f693b == 0) {
            g();
        }
        if (f693b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f697a.getSystemService("input_method");
            try {
                Object obj = f694c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f695d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f696e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
