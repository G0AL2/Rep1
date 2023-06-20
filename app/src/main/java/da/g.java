package da;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: BaseDataSource.java */
/* loaded from: classes2.dex */
public abstract class g implements l {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29166a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<m0> f29167b = new ArrayList<>(1);

    /* renamed from: c  reason: collision with root package name */
    private int f29168c;

    /* renamed from: d  reason: collision with root package name */
    private p f29169d;

    /* JADX INFO: Access modifiers changed from: protected */
    public g(boolean z10) {
        this.f29166a = z10;
    }

    @Override // da.l
    public /* synthetic */ Map e() {
        return k.a(this);
    }

    @Override // da.l
    public final void l(m0 m0Var) {
        ea.a.e(m0Var);
        if (this.f29167b.contains(m0Var)) {
            return;
        }
        this.f29167b.add(m0Var);
        this.f29168c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(int i10) {
        p pVar = (p) ea.n0.j(this.f29169d);
        for (int i11 = 0; i11 < this.f29168c; i11++) {
            this.f29167b.get(i11).b(this, pVar, this.f29166a, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r() {
        p pVar = (p) ea.n0.j(this.f29169d);
        for (int i10 = 0; i10 < this.f29168c; i10++) {
            this.f29167b.get(i10).d(this, pVar, this.f29166a);
        }
        this.f29169d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(p pVar) {
        for (int i10 = 0; i10 < this.f29168c; i10++) {
            this.f29167b.get(i10).i(this, pVar, this.f29166a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(p pVar) {
        this.f29169d = pVar;
        for (int i10 = 0; i10 < this.f29168c; i10++) {
            this.f29167b.get(i10).e(this, pVar, this.f29166a);
        }
    }
}
