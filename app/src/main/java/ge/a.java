package ge;

import java.util.Map;
import java.util.Map.Entry;
import qe.k;

/* compiled from: MapBuilder.kt */
/* loaded from: classes3.dex */
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends fe.e<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return f((Map.Entry) obj);
        }
        return false;
    }

    public final boolean f(E e10) {
        k.f(e10, "element");
        return g(e10);
    }

    public abstract boolean g(Map.Entry<? extends K, ? extends V> entry);

    public abstract /* bridge */ boolean h(Map.Entry<?, ?> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return h((Map.Entry) obj);
        }
        return false;
    }
}
