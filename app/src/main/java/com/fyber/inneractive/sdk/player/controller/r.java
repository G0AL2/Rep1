package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.l;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.player.mediaplayer.a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class r implements l.a, VideoRendererEventListener, e.a, com.fyber.inneractive.sdk.player.exoplayer2.source.f {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<d> f17943a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17944b = false;

    public r(d dVar) {
        this.f17943a = new WeakReference<>(dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.m mVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.p pVar, Object obj) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.source.s sVar, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f fVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(boolean z10, int i10) {
        com.fyber.inneractive.sdk.player.exoplayer2.e eVar;
        IAlog.a("%sonPlayerStateChanged called with pwr = %s state = %d", b(), Boolean.valueOf(z10), Integer.valueOf(i10));
        WeakReference<d> weakReference = this.f17943a;
        d dVar = weakReference == null ? null : weakReference.get();
        if (dVar == null || (eVar = dVar.f17874s) == null || dVar.A) {
            return;
        }
        if (i10 != 3) {
            if (i10 == 2) {
                if (dVar.f17891e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    dVar.a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                }
            } else if (i10 == 4) {
                dVar.a(com.fyber.inneractive.sdk.player.enums.b.Completed);
            }
        } else if (!z10) {
            if (dVar.f17891e == com.fyber.inneractive.sdk.player.enums.b.Preparing) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f fVar = ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).f19053r;
                if (fVar != null && fVar.f19367a > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e eVar2 = fVar.f19368b[0];
                    com.fyber.inneractive.sdk.player.exoplayer2.i c10 = eVar2 != null ? eVar2.c() : null;
                    if (c10 != null) {
                        int i11 = c10.f19123j;
                        int i12 = c10.f19124k;
                        dVar.f17875t = i11;
                        dVar.f17876u = i12;
                    }
                }
                this.f17944b = true;
                dVar.a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
            }
        } else {
            dVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
        }
    }

    public final String b() {
        WeakReference<d> weakReference = this.f17943a;
        d dVar = weakReference == null ? null : weakReference.get();
        if (dVar == null) {
            return r.class.getName();
        }
        return IAlog.a(dVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onDroppedFrames(int i10, long j10) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onRenderedFirstFrame(Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoDecoderInitialized(String str, long j10, long j11) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.i iVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        WeakReference<d> weakReference = this.f17943a;
        d dVar = weakReference == null ? null : weakReference.get();
        if (dVar != null) {
            dVar.f17875t = i10;
            dVar.f17876u = i11;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.a
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.d dVar) {
        d dVar2 = this.f17943a.get();
        if (dVar2 != null && dVar2.H && dVar2.B && !this.f17944b && (dVar.getCause() instanceof c.e)) {
            dVar2.f17877v = true;
            com.fyber.inneractive.sdk.player.exoplayer2.e eVar = dVar2.f17874s;
            if (eVar != null) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar).b();
                dVar2.f17874s = null;
            }
            dVar2.a(false);
            dVar2.a(dVar2.G);
            dVar2.f17895i.post(new h(dVar2, false));
        } else if (dVar2 != null && dVar2.B && !this.f17944b && com.fyber.inneractive.sdk.player.cache.n.f17852f.a() && dVar2.I < dVar2.f17871p) {
            com.fyber.inneractive.sdk.player.exoplayer2.e eVar2 = dVar2.f17874s;
            if (eVar2 != null) {
                ((com.fyber.inneractive.sdk.player.exoplayer2.g) eVar2).b();
                dVar2.f17874s = null;
            }
            dVar2.a(true);
            dVar2.a(dVar2.G);
            dVar2.I++;
            dVar2.f17895i.post(new h(dVar2, true));
        } else {
            a.m mVar = new a.m(dVar, dVar.getCause() == null ? "empty" : dVar.getCause().getMessage());
            IAlog.a("%sonPlayerError called with %s for sendErrorState", b(), mVar);
            d dVar3 = (d) com.fyber.inneractive.sdk.util.s.a(this.f17943a);
            if (dVar3 != null) {
                dVar3.a(mVar);
            }
        }
    }
}
