package ac;

import ac.c0;
import java.util.Objects;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes3.dex */
final class z extends c0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f552a;

    /* renamed from: b  reason: collision with root package name */
    private final String f553b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f554c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(String str, String str2, boolean z10) {
        Objects.requireNonNull(str, "Null osRelease");
        this.f552a = str;
        Objects.requireNonNull(str2, "Null osCodeName");
        this.f553b = str2;
        this.f554c = z10;
    }

    @Override // ac.c0.c
    public boolean b() {
        return this.f554c;
    }

    @Override // ac.c0.c
    public String c() {
        return this.f553b;
    }

    @Override // ac.c0.c
    public String d() {
        return this.f552a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0.c) {
            c0.c cVar = (c0.c) obj;
            return this.f552a.equals(cVar.d()) && this.f553b.equals(cVar.c()) && this.f554c == cVar.b();
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f552a.hashCode() ^ 1000003) * 1000003) ^ this.f553b.hashCode()) * 1000003) ^ (this.f554c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f552a + ", osCodeName=" + this.f553b + ", isRooted=" + this.f554c + "}";
    }
}
