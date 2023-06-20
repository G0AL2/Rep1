package com.fyber.inneractive.sdk.player.exoplayer2;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a implements n {

    /* renamed from: a  reason: collision with root package name */
    public final int f17970a;

    /* renamed from: b  reason: collision with root package name */
    public o f17971b;

    /* renamed from: c  reason: collision with root package name */
    public int f17972c;

    /* renamed from: d  reason: collision with root package name */
    public int f17973d;

    /* renamed from: e  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.o f17974e;

    /* renamed from: f  reason: collision with root package name */
    public long f17975f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17976g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17977h;

    public a(int i10) {
        this.f17970a = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void a(int i10) {
        this.f17972c = i10;
    }

    public abstract void a(long j10, boolean z10) throws d;

    public abstract void a(boolean z10) throws d;

    public void a(i[] iVarArr) throws d {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void c() {
        this.f17977h = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void d() throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f17973d == 2);
        this.f17973d = 1;
        r();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void e() throws IOException {
        this.f17974e.a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void f() throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f17973d == 1);
        this.f17973d = 2;
        q();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final boolean g() {
        return this.f17976g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final boolean h() {
        return this.f17977h;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g j() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final int k() {
        return this.f17970a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void l() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f17973d == 1);
        this.f17973d = 0;
        this.f17974e = null;
        this.f17977h = false;
        p();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final a m() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.o n() {
        return this.f17974e;
    }

    public abstract void p();

    public abstract void q() throws d;

    public abstract void r() throws d;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final int a() {
        return this.f17973d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void a(o oVar, i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.source.o oVar2, long j10, boolean z10, long j11) throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(this.f17973d == 0);
        this.f17971b = oVar;
        this.f17973d = 1;
        a(z10);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!this.f17977h);
        this.f17974e = oVar2;
        this.f17976g = false;
        this.f17975f = j11;
        a(iVarArr);
        a(j10, z10);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void a(i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.source.o oVar, long j10) throws d {
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(!this.f17977h);
        this.f17974e = oVar;
        this.f17976g = false;
        this.f17975f = j10;
        a(iVarArr);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.n
    public final void a(long j10) throws d {
        this.f17977h = false;
        this.f17976g = false;
        a(j10, false);
    }

    public final int a(j jVar, com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar, boolean z10) {
        int a10 = this.f17974e.a(jVar, bVar, z10);
        if (a10 == -4) {
            if (bVar.b(4)) {
                this.f17976g = true;
                return this.f17977h ? -4 : -3;
            }
            bVar.f18125d += this.f17975f;
        } else if (a10 == -5) {
            i iVar = jVar.f19140a;
            long j10 = iVar.f19136w;
            if (j10 != Long.MAX_VALUE) {
                jVar.f19140a = iVar.a(j10 + this.f17975f);
            }
        }
        return a10;
    }
}
