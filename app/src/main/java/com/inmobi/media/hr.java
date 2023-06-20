package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: ApplicationFocusChangeObserver.java */
/* loaded from: classes3.dex */
public class hr {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25695a = "hr";

    /* renamed from: b  reason: collision with root package name */
    private static HashSet<c> f25696b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f25697c = false;

    /* compiled from: ApplicationFocusChangeObserver.java */
    /* loaded from: classes3.dex */
    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        boolean f25701a;

        a(Looper looper) {
            super(looper);
            this.f25701a = true;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (hr.f25697c) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1001 && this.f25701a) {
                this.f25701a = false;
                hr.a(false);
                String unused = hr.f25695a;
            } else if (i10 != 1002 || this.f25701a) {
            } else {
                this.f25701a = true;
                hr.a(true);
                String unused2 = hr.f25695a;
            }
        }
    }

    /* compiled from: ApplicationFocusChangeObserver.java */
    /* loaded from: classes3.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        static final hr f25702a = new hr((byte) 0);
    }

    /* compiled from: ApplicationFocusChangeObserver.java */
    /* loaded from: classes3.dex */
    public interface c {
        void a(boolean z10);
    }

    /* synthetic */ hr(byte b10) {
        this();
    }

    public static hr a() {
        return b.f25702a;
    }

    public static void b() {
        f25697c = true;
    }

    public static void c() {
        f25697c = false;
    }

    private hr() {
    }

    public void a(Context context, c cVar) {
        if (f25696b == null) {
            f25696b = new LinkedHashSet();
            Application application = (Application) context.getApplicationContext();
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.inmobi.media.hr.1

                        /* renamed from: b  reason: collision with root package name */
                        private final Handler f25699b = new a(Looper.getMainLooper());

                        /* renamed from: c  reason: collision with root package name */
                        private WeakReference<Activity> f25700c;

                        private void a(Activity activity) {
                            WeakReference<Activity> weakReference = this.f25700c;
                            if (weakReference == null || weakReference.get() != activity) {
                                this.f25700c = new WeakReference<>(activity);
                            }
                            this.f25699b.removeMessages(1001);
                            this.f25699b.sendEmptyMessage(1002);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityDestroyed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityPaused(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityResumed(Activity activity) {
                            a(activity);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStarted(Activity activity) {
                            a(activity);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStopped(Activity activity) {
                            WeakReference<Activity> weakReference = this.f25700c;
                            if (weakReference == null || weakReference.get() == activity) {
                                this.f25699b.sendEmptyMessageDelayed(1001, 3000L);
                            }
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }
        f25696b.add(cVar);
    }

    static /* synthetic */ void a(boolean z10) {
        if (ho.c() == null) {
            return;
        }
        Iterator<c> it = f25696b.iterator();
        while (it.hasNext()) {
            try {
                it.next().a(z10);
            } catch (Exception unused) {
            }
        }
    }
}
