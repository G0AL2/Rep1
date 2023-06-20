package t;

import t.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f37041m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f37024e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f37024e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // t.f
    public void d(int i10) {
        if (this.f37029j) {
            return;
        }
        this.f37029j = true;
        this.f37026g = i10;
        for (d dVar : this.f37030k) {
            dVar.a(dVar);
        }
    }
}
