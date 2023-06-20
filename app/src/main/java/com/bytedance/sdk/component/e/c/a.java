package com.bytedance.sdk.component.e.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.e.a;
import com.bytedance.sdk.component.e.d.g;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: AppConfig.java */
/* loaded from: classes.dex */
public class a implements g.a {

    /* renamed from: b  reason: collision with root package name */
    private static a f10326b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10328c;

    /* renamed from: k  reason: collision with root package name */
    private final Context f10336k;

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.sdk.component.e.a f10338m;

    /* renamed from: n  reason: collision with root package name */
    private int f10339n;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f10329d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10330e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10331f = false;

    /* renamed from: g  reason: collision with root package name */
    private long f10332g = 0;

    /* renamed from: h  reason: collision with root package name */
    private long f10333h = 0;

    /* renamed from: i  reason: collision with root package name */
    private ThreadPoolExecutor f10334i = null;

    /* renamed from: j  reason: collision with root package name */
    private AtomicBoolean f10335j = new AtomicBoolean(false);

    /* renamed from: l  reason: collision with root package name */
    private volatile boolean f10337l = false;

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.sdk.component.e.d.g f10327a = new com.bytedance.sdk.component.e.d.g(Looper.getMainLooper(), this);

    public a(Context context, int i10) {
        this.f10336k = context;
        this.f10328c = com.bytedance.sdk.component.e.d.f.b(context);
        this.f10339n = i10;
    }

