package t;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GuidelineReference.java */
/* loaded from: classes.dex */
public class j extends p {
    public j(s.e eVar) {
        super(eVar);
        eVar.f36617d.f();
        eVar.f36619e.f();
        this.f37064f = ((s.g) eVar).p1();
    }

    private void q(f fVar) {
        this.f37066h.f37030k.add(fVar);
        fVar.f37031l.add(this.f37066h);
    }

    @Override // t.p, t.d
    public void a(d dVar) {
        f fVar = this.f37066h;
        if (fVar.f37022c && !fVar.f37029j) {
            this.f37066h.d((int) ((fVar.f37031l.get(0).f37026g * ((s.g) this.f37060b).s1()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void d() {
        s.g gVar = (s.g) this.f37060b;
        int q12 = gVar.q1();
        int r12 = gVar.r1();
        gVar.s1();
        if (gVar.p1() == 1) {
            if (q12 != -1) {
                this.f37066h.f37031l.add(this.f37060b.X.f36617d.f37066h);
                this.f37060b.X.f36617d.f37066h.f37030k.add(this.f37066h);
                this.f37066h.f37025f = q12;
            } else if (r12 != -1) {
                this.f37066h.f37031l.add(this.f37060b.X.f36617d.f37067i);
                this.f37060b.X.f36617d.f37067i.f37030k.add(this.f37066h);
                this.f37066h.f37025f = -r12;
            } else {
                f fVar = this.f37066h;
                fVar.f37021b = true;
                fVar.f37031l.add(this.f37060b.X.f36617d.f37067i);
                this.f37060b.X.f36617d.f37067i.f37030k.add(this.f37066h);
            }
            q(this.f37060b.f36617d.f37066h);
            q(this.f37060b.f36617d.f37067i);
            return;
        }
        if (q12 != -1) {
            this.f37066h.f37031l.add(this.f37060b.X.f36619e.f37066h);
            this.f37060b.X.f36619e.f37066h.f37030k.add(this.f37066h);
            this.f37066h.f37025f = q12;
        } else if (r12 != -1) {
            this.f37066h.f37031l.add(this.f37060b.X.f36619e.f37067i);
            this.f37060b.X.f36619e.f37067i.f37030k.add(this.f37066h);
            this.f37066h.f37025f = -r12;
        } else {
            f fVar2 = this.f37066h;
            fVar2.f37021b = true;
            fVar2.f37031l.add(this.f37060b.X.f36619e.f37067i);
            this.f37060b.X.f36619e.f37067i.f37030k.add(this.f37066h);
        }
        q(this.f37060b.f36619e.f37066h);
        q(this.f37060b.f36619e.f37067i);
    }

    @Override // t.p
    public void e() {
        if (((s.g) this.f37060b).p1() == 1) {
            this.f37060b.j1(this.f37066h.f37026g);
        } else {
            this.f37060b.k1(this.f37066h.f37026g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f37066h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public boolean m() {
        return false;
    }
}
