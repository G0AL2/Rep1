package com.bytedance.sdk.component.adexpress.a.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.f;
import java.io.File;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: TTDynamic.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static Object f9325a = new Object();

    public static void a() {
        b.a();
        com.bytedance.sdk.component.adexpress.dynamic.c.c.a().c();
    }

    public static void b() {
        try {
            e.d();
            File f10 = b.f();
            if (f10 != null && f10.exists()) {
                if (f10.getParentFile() != null) {
                    f.c(f10.getParentFile());
                } else {
                    f.c(f10);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String c() {
        return c.c();
    }

    public static com.bytedance.sdk.component.adexpress.a.c.a d() {
        return b.a().d();
    }

    public static String e() {
        if (d() == null) {
            return null;
        }
        return d().c();
    }

    public static boolean f() {
        return b.a().c();
    }

    public static com.bytedance.sdk.component.adexpress.a.c.b c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.a.c.b a10 = d.a().a(str);
        if (a10 != null) {
            a10.a(Long.valueOf(System.currentTimeMillis()));
            a(a10);
        }
        return a10;
    }

    public static void a(com.bytedance.sdk.component.adexpress.a.c.c cVar) {
        d.a().a(cVar, cVar.f9373f);
    }

    public static com.bytedance.sdk.component.adexpress.a.c.b a(String str) {
        return d.a().a(str);
    }

    private static void a(final com.bytedance.sdk.component.adexpress.a.c.b bVar) {
        com.bytedance.sdk.component.f.e.a(new g("updateTmplTime") { // from class: com.bytedance.sdk.component.adexpress.a.b.a.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (a.f9325a) {
                    c.a().a(bVar);
                }
            }
        }, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r2.b().equals(r6) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.webkit.WebResourceResponse a(java.lang.String r4, com.bytedance.sdk.component.adexpress.c.c.a r5, java.lang.String r6) {
        /*
            boolean r0 = f()
            r1 = 0
            if (r0 == 0) goto L5c
            com.bytedance.sdk.component.adexpress.a.c.a r0 = d()
            java.util.List r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r0.next()
            com.bytedance.sdk.component.adexpress.a.c.a$a r2 = (com.bytedance.sdk.component.adexpress.a.c.a.C0145a) r2
            java.lang.String r3 = r2.a()
            if (r3 == 0) goto L13
            java.lang.String r3 = r2.a()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L13
            java.lang.String r4 = r2.a()
            java.lang.String r4 = com.bytedance.sdk.component.utils.e.a(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            r6 = r4
        L3f:
            java.io.File r4 = new java.io.File
            java.io.File r0 = com.bytedance.sdk.component.adexpress.a.b.b.f()
            r4.<init>(r0, r6)
            java.lang.String r6 = com.bytedance.sdk.component.utils.e.a(r4)
            java.lang.String r0 = r2.b()
            if (r0 == 0) goto L5c
            java.lang.String r0 = r2.b()
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L5d
        L5c:
            r4 = r1
        L5d:
            if (r4 == 0) goto L79
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse     // Catch: java.lang.Throwable -> L71
            java.lang.String r5 = r5.a()     // Catch: java.lang.Throwable -> L71
            java.lang.String r0 = "utf-8"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L71
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L71
            r6.<init>(r5, r0, r2)     // Catch: java.lang.Throwable -> L71
            r1 = r6
            goto L79
        L71:
            r4 = move-exception
            java.lang.String r5 = "TTDynamic"
            java.lang.String r6 = "get html WebResourceResponse error"
            com.bytedance.sdk.component.utils.l.c(r5, r6, r4)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.a.b.a.a(java.lang.String, com.bytedance.sdk.component.adexpress.c.c$a, java.lang.String):android.webkit.WebResourceResponse");
    }

    public static Set<String> b(String str) {
        return d.a().b(str);
    }

    public static boolean a(JSONObject jSONObject) {
        Object opt;
        return (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) ? false : true;
    }
}
