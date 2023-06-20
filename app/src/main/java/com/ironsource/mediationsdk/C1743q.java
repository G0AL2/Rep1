package com.ironsource.mediationsdk;

/* renamed from: com.ironsource.mediationsdk.q  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1743q {

    /* renamed from: a  reason: collision with root package name */
    String f27316a;

    /* renamed from: b  reason: collision with root package name */
    String f27317b;

    /* renamed from: c  reason: collision with root package name */
    String f27318c;

    public C1743q(String str, String str2, String str3) {
        qe.k.f(str, "cachedAppKey");
        qe.k.f(str2, "cachedUserId");
        qe.k.f(str3, "cachedSettings");
        this.f27316a = str;
        this.f27317b = str2;
        this.f27318c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1743q) {
                C1743q c1743q = (C1743q) obj;
                return qe.k.a(this.f27316a, c1743q.f27316a) && qe.k.a(this.f27317b, c1743q.f27317b) && qe.k.a(this.f27318c, c1743q.f27318c);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f27316a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f27317b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27318c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "CachedResponse(cachedAppKey=" + this.f27316a + ", cachedUserId=" + this.f27317b + ", cachedSettings=" + this.f27318c + ")";
    }
}