    private a(Context context, boolean z10) {
        this.f10336k = context;
        this.f10328c = z10;
    }

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f10326b == null) {
                f10326b = new a(context.getApplicationContext(), com.bytedance.sdk.component.e.d.f.b(context));
            }
            aVar = f10326b;
        }
        return aVar;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "https://" + str + "/get_domains/v4/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i10) {
        String[] f10 = f();
        if (f10 == null || f10.length <= i10) {
            b(102);
            return;
        }
        String str = f10[i10];
        if (TextUtils.isEmpty(str)) {
            b(102);
            return;
        }
        try {
            String a10 = a(str);
            if (TextUtils.isEmpty(a10)) {
                b(102);
                return;
            }
            com.bytedance.sdk.component.e.b.b c10 = i().c();
            c10.a(a10);
            a(c10);
            c10.a(new com.bytedance.sdk.component.e.a.a() { // from class: com.bytedance.sdk.component.e.c.a.3
                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, com.bytedance.sdk.component.e.b bVar) {
                    JSONObject jSONObject;
                    if (bVar != null && bVar.f()) {
                        String str2 = null;
                        try {
                            jSONObject = new JSONObject(bVar.d());
                        } catch (Exception unused) {
                            jSONObject = null;
                        }
                        if (jSONObject == null) {
                            a.this.a(i10 + 1);
                            return;
                        }
                        try {
                            str2 = jSONObject.getString("message");
                        } catch (Exception unused2) {
                        }
                        if (!"success".equals(str2)) {
                            a.this.a(i10 + 1);
                            return;
                        }
                        try {
                            if (a.this.a(jSONObject)) {
                                a.this.b(101);
                            } else {
                                a.this.a(i10 + 1);
                            }
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    a.this.a(i10 + 1);
                }

                @Override // com.bytedance.sdk.component.e.a.a
                public void a(com.bytedance.sdk.component.e.b.c cVar, IOException iOException) {
                    a.this.a(i10 + 1);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.e.d.b.b("AppConfig", "try app config exception: " + th);
        }
    }

    private void a(com.bytedance.sdk.component.e.b.b bVar) {
        if (bVar == null) {
            return;
        }
        Address a10 = g.a().a(this.f10339n).d() != null ? g.a().a(this.f10339n).d().a(this.f10336k) : null;
        if (a10 != null && a10.hasLatitude() && a10.hasLongitude()) {
            bVar.a("latitude", a10.getLatitude() + "");
            bVar.a("longitude", a10.getLongitude() + "");
            String locality = a10.getLocality();
            if (!TextUtils.isEmpty(locality)) {
                bVar.a("city", Uri.encode(locality));
            }
        }
        if (this.f10329d) {
            bVar.a("force", "1");
        }
        try {
            bVar.a("abi", Build.VERSION.SDK_INT < 21 ? Build.CPU_ABI : Build.SUPPORTED_ABIS[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (g.a().a(this.f10339n).d() != null) {
            bVar.a("aid", g.a().a(this.f10339n).d().a() + "");
            bVar.a("device_platform", g.a().a(this.f10339n).d().c());
            bVar.a("channel", g.a().a(this.f10339n).d().b());
            bVar.a("version_code", g.a().a(this.f10339n).d().d() + "");
            bVar.a("custom_info_1", g.a().a(this.f10339n).d().e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Object obj) throws Exception {
        JSONObject jSONObject;
        if (obj instanceof String) {
            String str = (String) obj;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            jSONObject = new JSONObject(str);
            if (!"success".equals(jSONObject.getString("message"))) {
                return false;
            }
        } else {
            jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        }
        if (jSONObject == null) {
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        synchronized (this) {
            SharedPreferences.Editor edit = this.f10336k.getSharedPreferences("ss_app_config", 0).edit();
            edit.putLong("last_refresh_time", System.currentTimeMillis());
            edit.apply();
        }
        if (g.a().a(this.f10339n).h() != null) {
            g.a().a(this.f10339n).h().a(jSONObject2);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0000, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a1657027613243dc(java.lang.String r2) {
        /*
        L0:
            r0 = 73
            r1 = 96
        L4:
            switch(r0) {
                case 72: goto L26;
                case 73: goto L8;
                case 74: goto Lb;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            switch(r1) {
                case 94: goto L0;
                case 95: goto L26;
                case 96: goto L26;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 55: goto Lf;
                case 56: goto L26;
                case 57: goto L26;
                default: goto Le;
            }
        Le:
            goto L0
        Lf:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L14:
            int r1 = r2.length
            if (r0 >= r1) goto L20
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L14
        L20:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L26:
            r0 = 74
            r1 = 55
            goto L4
        L2b:
            r0 = 72
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.c.a.a1657027613243dc(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10) {
        com.bytedance.sdk.component.e.d.g gVar = this.f10327a;
        if (gVar != null) {
            gVar.sendEmptyMessage(i10);
        }
    }

    public static void b(Context context) {
        a aVar = f10326b;
        if (aVar != null) {
            if (com.bytedance.sdk.component.e.d.f.b(context)) {
                aVar.a(true);
            } else {
                aVar.a();
            }
        }
    }

    private void c(boolean z10) {
        if (this.f10331f) {
            return;
        }
        if (this.f10330e) {
            this.f10330e = false;
            this.f10332g = 0L;
            this.f10333h = 0L;
        }
        long j10 = z10 ? 10800000L : 43200000L;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f10332g > j10) {
            if (currentTimeMillis - this.f10333h > 120000 || !this.f10337l) {
                c();
            }
        }
    }

    private boolean h() {
        String[] f10 = f();
        if (f10 != null && f10.length != 0) {
            a(0);
        }
        return false;
    }

    private com.bytedance.sdk.component.e.a i() {
        if (this.f10338m == null) {
            a.C0158a c0158a = new a.C0158a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f10338m = c0158a.a(10L, timeUnit).b(10L, timeUnit).c(10L, timeUnit).a();
        }
        return this.f10338m;
    }

    public void a() {
        a(false);
    }

    @Override // com.bytedance.sdk.component.e.d.g.a
    public void a(Message message) {
        int i10 = message.what;
        if (i10 == 101) {
            this.f10331f = false;
            this.f10332g = System.currentTimeMillis();
            com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh, succ");
            if (this.f10330e) {
                a();
            }
        } else if (i10 != 102) {
            return;
        } else {
            this.f10331f = false;
            if (this.f10330e) {
                a();
            }
            com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh, error");
        }
        this.f10335j.set(false);
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        this.f10334i = threadPoolExecutor;
    }

    public synchronized void a(boolean z10) {
        if (this.f10328c) {
            c(z10);
        } else if (this.f10332g <= 0) {
            try {
                g().execute(new Runnable() { // from class: com.bytedance.sdk.component.e.c.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.b();
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    synchronized void b() {
        if (System.currentTimeMillis() - this.f10332g > 3600000) {
            this.f10332g = System.currentTimeMillis();
            try {
                if (g.a().a(this.f10339n).h() != null) {
                    g.a().a(this.f10339n).h().b();
                }
            } catch (Exception unused) {
            }
        }
    }

    void b(boolean z10) {
        com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh, actual request");
        d();
        this.f10331f = true;
        if (!z10) {
            this.f10327a.sendEmptyMessage(102);
            return;
        }
        try {
            h();
        } catch (Exception unused) {
            this.f10335j.set(false);
        }
    }

    public boolean c() {
        com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh: updating state " + this.f10335j.get());
        g().execute(new Runnable() { // from class: com.bytedance.sdk.component.e.c.a.2
            @Override // java.lang.Runnable
            public void run() {
                boolean a10 = com.bytedance.sdk.component.e.d.e.a(a.this.f10336k);
                if (a10) {
                    a.this.f10333h = System.currentTimeMillis();
                    if (!a.this.f10335j.compareAndSet(false, true)) {
                        com.bytedance.sdk.component.e.d.b.b("TNCManager", "doRefresh, already running");
                    } else {
                        a.this.b(a10);
                    }
                }
            }
        });
        return true;
    }

    public synchronized void d() {
        if (this.f10337l) {
            return;
        }
        this.f10337l = true;
        long j10 = this.f10336k.getSharedPreferences("ss_app_config", 0).getLong("last_refresh_time", 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j10 > currentTimeMillis) {
            j10 = currentTimeMillis;
        }
        this.f10332g = j10;
        try {
            if (g.a().a(this.f10339n).h() != null) {
                g.a().a(this.f10339n).h().a();
            }
        } catch (Exception unused) {
        }
    }

    public void e() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            if (this.f10328c) {
                d();
            } else {
                b();
            }
        } catch (Throwable unused) {
        }
    }

    public String[] f() {
        String[] f10 = g.a().a(this.f10339n).d() != null ? g.a().a(this.f10339n).d().f() : null;
        return (f10 == null || f10.length <= 0) ? new String[0] : f10;
    }

    public ThreadPoolExecutor g() {
        if (this.f10334i == null) {
            synchronized (a.class) {
                if (this.f10334i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                    this.f10334i = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return this.f10334i;
    }
}
