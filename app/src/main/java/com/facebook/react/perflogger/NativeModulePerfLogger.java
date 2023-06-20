package com.facebook.react.perflogger;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

/* loaded from: classes.dex */
public abstract class NativeModulePerfLogger {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f15713a;

    protected NativeModulePerfLogger() {
        b();
        c();
        a();
    }

    private static synchronized void c() {
        synchronized (NativeModulePerfLogger.class) {
            if (!f15713a) {
                SoLoader.p("reactperfloggerjni");
                f15713a = true;
            }
        }
    }

    protected abstract HybridData a();

    protected synchronized void b() {
    }

    public abstract void d(String str, int i10);

    public abstract void e(String str, int i10);

    public abstract void f(String str, int i10);

    public abstract void g(String str, int i10);

    public abstract void h(String str, int i10);

    public abstract void i(String str, int i10);

    public abstract void j(String str, int i10);

    public abstract void k(String str, int i10);

    public abstract void l(String str, int i10);

    public abstract void m(String str, int i10);
}
