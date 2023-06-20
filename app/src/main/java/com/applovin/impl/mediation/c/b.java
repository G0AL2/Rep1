package com.applovin.impl.mediation.c;

import android.content.Context;
import com.applovin.impl.mediation.a.g;
import com.applovin.impl.mediation.a.h;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private static String f7367a;

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdFormat f7368c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f7369d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f7370e;

    /* renamed from: f  reason: collision with root package name */
    private final a f7371f;

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONArray jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.mediation.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0117b implements g.a, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final a f7375a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f7376b;

        /* renamed from: c  reason: collision with root package name */
        private int f7377c;

        /* renamed from: d  reason: collision with root package name */
        private final AtomicBoolean f7378d;

        /* renamed from: e  reason: collision with root package name */
        private final Collection<com.applovin.impl.mediation.a.g> f7379e;

        /* renamed from: f  reason: collision with root package name */
        private final v f7380f;

        private RunnableC0117b(int i10, a aVar, v vVar) {
            this.f7377c = i10;
            this.f7375a = aVar;
            this.f7380f = vVar;
            this.f7376b = new Object();
            this.f7379e = new ArrayList(i10);
            this.f7378d = new AtomicBoolean();
        }

        private void a() {
            ArrayList<com.applovin.impl.mediation.a.g> arrayList;
            String str;
            String d10;
            synchronized (this.f7376b) {
                arrayList = new ArrayList(this.f7379e);
            }
            JSONArray jSONArray = new JSONArray();
            for (com.applovin.impl.mediation.a.g gVar : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    h a10 = gVar.a();
                    jSONObject.put("name", a10.L());
                    jSONObject.put("class", a10.K());
                    jSONObject.put("adapter_version", gVar.c());
                    jSONObject.put("sdk_version", gVar.b());
                    JSONObject jSONObject2 = new JSONObject();
                    if (StringUtils.isValidString(gVar.e())) {
                        str = "error_message";
                        d10 = gVar.e();
                    } else {
                        str = "signal";
                        d10 = gVar.d();
                    }
                    jSONObject2.put(str, d10);
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (v.a()) {
                        v vVar = this.f7380f;
                        vVar.b("TaskCollectSignals", "Collected signal from " + a10);
                    }
                } catch (JSONException e10) {
                    if (v.a()) {
                        this.f7380f.b("TaskCollectSignals", "Failed to create signal data", e10);
                    }
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            a aVar = this.f7375a;
            if (aVar != null) {
                aVar.a(jSONArray);
            }
        }

        @Override // com.applovin.impl.mediation.a.g.a
        public void a(com.applovin.impl.mediation.a.g gVar) {
            boolean z10;
            synchronized (this.f7376b) {
                this.f7379e.add(gVar);
                int i10 = this.f7377c - 1;
                this.f7377c = i10;
                z10 = i10 < 1;
            }
            if (z10 && this.f7378d.compareAndSet(false, true)) {
                a();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7378d.compareAndSet(false, true)) {
                a();
            }
        }
    }

    static {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(a("APPLOVIN_NETWORK", "com.applovin.mediation.adapters.AppLovinMediationAdapter"));
            a("FACEBOOK_NETWORK", "com.applovin.mediation.adapters.FacebookMediationAdapter").put("run_on_ui_thread", false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("signal_providers", jSONArray);
            f7367a = jSONObject.toString();
        } catch (JSONException unused) {
        }
    }

    public b(MaxAdFormat maxAdFormat, Map<String, Object> map, Context context, m mVar, a aVar) {
        super("TaskCollectSignals", mVar);
        this.f7368c = maxAdFormat;
        this.f7369d = map;
        this.f7370e = context;
        this.f7371f = aVar;
    }

    private static JSONObject a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("class", str2);
        jSONObject.put("adapter_timeout_ms", 30000);
        jSONObject.put("max_signal_length", 32768);
        jSONObject.put("scode", "");
        return jSONObject;
    }

    private void a(final h hVar, final g.a aVar) {
        if (hVar.S()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    ((com.applovin.impl.sdk.e.a) b.this).f8349b.E().collectSignal(b.this.f7368c, hVar, b.this.f7370e, aVar);
                }
            });
        } else {
            this.f8349b.E().collectSignal(this.f7368c, hVar, this.f7370e, aVar);
        }
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException, InterruptedException {
        RunnableC0117b runnableC0117b = new RunnableC0117b(jSONArray.length(), this.f7371f, this.f8349b.A());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            a(new h(this.f7369d, jSONArray.getJSONObject(i10), jSONObject, this.f8349b), runnableC0117b);
        }
        this.f8349b.S().a(new z(this.f8349b, runnableC0117b), o.a.MAIN, ((Long) this.f8349b.a(com.applovin.impl.sdk.c.a.f8175k)).longValue());
    }

    private void b(String str, Throwable th) {
        if (v.a()) {
            a("No signals collected: " + str, th);
        }
        a aVar = this.f7371f;
        if (aVar != null) {
            aVar.a(new JSONArray());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject((String) this.f8349b.b((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f8254x, (com.applovin.impl.sdk.c.d<String>) f7367a));
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray != null && jSONArray.length() != 0) {
                a(jSONArray, jSONObject);
                return;
            }
            b("No signal providers found", null);
        } catch (InterruptedException e10) {
            e = e10;
            str = "Failed to wait for signals";
            b(str, e);
        } catch (JSONException e11) {
            e = e11;
            str = "Failed to parse signals JSON";
            b(str, e);
        } catch (Throwable th) {
            e = th;
            str = "Failed to collect signals";
            b(str, e);
        }
    }
}
