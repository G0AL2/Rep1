package we;

import ee.n;

/* compiled from: ResumeMode.kt */
/* loaded from: classes3.dex */
public final class z1 {
    public static final boolean a(int i10) {
        return i10 == 1;
    }

    public static final boolean b(int i10) {
        return i10 == 0 || i10 == 1;
    }

    public static final <T> void c(ie.d<? super T> dVar, T t10, int i10) {
        qe.k.g(dVar, "$this$resumeMode");
        if (i10 == 0) {
            n.a aVar = ee.n.f29807a;
            dVar.resumeWith(ee.n.a(t10));
        } else if (i10 == 1) {
            q0.d(dVar, t10);
        } else if (i10 == 2) {
            q0.f(dVar, t10);
        } else if (i10 != 3) {
            if (i10 == 4) {
                return;
            }
            throw new IllegalStateException(("Invalid mode " + i10).toString());
        } else {
            o0 o0Var = (o0) dVar;
            ie.g context = o0Var.getContext();
            Object c10 = kotlinx.coroutines.internal.y.c(context, o0Var.f38627f);
            try {
                ie.d<T> dVar2 = o0Var.f38629h;
                n.a aVar2 = ee.n.f29807a;
                dVar2.resumeWith(ee.n.a(t10));
                ee.u uVar = ee.u.f29813a;
            } finally {
                kotlinx.coroutines.internal.y.a(context, c10);
            }
        }
    }

    public static final <T> void d(ie.d<? super T> dVar, T t10, int i10) {
        ie.d b10;
        ie.d b11;
        qe.k.g(dVar, "$this$resumeUninterceptedMode");
        if (i10 == 0) {
            b10 = je.c.b(dVar);
            n.a aVar = ee.n.f29807a;
            b10.resumeWith(ee.n.a(t10));
        } else if (i10 == 1) {
            b11 = je.c.b(dVar);
            q0.d(b11, t10);
        } else if (i10 == 2) {
            n.a aVar2 = ee.n.f29807a;
            dVar.resumeWith(ee.n.a(t10));
        } else if (i10 != 3) {
            if (i10 == 4) {
                return;
            }
            throw new IllegalStateException(("Invalid mode " + i10).toString());
        } else {
            ie.g context = dVar.getContext();
            Object c10 = kotlinx.coroutines.internal.y.c(context, null);
            try {
                n.a aVar3 = ee.n.f29807a;
                dVar.resumeWith(ee.n.a(t10));
                ee.u uVar = ee.u.f29813a;
            } finally {
                kotlinx.coroutines.internal.y.a(context, c10);
            }
        }
    }

    public static final <T> void e(ie.d<? super T> dVar, Throwable th, int i10) {
        ie.d b10;
        ie.d b11;
        qe.k.g(dVar, "$this$resumeUninterceptedWithExceptionMode");
        qe.k.g(th, "exception");
        if (i10 == 0) {
            b10 = je.c.b(dVar);
            n.a aVar = ee.n.f29807a;
            b10.resumeWith(ee.n.a(ee.o.a(th)));
        } else if (i10 == 1) {
            b11 = je.c.b(dVar);
            q0.e(b11, th);
        } else if (i10 == 2) {
            n.a aVar2 = ee.n.f29807a;
            dVar.resumeWith(ee.n.a(ee.o.a(th)));
        } else if (i10 != 3) {
            if (i10 == 4) {
                return;
            }
            throw new IllegalStateException(("Invalid mode " + i10).toString());
        } else {
            ie.g context = dVar.getContext();
            Object c10 = kotlinx.coroutines.internal.y.c(context, null);
            try {
                n.a aVar3 = ee.n.f29807a;
                dVar.resumeWith(ee.n.a(ee.o.a(th)));
                ee.u uVar = ee.u.f29813a;
            } finally {
                kotlinx.coroutines.internal.y.a(context, c10);
            }
        }
    }

    public static final <T> void f(ie.d<? super T> dVar, Throwable th, int i10) {
        qe.k.g(dVar, "$this$resumeWithExceptionMode");
        qe.k.g(th, "exception");
        if (i10 == 0) {
            n.a aVar = ee.n.f29807a;
            dVar.resumeWith(ee.n.a(ee.o.a(th)));
        } else if (i10 == 1) {
            q0.e(dVar, th);
        } else if (i10 == 2) {
            q0.g(dVar, th);
        } else if (i10 != 3) {
            if (i10 == 4) {
                return;
            }
            throw new IllegalStateException(("Invalid mode " + i10).toString());
        } else {
            o0 o0Var = (o0) dVar;
            ie.g context = o0Var.getContext();
            Object c10 = kotlinx.coroutines.internal.y.c(context, o0Var.f38627f);
            try {
                ie.d<T> dVar2 = o0Var.f38629h;
                n.a aVar2 = ee.n.f29807a;
                dVar2.resumeWith(ee.n.a(ee.o.a(kotlinx.coroutines.internal.t.j(th, dVar2))));
                ee.u uVar = ee.u.f29813a;
            } finally {
                kotlinx.coroutines.internal.y.a(context, c10);
            }
        }
    }
}
