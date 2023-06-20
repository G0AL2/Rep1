package com.ironsource.mediationsdk.model;

import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f27221a;

    public c() {
        this(null, 1);
    }

    public c(Map<String, String> map) {
        qe.k.f(map, "mediationTypes");
        this.f27221a = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private /* synthetic */ c(java.util.Map r1, int r2) {
        /*
            r0 = this;
            java.util.Map r1 = fe.e0.g()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.model.c.<init>(java.util.Map, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && qe.k.a(this.f27221a, ((c) obj).f27221a);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f27221a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f27221a + ")";
    }
}
