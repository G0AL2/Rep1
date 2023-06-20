package we;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import we.i1;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes3.dex */
public class i<T> extends r0<T> implements h<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f38607f = AtomicIntegerFieldUpdater.newUpdater(i.class, "_decision");

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38608g = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_state");
    private volatile int _decision;
    private volatile Object _state;

    /* renamed from: d  reason: collision with root package name */
    private final ie.g f38609d;

    /* renamed from: e  reason: collision with root package name */
    private final ie.d<T> f38610e;
    private volatile t0 parentHandle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(ie.d<? super T> dVar, int i10) {
        super(i10);
        qe.k.g(dVar, "delegate");
        this.f38610e = dVar;
        this.f38609d = dVar.getContext();
        this._decision = 0;
        this._state = b.f38589a;
    }

    private final void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void n(int i10) {
        if (y()) {
            return;
        }
        q0.b(this, i10);
    }

    private final void o() {
        t0 t0Var = this.parentHandle;
        if (t0Var != null) {
            t0Var.f();
            this.parentHandle = v1.f38663a;
        }
    }

    private final void s() {
        i1 i1Var;
        if (t() || (i1Var = (i1) this.f38610e.getContext().get(i1.f38615f0)) == null) {
            return;
        }
        i1Var.start();
        t0 d10 = i1.a.d(i1Var, true, false, new l(i1Var, this), 2, null);
        this.parentHandle = d10;
        if (t()) {
            d10.f();
            this.parentHandle = v1.f38663a;
        }
    }

    private final f u(pe.l<? super Throwable, ee.u> lVar) {
        return lVar instanceof f ? (f) lVar : new f1(lVar);
    }

    private final void v(pe.l<? super Throwable, ee.u> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final k x(Object obj, int i10) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof w1) {
                if (f38608g.compareAndSet(this, obj2, obj)) {
                    o();
                    n(i10);
                    return null;
                }
            } else {
                if (obj2 instanceof k) {
                    k kVar = (k) obj2;
                    if (kVar.c()) {
                        return kVar;
                    }
                }
                l(obj);
            }
        }
    }

    private final boolean y() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f38607f.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean z() {
        do {
            int i10 = this._decision;
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f38607f.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // we.r0
    public void b(Object obj, Throwable th) {
        qe.k.g(th, "cause");
        if (obj instanceof u) {
            try {
                ((u) obj).f38659b.b(th);
            } catch (Throwable th2) {
                ie.g context = getContext();
                b0.a(context, new w("Exception in cancellation handler for " + this, th2));
            }
        }
    }

    @Override // we.h
    public Object c(T t10, Object obj) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof w1)) {
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.f38655a == obj) {
                        if (i0.a()) {
                            if (!(tVar.f38656b == t10)) {
                                throw new AssertionError();
                            }
                        }
                        return tVar.f38657c;
                    }
                    return null;
                }
                return null;
            }
        } while (!f38608g.compareAndSet(this, obj2, obj == null ? t10 : new t(obj, t10, (w1) obj2)));
        o();
        return obj2;
    }

    @Override // we.r0
    public final ie.d<T> d() {
        return this.f38610e;
    }

    @Override // we.h
    public void e(pe.l<? super Throwable, ee.u> lVar) {
        qe.k.g(lVar, "handler");
        f fVar = null;
        while (true) {
            Object obj = this._state;
            if (obj instanceof b) {
                if (fVar == null) {
                    fVar = u(lVar);
                }
                if (f38608g.compareAndSet(this, obj, fVar)) {
                    return;
                }
            } else if (!(obj instanceof f)) {
                if (obj instanceof k) {
                    if (!((k) obj).b()) {
                        v(lVar, obj);
                    }
                    try {
                        if (!(obj instanceof r)) {
                            obj = null;
                        }
                        r rVar = (r) obj;
                        lVar.b(rVar != null ? rVar.f38650a : null);
                        return;
                    } catch (Throwable th) {
                        b0.a(getContext(), new w("Exception in cancellation handler for " + this, th));
                        return;
                    }
                }
                return;
            } else {
                v(lVar, obj);
            }
        }
    }

    @Override // we.h
    public void f(z zVar, T t10) {
        qe.k.g(zVar, "$this$resumeUndispatched");
        ie.d<T> dVar = this.f38610e;
        if (!(dVar instanceof o0)) {
            dVar = null;
        }
        o0 o0Var = (o0) dVar;
        x(t10, (o0Var != null ? o0Var.f38628g : null) == zVar ? 3 : this.f38651c);
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        ie.d<T> dVar = this.f38610e;
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            dVar = null;
        }
        return (kotlin.coroutines.jvm.internal.e) dVar;
    }

    @Override // ie.d
    public ie.g getContext() {
        return this.f38609d;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // we.r0
    public <T> T h(Object obj) {
        return obj instanceof t ? (T) ((t) obj).f38656b : obj instanceof u ? (T) ((u) obj).f38658a : obj;
    }

    @Override // we.h
    public void i(Object obj) {
        qe.k.g(obj, IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY);
        n(this.f38651c);
    }

    @Override // we.r0
    public Object k() {
        return r();
    }

    public boolean m(Throwable th) {
        Object obj;
        boolean z10;
        do {
            obj = this._state;
            if (!(obj instanceof w1)) {
                return false;
            }
            z10 = obj instanceof f;
        } while (!f38608g.compareAndSet(this, obj, new k(this, th, z10)));
        if (z10) {
            try {
                ((f) obj).a(th);
            } catch (Throwable th2) {
                ie.g context = getContext();
                b0.a(context, new w("Exception in cancellation handler for " + this, th2));
            }
        }
        o();
        n(0);
        return true;
    }

    public Throwable p(i1 i1Var) {
        qe.k.g(i1Var, "parent");
        return i1Var.l();
    }

    public final Object q() {
        i1 i1Var;
        Object c10;
        s();
        if (z()) {
            c10 = je.d.c();
            return c10;
        }
        Object r10 = r();
        if (!(r10 instanceof r)) {
            if (this.f38651c == 1 && (i1Var = (i1) getContext().get(i1.f38615f0)) != null && !i1Var.a()) {
                CancellationException l10 = i1Var.l();
                b(r10, l10);
                throw kotlinx.coroutines.internal.t.j(l10, this);
            }
            return h(r10);
        }
        throw kotlinx.coroutines.internal.t.j(((r) r10).f38650a, this);
    }

    public final Object r() {
        return this._state;
    }

    @Override // ie.d
    public void resumeWith(Object obj) {
        x(s.a(obj), this.f38651c);
    }

    public boolean t() {
        return !(r() instanceof w1);
    }

    public String toString() {
        return w() + '(' + j0.c(this.f38610e) + "){" + r() + "}@" + j0.b(this);
    }

    protected String w() {
        return "CancellableContinuation";
    }
}
