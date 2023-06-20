package j8;

import android.os.Handler;
import com.google.android.exoplayer2.drm.k;
import i9.b0;
import i9.q0;
import i9.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: MediaSourceList.java */
/* loaded from: classes2.dex */
public final class i2 {

    /* renamed from: a */
    private final k8.o1 f32463a;

    /* renamed from: e */
    private final d f32467e;

    /* renamed from: f */
    private final b0.a f32468f;

    /* renamed from: g */
    private final k.a f32469g;

    /* renamed from: h */
    private final HashMap<c, b> f32470h;

    /* renamed from: i */
    private final Set<c> f32471i;

    /* renamed from: k */
    private boolean f32473k;

    /* renamed from: l */
    private da.m0 f32474l;

    /* renamed from: j */
    private i9.q0 f32472j = new q0.a(0);

    /* renamed from: c */
    private final IdentityHashMap<i9.r, c> f32465c = new IdentityHashMap<>();

    /* renamed from: d */
    private final Map<Object, c> f32466d = new HashMap();

    /* renamed from: b */
    private final List<c> f32464b = new ArrayList();

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes2.dex */
    public final class a implements i9.b0, com.google.android.exoplayer2.drm.k {

        /* renamed from: a */
        private final c f32475a;

        /* renamed from: b */
        private b0.a f32476b;

        /* renamed from: c */
        private k.a f32477c;

        public a(c cVar) {
            i2.this = r2;
            this.f32476b = r2.f32468f;
            this.f32477c = r2.f32469g;
            this.f32475a = cVar;
        }

