package com.google.firebase.auth;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private String f23324a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f23325b;

    @KeepForSdk
    public t(String str, Map<String, Object> map) {
        this.f23324a = str;
        this.f23325b = map;
    }

    private final long g(String str) {
        Integer num = (Integer) this.f23325b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public long a() {
        return g("auth_time");
    }

    public Map<String, Object> b() {
        return this.f23325b;
    }

    public long c() {
        return g("exp");
    }

    public long d() {
        return g("iat");
    }

    public String e() {
        Map map = (Map) this.f23325b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public String f() {
        return this.f23324a;
    }
}
