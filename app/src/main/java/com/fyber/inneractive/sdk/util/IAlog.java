package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.logger.FMPLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class IAlog {

    /* renamed from: a  reason: collision with root package name */
    public static int f20222a = 4;

    /* renamed from: b  reason: collision with root package name */
    public static final com.fyber.inneractive.sdk.logger.a f20223b = new com.fyber.inneractive.sdk.logger.a();

    /* renamed from: c  reason: collision with root package name */
    public static final List<FMPLogger> f20224c = new a();

    /* loaded from: classes2.dex */
    public class a extends CopyOnWriteArrayList<FMPLogger> {
        public a() {
            add(IAlog.f20223b);
        }
    }

    public static void b(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f20224c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, null, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f20224c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).info(str, objArr);
        }
    }

    public static void d(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f20224c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).verbose(str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f20224c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).warning(str, objArr);
        }
    }

    public static void a(String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f20224c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).debug(str, objArr);
        }
    }

    public static void a(String str, Throwable th, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f20224c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).error(str, th, objArr);
        }
    }

    public static void a(int i10, Exception exc, String str, Object... objArr) {
        Iterator it = ((CopyOnWriteArrayList) f20224c).iterator();
        while (it.hasNext()) {
            ((FMPLogger) it.next()).log(i10, null, str, objArr);
        }
    }

    public static String a(Object obj) {
        return "(" + Thread.currentThread().getName() + "): " + obj.getClass().getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(obj)) + "] ";
    }

    public static String a(Class<?> cls) {
        return "(" + Thread.currentThread().getName() + "): " + cls.getSimpleName() + "[" + Integer.toHexString(System.identityHashCode(cls)) + "] ";
    }
}
