package com.ironsource.environment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class ContextProvider {

    /* renamed from: e  reason: collision with root package name */
    private static volatile ContextProvider f26098e;

    /* renamed from: a  reason: collision with root package name */
    private Activity f26099a;

    /* renamed from: b  reason: collision with root package name */
    private Context f26100b;

    /* renamed from: d  reason: collision with root package name */
    private Handler f26102d = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f26101c = new ConcurrentHashMap<>();

    /* loaded from: classes3.dex */
    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f26098e == null) {
            synchronized (ContextProvider.class) {
                if (f26098e == null) {
                    f26098e = new ContextProvider();
                }
            }
        }
        return f26098e;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f26100b;
        return (context != null || (activity = this.f26099a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        return this.f26099a;
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            for (a aVar : this.f26101c.values()) {
                aVar.onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f26099a = activity;
            for (a aVar : this.f26101c.values()) {
                aVar.onResume(this.f26099a);
            }
        }
    }

    @Deprecated
    public void postOnUIThread(Runnable runnable) {
        Handler handler = this.f26102d;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f26101c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f26099a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f26100b = context;
        }
    }
}
