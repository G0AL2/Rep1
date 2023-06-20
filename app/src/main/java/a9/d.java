package a9;

import android.util.Pair;
import ea.a0;
import ea.n0;
import ea.r;
import j8.j2;
import java.io.IOException;
import p8.j;

/* compiled from: WavHeaderReader.java */
/* loaded from: classes2.dex */
final class d {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WavHeaderReader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f153a;

        /* renamed from: b  reason: collision with root package name */
        public final long f154b;

        private a(int i10, long j10) {
            this.f153a = i10;
            this.f154b = j10;
        }

        public static a a(j jVar, a0 a0Var) throws IOException {
            jVar.p(a0Var.d(), 0, 8);
            a0Var.P(0);
            return new a(a0Var.n(), a0Var.t());
        }
    }

    public static boolean a(j jVar) throws IOException {
        a0 a0Var = new a0(8);
        int i10 = a.a(jVar, a0Var).f153a;
        if (i10 == 1380533830 || i10 == 1380333108) {
            jVar.p(a0Var.d(), 0, 4);
            a0Var.P(0);
            int n10 = a0Var.n();
            if (n10 != 1463899717) {
                StringBuilder sb2 = new StringBuilder(34);
                sb2.append("Unsupported form type: ");
                sb2.append(n10);
                r.c("WavHeaderReader", sb2.toString());
                return false;
            }
            return true;
        }
        return false;
    }

    public static c b(j jVar) throws IOException {
        byte[] bArr;
        a0 a0Var = new a0(16);
        a d10 = d(1718449184, jVar, a0Var);
        ea.a.f(d10.f154b >= 16);
        jVar.p(a0Var.d(), 0, 16);
        a0Var.P(0);
        int v10 = a0Var.v();
        int v11 = a0Var.v();
        int u10 = a0Var.u();
        int u11 = a0Var.u();
        int v12 = a0Var.v();
        int v13 = a0Var.v();
        int i10 = ((int) d10.f154b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            jVar.p(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = n0.f29714f;
        }
        jVar.m((int) (jVar.i() - jVar.getPosition()));
        return new c(v10, v11, u10, u11, v12, v13, bArr);
    }

    public static long c(j jVar) throws IOException {
        a0 a0Var = new a0(8);
        a a10 = a.a(jVar, a0Var);
        if (a10.f153a != 1685272116) {
            jVar.f();
            return -1L;
        }
        jVar.j(8);
        a0Var.P(0);
        jVar.p(a0Var.d(), 0, 8);
        long r10 = a0Var.r();
        jVar.m(((int) a10.f154b) + 8);
        return r10;
    }

    private static a d(int i10, j jVar, a0 a0Var) throws IOException {
        a a10 = a.a(jVar, a0Var);
        while (true) {
            int i11 = a10.f153a;
            if (i11 == i10) {
                return a10;
            }
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("Ignoring unknown WAV chunk: ");
            sb2.append(i11);
            r.h("WavHeaderReader", sb2.toString());
            long j10 = a10.f154b + 8;
            if (j10 <= 2147483647L) {
                jVar.m((int) j10);
                a10 = a.a(jVar, a0Var);
            } else {
                int i12 = a10.f153a;
                StringBuilder sb3 = new StringBuilder(51);
                sb3.append("Chunk is too large (~2GB+) to skip; id: ");
                sb3.append(i12);
                throw j2.d(sb3.toString());
            }
        }
    }

    public static Pair<Long, Long> e(j jVar) throws IOException {
        jVar.f();
        a d10 = d(1684108385, jVar, new a0(8));
        jVar.m(8);
        return Pair.create(Long.valueOf(jVar.getPosition()), Long.valueOf(d10.f154b));
    }
}
