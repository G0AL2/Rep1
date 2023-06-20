package com.bytedance.sdk.openadsdk.h.c;

import android.text.TextUtils;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.openadsdk.b.k;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.l;
import com.bytedance.sdk.openadsdk.utils.t;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* compiled from: LogUploaderImpl.java */
/* loaded from: classes.dex */
public class c implements com.bytedance.sdk.openadsdk.h.c.a {

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f13314b = Collections.synchronizedList(new LinkedList());

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f13315c = Executors.newSingleThreadExecutor();

    /* renamed from: a  reason: collision with root package name */
    private final b f13313a = b.a();

    public static com.bytedance.sdk.openadsdk.h.c.a c() {
        return e.c();
    }

    @Override // com.bytedance.sdk.openadsdk.h.c.a
    public void a() {
        this.f13315c.execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.h.c.c.1
            @Override // java.lang.Runnable
            public void run() {
                List<a> d10 = c.this.f13313a.d();
                if (d10 != null) {
                    c.this.f13314b.addAll(d10);
                }
                c.this.f13313a.c();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.h.c.a
    public void b() {
        ExecutorService executorService = this.f13315c;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.h.c.a
    public void a(com.bytedance.sdk.openadsdk.h.a aVar) {
        a(aVar, false);
    }

    @Override // com.bytedance.sdk.openadsdk.h.c.a
    public void a(final com.bytedance.sdk.openadsdk.h.a aVar, final boolean z10) {
        if (aVar == null || !com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return;
        }
        t.b(new g("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.h.c.c.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    a aVar2 = new a(l.a(), aVar.a().a());
                    if (z10) {
                        m.e().a(aVar2);
                    } else {
                        m.d().a(aVar2);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* compiled from: LogUploaderImpl.java */
    /* loaded from: classes.dex */
    public static class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final String f13320a;

        /* renamed from: b  reason: collision with root package name */
        public final JSONObject f13321b;

        public a(String str, JSONObject jSONObject) {
            this.f13320a = str;
            this.f13321b = jSONObject;
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

        @Override // com.bytedance.sdk.openadsdk.b.k
        public String d() {
            return this.f13320a;
        }

        @Override // com.bytedance.sdk.openadsdk.b.k
        public boolean e() {
            return false;
        }

        public String a() {
            if (TextUtils.isEmpty(this.f13320a) || this.f13321b == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("localId", this.f13320a);
                jSONObject.put("event", this.f13321b);
            } catch (Throwable unused) {
            }
            return jSONObject.toString();
        }
    }
}
