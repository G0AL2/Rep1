package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import we.i0;

/* compiled from: LockFreeLinkedList.kt */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f33510a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f33511b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev");

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f33512c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes3.dex */
    public static abstract class a extends c<j> {

        /* renamed from: b  reason: collision with root package name */
        public j f33513b;

        /* renamed from: c  reason: collision with root package name */
        public final j f33514c;

        public a(j jVar) {
            qe.k.g(jVar, "newNode");
            this.f33514c = jVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: f */
        public void b(j jVar, Object obj) {
            qe.k.g(jVar, "affected");
            boolean z10 = obj == null;
            j jVar2 = z10 ? this.f33514c : this.f33513b;
            if (jVar2 != null && j.f33510a.compareAndSet(jVar, this, jVar2) && z10) {
                j jVar3 = this.f33514c;
                j jVar4 = this.f33513b;
                if (jVar4 == null) {
                    qe.k.o();
                }
                jVar3.k(jVar4);
            }
        }
    }

    private final j i(j jVar, p pVar) {
        Object obj;
        while (true) {
            j jVar2 = null;
            while (true) {
                obj = jVar._next;
                if (obj == pVar) {
                    return jVar;
                }
                if (obj instanceof p) {
                    ((p) obj).a(jVar);
                } else if (!(obj instanceof q)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof q) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj == null) {
                            throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                        jVar2 = jVar;
                        jVar = (j) obj;
                    } else if (obj2 == jVar) {
                        return null;
                    } else {
                        if (f33511b.compareAndSet(this, obj2, jVar) && !(jVar._prev instanceof q)) {
                            return null;
                        }
                    }
                } else if (jVar2 != null) {
                    break;
                } else {
                    jVar = i.b(jVar._prev);
                }
            }
            jVar.t();
            f33510a.compareAndSet(jVar2, jVar, ((q) obj).f33529a);
            jVar = jVar2;
        }
    }

    private final j j() {
        j jVar = this;
        while (!(jVar instanceof h)) {
            jVar = jVar.n();
            if (i0.a()) {
                if (!(jVar != this)) {
                    throw new AssertionError();
                }
            }
        }
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(j jVar) {
        Object obj;
        do {
            obj = jVar._prev;
            if ((obj instanceof q) || m() != jVar) {
                return;
            }
        } while (!f33511b.compareAndSet(jVar, obj, this));
        if (m() instanceof q) {
            if (obj == null) {
                throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            jVar.i((j) obj, null);
        }
    }

    private final void l(j jVar) {
        r();
        jVar.i(i.b(this._prev), null);
    }

    private final j t() {
        Object obj;
        j jVar;
        do {
            obj = this._prev;
            if (obj instanceof q) {
                return ((q) obj).f33529a;
            }
            if (obj == this) {
                jVar = j();
            } else if (obj == null) {
                throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            } else {
                jVar = (j) obj;
            }
        } while (!f33511b.compareAndSet(this, obj, jVar.w()));
        return (j) obj;
    }

    private final q w() {
        q qVar = (q) this._removedRef;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        f33512c.lazySet(this, qVar2);
        return qVar2;
    }

    public final boolean g(j jVar) {
        qe.k.g(jVar, "node");
        f33511b.lazySet(jVar, this);
        f33510a.lazySet(jVar, this);
        while (m() == this) {
            if (f33510a.compareAndSet(this, this, jVar)) {
                jVar.k(this);
                return true;
            }
        }
        return false;
    }

    public final Object m() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final j n() {
        return i.b(m());
    }

    public final Object o() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof q) {
                return obj;
            }
            if (obj != null) {
                j jVar = (j) obj;
                if (jVar.m() == this) {
                    return obj;
                }
                i(jVar, null);
            } else {
                throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    public final j p() {
        return i.b(o());
    }

    public final void r() {
        Object m10;
        j t10 = t();
        Object obj = this._next;
        if (obj == null) {
            throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
        j jVar = ((q) obj).f33529a;
        while (true) {
            j jVar2 = null;
            while (true) {
                Object m11 = jVar.m();
                if (m11 instanceof q) {
                    jVar.t();
                    jVar = ((q) m11).f33529a;
                } else {
                    m10 = t10.m();
                    if (m10 instanceof q) {
                        if (jVar2 != null) {
                            break;
                        }
                        t10 = i.b(t10._prev);
                    } else if (m10 != this) {
                        if (m10 == null) {
                            throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                        j jVar3 = (j) m10;
                        if (jVar3 == jVar) {
                            return;
                        }
                        jVar2 = t10;
                        t10 = jVar3;
                    } else if (f33510a.compareAndSet(t10, this, jVar)) {
                        return;
                    }
                }
            }
            t10.t();
            f33510a.compareAndSet(jVar2, t10, ((q) m10).f33529a);
            t10 = jVar2;
        }
    }

    public final boolean s() {
        return m() instanceof q;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    public boolean u() {
        Object m10;
        j jVar;
        do {
            m10 = m();
            if ((m10 instanceof q) || m10 == this) {
                return false;
            }
            if (m10 != null) {
                jVar = (j) m10;
            } else {
                throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f33510a.compareAndSet(this, m10, jVar.w()));
        l(jVar);
        return true;
    }

    public final j v() {
        while (true) {
            Object m10 = m();
            if (m10 == null) {
                throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            j jVar = (j) m10;
            if (jVar == this) {
                return null;
            }
            if (jVar.u()) {
                return jVar;
            }
            jVar.r();
        }
    }

    public final int x(j jVar, j jVar2, a aVar) {
        qe.k.g(jVar, "node");
        qe.k.g(jVar2, "next");
        qe.k.g(aVar, "condAdd");
        f33511b.lazySet(jVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33510a;
        atomicReferenceFieldUpdater.lazySet(jVar, jVar2);
        aVar.f33513b = jVar2;
        if (atomicReferenceFieldUpdater.compareAndSet(this, jVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
