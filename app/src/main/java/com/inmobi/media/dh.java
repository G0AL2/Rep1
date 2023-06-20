package com.inmobi.media;

import android.os.Build;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: TokenRequest.java */
/* loaded from: classes3.dex */
public final class dh extends gx {

    /* renamed from: a  reason: collision with root package name */
    public String f25105a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f25106b;

    public dh(ir irVar) {
        super("POST", null, irVar, false, "application/x-www-form-urlencoded");
        this.f25624s = ho.f();
        this.f25620o = true;
        a(ho.e());
    }

    @Override // com.inmobi.media.gx
    public final void a() {
        String d10;
        super.a();
        ci a10 = jl.a();
        String str = a10.f24927a;
        if (str != null) {
            this.f25613h.put("ufid", str);
        }
        Map<String, String> map = this.f25613h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a10.f24928b);
        map.put("is-unifid-service-used", sb2.toString());
        this.f25613h.putAll(iu.a().d());
        this.f25613h.putAll(Cif.a());
        this.f25613h.put("d-media-volume", String.valueOf(ib.a(ho.c(), this.f25623r)));
        d(this.f25613h);
        String str2 = this.f25105a;
        if (str2 != null) {
            this.f25613h.put("p-keywords", str2);
        }
        Map<String, String> map2 = this.f25106b;
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                if (!this.f25613h.containsKey(entry.getKey())) {
                    this.f25613h.put(entry.getKey(), entry.getValue());
                }
            }
        }
        JSONObject jSONObject = ((ge) fs.a("signals", this.f25624s, null)).ext;
        if (jSONObject != null && jSONObject.length() > 0) {
            this.f25613h.put("im-ext", jSONObject.toString());
        }
        if (Build.VERSION.SDK_INT >= 29 && (d10 = ic.d()) != null) {
            this.f25613h.put("d-device-gesture-margins", d10);
        }
        Map<String, String> map3 = this.f25613h;
        fq fqVar = (fq) fs.a("ads", this.f25624s, null);
        boolean z10 = true;
        map3.put("cct-enabled", String.valueOf((!(fqVar != null && fqVar.cctEnabled) || h.a(ho.c()) == null) ? false : false));
        this.f25613h.putAll(ig.d());
        this.f25613h.putAll(ic.c());
        this.f25613h.putAll(iz.a("InMobi"));
    }
}
