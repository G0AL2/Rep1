package com.bytedance.sdk.component.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.a.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AbstractBridge.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected Context f9205a;

    /* renamed from: b  reason: collision with root package name */
    protected m f9206b;

    /* renamed from: c  reason: collision with root package name */
    protected h f9207c;

    /* renamed from: e  reason: collision with root package name */
    protected String f9209e;

    /* renamed from: g  reason: collision with root package name */
    g f9211g;

    /* renamed from: d  reason: collision with root package name */
    protected Handler f9208d = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    protected volatile boolean f9210f = false;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, g> f9212h = new HashMap();

    protected abstract Context a(j jVar);

    protected abstract String a();

    protected abstract void a(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        this.f9211g.a();
        for (g gVar : this.f9212h.values()) {
            gVar.a();
        }
        this.f9208d.removeCallbacksAndMessages(null);
        this.f9210f = true;
    }

    protected abstract void b(j jVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void invokeMethod(final String str) {
        if (this.f9210f) {
            return;
        }
        i.a("Received call: " + str);
        this.f9208d.post(new Runnable() { // from class: com.bytedance.sdk.component.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f9210f) {
                    return;
                }
                q qVar = null;
                try {
                    qVar = a.this.a(new JSONObject(str));
                } catch (JSONException e10) {
                    i.b("Exception thrown while parsing function.", e10);
                }
                if (q.a(qVar)) {
                    i.a("By pass invalid call: " + qVar);
                    if (qVar != null) {
                        a.this.b(y.a(new s(qVar.f9260a, "Failed to parse invocation.")), qVar);
                        return;
                    }
                    return;
                }
                a.this.a(qVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String str, q qVar) {
        a(str);
    }

    protected final void a(q qVar) {
        String a10;
        if (this.f9210f || (a10 = a()) == null) {
            return;
        }
        g b10 = b(qVar.f9266g);
        if (b10 == null) {
            i.b("Received call with unknown namespace, " + qVar);
            m mVar = this.f9206b;
            if (mVar != null) {
                mVar.a(a(), qVar.f9263d, 2);
            }
            b(y.a(new s(-4, "Namespace " + qVar.f9266g + " unknown.")), qVar);
            return;
        }
        f fVar = new f();
        fVar.f9221b = a10;
        fVar.f9220a = this.f9205a;
        fVar.f9222c = b10;
        try {
            g.a a11 = b10.a(qVar, fVar);
            if (a11 == null) {
                i.b("Received call but not registered, " + qVar);
                m mVar2 = this.f9206b;
                if (mVar2 != null) {
                    mVar2.a(a(), qVar.f9263d, 2);
                }
                b(y.a(new s(-2, "Function " + qVar.f9263d + " is not registered.")), qVar);
                return;
            }
            if (a11.f9239a) {
                b(a11.f9240b, qVar);
            }
            m mVar3 = this.f9206b;
            if (mVar3 != null) {
                mVar3.a(a(), qVar.f9263d);
            }
        } catch (Exception e10) {
            i.a("call finished with error, " + qVar, e10);
            b(y.a(e10), qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, q qVar) {
        JSONObject jSONObject;
        if (this.f9210f) {
            return;
        }
        if (TextUtils.isEmpty(qVar.f9265f)) {
            i.a("By passing js callback due to empty callback: " + str);
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            i.a(new IllegalArgumentException("Illegal callback data: " + str));
        }
        i.a("Invoking js callback: " + qVar.f9265f);
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        a(p.a().a("__msg_type", "callback").a("__callback_id", qVar.f9265f).a("__params", jSONObject).b(), qVar);
    }

    private g b(String str) {
        if (!TextUtils.equals(str, this.f9209e) && !TextUtils.isEmpty(str)) {
            return this.f9212h.get(str);
        }
        return this.f9211g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(j jVar, v vVar) {
        this.f9205a = a(jVar);
        this.f9207c = jVar.f9246d;
        this.f9206b = jVar.f9251i;
        this.f9211g = new g(jVar, this, vVar);
        this.f9209e = jVar.f9253k;
        b(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public q a(JSONObject jSONObject) {
        if (this.f9210f) {
            return null;
        }
        String optString = jSONObject.optString("__callback_id");
        String optString2 = jSONObject.optString("func");
        String a10 = a();
        if (a10 == null) {
            m mVar = this.f9206b;
            if (mVar != null) {
                mVar.a(null, null, 3);
            }
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String str = "";
            Object opt = jSONObject.opt("params");
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    str = String.valueOf((JSONObject) opt);
                } else if (opt instanceof String) {
                    str = (String) opt;
                } else {
                    str = String.valueOf(opt);
                }
            }
            String string2 = jSONObject.getString("JSSDK");
            String optString3 = jSONObject.optString("namespace");
            return q.a().a(string2).b(string).c(optString2).d(str).e(optString).f(optString3).g(jSONObject.optString("__iframe_url")).a();
        } catch (JSONException e10) {
            i.b("Failed to create call.", e10);
            m mVar2 = this.f9206b;
            if (mVar2 != null) {
                mVar2.a(a10, optString2, 1);
            }
            return q.a(optString, -1);
        }
    }
}
