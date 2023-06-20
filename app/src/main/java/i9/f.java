package i9;

import android.os.Handler;
import com.google.android.exoplayer2.drm.k;
import i9.b0;
import i9.u;
import j8.j3;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: CompositeMediaSource.java */
/* loaded from: classes2.dex */
public abstract class f<T> extends i9.a {

    /* renamed from: h */
    private final HashMap<T, b<T>> f31610h = new HashMap<>();

    /* renamed from: i */
    private Handler f31611i;

    /* renamed from: j */
    private da.m0 f31612j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes2.dex */
    public final class a implements b0, com.google.android.exoplayer2.drm.k {

        /* renamed from: a */
        private final T f31613a;

        /* renamed from: b */
        private b0.a f31614b;

        /* renamed from: c */
        private k.a f31615c;

        public a(T t10) {
            f.this = r3;
            this.f31614b = r3.w(null);
            this.f31615c = r3.u(null);
            this.f31613a = t10;
        }

        private boolean a(int i10, u.b bVar) {
            u.b bVar2;
            if (bVar != null) {
                bVar2 = f.this.G(this.f31613a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int I = f.this.I(this.f31613a, i10);
            b0.a aVar = this.f31614b;
            if (aVar.f31560a != I || !ea.n0.c(aVar.f31561b, bVar2)) {
                this.f31614b = f.this.v(I, bVar2, 0L);
            }
            k.a aVar2 = this.f31615c;
            if (aVar2.f21112a == I && ea.n0.c(aVar2.f21113b, bVar2)) {
                return true;
            }
            this.f31615c = f.this.t(I, bVar2);
            return true;
        }

        private q d(q qVar) {
            long H = f.this.H(this.f31613a, qVar.f31774f);
            long H2 = f.this.H(this.f31613a, qVar.f31775g);
            return (H == qVar.f31774f && H2 == qVar.f31775g) ? qVar : new q(qVar.f31769a, qVar.f31770b, qVar.f31771c, qVar.f31772d, qVar.f31773e, H, H2);
        }

        @Override // i9.b0
        public void F(int i10, u.b bVar, n nVar, q qVar) {
            if (a(i10, bVar)) {
                this.f31614b.s(nVar, d(qVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void G(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f31615c.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public /* synthetic */ void L(int i10, u.b bVar) {
            n8.e.a(this, i10, bVar);
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void M(int i10, u.b bVar, Exception exc) {
            if (a(i10, bVar)) {
                this.f31615c.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void Q(int i10, u.b bVar, int i11) {
            if (a(i10, bVar)) {
                this.f31615c.k(i11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void R(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f31615c.i();
            }
        }

        @Override // i9.b0
        public void S(int i10, u.b bVar, n nVar, q qVar) {
            if (a(i10, bVar)) {
                this.f31614b.B(nVar, d(qVar));
            }
        }

        @Override // i9.b0
        public void a0(int i10, u.b bVar, q qVar) {
            if (a(i10, bVar)) {
                this.f31614b.E(d(qVar));
            }
        }

        @Override // i9.b0
        public void b0(int i10, u.b bVar, n nVar, q qVar, IOException iOException, boolean z10) {
            if (a(i10, bVar)) {
                this.f31614b.y(nVar, d(qVar), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void f0(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f31615c.j();
            }
        }

        @Override // i9.b0
        public void h(int i10, u.b bVar, q qVar) {
            if (a(i10, bVar)) {
                this.f31614b.j(d(qVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.k
        public void i0(int i10, u.b bVar) {
            if (a(i10, bVar)) {
                this.f31615c.m();
            }
        }

        @Override // i9.b0
        public void j0(int i10, u.b bVar, n nVar, q qVar) {
            if (a(i10, bVar)) {
                this.f31614b.v(nVar, d(qVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CompositeMediaSource.java */
    /* loaded from: classes2.dex */
    public static final class b<T> {

        /* renamed from: a */
        public final u f31617a;

        /* renamed from: b */
        public final u.c f31618b;

        /* renamed from: c */
        public final f<T>.a f31619c;

        public b(u uVar, u.c cVar, f<T>.a aVar) {
            this.f31617a = uVar;
            this.f31618b = cVar;
            this.f31619c = aVar;
        }
    }

    public static /* synthetic */ void F(f fVar, Object obj, u uVar, j3 j3Var) {
        fVar.J(obj, uVar, j3Var);
    }

    @Override // i9.a
    public void C(da.m0 m0Var) {
        this.f31612j = m0Var;
        this.f31611i = ea.n0.w();
    }

    @Override // i9.a
    public void E() {
        for (b<T> bVar : this.f31610h.values()) {
            bVar.f31617a.h(bVar.f31618b);
            bVar.f31617a.c(bVar.f31619c);
            bVar.f31617a.o(bVar.f31619c);
        }
        this.f31610h.clear();
    }

    protected abstract u.b G(T t10, u.b bVar);

    protected long H(T t10, long j10) {
        return j10;
    }

    protected int I(T t10, int i10) {
        return i10;
    }

    /* renamed from: K */
    public abstract void J(T t10, u uVar, j3 j3Var);

    public final void L(final T t10, u uVar) {
        ea.a.a(!this.f31610h.containsKey(t10));
        u.c cVar = new u.c() { // from class: i9.e
            @Override // i9.u.c
            public final void a(u uVar2, j3 j3Var) {
                f.F(f.this, t10, uVar2, j3Var);
            }
        };
        a aVar = new a(t10);
        this.f31610h.put(t10, new b<>(uVar, cVar, aVar));
        uVar.a((Handler) ea.a.e(this.f31611i), aVar);
        uVar.n((Handler) ea.a.e(this.f31611i), aVar);
        uVar.b(cVar, this.f31612j, A());
        if (B()) {
            return;
        }
        uVar.k(cVar);
    }

    @Override // i9.u
    public void p() throws IOException {
        for (b<T> bVar : this.f31610h.values()) {
            bVar.f31617a.p();
        }
    }

    @Override // i9.a
    protected void y() {
        for (b<T> bVar : this.f31610h.values()) {
            bVar.f31617a.k(bVar.f31618b);
        }
    }

    @Override // i9.a
    protected void z() {
        for (b<T> bVar : this.f31610h.values()) {
            bVar.f31617a.g(bVar.f31618b);
        }
    }
}
