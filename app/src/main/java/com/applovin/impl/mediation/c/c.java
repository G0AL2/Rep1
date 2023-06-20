package com.applovin.impl.mediation.c;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7381a;

    /* renamed from: c  reason: collision with root package name */
    private final MaxAdFormat f7382c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Object> f7383d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Object> f7384e;

    /* renamed from: f  reason: collision with root package name */
    private final JSONArray f7385f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f7386g;

    /* renamed from: h  reason: collision with root package name */
    private final a.InterfaceC0115a f7387h;

    public c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, JSONArray jSONArray, Context context, m mVar, a.InterfaceC0115a interfaceC0115a) {
        super("TaskFetchMediatedAd " + str, mVar);
        this.f7381a = str;
        this.f7382c = maxAdFormat;
        this.f7383d = map;
        this.f7384e = map2;
        this.f7385f = jSONArray;
        this.f7386g = context;
        this.f7387h = interfaceC0115a;
    }

    private String a() {
        return com.applovin.impl.mediation.d.b.a(this.f8349b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        if (v.a()) {
            d("Unable to fetch " + this.f7381a + " ad: server returned " + i10);
        }
        if (i10 == -800) {
            this.f8349b.T().a(com.applovin.impl.sdk.d.f.f8332o);
        }
        j.a(this.f7387h, this.f7381a, i10 == -1009 ? new MaxErrorImpl(-1009, str) : i10 == -1001 ? new MaxErrorImpl(-1001, str) : StringUtils.isValidString(str) ? new MaxErrorImpl(MaxErrorCode.NETWORK_ERROR, str) : new MaxErrorImpl(-1));
    }

    private void a(com.applovin.impl.sdk.d.g gVar) {
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f8320c;
        long b10 = gVar.b(fVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b10 > TimeUnit.MINUTES.toMillis(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.dk)).intValue())) {
            gVar.b(fVar, currentTimeMillis);
            gVar.c(com.applovin.impl.sdk.d.f.f8321d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        try {
            h.d(jSONObject, this.f8349b);
            h.c(jSONObject, this.f8349b);
            h.e(jSONObject, this.f8349b);
            h.f(jSONObject, this.f8349b);
            com.applovin.impl.mediation.d.b.a(jSONObject, this.f8349b);
            com.applovin.impl.mediation.d.b.b(jSONObject, this.f8349b);
            com.applovin.impl.sdk.f.a(this.f8349b);
            if (this.f7382c != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null)) && v.a()) {
                v.i(e(), "Ad format requested does not match ad unit id's format.");
            }
            this.f8349b.S().a((com.applovin.impl.sdk.e.a) b(jSONObject));
        } catch (Throwable th) {
            if (v.a()) {
                a("Unable to process mediated ad response", th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private e b(JSONObject jSONObject) {
        return new e(this.f7381a, this.f7382c, this.f7383d, jSONObject, this.f7386g, this.f8349b, this.f7387h);
    }

    private String b() {
        return com.applovin.impl.mediation.d.b.b(this.f8349b);
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.f7381a);
        hashMap.put("AppLovin-Ad-Format", this.f7382c.getLabel());
        return hashMap;
    }

    private void c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray((Collection) this.f8349b.C().c()));
            jSONObject2.put("installed", com.applovin.impl.mediation.d.c.a(this.f8349b));
            jSONObject2.put("initialized", this.f8349b.D().c());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f8349b.D().b()));
            jSONObject2.put("loaded_classnames", new JSONArray((Collection) this.f8349b.C().a()));
            jSONObject2.put("failed_classnames", new JSONArray((Collection) this.f8349b.C().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e10) {
            if (v.a()) {
                a("Failed to populate adapter classNames", e10);
            }
            throw new RuntimeException("Failed to populate classNames: " + e10);
        }
    }

    private void d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f7385f;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f7381a);
        jSONObject2.put("ad_format", this.f7382c.getLabel());
        HashMap hashMap = new HashMap(this.f7384e);
        com.applovin.impl.mediation.a.a a10 = this.f8349b.F().a(this.f7381a);
        if (a10 != null) {
            hashMap.put("previous_winning_network", a10.L());
            hashMap.put("previous_winning_network_name", a10.getNetworkName());
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(hashMap));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f8349b.E().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !Utils.isDspDemoApp(this.f8349b.L())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f8349b.p().getExtraParameters()));
    }

    private JSONObject h() throws JSONException {
        JSONObject jSONObject = new JSONObject(this.f8349b.V().a(null, false, true));
        e(jSONObject);
        d(jSONObject);
        c(jSONObject);
        f(jSONObject);
        g(jSONObject);
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (v.a()) {
            a("Fetching next ad for ad unit id: " + this.f7381a + " and format: " + this.f7382c);
        }
        if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.dF)).booleanValue() && Utils.isVPNConnected() && v.a()) {
            a("User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g T = this.f8349b.T();
        T.a(com.applovin.impl.sdk.d.f.f8331n);
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f8320c;
        if (T.b(fVar) == 0) {
            T.b(fVar, System.currentTimeMillis());
        }
        try {
            JSONObject h10 = h();
            HashMap hashMap = new HashMap();
            hashMap.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8349b.z());
            }
            if (this.f8349b.J().a()) {
                hashMap.put("test_mode", "1");
            }
            String c10 = this.f8349b.J().c();
            if (StringUtils.isValidString(c10)) {
                hashMap.put("filter_ad_network", c10);
                if (!this.f8349b.J().a()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.f8349b.J().b()) {
                    hashMap.put("force_ad_network", c10);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(c());
            a(T);
            u<JSONObject> uVar = new u<JSONObject>(com.applovin.impl.sdk.network.c.a(this.f8349b).b("POST").b(hashMap2).a(a()).c(b()).a((Map<String, String>) hashMap).a(h10).d(((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.a.U)).booleanValue()).a((c.a) new JSONObject()).b(((Long) this.f8349b.a(com.applovin.impl.sdk.c.a.f8170f)).intValue()).a(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.cS)).intValue()).c(((Long) this.f8349b.a(com.applovin.impl.sdk.c.a.f8169e)).intValue()).a(), this.f8349b) { // from class: com.applovin.impl.mediation.c.c.1
                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(int i10, String str, JSONObject jSONObject) {
                    c.this.a(i10, str);
                }

                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject, int i10) {
                    if (i10 != 200) {
                        c.this.a(i10, (String) null);
                        return;
                    }
                    JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", ((u) this).f8454d.a());
                    JsonUtils.putLong(jSONObject, "ad_fetch_response_size", ((u) this).f8454d.b());
                    c.this.a(jSONObject);
                }
            };
            uVar.a(com.applovin.impl.sdk.c.a.f8167c);
            uVar.b(com.applovin.impl.sdk.c.a.f8168d);
            this.f8349b.S().a((com.applovin.impl.sdk.e.a) uVar);
        } catch (Throwable th) {
            if (v.a()) {
                a("Unable to fetch ad " + this.f7381a, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
