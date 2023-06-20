package x8;

import ea.a0;
import j8.j2;
import j8.p1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import jb.s;
import p8.d0;
import x8.i;

/* compiled from: VorbisReader.java */
/* loaded from: classes2.dex */
final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    private a f38754n;

    /* renamed from: o  reason: collision with root package name */
    private int f38755o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f38756p;

    /* renamed from: q  reason: collision with root package name */
    private d0.d f38757q;

    /* renamed from: r  reason: collision with root package name */
    private d0.b f38758r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VorbisReader.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d0.d f38759a;

        /* renamed from: b  reason: collision with root package name */
        public final d0.b f38760b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f38761c;

        /* renamed from: d  reason: collision with root package name */
        public final d0.c[] f38762d;

        /* renamed from: e  reason: collision with root package name */
        public final int f38763e;

        public a(d0.d dVar, d0.b bVar, byte[] bArr, d0.c[] cVarArr, int i10) {
            this.f38759a = dVar;
            this.f38760b = bVar;
            this.f38761c = bArr;
            this.f38762d = cVarArr;
            this.f38763e = i10;
        }
    }

    static void n(a0 a0Var, long j10) {
        if (a0Var.b() < a0Var.f() + 4) {
            a0Var.M(Arrays.copyOf(a0Var.d(), a0Var.f() + 4));
        } else {
            a0Var.O(a0Var.f() + 4);
        }
        byte[] d10 = a0Var.d();
        d10[a0Var.f() - 4] = (byte) (j10 & 255);
        d10[a0Var.f() - 3] = (byte) ((j10 >>> 8) & 255);
        d10[a0Var.f() - 2] = (byte) ((j10 >>> 16) & 255);
        d10[a0Var.f() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        if (!aVar.f38762d[p(b10, aVar.f38763e, 1)].f35633a) {
            return aVar.f38759a.f35638e;
        }
        return aVar.f38759a.f35639f;
    }

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(a0 a0Var) {
        try {
            return d0.m(1, a0Var, true);
        } catch (j2 unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x8.i
    public void e(long j10) {
        super.e(j10);
        this.f38756p = j10 != 0;
        d0.d dVar = this.f38757q;
        this.f38755o = dVar != null ? dVar.f35638e : 0;
    }

    @Override // x8.i
    protected long f(a0 a0Var) {
        if ((a0Var.d()[0] & 1) == 1) {
            return -1L;
        }
        int o10 = o(a0Var.d()[0], (a) ea.a.h(this.f38754n));
        long j10 = this.f38756p ? (this.f38755o + o10) / 4 : 0;
        n(a0Var, j10);
        this.f38756p = true;
        this.f38755o = o10;
        return j10;
    }

    @Override // x8.i
    protected boolean h(a0 a0Var, long j10, i.b bVar) throws IOException {
        if (this.f38754n != null) {
            ea.a.e(bVar.f38752a);
            return false;
        }
        a q10 = q(a0Var);
        this.f38754n = q10;
        if (q10 == null) {
            return true;
        }
        d0.d dVar = q10.f38759a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f35640g);
        arrayList.add(q10.f38761c);
        bVar.f38752a = new p1.b().e0("audio/vorbis").G(dVar.f35637d).Z(dVar.f35636c).H(dVar.f35634a).f0(dVar.f35635b).T(arrayList).X(d0.c(s.q(q10.f38760b.f35632a))).E();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // x8.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f38754n = null;
            this.f38757q = null;
            this.f38758r = null;
        }
        this.f38755o = 0;
        this.f38756p = false;
    }

    a q(a0 a0Var) throws IOException {
        d0.d dVar = this.f38757q;
        if (dVar == null) {
            this.f38757q = d0.k(a0Var);
            return null;
        }
        d0.b bVar = this.f38758r;
        if (bVar == null) {
            this.f38758r = d0.i(a0Var);
            return null;
        }
        byte[] bArr = new byte[a0Var.f()];
        System.arraycopy(a0Var.d(), 0, bArr, 0, a0Var.f());
        d0.c[] l10 = d0.l(a0Var, dVar.f35634a);
        return new a(dVar, bVar, bArr, l10, d0.a(l10.length - 1));
    }
}
