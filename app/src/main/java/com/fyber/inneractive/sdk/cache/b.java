package com.fyber.inneractive.sdk.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements a<com.fyber.inneractive.sdk.config.h> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16819a = String.format("https://%sconfig_android.json", "cdn2.inner-active.mobi/ia-sdk-config/");

    @Override // com.fyber.inneractive.sdk.cache.a
    public /* bridge */ /* synthetic */ void a(com.fyber.inneractive.sdk.config.h hVar) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String b() {
        return "IALastModifiedFromHeader.global";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String c() {
        return "ia-global.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public com.fyber.inneractive.sdk.config.h a(String str) throws Exception {
        try {
            return com.fyber.inneractive.sdk.config.h.a(new JSONObject(str));
        } catch (JSONException e10) {
            IAlog.b("internal error while parsing global config file", new Object[0]);
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String a() {
        int i10 = com.fyber.inneractive.sdk.config.e.f16935a;
        if (System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl") == null) {
            return f16819a;
        }
        return System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }
}
