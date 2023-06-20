package androidx.lifecycle;

import androidx.lifecycle.i;
import we.i1;

/* compiled from: LifecycleController.kt */
/* loaded from: classes.dex */
final class LifecycleController$observer$1 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j f3315a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i1 f3316b;

    @Override // androidx.lifecycle.m
    public final void b(p pVar, i.b bVar) {
        qe.k.g(pVar, "source");
        qe.k.g(bVar, "<anonymous parameter 1>");
        i lifecycle = pVar.getLifecycle();
        qe.k.b(lifecycle, "source.lifecycle");
        if (lifecycle.b() != i.c.DESTROYED) {
            i lifecycle2 = pVar.getLifecycle();
            qe.k.b(lifecycle2, "source.lifecycle");
            if (lifecycle2.b().compareTo(j.b(this.f3315a)) < 0) {
                j.a(this.f3315a);
                throw null;
            } else {
                j.a(this.f3315a);
                throw null;
            }
        }
        i1.a.a(this.f3316b, null, 1, null);
        throw null;
    }
}
