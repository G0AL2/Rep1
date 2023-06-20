package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsStore.java */
/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference<w0> f23567d;

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f23568a;

    /* renamed from: b  reason: collision with root package name */
    private s0 f23569b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f23570c;

    private w0(SharedPreferences sharedPreferences, Executor executor) {
        this.f23570c = executor;
        this.f23568a = sharedPreferences;
    }

    public static synchronized w0 a(Context context, Executor executor) {
        w0 w0Var;
        synchronized (w0.class) {
            WeakReference<w0> weakReference = f23567d;
            w0Var = weakReference != null ? weakReference.get() : null;
            if (w0Var == null) {
                w0Var = new w0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                w0Var.c();
                f23567d = new WeakReference<>(w0Var);
            }
        }
        return w0Var;
    }

    private synchronized void c() {
        this.f23569b = s0.c(this.f23568a, "topic_operation_queue", ",", this.f23570c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized v0 b() {
        return v0.a(this.f23569b.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean d(v0 v0Var) {
        return this.f23569b.f(v0Var.e());
    }
}
