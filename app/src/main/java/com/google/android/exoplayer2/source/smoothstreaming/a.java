package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import ba.q;
import ba.z;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import da.d0;
import da.f0;
import da.l;
import da.m0;
import j8.b3;
import j8.p1;
import java.io.IOException;
import java.util.List;
import k9.e;
import k9.f;
import k9.g;
import k9.h;
import k9.k;
import k9.n;
import q9.a;
import w8.o;
import w8.p;

/* compiled from: DefaultSsChunkSource.java */
/* loaded from: classes2.dex */
public class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f21590a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21591b;

    /* renamed from: c  reason: collision with root package name */
    private final g[] f21592c;

    /* renamed from: d  reason: collision with root package name */
    private final l f21593d;

    /* renamed from: e  reason: collision with root package name */
    private q f21594e;

    /* renamed from: f  reason: collision with root package name */
    private q9.a f21595f;

    /* renamed from: g  reason: collision with root package name */
    private int f21596g;

    /* renamed from: h  reason: collision with root package name */
    private IOException f21597h;

    /* compiled from: DefaultSsChunkSource.java */
    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0291a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final l.a f21598a;

        public C0291a(l.a aVar) {
            this.f21598a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public com.google.android.exoplayer2.source.smoothstreaming.b a(f0 f0Var, q9.a aVar, int i10, q qVar, m0 m0Var) {
            l a10 = this.f21598a.a();
            if (m0Var != null) {
                a10.l(m0Var);
            }
            return new a(f0Var, aVar, i10, qVar, a10);
        }
    }

    /* compiled from: DefaultSsChunkSource.java */
    /* loaded from: classes2.dex */
    private static final class b extends k9.b {

        /* renamed from: e  reason: collision with root package name */
        private final a.b f21599e;

        public b(a.b bVar, int i10, int i11) {
            super(i11, bVar.f36016k - 1);
            this.f21599e = bVar;
        }

        @Override // k9.o
        public long a() {
            c();
            return this.f21599e.e((int) d());
        }

        @Override // k9.o
        public long b() {
            return a() + this.f21599e.c((int) d());
        }
    }

    public a(f0 f0Var, q9.a aVar, int i10, q qVar, l lVar) {
        this.f21590a = f0Var;
        this.f21595f = aVar;
        this.f21591b = i10;
        this.f21594e = qVar;
        this.f21593d = lVar;
        a.b bVar = aVar.f36000f[i10];
        this.f21592c = new g[qVar.length()];
        int i11 = 0;
        while (i11 < this.f21592c.length) {
            int e10 = qVar.e(i11);
            p1 p1Var = bVar.f36015j[e10];
            p[] pVarArr = p1Var.f32712o != null ? ((a.C0481a) ea.a.e(aVar.f35999e)).f36005c : null;
            int i12 = bVar.f36006a;
            int i13 = i11;
            this.f21592c[i13] = new e(new w8.g(3, null, new o(e10, i12, bVar.f36008c, -9223372036854775807L, aVar.f36001g, p1Var, 0, pVarArr, i12 == 2 ? 4 : 0, null, null)), bVar.f36006a, p1Var);
            i11 = i13 + 1;
        }
    }

    private static n k(p1 p1Var, l lVar, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, g gVar) {
        return new k(lVar, new da.p(uri), p1Var, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, gVar);
    }

    private long l(long j10) {
        q9.a aVar = this.f21595f;
        if (aVar.f35998d) {
            a.b bVar = aVar.f36000f[this.f21591b];
            int i10 = bVar.f36016k - 1;
            return (bVar.e(i10) + bVar.c(i10)) - j10;
        }
        return -9223372036854775807L;
    }

    @Override // k9.j
    public void a() throws IOException {
        IOException iOException = this.f21597h;
        if (iOException == null) {
            this.f21590a.a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void b(q qVar) {
        this.f21594e = qVar;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public void c(q9.a aVar) {
        a.b[] bVarArr = this.f21595f.f36000f;
        int i10 = this.f21591b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f36016k;
        a.b bVar2 = aVar.f36000f[i10];
        if (i11 != 0 && bVar2.f36016k != 0) {
            int i12 = i11 - 1;
            long e10 = bVar.e(i12) + bVar.c(i12);
            long e11 = bVar2.e(0);
            if (e10 <= e11) {
                this.f21596g += i11;
            } else {
                this.f21596g += bVar.d(e11);
            }
        } else {
            this.f21596g += i11;
        }
        this.f21595f = aVar;
    }

    @Override // k9.j
    public final void d(long j10, long j11, List<? extends n> list, h hVar) {
        int f10;
        long j12 = j11;
        if (this.f21597h != null) {
            return;
        }
        q9.a aVar = this.f21595f;
        a.b bVar = aVar.f36000f[this.f21591b];
        if (bVar.f36016k == 0) {
            hVar.f33395b = !aVar.f35998d;
            return;
        }
        if (list.isEmpty()) {
            f10 = bVar.d(j12);
        } else {
            f10 = (int) (list.get(list.size() - 1).f() - this.f21596g);
            if (f10 < 0) {
                this.f21597h = new i9.b();
                return;
            }
        }
        if (f10 >= bVar.f36016k) {
            hVar.f33395b = !this.f21595f.f35998d;
            return;
        }
        long j13 = j12 - j10;
        long l10 = l(j10);
        int length = this.f21594e.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new k9.o[length];
        for (int i10 = 0; i10 < length; i10++) {
            mediaChunkIteratorArr[i10] = new b(bVar, this.f21594e.e(i10), f10);
        }
        this.f21594e.j(j10, j13, l10, list, mediaChunkIteratorArr);
        long e10 = bVar.e(f10);
        long c10 = e10 + bVar.c(f10);
        if (!list.isEmpty()) {
            j12 = -9223372036854775807L;
        }
        long j14 = j12;
        int i11 = f10 + this.f21596g;
        int a10 = this.f21594e.a();
        g gVar = this.f21592c[a10];
        hVar.f33394a = k(this.f21594e.p(), this.f21593d, bVar.a(this.f21594e.e(a10), f10), i11, e10, c10, j14, this.f21594e.q(), this.f21594e.g(), gVar);
    }

    @Override // k9.j
    public long e(long j10, b3 b3Var) {
        a.b bVar = this.f21595f.f36000f[this.f21591b];
        int d10 = bVar.d(j10);
        long e10 = bVar.e(d10);
        return b3Var.a(j10, e10, (e10 >= j10 || d10 >= bVar.f36016k + (-1)) ? e10 : bVar.e(d10 + 1));
    }

    @Override // k9.j
    public boolean f(long j10, f fVar, List<? extends n> list) {
        if (this.f21597h != null) {
            return false;
        }
        return this.f21594e.r(j10, fVar, list);
    }

    @Override // k9.j
    public void g(f fVar) {
    }

    @Override // k9.j
    public int i(long j10, List<? extends n> list) {
        if (this.f21597h == null && this.f21594e.length() >= 2) {
            return this.f21594e.m(j10, list);
        }
        return list.size();
    }

    @Override // k9.j
    public boolean j(f fVar, boolean z10, d0.c cVar, d0 d0Var) {
        d0.b a10 = d0Var.a(z.a(this.f21594e), cVar);
        if (z10 && a10 != null && a10.f29135a == 2) {
            q qVar = this.f21594e;
            if (qVar.b(qVar.o(fVar.f33388d), a10.f29136b)) {
                return true;
            }
        }
        return false;
    }

    @Override // k9.j
    public void release() {
        for (g gVar : this.f21592c) {
            gVar.release();
        }
    }
}
