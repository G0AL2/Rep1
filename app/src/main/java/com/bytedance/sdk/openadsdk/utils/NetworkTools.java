package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class NetworkTools {

    /* renamed from: a  reason: collision with root package name */
    private static int f13536a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static long f13537b = -2147483648L;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f13538c = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    public static class NetworkReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkTools.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        if (f13538c.compareAndSet(false, true)) {
            t.a(new com.bytedance.sdk.component.f.g("getNetworkType") { // from class: com.bytedance.sdk.openadsdk.utils.NetworkTools.1
                @Override // java.lang.Runnable
                public void run() {
                    NetworkTools.e(com.bytedance.sdk.openadsdk.core.m.a());
                    NetworkTools.f13538c.set(false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context) {
        f13536a = com.bytedance.sdk.component.utils.o.c(context);
        f13537b = System.currentTimeMillis();
    }

    public static int a(Context context, boolean z10) {
        if (!z10 && f13537b != -2147483648L) {
            if (System.currentTimeMillis() - f13537b >= 60000) {
                c();
            }
            return f13536a;
        }
        e(context);
        return f13536a;
    }

    public static int b(Context context) {
        int a10 = a(context);
        if (a10 != 1) {
            if (a10 != 4) {
                if (a10 != 5) {
                    if (a10 != 6) {
                        return a10;
                    }
                    return 5;
                }
                return 4;
            }
            return 1;
        }
        return 0;
    }

    public static void c(Context context) {
        if (context == null) {
            try {
                context = com.bytedance.sdk.openadsdk.core.m.a();
            } catch (Throwable unused) {
                return;
            }
        }
        context.registerReceiver(new NetworkReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public static int a(Context context) {
        return a(context, false);
    }
}
