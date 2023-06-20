package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

@TargetApi(16)
/* loaded from: classes2.dex */
public class MediaCodecVideoRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b {

    /* renamed from: w0  reason: collision with root package name */
    public static final int[] f19615w0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final d V;
    public final VideoRendererEventListener.EventDispatcher W;
    public final long X;
    public final int Y;
    public final boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public i[] f19616a0;

    /* renamed from: b0  reason: collision with root package name */
    public a f19617b0;

    /* renamed from: c0  reason: collision with root package name */
    public Surface f19618c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f19619d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f19620e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f19621f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f19622g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f19623h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f19624i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f19625j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f19626k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f19627l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f19628m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f19629n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f19630o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f19631p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f19632q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f19633r0;

    /* renamed from: s0  reason: collision with root package name */
    public float f19634s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f19635t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f19636u0;

    /* renamed from: v0  reason: collision with root package name */
    public b f19637v0;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19638a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19639b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19640c;

        public a(int i10, int i11, int i12) {
            this.f19638a = i10;
            this.f19639b = i11;
            this.f19640c = i12;
        }
    }

    @TargetApi(23)
    /* loaded from: classes2.dex */
    public final class b implements MediaCodec.OnFrameRenderedListener {
        public b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.f19637v0) {
                return;
            }
            mediaCodecVideoRenderer.C();
        }
    }

    public MediaCodecVideoRenderer(Context context, com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c cVar, long j10, com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> cVar2, boolean z10, Handler handler, VideoRendererEventListener videoRendererEventListener, int i10) {
        super(2, cVar, null, z10);
        this.X = j10;
        this.Y = i10;
        this.V = new d(context);
        this.W = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.Z = A();
        this.f19621f0 = -9223372036854775807L;
        this.f19627l0 = -1;
        this.f19628m0 = -1;
        this.f19630o0 = -1.0f;
        this.f19626k0 = -1.0f;
        this.f19619d0 = 1;
        z();
    }

    public static boolean A() {
        return u.f19606a <= 22 && "foster".equals(u.f19607b) && "NVIDIA".equals(u.f19608c);
    }

    public final void B() {
        if (this.f19623h0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.W.droppedFrames(this.f19623h0, elapsedRealtime - this.f19622g0);
            this.f19623h0 = 0;
            this.f19622g0 = elapsedRealtime;
        }
    }

    public void C() {
        if (this.f19620e0) {
            return;
        }
        this.f19620e0 = true;
        this.W.renderedFirstFrame(this.f19618c0);
    }

    public final void D() {
        int i10 = this.f19627l0;
        if (i10 == -1 && this.f19628m0 == -1) {
            return;
        }
        if (this.f19631p0 == i10 && this.f19632q0 == this.f19628m0 && this.f19633r0 == this.f19629n0 && this.f19634s0 == this.f19630o0) {
            return;
        }
        this.W.videoSizeChanged(i10, this.f19628m0, this.f19629n0, this.f19630o0);
        this.f19631p0 = this.f19627l0;
        this.f19632q0 = this.f19628m0;
        this.f19633r0 = this.f19629n0;
        this.f19634s0 = this.f19630o0;
    }

    public final void E() {
        int i10 = this.f19631p0;
        if (i10 == -1 && this.f19632q0 == -1) {
            return;
        }
        this.W.videoSizeChanged(i10, this.f19632q0, this.f19633r0, this.f19634s0);
    }

    public final void F() {
        this.f19621f0 = this.X > 0 ? SystemClock.elapsedRealtime() + this.X : -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d4  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r18, com.fyber.inneractive.sdk.player.exoplayer2.i r19) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.b {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.i):int");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.n
    public boolean isReady() {
        if ((this.f19620e0 || super.x()) && super.isReady()) {
            this.f19621f0 = -9223372036854775807L;
            return true;
        } else if (this.f19621f0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f19621f0) {
                return true;
            }
            this.f19621f0 = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.a
    public void p() {
        this.f19627l0 = -1;
        this.f19628m0 = -1;
        this.f19630o0 = -1.0f;
        this.f19626k0 = -1.0f;
        z();
        y();
        d dVar = this.V;
        dVar.getClass();
        dVar.f19674a.f19686b.sendEmptyMessage(2);
        this.f19637v0 = null;
        try {
            super.p();
        } finally {
            this.T.ensureUpdated();
            this.W.disabled(this.T);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void q() {
        this.f19623h0 = 0;
        this.f19622g0 = SystemClock.elapsedRealtime();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void r() {
        this.f19621f0 = -9223372036854775807L;
        B();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public boolean x() {
        Surface surface;
        return super.x() && (surface = this.f19618c0) != null && surface.isValid();
    }

    public final void y() {
        MediaCodec mediaCodec;
        this.f19620e0 = false;
        if (u.f19606a < 23 || !this.f19635t0 || (mediaCodec = this.f19159r) == null) {
            return;
        }
        this.f19637v0 = new b(mediaCodec);
    }

    public final void z() {
        this.f19631p0 = -1;
        this.f19632q0 = -1;
        this.f19634s0 = -1.0f;
        this.f19633r0 = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(i[] iVarArr) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        this.f19616a0 = iVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b, com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(long j10, boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(j10, z10);
        y();
        this.f19624i0 = 0;
        if (z10) {
            F();
        } else {
            this.f19621f0 = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.e.b
    public void a(int i10, Object obj) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        if (i10 != 1) {
            if (i10 == 4) {
                int intValue = ((Integer) obj).intValue();
                this.f19619d0 = intValue;
                MediaCodec mediaCodec = this.f19159r;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(intValue);
                    return;
                }
                return;
            }
            return;
        }
        Surface surface = (Surface) obj;
        if (this.f19618c0 == surface) {
            if (surface != null) {
                E();
                if (this.f19620e0) {
                    this.W.renderedFirstFrame(this.f19618c0);
                    return;
                }
                return;
            }
            return;
        }
        this.f19618c0 = surface;
        int i11 = this.f17973d;
        if (i11 == 1 || i11 == 2) {
            MediaCodec mediaCodec2 = this.f19159r;
            if (u.f19606a >= 23 && mediaCodec2 != null && surface != null) {
                mediaCodec2.setOutputSurface(surface);
            } else {
                v();
                t();
            }
        }
        if (surface != null) {
            E();
            y();
            if (i11 == 2) {
                F();
                return;
            }
            return;
        }
        z();
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r23, android.media.MediaCodec r24, com.fyber.inneractive.sdk.player.exoplayer2.i r25, android.media.MediaCrypto r26) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d.b {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a, android.media.MediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.i, android.media.MediaCrypto):void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(String str, long j10, long j11) {
        this.W.decoderInitialized(str, j10, j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(i iVar) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        super.a(iVar);
        this.W.inputFormatChanged(iVar);
        float f10 = iVar.f19127n;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.f19626k0 = f10;
        int i10 = iVar.f19126m;
        if (i10 == -1) {
            i10 = 0;
        }
        this.f19625j0 = i10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.decoder.b bVar) {
        if (u.f19606a >= 23 || !this.f19635t0) {
            return;
        }
        C();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f19627l0 = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f19628m0 = integer2;
        float f10 = this.f19626k0;
        this.f19630o0 = f10;
        if (u.f19606a >= 21) {
            int i10 = this.f19625j0;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f19627l0;
                this.f19627l0 = integer2;
                this.f19628m0 = i11;
                this.f19630o0 = 1.0f / f10;
            }
        } else {
            this.f19629n0 = this.f19625j0;
        }
        mediaCodec.setVideoScalingMode(this.f19619d0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public void a(boolean z10) throws com.fyber.inneractive.sdk.player.exoplayer2.d {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.T = decoderCounters;
        int i10 = this.f17971b.f19217a;
        this.f19636u0 = i10;
        this.f19635t0 = i10 != 0;
        this.W.enabled(decoderCounters);
        d dVar = this.V;
        dVar.f19680g = false;
        dVar.f19674a.f19686b.sendEmptyMessage(1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    public boolean a(MediaCodec mediaCodec, boolean z10, i iVar, i iVar2) {
        if (a(z10, iVar, iVar2)) {
            int i10 = iVar2.f19123j;
            a aVar = this.f19617b0;
            if (i10 <= aVar.f19638a && iVar2.f19124k <= aVar.f19639b && iVar2.f19120g <= aVar.f19640c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0129  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(long r20, long r22, android.media.MediaCodec r24, java.nio.ByteBuffer r25, int r26, int r27, long r28, boolean r30) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    public final void a(MediaCodec mediaCodec, int i10) {
        D();
        s.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        s.a();
        this.T.renderedOutputBufferCount++;
        this.f19624i0 = 0;
        C();
    }

    @TargetApi(21)
    public final void a(MediaCodec mediaCodec, int i10, long j10) {
        D();
        s.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j10);
        s.a();
        this.T.renderedOutputBufferCount++;
        this.f19624i0 = 0;
        C();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str, int i10, int i11) {
        char c10;
        int i12;
        if (i10 == -1 || i11 == -1) {
            return -1;
        }
        str.getClass();
        int i13 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 2:
            case 4:
                i12 = i10 * i11;
                i13 = 2;
                break;
            case 1:
            case 5:
                i12 = i10 * i11;
                break;
            case 3:
                if (!"BRAVIA 4K 2015".equals(u.f19609d)) {
                    i12 = u.a(i10, 16) * u.a(i11, 16) * 16 * 16;
                    i13 = 2;
                    break;
                } else {
                    return -1;
                }
            default:
                return -1;
        }
        return (i12 * 3) / (i13 * 2);
    }

    public static boolean a(boolean z10, i iVar, i iVar2) {
        if (iVar.f19119f.equals(iVar2.f19119f)) {
            int i10 = iVar.f19126m;
            if (i10 == -1) {
                i10 = 0;
            }
            int i11 = iVar2.f19126m;
            if (i11 == -1) {
                i11 = 0;
            }
            if (i10 == i11) {
                return z10 || (iVar.f19123j == iVar2.f19123j && iVar.f19124k == iVar2.f19124k);
            }
            return false;
        }
        return false;
    }
}
