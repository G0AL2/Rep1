package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.p0;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public String f17488a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f17489b;

    /* renamed from: c  reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.d f17490c;

    /* renamed from: d  reason: collision with root package name */
    public p0 f17491d;

    public b(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        this.f17489b = map;
        this.f17491d = p0Var;
        this.f17490c = dVar;
    }

    public int a(String str) {
        String str2 = this.f17489b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public abstract void a();

    public abstract boolean b();
}
