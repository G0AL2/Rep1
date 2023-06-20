package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsSubscriber.java */
/* loaded from: classes3.dex */
public class y0 {

    /* renamed from: i  reason: collision with root package name */
    private static final long f23577i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final Context f23578a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f23579b;

    /* renamed from: c  reason: collision with root package name */
    private final b0 f23580c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f23581d;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f23583f;

    /* renamed from: h  reason: collision with root package name */
    private final w0 f23585h;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f23582e = new androidx.collection.a();

    /* renamed from: g  reason: collision with root package name */
    private boolean f23584g = false;

    private y0(FirebaseMessaging firebaseMessaging, g0 g0Var, w0 w0Var, b0 b0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f23581d = firebaseMessaging;
        this.f23579b = g0Var;
        this.f23585h = w0Var;
        this.f23580c = b0Var;
        this.f23578a = context;
        this.f23583f = scheduledExecutorService;
    }

    private static <T> void b(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE, e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException(InstanceID.ERROR_SERVICE_NOT_AVAILABLE, e);
        }
    }

    private void c(String str) throws IOException {
        b(this.f23580c.k(this.f23581d.i(), str));
    }

    private void d(String str) throws IOException {
        b(this.f23580c.l(this.f23581d.i(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Task<y0> e(final FirebaseMessaging firebaseMessaging, final g0 g0Var, final b0 b0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y0 i10;
                i10 = y0.i(context, scheduledExecutorService, firebaseMessaging, g0Var, b0Var);
                return i10;
            }
        });
    }

    static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y0 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, g0 g0Var, b0 b0Var) throws Exception {
        return new y0(firebaseMessaging, g0Var, w0.a(context, scheduledExecutorService), b0Var, context, scheduledExecutorService);
    }

    private void j(v0 v0Var) {
        synchronized (this.f23582e) {
            String e10 = v0Var.e();
            if (this.f23582e.containsKey(e10)) {
                ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f23582e.get(e10);
                TaskCompletionSource<Void> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f23582e.remove(e10);
                }
            }
        }
    }

    private void n() {
        if (h()) {
            return;
        }
        q(0L);
    }

    boolean f() {
        return this.f23585h.b() != null;
    }

    synchronized boolean h() {
        return this.f23584g;
    }

    boolean k(v0 v0Var) throws IOException {
        try {
            String b10 = v0Var.b();
            char c10 = 65535;
            int hashCode = b10.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85 && b10.equals("U")) {
                    c10 = 1;
                }
            } else if (b10.equals("S")) {
                c10 = 0;
            }
            if (c10 == 0) {
                c(v0Var.c());
                if (g()) {
                    Log.d("FirebaseMessaging", "Subscribe to topic: " + v0Var.c() + " succeeded.");
                }
            } else if (c10 != 1) {
                if (g()) {
                    Log.d("FirebaseMessaging", "Unknown topic operation" + v0Var + ".");
                }
            } else {
                d(v0Var.c());
                if (g()) {
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + v0Var.c() + " succeeded.");
                }
            }
            return true;
        } catch (IOException e10) {
            if (!InstanceID.ERROR_SERVICE_NOT_AVAILABLE.equals(e10.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e10.getMessage())) {
                if (e10.getMessage() == null) {
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                throw e10;
            }
            Log.e("FirebaseMessaging", "Topic operation failed: " + e10.getMessage() + ". Will retry Topic operation.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Runnable runnable, long j10) {
        this.f23583f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void m(boolean z10) {
        this.f23584g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        if (f()) {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (g() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.w0 r0 = r2.f23585h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.v0 r0 = r0.b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = g()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            r0 = 1
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.w0 r1 = r2.f23585h
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y0.p():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(long j10) {
        l(new z0(this, this.f23578a, this.f23579b, Math.min(Math.max(30L, 2 * j10), f23577i)), j10);
        m(true);
    }
}
