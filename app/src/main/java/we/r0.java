package we;

import ee.n;
import java.util.concurrent.CancellationException;

/* compiled from: Dispatched.kt */
/* loaded from: classes3.dex */
public abstract class r0<T> extends kotlinx.coroutines.scheduling.i {

    /* renamed from: c  reason: collision with root package name */
    public int f38651c;

    public r0(int i10) {
        this.f38651c = i10;
    }

    public void b(Object obj, Throwable th) {
        qe.k.g(th, "cause");
    }

    public abstract ie.d<T> d();

    public final Throwable g(Object obj) {
        if (!(obj instanceof r)) {
            obj = null;
        }
        r rVar = (r) obj;
        if (rVar != null) {
            return rVar.f38650a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T h(Object obj) {
        return obj;
    }

    public final void j(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            ee.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        String str = "Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
        if (th == null) {
            qe.k.o();
        }
        b0.a(d().getContext(), new h0(str, th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object a10;
        Object a11;
        kotlinx.coroutines.scheduling.j jVar = this.f33591b;
        try {
            ie.d<T> d10 = d();
            if (d10 != null) {
                o0 o0Var = (o0) d10;
                ie.d<T> dVar = o0Var.f38629h;
                ie.g context = dVar.getContext();
                Object k10 = k();
                Object c10 = kotlinx.coroutines.internal.y.c(context, o0Var.f38627f);
                Throwable g10 = g(k10);
                i1 i1Var = z1.a(this.f38651c) ? (i1) context.get(i1.f38615f0) : null;
                if (g10 == null && i1Var != null && !i1Var.a()) {
                    CancellationException l10 = i1Var.l();
                    b(k10, l10);
                    n.a aVar = ee.n.f29807a;
                    dVar.resumeWith(ee.n.a(ee.o.a(kotlinx.coroutines.internal.t.j(l10, dVar))));
                } else if (g10 != null) {
                    n.a aVar2 = ee.n.f29807a;
                    dVar.resumeWith(ee.n.a(ee.o.a(kotlinx.coroutines.internal.t.j(g10, dVar))));
                } else {
                    T h10 = h(k10);
                    n.a aVar3 = ee.n.f29807a;
                    dVar.resumeWith(ee.n.a(h10));
                }
                ee.u uVar = ee.u.f29813a;
                kotlinx.coroutines.internal.y.a(context, c10);
                try {
                    n.a aVar4 = ee.n.f29807a;
                    jVar.L();
                    a11 = ee.n.a(uVar);
                } catch (Throwable th) {
                    n.a aVar5 = ee.n.f29807a;
                    a11 = ee.n.a(ee.o.a(th));
                }
                j(null, ee.n.b(a11));
                return;
            }
            throw new ee.r("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                n.a aVar6 = ee.n.f29807a;
                jVar.L();
                a10 = ee.n.a(ee.u.f29813a);
            } catch (Throwable th3) {
                n.a aVar7 = ee.n.f29807a;
                a10 = ee.n.a(ee.o.a(th3));
            }
            j(th2, ee.n.b(a10));
        }
    }
}
