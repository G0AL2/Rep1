package yc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import pc.c;

/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f39514a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f39515b;

    /* renamed from: c  reason: collision with root package name */
    private final c f39516c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39517d;

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f39514a = a10;
        this.f39515b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f39516c = cVar;
        this.f39517d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.b.b(context);
    }

    private boolean c() {
        if (this.f39515b.contains("firebase_data_collection_default_enabled")) {
            return this.f39515b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f39514a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f39514a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f39517d != z10) {
            this.f39517d = z10;
            this.f39516c.b(new pc.a<>(ob.a.class, new ob.a(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f39517d;
    }

    public synchronized void e(Boolean bool) {
        if (bool == null) {
            this.f39515b.edit().remove("firebase_data_collection_default_enabled").apply();
            f(d());
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.f39515b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
            f(equals);
        }
    }
}
