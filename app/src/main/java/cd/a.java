package cd;

import java.util.Objects;

/* compiled from: AutoValue_LibraryVersion.java */
/* loaded from: classes3.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f5471a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5472b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f5471a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f5472b = str2;
    }

    @Override // cd.f
    public String b() {
        return this.f5471a;
    }

    @Override // cd.f
    public String c() {
        return this.f5472b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f5471a.equals(fVar.b()) && this.f5472b.equals(fVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5471a.hashCode() ^ 1000003) * 1000003) ^ this.f5472b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f5471a + ", version=" + this.f5472b + "}";
    }
}
