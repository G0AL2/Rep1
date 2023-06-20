package fe;

import java.util.AbstractCollection;
import java.util.Collection;

/* compiled from: AbstractMutableCollection.kt */
/* loaded from: classes3.dex */
public abstract class c<E> extends AbstractCollection<E> implements Collection<E> {
    public abstract int e();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }
}
