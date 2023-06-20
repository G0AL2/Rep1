package b9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import b9.l;
import ea.k0;
import ea.n0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: SynchronousMediaCodecAdapter.java */
/* loaded from: classes2.dex */
public final class x implements l {

    /* renamed from: a */
    private final MediaCodec f5012a;

    /* renamed from: b */
    private ByteBuffer[] f5013b;

    /* renamed from: c */
    private ByteBuffer[] f5014c;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    /* loaded from: classes2.dex */
    public static class b implements l.b {
        @Override // b9.l.b
        public l a(l.a aVar) throws IOException {
            MediaCodec mediaCodec = null;
            try {
                MediaCodec b10 = b(aVar);
                try {
                    k0.a("configureCodec");
                    b10.configure(aVar.f4945b, aVar.f4947d, aVar.f4948e, aVar.f4949f);
                    k0.c();
                    k0.a("startCodec");
                    b10.start();
                    k0.c();
                    return new x(b10);
                } catch (IOException | RuntimeException e10) {
                    e = e10;
                    mediaCodec = b10;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (RuntimeException e12) {
                e = e12;
            }
        }

        protected MediaCodec b(l.a aVar) throws IOException {
            ea.a.e(aVar.f4944a);
            String str = aVar.f4944a.f4950a;
            String valueOf = String.valueOf(str);
            k0.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            k0.c();
            return createByCodecName;
        }
    }

    public static /* synthetic */ void j(x xVar, l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        xVar.k(cVar, mediaCodec, j10, j11);
    }

    public /* synthetic */ void k(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    @Override // b9.l
    public void a(final l.c cVar, Handler handler) {
        this.f5012a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: b9.w
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                x.j(x.this, cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // b9.l
    public void b(int i10) {
        this.f5012a.setVideoScalingMode(i10);
    }

    @Override // b9.l
    public void c(Surface surface) {
        this.f5012a.setOutputSurface(surface);
    }

    @Override // b9.l
    public boolean d() {
        return false;
    }

    @Override // b9.l
    public void e(Bundle bundle) {
        this.f5012a.setParameters(bundle);
    }

    @Override // b9.l
    public void f(int i10, long j10) {
        this.f5012a.releaseOutputBuffer(i10, j10);
    }

    @Override // b9.l
    public void flush() {
        this.f5012a.flush();
    }

    @Override // b9.l
    public int g() {
        return this.f5012a.dequeueInputBuffer(0L);
    }

    @Override // b9.l
    public ByteBuffer getInputBuffer(int i10) {
        if (n0.f29709a >= 21) {
            return this.f5012a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) n0.j(this.f5013b))[i10];
    }

    @Override // b9.l
    public ByteBuffer getOutputBuffer(int i10) {
        if (n0.f29709a >= 21) {
            return this.f5012a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) n0.j(this.f5014c))[i10];
    }

    @Override // b9.l
    public MediaFormat getOutputFormat() {
        return this.f5012a.getOutputFormat();
    }

    @Override // b9.l
    public int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f5012a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && n0.f29709a < 21) {
                this.f5014c = this.f5012a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // b9.l
    public void i(int i10, int i11, m8.c cVar, long j10, int i12) {
        this.f5012a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // b9.l
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f5012a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // b9.l
    public void release() {
        this.f5013b = null;
        this.f5014c = null;
        this.f5012a.release();
    }

    @Override // b9.l
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f5012a.releaseOutputBuffer(i10, z10);
    }

    private x(MediaCodec mediaCodec) {
        this.f5012a = mediaCodec;
        if (n0.f29709a < 21) {
            this.f5013b = mediaCodec.getInputBuffers();
            this.f5014c = mediaCodec.getOutputBuffers();
        }
    }
}
