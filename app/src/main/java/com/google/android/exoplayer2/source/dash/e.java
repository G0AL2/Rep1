package com.google.android.exoplayer2.source.dash;

import ea.n0;
import i9.o0;
import j8.p1;
import j8.q1;
import java.io.IOException;
import m8.g;

/* compiled from: EventSampleStream.java */
/* loaded from: classes2.dex */
final class e implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final p1 f21375a;

    /* renamed from: c  reason: collision with root package name */
    private long[] f21377c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f21378d;

    /* renamed from: e  reason: collision with root package name */
    private m9.f f21379e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21380f;

    /* renamed from: g  reason: collision with root package name */
    private int f21381g;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.exoplayer2.metadata.emsg.a f21376b = new com.google.android.exoplayer2.metadata.emsg.a();

    /* renamed from: h  reason: collision with root package name */
    private long f21382h = -9223372036854775807L;

    public e(m9.f fVar, p1 p1Var, boolean z10) {
        this.f21375a = p1Var;
        this.f21379e = fVar;
        this.f21377c = fVar.f34363b;
        d(fVar, z10);
    }

    @Override // i9.o0
    public void a() throws IOException {
    }

    public String b() {
        return this.f21379e.a();
    }

    public void c(long j10) {
        boolean z10 = true;
        int e10 = n0.e(this.f21377c, j10, true, false);
        this.f21381g = e10;
        if (!((this.f21378d && e10 == this.f21377c.length) ? false : false)) {
            j10 = -9223372036854775807L;
        }
        this.f21382h = j10;
    }

    public void d(m9.f fVar, boolean z10) {
        int i10 = this.f21381g;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f21377c[i10 - 1];
        this.f21378d = z10;
        this.f21379e = fVar;
        long[] jArr = fVar.f34363b;
        this.f21377c = jArr;
        long j11 = this.f21382h;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f21381g = n0.e(jArr, j10, false, false);
        }
    }

    @Override // i9.o0
    public int f(q1 q1Var, g gVar, int i10) {
        int i11 = this.f21381g;
        boolean z10 = i11 == this.f21377c.length;
        if (z10 && !this.f21378d) {
            gVar.n(4);
            return -4;
        } else if ((i10 & 2) != 0 || !this.f21380f) {
            q1Var.f32770b = this.f21375a;
            this.f21380f = true;
            return -5;
        } else if (z10) {
            return -3;
        } else {
            if ((i10 & 1) == 0) {
                this.f21381g = i11 + 1;
            }
            if ((i10 & 4) == 0) {
                byte[] a10 = this.f21376b.a(this.f21379e.f34362a[i11]);
                gVar.p(a10.length);
                gVar.f34290c.put(a10);
            }
            gVar.f34292e = this.f21377c[i11];
            gVar.n(1);
            return -4;
        }
    }

    @Override // i9.o0
    public boolean isReady() {
        return true;
    }

    @Override // i9.o0
    public int n(long j10) {
        int max = Math.max(this.f21381g, n0.e(this.f21377c, j10, true, false));
        int i10 = max - this.f21381g;
        this.f21381g = max;
        return i10;
    }
}
