package x8;

import com.inmobi.media.fq;
import ea.a0;
import ea.n0;
import java.util.Arrays;
import p8.o;
import p8.p;
import p8.q;
import p8.r;
import p8.x;
import x8.i;

/* compiled from: FlacReader.java */
/* loaded from: classes2.dex */
final class b extends i {

    /* renamed from: n  reason: collision with root package name */
    private r f38714n;

    /* renamed from: o  reason: collision with root package name */
    private a f38715o;

    /* compiled from: FlacReader.java */
    /* loaded from: classes2.dex */
    private static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private r f38716a;

        /* renamed from: b  reason: collision with root package name */
        private r.a f38717b;

        /* renamed from: c  reason: collision with root package name */
        private long f38718c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f38719d = -1;

        public a(r rVar, r.a aVar) {
            this.f38716a = rVar;
            this.f38717b = aVar;
        }

        @Override // x8.g
        public long a(p8.j jVar) {
            long j10 = this.f38719d;
            if (j10 >= 0) {
                long j11 = -(j10 + 2);
                this.f38719d = -1L;
                return j11;
            }
            return -1L;
        }

        @Override // x8.g
        public x b() {
            ea.a.f(this.f38718c != -1);
            return new q(this.f38716a, this.f38718c);
        }

        @Override // x8.g
        public void c(long j10) {
            long[] jArr = this.f38717b.f35690a;
            this.f38719d = jArr[n0.i(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f38718c = j10;
        }
    }

    private int n(a0 a0Var) {
        int i10 = (a0Var.d()[2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i10 == 6 || i10 == 7) {
            a0Var.Q(4);
            a0Var.K();
        }
        int j10 = o.j(a0Var, i10);
        a0Var.P(0);
        return j10;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(a0 a0Var) {
        return a0Var.a() >= 5 && a0Var.D() == 127 && a0Var.F() == 1179402563;
    }

    @Override // x8.i
    protected long f(a0 a0Var) {
        if (o(a0Var.d())) {
            return n(a0Var);
        }
        return -1L;
    }

    @Override // x8.i
    protected boolean h(a0 a0Var, long j10, i.b bVar) {
        byte[] d10 = a0Var.d();
        r rVar = this.f38714n;
        if (rVar == null) {
            r rVar2 = new r(d10, 17);
            this.f38714n = rVar2;
            bVar.f38752a = rVar2.g(Arrays.copyOfRange(d10, 9, a0Var.f()), null);
            return true;
        } else if ((d10[0] & Byte.MAX_VALUE) == 3) {
            r.a f10 = p.f(a0Var);
            r b10 = rVar.b(f10);
            this.f38714n = b10;
            this.f38715o = new a(b10, f10);
            return true;
        } else if (o(d10)) {
            a aVar = this.f38715o;
            if (aVar != null) {
                aVar.d(j10);
                bVar.f38753b = this.f38715o;
            }
            ea.a.e(bVar.f38752a);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x8.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f38714n = null;
            this.f38715o = null;
        }
    }
}
