package com.applovin.impl.a;

import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f6743a;

    private c(List<b> list) {
        this.f6743a = list;
    }

    public static c a(r rVar, c cVar, e eVar, com.applovin.impl.sdk.m mVar) {
        try {
            List<b> a10 = cVar != null ? cVar.a() : new ArrayList<>();
            for (r rVar2 : rVar.a("Verification")) {
                b a11 = b.a(rVar2, eVar, mVar);
                if (a11 != null) {
                    a10.add(a11);
                }
            }
            return new c(a10);
        } catch (Throwable th) {
            if (v.a()) {
                mVar.A().b("VastAdVerifications", "Error occurred while initializing", th);
                return null;
            }
            return null;
        }
    }

    public List<b> a() {
        return this.f6743a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f6743a.equals(((c) obj).f6743a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6743a.hashCode();
    }

    public String toString() {
        return "VastAdVerification{verifications='" + this.f6743a + "'}";
    }
}
