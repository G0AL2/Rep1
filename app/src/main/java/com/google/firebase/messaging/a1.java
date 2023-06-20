package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* compiled from: WakeLockHolder.java */
/* loaded from: classes3.dex */
final class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f23460a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f23461b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static WakeLock f23462c;

    private static void a(Context context) {
        if (f23462c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f23462c = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Intent intent) {
        synchronized (f23461b) {
            if (f23462c != null && c(intent)) {
                d(intent, false);
                f23462c.release();
            }
        }
    }

    static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void d(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName e(Context context, Intent intent) {
        synchronized (f23461b) {
            a(context);
            boolean c10 = c(intent);
            d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c10) {
                f23462c.acquire(f23460a);
            }
            return startService;
        }
    }
}
