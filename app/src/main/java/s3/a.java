package s3;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.c;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: AdvertisingIdHelper.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f36716c;

    /* renamed from: a  reason: collision with root package name */
    private String f36717a = "";

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f36718b = Executors.newSingleThreadExecutor();

    private a() {
    }

    public static a a() {
        if (f36716c == null) {
            synchronized (a.class) {
                if (f36716c == null) {
                    f36716c = new a();
                }
            }
        }
        return f36716c;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c.a(m.a()).a("gaid", str);
    }

    public String c() {
        if (m.h().p("gaid")) {
            if (!TextUtils.isEmpty(this.f36717a)) {
                return this.f36717a;
            }
            String b10 = c.a(m.a()).b("gaid", "");
            this.f36717a = b10;
            return b10;
        }
        return "";
    }

    public void d(String str) {
        this.f36717a = str;
    }
}
