package com.inmobi.media;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PicassoWrapper.java */
/* loaded from: classes3.dex */
public class di {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25107a = "di";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static volatile Picasso f25108b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f25109c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static List<WeakReference<Context>> f25110d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f25111e = new Application.ActivityLifecycleCallbacks() { // from class: com.inmobi.media.di.1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            synchronized (di.f25109c) {
                if (di.f25108b != null && di.c(activity)) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(di.f25111e);
                    di.f25110d.remove(activity);
                    if (di.f25110d.isEmpty()) {
                        String unused = di.f25107a;
                        Picasso unused2 = di.f25108b;
                        di.f25108b.shutdown();
                        di.f();
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };

    static /* synthetic */ Picasso f() {
        f25108b = null;
        return null;
    }

    public static Picasso a(Context context) {
        synchronized (f25109c) {
            if (!c(context)) {
                f25110d.add(new WeakReference<>(context));
            }
            if (f25108b == null) {
                f25108b = new Picasso.Builder(context).build();
                ho.a(context, f25111e);
            }
        }
        return f25108b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Context context) {
        for (int i10 = 0; i10 < f25110d.size(); i10++) {
            Context context2 = f25110d.get(i10).get();
            if (context2 != null && context2.equals(context)) {
                return true;
            }
        }
        return false;
    }

    public static Object a(InvocationHandler invocationHandler) {
        try {
            return Proxy.newProxyInstance(Callback.class.getClassLoader(), new Class[]{Callback.class}, invocationHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
