package ac;

import ac.c0;
import java.util.Objects;

/* compiled from: AutoValue_StaticSessionData.java */
/* loaded from: classes3.dex */
final class w extends c0 {

    /* renamed from: a  reason: collision with root package name */
    private final c0.a f534a;

    /* renamed from: b  reason: collision with root package name */
    private final c0.c f535b;

    /* renamed from: c  reason: collision with root package name */
    private final c0.b f536c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f534a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f535b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f536c = bVar;
    }

    @Override // ac.c0
    public c0.a a() {
        return this.f534a;
    }

    @Override // ac.c0
    public c0.b c() {
        return this.f536c;
    }

    @Override // ac.c0
    public c0.c d() {
        return this.f535b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.f534a.equals(c0Var.a()) && this.f535b.equals(c0Var.d()) && this.f536c.equals(c0Var.c());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f534a.hashCode() ^ 1000003) * 1000003) ^ this.f535b.hashCode()) * 1000003) ^ this.f536c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f534a + ", osData=" + this.f535b + ", deviceData=" + this.f536c + "}";
    }
}
