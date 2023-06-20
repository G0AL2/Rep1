package r2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import android.os.Build;
import java.io.File;
import r2.e;

/* compiled from: Volley.java */
/* loaded from: classes.dex */
public class q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Volley.java */
    /* loaded from: classes.dex */
    public class a implements e.c {

        /* renamed from: a  reason: collision with root package name */
        private File f36164a = null;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f36165b;

        a(Context context) {
            this.f36165b = context;
        }

        @Override // r2.e.c
        public File get() {
            if (this.f36164a == null) {
                this.f36164a = new File(this.f36165b.getCacheDir(), "volley");
            }
            return this.f36164a;
        }
    }

    public static q2.o a(Context context) {
        return c(context, null);
    }

    private static q2.o b(Context context, q2.h hVar) {
        q2.o oVar = new q2.o(new e(new a(context.getApplicationContext())), hVar);
        oVar.g();
        return oVar;
    }

    public static q2.o c(Context context, b bVar) {
        c cVar;
        c cVar2;
        String str;
        if (bVar == null) {
            if (Build.VERSION.SDK_INT >= 9) {
                cVar2 = new c((b) new j());
                return b(context, cVar2);
            }
            try {
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                str = packageName + "/" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "volley/0";
            }
            cVar = new c(new f(AndroidHttpClient.newInstance(str)));
        } else {
            cVar = new c(bVar);
        }
        cVar2 = cVar;
        return b(context, cVar2);
    }
}
