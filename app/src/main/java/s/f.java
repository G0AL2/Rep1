package s;

import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import s.e;
import t.b;

/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public class f extends l {
    int D0;
    int E0;

    /* renamed from: z0  reason: collision with root package name */
    private int f36667z0;

    /* renamed from: x0  reason: collision with root package name */
    t.b f36665x0 = new t.b(this);

    /* renamed from: y0  reason: collision with root package name */
    public t.e f36666y0 = new t.e(this);
    protected b.InterfaceC0502b A0 = null;
    private boolean B0 = false;
    protected p.d C0 = new p.d();
    public int F0 = 0;
    public int G0 = 0;
    c[] H0 = new c[4];
    c[] I0 = new c[4];
    private int J0 = 257;
    private boolean K0 = false;
    private boolean L0 = false;
    private WeakReference<d> M0 = null;
    private WeakReference<d> N0 = null;
    private WeakReference<d> O0 = null;
    private WeakReference<d> P0 = null;
    HashSet<e> Q0 = new HashSet<>();
    public b.a R0 = new b.a();

    public static boolean O1(int i10, e eVar, b.InterfaceC0502b interfaceC0502b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0502b == null) {
            return false;
        }
        if (eVar.T() != 8 && !(eVar instanceof g) && !(eVar instanceof a)) {
            aVar.f37000a = eVar.y();
            aVar.f37001b = eVar.R();
            aVar.f37002c = eVar.U();
            aVar.f37003d = eVar.v();
            aVar.f37008i = false;
            aVar.f37009j = i11;
            e.b bVar = aVar.f37000a;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z10 = bVar == bVar2;
            boolean z11 = aVar.f37001b == bVar2;
            boolean z12 = z10 && eVar.f36612a0 > 0.0f;
            boolean z13 = z11 && eVar.f36612a0 > 0.0f;
            if (z10 && eVar.Y(0) && eVar.f36649t == 0 && !z12) {
                aVar.f37000a = e.b.WRAP_CONTENT;
                if (z11 && eVar.f36651u == 0) {
                    aVar.f37000a = e.b.FIXED;
                }
                z10 = false;
            }
            if (z11 && eVar.Y(1) && eVar.f36651u == 0 && !z13) {
                aVar.f37001b = e.b.WRAP_CONTENT;
                if (z10 && eVar.f36649t == 0) {
                    aVar.f37001b = e.b.FIXED;
                }
                z11 = false;
            }
            if (eVar.l0()) {
                aVar.f37000a = e.b.FIXED;
                z10 = false;
            }
            if (eVar.m0()) {
                aVar.f37001b = e.b.FIXED;
                z11 = false;
            }
            if (z12) {
                if (eVar.f36653v[0] == 4) {
                    aVar.f37000a = e.b.FIXED;
                } else if (!z11) {
                    e.b bVar3 = aVar.f37001b;
                    e.b bVar4 = e.b.FIXED;
                    if (bVar3 == bVar4) {
                        i13 = aVar.f37003d;
                    } else {
                        aVar.f37000a = e.b.WRAP_CONTENT;
                        interfaceC0502b.b(eVar, aVar);
                        i13 = aVar.f37005f;
                    }
                    aVar.f37000a = bVar4;
                    aVar.f37002c = (int) (eVar.t() * i13);
                }
            }
            if (z13) {
                if (eVar.f36653v[1] == 4) {
                    aVar.f37001b = e.b.FIXED;
                } else if (!z10) {
                    e.b bVar5 = aVar.f37000a;
                    e.b bVar6 = e.b.FIXED;
                    if (bVar5 == bVar6) {
                        i12 = aVar.f37002c;
                    } else {
                        aVar.f37001b = e.b.WRAP_CONTENT;
                        interfaceC0502b.b(eVar, aVar);
                        i12 = aVar.f37004e;
                    }
                    aVar.f37001b = bVar6;
                    if (eVar.u() == -1) {
                        aVar.f37003d = (int) (i12 / eVar.t());
                    } else {
                        aVar.f37003d = (int) (eVar.t() * i12);
                    }
                }
            }
            interfaceC0502b.b(eVar, aVar);
            eVar.h1(aVar.f37004e);
            eVar.I0(aVar.f37005f);
            eVar.H0(aVar.f37007h);
            eVar.x0(aVar.f37006g);
            aVar.f37009j = b.a.f36997k;
            return aVar.f37008i;
        }
        aVar.f37004e = 0;
        aVar.f37005f = 0;
        return false;
    }

    private void Q1() {
        this.F0 = 0;
        this.G0 = 0;
    }

    private void u1(e eVar) {
        int i10 = this.F0 + 1;
        c[] cVarArr = this.I0;
        if (i10 >= cVarArr.length) {
            this.I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.I0[this.F0] = new c(eVar, 0, L1());
        this.F0++;
    }

    private void x1(d dVar, p.i iVar) {
        this.C0.h(iVar, this.C0.q(dVar), 0, 5);
    }

    private void y1(d dVar, p.i iVar) {
        this.C0.h(this.C0.q(dVar), iVar, 0, 5);
    }

    private void z1(e eVar) {
        int i10 = this.G0 + 1;
        c[] cVarArr = this.H0;
        if (i10 >= cVarArr.length) {
            this.H0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.H0[this.G0] = new c(eVar, 1, L1());
        this.G0++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A1(d dVar) {
        WeakReference<d> weakReference = this.O0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.O0.get().d()) {
            this.O0 = new WeakReference<>(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B1(d dVar) {
        WeakReference<d> weakReference = this.M0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.M0.get().d()) {
            this.M0 = new WeakReference<>(dVar);
        }
    }

    public boolean C1(boolean z10) {
        return this.f36666y0.f(z10);
    }

    public boolean D1(boolean z10) {
        return this.f36666y0.g(z10);
    }

    public boolean E1(boolean z10, int i10) {
        return this.f36666y0.h(z10, i10);
    }

    public b.InterfaceC0502b F1() {
        return this.A0;
    }

    public int G1() {
        return this.J0;
    }

    public p.d H1() {
        return this.C0;
    }

    public void I1() {
        this.f36666y0.j();
    }

    public void J1() {
        this.f36666y0.k();
    }

    public boolean K1() {
        return this.L0;
    }

    public boolean L1() {
        return this.B0;
    }

    @Override // s.e
    public void M(StringBuilder sb2) {
        sb2.append(this.f36633l + ":{\n");
        sb2.append("  actualWidth:" + this.Y);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Z);
        sb2.append("\n");
        Iterator<e> it = o1().iterator();
        while (it.hasNext()) {
            it.next().M(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public boolean M1() {
        return this.K0;
    }

    public long N1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.D0 = i17;
        this.E0 = i18;
        return this.f36665x0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean P1(int i10) {
        return (this.J0 & i10) == i10;
    }

    public void R1(b.InterfaceC0502b interfaceC0502b) {
        this.A0 = interfaceC0502b;
        this.f36666y0.n(interfaceC0502b);
    }

    public void S1(int i10) {
        this.J0 = i10;
        p.d.f35313r = P1(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    public void T1(int i10) {
        this.f36667z0 = i10;
    }

    public void U1(boolean z10) {
        this.B0 = z10;
    }

    public boolean V1(p.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean P1 = P1(64);
        n1(dVar, P1);
        int size = this.f36677w0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f36677w0.get(i10);
            eVar.n1(dVar, P1);
            if (eVar.a0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void W1() {
        this.f36665x0.e(this);
    }

    @Override // s.e
    public void m1(boolean z10, boolean z11) {
        super.m1(z10, z11);
        int size = this.f36677w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f36677w0.get(i10).m1(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0312  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // s.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p1() {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.f.p1():void");
    }

    @Override // s.l, s.e
    public void r0() {
        this.C0.D();
        this.D0 = 0;
        this.E0 = 0;
        super.r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s1(e eVar, int i10) {
        if (i10 == 0) {
            u1(eVar);
        } else if (i10 == 1) {
            z1(eVar);
        }
    }

    public boolean t1(p.d dVar) {
        boolean P1 = P1(64);
        g(dVar, P1);
        int size = this.f36677w0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f36677w0.get(i10);
            eVar.P0(0, false);
            eVar.P0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.f36677w0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).v1();
                }
            }
        }
        this.Q0.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.f36677w0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof k) {
                    this.Q0.add(eVar3);
                } else {
                    eVar3.g(dVar, P1);
                }
            }
        }
        while (this.Q0.size() > 0) {
            int size2 = this.Q0.size();
            Iterator<e> it = this.Q0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                if (kVar.r1(this.Q0)) {
                    kVar.g(dVar, P1);
                    this.Q0.remove(kVar);
                    break;
                }
            }
            if (size2 == this.Q0.size()) {
                Iterator<e> it2 = this.Q0.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, P1);
                }
                this.Q0.clear();
            }
        }
        if (p.d.f35313r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.f36677w0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                j.a(this, dVar, next);
                next.g(dVar, P1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar5 = this.f36677w0.get(i14);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.W;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.M0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.d1(e.b.FIXED);
                    }
                    eVar5.g(dVar, P1);
                    if (bVar == bVar3) {
                        eVar5.M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.d1(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar, P1);
                    }
                }
            }
        }
        if (this.F0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.G0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    public void v1(d dVar) {
        WeakReference<d> weakReference = this.P0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.P0.get().d()) {
            this.P0 = new WeakReference<>(dVar);
        }
    }

    public void w1(d dVar) {
        WeakReference<d> weakReference = this.N0;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.N0.get().d()) {
            this.N0 = new WeakReference<>(dVar);
        }
    }
}
