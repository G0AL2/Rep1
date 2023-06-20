package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.hls.e;
import da.p;
import ea.a0;
import ea.j0;
import ea.l0;
import j8.p1;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import jb.s;
import k8.o1;
import o9.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HlsMediaChunk.java */
/* loaded from: classes2.dex */
public final class h extends k9.n {
    private static final AtomicInteger M = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final o1 C;
    private i D;
    private n E;
    private int F;
    private boolean G;
    private volatile boolean H;
    private boolean I;
    private s<Integer> J;
    private boolean K;
    private boolean L;

    /* renamed from: k  reason: collision with root package name */
    public final int f21478k;

    /* renamed from: l  reason: collision with root package name */
    public final int f21479l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f21480m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f21481n;

    /* renamed from: o  reason: collision with root package name */
    public final int f21482o;

    /* renamed from: p  reason: collision with root package name */
    private final da.l f21483p;

    /* renamed from: q  reason: collision with root package name */
    private final p f21484q;

    /* renamed from: r  reason: collision with root package name */
    private final i f21485r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f21486s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f21487t;

    /* renamed from: u  reason: collision with root package name */
    private final j0 f21488u;

    /* renamed from: v  reason: collision with root package name */
    private final f f21489v;

    /* renamed from: w  reason: collision with root package name */
    private final List<p1> f21490w;

    /* renamed from: x  reason: collision with root package name */
    private final DrmInitData f21491x;

    /* renamed from: y  reason: collision with root package name */
    private final com.google.android.exoplayer2.metadata.id3.a f21492y;

    /* renamed from: z  reason: collision with root package name */
    private final a0 f21493z;

    private h(f fVar, da.l lVar, p pVar, p1 p1Var, boolean z10, da.l lVar2, p pVar2, boolean z11, Uri uri, List<p1> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, j0 j0Var, DrmInitData drmInitData, i iVar, com.google.android.exoplayer2.metadata.id3.a aVar, a0 a0Var, boolean z15, o1 o1Var) {
        super(lVar, pVar, p1Var, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f21482o = i11;
        this.L = z12;
        this.f21479l = i12;
        this.f21484q = pVar2;
        this.f21483p = lVar2;
        this.G = pVar2 != null;
        this.B = z11;
        this.f21480m = uri;
        this.f21486s = z14;
        this.f21488u = j0Var;
        this.f21487t = z13;
        this.f21489v = fVar;
        this.f21490w = list;
        this.f21491x = drmInitData;
        this.f21485r = iVar;
        this.f21492y = aVar;
        this.f21493z = a0Var;
        this.f21481n = z15;
        this.C = o1Var;
        this.J = s.t();
        this.f21478k = M.getAndIncrement();
    }

    private static da.l h(da.l lVar, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            ea.a.e(bArr2);
            return new a(lVar, bArr, bArr2);
        }
        return lVar;
    }

    public static h i(f fVar, da.l lVar, p1 p1Var, long j10, o9.g gVar, e.C0290e c0290e, Uri uri, List<p1> list, int i10, Object obj, boolean z10, n9.e eVar, h hVar, byte[] bArr, byte[] bArr2, boolean z11, o1 o1Var) {
        boolean z12;
        da.l lVar2;
        p pVar;
        boolean z13;
        com.google.android.exoplayer2.metadata.id3.a aVar;
        a0 a0Var;
        i iVar;
        g.e eVar2 = c0290e.f21473a;
        p a10 = new p.b().i(l0.e(gVar.f35131a, eVar2.f35095a)).h(eVar2.f35103i).g(eVar2.f35104j).b(c0290e.f21476d ? 8 : 0).a();
        boolean z14 = bArr != null;
        da.l h10 = h(lVar, bArr, z14 ? k((String) ea.a.e(eVar2.f35102h)) : null);
        g.d dVar = eVar2.f35096b;
        if (dVar != null) {
            boolean z15 = bArr2 != null;
            byte[] k10 = z15 ? k((String) ea.a.e(dVar.f35102h)) : null;
            z12 = z14;
            pVar = new p(l0.e(gVar.f35131a, dVar.f35095a), dVar.f35103i, dVar.f35104j);
            lVar2 = h(lVar, bArr2, k10);
            z13 = z15;
        } else {
            z12 = z14;
            lVar2 = null;
            pVar = null;
            z13 = false;
        }
        long j11 = j10 + eVar2.f35099e;
        long j12 = j11 + eVar2.f35097c;
        int i11 = gVar.f35075j + eVar2.f35098d;
        if (hVar != null) {
            p pVar2 = hVar.f21484q;
            boolean z16 = pVar == pVar2 || (pVar != null && pVar2 != null && pVar.f29227a.equals(pVar2.f29227a) && pVar.f29232f == hVar.f21484q.f29232f);
            boolean z17 = uri.equals(hVar.f21480m) && hVar.I;
            com.google.android.exoplayer2.metadata.id3.a aVar2 = hVar.f21492y;
            aVar = aVar2;
            a0Var = hVar.f21493z;
            iVar = (z16 && z17 && !hVar.K && hVar.f21479l == i11) ? hVar.D : null;
        } else {
            aVar = new com.google.android.exoplayer2.metadata.id3.a();
            a0Var = new a0(10);
            iVar = null;
        }
        return new h(fVar, h10, a10, p1Var, z12, lVar2, pVar, z13, uri, list, i10, obj, j11, j12, c0290e.f21474b, c0290e.f21475c, !c0290e.f21476d, i11, eVar2.f35105k, z10, eVar.a(i11), eVar2.f35100f, iVar, aVar, a0Var, z11, o1Var);
    }

