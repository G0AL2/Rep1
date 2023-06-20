package s;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class l extends e {

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList<e> f36677w0 = new ArrayList<>();

    public void a(e eVar) {
        this.f36677w0.add(eVar);
        if (eVar.I() != null) {
            ((l) eVar.I()).q1(eVar);
        }
        eVar.Z0(this);
    }

    public ArrayList<e> o1() {
        return this.f36677w0;
    }

    public void p1() {
        ArrayList<e> arrayList = this.f36677w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f36677w0.get(i10);
            if (eVar instanceof l) {
                ((l) eVar).p1();
            }
        }
    }

    public void q1(e eVar) {
        this.f36677w0.remove(eVar);
        eVar.r0();
    }

    @Override // s.e
    public void r0() {
        this.f36677w0.clear();
        super.r0();
    }

    public void r1() {
        this.f36677w0.clear();
    }

    @Override // s.e
    public void t0(p.c cVar) {
        super.t0(cVar);
        int size = this.f36677w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f36677w0.get(i10).t0(cVar);
        }
    }
}
