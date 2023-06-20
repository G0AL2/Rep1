package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m implements com.fyber.inneractive.sdk.cache.a<l> {
    @Override // com.fyber.inneractive.sdk.cache.a
    public /* bridge */ /* synthetic */ void a(l lVar) {
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String b() {
        return "IALastModifiedFromHeader.remote";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String c() {
        return "ia-remote.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public l a(String str) throws Exception {
        try {
            return l.a(new JSONObject(str));
        } catch (Exception e10) {
            IAlog.b("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.f20222a <= 5) {
                e10.printStackTrace();
            }
            throw e10;
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String a() {
        int i10 = com.fyber.inneractive.sdk.config.e.f16935a;
        return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl") == null ? String.format(Locale.ENGLISH, "https://%sfeatures_config.json", "cdn2.inner-active.mobi/ia-sdk-config/") : System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
    }
}
