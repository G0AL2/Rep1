package com.apm.insight.k;

import com.apm.insight.l.p;
import com.apm.insight.l.q;
import com.apm.insight.runtime.u;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Runnable f6383a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public void run() {
            u b10;
            Runnable runnable;
            long j10;
            if (p.b(com.apm.insight.h.g())) {
                a.i();
            }
            if (a.f6384b > 0) {
                if (com.apm.insight.l.a.b(com.apm.insight.h.g())) {
                    b10 = com.apm.insight.runtime.p.b();
                    runnable = a.f6383a;
                    j10 = 15000;
                } else {
                    b10 = com.apm.insight.runtime.p.b();
                    runnable = a.f6383a;
                    j10 = 60000;
                }
                b10.a(runnable, j10);
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private static int f6384b = 0;

    public static void a() {
        f6384b = 40;
        com.apm.insight.runtime.p.b().a(f6383a);
    }

    public static void b() {
        if (!k.b()) {
            k.c();
        }
        if (p.b(com.apm.insight.h.g()) && k.a(false)) {
            i();
        }
    }

    public static boolean c() {
        return false;
    }

    public static void d() {
    }

    private static byte[] h() {
        try {
            return e.a(com.apm.insight.h.i().getConfigUrl(), (Map<String, String>) null, com.apm.insight.entity.b.a().toString().getBytes());
        } catch (Throwable th) {
            q.a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (com.apm.insight.k.k.a() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void i() {
        /*
            java.lang.Class<com.apm.insight.k.a> r0 = com.apm.insight.k.a.class
            monitor-enter(r0)
            int r1 = com.apm.insight.k.a.f6384b     // Catch: java.lang.Throwable -> L68
            r2 = 1
            if (r1 <= 0) goto Lb
            int r1 = r1 - r2
            com.apm.insight.k.a.f6384b = r1     // Catch: java.lang.Throwable -> L68
        Lb:
            java.lang.String r1 = "try fetchApmConfig"
            com.apm.insight.l.q.a(r1)     // Catch: java.lang.Throwable -> L68
            android.content.Context r1 = com.apm.insight.h.g()     // Catch: java.lang.Throwable -> L68
            boolean r1 = com.apm.insight.l.a.b(r1)     // Catch: java.lang.Throwable -> L68
            r3 = 0
            if (r1 == 0) goto L5c
            r1 = 0
            byte[] r4 = h()     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L39
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L33
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L33
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "data"
            org.json.JSONArray r1 = r5.optJSONArray(r4)     // Catch: java.lang.Throwable -> L33
            goto L39
        L33:
            r4 = move-exception
            java.lang.String r5 = "npth"
            com.apm.insight.l.q.a(r5, r4)     // Catch: java.lang.Throwable -> L68
        L39:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r4.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "after fetchApmConfig net "
            r4.append(r5)     // Catch: java.lang.Throwable -> L68
            r4.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L68
            com.apm.insight.l.q.a(r4)     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L55
            com.apm.insight.runtime.a.a(r1, r2)     // Catch: java.lang.Throwable -> L68
        L52:
            com.apm.insight.k.a.f6384b = r3     // Catch: java.lang.Throwable -> L68
            goto L66
        L55:
            int r1 = com.apm.insight.k.a.f6384b     // Catch: java.lang.Throwable -> L68
            int r1 = r1 + (-10)
            com.apm.insight.k.a.f6384b = r1     // Catch: java.lang.Throwable -> L68
            goto L66
        L5c:
            com.apm.insight.k.k.c()     // Catch: java.lang.Throwable -> L68
            boolean r1 = com.apm.insight.k.k.a()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L66
            goto L52
        L66:
            monitor-exit(r0)
            return
        L68:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.k.a.i():void");
    }
}
