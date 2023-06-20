package com.bytedance.sdk.openadsdk.multipro;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.r;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: TTMultiInitHelper.java */
/* loaded from: classes.dex */
public class d {
    public static void a(Context context) {
        if (context == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.d.a.a(context.getApplicationContext());
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                if (r.a(context)) {
                    b(context);
                    return;
                }
                String b10 = r.b(context);
                try {
                    if (TextUtils.isEmpty(b10)) {
                        b10 = context.getPackageName() + Process.myPid();
                    }
                    WebView.setDataDirectorySuffix(b10);
                } catch (IllegalStateException unused) {
                    a(b10);
                } catch (Exception unused2) {
                }
            }
        } catch (Throwable th) {
            l.b(th.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.d.b(android.content.Context):void");
    }

    private static void a(String str) {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            Field field = (Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (TextUtils.isEmpty((String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (Throwable unused) {
        }
    }

    private static void a(File file) {
        a(file, file.exists() ? file.delete() : false);
    }

    private static void a(File file, boolean z10) {
        if (!z10 || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private static String a() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (String) ((Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
