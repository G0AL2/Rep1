package jb;

import java.io.Serializable;

/* compiled from: ByFunctionOrdering.java */
/* loaded from: classes3.dex */
final class g<F, T> extends i0<F> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final ib.f<F, ? extends T> f32987a;

    /* renamed from: b  reason: collision with root package name */
    final i0<T> f32988b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(ib.f<F, ? extends T> fVar, i0<T> i0Var) {
        this.f32987a = (ib.f) ib.l.j(fVar);
        this.f32988b = (i0) ib.l.j(i0Var);
    }

    @Override // jb.i0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f32988b.compare(this.f32987a.apply(f10), this.f32987a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f32987a.equals(gVar.f32987a) && this.f32988b.equals(gVar.f32988b);
        }
        return false;
    }

    public int hashCode() {
        return ib.i.b(this.f32987a, this.f32988b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f32988b);
        String valueOf2 = String.valueOf(this.f32987a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb2.append(valueOf);
        sb2.append(".onResultOf(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
