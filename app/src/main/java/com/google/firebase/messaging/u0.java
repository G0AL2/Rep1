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
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SyncTask.java */
/* loaded from: classes3.dex */
public class u0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f23556a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f23557b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseMessaging f23558c;

    /* compiled from: SyncTask.java */
    @VisibleForTesting
    /* loaded from: classes3.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private u0 f23559a;

        public a(u0 u0Var) {
            this.f23559a = u0Var;
        }

        public void a() {
            if (u0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f23559a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            u0 u0Var = this.f23559a;
            if (u0Var != null && u0Var.d()) {
                if (u0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f23559a.f23558c.j(this.f23559a, 0L);
                this.f23559a.b().unregisterReceiver(this);
                this.f23559a = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public u0(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f23558c = firebaseMessaging;
        this.f23556a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f23557b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    Context b() {
        return this.f23558c.k();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    boolean e() throws IOException {
        try {
            if (this.f23558c.i() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e10) {
            if (b0.g(e10.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (q0.b().e(b())) {
            this.f23557b.acquire();
        }
        try {
            try {
                this.f23558c.A(true);
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                this.f23558c.A(false);
                if (!q0.b().e(b())) {
                    return;
                }
            }
            if (!this.f23558c.t()) {
                this.f23558c.A(false);
                if (q0.b().e(b())) {
                    this.f23557b.release();
                }
            } else if (q0.b().d(b()) && !d()) {
                new a(this).a();
                if (q0.b().e(b())) {
                    this.f23557b.release();
                }
            } else {
                if (e()) {
                    this.f23558c.A(false);
                } else {
                    this.f23558c.D(this.f23556a);
                }
                if (!q0.b().e(b())) {
                    return;
                }
                this.f23557b.release();
            }
        } catch (Throwable th) {
            if (q0.b().e(b())) {
                this.f23557b.release();
            }
            throw th;
        }
    }
}
