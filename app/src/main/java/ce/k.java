package ce;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;

/* compiled from: ReactNativeFirebasePreferences.java */
/* loaded from: classes3.dex */
public class k {

    /* renamed from: b  reason: collision with root package name */
    private static k f5499b = new k();

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f5500a;

    private SharedPreferences c() {
        if (this.f5500a == null) {
            this.f5500a = io.invertase.firebase.app.a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f5500a;
    }

    public static k d() {
        return f5499b;
    }

    public void a() {
        c().edit().clear().apply();
    }

    public WritableMap b() {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : c().getAll().entrySet()) {
            io.invertase.firebase.common.a.f(entry.getKey(), entry.getValue(), createMap);
        }
        return createMap;
    }

    public void e(String str, boolean z10) {
        c().edit().putBoolean(str, z10).apply();
    }

    public void f(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }
}
