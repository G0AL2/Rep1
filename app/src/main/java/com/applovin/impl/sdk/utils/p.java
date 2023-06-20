package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.v;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f8935a;

    /* renamed from: b  reason: collision with root package name */
    private String f8936b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8937c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8938d;

    public p(com.applovin.impl.sdk.m mVar) {
        this.f8935a = mVar;
        this.f8937c = a(com.applovin.impl.sdk.c.d.f8237g, (String) com.applovin.impl.sdk.c.e.b(com.applovin.impl.sdk.c.d.f8236f, (Object) null, mVar.L()));
        this.f8938d = a(com.applovin.impl.sdk.c.d.f8238h, (String) mVar.a(com.applovin.impl.sdk.c.b.X));
        a(d());
    }

    private String a(com.applovin.impl.sdk.c.d<String> dVar, String str) {
        String str2 = (String) com.applovin.impl.sdk.c.e.b(dVar, (Object) null, this.f8935a.L());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        com.applovin.impl.sdk.c.e.a(dVar, str, this.f8935a.L());
        return str;
    }

    public static String a(com.applovin.impl.sdk.m mVar) {
        com.applovin.impl.sdk.c.d<String> dVar = com.applovin.impl.sdk.c.d.f8239i;
        String str = (String) mVar.a(dVar);
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
            mVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) dVar, (com.applovin.impl.sdk.c.d<String>) valueOf);
            return valueOf;
        }
        return str;
    }

    private String d() {
        if (!((Boolean) this.f8935a.a(com.applovin.impl.sdk.c.b.dy)).booleanValue()) {
            this.f8935a.b(com.applovin.impl.sdk.c.d.f8235e);
        }
        String str = (String) this.f8935a.a(com.applovin.impl.sdk.c.d.f8235e);
        if (StringUtils.isValidString(str)) {
            if (v.a()) {
                v A = this.f8935a.A();
                A.b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
            }
            return str;
        }
        return null;
    }

    public String a() {
        return this.f8936b;
    }

    public void a(String str) {
        if (((Boolean) this.f8935a.a(com.applovin.impl.sdk.c.b.dy)).booleanValue()) {
            this.f8935a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f8235e, (com.applovin.impl.sdk.c.d<String>) str);
        }
        this.f8936b = str;
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", c());
        this.f8935a.ag().a(bundle, "user_info");
    }

    public String b() {
        return this.f8937c;
    }

    public String c() {
        return this.f8938d;
    }
}
