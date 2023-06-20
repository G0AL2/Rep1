package com.applovin.impl.sdk;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private final String f8772a = UUID.randomUUID().toString();

    /* renamed from: b  reason: collision with root package name */
    private final String f8773b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f8774c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8775d;

    public p(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f8773b = str;
        HashMap hashMap = new HashMap();
        this.f8774c = hashMap;
        hashMap.putAll(map);
        hashMap.put("applovin_sdk_super_properties", map2);
        this.f8775d = System.currentTimeMillis();
    }

    public String a() {
        return this.f8773b;
    }

    public Map<String, Object> b() {
        return this.f8774c;
    }

    public long c() {
        return this.f8775d;
    }

    public String d() {
        return this.f8772a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f8775d != pVar.f8775d) {
            return false;
        }
        String str = this.f8773b;
        if (str == null ? pVar.f8773b == null : str.equals(pVar.f8773b)) {
            Map<String, Object> map = this.f8774c;
            if (map == null ? pVar.f8774c == null : map.equals(pVar.f8774c)) {
                String str2 = this.f8772a;
                String str3 = pVar.f8772a;
                if (str2 != null) {
                    if (str2.equals(str3)) {
                        return true;
                    }
                } else if (str3 == null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8773b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f8774c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j10 = this.f8775d;
        int i10 = (((hashCode + hashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f8772a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f8773b + "', id='" + this.f8772a + "', creationTimestampMillis=" + this.f8775d + ", parameters=" + this.f8774c + '}';
    }
}
