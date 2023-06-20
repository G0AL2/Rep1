package b9;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import ea.n0;
import java.util.ArrayDeque;

/* compiled from: AsynchronousMediaCodecCallback.java */
/* loaded from: classes2.dex */
public final class g extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f4918b;

    /* renamed from: c */
    private Handler f4919c;

    /* renamed from: h */
    private MediaFormat f4924h;

    /* renamed from: i */
    private MediaFormat f4925i;

    /* renamed from: j */
    private MediaCodec.CodecException f4926j;

    /* renamed from: k */
    private long f4927k;

    /* renamed from: l */
    private boolean f4928l;

    /* renamed from: m */
    private IllegalStateException f4929m;

    /* renamed from: a */
    private final Object f4917a = new Object();

    /* renamed from: d */
    private final k f4920d = new k();

    /* renamed from: e */
    private final k f4921e = new k();

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f4922f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f4923g = new ArrayDeque<>();

    public g(HandlerThread handlerThread) {
        this.f4918b = handlerThread;
    }

    public static /* synthetic */ void a(g gVar, MediaCodec mediaCodec) {
        gVar.j(mediaCodec);
    }

    private void b(MediaFormat mediaFormat) {
        this.f4921e.a(-2);
        this.f4923g.add(mediaFormat);
    }

    private void f() {
        if (!this.f4923g.isEmpty()) {
            this.f4925i = this.f4923g.getLast();
        }
        this.f4920d.b();
        this.f4921e.b();
        this.f4922f.clear();
        this.f4923g.clear();
        this.f4926j = null;
    }

    private boolean i() {
        return this.f4927k > 0 || this.f4928l;
    }

    private void k() {
        l();
        m();
    }

    private void l() {
        IllegalStateException illegalStateException = this.f4929m;
        if (illegalStateException == null) {
            return;
        }
        this.f4929m = null;
        throw illegalStateException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f4926j;
        if (codecException == null) {
            return;
        }
        this.f4926j = null;
        throw codecException;
    }

    /* renamed from: n */
    public void j(MediaCodec mediaCodec) {
        synchronized (this.f4917a) {
            if (this.f4928l) {
                return;
            }
            long j10 = this.f4927k - 1;
            this.f4927k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                o(new IllegalStateException());
                return;
            }
            f();
            if (mediaCodec != null) {
                try {
                    mediaCodec.start();
                } catch (IllegalStateException e10) {
                    o(e10);
                } catch (Exception e11) {
                    o(new IllegalStateException(e11));
                }
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f4917a) {
            this.f4929m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f4917a) {
            int i10 = -1;
            if (i()) {
                return -1;
            }
            k();
            if (!this.f4920d.d()) {
                i10 = this.f4920d.e();
            }
            return i10;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f4917a) {
            if (i()) {
                return -1;
            }
            k();
            if (this.f4921e.d()) {
                return -1;
            }
            int e10 = this.f4921e.e();
            if (e10 >= 0) {
                ea.a.h(this.f4924h);
                MediaCodec.BufferInfo remove = this.f4922f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e10 == -2) {
                this.f4924h = this.f4923g.remove();
            }
            return e10;
        }
    }

    public void e(final MediaCodec mediaCodec) {
        synchronized (this.f4917a) {
            this.f4927k++;
            ((Handler) n0.j(this.f4919c)).post(new Runnable() { // from class: b9.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.a(g.this, mediaCodec);
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f4917a) {
            mediaFormat = this.f4924h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        ea.a.f(this.f4919c == null);
        this.f4918b.start();
        Handler handler = new Handler(this.f4918b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f4919c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f4917a) {
            this.f4926j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f4917a) {
            this.f4920d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f4917a) {
            MediaFormat mediaFormat = this.f4925i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f4925i = null;
            }
            this.f4921e.a(i10);
            this.f4922f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f4917a) {
            b(mediaFormat);
            this.f4925i = null;
        }
    }

    public void p() {
        synchronized (this.f4917a) {
            this.f4928l = true;
            this.f4918b.quit();
            f();
        }
    }
}
