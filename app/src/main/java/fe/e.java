package fe;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: AbstractMutableSet.kt */
/* loaded from: classes3.dex */
public abstract class e<E> extends AbstractSet<E> implements Set<E> {
    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }
}
