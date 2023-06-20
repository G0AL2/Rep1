package com.fyber.inneractive.sdk.player.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.player.cache.d;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.e;
import com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer;
import com.fyber.inneractive.sdk.util.IAlog;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class d extends g implements d.b, d.c {
    public boolean A;
    public final boolean B;
    public Bitmap C;
    public int D;
    public String E;
    public final List<com.fyber.inneractive.sdk.player.cache.h> F;
    public com.fyber.inneractive.sdk.player.exoplayer2.source.n G;
    public boolean H;
    public int I;

    /* renamed from: p  reason: collision with root package name */
    public final int f17871p;

    /* renamed from: q  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.s f17872q;

    /* renamed from: r  reason: collision with root package name */
    public final int f17873r;

    /* renamed from: s  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.e f17874s;

    /* renamed from: t  reason: collision with root package name */
    public int f17875t;

    /* renamed from: u  reason: collision with root package name */
    public int f17876u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f17877v;

    /* renamed from: w  reason: collision with root package name */
    public Surface f17878w;

    /* renamed from: x  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.n[] f17879x;

    /* renamed from: y  reason: collision with root package name */
    public Handler f17880y;

    /* renamed from: z  reason: collision with root package name */
    public r f17881z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.fyber.inneractive.sdk.player.exoplayer2.e eVar = d.this.f17874s;
            if (eVar != null) {
                com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) eVar;
                gVar.a(gVar.a(), -9223372036854775807L);
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) d.this.f17874s).f19040e.f19063f.sendEmptyMessage(5);
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) d.this.f17874s).b();
                d.this.f17874s = null;
            }
        }
    }

    public d(Context context, boolean z10, com.fyber.inneractive.sdk.config.global.s sVar) {
        super(context);
        this.f17875t = 0;
        this.f17876u = 0;
        this.f17877v = false;
        this.f17878w = null;
        this.A = false;
        this.F = new CopyOnWriteArrayList();
        this.G = null;
        this.I = 0;
        this.B = z10;
        this.f17872q = sVar;
        this.f17873r = IAConfigManager.b().a().a("extractor_source_retry_count", 6, 3);
        com.fyber.inneractive.sdk.config.global.features.j jVar = sVar != null ? (com.fyber.inneractive.sdk.config.global.features.j) sVar.a(com.fyber.inneractive.sdk.config.global.features.j.class) : null;
        this.f17871p = jVar == null ? 0 : jVar.h();
        IAlog.a("Creating IAExoPlayer2Controller", new Object[0]);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(int i10, boolean z10) {
        IAlog.a("%sseekTo called with %d playAfterSeek = %s", IAlog.a(this), Integer.valueOf(i10), Boolean.valueOf(z10));
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.f17874s;
        if (eVar == null || this.A) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).a(z10);
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) this.f17874s;
        gVar.a(gVar.a(), i10);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void b(boolean z10) {
        c(true);
        this.f17900n = z10;
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.f17874s;
        if (eVar == null || this.A) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.n[] nVarArr = this.f17879x;
        if (nVarArr.length >= 2) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).a(new e.c(nVarArr[1], 2, new Float(0.0f)));
            this.f17877v = true;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int c() {
        long j10;
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.f17874s;
        if (eVar == null || this.A) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) eVar;
        if (!gVar.f19050o.c() && gVar.f19047l <= 0) {
            gVar.f19050o.a(gVar.f19055t.f19103a, gVar.f19043h, false);
            j10 = com.fyber.inneractive.sdk.player.exoplayer2.b.b(gVar.f19043h.f19223e) + com.fyber.inneractive.sdk.player.exoplayer2.b.b(gVar.f19055t.f19105c);
        } else {
            j10 = gVar.f19057v;
        }
        return (int) j10;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void d(boolean z10) {
        c(false);
        this.f17900n = z10;
        if (this.f17874s == null || this.A) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f17887a.getSystemService("audio");
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f10 = streamVolume / streamMaxVolume;
        IAlog.a(" unmute maxVolume = %d currentVolume = %d targetVolume = %s", Integer.valueOf(streamMaxVolume), Integer.valueOf(streamVolume), Float.valueOf(f10));
        if (f10 == 0.0f) {
            f10 = 0.1f;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.n[] nVarArr = this.f17879x;
        if (nVarArr.length >= 2) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.g) this.f17874s).a(new e.c(nVarArr[1], 2, new Float(f10)));
        }
        this.f17877v = false;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public Bitmap e() {
        return this.C;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public String f() {
        return this.B ? "exo_c" : "exo";
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int g() {
        return this.f17876u;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int h() {
        return this.f17875t;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean i() {
        return this.f17877v;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean j() {
        return (this.f17874s == null || this.A || this.f17891e != com.fyber.inneractive.sdk.player.enums.b.Playing) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void k() {
        com.fyber.inneractive.sdk.player.enums.b bVar;
        com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f17891e;
        if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Completed && bVar2 != (bVar = com.fyber.inneractive.sdk.player.enums.b.Paused) && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Prepared) {
            com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.f17874s;
            if (eVar != null && !this.A) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).a(false);
            }
            m();
            a(bVar);
            return;
        }
        IAlog.a("%s paused called when player is in mState: %s ignoring", IAlog.a(this), bVar2);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void l() {
        IAlog.a("%sstart called", IAlog.a(this));
        if (this.f17874s == null || this.A) {
            return;
        }
        a(com.fyber.inneractive.sdk.player.enums.b.Start_in_progress);
        ((com.fyber.inneractive.sdk.player.exoplayer2.g) this.f17874s).a(true);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void b() {
        if (this.f17874s != null) {
            if (!this.A) {
                this.A = true;
                com.fyber.inneractive.sdk.util.n.a(new a());
            }
            r rVar = this.f17881z;
            if (rVar != null) {
                rVar.f17943a.clear();
            }
            this.f17881z = null;
        }
        for (com.fyber.inneractive.sdk.player.cache.h hVar : this.F) {
            hVar.a(hVar.f17824o);
            com.fyber.inneractive.sdk.player.cache.n nVar = com.fyber.inneractive.sdk.player.cache.n.f17852f;
            nVar.f17856d.remove(hVar.a());
        }
        this.F.clear();
        super.b();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(Surface surface) {
        IAlog.a("%ssetSurface called with %s", IAlog.a(this), surface);
        this.f17878w = surface;
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.f17874s;
        if (eVar == null || this.A) {
            return;
        }
        ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).a(new e.c(this.f17879x[0], 1, surface));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(boolean z10) {
        if (this.f17874s != null || this.A) {
            return;
        }
        this.H = z10;
        IAlog.a("%sMediaPlayerController: creating media player", IAlog.a(this));
        r rVar = this.f17881z;
        if (rVar != null) {
            rVar.f17943a.clear();
        }
        this.f17881z = new r(this);
        this.f17880y = new Handler(Looper.getMainLooper());
        com.fyber.inneractive.sdk.player.exoplayer2.n[] nVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.n[z10 ? 2 : 1];
        this.f17879x = nVarArr;
        Context context = this.f17887a;
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c.f19168a;
        nVarArr[0] = new MediaCodecVideoRenderer(context, cVar, 5000L, null, false, this.f17880y, this.f17881z, -1);
        if (z10) {
            this.f17879x[1] = new MediaCodecAudioRenderer(cVar, null, true, null, null);
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = new com.fyber.inneractive.sdk.player.exoplayer2.g(this.f17879x, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b(null), new com.fyber.inneractive.sdk.player.exoplayer2.c(new com.fyber.inneractive.sdk.player.exoplayer2.upstream.k(true, Constants.MIN_PROGRESS_STEP, 0), 15000, 30000, 2500L, 5000L));
        this.f17874s = gVar;
        gVar.f19041f.add(this.f17881z);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public int d() {
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.f17874s;
        if (eVar == null || this.A) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) eVar;
        return (int) (gVar.f19050o.c() ? -9223372036854775807L : com.fyber.inneractive.sdk.player.exoplayer2.b.b(gVar.f19050o.a(gVar.a(), gVar.f19042g).f19229f));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public void a(String str, int i10) {
        a(str, i10, this.B);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.d.a(java.lang.String, int, boolean):void");
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.n nVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar = this.f17874s;
        if (eVar == null || nVar == null) {
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.g) eVar;
        if (!gVar.f19050o.c() || gVar.f19051p != null) {
            gVar.f19050o = com.fyber.inneractive.sdk.player.exoplayer2.p.f19218a;
            gVar.f19051p = null;
            Iterator<e.a> it = gVar.f19041f.iterator();
            while (it.hasNext()) {
                it.next().a(gVar.f19050o, gVar.f19051p);
            }
        }
        if (gVar.f19044i) {
            gVar.f19044i = false;
            gVar.f19052q = com.fyber.inneractive.sdk.player.exoplayer2.source.s.f19332d;
            gVar.f19053r = gVar.f19038c;
            gVar.f19037b.a(null);
            Iterator<e.a> it2 = gVar.f19041f.iterator();
            while (it2.hasNext()) {
                it2.next().a(gVar.f19052q, gVar.f19053r);
            }
        }
        gVar.f19048m++;
        gVar.f19040e.f19063f.obtainMessage(0, 1, 0, nVar).sendToTarget();
        a(com.fyber.inneractive.sdk.player.enums.b.Preparing);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g
    public boolean a() {
        return this.B;
    }
}
