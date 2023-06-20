package m9;

import ea.n0;

/* compiled from: Descriptor.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f34359a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34360b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34361c;

    public e(String str, String str2, String str3) {
        this.f34359a = str;
        this.f34360b = str2;
        this.f34361c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return n0.c(this.f34359a, eVar.f34359a) && n0.c(this.f34360b, eVar.f34360b) && n0.c(this.f34361c, eVar.f34361c);
    }

    public int hashCode() {
        int hashCode = this.f34359a.hashCode() * 31;
        String str = this.f34360b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34361c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
