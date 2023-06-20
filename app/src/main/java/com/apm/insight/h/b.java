package com.apm.insight.h;

import com.apm.insight.h;
import com.apm.insight.l.i;
import com.apm.insight.l.q;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.r;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, String> f6360a;

    public static String a() {
        return h.g().getFilesDir() + "/apminsight/selflib/";
    }

    public static String a(String str) {
        return h.g().getFilesDir() + "/apminsight/selflib/lib" + str + ".so";
    }

    public static void b(final String str) {
        p.b().a(new Runnable() { // from class: com.apm.insight.h.b.1

            /* renamed from: a  reason: collision with root package name */
            boolean f6361a = false;

            @Override // java.lang.Runnable
            public void run() {
                String str2;
                String str3;
                b.d();
                if (b.f(str)) {
                    return;
                }
                r.a("updateSo", str);
                File file = new File(b.a(str));
                file.getParentFile().mkdirs();
                if (file.exists()) {
                    file.delete();
                }
                q.a("doUnpackLibrary: " + str);
                String str4 = null;
                try {
                    str4 = c.a(h.g(), str, file);
                } catch (Throwable th) {
                    r.a("updateSoError", str);
                    com.apm.insight.b.a().a("NPTH_CATCH", th);
                }
                if (str4 == null) {
                    b.f6360a.put(file.getName(), "1.3.8.nourl-alpha.0");
                    try {
                        i.a(new File(b.e(str)), "1.3.8.nourl-alpha.0", false);
                    } catch (Throwable unused) {
                    }
                    str2 = str;
                    str3 = "updateSoSuccess";
                } else if (!this.f6361a) {
                    this.f6361a = true;
                    r.a("updateSoPostRetry", str);
                    p.b().a(this, 3000L);
                    return;
                } else {
                    str2 = str;
                    str3 = "updateSoFailed";
                }
                r.a(str3, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        if (f6360a != null) {
            return;
        }
        f6360a = new HashMap<>();
        File file = new File(h.g().getFilesDir(), "/apminsight/selflib/");
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (str.endsWith(".ver")) {
                String substring = str.substring(0, str.length() - 4);
                try {
                    f6360a.put(substring, i.c(file.getAbsolutePath() + "/" + str));
                } catch (Throwable th) {
                    com.apm.insight.b.a().a("NPTH_CATCH", th);
                }
            } else if (!str.endsWith(".so")) {
                i.a(new File(file, str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str) {
        return h.g().getFilesDir() + "/apminsight/selflib/" + str + ".ver";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(String str) {
        return "1.3.8.nourl-alpha.0".equals(f6360a.get(str)) && new File(a(str)).exists();
    }
}