    private void j(da.l lVar, p pVar, boolean z10, boolean z11) throws IOException {
        p e10;
        long position;
        long j10;
        if (z10) {
            r0 = this.F != 0;
            e10 = pVar;
        } else {
            e10 = pVar.e(this.F);
        }
        try {
            p8.f t10 = t(lVar, e10, z11);
            if (r0) {
                t10.m(this.F);
            }
            do {
                try {
                    if (this.H) {
                        break;
                    }
                } catch (EOFException e11) {
                    if ((this.f33388d.f32702e & 16384) != 0) {
                        this.D.d();
                        position = t10.getPosition();
                        j10 = pVar.f29232f;
                    } else {
                        throw e11;
                    }
                }
            } while (this.D.a(t10));
            position = t10.getPosition();
            j10 = pVar.f29232f;
            this.F = (int) (position - j10);
        } finally {
            da.o.a(lVar);
        }
    }

    private static byte[] k(String str) {
        if (ib.b.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean o(e.C0290e c0290e, o9.g gVar) {
        g.e eVar = c0290e.f21473a;
        if (eVar instanceof g.b) {
            return ((g.b) eVar).f35088l || (c0290e.f21475c == 0 && gVar.f35133c);
        }
        return gVar.f35133c;
    }

    private void q() throws IOException {
        j(this.f33393i, this.f33386b, this.A, true);
    }

    private void r() throws IOException {
        if (this.G) {
            ea.a.e(this.f21483p);
            ea.a.e(this.f21484q);
            j(this.f21483p, this.f21484q, this.B, false);
            this.F = 0;
            this.G = false;
        }
    }

    private long s(p8.j jVar) throws IOException {
        jVar.f();
        try {
            this.f21493z.L(10);
            jVar.p(this.f21493z.d(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f21493z.G() != 4801587) {
            return -9223372036854775807L;
        }
        this.f21493z.Q(3);
        int C = this.f21493z.C();
        int i10 = C + 10;
        if (i10 > this.f21493z.b()) {
            byte[] d10 = this.f21493z.d();
            this.f21493z.L(i10);
            System.arraycopy(d10, 0, this.f21493z.d(), 0, 10);
        }
        jVar.p(this.f21493z.d(), 10, C);
        Metadata e10 = this.f21492y.e(this.f21493z.d(), C);
        if (e10 == null) {
            return -9223372036854775807L;
        }
        int g10 = e10.g();
        for (int i11 = 0; i11 < g10; i11++) {
            Metadata.Entry f10 = e10.f(i11);
            if (f10 instanceof PrivFrame) {
                PrivFrame privFrame = (PrivFrame) f10;
                if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f21207b)) {
                    System.arraycopy(privFrame.f21208c, 0, this.f21493z.d(), 0, 8);
                    this.f21493z.P(0);
                    this.f21493z.O(8);
                    return this.f21493z.w() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private p8.f t(da.l lVar, p pVar, boolean z10) throws IOException {
        i a10;
        long j10;
        long g10 = lVar.g(pVar);
        if (z10) {
            try {
                this.f21488u.h(this.f21486s, this.f33391g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        p8.f fVar = new p8.f(lVar, pVar.f29232f, g10);
        if (this.D == null) {
            long s10 = s(fVar);
            fVar.f();
            i iVar = this.f21485r;
            if (iVar != null) {
                a10 = iVar.g();
            } else {
                a10 = this.f21489v.a(pVar.f29227a, this.f33388d, this.f21490w, this.f21488u, lVar.e(), fVar, this.C);
            }
            this.D = a10;
            if (a10.f()) {
                n nVar = this.E;
                if (s10 != -9223372036854775807L) {
                    j10 = this.f21488u.b(s10);
                } else {
                    j10 = this.f33391g;
                }
                nVar.n0(j10);
            } else {
                this.E.n0(0L);
            }
            this.E.Z();
            this.D.c(this.E);
        }
        this.E.k0(this.f21491x);
        return fVar;
    }

    public static boolean v(h hVar, Uri uri, o9.g gVar, e.C0290e c0290e, long j10) {
        if (hVar == null) {
            return false;
        }
        if (uri.equals(hVar.f21480m) && hVar.I) {
            return false;
        }
        return !o(c0290e, gVar) || j10 + c0290e.f21473a.f35099e < hVar.f33392h;
    }

    @Override // da.e0.e
    public void b() {
        this.H = true;
    }

    @Override // k9.n
    public boolean g() {
        return this.I;
    }

    public int l(int i10) {
        ea.a.f(!this.f21481n);
        if (i10 >= this.J.size()) {
            return 0;
        }
        return this.J.get(i10).intValue();
    }

    @Override // da.e0.e
    public void load() throws IOException {
        i iVar;
        ea.a.e(this.E);
        if (this.D == null && (iVar = this.f21485r) != null && iVar.e()) {
            this.D = this.f21485r;
            this.G = false;
        }
        r();
        if (this.H) {
            return;
        }
        if (!this.f21487t) {
            q();
        }
        this.I = !this.H;
    }

    public void m(n nVar, s<Integer> sVar) {
        this.E = nVar;
        this.J = sVar;
    }

    public void n() {
        this.K = true;
    }

    public boolean p() {
        return this.L;
    }

    public void u() {
        this.L = true;
    }
}
