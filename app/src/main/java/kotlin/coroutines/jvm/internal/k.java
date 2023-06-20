package kotlin.coroutines.jvm.internal;

import qe.t;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class k extends d implements qe.h<Object> {
    private final int arity;

    public k(int i10, ie.d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // qe.h
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() == null) {
            String e10 = t.e(this);
            qe.k.e(e10, "renderLambdaToString(this)");
            return e10;
        }
        return super.toString();
    }

    public k(int i10) {
        this(i10, null);
    }
}
