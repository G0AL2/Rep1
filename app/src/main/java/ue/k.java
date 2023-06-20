package ue;

import java.util.Iterator;
import pe.l;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public final class k<T, R> implements d<R> {

    /* renamed from: a  reason: collision with root package name */
    private final d<T> f37721a;

    /* renamed from: b  reason: collision with root package name */
    private final l<T, R> f37722b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<R>, re.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f37723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k<T, R> f37724b;

        a(k<T, R> kVar) {
            this.f37724b = kVar;
            this.f37723a = ((k) kVar).f37721a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37723a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((k) this.f37724b).f37722b.b(this.f37723a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        qe.k.f(dVar, "sequence");
        qe.k.f(lVar, "transformer");
        this.f37721a = dVar;
        this.f37722b = lVar;
    }

    @Override // ue.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}
