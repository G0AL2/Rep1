package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: RequestDeduplicator.java */
/* loaded from: classes3.dex */
public class o0 {

    /* renamed from: a */
    private final Executor f23526a;

    /* renamed from: b */
    private final Map<String, Task<String>> f23527b = new androidx.collection.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestDeduplicator.java */
    /* loaded from: classes3.dex */
    public interface a {
        Task<String> start();
    }

    public o0(Executor executor) {
        this.f23526a = executor;
    }

    public static /* synthetic */ Task a(o0 o0Var, String str, Task task) {
        return o0Var.c(str, task);
    }

    public /* synthetic */ Task c(String str, Task task) throws Exception {
        synchronized (this) {
            this.f23527b.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.f23527b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = aVar.start().continueWithTask(this.f23526a, new Continuation() { // from class: com.google.firebase.messaging.n0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return o0.a(o0.this, str, task2);
            }
        });
        this.f23527b.put(str, continueWithTask);
        return continueWithTask;
    }
}
