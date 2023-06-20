package y8;

import j8.j2;
import j8.p1;
import java.io.IOException;
import p8.a0;
import p8.i;
import p8.j;
import p8.k;
import p8.w;
import p8.x;

/* compiled from: RawCcExtractor.java */
/* loaded from: classes2.dex */
public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    private final p1 f39281a;

    /* renamed from: c  reason: collision with root package name */
    private a0 f39283c;

    /* renamed from: e  reason: collision with root package name */
    private int f39285e;

    /* renamed from: f  reason: collision with root package name */
    private long f39286f;

    /* renamed from: g  reason: collision with root package name */
    private int f39287g;

    /* renamed from: h  reason: collision with root package name */
    private int f39288h;

    /* renamed from: b  reason: collision with root package name */
    private final ea.a0 f39282b = new ea.a0(9);

    /* renamed from: d  reason: collision with root package name */
    private int f39284d = 0;

    public a(p1 p1Var) {
        this.f39281a = p1Var;
    }

    private boolean b(j jVar) throws IOException {
        this.f39282b.L(8);
        if (jVar.h(this.f39282b.d(), 0, 8, true)) {
            if (this.f39282b.n() == 1380139777) {
                this.f39285e = this.f39282b.D();
                return true;
            }
            throw new IOException("Input not RawCC");
        }
        return false;
    }

    private void d(j jVar) throws IOException {
        while (this.f39287g > 0) {
            this.f39282b.L(3);
            jVar.readFully(this.f39282b.d(), 0, 3);
            this.f39283c.a(this.f39282b, 3);
            this.f39288h += 3;
            this.f39287g--;
        }
        int i10 = this.f39288h;
        if (i10 > 0) {
            this.f39283c.e(this.f39286f, 1, i10, 0, null);
        }
    }

    private boolean e(j jVar) throws IOException {
        int i10 = this.f39285e;
        if (i10 == 0) {
            this.f39282b.L(5);
            if (!jVar.h(this.f39282b.d(), 0, 5, true)) {
                return false;
            }
            this.f39286f = (this.f39282b.F() * 1000) / 45;
        } else if (i10 == 1) {
            this.f39282b.L(9);
            if (!jVar.h(this.f39282b.d(), 0, 9, true)) {
                return false;
            }
            this.f39286f = this.f39282b.w();
        } else {
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("Unsupported version number: ");
            sb2.append(i10);
            throw j2.a(sb2.toString(), null);
        }
        this.f39287g = this.f39282b.D();
        this.f39288h = 0;
        return true;
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        this.f39284d = 0;
    }

    @Override // p8.i
    public void c(k kVar) {
        kVar.n(new x.b(-9223372036854775807L));
        a0 f10 = kVar.f(0, 3);
        this.f39283c = f10;
        f10.d(this.f39281a);
        kVar.r();
    }

    @Override // p8.i
    public int g(j jVar, w wVar) throws IOException {
        ea.a.h(this.f39283c);
        while (true) {
            int i10 = this.f39284d;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        d(jVar);
                        this.f39284d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (e(jVar)) {
                    this.f39284d = 2;
                } else {
                    this.f39284d = 0;
                    return -1;
                }
            } else if (!b(jVar)) {
                return -1;
            } else {
                this.f39284d = 1;
            }
        }
    }

    @Override // p8.i
    public boolean h(j jVar) throws IOException {
        this.f39282b.L(8);
        jVar.p(this.f39282b.d(), 0, 8);
        return this.f39282b.n() == 1380139777;
    }

    @Override // p8.i
    public void release() {
    }
}
