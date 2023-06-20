package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CanvasUtil.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Method f16383a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Method f16384b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f16385c = false;

    @SuppressLint({"SoonBlockedPrivateApi", "PrivateApi"})
    public static void a(Canvas canvas, boolean z10) {
        Method method;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            return;
        }
        if (i10 >= 29) {
            if (z10) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        b();
        if (z10) {
            try {
                Method method2 = f16383a;
                if (method2 != null) {
                    method2.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return;
            }
        }
        if (z10 || (method = f16384b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    private static void b() {
        Method method;
        if (f16385c) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT == 28) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                f16383a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                f16384b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
            } else {
                f16383a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f16384b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            method = f16383a;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (method != null && f16384b != null) {
            method.setAccessible(true);
            f16384b.setAccessible(true);
            f16385c = true;
        }
    }
}
