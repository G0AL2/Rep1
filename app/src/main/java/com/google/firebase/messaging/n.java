package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: FcmBroadcastProcessor.java */
@KeepForSdk
/* loaded from: classes3.dex */
public class n {

    /* renamed from: c */
    private static final Object f23520c = new Object();

    /* renamed from: d */
    private static f1 f23521d;

    /* renamed from: a */
    private final Context f23522a;

    /* renamed from: b */
    private final Executor f23523b = h.f23507a;

    public n(Context context) {
        this.f23522a = context;
    }

    public static /* synthetic */ Integer a(Context context, Intent intent) {
        return h(context, intent);
    }

    public static /* synthetic */ Integer b(Task task) {
        return g(task);
    }

    public static /* synthetic */ Integer c(Task task) {
        return i(task);
    }

    public static /* synthetic */ Task d(Context context, Intent intent, Task task) {
        return j(context, intent, task);
    }

    private static Task<Integer> e(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return f(context, "com.google.firebase.MESSAGING_EVENT").c(intent).continueWith(h.f23507a, new Continuation() { // from class: com.google.firebase.messaging.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return n.b(task);
            }
        });
    }

    private static f1 f(Context context, String str) {
        f1 f1Var;
        synchronized (f23520c) {
            if (f23521d == null) {
                f23521d = new f1(context, str);
            }
            f1Var = f23521d;
        }
        return f1Var;
    }

    public static /* synthetic */ Integer g(Task task) throws Exception {
        return -1;
    }

    public static /* synthetic */ Integer h(Context context, Intent intent) throws Exception {
        return Integer.valueOf(q0.b().g(context, intent));
    }

    public static /* synthetic */ Integer i(Task task) throws Exception {
        return Integer.valueOf((int) TTAdConstant.DEEPLINK_UNAVAILABLE_CODE);
    }

    public static /* synthetic */ Task j(Context context, Intent intent, Task task) throws Exception {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent).continueWith(h.f23507a, new Continuation() { // from class: com.google.firebase.messaging.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return n.c(task2);
            }
        }) : task;
    }

    @KeepForSdk
    public Task<Integer> k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f23522a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> l(final Context context, final Intent intent) {
        boolean z10 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        if (z10 && !z11) {
            return e(context, intent);
        }
        return Tasks.call(this.f23523b, new Callable() { // from class: com.google.firebase.messaging.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n.a(context, intent);
            }
        }).continueWithTask(this.f23523b, new Continuation() { // from class: com.google.firebase.messaging.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return n.d(context, intent, task);
            }
        });
    }
}
