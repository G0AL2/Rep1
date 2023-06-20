package com.bytedance.sdk.openadsdk.b;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WebviewTimeTrack.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private String f11170a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f11171b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f11172c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f11173d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f11174e;

    /* renamed from: f  reason: collision with root package name */
    private JSONObject f11175f;

    /* renamed from: g  reason: collision with root package name */
    private JSONArray f11176g;

    /* renamed from: h  reason: collision with root package name */
    private JSONArray f11177h;

    protected u() {
        this.f11170a = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.f11172c = bool;
        this.f11173d = bool;
        this.f11174e = bool;
    }

    public u(int i10, String str, com.bytedance.sdk.openadsdk.core.e.n nVar) {
        this.f11170a = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.f11172c = bool;
        this.f11173d = bool;
        this.f11174e = bool;
        this.f11170a = str;
        this.f11171b = nVar;
        this.f11175f = new JSONObject();
        this.f11176g = new JSONArray();
        this.f11177h = new JSONArray();
        a(this.f11175f, "webview_source", Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONArray jSONArray, Object obj) {
        if (jSONArray != null && jSONArray.length() < 10) {
            try {
                jSONArray.put(obj);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, String str, Object obj) {
        a(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject, String str, Object obj, boolean z10) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z10) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return this.f11174e.booleanValue() || (this.f11173d.booleanValue() && this.f11172c.booleanValue());
    }

    public void a() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.1
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(jSONObject, "render_sequence", Integer.valueOf(uVar.f11171b.q()));
                u.this.a(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.d.e.a().e()));
                u.this.a(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.d.e.a().d()));
                u uVar2 = u.this;
                uVar2.a(uVar2.f11175f, "render_start", jSONObject);
            }
        });
    }

    public void a(final int i10) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.21
            @Override // java.lang.Runnable
            public void run() {
                u.this.a(i10, (String) null);
            }
        });
    }

    public void a(final int i10, final String str) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.23
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, Analytics.Param.CODE, Integer.valueOf(i10));
                String str2 = str;
                if (str2 != null) {
                    u.this.a(jSONObject, "msg", str2);
                }
                u uVar = u.this;
                uVar.a(uVar.f11175f, "render_error", jSONObject);
            }
        });
    }

    public void a(final String str) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.9
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "jsb", str);
                u uVar = u.this;
                uVar.a(uVar.f11175f, "webview_jsb_start", jSONObject);
            }
        });
    }

    public void a(final String str, final long j10, final long j11, final int i10) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.7
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j11 < j10) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "start_ts", Long.valueOf(j10));
                u.this.a(jSONObject, "end_ts", Long.valueOf(j11));
                u.this.a(jSONObject, "intercept_type", Integer.valueOf(i10));
                u.this.a(jSONObject, "type", "intercept_html");
                u.this.a(jSONObject, ImagesContract.URL, str);
                u.this.a(jSONObject, "duration", Long.valueOf(j11 - j10));
                u uVar = u.this;
                uVar.a(uVar.f11177h, jSONObject);
            }
        });
    }

    public void a(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.2
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                u.this.a(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "webview_load_error", jSONObject2);
            }
        });
    }

    public void a(boolean z10) {
        this.f11174e = Boolean.valueOf(z10);
    }

    public void b() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.12
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "render_success", jSONObject);
            }
        });
    }

    public void b(final int i10) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.22
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "isWebViewCache", Integer.valueOf(i10));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "before_webview_request", jSONObject);
            }
        });
    }

    public void b(final int i10, final String str) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.15
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, Analytics.Param.CODE, Integer.valueOf(i10));
                u uVar = u.this;
                uVar.a(uVar.f11175f, str, jSONObject);
            }
        });
    }

    public void b(final String str) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.10
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "jsb", str);
                u uVar = u.this;
                uVar.a(uVar.f11175f, "webview_jsb_end", jSONObject);
            }
        });
    }

    public void b(final String str, final long j10, final long j11, final int i10) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.8
            @Override // java.lang.Runnable
            public void run() {
                if (TextUtils.isEmpty(str) || j11 < j10) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "start_ts", Long.valueOf(j10));
                u.this.a(jSONObject, "end_ts", Long.valueOf(j11));
                u.this.a(jSONObject, "intercept_type", Integer.valueOf(i10));
                u.this.a(jSONObject, "type", "intercept_js");
                u.this.a(jSONObject, ImagesContract.URL, str);
                u.this.a(jSONObject, "duration", Long.valueOf(j11 - j10));
                u uVar = u.this;
                uVar.a(uVar.f11177h, jSONObject);
            }
        });
    }

    public void b(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.11
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject2;
                if (u.this.f11175f == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    u uVar = u.this;
                    uVar.a(uVar.f11175f, next, jSONObject.opt(next));
                }
                u.this.f11173d = Boolean.TRUE;
                u.this.m();
            }
        });
    }

    public void c() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.24
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "native_render_start", jSONObject);
            }
        });
    }

    public void c(final String str) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.14
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, str, jSONObject);
            }
        });
    }

    public void d() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.25
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "native_render_end", jSONObject);
            }
        });
    }

    public void d(final String str) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.19
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, str, jSONObject);
            }
        });
    }

    public void e() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.26
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    public void e(final String str) {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.20
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, str, jSONObject);
            }
        });
    }

    public void f() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.27
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "webview_load_success", jSONObject);
            }
        });
    }

    public void g() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.28
            @Override // java.lang.Runnable
            public void run() {
                u.this.a((JSONObject) null);
            }
        });
    }

    public void h() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.3
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "native_endcard_show", jSONObject);
            }
        });
    }

    public void i() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.4
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "native_endcard_close", jSONObject);
            }
        });
    }

    public void j() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.5
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "type", "native_enterBackground");
                u uVar = u.this;
                uVar.a(uVar.f11176g, jSONObject);
            }
        });
    }

    public void k() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.6
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u.this.a(jSONObject, "type", "native_enterForeground");
                u uVar = u.this;
                uVar.a(uVar.f11176g, jSONObject);
            }
        });
    }

    public void l() {
        this.f11172c = Boolean.TRUE;
    }

    public void m() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.13
            @Override // java.lang.Runnable
            public void run() {
                if (u.this.q()) {
                    if (u.this.f11176g != null && u.this.f11176g.length() != 0) {
                        try {
                            u.this.f11175f.put("native_switchBackgroundAndForeground", u.this.f11176g);
                        } catch (Exception unused) {
                        }
                    }
                    if (u.this.f11177h != null && u.this.f11177h.length() != 0) {
                        try {
                            u.this.f11175f.put("intercept_source", u.this.f11177h);
                        } catch (Exception unused2) {
                        }
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("webview_time_track", u.this.f11175f);
                    if (com.bytedance.sdk.openadsdk.core.h.d().s() && u.this.f11175f != null) {
                        com.bytedance.sdk.component.utils.l.b("WebviewTimeTrack", u.this.f11175f.toString());
                    }
                    e.c(com.bytedance.sdk.openadsdk.core.m.a(), u.this.f11171b, u.this.f11170a, "webview_time_track", hashMap);
                }
            }
        });
    }

    public void n() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.16
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "native_render_end", jSONObject);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                u.this.a(jSONObject2, "ts", Long.valueOf(currentTimeMillis2));
                u uVar2 = u.this;
                uVar2.a(uVar2.f11175f, "render_success", jSONObject2);
            }
        });
    }

    public void o() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.17
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "no_native_render", jSONObject);
            }
        });
    }

    public void p() {
        com.bytedance.sdk.component.utils.h.a().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.b.u.18
            @Override // java.lang.Runnable
            public void run() {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                u.this.a(jSONObject, "ts", Long.valueOf(currentTimeMillis));
                u uVar = u.this;
                uVar.a(uVar.f11175f, "render_failed", jSONObject);
            }
        });
    }
}
