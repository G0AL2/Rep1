package jb;

import java.util.Iterator;

/* compiled from: UnmodifiableIterator.java */
/* loaded from: classes3.dex */
public abstract class u0<E> implements Iterator<E> {
    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
