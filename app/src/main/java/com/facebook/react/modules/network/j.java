package com.facebook.react.modules.network;

import java.io.IOException;
import mf.r;
import ye.e0;
import ye.x;

/* compiled from: ProgressResponseBody.java */
/* loaded from: classes.dex */
public class j extends e0 {

    /* renamed from: b  reason: collision with root package name */
    private final e0 f15598b;

    /* renamed from: c  reason: collision with root package name */
    private final h f15599c;

    /* renamed from: d  reason: collision with root package name */
    private mf.h f15600d;

    /* renamed from: e  reason: collision with root package name */
    private long f15601e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProgressResponseBody.java */
    /* loaded from: classes.dex */
    public class a extends mf.l {
        a(mf.e0 e0Var) {
            super(e0Var);
        }

        @Override // mf.l, mf.e0
        public long e0(mf.f fVar, long j10) throws IOException {
            long e02 = super.e0(fVar, j10);
            int i10 = (e02 > (-1L) ? 1 : (e02 == (-1L) ? 0 : -1));
            j.z(j.this, i10 != 0 ? e02 : 0L);
            j.this.f15599c.a(j.this.f15601e, j.this.f15598b.e(), i10 == 0);
            return e02;
        }
    }

    public j(e0 e0Var, h hVar) {
        this.f15598b = e0Var;
        this.f15599c = hVar;
    }

    private mf.e0 L(mf.e0 e0Var) {
        return new a(e0Var);
    }

    static /* synthetic */ long z(j jVar, long j10) {
        long j11 = jVar.f15601e + j10;
        jVar.f15601e = j11;
        return j11;
    }

    public long O() {
        return this.f15601e;
    }

    @Override // ye.e0
    public long e() {
        return this.f15598b.e();
    }

    @Override // ye.e0
    public x h() {
        return this.f15598b.h();
    }

    @Override // ye.e0
    public mf.h q() {
        if (this.f15600d == null) {
            this.f15600d = r.d(L(this.f15598b.q()));
        }
        return this.f15600d;
    }
}
