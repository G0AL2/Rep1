package com.google.android.exoplayer2.source.smoothstreaming;

import ba.q;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import da.d0;
import da.f0;
import da.m0;
import i9.b0;
import i9.h;
import i9.o0;
import i9.p0;
import i9.r;
import i9.w0;
import i9.y0;
import j8.b3;
import j8.p1;
import java.io.IOException;
import java.util.ArrayList;
import k9.i;
import q9.a;

/* compiled from: SsMediaPeriod.java */
/* loaded from: classes2.dex */
final class c implements r, p0.a<i<b>> {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f21600a;

    /* renamed from: b  reason: collision with root package name */
    private final m0 f21601b;

    /* renamed from: c  reason: collision with root package name */
    private final f0 f21602c;

    /* renamed from: d  reason: collision with root package name */
    private final l f21603d;

    /* renamed from: e  reason: collision with root package name */
    private final k.a f21604e;

    /* renamed from: f  reason: collision with root package name */
    private final d0 f21605f;

    /* renamed from: g  reason: collision with root package name */
    private final b0.a f21606g;

    /* renamed from: h  reason: collision with root package name */
    private final da.b f21607h;

    /* renamed from: i  reason: collision with root package name */
    private final y0 f21608i;

    /* renamed from: j  reason: collision with root package name */
    private final h f21609j;

    /* renamed from: k  reason: collision with root package name */
    private r.a f21610k;

    /* renamed from: l  reason: collision with root package name */
    private q9.a f21611l;

    /* renamed from: m  reason: collision with root package name */
    private ChunkSampleStream<b>[] f21612m;

    /* renamed from: n  reason: collision with root package name */
    private p0 f21613n;

    public c(q9.a aVar, b.a aVar2, m0 m0Var, h hVar, l lVar, k.a aVar3, d0 d0Var, b0.a aVar4, f0 f0Var, da.b bVar) {
        this.f21611l = aVar;
        this.f21600a = aVar2;
        this.f21601b = m0Var;
        this.f21602c = f0Var;
        this.f21603d = lVar;
        this.f21604e = aVar3;
        this.f21605f = d0Var;
        this.f21606g = aVar4;
        this.f21607h = bVar;
        this.f21609j = hVar;
        this.f21608i = j(aVar, lVar);
        ChunkSampleStream<b>[] o10 = o(0);
        this.f21612m = o10;
        this.f21613n = hVar.a(o10);
    }

    private i<b> a(q qVar, long j10) {
        int c10 = this.f21608i.c(qVar.k());
        return new i<>(this.f21611l.f36000f[c10].f36006a, null, null, this.f21600a.a(this.f21602c, this.f21611l, c10, qVar, this.f21601b), this, this.f21607h, j10, this.f21603d, this.f21604e, this.f21605f, this.f21606g);
    }

    private static y0 j(q9.a aVar, l lVar) {
        w0[] w0VarArr = new w0[aVar.f36000f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f36000f;
            if (i10 < bVarArr.length) {
                p1[] p1VarArr = bVarArr[i10].f36015j;
                p1[] p1VarArr2 = new p1[p1VarArr.length];
                for (int i11 = 0; i11 < p1VarArr.length; i11++) {
                    p1 p1Var = p1VarArr[i11];
                    p1VarArr2[i11] = p1Var.c(lVar.b(p1Var));
                }
                w0VarArr[i10] = new w0(Integer.toString(i10), p1VarArr2);
                i10++;
            } else {
                return new y0(w0VarArr);
            }
        }
    }

    private static ChunkSampleStream<b>[] o(int i10) {
        return new i[i10];
    }

    @Override // i9.r, i9.p0
    public long b() {
        return this.f21613n.b();
    }

    @Override // i9.r, i9.p0
    public boolean c() {
        return this.f21613n.c();
    }

    @Override // i9.r, i9.p0
    public boolean d(long j10) {
        return this.f21613n.d(j10);
    }

    @Override // i9.r
    public long e(long j10, b3 b3Var) {
        i[] iVarArr;
        for (i iVar : this.f21612m) {
            if (iVar.f33396a == 2) {
                return iVar.e(j10, b3Var);
            }
        }
        return j10;
    }

    @Override // i9.r, i9.p0
    public long g() {
        return this.f21613n.g();
    }

    @Override // i9.r, i9.p0
    public void h(long j10) {
        this.f21613n.h(j10);
    }

    @Override // i9.r
    public void i(r.a aVar, long j10) {
        this.f21610k = aVar;
        aVar.f(this);
    }

    @Override // i9.r
    public long k(long j10) {
        for (i iVar : this.f21612m) {
            iVar.R(j10);
        }
        return j10;
    }

    @Override // i9.r
    public long l() {
        return -9223372036854775807L;
    }

    @Override // i9.r
    public long p(q[] qVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            if (o0VarArr[i10] != null) {
                i iVar = (i) o0VarArr[i10];
                if (qVarArr[i10] != null && zArr[i10]) {
                    ((b) iVar.D()).b(qVarArr[i10]);
                    arrayList.add(iVar);
                } else {
                    iVar.O();
                    o0VarArr[i10] = null;
                }
            }
            if (o0VarArr[i10] == null && qVarArr[i10] != null) {
                i<b> a10 = a(qVarArr[i10], j10);
                arrayList.add(a10);
                o0VarArr[i10] = a10;
                zArr2[i10] = true;
            }
        }
        ChunkSampleStream<b>[] o10 = o(arrayList.size());
        this.f21612m = o10;
        arrayList.toArray(o10);
        this.f21613n = this.f21609j.a(this.f21612m);
        return j10;
    }

    @Override // i9.r
    public void q() throws IOException {
        this.f21602c.a();
    }

    @Override // i9.p0.a
    /* renamed from: r */
    public void m(i<b> iVar) {
        this.f21610k.m(this);
    }

    public void s() {
        for (i iVar : this.f21612m) {
            iVar.O();
        }
        this.f21610k = null;
    }

    @Override // i9.r
    public y0 t() {
        return this.f21608i;
    }

    @Override // i9.r
    public void u(long j10, boolean z10) {
        for (i iVar : this.f21612m) {
            iVar.u(j10, z10);
        }
    }

    public void v(q9.a aVar) {
        this.f21611l = aVar;
        for (i iVar : this.f21612m) {
            ((b) iVar.D()).c(aVar);
        }
        this.f21610k.m(this);
    }
}
