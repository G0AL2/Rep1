package f1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import f1.m;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class q extends m {
    int L;
    private ArrayList<m> J = new ArrayList<>();
    private boolean K = true;
    boolean M = false;
    private int N = 0;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    class a extends n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f30057a;

        a(q qVar, m mVar) {
            this.f30057a = mVar;
        }

        @Override // f1.m.f
        public void d(m mVar) {
            this.f30057a.U();
            mVar.Q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public static class b extends n {

        /* renamed from: a  reason: collision with root package name */
        q f30058a;

        b(q qVar) {
            this.f30058a = qVar;
        }

        @Override // f1.m.f
        public void d(m mVar) {
            q qVar = this.f30058a;
            int i10 = qVar.L - 1;
            qVar.L = i10;
            if (i10 == 0) {
                qVar.M = false;
                qVar.q();
            }
            mVar.Q(this);
        }

        @Override // f1.n, f1.m.f
        public void e(m mVar) {
            q qVar = this.f30058a;
            if (qVar.M) {
                return;
            }
            qVar.b0();
            this.f30058a.M = true;
        }
    }

    private void g0(m mVar) {
        this.J.add(mVar);
        mVar.f30033r = this;
    }

    private void p0() {
        b bVar = new b(this);
        Iterator<m> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.L = this.J.size();
    }

    @Override // f1.m
    public void O(View view) {
        super.O(view);
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.J.get(i10).O(view);
        }
    }

    @Override // f1.m
    public void S(View view) {
        super.S(view);
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.J.get(i10).S(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f1.m
    public void U() {
        if (this.J.isEmpty()) {
            b0();
            q();
            return;
        }
        p0();
        if (!this.K) {
            for (int i10 = 1; i10 < this.J.size(); i10++) {
                this.J.get(i10 - 1).a(new a(this, this.J.get(i10)));
            }
            m mVar = this.J.get(0);
            if (mVar != null) {
                mVar.U();
                return;
            }
            return;
        }
        Iterator<m> it = this.J.iterator();
        while (it.hasNext()) {
            it.next().U();
        }
    }

    @Override // f1.m
    public void W(m.e eVar) {
        super.W(eVar);
        this.N |= 8;
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.J.get(i10).W(eVar);
        }
    }

    @Override // f1.m
    public void Y(g gVar) {
        super.Y(gVar);
        this.N |= 4;
        if (this.J != null) {
            for (int i10 = 0; i10 < this.J.size(); i10++) {
                this.J.get(i10).Y(gVar);
            }
        }
    }

    @Override // f1.m
    public void Z(p pVar) {
        super.Z(pVar);
        this.N |= 2;
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.J.get(i10).Z(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f1.m
    public String c0(String str) {
        String c02 = super.c0(str);
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c02);
            sb2.append("\n");
            sb2.append(this.J.get(i10).c0(str + "  "));
            c02 = sb2.toString();
        }
        return c02;
    }

    @Override // f1.m
    /* renamed from: d0 */
    public q a(m.f fVar) {
        return (q) super.a(fVar);
    }

    @Override // f1.m
    /* renamed from: e0 */
    public q b(View view) {
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            this.J.get(i10).b(view);
        }
        return (q) super.b(view);
    }

    @Override // f1.m
    public void f(s sVar) {
        if (H(sVar.f30063b)) {
            Iterator<m> it = this.J.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.H(sVar.f30063b)) {
                    next.f(sVar);
                    sVar.f30064c.add(next);
                }
            }
        }
    }

    public q f0(m mVar) {
        g0(mVar);
        long j10 = this.f30018c;
        if (j10 >= 0) {
            mVar.V(j10);
        }
        if ((this.N & 1) != 0) {
            mVar.X(t());
        }
        if ((this.N & 2) != 0) {
            mVar.Z(x());
        }
        if ((this.N & 4) != 0) {
            mVar.Y(w());
        }
        if ((this.N & 8) != 0) {
            mVar.W(s());
        }
        return this;
    }

    public m h0(int i10) {
        if (i10 < 0 || i10 >= this.J.size()) {
            return null;
        }
        return this.J.get(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f1.m
    public void i(s sVar) {
        super.i(sVar);
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.J.get(i10).i(sVar);
        }
    }

    public int i0() {
        return this.J.size();
    }

    @Override // f1.m
    public void j(s sVar) {
        if (H(sVar.f30063b)) {
            Iterator<m> it = this.J.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.H(sVar.f30063b)) {
                    next.j(sVar);
                    sVar.f30064c.add(next);
                }
            }
        }
    }

    @Override // f1.m
    /* renamed from: j0 */
    public q Q(m.f fVar) {
        return (q) super.Q(fVar);
    }

    @Override // f1.m
    /* renamed from: k0 */
    public q R(View view) {
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            this.J.get(i10).R(view);
        }
        return (q) super.R(view);
    }

    @Override // f1.m
    /* renamed from: l0 */
    public q V(long j10) {
        ArrayList<m> arrayList;
        super.V(j10);
        if (this.f30018c >= 0 && (arrayList = this.J) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.J.get(i10).V(j10);
            }
        }
        return this;
    }

    @Override // f1.m
    /* renamed from: m0 */
    public q X(TimeInterpolator timeInterpolator) {
        this.N |= 1;
        ArrayList<m> arrayList = this.J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.J.get(i10).X(timeInterpolator);
            }
        }
        return (q) super.X(timeInterpolator);
    }

    @Override // f1.m
    /* renamed from: n */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.J = new ArrayList<>();
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            qVar.g0(this.J.get(i10).clone());
        }
        return qVar;
    }

    public q n0(int i10) {
        if (i10 == 0) {
            this.K = true;
        } else if (i10 == 1) {
            this.K = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    @Override // f1.m
    /* renamed from: o0 */
    public q a0(long j10) {
        return (q) super.a0(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f1.m
    public void p(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long z10 = z();
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = this.J.get(i10);
            if (z10 > 0 && (this.K || i10 == 0)) {
                long z11 = mVar.z();
                if (z11 > 0) {
                    mVar.a0(z11 + z10);
                } else {
                    mVar.a0(z10);
                }
            }
            mVar.p(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
