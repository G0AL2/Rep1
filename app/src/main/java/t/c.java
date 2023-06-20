package t;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    ArrayList<p> f37010k;

    /* renamed from: l  reason: collision with root package name */
    private int f37011l;

    public c(s.e eVar, int i10) {
        super(eVar);
        this.f37010k = new ArrayList<>();
        this.f37064f = i10;
        q();
    }

    private void q() {
        s.e eVar;
        s.e eVar2 = this.f37060b;
        s.e J = eVar2.J(this.f37064f);
        while (true) {
            s.e eVar3 = J;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            J = eVar2.J(this.f37064f);
        }
        this.f37060b = eVar;
        this.f37010k.add(eVar.L(this.f37064f));
        s.e H = eVar.H(this.f37064f);
        while (H != null) {
            this.f37010k.add(H.L(this.f37064f));
            H = H.H(this.f37064f);
        }
        Iterator<p> it = this.f37010k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f37064f;
            if (i10 == 0) {
                next.f37060b.f36613b = this;
            } else if (i10 == 1) {
                next.f37060b.f36615c = this;
            }
        }
        if ((this.f37064f == 0 && ((s.f) this.f37060b.I()).L1()) && this.f37010k.size() > 1) {
            ArrayList<p> arrayList = this.f37010k;
            this.f37060b = arrayList.get(arrayList.size() - 1).f37060b;
        }
        this.f37011l = this.f37064f == 0 ? this.f37060b.x() : this.f37060b.Q();
    }

    private s.e r() {
        for (int i10 = 0; i10 < this.f37010k.size(); i10++) {
            p pVar = this.f37010k.get(i10);
            if (pVar.f37060b.T() != 8) {
                return pVar.f37060b;
            }
        }
        return null;
    }

    private s.e s() {
        for (int size = this.f37010k.size() - 1; size >= 0; size--) {
            p pVar = this.f37010k.get(size);
            if (pVar.f37060b.T() != 8) {
                return pVar.f37060b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0402, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // t.p, t.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(t.d r27) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.c.a(t.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void d() {
        Iterator<p> it = this.f37010k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f37010k.size();
        if (size < 1) {
            return;
        }
        s.e eVar = this.f37010k.get(0).f37060b;
        s.e eVar2 = this.f37010k.get(size - 1).f37060b;
        if (this.f37064f == 0) {
            s.d dVar = eVar.L;
            s.d dVar2 = eVar2.N;
            f i10 = i(dVar, 0);
            int e10 = dVar.e();
            s.e r10 = r();
            if (r10 != null) {
                e10 = r10.L.e();
            }
            if (i10 != null) {
                b(this.f37066h, i10, e10);
            }
            f i11 = i(dVar2, 0);
            int e11 = dVar2.e();
            s.e s10 = s();
            if (s10 != null) {
                e11 = s10.N.e();
            }
            if (i11 != null) {
                b(this.f37067i, i11, -e11);
            }
        } else {
            s.d dVar3 = eVar.M;
            s.d dVar4 = eVar2.O;
            f i12 = i(dVar3, 1);
            int e12 = dVar3.e();
            s.e r11 = r();
            if (r11 != null) {
                e12 = r11.M.e();
            }
            if (i12 != null) {
                b(this.f37066h, i12, e12);
            }
            f i13 = i(dVar4, 1);
            int e13 = dVar4.e();
            s.e s11 = s();
            if (s11 != null) {
                e13 = s11.O.e();
            }
            if (i13 != null) {
                b(this.f37067i, i13, -e13);
            }
        }
        this.f37066h.f37020a = this;
        this.f37067i.f37020a = this;
    }

    @Override // t.p
    public void e() {
        for (int i10 = 0; i10 < this.f37010k.size(); i10++) {
            this.f37010k.get(i10).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public void f() {
        this.f37061c = null;
        Iterator<p> it = this.f37010k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // t.p
    public long j() {
        int size = this.f37010k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f37010k.get(i10);
            j10 = j10 + pVar.f37066h.f37025f + pVar.j() + pVar.f37067i.f37025f;
        }
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // t.p
    public boolean m() {
        int size = this.f37010k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f37010k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f37064f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f37010k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
