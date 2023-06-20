package z8;

import com.inmobi.media.fq;
import ea.n0;
import java.io.IOException;

/* compiled from: PsDurationReader.java */
/* loaded from: classes2.dex */
final class y {

    /* renamed from: c  reason: collision with root package name */
    private boolean f40467c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f40468d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f40469e;

    /* renamed from: a  reason: collision with root package name */
    private final ea.j0 f40465a = new ea.j0(0);

    /* renamed from: f  reason: collision with root package name */
    private long f40470f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f40471g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f40472h = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    private final ea.a0 f40466b = new ea.a0();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(p8.j jVar) {
        this.f40466b.M(n0.f29714f);
        this.f40467c = true;
        jVar.f();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    private int h(p8.j jVar, p8.w wVar) throws IOException {
        int min = (int) Math.min(20000L, jVar.b());
        long j10 = 0;
        if (jVar.getPosition() != j10) {
            wVar.f35701a = j10;
            return 1;
        }
        this.f40466b.L(min);
        jVar.f();
        jVar.p(this.f40466b.d(), 0, min);
        this.f40470f = i(this.f40466b);
        this.f40468d = true;
        return 0;
    }

    private long i(ea.a0 a0Var) {
        int f10 = a0Var.f();
        for (int e10 = a0Var.e(); e10 < f10 - 3; e10++) {
            if (f(a0Var.d(), e10) == 442) {
                a0Var.P(e10 + 4);
                long l10 = l(a0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(p8.j jVar, p8.w wVar) throws IOException {
        long b10 = jVar.b();
        int min = (int) Math.min(20000L, b10);
        long j10 = b10 - min;
        if (jVar.getPosition() != j10) {
            wVar.f35701a = j10;
            return 1;
        }
        this.f40466b.L(min);
        jVar.f();
        jVar.p(this.f40466b.d(), 0, min);
        this.f40471g = k(this.f40466b);
        this.f40469e = true;
        return 0;
    }

    private long k(ea.a0 a0Var) {
        int e10 = a0Var.e();
        for (int f10 = a0Var.f() - 4; f10 >= e10; f10--) {
            if (f(a0Var.d(), f10) == 442) {
                a0Var.P(f10 + 4);
                long l10 = l(a0Var);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(ea.a0 a0Var) {
        int e10 = a0Var.e();
        if (a0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a0Var.j(bArr, 0, 9);
        a0Var.P(e10);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public long c() {
        return this.f40472h;
    }

    public ea.j0 d() {
        return this.f40465a;
    }

    public boolean e() {
        return this.f40467c;
    }

    public int g(p8.j jVar, p8.w wVar) throws IOException {
        if (!this.f40469e) {
            return j(jVar, wVar);
        }
        if (this.f40471g == -9223372036854775807L) {
            return b(jVar);
        }
        if (!this.f40468d) {
            return h(jVar, wVar);
        }
        long j10 = this.f40470f;
        if (j10 == -9223372036854775807L) {
            return b(jVar);
        }
        long b10 = this.f40465a.b(this.f40471g) - this.f40465a.b(j10);
        this.f40472h = b10;
        if (b10 < 0) {
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Invalid duration: ");
            sb2.append(b10);
            sb2.append(". Using TIME_UNSET instead.");
            ea.r.h("PsDurationReader", sb2.toString());
            this.f40472h = -9223372036854775807L;
        }
        return b(jVar);
    }
}
