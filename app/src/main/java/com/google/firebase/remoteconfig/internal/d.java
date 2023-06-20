package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ConfigCacheClient.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: d */
    private static final Map<String, d> f23637d = new HashMap();

    /* renamed from: e */
    private static final Executor f23638e = com.google.firebase.messaging.h.f23507a;

    /* renamed from: a */
    private final ExecutorService f23639a;

    /* renamed from: b */
    private final n f23640b;

    /* renamed from: c */
    private Task<e> f23641c = null;

    /* compiled from: ConfigCacheClient.java */
    /* loaded from: classes3.dex */
    public static class b<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a */
        private final CountDownLatch f23642a;

        private b() {
            this.f23642a = new CountDownLatch(1);
        }

        public boolean a(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f23642a.await(j10, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f23642a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f23642a.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(TResult tresult) {
            this.f23642a.countDown();
        }
    }

    private d(ExecutorService executorService, n nVar) {
        this.f23639a = executorService;
        this.f23640b = nVar;
    }

    public static /* synthetic */ Void a(d dVar, e eVar) {
        return dVar.i(eVar);
    }

    public static /* synthetic */ Task b(d dVar, boolean z10, e eVar, Void r32) {
        return dVar.j(z10, eVar, r32);
    }

    private static <TResult> TResult c(Task<TResult> task, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        b bVar = new b();
        Executor executor = f23638e;
        task.addOnSuccessListener(executor, bVar);
        task.addOnFailureListener(executor, bVar);
        task.addOnCanceledListener(executor, bVar);
        if (bVar.a(j10, timeUnit)) {
            if (task.isSuccessful()) {
                return task.getResult();
            }
            throw new ExecutionException(task.getException());
        }
        throw new TimeoutException("Task await timed out.");
    }

    public static synchronized d h(ExecutorService executorService, n nVar) {
        d dVar;
        synchronized (d.class) {
            String b10 = nVar.b();
            Map<String, d> map = f23637d;
            if (!map.containsKey(b10)) {
                map.put(b10, new d(executorService, nVar));
            }
            dVar = map.get(b10);
        }
        return dVar;
    }

    public /* synthetic */ Void i(e eVar) throws Exception {
        return this.f23640b.e(eVar);
    }

    public /* synthetic */ Task j(boolean z10, e eVar, Void r32) throws Exception {
        if (z10) {
            m(eVar);
        }
        return Tasks.forResult(eVar);
    }

    private synchronized void m(e eVar) {
        this.f23641c = Tasks.forResult(eVar);
    }

    public void d() {
        synchronized (this) {
            this.f23641c = Tasks.forResult(null);
        }
        this.f23640b.a();
    }

    public synchronized Task<e> e() {
        Task<e> task = this.f23641c;
        if (task == null || (task.isComplete() && !this.f23641c.isSuccessful())) {
            ExecutorService executorService = this.f23639a;
            final n nVar = this.f23640b;
            Objects.requireNonNull(nVar);
            this.f23641c = Tasks.call(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.internal.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return n.this.d();
                }
            });
        }
        return this.f23641c;
    }

    public e f() {
        return g(5L);
    }

    e g(long j10) {
        synchronized (this) {
            Task<e> task = this.f23641c;
            if (task != null && task.isSuccessful()) {
                return this.f23641c.getResult();
            }
            try {
                return (e) c(e(), j10, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e10);
                return null;
            }
        }
    }

    public Task<e> k(e eVar) {
        return l(eVar, true);
    }

    public Task<e> l(final e eVar, final boolean z10) {
        return Tasks.call(this.f23639a, new Callable() { // from class: com.google.firebase.remoteconfig.internal.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.a(d.this, eVar);
            }
        }).onSuccessTask(this.f23639a, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return d.b(d.this, z10, eVar, (Void) obj);
            }
        });
    }
}
