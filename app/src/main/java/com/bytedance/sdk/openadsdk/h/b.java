package com.bytedance.sdk.openadsdk.h;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.c;
import com.bytedance.sdk.openadsdk.core.m;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* compiled from: StatsLogManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f13272a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f13273b = Executors.newFixedThreadPool(5);

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(com.bytedance.sdk.openadsdk.h.a.b bVar) {
        return bVar == null;
    }

    public void b(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (g(bVar)) {
            return;
        }
        bVar.a("express_ad_render");
        bVar.a(System.currentTimeMillis() / 1000);
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.14
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                return bVar;
            }
        });
    }

    public void c(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (g(bVar)) {
            return;
        }
        this.f13273b.execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.h.b.15
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.g(bVar) || !b.this.a(bVar.e(), 1)) {
                    return;
                }
                bVar.a("reg_creative");
                m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.15.1
                    @Override // com.bytedance.sdk.openadsdk.h.a
                    public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                        return bVar;
                    }
                });
            }
        });
    }

    public void d(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (g(bVar)) {
            return;
        }
        this.f13273b.execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.h.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.g(bVar) || !b.this.a(bVar.e(), 0)) {
                    return;
                }
                bVar.a("no_reg_creative");
                m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.2.1
                    @Override // com.bytedance.sdk.openadsdk.h.a
                    public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                        return bVar;
                    }
                });
            }
        });
    }

    public void e(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (g(bVar)) {
            return;
        }
        bVar.a("load_icon_error");
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.3
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                return bVar;
            }
        });
    }

    public void f(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (g(bVar)) {
            return;
        }
        bVar.a("show_backup_endcard");
        bVar.a(System.currentTimeMillis() / 1000);
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.4
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                return bVar;
            }
        });
    }

    public static b a() {
        if (f13272a == null) {
            synchronized (b.class) {
                if (f13272a == null) {
                    f13272a = new b();
                }
            }
        }
        return f13272a;
    }

    public void c() {
        try {
            m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.13
                @Override // com.bytedance.sdk.openadsdk.h.a
                public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                    return com.bytedance.sdk.openadsdk.h.a.b.b().a("bidding_get_creative");
                }
            }, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
        } catch (Throwable unused) {
        }
        final com.bytedance.sdk.openadsdk.h.a.b b10 = com.bytedance.sdk.openadsdk.h.a.b.b().a("close_playable_test_tool").b(jSONObject.toString());
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.7
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                return b10;
            }
        }, false);
    }

    public void a(final com.bytedance.sdk.openadsdk.h.a.b bVar) {
        if (g(bVar)) {
            return;
        }
        bVar.a(System.currentTimeMillis() / 1000);
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.1
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                return bVar;
            }
        });
    }

    public static void b() {
        File[] listFiles;
        try {
            JSONObject jSONObject = new JSONObject();
            long j10 = 0;
            File file = new File(CacheDirFactory.getRootDir());
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    long a10 = a(file2);
                    j10 += a10;
                    jSONObject.put(file2.getName(), a10);
                }
            }
            if (j10 < 524288000) {
                return;
            }
            final com.bytedance.sdk.openadsdk.h.a.b b10 = com.bytedance.sdk.openadsdk.h.a.b.b().a("disk_log").b(jSONObject.toString());
            m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.12
                @Override // com.bytedance.sdk.openadsdk.h.a
                public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                    return com.bytedance.sdk.openadsdk.h.a.b.this;
                }
            }, false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, int i10) {
        c a10 = c.a(m.a());
        boolean z10 = false;
        int b10 = a10.b(str, 0);
        z10 = ((b10 & 2) == 0 || (b10 & 1) != i10) ? true : true;
        if (z10) {
            a10.a(str, i10 + 2);
        }
        return z10;
    }

    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        final com.bytedance.sdk.openadsdk.h.a.b b10 = com.bytedance.sdk.openadsdk.h.a.b.b().a("app_env").a(System.currentTimeMillis() / 1000).b(jSONObject.toString());
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.5
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                return b10;
            }
        });
    }

    public void a(final String str) {
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.6
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_url", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.h.a.b.b().a("click_playable_test_tool").b(jSONObject.toString());
            }
        }, false);
    }

    public void a(String str, int i10, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_url", str);
            jSONObject.put("error_code", i10);
            jSONObject.put("error_message", str2);
        } catch (Throwable unused) {
        }
        final com.bytedance.sdk.openadsdk.h.a.b b10 = com.bytedance.sdk.openadsdk.h.a.b.b().a("use_playable_test_tool_error").b(jSONObject.toString());
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.8
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                return b10;
            }
        }, false);
    }

    public void a(final long j10, final long j11, final int i10) {
        final long j12 = j11 - j10;
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.9
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("starttime", j10);
                    jSONObject.put("endtime", j11);
                    jSONObject.put("start_type", i10);
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.h.a.b a10 = com.bytedance.sdk.openadsdk.h.a.b.b().a("general_label");
                return a10.h(j12 + "").b(jSONObject.toString());
            }
        }, false);
    }

    public void a(final String str, long j10) {
        if (f3.a.w()) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis() - j10;
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.10
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", currentTimeMillis);
                    jSONObject.put("method_name", str);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.h.a.b.b().a("log_mssdk_method_time_report").b(jSONObject.toString());
            }
        }, false);
    }

    public void a(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        final com.bytedance.sdk.openadsdk.h.a.b b10 = com.bytedance.sdk.openadsdk.h.a.b.b().a(str).b(jSONObject.toString());
        m.i().a(new a() { // from class: com.bytedance.sdk.openadsdk.h.b.11
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                return b10;
            }
        }, false);
    }

    public static long a(File file) {
        if (file.isFile()) {
            return file.length();
        }
        long j10 = 0;
        for (File file2 : file.listFiles()) {
            j10 += a(file2);
        }
        return j10;
    }

    public void a(a aVar) {
        m.i().a(aVar, false);
    }
}
