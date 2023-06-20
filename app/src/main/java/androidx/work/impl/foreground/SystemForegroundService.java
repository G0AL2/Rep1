package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.s;
import androidx.work.impl.foreground.b;
import androidx.work.l;

/* loaded from: classes.dex */
public class SystemForegroundService extends s implements b.InterfaceC0085b {

    /* renamed from: f  reason: collision with root package name */
    private static final String f4560f = l.i("SystemFgService");

    /* renamed from: b  reason: collision with root package name */
    private Handler f4561b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4562c;

    /* renamed from: d  reason: collision with root package name */
    androidx.work.impl.foreground.b f4563d;

    /* renamed from: e  reason: collision with root package name */
    NotificationManager f4564e;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f4566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f4567c;

        a(int i10, Notification notification, int i11) {
            this.f4565a = i10;
            this.f4566b = notification;
            this.f4567c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                e.a(SystemForegroundService.this, this.f4565a, this.f4566b, this.f4567c);
            } else if (i10 >= 29) {
                d.a(SystemForegroundService.this, this.f4565a, this.f4566b, this.f4567c);
            } else {
                SystemForegroundService.this.startForeground(this.f4565a, this.f4566b);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f4570b;

        b(int i10, Notification notification) {
            this.f4569a = i10;
            this.f4570b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4564e.notify(this.f4569a, this.f4570b);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f4572a;

        c(int i10) {
            this.f4572a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4564e.cancel(this.f4572a);
        }
    }

    /* loaded from: classes.dex */
    static class d {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    /* loaded from: classes.dex */
    static class e {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                l.e().l(SystemForegroundService.f4560f, "Unable to start foreground service", e10);
            }
        }
    }

    private void f() {
        this.f4561b = new Handler(Looper.getMainLooper());
        this.f4564e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f4563d = bVar;
        bVar.n(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0085b
    public void a(int i10, Notification notification) {
        this.f4561b.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0085b
    public void c(int i10, int i11, Notification notification) {
        this.f4561b.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0085b
    public void d(int i10) {
        this.f4561b.post(new c(i10));
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4563d.l();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4562c) {
            l.e().f(f4560f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f4563d.l();
            f();
            this.f4562c = false;
        }
        if (intent != null) {
            this.f4563d.m(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0085b
    public void stop() {
        this.f4562c = true;
        l.e().a(f4560f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        stopSelf();
    }
}
