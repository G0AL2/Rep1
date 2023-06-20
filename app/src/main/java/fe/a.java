package fe;

import java.util.Collection;

/* compiled from: AbstractCollection.kt */
/* loaded from: classes3.dex */
public abstract class a<E> implements Collection<E>, re.a {

    /* compiled from: AbstractCollection.kt */
    /* renamed from: fe.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0383a extends qe.l implements pe.l<E, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a<E> f30315a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0383a(a<? extends E> aVar) {
            super(1);
            this.f30315a = aVar;
        }

        @Override // pe.l
        /* renamed from: a */
        public final CharSequence b(E e10) {
            return e10 == this.f30315a ? "(this Collection)" : String.valueOf(e10);
        }
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (E e11 : this) {
            if (qe.k.a(e11, e10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        qe.k.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public abstract int e();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return qe.f.a(this);
    }

    public String toString() {
        String C;
        C = x.C(this, ", ", "[", "]", 0, null, new C0383a(this), 24, null);
        return C;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        qe.k.f(tArr, "array");
        T[] tArr2 = (T[]) qe.f.b(this, tArr);
        qe.k.d(tArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt__CollectionsJVMKt.copyToArrayImpl>");
        return tArr2;
    }
}
