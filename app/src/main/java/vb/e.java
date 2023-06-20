package vb;

import android.content.Context;
import java.io.IOException;

/* compiled from: DevelopmentPlatformProvider.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f38039a;

    /* renamed from: b  reason: collision with root package name */
    private b f38040b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DevelopmentPlatformProvider.java */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f38041a;

        /* renamed from: b  reason: collision with root package name */
        private final String f38042b;

        private b(e eVar) {
            int q10 = yb.g.q(eVar.f38039a, "com.google.firebase.crashlytics.unity_version", "string");
            if (q10 == 0) {
                if (eVar.c("flutter_assets")) {
                    this.f38041a = "Flutter";
                    this.f38042b = null;
                    f.f().i("Development platform is: Flutter");
                    return;
                }
                this.f38041a = null;
                this.f38042b = null;
                return;
            }
            this.f38041a = "Unity";
            String string = eVar.f38039a.getResources().getString(q10);
            this.f38042b = string;
            f f10 = f.f();
            f10.i("Unity Editor version is: " + string);
        }
    }

    public e(Context context) {
        this.f38039a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        String[] list;
        try {
            if (this.f38039a.getAssets() == null || (list = this.f38039a.getAssets().list(str)) == null) {
                return false;
            }
            return list.length > 0;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f38040b == null) {
            this.f38040b = new b();
        }
        return this.f38040b;
    }

    public String d() {
        return f().f38041a;
    }

    public String e() {
        return f().f38042b;
    }
}
