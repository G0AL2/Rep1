package we;

import ee.n;
import java.util.concurrent.CancellationException;

/* compiled from: Dispatched.kt */
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a */
    private static final kotlinx.coroutines.internal.u f38645a = new kotlinx.coroutines.internal.u("UNDEFINED");

    public static final /* synthetic */ kotlinx.coroutines.internal.u a() {
        return f38645a;
    }

    public static final <T> void b(r0<? super T> r0Var, int i10) {
        qe.k.g(r0Var, "$this$dispatch");
        ie.d<? super T> d10 = r0Var.d();
        if (z1.b(i10) && (d10 instanceof o0) && z1.a(i10) == z1.a(r0Var.f38651c)) {
            z zVar = ((o0) d10).f38628g;
            ie.g context = d10.getContext();
            if (zVar.h0(context)) {
                zVar.g0(context, r0Var);
                return;
            } else {
                h(r0Var);
                return;
            }
        }
        c(r0Var, d10, i10);
    }

    public static final <T> void c(r0<? super T> r0Var, ie.d<? super T> dVar, int i10) {
        qe.k.g(r0Var, "$this$resume");
        qe.k.g(dVar, "delegate");
        Object k10 = r0Var.k();
        Throwable g10 = r0Var.g(k10);
        if (g10 != null) {
            if (!(dVar instanceof r0)) {
                g10 = kotlinx.coroutines.internal.t.j(g10, dVar);
            }
            z1.f(dVar, g10, i10);
            return;
        }
        z1.c(dVar, r0Var.h(k10), i10);
    }

    public static final <T> void d(ie.d<? super T> dVar, T t10) {
        boolean z10;
        qe.k.g(dVar, "$this$resumeCancellable");
        if (dVar instanceof o0) {
            o0 o0Var = (o0) dVar;
            if (o0Var.f38628g.h0(o0Var.getContext())) {
                o0Var.f38625d = t10;
                o0Var.f38651c = 1;
                o0Var.f38628g.g0(o0Var.getContext(), o0Var);
                return;
            }
            w0 a10 = e2.f38598b.a();
            if (a10.E0()) {
                o0Var.f38625d = t10;
                o0Var.f38651c = 1;
                a10.r0(o0Var);
                return;
            }
            a10.z0(true);
            try {
                i1 i1Var = (i1) o0Var.getContext().get(i1.f38615f0);
                if (i1Var == null || i1Var.a()) {
                    z10 = false;
                } else {
                    CancellationException l10 = i1Var.l();
                    n.a aVar = ee.n.f29807a;
                    o0Var.resumeWith(ee.n.a(ee.o.a(l10)));
                    z10 = true;
                }
                if (!z10) {
                    ie.g context = o0Var.getContext();
                    Object c10 = kotlinx.coroutines.internal.y.c(context, o0Var.f38627f);
                    ie.d<T> dVar2 = o0Var.f38629h;
                    n.a aVar2 = ee.n.f29807a;
                    dVar2.resumeWith(ee.n.a(t10));
                    ee.u uVar = ee.u.f29813a;
                    kotlinx.coroutines.internal.y.a(context, c10);
                }
                do {
                } while (a10.K0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        n.a aVar3 = ee.n.f29807a;
        dVar.resumeWith(ee.n.a(t10));
    }

    public static final <T> void e(ie.d<? super T> dVar, Throwable th) {
        qe.k.g(dVar, "$this$resumeCancellableWithException");
        qe.k.g(th, "exception");
        if (dVar instanceof o0) {
            o0 o0Var = (o0) dVar;
            ie.g context = o0Var.f38629h.getContext();
            boolean z10 = false;
            r rVar = new r(th, false, 2, null);
            if (o0Var.f38628g.h0(context)) {
                o0Var.f38625d = new r(th, false, 2, null);
                o0Var.f38651c = 1;
                o0Var.f38628g.g0(context, o0Var);
                return;
            }
            w0 a10 = e2.f38598b.a();
            if (a10.E0()) {
                o0Var.f38625d = rVar;
                o0Var.f38651c = 1;
                a10.r0(o0Var);
                return;
            }
            a10.z0(true);
            try {
                i1 i1Var = (i1) o0Var.getContext().get(i1.f38615f0);
                if (i1Var != null && !i1Var.a()) {
                    CancellationException l10 = i1Var.l();
                    n.a aVar = ee.n.f29807a;
                    o0Var.resumeWith(ee.n.a(ee.o.a(l10)));
                    z10 = true;
                }
                if (!z10) {
                    ie.g context2 = o0Var.getContext();
                    Object c10 = kotlinx.coroutines.internal.y.c(context2, o0Var.f38627f);
                    ie.d<T> dVar2 = o0Var.f38629h;
                    n.a aVar2 = ee.n.f29807a;
                    dVar2.resumeWith(ee.n.a(ee.o.a(kotlinx.coroutines.internal.t.j(th, dVar2))));
                    ee.u uVar = ee.u.f29813a;
                    kotlinx.coroutines.internal.y.a(context2, c10);
                }
                do {
                } while (a10.K0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        n.a aVar3 = ee.n.f29807a;
        dVar.resumeWith(ee.n.a(ee.o.a(kotlinx.coroutines.internal.t.j(th, dVar))));
    }

    public static final <T> void f(ie.d<? super T> dVar, T t10) {
        qe.k.g(dVar, "$this$resumeDirect");
        if (!(dVar instanceof o0)) {
            n.a aVar = ee.n.f29807a;
            dVar.resumeWith(ee.n.a(t10));
            return;
        }
        ie.d<T> dVar2 = ((o0) dVar).f38629h;
        n.a aVar2 = ee.n.f29807a;
        dVar2.resumeWith(ee.n.a(t10));
    }

    public static final <T> void g(ie.d<? super T> dVar, Throwable th) {
        qe.k.g(dVar, "$this$resumeDirectWithException");
        qe.k.g(th, "exception");
        if (dVar instanceof o0) {
            ie.d<T> dVar2 = ((o0) dVar).f38629h;
            n.a aVar = ee.n.f29807a;
            dVar2.resumeWith(ee.n.a(ee.o.a(kotlinx.coroutines.internal.t.j(th, dVar2))));
            return;
        }
        n.a aVar2 = ee.n.f29807a;
        dVar.resumeWith(ee.n.a(ee.o.a(kotlinx.coroutines.internal.t.j(th, dVar))));
    }

    private static final void h(r0<?> r0Var) {
        w0 a10 = e2.f38598b.a();
        if (a10.E0()) {
            a10.r0(r0Var);
            return;
        }
        a10.z0(true);
        try {
            c(r0Var, r0Var.d(), 3);
            do {
            } while (a10.K0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
