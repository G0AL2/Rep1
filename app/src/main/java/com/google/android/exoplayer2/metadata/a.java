package com.google.android.exoplayer2.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c9.b;
import c9.c;
import c9.d;
import c9.e;
import com.google.android.exoplayer2.metadata.Metadata;
import ea.n0;
import j8.f;
import j8.p1;
import j8.q1;
import j8.x2;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MetadataRenderer.java */
/* loaded from: classes2.dex */
public final class a extends f implements Handler.Callback {

    /* renamed from: m  reason: collision with root package name */
    private final c f21134m;

    /* renamed from: n  reason: collision with root package name */
    private final e f21135n;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f21136o;

    /* renamed from: p  reason: collision with root package name */
    private final d f21137p;

    /* renamed from: q  reason: collision with root package name */
    private b f21138q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f21139r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f21140s;

    /* renamed from: t  reason: collision with root package name */
    private long f21141t;

    /* renamed from: u  reason: collision with root package name */
    private long f21142u;

    /* renamed from: v  reason: collision with root package name */
    private Metadata f21143v;

    public a(e eVar, Looper looper) {
        this(eVar, looper, c.f5331a);
    }

    private void O(Metadata metadata, List<Metadata.Entry> list) {
        for (int i10 = 0; i10 < metadata.g(); i10++) {
            p1 z10 = metadata.f(i10).z();
            if (z10 != null && this.f21134m.a(z10)) {
                b b10 = this.f21134m.b(z10);
                byte[] bArr = (byte[]) ea.a.e(metadata.f(i10).c1());
                this.f21137p.g();
                this.f21137p.p(bArr.length);
                ((ByteBuffer) n0.j(this.f21137p.f34290c)).put(bArr);
                this.f21137p.q();
                Metadata a10 = b10.a(this.f21137p);
                if (a10 != null) {
                    O(a10, list);
                }
            } else {
                list.add(metadata.f(i10));
            }
        }
    }

    private void P(Metadata metadata) {
        Handler handler = this.f21136o;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            Q(metadata);
        }
    }

    private void Q(Metadata metadata) {
        this.f21135n.g(metadata);
    }

    private boolean R(long j10) {
        boolean z10;
        Metadata metadata = this.f21143v;
        if (metadata == null || this.f21142u > j10) {
            z10 = false;
        } else {
            P(metadata);
            this.f21143v = null;
            this.f21142u = -9223372036854775807L;
            z10 = true;
        }
        if (this.f21139r && this.f21143v == null) {
            this.f21140s = true;
        }
        return z10;
    }

    private void S() {
        if (this.f21139r || this.f21143v != null) {
            return;
        }
        this.f21137p.g();
        q1 z10 = z();
        int L = L(z10, this.f21137p, 0);
        if (L != -4) {
            if (L == -5) {
                this.f21141t = ((p1) ea.a.e(z10.f32770b)).f32713p;
            }
        } else if (this.f21137p.l()) {
            this.f21139r = true;
        } else {
            d dVar = this.f21137p;
            dVar.f5332i = this.f21141t;
            dVar.q();
            Metadata a10 = ((b) n0.j(this.f21138q)).a(this.f21137p);
            if (a10 != null) {
                ArrayList arrayList = new ArrayList(a10.g());
                O(a10, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f21143v = new Metadata(arrayList);
                this.f21142u = this.f21137p.f34292e;
            }
        }
    }

    @Override // j8.f
    protected void E() {
        this.f21143v = null;
        this.f21142u = -9223372036854775807L;
        this.f21138q = null;
    }

    @Override // j8.f
    protected void G(long j10, boolean z10) {
        this.f21143v = null;
        this.f21142u = -9223372036854775807L;
        this.f21139r = false;
        this.f21140s = false;
    }

    @Override // j8.f
    protected void K(p1[] p1VarArr, long j10, long j11) {
        this.f21138q = this.f21134m.b(p1VarArr[0]);
    }

    @Override // j8.y2
    public int a(p1 p1Var) {
        if (this.f21134m.a(p1Var)) {
            return x2.a(p1Var.E == 0 ? 4 : 2);
        }
        return x2.a(0);
    }

    @Override // j8.w2
    public boolean d() {
        return this.f21140s;
    }

    @Override // j8.w2, j8.y2
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            Q((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // j8.w2
    public boolean isReady() {
        return true;
    }

    @Override // j8.w2
    public void r(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            S();
            z10 = R(j10);
        }
    }

    public a(e eVar, Looper looper, c cVar) {
        super(5);
        this.f21135n = (e) ea.a.e(eVar);
        this.f21136o = looper == null ? null : n0.v(looper, this);
        this.f21134m = (c) ea.a.e(cVar);
        this.f21137p = new d();
        this.f21142u = -9223372036854775807L;
    }
}
