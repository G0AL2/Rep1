package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AppInfo.java */
/* loaded from: classes3.dex */
public class ia {

    /* renamed from: e  reason: collision with root package name */
    private static final String f25731e = "ia";

    /* renamed from: a  reason: collision with root package name */
    public String f25732a;

    /* renamed from: b  reason: collision with root package name */
    public String f25733b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f25734c;

    /* renamed from: d  reason: collision with root package name */
    public byte f25735d;

    /* renamed from: f  reason: collision with root package name */
    private String f25736f;

    /* renamed from: g  reason: collision with root package name */
    private String f25737g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInfo.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final ia f25738a = new ia((byte) 0);
    }

    /* synthetic */ ia(byte b10) {
        this();
    }

    public static ia a() {
        return a.f25738a;
    }

    @SuppressLint({"NewApi"})
    private static byte b() {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? (byte) 0 : (byte) 1;
            }
            return (byte) 0;
        } catch (Exception unused) {
            return (byte) 2;
        }
    }

    private ia() {
        this.f25734c = new HashMap();
        Context c10 = ho.c();
        try {
            PackageManager packageManager = c10.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(c10.getPackageName(), 128);
            if (applicationInfo != null) {
                this.f25732a = applicationInfo.packageName;
                this.f25736f = applicationInfo.loadLabel(packageManager).toString();
                this.f25733b = packageManager.getInstallerPackageName(this.f25732a);
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(c10.getPackageName(), 128);
            String str = null;
            if (packageInfo != null && ((str = packageInfo.versionName) == null || "".equals(str))) {
                if (Build.VERSION.SDK_INT < 28) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(packageInfo.versionCode);
                    str = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(packageInfo.getLongVersionCode());
                    str = sb3.toString();
                }
            }
            if (str != null && !"".equals(str)) {
                this.f25737g = str;
            }
        } catch (Exception unused) {
        }
        this.f25735d = b();
        this.f25734c.put("u-appbid", this.f25732a);
        this.f25734c.put("u-appdnm", this.f25736f);
        this.f25734c.put("u-appver", this.f25737g);
        this.f25734c.put("u-appsecure", Byte.toString(this.f25735d));
    }
}
