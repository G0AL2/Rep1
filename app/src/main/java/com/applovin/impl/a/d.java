package com.applovin.impl.a;

import android.net.Uri;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f6744a;

    /* renamed from: b  reason: collision with root package name */
    private int f6745b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f6746c;

    /* renamed from: d  reason: collision with root package name */
    private h f6747d;

    /* renamed from: e  reason: collision with root package name */
    private Set<j> f6748e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Set<j>> f6749f = new HashMap();

    private d() {
    }

    public static d a(r rVar, d dVar, e eVar, com.applovin.impl.sdk.m mVar) {
        r b10;
        if (rVar != null) {
            if (mVar != null) {
                if (dVar == null) {
                    try {
                        dVar = new d();
                    } catch (Throwable th) {
                        if (v.a()) {
                            mVar.A().b("VastCompanionAd", "Error occurred while initializing", th);
                            return null;
                        }
                        return null;
                    }
                }
                if (dVar.f6744a == 0 && dVar.f6745b == 0) {
                    int parseInt = StringUtils.parseInt(rVar.b().get("width"));
                    int parseInt2 = StringUtils.parseInt(rVar.b().get("height"));
                    if (parseInt > 0 && parseInt2 > 0) {
                        dVar.f6744a = parseInt;
                        dVar.f6745b = parseInt2;
                    }
                }
                dVar.f6747d = h.a(rVar, dVar.f6747d, mVar);
                if (dVar.f6746c == null && (b10 = rVar.b("CompanionClickThrough")) != null) {
                    String c10 = b10.c();
                    if (StringUtils.isValidString(c10)) {
                        dVar.f6746c = Uri.parse(c10);
                    }
                }
                l.a(rVar.a("CompanionClickTracking"), dVar.f6748e, eVar, mVar);
                l.a(rVar, dVar.f6749f, eVar, mVar);
                return dVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public Uri a() {
        return this.f6746c;
    }

    public h b() {
        return this.f6747d;
    }

    public Set<j> c() {
        return this.f6748e;
    }

    public Map<String, Set<j>> d() {
        return this.f6749f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f6744a == dVar.f6744a && this.f6745b == dVar.f6745b) {
                Uri uri = this.f6746c;
                if (uri == null ? dVar.f6746c == null : uri.equals(dVar.f6746c)) {
                    h hVar = this.f6747d;
                    if (hVar == null ? dVar.f6747d == null : hVar.equals(dVar.f6747d)) {
                        Set<j> set = this.f6748e;
                        if (set == null ? dVar.f6748e == null : set.equals(dVar.f6748e)) {
                            Map<String, Set<j>> map = this.f6749f;
                            Map<String, Set<j>> map2 = dVar.f6749f;
                            return map != null ? map.equals(map2) : map2 == null;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i10 = ((this.f6744a * 31) + this.f6745b) * 31;
        Uri uri = this.f6746c;
        int hashCode = (i10 + (uri != null ? uri.hashCode() : 0)) * 31;
        h hVar = this.f6747d;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        Set<j> set = this.f6748e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<j>> map = this.f6749f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f6744a + ", height=" + this.f6745b + ", destinationUri=" + this.f6746c + ", nonVideoResource=" + this.f6747d + ", clickTrackers=" + this.f6748e + ", eventTrackers=" + this.f6749f + '}';
    }
}
