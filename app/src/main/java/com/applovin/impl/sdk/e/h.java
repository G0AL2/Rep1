package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class h extends a {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.d f8379a;

    public h(com.applovin.impl.sdk.ad.d dVar, String str, com.applovin.impl.sdk.m mVar) {
        super(str, mVar);
        this.f8379a = dVar;
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

    private Map<String, String> i() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.f8379a.a());
        if (this.f8379a.c() != null) {
            hashMap.put("AppLovin-Ad-Size", this.f8379a.c().getLabel());
        }
        if (this.f8379a.d() != null) {
            hashMap.put("AppLovin-Ad-Type", this.f8379a.d().getLabel());
        }
        return hashMap;
    }

    protected abstract a a(JSONObject jSONObject);

    protected Map<String, String> a() {
        HashMap hashMap = new HashMap(4);
        hashMap.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f8379a.a());
        if (this.f8379a.c() != null) {
            hashMap.put("size", this.f8379a.c().getLabel());
        }
        if (this.f8379a.d() != null) {
            hashMap.put("require", this.f8379a.d().getLabel());
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i10) {
        if (com.applovin.impl.sdk.v.a()) {
            d("Unable to fetch " + this.f8379a + " ad: server returned " + i10);
        }
        if (i10 == -800) {
            this.f8349b.T().a(com.applovin.impl.sdk.d.f.f8325h);
        }
    }

    protected abstract String b();

    protected void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.utils.h.d(jSONObject, this.f8349b);
        com.applovin.impl.sdk.utils.h.c(jSONObject, this.f8349b);
        com.applovin.impl.sdk.utils.h.e(jSONObject, this.f8349b);
        com.applovin.impl.sdk.ad.d.a(jSONObject);
        this.f8349b.S().a(a(jSONObject));
    }

    protected abstract String c();

    /* JADX INFO: Access modifiers changed from: protected */
    public com.applovin.impl.sdk.ad.b h() {
        return this.f8379a.e() ? com.applovin.impl.sdk.ad.b.APPLOVIN_PRIMARY_ZONE : com.applovin.impl.sdk.ad.b.APPLOVIN_CUSTOM_ZONE;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, String> map;
        if (com.applovin.impl.sdk.v.a()) {
            a("Fetching next ad of zone: " + this.f8379a);
        }
        if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.dF)).booleanValue() && Utils.isVPNConnected() && com.applovin.impl.sdk.v.a()) {
            a("User is connected to a VPN");
        }
        com.applovin.impl.sdk.d.g T = this.f8349b.T();
        T.a(com.applovin.impl.sdk.d.f.f8318a);
        com.applovin.impl.sdk.d.f fVar = com.applovin.impl.sdk.d.f.f8320c;
        if (T.b(fVar) == 0) {
            T.b(fVar, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f8349b.u().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.f8216de)).booleanValue()) {
                JSONObject jSONObject = new JSONObject(this.f8349b.V().a(a(), false, true));
                map = new HashMap<>();
                map.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8349b.z());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
                andResetCustomPostBody = jSONObject;
            } else {
                Map<String, String> stringifyObjectMap = Utils.stringifyObjectMap(this.f8349b.V().a(a(), false, false));
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = "GET";
                }
                map = stringifyObjectMap;
            }
            if (Utils.isDspDemoApp(f())) {
                map.putAll(this.f8349b.u().getAndResetCustomQueryParams());
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(i());
            a(T);
            c.a b10 = com.applovin.impl.sdk.network.c.a(this.f8349b).a(b()).c(c()).a(map).b(str).b(hashMap).a((c.a) new JSONObject()).a(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.cS)).intValue()).a(((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.cT)).booleanValue()).b(((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.cU)).booleanValue()).b(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.cR)).intValue());
            if (andResetCustomPostBody != null) {
                b10.a(andResetCustomPostBody);
                b10.d(((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.ex)).booleanValue());
            }
            u<JSONObject> uVar = new u<JSONObject>(b10.a(), this.f8349b) { // from class: com.applovin.impl.sdk.e.h.1
                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(int i10, String str2, JSONObject jSONObject2) {
                    h.this.a(i10);
                }

                @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
                public void a(JSONObject jSONObject2, int i10) {
                    if (i10 != 200) {
                        h.this.a(i10);
                        return;
                    }
                    JsonUtils.putLong(jSONObject2, "ad_fetch_latency_millis", ((u) this).f8454d.a());
                    JsonUtils.putLong(jSONObject2, "ad_fetch_response_size", ((u) this).f8454d.b());
                    h.this.b(jSONObject2);
                }
            };
            uVar.a(com.applovin.impl.sdk.c.b.aR);
            uVar.b(com.applovin.impl.sdk.c.b.aS);
            this.f8349b.S().a((a) uVar);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Unable to fetch ad " + this.f8379a, th);
            }
            a(0);
        }
    }
}
