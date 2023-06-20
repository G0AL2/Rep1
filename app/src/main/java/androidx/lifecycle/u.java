package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* compiled from: MediatorLiveData.java */
/* loaded from: classes.dex */
public class u<T> extends w<T> {

    /* renamed from: l  reason: collision with root package name */
    private l.b<LiveData<?>, a<?>> f3407l = new l.b<>();

    /* compiled from: MediatorLiveData.java */
    /* loaded from: classes.dex */
    private static class a<V> implements x<V> {

        /* renamed from: a  reason: collision with root package name */
        final LiveData<V> f3408a;

        /* renamed from: b  reason: collision with root package name */
        final x<? super V> f3409b;

        /* renamed from: c  reason: collision with root package name */
        int f3410c = -1;

        a(LiveData<V> liveData, x<? super V> xVar) {
            this.f3408a = liveData;
            this.f3409b = xVar;
        }

        @Override // androidx.lifecycle.x
        public void a(V v10) {
            if (this.f3410c != this.f3408a.g()) {
                this.f3410c = this.f3408a.g();
                this.f3409b.a(v10);
            }
        }

        void b() {
            this.f3408a.j(this);
        }

        void c() {
            this.f3408a.n(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void k() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f3407l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f3407l.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    public <S> void p(LiveData<S> liveData, x<? super S> xVar) {
        a<?> aVar = new a<>(liveData, xVar);
        a<?> j10 = this.f3407l.j(liveData, aVar);
        if (j10 != null && j10.f3409b != xVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (j10 == null && h()) {
            aVar.b();
        }
    }
}
