package qe;

import java.io.Serializable;

/* compiled from: Lambda.kt */
/* loaded from: classes3.dex */
public abstract class l<R> implements h<R>, Serializable {
    private final int arity;

    public l(int i10) {
        this.arity = i10;
    }

    @Override // qe.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String f10 = t.f(this);
        k.e(f10, "renderLambdaToString(this)");
        return f10;
    }
}
