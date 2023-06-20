package com.applovin.impl.a;

import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final String f6775a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6776b;

    private g(String str, String str2) {
        this.f6775a = str;
        this.f6776b = str2;
    }

    public static g a(r rVar, com.applovin.impl.sdk.m mVar) {
        if (rVar != null) {
            if (mVar != null) {
                try {
                    return new g(rVar.b().get("apiFramework"), rVar.c());
                } catch (Throwable th) {
                    if (v.a()) {
                        mVar.A().b("VastJavaScriptResource", "Error occurred while initializing", th);
                        return null;
                    }
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public String a() {
        return this.f6775a;
    }

    public String b() {
        return this.f6776b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        String str = this.f6775a;
        if (str == null ? gVar.f6775a == null : str.equals(gVar.f6775a)) {
            String str2 = this.f6776b;
            String str3 = gVar.f6776b;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6775a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6776b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VastJavaScriptResource{apiFramework='" + this.f6775a + "', javascriptResourceUrl='" + this.f6776b + "'}";
    }
}
