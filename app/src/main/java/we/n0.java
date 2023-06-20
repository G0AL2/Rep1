package we;

import ie.g;

/* compiled from: Delay.kt */
/* loaded from: classes3.dex */
public final class n0 {
    public static final Object a(long j10, ie.d<? super ee.u> dVar) {
        ie.d b10;
        Object c10;
        if (j10 <= 0) {
            return ee.u.f29813a;
        }
        b10 = je.c.b(dVar);
        i iVar = new i(b10, 1);
        b(iVar.getContext()).e(j10, iVar);
        Object q10 = iVar.q();
        c10 = je.d.c();
        if (q10 == c10) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return q10;
    }

    public static final m0 b(ie.g gVar) {
        qe.k.g(gVar, "$this$delay");
        g.b bVar = gVar.get(ie.e.f31935b0);
        if (!(bVar instanceof m0)) {
            bVar = null;
        }
        m0 m0Var = (m0) bVar;
        return m0Var != null ? m0Var : l0.a();
    }
}
