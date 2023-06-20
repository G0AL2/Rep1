package z8;

import android.net.Uri;
import android.util.SparseArray;
import com.inmobi.media.fq;
import j8.j2;
import java.io.IOException;
import java.util.Map;
import p8.x;
import z8.i0;

/* compiled from: PsExtractor.java */
/* loaded from: classes2.dex */
public final class a0 implements p8.i {

    /* renamed from: a */
    private final ea.j0 f40114a;

    /* renamed from: b */
    private final SparseArray<a> f40115b;

    /* renamed from: c */
    private final ea.a0 f40116c;

    /* renamed from: d */
    private final y f40117d;

    /* renamed from: e */
    private boolean f40118e;

    /* renamed from: f */
    private boolean f40119f;

    /* renamed from: g */
    private boolean f40120g;

    /* renamed from: h */
    private long f40121h;

    /* renamed from: i */
    private x f40122i;

    /* renamed from: j */
    private p8.k f40123j;

    /* renamed from: k */
    private boolean f40124k;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PsExtractor.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final m f40125a;

        /* renamed from: b */
        private final ea.j0 f40126b;

        /* renamed from: c */
        private final ea.z f40127c = new ea.z(new byte[64]);

        /* renamed from: d */
        private boolean f40128d;

        /* renamed from: e */
        private boolean f40129e;

        /* renamed from: f */
        private boolean f40130f;

        /* renamed from: g */
        private int f40131g;

        /* renamed from: h */
        private long f40132h;

        public a(m mVar, ea.j0 j0Var) {
            this.f40125a = mVar;
            this.f40126b = j0Var;
        }

        private void b() {
            this.f40127c.r(8);
            this.f40128d = this.f40127c.g();
            this.f40129e = this.f40127c.g();
            this.f40127c.r(6);
            this.f40131g = this.f40127c.h(8);
        }

        private void c() {
            this.f40132h = 0L;
            if (this.f40128d) {
                this.f40127c.r(4);
                this.f40127c.r(1);
                this.f40127c.r(1);
                long h10 = (this.f40127c.h(3) << 30) | (this.f40127c.h(15) << 15) | this.f40127c.h(15);
                this.f40127c.r(1);
                if (!this.f40130f && this.f40129e) {
                    this.f40127c.r(4);
                    this.f40127c.r(1);
                    this.f40127c.r(1);
                    this.f40127c.r(1);
                    this.f40126b.b((this.f40127c.h(3) << 30) | (this.f40127c.h(15) << 15) | this.f40127c.h(15));
                    this.f40130f = true;
                }
                this.f40132h = this.f40126b.b(h10);
            }
        }

        public void a(ea.a0 a0Var) throws j2 {
            a0Var.j(this.f40127c.f29788a, 0, 3);
            this.f40127c.p(0);
            b();
            a0Var.j(this.f40127c.f29788a, 0, this.f40131g);
            this.f40127c.p(0);
            c();
            this.f40125a.f(this.f40132h, 4);
            this.f40125a.c(a0Var);
            this.f40125a.d();
        }

