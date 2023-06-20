package com.fyber.inneractive.sdk.config.global;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class p implements n {

    /* renamed from: a  reason: collision with root package name */
    public n f16977a;

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        n nVar = this.f16977a;
        return nVar != null ? nVar.a(str, str2) : str2;
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Integer b(String str) {
        n nVar = this.f16977a;
        if (nVar == null || nVar.a() == null || this.f16977a.a().size() <= 0) {
            return null;
        }
        return this.f16977a.b(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public String c(String str) {
        n nVar = this.f16977a;
        if (nVar == null || nVar.a() == null || this.f16977a.a().size() <= 0) {
            return null;
        }
        return this.f16977a.c(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Boolean d(String str) {
        n nVar = this.f16977a;
        if (nVar == null || nVar.a() == null || this.f16977a.a().size() <= 0) {
            return null;
        }
        return this.f16977a.d(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Double a(String str) {
        n nVar = this.f16977a;
        if (nVar == null || nVar.a() == null || this.f16977a.a().size() <= 0) {
            return null;
        }
        return this.f16977a.a(str);
    }

    @Override // com.fyber.inneractive.sdk.config.global.n
    public Map<String, Object> a() {
        n nVar = this.f16977a;
        if (nVar != null) {
            return nVar.a();
        }
        return null;
    }
}
