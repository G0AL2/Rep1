package com.applovin.impl.mediation.d;

import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends h {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f7444a = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f7445b = {"ads", "settings", "signal_providers"};

    public static String a(m mVar) {
        return h.a((String) mVar.a(com.applovin.impl.sdk.c.a.f8167c), "1.0/mediate", mVar);
    }

    public static void a(JSONObject jSONObject, m mVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f7444a);
            mVar.a((d<d<String>>) d.f8254x, (d<String>) shallowCopy.toString());
        }
    }

    public static String b(m mVar) {
        return h.a((String) mVar.a(com.applovin.impl.sdk.c.a.f8168d), "1.0/mediate", mVar);
    }

    public static void b(JSONObject jSONObject, m mVar) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            mVar.b(d.f8255y);
            return;
        }
        JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(shallowCopy, f7445b);
        mVar.a((d<d<String>>) d.f8255y, (d<String>) shallowCopy.toString());
    }

    public static String c(m mVar) {
        return h.a((String) mVar.a(com.applovin.impl.sdk.c.a.f8167c), "1.0/mediate_debug", mVar);
    }

    public static String d(m mVar) {
        return h.a((String) mVar.a(com.applovin.impl.sdk.c.a.f8168d), "1.0/mediate_debug", mVar);
    }
}
