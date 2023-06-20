package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes.dex */
public class h extends e {
    public h() {
        super("omsdk");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.e
    public e b() {
        h hVar = new h();
        a(hVar);
        return hVar;
    }

    public boolean c() {
        boolean a10 = a("enable", false);
        IAlog.a("OMSDK AB %s", String.valueOf(a10));
        return a10;
    }
}
