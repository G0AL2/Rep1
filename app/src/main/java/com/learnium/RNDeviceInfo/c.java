package com.learnium.RNDeviceInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: RNInstallReferrerClient.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static Class<?> f28275d;

    /* renamed from: e  reason: collision with root package name */
    private static Class<?> f28276e;

    /* renamed from: f  reason: collision with root package name */
    private static Class<?> f28277f;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f28278a;

    /* renamed from: b  reason: collision with root package name */
    private Object f28279b;

    /* renamed from: c  reason: collision with root package name */
    private Object f28280c;

    /* compiled from: RNInstallReferrerClient.java */
    /* loaded from: classes3.dex */
    private class b implements InvocationHandler {
        private b() {
        }

        public void a() {
            Log.d("RNInstallReferrerClient", "InstallReferrerService disconnected");
        }

        public void b(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    Log.d("InstallReferrerState", "SERVICE_UNAVAILABLE");
                    return;
                } else if (i10 != 2) {
                    return;
                } else {
                    Log.d("InstallReferrerState", "FEATURE_NOT_SUPPORTED");
                    return;
                }
            }
            try {
                Log.d("InstallReferrerState", "OK");
                Object invoke = c.f28275d.getMethod("getInstallReferrer", new Class[0]).invoke(c.this.f28279b, new Object[0]);
                SharedPreferences.Editor edit = c.this.f28278a.edit();
                edit.putString("installReferrer", (String) c.f28277f.getMethod("getInstallReferrer", new Class[0]).invoke(invoke, new Object[0]));
                edit.apply();
                c.f28275d.getMethod("endConnection", new Class[0]).invoke(c.this.f28279b, new Object[0]);
            } catch (Exception e10) {
                PrintStream printStream = System.err;
                printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
                e10.printStackTrace(System.err);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                if (name.equals("onInstallReferrerSetupFinished") && objArr != null && (objArr[0] instanceof Integer)) {
                    b(((Integer) objArr[0]).intValue());
                    return null;
                } else if (name.equals("onInstallReferrerServiceDisconnected")) {
                    a();
                    return null;
                } else {
                    return null;
                }
            } catch (Exception e10) {
                throw new RuntimeException("unexpected invocation exception: " + e10.getMessage());
            }
        }
    }

    static {
        try {
            f28275d = p2.a.class;
            f28276e = p2.b.class;
            f28277f = p2.c.class;
        } catch (Exception unused) {
            System.err.println("RNInstallReferrerClient exception. 'installreferrer' APIs are unavailable.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f28278a = context.getSharedPreferences("react-native-device-info", 0);
        Class<?> cls = f28275d;
        if (cls == null || f28276e == null || f28277f == null) {
            return;
        }
        try {
            Object invoke = cls.getMethod("newBuilder", Context.class).invoke(null, context);
            this.f28279b = invoke.getClass().getMethod("build", new Class[0]).invoke(invoke, new Object[0]);
            this.f28280c = Proxy.newProxyInstance(f28276e.getClassLoader(), new Class[]{f28276e}, new b());
            f28275d.getMethod("startConnection", f28276e).invoke(this.f28279b, this.f28280c);
        } catch (Exception e10) {
            PrintStream printStream = System.err;
            printStream.println("RNInstallReferrerClient exception. getInstallReferrer will be unavailable: " + e10.getMessage());
            e10.printStackTrace(System.err);
        }
    }
}
