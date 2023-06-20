package kotlin.coroutines.jvm.internal;

import ie.g;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class d extends a {
    private final ie.g _context;
    private transient ie.d<Object> intercepted;

    public d(ie.d<Object> dVar, ie.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // ie.d
    public ie.g getContext() {
        ie.g gVar = this._context;
        qe.k.c(gVar);
        return gVar;
    }

    public final ie.d<Object> intercepted() {
        ie.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            ie.e eVar = (ie.e) getContext().get(ie.e.f31935b0);
            if (eVar == null || (dVar = eVar.C(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        ie.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(ie.e.f31935b0);
            qe.k.c(bVar);
            ((ie.e) bVar).A(dVar);
        }
        this.intercepted = c.f33468a;
    }

    public d(ie.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
