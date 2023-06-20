package p8;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import j8.j2;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p8.r;

/* compiled from: FlacMetadataReader.java */
/* loaded from: classes2.dex */
public final class p {

    /* compiled from: FlacMetadataReader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public r f35675a;

        public a(r rVar) {
            this.f35675a = rVar;
        }
    }

    public static boolean a(j jVar) throws IOException {
        ea.a0 a0Var = new ea.a0(4);
        jVar.p(a0Var.d(), 0, 4);
        return a0Var.F() == 1716281667;
    }

    public static int b(j jVar) throws IOException {
        jVar.f();
        ea.a0 a0Var = new ea.a0(2);
        jVar.p(a0Var.d(), 0, 2);
        int J = a0Var.J();
        if ((J >> 2) == 16382) {
            jVar.f();
            return J;
        }
        jVar.f();
        throw j2.a("First frame does not start with sync code.", null);
    }

    public static Metadata c(j jVar, boolean z10) throws IOException {
        Metadata a10 = new u().a(jVar, z10 ? null : com.google.android.exoplayer2.metadata.id3.a.f21213b);
        if (a10 == null || a10.g() == 0) {
            return null;
        }
        return a10;
    }

    public static Metadata d(j jVar, boolean z10) throws IOException {
        jVar.f();
        long i10 = jVar.i();
        Metadata c10 = c(jVar, z10);
        jVar.m((int) (jVar.i() - i10));
        return c10;
    }

    public static boolean e(j jVar, a aVar) throws IOException {
        jVar.f();
        ea.z zVar = new ea.z(new byte[4]);
        jVar.p(zVar.f29788a, 0, 4);
        boolean g10 = zVar.g();
        int h10 = zVar.h(7);
        int h11 = zVar.h(24) + 4;
        if (h10 == 0) {
            aVar.f35675a = h(jVar);
        } else {
            r rVar = aVar.f35675a;
            if (rVar == null) {
                throw new IllegalArgumentException();
            }
            if (h10 == 3) {
                aVar.f35675a = rVar.b(g(jVar, h11));
            } else if (h10 == 4) {
                aVar.f35675a = rVar.c(j(jVar, h11));
            } else if (h10 == 6) {
                ea.a0 a0Var = new ea.a0(h11);
                jVar.readFully(a0Var.d(), 0, h11);
                a0Var.Q(4);
                aVar.f35675a = rVar.a(jb.s.u(PictureFrame.c(a0Var)));
            } else {
                jVar.m(h11);
            }
        }
        return g10;
    }

    public static r.a f(ea.a0 a0Var) {
        a0Var.Q(1);
        int G = a0Var.G();
        long e10 = a0Var.e() + G;
        int i10 = G / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long w10 = a0Var.w();
            if (w10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = w10;
            jArr2[i11] = a0Var.w();
            a0Var.Q(2);
            i11++;
        }
        a0Var.Q((int) (e10 - a0Var.e()));
        return new r.a(jArr, jArr2);
    }

    private static r.a g(j jVar, int i10) throws IOException {
        ea.a0 a0Var = new ea.a0(i10);
        jVar.readFully(a0Var.d(), 0, i10);
        return f(a0Var);
    }

    private static r h(j jVar) throws IOException {
        byte[] bArr = new byte[38];
        jVar.readFully(bArr, 0, 38);
        return new r(bArr, 4);
    }

    public static void i(j jVar) throws IOException {
        ea.a0 a0Var = new ea.a0(4);
        jVar.readFully(a0Var.d(), 0, 4);
        if (a0Var.F() != 1716281667) {
            throw j2.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(j jVar, int i10) throws IOException {
        ea.a0 a0Var = new ea.a0(i10);
        jVar.readFully(a0Var.d(), 0, i10);
        a0Var.Q(4);
        return Arrays.asList(d0.j(a0Var, false, false).f35632a);
    }
}
