package u7;

import java.util.Objects;

/* compiled from: AutoValue_Event.java */
/* loaded from: classes2.dex */
final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f37581a;

    /* renamed from: b  reason: collision with root package name */
    private final T f37582b;

    /* renamed from: c  reason: collision with root package name */
    private final d f37583c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Integer num, T t10, d dVar) {
        this.f37581a = num;
        Objects.requireNonNull(t10, "Null payload");
        this.f37582b = t10;
        Objects.requireNonNull(dVar, "Null priority");
        this.f37583c = dVar;
    }

    @Override // u7.c
    public Integer a() {
        return this.f37581a;
    }

    @Override // u7.c
    public T b() {
        return this.f37582b;
    }

    @Override // u7.c
    public d c() {
        return this.f37583c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f37581a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f37582b.equals(cVar.b()) && this.f37583c.equals(cVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f37581a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f37582b.hashCode()) * 1000003) ^ this.f37583c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f37581a + ", payload=" + this.f37582b + ", priority=" + this.f37583c + "}";
    }
}
