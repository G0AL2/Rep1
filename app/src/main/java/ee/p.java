package ee;

import java.io.Serializable;

/* compiled from: LazyJVM.kt */
/* loaded from: classes3.dex */
final class p<T> implements h<T>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private pe.a<? extends T> f29809a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f29810b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f29811c;

    public p(pe.a<? extends T> aVar, Object obj) {
        qe.k.f(aVar, "initializer");
        this.f29809a = aVar;
        this.f29810b = s.f29812a;
        this.f29811c = obj == null ? this : obj;
    }

    @Override // ee.h
    public T getValue() {
        T t10;
        T t11 = (T) this.f29810b;
        s sVar = s.f29812a;
        if (t11 != sVar) {
            return t11;
        }
        synchronized (this.f29811c) {
            t10 = (T) this.f29810b;
            if (t10 == sVar) {
                pe.a<? extends T> aVar = this.f29809a;
                qe.k.c(aVar);
                t10 = aVar.invoke();
                this.f29810b = t10;
                this.f29809a = null;
            }
        }
        return t10;
    }

    @Override // ee.h
    public boolean isInitialized() {
        return this.f29810b != s.f29812a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ p(pe.a aVar, Object obj, int i10, qe.g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
