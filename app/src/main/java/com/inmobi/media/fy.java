package com.inmobi.media;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConfigNetworkResponse.java */
/* loaded from: classes3.dex */
public final class fy {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25510b = "fy";

    /* renamed from: a  reason: collision with root package name */
    Map<String, a> f25511a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private TreeMap<String, fr> f25512c;

    /* renamed from: d  reason: collision with root package name */
    private gy f25513d;

    /* renamed from: e  reason: collision with root package name */
    private fu f25514e;

    /* renamed from: f  reason: collision with root package name */
    private long f25515f;

    /* compiled from: ConfigNetworkResponse.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f25516a;

        /* renamed from: b  reason: collision with root package name */
        fr f25517b;

        /* renamed from: c  reason: collision with root package name */
        fu f25518c;

        a(JSONObject jSONObject, fr frVar) {
            this.f25517b = frVar;
            if (jSONObject != null) {
                try {
                    int i10 = jSONObject.getInt("status");
                    int i11 = 500;
                    if (i10 == 200) {
                        i11 = 200;
                    } else if (i10 == 304) {
                        i11 = 304;
                    } else if (i10 == 404) {
                        i11 = TTAdConstant.DEEPLINK_FALLBACK_CODE;
                    } else if (i10 != 500) {
                        i11 = -1;
                    }
                    this.f25516a = i11;
                    if (i11 != 200) {
                        if (i11 == 304) {
                            String unused = fy.f25510b;
                            this.f25517b.b();
                            return;
                        }
                        this.f25518c = new fu((byte) 1, "Internal error");
                        String unused2 = fy.f25510b;
                        this.f25517b.b();
                        return;
                    }
                    fr a10 = fr.a(this.f25517b.b(), jSONObject.getJSONObject(AppLovinEventTypes.USER_VIEWED_CONTENT), this.f25517b.g());
                    if (a10 != null) {
                        this.f25517b = a10;
                    }
                    fr frVar2 = this.f25517b;
                    if (frVar2 == null || !frVar2.d()) {
                        this.f25518c = new fu((byte) 2, "The received config has failed validation.");
                        String unused3 = fy.f25510b;
                        this.f25517b.b();
                    }
                } catch (JSONException e10) {
                    this.f25518c = new fu((byte) 2, e10.getLocalizedMessage());
                    String unused4 = fy.f25510b;
                    this.f25517b.b();
                }
            }
        }

        public final boolean a() {
            return this.f25518c != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fy(fx fxVar, gy gyVar, long j10) {
        this.f25512c = new TreeMap<>(fxVar.f25509c);
        this.f25513d = gyVar;
        this.f25515f = j10;
        c();
    }

    private static boolean a(int i10) {
        return 500 <= i10 && i10 < 600;
    }

    private void c() {
        if (!this.f25513d.a()) {
            try {
                JSONObject jSONObject = new JSONObject(this.f25513d.b());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (this.f25512c.get(next) != null) {
                        this.f25511a.put(next, new a(jSONObject2, this.f25512c.get(next)));
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("name", a(this.f25512c));
                hashMap.put("lts", b(this.f25512c));
                hh.a().a("ConfigFetched", hashMap);
                return;
            } catch (JSONException e10) {
                this.f25514e = new fu((byte) 2, e10.getLocalizedMessage());
                HashMap hashMap2 = new HashMap();
                hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 1);
                hashMap2.put("name", a(this.f25512c));
                hashMap2.put("lts", b(this.f25512c));
                hashMap2.put("networkType", ib.b());
                hh.a().a("InvalidConfig", hashMap2);
                return;
            }
        }
        for (Map.Entry<String, fr> entry : this.f25512c.entrySet()) {
            a aVar = new a(null, entry.getValue());
            aVar.f25518c = new fu((byte) 0, "Network error in fetching config.");
            this.f25511a.put(entry.getKey(), aVar);
        }
        this.f25514e = new fu((byte) 0, this.f25513d.f25627a.f25606b);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(this.f25513d.f25627a.f25605a));
        hashMap3.put("name", a(this.f25512c));
        hashMap3.put("lts", b(this.f25512c));
        hashMap3.put("networkType", ib.b());
        hh.a().a("InvalidConfig", hashMap3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        gw gwVar;
        gy gyVar = this.f25513d;
        if (gyVar == null || (gwVar = gyVar.f25627a) == null) {
            return false;
        }
        int i10 = gwVar.f25605a;
        return i10 == -7 || a(i10);
    }

    private static String b(Map<String, fr> map) {
        if (map.isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        new ft();
        for (Map.Entry<String, fr> entry : map.entrySet()) {
            sb2.append(ft.c(entry.getKey(), entry.getValue().g()));
            sb2.append(",");
        }
        return "[" + sb2.substring(0, sb2.length() - 1) + "]";
    }

    private static String a(Map<String, fr> map) {
        if (map.isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(",");
        }
        return "[" + sb2.substring(0, sb2.length() - 1) + "]";
    }
}
