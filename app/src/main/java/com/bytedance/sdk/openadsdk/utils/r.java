package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.component.utils.w;
import com.bytedance.sdk.openadsdk.AdSlot;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.reflect.Method;

/* compiled from: TTCrashHandler.java */
/* loaded from: classes.dex */
public class r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f13594a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: b  reason: collision with root package name */
    private String f13595b;

    private r() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        b();
    }

    public static r a() {
        return new r();
    }

    private void b() {
        Context a10 = com.bytedance.sdk.openadsdk.core.m.a();
        if (a10 == null) {
            return;
        }
        try {
            File file = new File(a10.getFilesDir(), "TTCache");
            file.mkdirs();
            this.f13595b = file.getPath();
        } catch (Throwable unused) {
        }
    }

    private void c() {
        try {
            Method a10 = w.a("com.bytedance.sdk.openadsdk.TTC2Proxy", "a", Context.class);
            if (a10 != null) {
                a10.invoke(null, com.bytedance.sdk.openadsdk.core.m.a());
            }
        } catch (Throwable unused) {
        }
        try {
            Method a11 = w.a("com.bytedance.sdk.openadsdk.TTC3Proxy", "a", Context.class);
            if (a11 != null) {
                a11.invoke(null, com.bytedance.sdk.openadsdk.core.m.a());
            }
        } catch (Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.i.d.a();
        } catch (Throwable unused3) {
        }
        try {
            com.bytedance.sdk.component.adexpress.a.b.a.b();
        } catch (Throwable unused4) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        boolean z10 = false;
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            if (stringWriter2 != null) {
                z10 = stringWriter2.contains(AdSlot.class.getPackage().getName());
            }
        } catch (Throwable unused) {
        }
        if (z10) {
            a(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13594a;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Properties] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.Thread r19, java.lang.Throwable r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.r.a(java.lang.Thread, java.lang.Throwable):void");
    }
}
