package x8;

import ea.a0;
import j8.j2;
import java.io.IOException;
import p8.l;

/* compiled from: OggPageHeader.java */
/* loaded from: classes2.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f38729a;

    /* renamed from: b  reason: collision with root package name */
    public int f38730b;

    /* renamed from: c  reason: collision with root package name */
    public long f38731c;

    /* renamed from: d  reason: collision with root package name */
    public int f38732d;

    /* renamed from: e  reason: collision with root package name */
    public int f38733e;

    /* renamed from: f  reason: collision with root package name */
    public int f38734f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f38735g = new int[255];

    /* renamed from: h  reason: collision with root package name */
    private final a0 f38736h = new a0(255);

    public boolean a(p8.j jVar, boolean z10) throws IOException {
        b();
        this.f38736h.L(27);
        if (l.b(jVar, this.f38736h.d(), 0, 27, z10) && this.f38736h.F() == 1332176723) {
            int D = this.f38736h.D();
            this.f38729a = D;
            if (D != 0) {
                if (z10) {
                    return false;
                }
                throw j2.d("unsupported bit stream revision");
            }
            this.f38730b = this.f38736h.D();
            this.f38731c = this.f38736h.r();
            this.f38736h.t();
            this.f38736h.t();
            this.f38736h.t();
            int D2 = this.f38736h.D();
            this.f38732d = D2;
            this.f38733e = D2 + 27;
            this.f38736h.L(D2);
            if (l.b(jVar, this.f38736h.d(), 0, this.f38732d, z10)) {
                for (int i10 = 0; i10 < this.f38732d; i10++) {
                    this.f38735g[i10] = this.f38736h.D();
                    this.f38734f += this.f38735g[i10];
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public void b() {
        this.f38729a = 0;
        this.f38730b = 0;
        this.f38731c = 0L;
        this.f38732d = 0;
        this.f38733e = 0;
        this.f38734f = 0;
    }

    public boolean c(p8.j jVar) throws IOException {
        return d(jVar, -1L);
    }

    public boolean d(p8.j jVar, long j10) throws IOException {
        int i10;
        ea.a.a(jVar.getPosition() == jVar.i());
        this.f38736h.L(4);
        while (true) {
            i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
            if ((i10 == 0 || jVar.getPosition() + 4 < j10) && l.b(jVar, this.f38736h.d(), 0, 4, true)) {
                this.f38736h.P(0);
                if (this.f38736h.F() == 1332176723) {
                    jVar.f();
                    return true;
                }
                jVar.m(1);
            }
        }
        do {
            if (i10 != 0 && jVar.getPosition() >= j10) {
                break;
            }
        } while (jVar.a(1) != -1);
        return false;
    }
}
