package com.applovin.impl.mediation.debugger.b.a;

/* loaded from: classes.dex */
public class d implements Comparable<d> {

    /* renamed from: a  reason: collision with root package name */
    private final String f7488a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7489b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f7490c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.b.b f7491d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, String str2, boolean z10, com.applovin.impl.mediation.debugger.b.b.b bVar) {
        this.f7488a = str;
        this.f7489b = str2;
        this.f7490c = z10;
        this.f7491d = bVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(d dVar) {
        return this.f7489b.compareToIgnoreCase(dVar.f7489b);
    }

    public String a() {
        return this.f7488a;
    }

    public String b() {
        return this.f7489b;
    }

    public com.applovin.impl.mediation.debugger.b.b.b c() {
        return this.f7491d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f7488a;
        if (str == null ? dVar.f7488a == null : str.equals(dVar.f7488a)) {
            String str2 = this.f7489b;
            if (str2 == null ? dVar.f7489b == null : str2.equals(dVar.f7489b)) {
                return this.f7490c == dVar.f7490c;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7488a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7489b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f7490c ? 1 : 0);
    }
}
