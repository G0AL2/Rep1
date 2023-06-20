package ac;

import ac.c0;
import java.util.Objects;

/* compiled from: AutoValue_StaticSessionData_AppData.java */
/* loaded from: classes3.dex */
final class x extends c0.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f537a;

    /* renamed from: b  reason: collision with root package name */
    private final String f538b;

    /* renamed from: c  reason: collision with root package name */
    private final String f539c;

    /* renamed from: d  reason: collision with root package name */
    private final String f540d;

    /* renamed from: e  reason: collision with root package name */
    private final int f541e;

    /* renamed from: f  reason: collision with root package name */
    private final vb.e f542f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(String str, String str2, String str3, String str4, int i10, vb.e eVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f537a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f538b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f539c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f540d = str4;
        this.f541e = i10;
        Objects.requireNonNull(eVar, "Null developmentPlatformProvider");
        this.f542f = eVar;
    }

    @Override // ac.c0.a
    public String a() {
        return this.f537a;
    }

    @Override // ac.c0.a
    public int c() {
        return this.f541e;
    }

    @Override // ac.c0.a
    public vb.e d() {
        return this.f542f;
    }

    @Override // ac.c0.a
    public String e() {
        return this.f540d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.a) {
            c0.a aVar = (c0.a) obj;
            return this.f537a.equals(aVar.a()) && this.f538b.equals(aVar.f()) && this.f539c.equals(aVar.g()) && this.f540d.equals(aVar.e()) && this.f541e == aVar.c() && this.f542f.equals(aVar.d());
        }
        return false;
    }

    @Override // ac.c0.a
    public String f() {
        return this.f538b;
    }

    @Override // ac.c0.a
    public String g() {
        return this.f539c;
    }

    public int hashCode() {
        return ((((((((((this.f537a.hashCode() ^ 1000003) * 1000003) ^ this.f538b.hashCode()) * 1000003) ^ this.f539c.hashCode()) * 1000003) ^ this.f540d.hashCode()) * 1000003) ^ this.f541e) * 1000003) ^ this.f542f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f537a + ", versionCode=" + this.f538b + ", versionName=" + this.f539c + ", installUuid=" + this.f540d + ", deliveryMechanism=" + this.f541e + ", developmentPlatformProvider=" + this.f542f + "}";
    }
}
