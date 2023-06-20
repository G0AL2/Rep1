package com.applovin.impl.mediation.debugger.b.b;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7538a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7539b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7540c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7541d;

    public c(JSONObject jSONObject, m mVar) {
        this.f7538a = com.applovin.impl.sdk.utils.d.a(mVar.L()).a();
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "cleartext_traffic", (JSONObject) null);
        boolean z10 = false;
        if (jSONObject2 == null) {
            this.f7539b = false;
            this.f7541d = "";
            this.f7540c = h.a();
            return;
        }
        this.f7539b = true;
        this.f7541d = JsonUtils.getString(jSONObject2, "description", "");
        if (h.a()) {
            this.f7540c = true;
            return;
        }
        List list = JsonUtils.getList(jSONObject2, "domains", new ArrayList());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                } else if (!h.a((String) it.next())) {
                    break;
                }
            }
        }
        this.f7540c = z10;
    }

    public boolean a() {
        return this.f7539b;
    }

    public boolean b() {
        boolean z10 = this.f7540c;
        return z10 && (this.f7538a || z10);
    }

    public String c() {
        return this.f7538a ? this.f7541d : "You must include an entry in your AndroidManifest.xml to point to your network_security_config.xml.\n\nFor more information, visit: https://developer.android.com/training/articles/security-config";
    }
}
