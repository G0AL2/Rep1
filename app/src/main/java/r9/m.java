package r9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ea.n0;
import ea.r;
import ea.v;
import j8.p1;
import j8.q1;
import j8.x2;
import java.util.Collections;
import java.util.List;

/* compiled from: TextRenderer.java */
/* loaded from: classes2.dex */
public final class m extends j8.f implements Handler.Callback {
    private long A;

    /* renamed from: m  reason: collision with root package name */
    private final Handler f36530m;

    /* renamed from: n  reason: collision with root package name */
    private final l f36531n;

    /* renamed from: o  reason: collision with root package name */
    private final i f36532o;

    /* renamed from: p  reason: collision with root package name */
    private final q1 f36533p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f36534q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f36535r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f36536s;

    /* renamed from: t  reason: collision with root package name */
    private int f36537t;

    /* renamed from: u  reason: collision with root package name */
    private p1 f36538u;

    /* renamed from: v  reason: collision with root package name */
    private g f36539v;

    /* renamed from: w  reason: collision with root package name */
    private j f36540w;

    /* renamed from: x  reason: collision with root package name */
    private k f36541x;

    /* renamed from: y  reason: collision with root package name */
    private k f36542y;

    /* renamed from: z  reason: collision with root package name */
    private int f36543z;

    public m(l lVar, Looper looper) {
        this(lVar, looper, i.f36526a);
    }

    private void O() {
        X(Collections.emptyList());
    }

    private long P() {
        if (this.f36543z == -1) {
            return Long.MAX_VALUE;
        }
        ea.a.e(this.f36541x);
        if (this.f36543z >= this.f36541x.f()) {
            return Long.MAX_VALUE;
        }
        return this.f36541x.c(this.f36543z);
    }

    private void Q(h hVar) {
        String valueOf = String.valueOf(this.f36538u);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 39);
        sb2.append("Subtitle decoding failed. streamFormat=");
        sb2.append(valueOf);
        r.d("TextRenderer", sb2.toString(), hVar);
        O();
        V();
    }

    private void R() {
        this.f36536s = true;
        this.f36539v = this.f36532o.b((p1) ea.a.e(this.f36538u));
    }

    private void S(List<b> list) {
        this.f36531n.k(list);
    }

    private void T() {
        this.f36540w = null;
        this.f36543z = -1;
        k kVar = this.f36541x;
        if (kVar != null) {
            kVar.o();
            this.f36541x = null;
        }
        k kVar2 = this.f36542y;
        if (kVar2 != null) {
            kVar2.o();
            this.f36542y = null;
        }
    }

    private void U() {
        T();
        ((g) ea.a.e(this.f36539v)).release();
        this.f36539v = null;
        this.f36537t = 0;
    }

    private void V() {
        U();
        R();
    }

    private void X(List<b> list) {
        Handler handler = this.f36530m;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            S(list);
        }
    }

    @Override // j8.f
    protected void E() {
        this.f36538u = null;
        this.A = -9223372036854775807L;
        O();
        U();
    }

    @Override // j8.f
    protected void G(long j10, boolean z10) {
        O();
        this.f36534q = false;
        this.f36535r = false;
        this.A = -9223372036854775807L;
        if (this.f36537t != 0) {
            V();
            return;
        }
        T();
        ((g) ea.a.e(this.f36539v)).flush();
    }

    @Override // j8.f
    protected void K(p1[] p1VarArr, long j10, long j11) {
        this.f36538u = p1VarArr[0];
        if (this.f36539v != null) {
            this.f36537t = 1;
        } else {
            R();
        }
    }

    public void W(long j10) {
        ea.a.f(m());
        this.A = j10;
    }

    @Override // j8.y2
    public int a(p1 p1Var) {
        if (this.f36532o.a(p1Var)) {
            return x2.a(p1Var.E == 0 ? 4 : 2);
        } else if (v.s(p1Var.f32709l)) {
            return x2.a(1);
        } else {
            return x2.a(0);
        }
    }

    @Override // j8.w2
    public boolean d() {
        return this.f36535r;
    }

    @Override // j8.w2, j8.y2
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            S((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // j8.w2
    public boolean isReady() {
        return true;
    }

    @Override // j8.w2
    public void r(long j10, long j11) {
        boolean z10;
        if (m()) {
            long j12 = this.A;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                T();
                this.f36535r = true;
            }
        }
        if (this.f36535r) {
            return;
        }
        if (this.f36542y == null) {
            ((g) ea.a.e(this.f36539v)).a(j10);
            try {
                this.f36542y = ((g) ea.a.e(this.f36539v)).b();
            } catch (h e10) {
                Q(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f36541x != null) {
            long P = P();
            z10 = false;
            while (P <= j10) {
                this.f36543z++;
                P = P();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        k kVar = this.f36542y;
        if (kVar != null) {
            if (kVar.l()) {
                if (!z10 && P() == Long.MAX_VALUE) {
                    if (this.f36537t == 2) {
                        V();
                    } else {
                        T();
                        this.f36535r = true;
                    }
                }
            } else if (kVar.f34296b <= j10) {
                k kVar2 = this.f36541x;
                if (kVar2 != null) {
                    kVar2.o();
                }
                this.f36543z = kVar.a(j10);
                this.f36541x = kVar;
                this.f36542y = null;
                z10 = true;
            }
        }
        if (z10) {
            ea.a.e(this.f36541x);
            X(this.f36541x.b(j10));
        }
        if (this.f36537t == 2) {
            return;
        }
        while (!this.f36534q) {
            try {
                j jVar = this.f36540w;
                if (jVar == null) {
                    jVar = ((g) ea.a.e(this.f36539v)).d();
                    if (jVar == null) {
                        return;
                    }
                    this.f36540w = jVar;
                }
                if (this.f36537t == 1) {
                    jVar.n(4);
                    ((g) ea.a.e(this.f36539v)).c(jVar);
                    this.f36540w = null;
                    this.f36537t = 2;
                    return;
                }
                int L = L(this.f36533p, jVar, 0);
                if (L == -4) {
                    if (jVar.l()) {
                        this.f36534q = true;
                        this.f36536s = false;
                    } else {
                        p1 p1Var = this.f36533p.f32770b;
                        if (p1Var == null) {
                            return;
                        }
                        jVar.f36527i = p1Var.f32713p;
                        jVar.q();
                        this.f36536s &= !jVar.m();
                    }
                    if (!this.f36536s) {
                        ((g) ea.a.e(this.f36539v)).c(jVar);
                        this.f36540w = null;
                    }
                } else if (L == -3) {
                    return;
                }
            } catch (h e11) {
                Q(e11);
                return;
            }
        }
    }

    public m(l lVar, Looper looper, i iVar) {
        super(3);
        this.f36531n = (l) ea.a.e(lVar);
        this.f36530m = looper == null ? null : n0.v(looper, this);
        this.f36532o = iVar;
        this.f36533p = new q1();
        this.A = -9223372036854775807L;
    }
}
