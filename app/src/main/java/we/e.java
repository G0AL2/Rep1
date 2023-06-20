package we;

import ie.e;

/* compiled from: Builders.common.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class e {
    public static final i1 a(e0 e0Var, ie.g gVar, kotlinx.coroutines.a aVar, pe.p<? super e0, ? super ie.d<? super ee.u>, ? extends Object> pVar) {
        a a2Var;
        qe.k.g(e0Var, "$this$launch");
        qe.k.g(gVar, "context");
        qe.k.g(aVar, "start");
        qe.k.g(pVar, "block");
        ie.g c10 = y.c(e0Var, gVar);
        if (aVar.f()) {
            a2Var = new r1(c10, pVar);
        } else {
            a2Var = new a2(c10, true);
        }
        a2Var.s0(aVar, a2Var, pVar);
        return a2Var;
    }

    public static /* synthetic */ i1 b(e0 e0Var, ie.g gVar, kotlinx.coroutines.a aVar, pe.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = ie.h.f31938a;
        }
        if ((i10 & 2) != 0) {
            aVar = kotlinx.coroutines.a.DEFAULT;
        }
        return d.a(e0Var, gVar, aVar, pVar);
    }

    public static final <T> Object c(ie.g gVar, pe.p<? super e0, ? super ie.d<? super T>, ? extends Object> pVar, ie.d<? super T> dVar) {
        Object t02;
        Object c10;
        ie.g context = dVar.getContext();
        ie.g plus = context.plus(gVar);
        j2.a(plus);
        if (plus == context) {
            kotlinx.coroutines.internal.r rVar = new kotlinx.coroutines.internal.r(plus, dVar);
            t02 = xe.b.b(rVar, rVar, pVar);
        } else {
            e.b bVar = ie.e.f31935b0;
            if (qe.k.a((ie.e) plus.get(bVar), (ie.e) context.get(bVar))) {
                i2 i2Var = new i2(plus, dVar);
                Object c11 = kotlinx.coroutines.internal.y.c(plus, null);
                try {
                    Object b10 = xe.b.b(i2Var, i2Var, pVar);
                    kotlinx.coroutines.internal.y.a(plus, c11);
                    t02 = b10;
                } catch (Throwable th) {
                    kotlinx.coroutines.internal.y.a(plus, c11);
                    throw th;
                }
            } else {
                p0 p0Var = new p0(plus, dVar);
                p0Var.o0();
                xe.a.a(pVar, p0Var, p0Var);
                t02 = p0Var.t0();
            }
        }
        c10 = je.d.c();
        if (t02 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return t02;
    }
}
