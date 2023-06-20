package com.google.android.exoplayer2.source.hls;

import i9.o0;
import j8.q1;
import java.io.IOException;

/* compiled from: HlsSampleStream.java */
/* loaded from: classes2.dex */
final class k implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f21517a;

    /* renamed from: b  reason: collision with root package name */
    private final n f21518b;

    /* renamed from: c  reason: collision with root package name */
    private int f21519c = -1;

    public k(n nVar, int i10) {
        this.f21518b = nVar;
        this.f21517a = i10;
    }

    private boolean c() {
        int i10 = this.f21519c;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    @Override // i9.o0
    public void a() throws IOException {
        int i10 = this.f21519c;
        if (i10 == -2) {
            throw new n9.d(this.f21518b.t().b(this.f21517a).c(0).f32709l);
        }
        if (i10 == -1) {
            this.f21518b.U();
        } else if (i10 != -3) {
            this.f21518b.V(i10);
        }
    }

    public void b() {
        ea.a.a(this.f21519c == -1);
        this.f21519c = this.f21518b.y(this.f21517a);
    }

    public void d() {
        if (this.f21519c != -1) {
            this.f21518b.p0(this.f21517a);
            this.f21519c = -1;
        }
    }

    @Override // i9.o0
    public int f(q1 q1Var, m8.g gVar, int i10) {
        if (this.f21519c == -3) {
            gVar.d(4);
            return -4;
        } else if (c()) {
            return this.f21518b.e0(this.f21519c, q1Var, gVar, i10);
        } else {
            return -3;
        }
    }

    @Override // i9.o0
    public boolean isReady() {
        return this.f21519c == -3 || (c() && this.f21518b.Q(this.f21519c));
    }

    @Override // i9.o0
    public int n(long j10) {
        if (c()) {
            return this.f21518b.o0(this.f21519c, j10);
        }
        return 0;
    }
}
