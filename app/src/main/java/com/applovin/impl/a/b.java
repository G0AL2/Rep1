package com.applovin.impl.a;

import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f6739a;

    /* renamed from: b  reason: collision with root package name */
    private final List<g> f6740b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6741c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<j> f6742d;

    private b(String str, List<g> list, String str2, Set<j> set) {
        this.f6739a = str;
        this.f6740b = list;
        this.f6741c = str2;
        this.f6742d = set;
    }

    public static b a(r rVar, e eVar, com.applovin.impl.sdk.m mVar) {
        try {
            String str = rVar.b().get("vendor");
            r c10 = rVar.c("VerificationParameters");
            String c11 = c10 != null ? c10.c() : null;
            List<r> a10 = rVar.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(a10.size());
            for (r rVar2 : a10) {
                g a11 = g.a(rVar2, mVar);
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            HashMap hashMap = new HashMap();
            l.a(rVar, hashMap, eVar, mVar);
            return new b(str, arrayList, c11, (Set) hashMap.get("verificationNotExecuted"));
        } catch (Throwable th) {
            if (v.a()) {
                mVar.A().b("VastAdVerification", "Error occurred while initializing", th);
            }
            return null;
        }
    }

    public String a() {
        return this.f6739a;
    }

    public List<g> b() {
        return this.f6740b;
    }

    public String c() {
        return this.f6741c;
    }

    public Set<j> d() {
        return this.f6742d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.f6739a;
        if (str == null ? bVar.f6739a == null : str.equals(bVar.f6739a)) {
            List<g> list = this.f6740b;
            if (list == null ? bVar.f6740b == null : list.equals(bVar.f6740b)) {
                String str2 = this.f6741c;
                if (str2 == null ? bVar.f6741c == null : str2.equals(bVar.f6741c)) {
                    Set<j> set = this.f6742d;
                    Set<j> set2 = bVar.f6742d;
                    return set != null ? set.equals(set2) : set2 == null;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f6739a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<g> list = this.f6740b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f6741c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<j> set = this.f6742d;
        return hashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f6739a + "'javascriptResources='" + this.f6740b + "'verificationParameters='" + this.f6741c + "'errorEventTrackers='" + this.f6742d + "'}";
    }
}
