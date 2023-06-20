package com.inmobi.media;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ConfigNetworkRequest.java */
/* loaded from: classes3.dex */
public final class fx extends gx {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25504d = "fx";

    /* renamed from: e  reason: collision with root package name */
    private static String f25505e = "https://config.inmobi.com/config-server/v1/config/secure.cfg";

    /* renamed from: u  reason: collision with root package name */
    private static Map<String, String> f25506u;

    /* renamed from: a  reason: collision with root package name */
    int f25507a;

    /* renamed from: b  reason: collision with root package name */
    int f25508b;

    /* renamed from: c  reason: collision with root package name */
    Map<String, fr> f25509c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fx(Map<String, fr> map, ir irVar, String str, int i10, int i11, boolean z10, String str2) {
        this(map, irVar, str, i10, i11, false, z10, str2);
    }

    private String h() {
        new ft();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, fr> entry : this.f25509c.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("n", entry.getKey());
                jSONObject.put("t", entry.getValue().g() == null ? 0L : ft.c(entry.getKey(), entry.getValue().g()));
                jSONArray.put(jSONObject);
            }
            return jSONArray.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    @Override // com.inmobi.media.gx
    public final void a() {
        super.a();
        this.f25613h.put("p", h());
        this.f25613h.put("im-accid", this.f25624s);
        Map<String, String> map = f25506u;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!this.f25611f.containsKey(entry.getKey())) {
                    this.f25611f.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public final String b() {
        return this.f25624s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fx(Map<String, fr> map, ir irVar, String str, int i10, int i11, boolean z10, boolean z11, String str2) {
        super("POST", ((map.get("root") != null) || str == null || str.trim().length() == 0) ? z10 ? "https://config.inmobi.com/config-server/v1/config/secure.cfg" : f25505e : str, irVar, z11, "application/x-www-form-urlencoded");
        this.f25509c = map;
        this.f25507a = i10;
        this.f25508b = i11;
        this.f25624s = str2;
    }
}
