package com.ironsource.mediationsdk;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final String f26279a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26280b;

    public I(String str, String str2) {
        qe.k.f(str, "advId");
        qe.k.f(str2, "advIdType");
        this.f26279a = str;
        this.f26280b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof I) {
                I i10 = (I) obj;
                return qe.k.a(this.f26279a, i10.f26279a) && qe.k.a(this.f26280b, i10.f26280b);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f26279a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26280b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "IronSourceAdvId(advId=" + this.f26279a + ", advIdType=" + this.f26280b + ")";
    }
}
