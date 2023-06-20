package com.bytedance.sdk.openadsdk.b;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.NetworkTools;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdEvent.java */
/* loaded from: classes.dex */
public class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final String f10976a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f10977b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f10978c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f10979d;

    /* renamed from: e  reason: collision with root package name */
    private String f10980e;

    /* renamed from: f  reason: collision with root package name */
    private String f10981f;

    /* renamed from: g  reason: collision with root package name */
    private String f10982g;

    /* renamed from: h  reason: collision with root package name */
    private String f10983h;

    /* renamed from: i  reason: collision with root package name */
    private String f10984i;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.b.a.a f10985j;

    /* renamed from: k  reason: collision with root package name */
    private String f10986k;

    /* renamed from: l  reason: collision with root package name */
    private String f10987l;

    /* renamed from: m  reason: collision with root package name */
    private String f10988m;

    /* renamed from: n  reason: collision with root package name */
    private String f10989n;

    /* compiled from: AdEvent.java */
    /* renamed from: com.bytedance.sdk.openadsdk.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0162a {

        /* renamed from: a  reason: collision with root package name */
        private String f10990a;

        /* renamed from: b  reason: collision with root package name */
        private String f10991b;

        /* renamed from: c  reason: collision with root package name */
        private String f10992c;

        /* renamed from: d  reason: collision with root package name */
        private String f10993d;

        /* renamed from: e  reason: collision with root package name */
        private String f10994e;

        /* renamed from: f  reason: collision with root package name */
        private String f10995f;

        /* renamed from: g  reason: collision with root package name */
        private String f10996g;

        /* renamed from: h  reason: collision with root package name */
        private JSONObject f10997h;

        /* renamed from: i  reason: collision with root package name */
        private String f10998i;

        /* renamed from: j  reason: collision with root package name */
        private final String f10999j = String.valueOf(NetworkTools.a(com.bytedance.sdk.openadsdk.core.m.a()));

        /* renamed from: k  reason: collision with root package name */
        private String f11000k;

        /* renamed from: l  reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.b.a.b f11001l;

        /* renamed from: m  reason: collision with root package name */
        private com.bytedance.sdk.openadsdk.b.a.a f11002m;

        public C0162a b(String str) {
            this.f10991b = str;
            return this;
        }

        public C0162a c(String str) {
            this.f10992c = str;
            return this;
        }

        public C0162a d(String str) {
            this.f10993d = str;
            return this;
        }

        public C0162a e(String str) {
            this.f10994e = str;
            return this;
        }

        public C0162a f(String str) {
            this.f10995f = str;
            return this;
        }

        public C0162a g(String str) {
            this.f10996g = str;
            return this;
        }

        public C0162a a(String str) {
            this.f11000k = str;
            return this;
        }

        public C0162a a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f10997h = jSONObject;
            return this;
        }

        public void a(com.bytedance.sdk.openadsdk.b.a.a aVar) {
            this.f11002m = aVar;
            final a aVar2 = new a(this);
            try {
                com.bytedance.sdk.openadsdk.b.a.b bVar = this.f11001l;
                if (bVar != null) {
                    bVar.a(aVar2.f10977b);
                } else {
                    new com.bytedance.sdk.openadsdk.b.a.c().a(aVar2.f10977b);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.l.b("AdEvent", th);
            }
            if (com.bytedance.sdk.openadsdk.multipro.b.c()) {
                com.bytedance.sdk.openadsdk.utils.t.b(new com.bytedance.sdk.component.f.g("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.b.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.m.c().a(aVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.core.m.c().a(aVar2);
            }
        }
    }

    a(C0162a c0162a) {
        this.f10978c = new AtomicBoolean(false);
        this.f10979d = new JSONObject();
        this.f10976a = TextUtils.isEmpty(c0162a.f10990a) ? com.bytedance.sdk.openadsdk.utils.l.a() : c0162a.f10990a;
        this.f10985j = c0162a.f11002m;
        this.f10987l = c0162a.f10994e;
        this.f10980e = c0162a.f10991b;
        this.f10981f = c0162a.f10992c;
        this.f10982g = TextUtils.isEmpty(c0162a.f10993d) ? "app_union" : c0162a.f10993d;
        this.f10986k = c0162a.f10998i;
        this.f10983h = c0162a.f10995f;
        this.f10984i = c0162a.f10996g;
        this.f10988m = c0162a.f10999j;
        this.f10989n = c0162a.f11000k;
        this.f10979d = c0162a.f10997h = c0162a.f10997h != null ? c0162a.f10997h : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.f10977b = jSONObject;
        if (TextUtils.isEmpty(c0162a.f11000k)) {
            return;
        }
        try {
            jSONObject.put("app_log_url", c0162a.f11000k);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, JSONObject jSONObject) {
        this.f10978c = new AtomicBoolean(false);
        this.f10979d = new JSONObject();
        this.f10976a = str;
        this.f10977b = jSONObject;
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("localId", null);
            JSONObject optJSONObject = jSONObject.optJSONObject("event");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                return new a(optString, optJSONObject);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private void f() throws JSONException {
        this.f10977b.putOpt("app_log_url", this.f10989n);
        this.f10977b.putOpt("tag", this.f10980e);
        this.f10977b.putOpt("label", this.f10981f);
        this.f10977b.putOpt("category", this.f10982g);
        if (!TextUtils.isEmpty(this.f10983h)) {
            try {
                this.f10977b.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(Long.parseLong(this.f10983h)));
            } catch (NumberFormatException unused) {
                this.f10977b.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
            }
        }
        if (!TextUtils.isEmpty(this.f10984i)) {
            try {
                this.f10977b.putOpt("ext_value", Long.valueOf(Long.parseLong(this.f10984i)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.f10987l)) {
            this.f10977b.putOpt("log_extra", this.f10987l);
        }
        if (!TextUtils.isEmpty(this.f10986k)) {
            try {
                this.f10977b.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.f10986k)));
            } catch (NumberFormatException unused3) {
            }
        }
        this.f10977b.putOpt("is_ad_event", "1");
        try {
            this.f10977b.putOpt("nt", this.f10988m);
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.f10979d.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f10977b.putOpt(next, this.f10979d.opt(next));
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f10976a) || this.f10977b == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("localId", this.f10976a);
            jSONObject.put("event", b());
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public JSONObject b() {
        if (this.f10978c.get()) {
            return this.f10977b;
        }
        try {
            f();
            com.bytedance.sdk.openadsdk.b.a.a aVar = this.f10985j;
            if (aVar != null) {
                aVar.a(this.f10977b);
            }
            this.f10978c.set(true);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.b("AdEvent", th);
        }
        return this.f10977b;
    }

    public JSONObject c() {
        JSONObject b10 = b();
        try {
            JSONObject jSONObject = new JSONObject(b10.toString());
            jSONObject.remove("app_log_url");
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return b10;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.b.k
    public String d() {
        return this.f10976a;
    }

    @Override // com.bytedance.sdk.openadsdk.b.k
    public boolean e() {
        JSONObject jSONObject = this.f10977b;
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("label");
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(this.f10981f)) {
                return false;
            }
            return b.f11006a.contains(this.f10981f);
        }
        return b.f11006a.contains(optString);
    }
}
