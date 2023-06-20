package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public Long f17374a = null;

    /* renamed from: b  reason: collision with root package name */
    public Long f17375b = null;

    /* renamed from: c  reason: collision with root package name */
    public Long f17376c = null;

    /* renamed from: d  reason: collision with root package name */
    public Long f17377d = null;

    /* renamed from: e  reason: collision with root package name */
    public Long f17378e = null;

    /* renamed from: f  reason: collision with root package name */
    public Long f17379f = null;

    /* renamed from: g  reason: collision with root package name */
    public Long f17380g = null;

    /* renamed from: h  reason: collision with root package name */
    public Long f17381h = null;

    @Override // com.fyber.inneractive.sdk.metrics.f
    public boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.metrics.f
    public Long b() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f17380g = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.f
    public Long c() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f17374a = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.f
    public Long d() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f17377d = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.f
    public Long e() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f17379f = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.f
    public Long f() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f17375b = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.f
    public Long g() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f17376c = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.f
    public Long h() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f17381h = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.f
    public Long i() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f17378e = valueOf;
        return valueOf;
    }

    @Override // com.fyber.inneractive.sdk.metrics.f
    public Map<String, Long> j() {
        HashMap hashMap = new HashMap();
        Long l10 = this.f17375b;
        if (l10 != null && this.f17374a != null) {
            hashMap.put("sdk_init_network_req", Long.valueOf(l10.longValue() - this.f17374a.longValue()));
        }
        Long l11 = this.f17381h;
        if (l11 != null && this.f17375b != null) {
            hashMap.put("sdk_got_response_from_markup_url", Long.valueOf(l11.longValue() - this.f17375b.longValue()));
        }
        Long l12 = this.f17377d;
        if (l12 != null && this.f17381h != null) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l12.longValue() - this.f17381h.longValue()));
        }
        Long l13 = this.f17376c;
        if (l13 != null && this.f17375b != null) {
            hashMap.put("sdk_got_server_res", Long.valueOf(l13.longValue() - this.f17375b.longValue()));
        }
        Long l14 = this.f17377d;
        if (l14 != null && this.f17376c != null) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l14.longValue() - this.f17376c.longValue()));
        }
        Long l15 = this.f17378e;
        if (l15 != null && this.f17377d != null) {
            hashMap.put("ad_loaded_result", Long.valueOf(l15.longValue() - this.f17377d.longValue()));
        }
        Long l16 = this.f17379f;
        if (l16 != null && this.f17378e != null) {
            hashMap.put("publisher_notified", Long.valueOf(l16.longValue() - this.f17378e.longValue()));
        }
        Long l17 = this.f17380g;
        if (l17 != null && this.f17374a != null) {
            hashMap.put("roundtrip", Long.valueOf(l17.longValue() - this.f17374a.longValue()));
        }
        return hashMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MetricsCollectorData{");
        if (this.f17374a != null && this.f17375b != null) {
            sb2.append(" sdk_init_network_req=");
            sb2.append(this.f17375b.longValue() - this.f17374a.longValue());
        }
        if (this.f17381h != null && this.f17375b != null) {
            sb2.append(", sdk_got_response_from_markup_url=");
            sb2.append(this.f17381h.longValue() - this.f17375b.longValue());
        }
        if (this.f17376c != null && this.f17375b != null) {
            sb2.append(", sdk_got_server_res=");
            sb2.append(this.f17376c.longValue() - this.f17375b.longValue());
        }
        if (this.f17377d != null && this.f17376c != null) {
            sb2.append(", sdk_parsed_res=");
            sb2.append(this.f17377d.longValue() - this.f17376c.longValue());
        }
        if (this.f17378e != null && this.f17377d != null) {
            sb2.append(", ad_loaded_result=");
            sb2.append(this.f17378e.longValue() - this.f17377d.longValue());
        }
        if (this.f17379f != null && this.f17378e != null) {
            sb2.append(", publisher_notified=");
            sb2.append(this.f17379f.longValue() - this.f17378e.longValue());
        }
        if (this.f17380g != null && this.f17374a != null) {
            sb2.append(", roundtrip=");
            sb2.append(this.f17380g.longValue() - this.f17374a.longValue());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
