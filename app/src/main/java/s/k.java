package s;

import java.util.HashSet;
import t.b;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: y0  reason: collision with root package name */
    private boolean f36676y0 = false;

    public k() {
        new b.a();
    }

    @Override // s.i, s.h
    public void b(f fVar) {
        q1();
    }

    public void q1() {
        for (int i10 = 0; i10 < this.f36674x0; i10++) {
            e eVar = this.f36673w0[i10];
            if (eVar != null) {
                eVar.R0(true);
            }
        }
    }

    public boolean r1(HashSet<e> hashSet) {
        for (int i10 = 0; i10 < this.f36674x0; i10++) {
            if (hashSet.contains(this.f36673w0[i10])) {
                return true;
            }
        }
        return false;
    }

    public boolean s1() {
        return this.f36676y0;
    }
}
