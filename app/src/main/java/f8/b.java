package f8;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoValue_PersistedEvent.java */
/* loaded from: classes2.dex */
public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final long f30115a;

    /* renamed from: b  reason: collision with root package name */
    private final w7.o f30116b;

    /* renamed from: c  reason: collision with root package name */
    private final w7.i f30117c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(long j10, w7.o oVar, w7.i iVar) {
        this.f30115a = j10;
        Objects.requireNonNull(oVar, "Null transportContext");
        this.f30116b = oVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f30117c = iVar;
    }

    @Override // f8.k
    public w7.i b() {
        return this.f30117c;
    }

    @Override // f8.k
    public long c() {
        return this.f30115a;
    }

    @Override // f8.k
    public w7.o d() {
        return this.f30116b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return this.f30115a == kVar.c() && this.f30116b.equals(kVar.d()) && this.f30117c.equals(kVar.b());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f30115a;
        return this.f30117c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f30116b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f30115a + ", transportContext=" + this.f30116b + ", event=" + this.f30117c + "}";
    }
}
