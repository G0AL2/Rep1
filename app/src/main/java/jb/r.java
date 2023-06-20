package jb;

import java.io.Serializable;

/* compiled from: ImmutableEntry.java */
/* loaded from: classes3.dex */
class r<K, V> extends e<K, V> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final K f33053a;

    /* renamed from: b  reason: collision with root package name */
    final V f33054b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(K k10, V v10) {
        this.f33053a = k10;
        this.f33054b = v10;
    }

    @Override // jb.e, java.util.Map.Entry
    public final K getKey() {
        return this.f33053a;
    }

    @Override // jb.e, java.util.Map.Entry
    public final V getValue() {
        return this.f33054b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v10) {
        throw new UnsupportedOperationException();
    }
}
