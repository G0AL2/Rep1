package com.apm.insight.k;

import android.util.Log;
import com.apm.insight.l.o;
import com.apm.insight.l.q;
import com.apm.insight.runtime.p;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private static File f6461a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6462b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6463c = false;

    /* renamed from: d  reason: collision with root package name */
    private static String f6464d = "exception_modules";

    /* renamed from: e  reason: collision with root package name */
    private static String f6465e = "npth";

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, String> f6466f;

    public static void a(String str) {
        if (f6466f == null) {
            f6466f = new HashMap();
        }
        f6466f.put(str, String.valueOf(System.currentTimeMillis()));
    }

    public static void a(boolean z10, JSONArray jSONArray) {
        try {
            com.apm.insight.l.i.a(new File(o.j(com.apm.insight.h.g()), "apminsight/configCrash/configFile"), jSONArray, false);
        } catch (IOException unused) {
        }
        try {
            com.apm.insight.l.i.a(f(), f6466f);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return f6462b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(boolean z10) {
        File f10 = f();
        try {
            Map<String, String> map = f6466f;
            if (map == null) {
                map = com.apm.insight.l.i.e(f10);
            }
            f6466f = map;
            if (map == null) {
                f6466f = new HashMap();
                return true;
            } else if (map.size() < com.apm.insight.entity.b.c()) {
                return true;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z11 = false;
                for (Map.Entry<String, String> entry : f6466f.entrySet()) {
                    if (currentTimeMillis - Long.decode(entry.getValue()).longValue() > com.apm.insight.runtime.e.e(entry.getKey())) {
                        z11 = true;
                    }
                }
                q.a((Object) (z11 ? "config should be updated" : "config should not be updated"));
                return z11;
            }
        } catch (Throwable th) {
            Log.e("npth", "err", th);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return f6463c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        if (f6462b) {
            return;
        }
        f6463c = true;
        File file = new File(o.j(com.apm.insight.h.g()), "apminsight/configCrash/configFile");
        if (file.exists()) {
            try {
                com.apm.insight.runtime.a.a(new JSONArray(com.apm.insight.l.i.c(file)), false);
                f6462b = true;
            } catch (Throwable unused) {
                com.apm.insight.runtime.a.a((JSONArray) null, false);
            }
        }
    }

    public static void d() {
        c();
        if (a(false)) {
            a.a();
        }
    }

    public static void e() {
        p.b().a(new Runnable() { // from class: com.apm.insight.k.k.1
            @Override // java.lang.Runnable
            public void run() {
                if (k.a(false)) {
                    a.a();
                }
            }
        });
    }

    private static File f() {
        if (f6461a == null) {
            f6461a = new File(o.j(com.apm.insight.h.g()), "apminsight/configCrash/configInvalid");
        }
        return f6461a;
    }
}
