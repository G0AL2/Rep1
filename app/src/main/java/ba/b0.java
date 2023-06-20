package ba;

import ea.n0;
import j8.n3;
import j8.z2;

/* compiled from: TrackSelectorResult.java */
/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f5043a;

    /* renamed from: b  reason: collision with root package name */
    public final z2[] f5044b;

    /* renamed from: c  reason: collision with root package name */
    public final q[] f5045c;

    /* renamed from: d  reason: collision with root package name */
    public final n3 f5046d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f5047e;

    public b0(z2[] z2VarArr, q[] qVarArr, n3 n3Var, Object obj) {
        this.f5044b = z2VarArr;
        this.f5045c = (q[]) qVarArr.clone();
        this.f5046d = n3Var;
        this.f5047e = obj;
        this.f5043a = z2VarArr.length;
    }

    public boolean a(b0 b0Var) {
        if (b0Var == null || b0Var.f5045c.length != this.f5045c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f5045c.length; i10++) {
            if (!b(b0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(b0 b0Var, int i10) {
        return b0Var != null && n0.c(this.f5044b[i10], b0Var.f5044b[i10]) && n0.c(this.f5045c[i10], b0Var.f5045c[i10]);
    }

    public boolean c(int i10) {
        return this.f5044b[i10] != null;
    }
}