        private boolean a(int i10, u.b bVar) {
            u.b bVar2;
            if (bVar != null) {
                bVar2 = i2.n(this.f32475a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int r10 = i2.r(this.f32475a, i10);
            b0.a aVar = this.f32476b;
            if (aVar.f31560a != r10 || !ea.n0.c(aVar.f31561b, bVar2)) {
                this.f32476b = i2.this.f32468f.F(r10, bVar2, 0L);
            }
            k.a aVar2 = this.f32477c;
            if (aVar2.f21112a == r10 && ea.n0.c(aVar2.f21113b, bVar2)) {
                return true;
            }
            this.f32477c = i2.this.f32469g.u(r10, bVar2);
            return true;
        }

        @Override // i9.b0
        public void F(int i10, u.b bVar, i9.n nVar, i9.q qVar) {
            if (a(i10, bVar)) {
                this.f32476b.s(nVar, qVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void G(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f32477c.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public /* synthetic */ void L(int i10, u.b bVar) {
            n8.e.a(this, i10, bVar);
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void M(int i10, u.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f32477c.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void Q(int i10, u.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f32477c.k(i11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void R(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f32477c.i();
            }
        }

        @Override // i9.b0
        public void S(int i10, u.b bVar, i9.n nVar, i9.q qVar) {
            if (a(i10, bVar)) {
                this.f32476b.B(nVar, qVar);
            }
        }

        @Override // i9.b0
        public void a0(int i10, u.b bVar, i9.q qVar) {
            if (a(i10, bVar)) {
                this.f32476b.E(qVar);
            }
        }

        @Override // i9.b0
        public void b0(int i10, u.b bVar, i9.n nVar, i9.q qVar, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f32476b.y(nVar, qVar, iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void f0(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f32477c.j();
            }
        }

        @Override // i9.b0
        public void h(int i10, u.b bVar, i9.q qVar) {
            if (a(i10, bVar)) {
                this.f32476b.j(qVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void i0(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f32477c.m();
            }
        }

        @Override // i9.b0
        public void j0(int i10, u.b bVar, i9.n nVar, i9.q qVar) {
            if (a(i10, bVar)) {
                this.f32476b.v(nVar, qVar);
            }
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final i9.u f32479a;

        /* renamed from: b */
        public final u.c f32480b;

        /* renamed from: c */
        public final a f32481c;

        public b(i9.u uVar, u.c cVar, a aVar) {
            this.f32479a = uVar;
            this.f32480b = cVar;
            this.f32481c = aVar;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes2.dex */
    public static final class c implements g2 {

        /* renamed from: a */
        public final i9.p f32482a;

        /* renamed from: d */
        public int f32485d;

        /* renamed from: e */
        public boolean f32486e;

        /* renamed from: c */
        public final List<u.b> f32484c = new ArrayList();

        /* renamed from: b */
        public final Object f32483b = new Object();

        public c(i9.u uVar, boolean z10) {
            this.f32482a = new i9.p(uVar, z10);
        }

        @Override // j8.g2
        public j3 a() {
            return this.f32482a.Q();
        }

        public void b(int i10) {
            this.f32485d = i10;
            this.f32486e = false;
            this.f32484c.clear();
        }

        @Override // j8.g2
        public Object e() {
            return this.f32483b;
        }
    }

    /* compiled from: MediaSourceList.java */
    /* loaded from: classes2.dex */
    public interface d {
        void c();
    }

    public i2(d dVar, k8.a aVar, Handler handler, k8.o1 o1Var) {
        this.f32463a = o1Var;
        this.f32467e = dVar;
        b0.a aVar2 = new b0.a();
        this.f32468f = aVar2;
        k.a aVar3 = new k.a();
        this.f32469g = aVar3;
        this.f32470h = new HashMap<>();
        this.f32471i = new HashSet();
        aVar2.g(handler, aVar);
        aVar3.g(handler, aVar);
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f32464b.remove(i12);
            this.f32466d.remove(remove.f32483b);
            g(i12, -remove.f32482a.Q().p());
            remove.f32486e = true;
            if (this.f32473k) {
                u(remove);
            }
        }
    }

    public static /* synthetic */ void a(i2 i2Var, i9.u uVar, j3 j3Var) {
        i2Var.t(uVar, j3Var);
    }

    private void g(int i10, int i11) {
        while (i10 < this.f32464b.size()) {
            this.f32464b.get(i10).f32485d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f32470h.get(cVar);
        if (bVar != null) {
            bVar.f32479a.k(bVar.f32480b);
        }
    }

    private void k() {
        Iterator<c> it = this.f32471i.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f32484c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f32471i.add(cVar);
        b bVar = this.f32470h.get(cVar);
        if (bVar != null) {
            bVar.f32479a.g(bVar.f32480b);
        }
    }

    private static Object m(Object obj) {
        return j8.a.v(obj);
    }

    public static u.b n(c cVar, u.b bVar) {
        for (int i10 = 0; i10 < cVar.f32484c.size(); i10++) {
            if (cVar.f32484c.get(i10).f31796d == bVar.f31796d) {
                return bVar.c(p(cVar, bVar.f31793a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return j8.a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return j8.a.y(cVar.f32483b, obj);
    }

    public static int r(c cVar, int i10) {
        return i10 + cVar.f32485d;
    }

    public /* synthetic */ void t(i9.u uVar, j3 j3Var) {
        this.f32467e.c();
    }

    private void u(c cVar) {
        if (cVar.f32486e && cVar.f32484c.isEmpty()) {
            b bVar = (b) ea.a.e(this.f32470h.remove(cVar));
            bVar.f32479a.h(bVar.f32480b);
            bVar.f32479a.c(bVar.f32481c);
            bVar.f32479a.o(bVar.f32481c);
            this.f32471i.remove(cVar);
        }
    }

    private void x(c cVar) {
        i9.p pVar = cVar.f32482a;
        u.c cVar2 = new u.c() { // from class: j8.h2
            @Override // i9.u.c
            public final void a(i9.u uVar, j3 j3Var) {
                i2.a(i2.this, uVar, j3Var);
            }
        };
        a aVar = new a(cVar);
        this.f32470h.put(cVar, new b(pVar, cVar2, aVar));
        pVar.a(ea.n0.y(), aVar);
        pVar.n(ea.n0.y(), aVar);
        pVar.b(cVar2, this.f32474l, this.f32463a);
    }

    public j3 A(int i10, int i11, i9.q0 q0Var) {
        ea.a.a(i10 >= 0 && i10 <= i11 && i11 <= q());
        this.f32472j = q0Var;
        B(i10, i11);
        return i();
    }

    public j3 C(List<c> list, i9.q0 q0Var) {
        B(0, this.f32464b.size());
        return f(this.f32464b.size(), list, q0Var);
    }

    public j3 D(i9.q0 q0Var) {
        int q10 = q();
        if (q0Var.b() != q10) {
            q0Var = q0Var.g().i(0, q10);
        }
        this.f32472j = q0Var;
        return i();
    }

    public j3 f(int i10, List<c> list, i9.q0 q0Var) {
        if (!list.isEmpty()) {
            this.f32472j = q0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f32464b.get(i11 - 1);
                    cVar.b(cVar2.f32485d + cVar2.f32482a.Q().p());
                } else {
                    cVar.b(0);
                }
                g(i11, cVar.f32482a.Q().p());
                this.f32464b.add(i11, cVar);
                this.f32466d.put(cVar.f32483b, cVar);
                if (this.f32473k) {
                    x(cVar);
                    if (this.f32465c.isEmpty()) {
                        this.f32471i.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public i9.r h(u.b bVar, da.b bVar2, long j10) {
        Object o10 = o(bVar.f31793a);
        u.b c10 = bVar.c(m(bVar.f31793a));
        c cVar = (c) ea.a.e(this.f32466d.get(o10));
        l(cVar);
        cVar.f32484c.add(c10);
        i9.o f10 = cVar.f32482a.f(c10, bVar2, j10);
        this.f32465c.put(f10, cVar);
        k();
        return f10;
    }

    public j3 i() {
        if (this.f32464b.isEmpty()) {
            return j3.f32506a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f32464b.size(); i11++) {
            c cVar = this.f32464b.get(i11);
            cVar.f32485d = i10;
            i10 += cVar.f32482a.Q().p();
        }
        return new s2(this.f32464b, this.f32472j);
    }

    public int q() {
        return this.f32464b.size();
    }

    public boolean s() {
        return this.f32473k;
    }

    public j3 v(int i10, int i11, int i12, i9.q0 q0Var) {
        ea.a.a(i10 >= 0 && i10 <= i11 && i11 <= q() && i12 >= 0);
        this.f32472j = q0Var;
        if (i10 != i11 && i10 != i12) {
            int min = Math.min(i10, i12);
            int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
            int i13 = this.f32464b.get(min).f32485d;
            ea.n0.B0(this.f32464b, i10, i11, i12);
            while (min <= max) {
                c cVar = this.f32464b.get(min);
                cVar.f32485d = i13;
                i13 += cVar.f32482a.Q().p();
                min++;
            }
            return i();
        }
        return i();
    }

    public void w(da.m0 m0Var) {
        ea.a.f(!this.f32473k);
        this.f32474l = m0Var;
        for (int i10 = 0; i10 < this.f32464b.size(); i10++) {
            c cVar = this.f32464b.get(i10);
            x(cVar);
            this.f32471i.add(cVar);
        }
        this.f32473k = true;
    }

    public void y() {
        for (b bVar : this.f32470h.values()) {
            try {
                bVar.f32479a.h(bVar.f32480b);
            } catch (RuntimeException e10) {
                ea.r.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f32479a.c(bVar.f32481c);
            bVar.f32479a.o(bVar.f32481c);
        }
        this.f32470h.clear();
        this.f32471i.clear();
        this.f32473k = false;
    }

    public void z(i9.r rVar) {
        c cVar = (c) ea.a.e(this.f32465c.remove(rVar));
        cVar.f32482a.i(rVar);
        cVar.f32484c.remove(((i9.o) rVar).f31747a);
        if (!this.f32465c.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
