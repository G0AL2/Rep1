package t;

import t.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelperReferences.java */
/* loaded from: classes.dex */
public class k extends p {
    public k(s.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f37066h.f37030k.add(fVar);
        fVar.f37031l.add(this.f37066h);
    }

    @Override // t.p, t.d
    public void a(d dVar) {
        s.a aVar = (s.a) this.f37060b;
        int s12 = aVar.s1();
        int i10 = 0;
        int i11 = -1;
        for (f fVar : this.f37066h.f37031l) {
            int i12 = fVar.f37026g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (s12 != 0 && s12 != 2) {
            this.f37066h.d(i10 + aVar.t1());
        } else {
            this.f37066h.d(i11 + aVar.t1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void d() {
        s.e eVar = this.f37060b;
        if (eVar instanceof s.a) {
            this.f37066h.f37021b = true;
            s.a aVar = (s.a) eVar;
            int s12 = aVar.s1();
            boolean r12 = aVar.r1();
            int i10 = 0;
            if (s12 == 0) {
                this.f37066h.f37024e = f.a.LEFT;
                while (i10 < aVar.f36674x0) {
                    s.e eVar2 = aVar.f36673w0[i10];
                    if (r12 || eVar2.T() != 8) {
                        f fVar = eVar2.f36617d.f37066h;
                        fVar.f37030k.add(this.f37066h);
                        this.f37066h.f37031l.add(fVar);
                    }
                    i10++;
                }
                q(this.f37060b.f36617d.f37066h);
                q(this.f37060b.f36617d.f37067i);
            } else if (s12 == 1) {
                this.f37066h.f37024e = f.a.RIGHT;
                while (i10 < aVar.f36674x0) {
                    s.e eVar3 = aVar.f36673w0[i10];
                    if (r12 || eVar3.T() != 8) {
                        f fVar2 = eVar3.f36617d.f37067i;
                        fVar2.f37030k.add(this.f37066h);
                        this.f37066h.f37031l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f37060b.f36617d.f37066h);
                q(this.f37060b.f36617d.f37067i);
            } else if (s12 == 2) {
                this.f37066h.f37024e = f.a.TOP;
                while (i10 < aVar.f36674x0) {
                    s.e eVar4 = aVar.f36673w0[i10];
                    if (r12 || eVar4.T() != 8) {
                        f fVar3 = eVar4.f36619e.f37066h;
                        fVar3.f37030k.add(this.f37066h);
                        this.f37066h.f37031l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f37060b.f36619e.f37066h);
                q(this.f37060b.f36619e.f37067i);
            } else if (s12 != 3) {
            } else {
                this.f37066h.f37024e = f.a.BOTTOM;
                while (i10 < aVar.f36674x0) {
                    s.e eVar5 = aVar.f36673w0[i10];
                    if (r12 || eVar5.T() != 8) {
                        f fVar4 = eVar5.f36619e.f37067i;
                        fVar4.f37030k.add(this.f37066h);
                        this.f37066h.f37031l.add(fVar4);
                    }
                    i10++;
                }
                q(this.f37060b.f36619e.f37066h);
                q(this.f37060b.f36619e.f37067i);
            }
        }
    }

    @Override // t.p
    public void e() {
        s.e eVar = this.f37060b;
        if (eVar instanceof s.a) {
            int s12 = ((s.a) eVar).s1();
            if (s12 != 0 && s12 != 1) {
                this.f37060b.k1(this.f37066h.f37026g);
            } else {
                this.f37060b.j1(this.f37066h.f37026g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f37061c = null;
        this.f37066h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public boolean m() {
        return false;
    }
}
