package ue;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
/* loaded from: classes3.dex */
public final class a<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<d<T>> f37714a;

    public a(d<? extends T> dVar) {
        qe.k.f(dVar, "sequence");
        this.f37714a = new AtomicReference<>(dVar);
    }

    @Override // ue.d
    public Iterator<T> iterator() {
        d<T> andSet = this.f37714a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
