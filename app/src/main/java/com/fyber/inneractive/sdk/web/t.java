package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    public final String f20457a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20458b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f20459c;

    public t(WebResourceRequest webResourceRequest) {
        this.f20457a = webResourceRequest.getUrl().toString();
        this.f20458b = webResourceRequest.getMethod();
        this.f20459c = new HashMap(webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f20457a.equals(tVar.f20457a) && this.f20458b.equals(tVar.f20458b)) {
            return this.f20459c.equals(tVar.f20459c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f20457a.hashCode() * 31) + this.f20458b.hashCode()) * 31) + this.f20459c.hashCode();
    }
}
