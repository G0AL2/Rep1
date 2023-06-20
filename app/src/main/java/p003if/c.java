package p003if;

import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import fe.h0;
import gf.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import qe.k;
import ve.q;
import ve.s;
import ye.z;

/* compiled from: AndroidLog.kt */
/* renamed from: if.c  reason: invalid package */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f31944b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f31945c = new c();

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArraySet<Logger> f31943a = new CopyOnWriteArraySet<>();

    static {
        Map<String, String> p10;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r12 = z.class.getPackage();
        String name = r12 != null ? r12.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = z.class.getName();
        k.e(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = e.class.getName();
        k.e(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = cf.e.class.getName();
        k.e(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        p10 = h0.p(linkedHashMap);
        f31944b = p10;
    }

    private c() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f31943a.add(logger)) {
            k.e(logger, "logger");
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(d.f31946a);
        }
    }

    private final String d(String str) {
        String y02;
        String str2 = f31944b.get(str);
        if (str2 != null) {
            return str2;
        }
        y02 = s.y0(str, 23);
        return y02;
    }

    public final void a(String str, int i10, String str2, Throwable th) {
        int N;
        int min;
        k.f(str, "loggerName");
        k.f(str2, "message");
        String d10 = d(str);
        if (Log.isLoggable(d10, i10)) {
            if (th != null) {
                str2 = str2 + "\n" + Log.getStackTraceString(th);
            }
            int i11 = 0;
            int length = str2.length();
            while (i11 < length) {
                N = q.N(str2, '\n', i11, false, 4, null);
                if (N == -1) {
                    N = length;
                }
                while (true) {
                    min = Math.min(N, i11 + TTAdSdk.INIT_LOCAL_FAIL_CODE);
                    String substring = str2.substring(i11, min);
                    k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i10, d10, substring);
                    if (min >= N) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : f31944b.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}
