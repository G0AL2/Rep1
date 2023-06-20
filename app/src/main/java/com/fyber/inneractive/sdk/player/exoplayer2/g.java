package com.fyber.inneractive.sdk.player.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.e;
import com.fyber.inneractive.sdk.player.exoplayer2.h;
import com.fyber.inneractive.sdk.player.exoplayer2.p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final n[] f19036a;

    /* renamed from: b  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g f19037b;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f f19038c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f19039d;

    /* renamed from: e  reason: collision with root package name */
    public final h f19040e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArraySet<e.a> f19041f;

    /* renamed from: g  reason: collision with root package name */
    public final p.c f19042g;

    /* renamed from: h  reason: collision with root package name */
    public final p.b f19043h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f19044i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f19045j;

    /* renamed from: k  reason: collision with root package name */
    public int f19046k;

    /* renamed from: l  reason: collision with root package name */
    public int f19047l;

    /* renamed from: m  reason: collision with root package name */
    public int f19048m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f19049n;

    /* renamed from: o  reason: collision with root package name */
    public p f19050o;

    /* renamed from: p  reason: collision with root package name */
    public Object f19051p;

    /* renamed from: q  reason: collision with root package name */
    public s f19052q;

    /* renamed from: r  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f f19053r;

    /* renamed from: s  reason: collision with root package name */
    public m f19054s;

    /* renamed from: t  reason: collision with root package name */
    public h.b f19055t;

    /* renamed from: u  reason: collision with root package name */
    public int f19056u;

    /* renamed from: v  reason: collision with root package name */
    public long f19057v;

    @SuppressLint({"HandlerLeak"})
    public g(n[] nVarArr, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g gVar, c cVar) {
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.4 [" + u.f19610e + "]");
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(nVarArr.length > 0);
        this.f19036a = (n[]) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(nVarArr);
        this.f19037b = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(gVar);
        this.f19045j = false;
        this.f19046k = 1;
        this.f19041f = new CopyOnWriteArraySet<>();
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f fVar = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[nVarArr.length]);
        this.f19038c = fVar;
        this.f19050o = p.f19218a;
        this.f19042g = new p.c();
        this.f19043h = new p.b();
        this.f19052q = s.f19332d;
        this.f19053r = fVar;
        this.f19054s = m.f19141d;
        f fVar2 = new f(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f19039d = fVar2;
        h.b bVar = new h.b(0, 0L);
        this.f19055t = bVar;
        this.f19040e = new h(nVarArr, gVar, cVar, this.f19045j, fVar2, bVar, this);
    }

    public void a(boolean z10) {
        if (this.f19045j != z10) {
            this.f19045j = z10;
            this.f19040e.f19063f.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
            Iterator<e.a> it = this.f19041f.iterator();
            while (it.hasNext()) {
                it.next().a(z10, this.f19046k);
            }
        }
    }

    public void b() {
        h hVar = this.f19040e;
        synchronized (hVar) {
            if (!hVar.f19075r) {
                hVar.f19063f.sendEmptyMessage(6);
                while (!hVar.f19075r) {
                    try {
                        hVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                hVar.f19064g.quit();
            }
        }
        this.f19039d.removeCallbacksAndMessages(null);
    }

    public void a(int i10, long j10) {
        if (i10 >= 0 && (this.f19050o.c() || i10 < this.f19050o.b())) {
            this.f19047l++;
            this.f19056u = i10;
            if (!this.f19050o.c()) {
                this.f19050o.a(i10, this.f19042g, false, 0L);
                long j11 = j10 == -9223372036854775807L ? this.f19042g.f19228e : j10;
                p.c cVar = this.f19042g;
                int i11 = cVar.f19226c;
                long a10 = cVar.f19230g + b.a(j11);
                long j12 = this.f19050o.a(i11, this.f19043h, false).f19222d;
                while (j12 != -9223372036854775807L && a10 >= j12 && i11 < this.f19042g.f19227d) {
                    a10 -= j12;
                    i11++;
                    j12 = this.f19050o.a(i11, this.f19043h, false).f19222d;
                }
            }
            if (j10 == -9223372036854775807L) {
                this.f19057v = 0L;
                this.f19040e.f19063f.obtainMessage(3, new h.c(this.f19050o, i10, -9223372036854775807L)).sendToTarget();
                return;
            }
            this.f19057v = j10;
            this.f19040e.f19063f.obtainMessage(3, new h.c(this.f19050o, i10, b.a(j10))).sendToTarget();
            Iterator<e.a> it = this.f19041f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            return;
        }
        throw new k(this.f19050o, i10, j10);
    }

    public void a(e.c... cVarArr) {
        h hVar = this.f19040e;
        if (hVar.f19075r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        hVar.f19080w++;
        hVar.f19063f.obtainMessage(11, cVarArr).sendToTarget();
    }

    public int a() {
        if (!this.f19050o.c() && this.f19047l <= 0) {
            return this.f19050o.a(this.f19055t.f19103a, this.f19043h, false).f19221c;
        }
        return this.f19056u;
    }
}
