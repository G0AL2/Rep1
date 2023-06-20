package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import we.i0;

/* compiled from: Atomic.kt */
/* loaded from: classes3.dex */
public abstract class c<T> extends p {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f33497a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile Object _consensus;

    public c() {
        Object obj;
        obj = b.f33493a;
        this._consensus = obj;
    }

    private final Object c(Object obj) {
        return e(obj) ? obj : this._consensus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.p
    public final Object a(Object obj) {
        Object obj2;
        Object obj3 = this._consensus;
        obj2 = b.f33493a;
        if (obj3 == obj2) {
            obj3 = c(d(obj));
        }
        b(obj, obj3);
        return obj3;
    }

    public abstract void b(T t10, Object obj);

    public abstract Object d(T t10);

    public final boolean e(Object obj) {
        Object obj2;
        Object obj3;
        if (i0.a()) {
            obj3 = b.f33493a;
            if (!(obj != obj3)) {
                throw new AssertionError();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33497a;
        obj2 = b.f33493a;
        return atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj);
    }
}
