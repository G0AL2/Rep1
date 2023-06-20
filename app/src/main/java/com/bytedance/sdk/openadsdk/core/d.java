package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AppEnvironment.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f11995a;

    /* renamed from: b  reason: collision with root package name */
    private long f11996b = com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sp_app_env", "last_app_env_time", 0L);

    /* renamed from: c  reason: collision with root package name */
    private boolean f11997c = false;

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            Context a10 = m.a();
            if (a10 == null) {
                return null;
            }
            PackageInfo packageInfo = a10.getPackageManager().getPackageInfo(a10.getPackageName(), 4111);
            ApplicationInfo applicationInfo = a10.getApplicationInfo();
            if (applicationInfo != null) {
                jSONObject.put("application_name", applicationInfo.name);
            }
            if (packageInfo != null) {
                ActivityInfo[] activityInfoArr = packageInfo.activities;
                ActivityInfo[] activityInfoArr2 = packageInfo.receivers;
                ServiceInfo[] serviceInfoArr = packageInfo.services;
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                String[] strArr = packageInfo.requestedPermissions;
                if (activityInfoArr != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        jSONArray.put(activityInfo.name);
                    }
                    jSONObject.put("activities", jSONArray);
                }
                if (activityInfoArr2 != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (ActivityInfo activityInfo2 : activityInfoArr2) {
                        jSONArray2.put(activityInfo2.name);
                    }
                    jSONObject.put("receivers", jSONArray2);
                }
                if (serviceInfoArr != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    for (ServiceInfo serviceInfo : serviceInfoArr) {
                        jSONArray3.put(serviceInfo.name);
                    }
                    jSONObject.put("services", jSONArray3);
                }
                if (providerInfoArr != null) {
                    JSONArray jSONArray4 = new JSONArray();
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        jSONArray4.put(providerInfo.name);
                    }
                    jSONObject.put("providers", jSONArray4);
                }
                if (strArr != null) {
                    JSONArray jSONArray5 = new JSONArray();
                    for (String str : strArr) {
                        jSONArray5.put(str);
                    }
                    jSONObject.put("permissions", jSONArray5);
                }
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void b() {
        if (this.f11997c || com.bytedance.sdk.openadsdk.utils.u.a(this.f11996b, System.currentTimeMillis())) {
            return;
        }
        this.f11997c = true;
        com.bytedance.sdk.component.f.e.a(new com.bytedance.sdk.component.f.g("trySendAppManifestInfo") { // from class: com.bytedance.sdk.openadsdk.core.d.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject c10 = d.this.c();
                if (c10 != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    d.this.f11996b = currentTimeMillis;
                    com.bytedance.sdk.openadsdk.multipro.d.a.a("tt_sp_app_env", "last_app_env_time", Long.valueOf(currentTimeMillis));
                    com.bytedance.sdk.openadsdk.h.b.a().a(c10);
                }
                d.this.f11997c = false;
            }
        }, 1);
    }

    public static d a() {
        if (f11995a == null) {
            synchronized (d.class) {
                if (f11995a == null) {
                    f11995a = new d();
                }
            }
        }
        return f11995a;
    }
}
