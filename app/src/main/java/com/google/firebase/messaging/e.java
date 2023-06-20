package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.i;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: DisplayNotification.java */
/* loaded from: classes3.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f23484a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f23485b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f23486c;

    public e(Context context, h0 h0Var, ExecutorService executorService) {
        this.f23484a = executorService;
        this.f23485b = context;
        this.f23486c = h0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f23485b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f23485b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
            return false;
        }
        return false;
    }

    private void c(c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f23485b.getSystemService("notification")).notify(aVar.f23474b, aVar.f23475c, aVar.f23473a.b());
    }

    private d0 d() {
        d0 e10 = d0.e(this.f23486c.p("gcm.n.image"));
        if (e10 != null) {
            e10.q(this.f23484a);
        }
        return e10;
    }

    private void e(i.e eVar, d0 d0Var) {
        if (d0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(d0Var.h(), 5L, TimeUnit.SECONDS);
            eVar.p(bitmap);
            eVar.z(new i.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            d0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            d0Var.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f23486c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        d0 d10 = d();
        c.a f10 = c.f(this.f23485b, this.f23486c);
        e(f10.f23473a, d10);
        c(f10);
        return true;
    }
}
