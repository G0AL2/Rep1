package b9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import b9.b;
import b9.l;
import ea.k0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: AsynchronousMediaCodecAdapter.java */
/* loaded from: classes2.dex */
public final class b implements l {

    /* renamed from: a */
    private final MediaCodec f4887a;

    /* renamed from: b */
    private final g f4888b;

    /* renamed from: c */
    private final e f4889c;

    /* renamed from: d */
    private final boolean f4890d;

    /* renamed from: e */
    private final boolean f4891e;

    /* renamed from: f */
    private boolean f4892f;

    /* renamed from: g */
    private int f4893g;

    /* compiled from: AsynchronousMediaCodecAdapter.java */
    /* renamed from: b9.b$b */
    /* loaded from: classes2.dex */
    public static final class C0092b implements l.b {

        /* renamed from: a */
        private final ib.q<HandlerThread> f4894a;

        /* renamed from: b */
        private final ib.q<HandlerThread> f4895b;

        /* renamed from: c */
        private final boolean f4896c;

        /* renamed from: d */
        private final boolean f4897d;

        public C0092b(final int i10, boolean z10, boolean z11) {
            this(new ib.q() { // from class: b9.c
                @Override // ib.q
                public final Object get() {
                    return b.C0092b.b(i10);
                }
            }, new ib.q() { // from class: b9.d
                @Override // ib.q
                public final Object get() {
                    return b.C0092b.c(i10);
                }
            }, z10, z11);
        }

        public static /* synthetic */ HandlerThread b(int i10) {
            return e(i10);
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return f(i10);
        }

        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(b.n(i10));
        }

        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(b.o(i10));
        }

        @Override // b9.l.b
        /* renamed from: d */
        public b a(l.a aVar) throws IOException {
            MediaCodec mediaCodec;
            b bVar;
            String str = aVar.f4944a.f4950a;
            b bVar2 = null;
            try {
                String valueOf = String.valueOf(str);
                k0.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    bVar = new b(mediaCodec, this.f4894a.get(), this.f4895b.get(), this.f4896c, this.f4897d);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodec = null;
            }
            try {
                k0.c();
                bVar.q(aVar.f4945b, aVar.f4947d, aVar.f4948e, aVar.f4949f);
                return bVar;
            } catch (Exception e12) {
                e = e12;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.release();
                } else if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }

        C0092b(ib.q<HandlerThread> qVar, ib.q<HandlerThread> qVar2, boolean z10, boolean z11) {
            this.f4894a = qVar;
            this.f4895b = qVar2;
            this.f4896c = z10;
            this.f4897d = z11;
        }
    }

    public static /* synthetic */ void j(b bVar, l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        bVar.r(cVar, mediaCodec, j10, j11);
    }

    public static String n(int i10) {
        return p(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String o(int i10) {
        return p(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String p(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void q(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f4888b.h(this.f4887a);
        k0.a("configureCodec");
        this.f4887a.configure(mediaFormat, surface, mediaCrypto, i10);
        k0.c();
        this.f4889c.q();
        k0.a("startCodec");
        this.f4887a.start();
        k0.c();
        this.f4893g = 1;
    }

    public /* synthetic */ void r(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    private void s() {
        if (this.f4890d) {
            try {
                this.f4889c.r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // b9.l
    public void a(final l.c cVar, Handler handler) {
        s();
        this.f4887a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: b9.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.j(b.this, cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // b9.l
    public void b(int i10) {
        s();
        this.f4887a.setVideoScalingMode(i10);
    }

    @Override // b9.l
    public void c(Surface surface) {
        s();
        this.f4887a.setOutputSurface(surface);
    }

    @Override // b9.l
    public boolean d() {
        return false;
    }

    @Override // b9.l
    public void e(Bundle bundle) {
        s();
        this.f4887a.setParameters(bundle);
    }

    @Override // b9.l
    public void f(int i10, long j10) {
        this.f4887a.releaseOutputBuffer(i10, j10);
    }

    @Override // b9.l
    public void flush() {
        this.f4889c.i();
        this.f4887a.flush();
        if (this.f4891e) {
            this.f4888b.e(null);
            this.f4887a.start();
            return;
        }
        this.f4888b.e(this.f4887a);
    }

    @Override // b9.l
    public int g() {
        return this.f4888b.c();
    }

    @Override // b9.l
    public ByteBuffer getInputBuffer(int i10) {
        return this.f4887a.getInputBuffer(i10);
    }

    @Override // b9.l
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f4887a.getOutputBuffer(i10);
    }

    @Override // b9.l
    public MediaFormat getOutputFormat() {
        return this.f4888b.g();
    }

    @Override // b9.l
    public int h(MediaCodec.BufferInfo bufferInfo) {
        return this.f4888b.d(bufferInfo);
    }

    @Override // b9.l
    public void i(int i10, int i11, m8.c cVar, long j10, int i12) {
        this.f4889c.n(i10, i11, cVar, j10, i12);
    }

    @Override // b9.l
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f4889c.m(i10, i11, i12, j10, i13);
    }

    @Override // b9.l
    public void release() {
        try {
            if (this.f4893g == 1) {
                this.f4889c.p();
                this.f4888b.p();
            }
            this.f4893g = 2;
        } finally {
            if (!this.f4892f) {
                this.f4887a.release();
                this.f4892f = true;
            }
        }
    }

    @Override // b9.l
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f4887a.releaseOutputBuffer(i10, z10);
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11) {
        this.f4887a = mediaCodec;
        this.f4888b = new g(handlerThread);
        this.f4889c = new e(mediaCodec, handlerThread2);
        this.f4890d = z10;
        this.f4891e = z11;
        this.f4893g = 0;
    }
}
