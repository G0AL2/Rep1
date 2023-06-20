package ac;

import ac.a0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application_Organization.java */
/* loaded from: classes3.dex */
final class i extends a0.e.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f421a;

    @Override // ac.a0.e.a.b
    public String a() {
        return this.f421a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.a.b) {
            return this.f421a.equals(((a0.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f421a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f421a + "}";
    }
}
