package ce;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* compiled from: ReactNativeFirebaseMeta.java */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static j f5498a = new j();

    private Bundle b() {
        ApplicationInfo applicationInfo;
        try {
            Context a10 = io.invertase.firebase.app.a.a();
            PackageManager packageManager = a10.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a10.getPackageName(), 128)) == null) {
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static j c() {
        return f5498a;
    }

    public WritableMap a() {
        Bundle b10 = b();
        WritableMap createMap = Arguments.createMap();
        if (b10 == null) {
            return createMap;
        }
        for (String str : b10.keySet()) {
            if (str.startsWith("rnfirebase_")) {
                Object obj = b10.get(str);
                if (obj == null) {
                    createMap.putNull(str);
                } else if (obj instanceof String) {
                    createMap.putString(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    createMap.putBoolean(str, ((Boolean) obj).booleanValue());
                }
            }
        }
        return createMap;
    }
}
