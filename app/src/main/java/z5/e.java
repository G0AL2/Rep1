package z5;

import android.util.SparseArray;
import java.util.LinkedList;

/* compiled from: BucketMap.java */
/* loaded from: classes.dex */
public class e<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final SparseArray<b<T>> f40000a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    b<T> f40001b;

    /* renamed from: c  reason: collision with root package name */
    b<T> f40002c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BucketMap.java */
    /* loaded from: classes.dex */
    public static class b<I> {

        /* renamed from: a  reason: collision with root package name */
        b<I> f40003a;

        /* renamed from: b  reason: collision with root package name */
        int f40004b;

        /* renamed from: c  reason: collision with root package name */
        LinkedList<I> f40005c;

        /* renamed from: d  reason: collision with root package name */
        b<I> f40006d;

        public String toString() {
            return "LinkedEntry(key: " + this.f40004b + ")";
        }

        private b(b<I> bVar, int i10, LinkedList<I> linkedList, b<I> bVar2) {
            this.f40003a = bVar;
            this.f40004b = i10;
            this.f40005c = linkedList;
            this.f40006d = bVar2;
        }
    }

    private void b(b<T> bVar) {
        if (bVar == null || !bVar.f40005c.isEmpty()) {
            return;
        }
        d(bVar);
        this.f40000a.remove(bVar.f40004b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c(b<T> bVar) {
        if (this.f40001b == bVar) {
            return;
        }
        d(bVar);
        b bVar2 = (b<T>) this.f40001b;
        if (bVar2 == null) {
            this.f40001b = bVar;
            this.f40002c = bVar;
            return;
        }
        bVar.f40006d = bVar2;
        bVar2.f40003a = bVar;
        this.f40001b = bVar;
    }

    private synchronized void d(b<T> bVar) {
        b bVar2 = (b<T>) bVar.f40003a;
        b bVar3 = (b<T>) bVar.f40006d;
        if (bVar2 != null) {
            bVar2.f40006d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.f40003a = bVar2;
        }
        bVar.f40003a = null;
        bVar.f40006d = null;
        if (bVar == this.f40001b) {
            this.f40001b = bVar3;
        }
        if (bVar == this.f40002c) {
            this.f40002c = bVar2;
        }
    }

    public synchronized T a(int i10) {
        b<T> bVar = this.f40000a.get(i10);
        if (bVar == null) {
            return null;
        }
        T pollFirst = bVar.f40005c.pollFirst();
        c(bVar);
        return pollFirst;
    }

    public synchronized void e(int i10, T t10) {
        b<T> bVar = this.f40000a.get(i10);
        if (bVar == null) {
            bVar = new b<>(null, i10, new LinkedList(), null);
            this.f40000a.put(i10, bVar);
        }
        bVar.f40005c.addLast(t10);
        c(bVar);
    }

    public synchronized T f() {
        b<T> bVar = this.f40002c;
        if (bVar == null) {
            return null;
        }
        T pollLast = bVar.f40005c.pollLast();
        b(bVar);
        return pollLast;
    }
}
