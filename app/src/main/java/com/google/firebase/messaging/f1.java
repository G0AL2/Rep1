package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.f1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes3.dex */
class f1 implements ServiceConnection {

    /* renamed from: a */
    private final Context f23491a;

    /* renamed from: b */
    private final Intent f23492b;

    /* renamed from: c */
    private final ScheduledExecutorService f23493c;

    /* renamed from: d */
    private final Queue<a> f23494d;

    /* renamed from: e */
    private c1 f23495e;

    /* renamed from: f */
    private boolean f23496f;

    /* compiled from: WithinAppServiceConnection.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        final Intent f23497a;

        /* renamed from: b */
        private final TaskCompletionSource<Void> f23498b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f23497a = intent;
        }

        public static /* synthetic */ void a(a aVar) {
            aVar.f();
        }

        public static /* synthetic */ void b(ScheduledFuture scheduledFuture, Task task) {
            scheduledFuture.cancel(false);
        }

        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f23497a.getAction() + " App may get closed.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.e1
                @Override // java.lang.Runnable
                public final void run() {
                    f1.a.a(f1.a.this);
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.d1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    f1.a.b(schedule, task);
                }
            });
        }

        public void d() {
            this.f23498b.trySetResult(null);
        }

        Task<Void> e() {
            return this.f23498b.getTask();
        }
    }

    public f1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f23494d.isEmpty()) {
            this.f23494d.poll().d();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f23494d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            c1 c1Var = this.f23495e;
            if (c1Var != null && c1Var.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f23495e.c(this.f23494d.poll());
            } else {
                d();
                return;
            }
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f23496f);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f23496f) {
            return;
        }
        this.f23496f = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (ConnectionTracker.getInstance().bindService(this.f23491a, this.f23492b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f23496f = false;
        a();
    }

    public synchronized Task<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.c(this.f23493c);
        this.f23494d.add(aVar);
        b();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f23496f = false;
        if (!(iBinder instanceof c1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
            return;
        }
        this.f23495e = (c1) iBinder;
        b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    f1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f23494d = new ArrayDeque();
        this.f23496f = false;
        Context applicationContext = context.getApplicationContext();
        this.f23491a = applicationContext;
        this.f23492b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f23493c = scheduledExecutorService;
    }
}