        public void d() {
            this.f40130f = false;
            this.f40125a.b();
        }
    }

    static {
        z zVar = new p8.n() { // from class: z8.z
            @Override // p8.n
            public /* synthetic */ p8.i[] a(Uri uri, Map map) {
                return p8.m.a(this, uri, map);
            }

            @Override // p8.n
            public final p8.i[] b() {
                return a0.b();
            }
        };
    }

    public a0() {
        this(new ea.j0(0L));
    }

    public static /* synthetic */ p8.i[] b() {
        return d();
    }

    public static /* synthetic */ p8.i[] d() {
        return new p8.i[]{new a0()};
    }

    private void e(long j10) {
        if (this.f40124k) {
            return;
        }
        this.f40124k = true;
        if (this.f40117d.c() != -9223372036854775807L) {
            x xVar = new x(this.f40117d.d(), this.f40117d.c(), j10);
            this.f40122i = xVar;
            this.f40123j.n(xVar.b());
            return;
        }
        this.f40123j.n(new x.b(this.f40117d.c()));
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        boolean z10 = true;
        boolean z11 = this.f40114a.e() == -9223372036854775807L;
        if (!z11) {
            long c10 = this.f40114a.c();
            z11 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : false;
        }
        if (z11) {
            this.f40114a.g(j11);
        }
        x xVar = this.f40122i;
        if (xVar != null) {
            xVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f40115b.size(); i10++) {
            this.f40115b.valueAt(i10).d();
        }
    }

    @Override // p8.i
    public void c(p8.k kVar) {
        this.f40123j = kVar;
    }

    @Override // p8.i
    public int g(p8.j jVar, p8.w wVar) throws IOException {
        ea.a.h(this.f40123j);
        long b10 = jVar.b();
        int i10 = (b10 > (-1L) ? 1 : (b10 == (-1L) ? 0 : -1));
        if ((i10 != 0) && !this.f40117d.e()) {
            return this.f40117d.g(jVar, wVar);
        }
        e(b10);
        x xVar = this.f40122i;
        if (xVar != null && xVar.d()) {
            return this.f40122i.c(jVar, wVar);
        }
        jVar.f();
        long i11 = i10 != 0 ? b10 - jVar.i() : -1L;
        if ((i11 == -1 || i11 >= 4) && jVar.d(this.f40116c.d(), 0, 4, true)) {
            this.f40116c.P(0);
            int n10 = this.f40116c.n();
            if (n10 == 441) {
                return -1;
            }
            if (n10 == 442) {
                jVar.p(this.f40116c.d(), 0, 10);
                this.f40116c.P(9);
                jVar.m((this.f40116c.D() & 7) + 14);
                return 0;
            } else if (n10 == 443) {
                jVar.p(this.f40116c.d(), 0, 2);
                this.f40116c.P(0);
                jVar.m(this.f40116c.J() + 6);
                return 0;
            } else if (((n10 & (-256)) >> 8) != 1) {
                jVar.m(1);
                return 0;
            } else {
                int i12 = n10 & 255;
                a aVar = this.f40115b.get(i12);
                if (!this.f40118e) {
                    if (aVar == null) {
                        m mVar = null;
                        if (i12 == 189) {
                            mVar = new c();
                            this.f40119f = true;
                            this.f40121h = jVar.getPosition();
                        } else if ((i12 & 224) == 192) {
                            mVar = new t();
                            this.f40119f = true;
                            this.f40121h = jVar.getPosition();
                        } else if ((i12 & 240) == 224) {
                            mVar = new n();
                            this.f40120g = true;
                            this.f40121h = jVar.getPosition();
                        }
                        if (mVar != null) {
                            mVar.e(this.f40123j, new i0.d(i12, 256));
                            aVar = new a(mVar, this.f40114a);
                            this.f40115b.put(i12, aVar);
                        }
                    }
                    if (jVar.getPosition() > ((this.f40119f && this.f40120g) ? this.f40121h + 8192 : 1048576L)) {
                        this.f40118e = true;
                        this.f40123j.r();
                    }
                }
                jVar.p(this.f40116c.d(), 0, 2);
                this.f40116c.P(0);
                int J = this.f40116c.J() + 6;
                if (aVar == null) {
                    jVar.m(J);
                } else {
                    this.f40116c.L(J);
                    jVar.readFully(this.f40116c.d(), 0, J);
                    this.f40116c.P(6);
                    aVar.a(this.f40116c);
                    ea.a0 a0Var = this.f40116c;
                    a0Var.O(a0Var.b());
                }
                return 0;
            }
        }
        return -1;
    }

    @Override // p8.i
    public boolean h(p8.j jVar) throws IOException {
        byte[] bArr = new byte[14];
        jVar.p(bArr, 0, 14);
        if (442 == (((bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            jVar.j(bArr[13] & 7);
            jVar.p(bArr, 0, 3);
            return 1 == ((((bArr[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8)) | (bArr[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return false;
    }

    @Override // p8.i
    public void release() {
    }

    public a0(ea.j0 j0Var) {
        this.f40114a = j0Var;
        this.f40116c = new ea.a0(4096);
        this.f40115b = new SparseArray<>();
        this.f40117d = new y();
    }
}
