package com.chartboost.sdk.impl;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class y1 extends com.chartboost.sdk.Model.a {

    /* renamed from: v  reason: collision with root package name */
    public int f14418v;

    public y1(int i10, JSONObject jSONObject) throws JSONException {
        this.f14418v = i10;
        b2 b10 = c2.b(jSONObject);
        this.f13680u = b10;
        i0 b11 = b(c(b10.d()).b());
        n1 b12 = b11.b();
        a(this.f13680u.a());
        this.f13660a.put("body", this.f13679t);
        this.f13666g = this.f13680u.c();
        this.f13665f = "";
        this.f13676q = b12.c();
        this.f13663d = b12.a();
        this.f13664e = b12.b();
        this.f13667h = b12.f();
        this.f13674o.put("imptrackers", b12.d());
        a(b11);
        this.f13668i = b();
    }

    private void a(i0 i0Var) {
        String c10 = c();
        String str = this.f14418v == 0 ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false";
        this.f13661b.put("{% encoding %}", "base64");
        this.f13661b.put("{% adm %}", i0Var.a());
        this.f13661b.put("{{ ad_type }}", c10);
        this.f13661b.put("{{ show_close_button }}", str);
        this.f13661b.put("{{ preroll_popup }}", "false");
        this.f13661b.put("{{ post_video_reward_toaster_enabled }}", "false");
        if (this.f14418v == 2) {
            this.f13661b.put("{% is_banner %}", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        }
    }

    private i0 b(ArrayList<i0> arrayList) {
        return !arrayList.isEmpty() ? arrayList.get(0) : new i0();
    }

    private String c() {
        int i10 = this.f14418v;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "" : "10" : "9" : "8";
    }

    public b2 d() {
        return this.f13680u;
    }

    private n2 c(ArrayList<n2> arrayList) {
        return !arrayList.isEmpty() ? arrayList.get(0) : new n2();
    }

    private void a(ArrayList<com.chartboost.sdk.Model.b> arrayList) {
        if (!arrayList.isEmpty()) {
            this.f13679t = arrayList.get(0);
        } else {
            this.f13679t = new com.chartboost.sdk.Model.b("", "", "");
        }
    }
}
