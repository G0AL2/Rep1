package ue;

import java.util.Iterator;

/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public final class b<T> implements d<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final d<T> f37715a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37716b;

    /* compiled from: Sequences.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, re.a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f37717a;

        /* renamed from: b  reason: collision with root package name */
        private int f37718b;

        a(b<T> bVar) {
            this.f37717a = ((b) bVar).f37715a.iterator();
            this.f37718b = ((b) bVar).f37716b;
        }

        private final void c() {
            while (this.f37718b > 0 && this.f37717a.hasNext()) {
                this.f37717a.next();
                this.f37718b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            c();
            return this.f37717a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            c();
            return this.f37717a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(d<? extends T> dVar, int i10) {
        qe.k.f(dVar, "sequence");
        this.f37715a = dVar;
        this.f37716b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // ue.c
    public d<T> a(int i10) {
        int i11 = this.f37716b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f37715a, i11);
    }

    @Override // ue.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
