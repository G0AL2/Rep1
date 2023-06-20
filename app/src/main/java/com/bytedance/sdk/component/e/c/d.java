package com.bytedance.sdk.component.e.c;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TNCConfigHandler.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f10359d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f10360a;

    /* renamed from: b  reason: collision with root package name */
    private c f10361b = new c();

    /* renamed from: c  reason: collision with root package name */
    private boolean f10362c;

    /* renamed from: e  reason: collision with root package name */
    private int f10363e;

    public d(Context context, boolean z10, int i10) {
        this.f10362c = true;
        this.f10360a = context;
        this.f10362c = z10;
        this.f10363e = i10;
    }

    private c b(JSONObject jSONObject) {
        try {
            c cVar = new c();
            if (jSONObject.has("local_enable")) {
                cVar.f10344a = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                cVar.f10345b = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        String string = jSONArray.getString(i10);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                cVar.f10346c = hashMap;
            } else {
                cVar.f10346c = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            hashMap2.put(next, string2);
                        }
                    }
                }
                cVar.f10347d = hashMap2;
            } else {
                cVar.f10347d = null;
            }
            cVar.f10348e = jSONObject.optInt("req_to_cnt", cVar.f10348e);
            cVar.f10349f = jSONObject.optInt("req_to_api_cnt", cVar.f10349f);
            cVar.f10350g = jSONObject.optInt("req_to_ip_cnt", cVar.f10350g);
            cVar.f10351h = jSONObject.optInt("req_err_cnt", cVar.f10351h);
            cVar.f10352i = jSONObject.optInt("req_err_api_cnt", cVar.f10352i);
            cVar.f10353j = jSONObject.optInt("req_err_ip_cnt", cVar.f10353j);
            cVar.f10354k = jSONObject.optInt("update_interval", cVar.f10354k);
            cVar.f10355l = jSONObject.optInt("update_random_range", cVar.f10355l);
            cVar.f10356m = jSONObject.optString("http_code_black", cVar.f10356m);
            return cVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d1657027613220dc(java.lang.String r2) {
        /*
        L0:
            r0 = 74
            r1 = 55
        L4:
            switch(r0) {
                case 72: goto L0;
                case 73: goto L8;
                case 74: goto Lb;
                default: goto L7;
            }
        L7:
            goto L2b
        L8:
            switch(r1) {
                case 94: goto L26;
                case 95: goto Lf;
                case 96: goto Lf;
                default: goto Lb;
            }
        Lb:
            switch(r1) {
                case 55: goto L26;
                case 56: goto L26;
                case 57: goto Lf;
                default: goto Le;
            }
        Le:
            goto L26
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
            r0 = 73
            r1 = 96
            goto L4
        L2b:
            r0 = 72
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.c.d.d1657027613220dc(java.lang.String):java.lang.String");
    }

    public void a() {
        if (this.f10362c) {
            String string = this.f10360a.getSharedPreferences(g.a().a(this.f10363e).a(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                com.bytedance.sdk.component.e.d.b.b("TNCConfigHandler", "loadLocalConfig: no existed");
                return;
            }
            try {
                c b10 = b(new JSONObject(string));
                if (b10 != null) {
                    this.f10361b = b10;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("loadLocalConfig: ");
                sb2.append(b10 == null ? "null" : b10.toString());
                com.bytedance.sdk.component.e.d.b.b("TNCConfigHandler", sb2.toString());
            } catch (Throwable th) {
                th.printStackTrace();
                com.bytedance.sdk.component.e.d.b.b("TNCConfigHandler", "loadLocalConfig: except: " + th.getMessage());
            }
        }
    }

    public void a(JSONObject jSONObject) {
        String str;
        if (!this.f10362c) {
            com.bytedance.sdk.component.e.d.b.b("TNCConfigHandler", "handleConfigChanged: no mainProc");
            return;
        }
        g.a().a(this.f10363e).e();
        try {
            boolean z10 = jSONObject.optInt("ttnet_url_dispatcher_enabled", 0) > 0;
            JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_dispatch_actions");
            JSONObject jSONObject2 = null;
            if (g.a().a(this.f10363e).c() && z10 && optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject jSONObject3 = ((JSONObject) optJSONArray.get(i10)).getJSONObject("param");
                    if (jSONObject3.optString("service_name", "").equals("idc_selection")) {
                        arrayList.add(jSONObject3.getJSONObject("strategy_info"));
                    }
                }
                if (!arrayList.isEmpty()) {
                    jSONObject2 = new JSONObject();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObject4 = (JSONObject) it.next();
                        Iterator<String> keys = jSONObject4.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject2.put(next, jSONObject4.getString(next));
                        }
                    }
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("tnc_config");
            if (optJSONObject == null && jSONObject2 == null) {
                com.bytedance.sdk.component.e.d.b.a("TNCConfigHandler", " tnc host_replace_map config is null");
            } else {
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    str = "host_replace_map";
                } else {
                    str = jSONObject2 != null ? "host_replace_map" : "host_replace_map";
                }
                optJSONObject.put(str, jSONObject2);
            }
            c b10 = b(optJSONObject);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("handleConfigChanged, newConfig: ");
            sb2.append(b10 == null ? "null" : b10.toString());
            com.bytedance.sdk.component.e.d.b.b("TNCConfigHandler", sb2.toString());
            if (b10 == null) {
                synchronized (f10359d) {
                    this.f10360a.getSharedPreferences(g.a().a(this.f10363e).a(), 0).edit().putString("tnc_config_str", "").apply();
                    com.bytedance.sdk.component.e.d.c.a(this.f10360a, 1, "", this.f10363e);
                }
                return;
            }
            this.f10361b = b10;
            String jSONObject5 = optJSONObject.toString();
            synchronized (f10359d) {
                this.f10360a.getSharedPreferences(g.a().a(this.f10363e).a(), 0).edit().putString("tnc_config_str", jSONObject5).apply();
                com.bytedance.sdk.component.e.d.c.a(this.f10360a, 1, jSONObject5, this.f10363e);
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                this.f10361b = new c();
                synchronized (f10359d) {
                    this.f10360a.getSharedPreferences(g.a().a(this.f10363e).a(), 0).edit().putString("tnc_config_str", "").apply();
                    com.bytedance.sdk.component.e.d.c.a(this.f10360a, 1, "", this.f10363e);
                }
            } catch (Throwable th2) {
                synchronized (f10359d) {
                    this.f10360a.getSharedPreferences(g.a().a(this.f10363e).a(), 0).edit().putString("tnc_config_str", "").apply();
                    com.bytedance.sdk.component.e.d.c.a(this.f10360a, 1, "", this.f10363e);
                    throw th2;
                }
            }
        }
    }

    public void b() {
        try {
            String a10 = com.bytedance.sdk.component.e.d.c.a(this.f10360a, 1, this.f10363e);
            if (TextUtils.isEmpty(a10)) {
                com.bytedance.sdk.component.e.d.b.b("TNCConfigHandler", "loadLocalConfigForOtherProcess, data empty");
                return;
            }
            c b10 = b(new JSONObject(a10));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("loadLocalConfigForOtherProcess, config: ");
            sb2.append(b10 == null ? "null" : b10.toString());
            com.bytedance.sdk.component.e.d.b.b("TNCConfigHandler", sb2.toString());
            if (b10 != null) {
                this.f10361b = b10;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.e.d.b.b("TNCConfigHandler", "loadLocalConfigForOtherProcess, except: " + th.getMessage());
        }
    }

    public c c() {
        return this.f10361b;
    }
}
