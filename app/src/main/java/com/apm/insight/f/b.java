package com.apm.insight.f;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.c;
import com.apm.insight.k.g;
import com.apm.insight.l.q;
import com.apm.insight.l.v;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.p;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    private static String a(StackTraceElement[] stackTraceElementArr, int i10) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < stackTraceElementArr.length) {
            v.a(stackTraceElementArr[i10], sb2);
            i10++;
        }
        return sb2.toString();
    }

    public static void a(final Object obj, final Throwable th, final String str, final boolean z10, final Map<String, String> map, final String str2, final String str3) {
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.f.b.2
                @Override // java.lang.Runnable
                public void run() {
                    b.c(obj, th, str, z10, map, str2, str3);
                }
            });
        } catch (Throwable unused) {
        }
    }

    public static void a(Throwable th, String str, boolean z10) {
        a(th, str, z10, "core_exception_monitor");
    }

    public static void a(Throwable th, String str, boolean z10, String str2) {
        a(th, str, z10, (Map<String, String>) null, str2);
    }

    public static void a(final Throwable th, final String str, final boolean z10, final Map<String, String> map, final String str2) {
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.f.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.b((Object) null, th, str, z10, map, str2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void a(Map<String, String> map, c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                cVar.a("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(final StackTraceElement[] stackTraceElementArr, final int i10, final String str, final String str2, final Map<String, String> map) {
        try {
            p.b().a(new Runnable() { // from class: com.apm.insight.f.b.3
                @Override // java.lang.Runnable
                public void run() {
                    b.b(stackTraceElementArr, i10, str, str2, "core_exception_monitor", map);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, Throwable th, String str, boolean z10, Map<String, String> map, String str2) {
        c(obj, th, str, z10, map, "EnsureNotReachHere", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(StackTraceElement[] stackTraceElementArr, int i10, String str, String str2, String str3, Map<String, String> map) {
        StackTraceElement stackTraceElement;
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i10 + 1 && (stackTraceElement = stackTraceElementArr[i10]) != null) {
                    String a10 = a(stackTraceElementArr, i10);
                    if (TextUtils.isEmpty(a10)) {
                        return;
                    }
                    c a11 = c.a(stackTraceElement, a10, str, Thread.currentThread().getName(), true, str2, str3);
                    a(map, a11);
                    f.a().a(CrashType.ENSURE, a11);
                    g.a(a11);
                    q.b("[report] " + str);
                }
            } catch (Throwable th) {
                q.b(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Object obj, Throwable th, String str, boolean z10, Map<String, String> map, String str2, String str3) {
        if (th == null) {
            return;
        }
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            StackTraceElement stackTraceElement = stackTrace[0];
            if (stackTraceElement == null) {
                return;
            }
            String a10 = v.a(th);
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            c a11 = c.a(stackTraceElement, a10, str, Thread.currentThread().getName(), z10, str2, str3);
            if (obj != null) {
                a11.a("exception_line_num", (Object) com.apm.insight.entity.b.a(obj, th, stackTrace));
            }
            a(map, a11);
            f.a().a(CrashType.ENSURE, a11);
            g.a(obj, a11);
            q.b("[reportException] " + str);
        } catch (Throwable th2) {
            q.b(th2);
        }
    }
}
