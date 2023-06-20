package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsSyncTask.java */
/* loaded from: classes3.dex */
public class z0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f23587f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f23588g;

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f23589h;

    /* renamed from: a  reason: collision with root package name */
    private final Context f23590a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f23591b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f23592c;

    /* renamed from: d  reason: collision with root package name */
    private final y0 f23593d;

    /* renamed from: e  reason: collision with root package name */
    private final long f23594e;

    /* compiled from: TopicsSyncTask.java */
    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private z0 f23595a;

        public a(z0 z0Var) {
            this.f23595a = z0Var;
        }

        public void a() {
            if (z0.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            z0.this.f23590a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            z0 z0Var = this.f23595a;
            if (z0Var == null) {
                return;
            }
            if (z0Var.i()) {
                if (z0.b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f23595a.f23593d.l(this.f23595a, 0L);
                context.unregisterReceiver(this);
                this.f23595a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z0(y0 y0Var, Context context, g0 g0Var, long j10) {
        this.f23593d = y0Var;
        this.f23590a = context;
        this.f23594e = j10;
        this.f23591b = g0Var;
        this.f23592c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static /* synthetic */ boolean b() {
        return j();
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f23587f) {
            Boolean bool = f23589h;
            if (bool == null) {
                booleanValue = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f23589h = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f23587f) {
            Boolean bool = f23588g;
            if (bool == null) {
                booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f23588g = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z10;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f23590a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z10 = activeNetworkInfo.isConnected();
        }
        return z10;
    }

    private static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f23590a)) {
            this.f23592c.acquire(d.f23479a);
        }
        try {
            try {
                try {
                    this.f23593d.m(true);
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    this.f23593d.m(false);
                    if (!h(this.f23590a)) {
                        return;
                    }
                    wakeLock = this.f23592c;
                }
                if (!this.f23591b.g()) {
                    this.f23593d.m(false);
                    if (h(this.f23590a)) {
                        try {
                            this.f23592c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (f(this.f23590a) && !i()) {
                    new a(this).a();
                    if (h(this.f23590a)) {
                        try {
                            this.f23592c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    if (this.f23593d.p()) {
                        this.f23593d.m(false);
                    } else {
                        this.f23593d.q(this.f23594e);
                    }
                    if (h(this.f23590a)) {
                        wakeLock = this.f23592c;
                        wakeLock.release();
                    }
                }
            } catch (Throwable th) {
                if (h(this.f23590a)) {
                    try {
                        this.f23592c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
