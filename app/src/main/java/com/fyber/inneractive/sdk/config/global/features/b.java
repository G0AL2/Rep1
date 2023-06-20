package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class b extends e {

    /* renamed from: e  reason: collision with root package name */
    public com.fyber.inneractive.sdk.model.vast.a f16951e;

    public b() {
        super("cta_locale");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.e
    public e b() {
        b bVar = new b();
        a(bVar);
        return bVar;
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str) || this.f16951e != null) {
            return;
        }
        String a10 = a("install_" + str, (String) null);
        String a11 = a("skip_ad_" + str, (String) null);
        this.f16951e = new com.fyber.inneractive.sdk.model.vast.a(a10, a11, a("skip_in_" + str, (String) null));
    }
}
