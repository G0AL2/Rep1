package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: ServiceStarter.java */
@KeepForSdk
/* loaded from: classes3.dex */
public class q0 {

    /* renamed from: e  reason: collision with root package name */
    private static q0 f23531e;

    /* renamed from: a  reason: collision with root package name */
    private String f23532a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f23533b = null;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f23534c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Intent> f23535d = new ArrayDeque();

    private q0() {
    }

    private int a(Context context, Intent intent) {
        ComponentName startService;
        String f10 = f(context, intent);
        if (f10 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f10);
            }
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if (e(context)) {
                startService = a1.e(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return TTAdConstant.DEEPLINK_FALLBACK_CODE;
            }
            return -1;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return TTAdConstant.AD_ID_IS_NULL_CODE;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return TTAdConstant.MATE_IS_NULL_CODE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized q0 b() {
        q0 q0Var;
        synchronized (q0.class) {
            if (f23531e == null) {
                f23531e = new q0();
            }
            q0Var = f23531e;
        }
        return q0Var;
    }

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f23532a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    this.f23532a = context.getPackageName() + serviceInfo.name;
                } else {
                    this.f23532a = serviceInfo.name;
                }
                return this.f23532a;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Intent c() {
        return this.f23535d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Context context) {
        if (this.f23534c == null) {
            this.f23534c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f23533b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f23534c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(Context context) {
        if (this.f23533b == null) {
            this.f23533b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f23533b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f23533b.booleanValue();
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f23535d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
