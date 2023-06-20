package z8;

import android.net.Uri;
import j8.j2;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import p8.x;
import z8.i0;

/* compiled from: AdtsExtractor.java */
/* loaded from: classes2.dex */
public final class h implements p8.i {

    /* renamed from: a */
    private final int f40188a;

    /* renamed from: b */
    private final i f40189b;

    /* renamed from: c */
    private final ea.a0 f40190c;

    /* renamed from: d */
    private final ea.a0 f40191d;

    /* renamed from: e */
    private final ea.z f40192e;

    /* renamed from: f */
    private p8.k f40193f;

    /* renamed from: g */
    private long f40194g;

    /* renamed from: h */
    private long f40195h;

    /* renamed from: i */
    private int f40196i;

    /* renamed from: j */
    private boolean f40197j;

    /* renamed from: k */
    private boolean f40198k;

    /* renamed from: l */
    private boolean f40199l;

    static {
        g gVar = new p8.n() { // from class: z8.g
            @Override // p8.n
            public /* synthetic */ p8.i[] a(Uri uri, Map map) {
                return p8.m.a(this, uri, map);
            }

            @Override // p8.n
            public final p8.i[] b() {
                return h.b();
            }
        };
    }

    public h() {
        this(0);
    }

    public static /* synthetic */ p8.i[] b() {
        return i();
    }

    private void d(p8.j jVar) throws IOException {
        int h10;
        if (this.f40197j) {
            return;
        }
        this.f40196i = -1;
        jVar.f();
        long j10 = 0;
        if (jVar.getPosition() == 0) {
            k(jVar);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!jVar.d(this.f40191d.d(), 0, 2, true)) {
                    break;
                }
                this.f40191d.P(0);
                if (!i.m(this.f40191d.J())) {
                    break;
                } else if (!jVar.d(this.f40191d.d(), 0, 4, true)) {
                    break;
                } else {
                    this.f40192e.p(14);
                    h10 = this.f40192e.h(13);
                    if (h10 <= 6) {
                        this.f40197j = true;
                        throw j2.a("Malformed ADTS stream", null);
                    }
                    j10 += h10;
                    i11++;
                    if (i11 == 1000) {
                        break;
                    }
                }
            } catch (EOFException unused) {
            }
        } while (jVar.n(h10 - 6, true));
        i10 = i11;
        jVar.f();
        if (i10 > 0) {
            this.f40196i = (int) (j10 / i10);
        } else {
            this.f40196i = -1;
        }
        this.f40197j = true;
    }

    private static int e(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private p8.x f(long j10, boolean z10) {
        return new p8.e(j10, this.f40195h, e(this.f40196i, this.f40189b.k()), this.f40196i, z10);
    }

    public static /* synthetic */ p8.i[] i() {
        return new p8.i[]{new h()};
    }

    private void j(long j10, boolean z10) {
        if (this.f40199l) {
            return;
        }
        boolean z11 = (this.f40188a & 1) != 0 && this.f40196i > 0;
        if (z11 && this.f40189b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (z11 && this.f40189b.k() != -9223372036854775807L) {
            this.f40193f.n(f(j10, (this.f40188a & 2) != 0));
        } else {
            this.f40193f.n(new x.b(-9223372036854775807L));
        }
        this.f40199l = true;
    }

    private int k(p8.j jVar) throws IOException {
        int i10 = 0;
        while (true) {
            jVar.p(this.f40191d.d(), 0, 10);
            this.f40191d.P(0);
            if (this.f40191d.G() != 4801587) {
                break;
            }
            this.f40191d.Q(3);
            int C = this.f40191d.C();
            i10 += C + 10;
            jVar.j(C);
        }
        jVar.f();
        jVar.j(i10);
        if (this.f40195h == -1) {
            this.f40195h = i10;
        }
        return i10;
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        this.f40198k = false;
        this.f40189b.b();
        this.f40194g = j11;
    }

    @Override // p8.i
    public void c(p8.k kVar) {
        this.f40193f = kVar;
        this.f40189b.e(kVar, new i0.d(0, 1));
        kVar.r();
    }

    @Override // p8.i
    public int g(p8.j jVar, p8.w wVar) throws IOException {
        ea.a.h(this.f40193f);
        long b10 = jVar.b();
        int i10 = this.f40188a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || b10 == -1)) ? false : true) {
            d(jVar);
        }
        int c10 = jVar.c(this.f40190c.d(), 0, 2048);
        boolean z10 = c10 == -1;
        j(b10, z10);
        if (z10) {
            return -1;
        }
        this.f40190c.P(0);
        this.f40190c.O(c10);
        if (!this.f40198k) {
            this.f40189b.f(this.f40194g, 4);
            this.f40198k = true;
        }
        this.f40189b.c(this.f40190c);
        return 0;
    }

    @Override // p8.i
    public boolean h(p8.j jVar) throws IOException {
        int k10 = k(jVar);
        int i10 = k10;
        int i11 = 0;
        int i12 = 0;
        do {
            jVar.p(this.f40191d.d(), 0, 2);
            this.f40191d.P(0);
            if (i.m(this.f40191d.J())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                jVar.p(this.f40191d.d(), 0, 4);
                this.f40192e.p(14);
                int h10 = this.f40192e.h(13);
                if (h10 <= 6) {
                    i10++;
                    jVar.f();
                    jVar.j(i10);
                } else {
                    jVar.j(h10 - 6);
                    i12 += h10;
                }
            } else {
                i10++;
                jVar.f();
                jVar.j(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - k10 < 8192);
        return false;
    }

    @Override // p8.i
    public void release() {
    }

    public h(int i10) {
        this.f40188a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f40189b = new i(true);
        this.f40190c = new ea.a0(2048);
        this.f40196i = -1;
        this.f40195h = -1L;
        ea.a0 a0Var = new ea.a0(10);
        this.f40191d = a0Var;
        this.f40192e = new ea.z(a0Var.d());
    }
}
