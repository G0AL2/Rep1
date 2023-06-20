package fe;

import java.util.Iterator;

/* compiled from: Iterators.kt */
/* loaded from: classes3.dex */
public abstract class c0 implements Iterator<Integer>, re.a {
    public abstract int c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
