package p;

import java.util.ArrayList;
import p.d;
import p.i;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: c  reason: collision with root package name */
    boolean f35305c;

    /* renamed from: e  reason: collision with root package name */
    public a f35307e;

    /* renamed from: a  reason: collision with root package name */
    i f35303a = null;

    /* renamed from: b  reason: collision with root package name */
    float f35304b = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<i> f35306d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    boolean f35308f = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        i a(int i10);

        void b();

        float c(b bVar, boolean z10);

        void clear();

        float d(i iVar, boolean z10);

        void e(i iVar, float f10);

        void f(i iVar, float f10, boolean z10);

        int g();

        float h(int i10);

        boolean i(i iVar);

        float j(i iVar);

        void k(float f10);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f35361m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int g10 = this.f35307e.g();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < g10; i10++) {
            float h10 = this.f35307e.h(i10);
            if (h10 < 0.0f) {
                i a10 = this.f35307e.a(i10);
                if ((zArr == null || !zArr[a10.f35351c]) && a10 != iVar && (((aVar = a10.f35358j) == i.a.SLACK || aVar == i.a.ERROR) && h10 < f10)) {
                    f10 = h10;
                    iVar2 = a10;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f35355g) {
            return;
        }
        this.f35304b += iVar.f35354f * this.f35307e.j(iVar);
        this.f35307e.d(iVar, z10);
        if (z10) {
            iVar.g(this);
        }
        if (d.f35315t && this.f35307e.g() == 0) {
            this.f35308f = true;
            dVar.f35322a = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f35304b += bVar.f35304b * this.f35307e.c(bVar, z10);
        if (z10) {
            bVar.f35303a.g(this);
        }
        if (d.f35315t && this.f35303a != null && this.f35307e.g() == 0) {
            this.f35308f = true;
            dVar.f35322a = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f35362n) {
            return;
        }
        float j10 = this.f35307e.j(iVar);
        this.f35304b += iVar.f35364p * j10;
        this.f35307e.d(iVar, z10);
        if (z10) {
            iVar.g(this);
        }
        this.f35307e.f(dVar.f35335n.f35312d[iVar.f35363o], j10, z10);
        if (d.f35315t && this.f35307e.g() == 0) {
            this.f35308f = true;
            dVar.f35322a = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f35328g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int g10 = this.f35307e.g();
            for (int i10 = 0; i10 < g10; i10++) {
                i a10 = this.f35307e.a(i10);
                if (a10.f35352d != -1 || a10.f35355g || a10.f35362n) {
                    this.f35306d.add(a10);
                }
            }
            int size = this.f35306d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f35306d.get(i11);
                    if (iVar.f35355g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f35362n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f35328g[iVar.f35352d], true);
                    }
                }
                this.f35306d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f35315t && this.f35303a != null && this.f35307e.g() == 0) {
            this.f35308f = true;
            dVar.f35322a = true;
        }
    }

    @Override // p.d.a
    public void a(i iVar) {
        int i10 = iVar.f35353e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f35307e.e(iVar, f10);
    }

    @Override // p.d.a
    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f35303a = null;
            this.f35307e.clear();
            for (int i10 = 0; i10 < bVar.f35307e.g(); i10++) {
                this.f35307e.f(bVar.f35307e.a(i10), bVar.f35307e.h(i10), true);
            }
        }
    }

    @Override // p.d.a
    public i c(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // p.d.a
    public void clear() {
        this.f35307e.clear();
        this.f35303a = null;
        this.f35304b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f35307e.e(dVar.o(i10, "ep"), 1.0f);
        this.f35307e.e(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e(i iVar, int i10) {
        this.f35307e.e(iVar, i10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f35307e.g() == 0) {
            this.f35308f = true;
        }
        return z10;
    }

    i g(d dVar) {
        boolean u10;
        boolean u11;
        int g10 = this.f35307e.g();
        i iVar = null;
        i iVar2 = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < g10; i10++) {
            float h10 = this.f35307e.h(i10);
            i a10 = this.f35307e.a(i10);
            if (a10.f35358j == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u11 = u(a10, dVar);
                } else if (f10 > h10) {
                    u11 = u(a10, dVar);
                } else if (!z10 && u(a10, dVar)) {
                    f10 = h10;
                    iVar = a10;
                    z10 = true;
                }
                z10 = u11;
                f10 = h10;
                iVar = a10;
            } else if (iVar == null && h10 < 0.0f) {
                if (iVar2 == null) {
                    u10 = u(a10, dVar);
                } else if (f11 > h10) {
                    u10 = u(a10, dVar);
                } else if (!z11 && u(a10, dVar)) {
                    f11 = h10;
                    iVar2 = a10;
                    z11 = true;
                }
                z11 = u10;
                f11 = h10;
                iVar2 = a10;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // p.d.a
    public i getKey() {
        return this.f35303a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f35307e.e(iVar, 1.0f);
            this.f35307e.e(iVar4, 1.0f);
            this.f35307e.e(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f35307e.e(iVar, 1.0f);
            this.f35307e.e(iVar2, -1.0f);
            this.f35307e.e(iVar3, -1.0f);
            this.f35307e.e(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f35304b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f35307e.e(iVar, -1.0f);
            this.f35307e.e(iVar2, 1.0f);
            this.f35304b = i10;
        } else if (f10 >= 1.0f) {
            this.f35307e.e(iVar4, -1.0f);
            this.f35307e.e(iVar3, 1.0f);
            this.f35304b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f35307e.e(iVar, f11 * 1.0f);
            this.f35307e.e(iVar2, f11 * (-1.0f));
            this.f35307e.e(iVar3, (-1.0f) * f10);
            this.f35307e.e(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f35304b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b i(i iVar, int i10) {
        this.f35303a = iVar;
        float f10 = i10;
        iVar.f35354f = f10;
        this.f35304b = f10;
        this.f35308f = true;
        return this;
    }

    @Override // p.d.a
    public boolean isEmpty() {
        return this.f35303a == null && this.f35304b == 0.0f && this.f35307e.g() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b j(i iVar, i iVar2, float f10) {
        this.f35307e.e(iVar, -1.0f);
        this.f35307e.e(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f35307e.e(iVar, -1.0f);
        this.f35307e.e(iVar2, 1.0f);
        this.f35307e.e(iVar3, f10);
        this.f35307e.e(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f35304b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f35307e.e(iVar, 1.0f);
            this.f35307e.e(iVar2, -1.0f);
            this.f35307e.e(iVar4, 1.0f);
            this.f35307e.e(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f35307e.e(iVar, 1.0f);
            this.f35307e.e(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f35307e.e(iVar3, 1.0f);
            this.f35307e.e(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f35307e.e(iVar, 1.0f);
            this.f35307e.e(iVar2, -1.0f);
            this.f35307e.e(iVar4, f13);
            this.f35307e.e(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f35304b = i10 * (-1);
            this.f35307e.e(iVar, 1.0f);
        } else {
            this.f35304b = i10;
            this.f35307e.e(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f35304b = i10;
        }
        if (!z10) {
            this.f35307e.e(iVar, -1.0f);
            this.f35307e.e(iVar2, 1.0f);
        } else {
            this.f35307e.e(iVar, 1.0f);
            this.f35307e.e(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f35304b = i10;
        }
        if (!z10) {
            this.f35307e.e(iVar, -1.0f);
            this.f35307e.e(iVar2, 1.0f);
            this.f35307e.e(iVar3, 1.0f);
        } else {
            this.f35307e.e(iVar, 1.0f);
            this.f35307e.e(iVar2, -1.0f);
            this.f35307e.e(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f35304b = i10;
        }
        if (!z10) {
            this.f35307e.e(iVar, -1.0f);
            this.f35307e.e(iVar2, 1.0f);
            this.f35307e.e(iVar3, -1.0f);
        } else {
            this.f35307e.e(iVar, 1.0f);
            this.f35307e.e(iVar2, -1.0f);
            this.f35307e.e(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f35307e.e(iVar3, 0.5f);
        this.f35307e.e(iVar4, 0.5f);
        this.f35307e.e(iVar, -0.5f);
        this.f35307e.e(iVar2, -0.5f);
        this.f35304b = -f10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        float f10 = this.f35304b;
        if (f10 < 0.0f) {
            this.f35304b = f10 * (-1.0f);
            this.f35307e.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.f35303a;
        return iVar != null && (iVar.f35358j == i.a.UNRESTRICTED || this.f35304b >= 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f35307e.i(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(i iVar) {
        i iVar2 = this.f35303a;
        if (iVar2 != null) {
            this.f35307e.e(iVar2, -1.0f);
            this.f35303a.f35352d = -1;
            this.f35303a = null;
        }
        float d10 = this.f35307e.d(iVar, true) * (-1.0f);
        this.f35303a = iVar;
        if (d10 == 1.0f) {
            return;
        }
        this.f35304b /= d10;
        this.f35307e.k(d10);
    }

    public void y() {
        this.f35303a = null;
        this.f35307e.clear();
        this.f35304b = 0.0f;
        this.f35308f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String z() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f35307e = new p.a(this, cVar);
    }
}
