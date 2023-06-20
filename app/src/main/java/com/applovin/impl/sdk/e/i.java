package com.applovin.impl.sdk.e;

import android.app.ActivityManager;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.android.gms.security.ProviderInstaller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f8381a = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final int f8382c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8383d;

    /* renamed from: e  reason: collision with root package name */
    private a f8384e;

    /* loaded from: classes.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes.dex */
    private class b extends com.applovin.impl.sdk.e.a {
        public b(com.applovin.impl.sdk.m mVar) {
            super("TaskTimeoutFetchBasicSettings", mVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (i.this.f8383d) {
                if (i.this.f8384e != null) {
                    if (com.applovin.impl.sdk.v.a()) {
                        d("Timing out fetch basic settings...");
                    }
                    i.this.a(new JSONObject());
                }
            }
        }
    }

    public i(int i10, com.applovin.impl.sdk.m mVar, a aVar) {
        super("TaskFetchBasicSettings", mVar, true);
        this.f8383d = new Object();
        this.f8382c = i10;
        this.f8384e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        synchronized (this.f8383d) {
            a aVar = this.f8384e;
            if (aVar != null) {
                aVar.a(jSONObject);
                this.f8384e = null;
            }
        }
    }

    private String c() {
        return com.applovin.impl.sdk.utils.h.a((String) this.f8349b.a(com.applovin.impl.sdk.c.b.aP), "5.0/i", d());
    }

    private String h() {
        return com.applovin.impl.sdk.utils.h.a((String) this.f8349b.a(com.applovin.impl.sdk.c.b.aQ), "5.0/i", d());
    }

    protected Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f8349b.z());
        }
        Boolean a10 = com.applovin.impl.sdk.j.b().a(f());
        if (a10 != null) {
            hashMap.put("huc", a10.toString());
        }
        Boolean a11 = com.applovin.impl.sdk.j.a().a(f());
        if (a11 != null) {
            hashMap.put("aru", a11.toString());
        }
        Boolean a12 = com.applovin.impl.sdk.j.c().a(f());
        if (a12 != null) {
            hashMap.put("dns", a12.toString());
        }
        return hashMap;
    }

    protected JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            jSONObject.put("is_cross_promo", this.f8349b.e());
            jSONObject.put("init_count", this.f8382c);
            jSONObject.put("server_installed_at", this.f8349b.a(com.applovin.impl.sdk.c.b.f8197af));
            String userEngagementSdkVersion = Utils.getUserEngagementSdkVersion();
            if (StringUtils.isValidString(userEngagementSdkVersion)) {
                jSONObject.put("ue_sdk_version", userEngagementSdkVersion);
            }
            if (this.f8349b.P()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f8349b.Q()) {
                jSONObject.put("first_install_v2", true);
            }
            String str = (String) this.f8349b.a(com.applovin.impl.sdk.c.b.dz);
            if (StringUtils.isValidString(str)) {
                jSONObject.put("plugin_version", str);
            }
            String t10 = this.f8349b.t();
            if (StringUtils.isValidString(t10)) {
                jSONObject.put("mediation_provider", t10);
            }
            jSONObject.put("installed_mediation_adapters", com.applovin.impl.mediation.d.c.a(this.f8349b));
            Map<String, Object> h10 = this.f8349b.V().h();
            jSONObject.put("package_name", h10.get("package_name"));
            jSONObject.put("app_version", h10.get("app_version"));
            jSONObject.put("test_ads", h10.get("test_ads"));
            jSONObject.put("debug", h10.get("debug"));
            jSONObject.put("tg", h10.get("tg"));
            jSONObject.put("target_sdk", h10.get("target_sdk"));
            List<String> initializationAdUnitIds = this.f8349b.p().getInitializationAdUnitIds();
            if (initializationAdUnitIds != null && initializationAdUnitIds.size() > 0) {
                List<String> removeTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(initializationAdUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(removeTrimmedEmptyStrings, removeTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", h10.get("IABTCF_TCString"));
            jSONObject.put("IABTCF_TCString", h10.get("IABTCF_gdprApplies"));
            Map<String, Object> b10 = this.f8349b.V().b();
            jSONObject.put("platform", b10.get("platform"));
            jSONObject.put("os", b10.get("os"));
            jSONObject.put("locale", b10.get("locale"));
            jSONObject.put("brand", b10.get("brand"));
            jSONObject.put("brand_name", b10.get("brand_name"));
            jSONObject.put("hardware", b10.get("hardware"));
            jSONObject.put("model", b10.get("model"));
            jSONObject.put("revision", b10.get("revision"));
            jSONObject.put("is_tablet", b10.get("is_tablet"));
            jSONObject.put("screen_size_in", b10.get("screen_size_in"));
            if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.dI)).booleanValue()) {
                jSONObject.put("mtl", this.f8349b.ad().b());
            }
            try {
                ActivityManager activityManager = (ActivityManager) this.f8349b.L().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            Map<String, String> allData = this.f8349b.r().getAllData();
            if (!allData.isEmpty()) {
                jSONObject.put("targeting_data", new JSONObject(allData));
            }
            o.a k10 = this.f8349b.V().k();
            jSONObject.put("dnt", k10.f8766a);
            if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.dx)).booleanValue() && StringUtils.isValidString(k10.f8767b)) {
                jSONObject.put("idfa", k10.f8767b);
            }
            o.b l10 = this.f8349b.V().l();
            if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.dq)).booleanValue() && l10 != null) {
                jSONObject.put("idfv", l10.f8768a);
                jSONObject.put("idfv_scope", l10.f8769b);
            }
            String name = this.f8349b.q().getName();
            if (StringUtils.isValidString(name)) {
                jSONObject.put("user_segment_name", StringUtils.encodeUriString(name, this.f8349b));
            }
            if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.dt)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f8349b.n());
            }
            if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.dv)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f8349b.o());
            }
            if (this.f8349b.J().a()) {
                jSONObject.put("test_mode", true);
            }
            String c10 = this.f8349b.J().c();
            if (StringUtils.isValidString(c10)) {
                jSONObject.put("test_mode_network", c10);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f8349b.p().getExtraParameters()));
        } catch (JSONException e10) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Failed to construct JSON body", e10);
            }
        }
        return jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.applovin.impl.sdk.utils.g.i() && f8381a.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(this.f8349b.L());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.v.a()) {
                    a("Cannot update security provider", th);
                }
            }
        }
        Map<String, String> a10 = a();
        c.a c10 = com.applovin.impl.sdk.network.c.a(this.f8349b).a(c()).c(h()).a(a10).a(b()).d(((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.ev)).booleanValue()).b("POST").a((c.a) new JSONObject()).a(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.cY)).intValue()).c(((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.f8213db)).intValue());
        com.applovin.impl.sdk.m mVar = this.f8349b;
        com.applovin.impl.sdk.c.b<Integer> bVar = com.applovin.impl.sdk.c.b.cX;
        com.applovin.impl.sdk.network.c a11 = c10.b(((Integer) mVar.a(bVar)).intValue()).a();
        this.f8349b.S().a(new b(this.f8349b), o.a.TIMEOUT, ((Integer) this.f8349b.a(bVar)).intValue() + 250);
        u<JSONObject> uVar = new u<JSONObject>(a11, this.f8349b, g()) { // from class: com.applovin.impl.sdk.e.i.1
            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, JSONObject jSONObject) {
                if (com.applovin.impl.sdk.v.a()) {
                    d("Unable to fetch basic SDK settings: server returned " + i10);
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                i.this.a(jSONObject);
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(JSONObject jSONObject, int i10) {
                i.this.a(jSONObject);
            }
        };
        uVar.a(com.applovin.impl.sdk.c.b.aP);
        uVar.b(com.applovin.impl.sdk.c.b.aQ);
        this.f8349b.S().a((com.applovin.impl.sdk.e.a) uVar);
    }
}
