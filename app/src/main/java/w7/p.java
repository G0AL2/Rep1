package w7;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes2.dex */
final class p implements u7.g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<u7.b> f38301a;

    /* renamed from: b  reason: collision with root package name */
    private final o f38302b;

    /* renamed from: c  reason: collision with root package name */
    private final s f38303c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Set<u7.b> set, o oVar, s sVar) {
        this.f38301a = set;
        this.f38302b = oVar;
        this.f38303c = sVar;
    }

    @Override // u7.g
    public <T> u7.f<T> a(String str, Class<T> cls, u7.b bVar, u7.e<T, byte[]> eVar) {
        if (this.f38301a.contains(bVar)) {
            return new r(this.f38302b, str, bVar, eVar, this.f38303c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f38301a));
    }
}
