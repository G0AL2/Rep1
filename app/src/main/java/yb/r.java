package yb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* compiled from: DataCollectionArbiter.java */
/* loaded from: classes3.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f39482a;

    /* renamed from: b  reason: collision with root package name */
    private final ob.e f39483b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f39484c;

    /* renamed from: d  reason: collision with root package name */
    TaskCompletionSource<Void> f39485d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f39486e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f39487f;

    /* renamed from: g  reason: collision with root package name */
    private final TaskCompletionSource<Void> f39488g;

    public r(ob.e eVar) {
        Object obj = new Object();
        this.f39484c = obj;
        this.f39485d = new TaskCompletionSource<>();
        this.f39486e = false;
        this.f39488g = new TaskCompletionSource<>();
        Context l10 = eVar.l();
        this.f39483b = eVar;
        this.f39482a = g.r(l10);
        Boolean b10 = b();
        this.f39487f = b10 == null ? a(l10) : b10;
        synchronized (obj) {
            if (d()) {
                this.f39485d.trySetResult(null);
            }
        }
    }

    private Boolean a(Context context) {
        Boolean f10 = f(context);
        if (f10 == null) {
            this.f39486e = false;
            return null;
        }
        this.f39486e = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f10));
    }

    private Boolean b() {
        if (this.f39482a.contains("firebase_crashlytics_collection_enabled")) {
            this.f39486e = false;
            return Boolean.valueOf(this.f39482a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    private void e(boolean z10) {
        String str;
        String str2 = z10 ? "ENABLED" : "DISABLED";
        if (this.f39487f == null) {
            str = "global Firebase setting";
        } else {
            str = this.f39486e ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        vb.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    private static Boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            vb.f.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    public void c(boolean z10) {
        if (z10) {
            this.f39488g.trySetResult(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean w10;
        Boolean bool = this.f39487f;
        if (bool != null) {
            w10 = bool.booleanValue();
        } else {
            w10 = this.f39483b.w();
        }
        e(w10);
        return w10;
    }

    public Task<Void> g() {
        Task<Void> task;
        synchronized (this.f39484c) {
            task = this.f39485d.getTask();
        }
        return task;
    }

    public Task<Void> h(Executor executor) {
        return h0.j(executor, this.f39488g.getTask(), g());
    }
}
