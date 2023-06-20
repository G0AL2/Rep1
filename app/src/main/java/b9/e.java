package b9;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import ea.n0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes2.dex */
class e {

    /* renamed from: g  reason: collision with root package name */
    private static final ArrayDeque<b> f4900g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f4901h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f4902a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f4903b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f4904c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<RuntimeException> f4905d;

    /* renamed from: e  reason: collision with root package name */
    private final ea.f f4906e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4907f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    /* loaded from: classes2.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e.this.f(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f4909a;

        /* renamed from: b  reason: collision with root package name */
        public int f4910b;

        /* renamed from: c  reason: collision with root package name */
        public int f4911c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f4912d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f4913e;

        /* renamed from: f  reason: collision with root package name */
        public int f4914f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f4909a = i10;
            this.f4910b = i11;
            this.f4911c = i12;
            this.f4913e = j10;
            this.f4914f = i13;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new ea.f());
    }

    private void b() throws InterruptedException {
        this.f4906e.c();
        ((Handler) ea.a.e(this.f4904c)).obtainMessage(2).sendToTarget();
        this.f4906e.a();
    }

    private static void c(m8.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f34270f;
        cryptoInfo.numBytesOfClearData = e(cVar.f34268d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f34269e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) ea.a.e(d(cVar.f34266b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) ea.a.e(d(cVar.f34265a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f34267c;
        if (n0.f29709a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f34271g, cVar.f34272h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        int i10 = message.what;
        b bVar = null;
        if (i10 == 0) {
            bVar = (b) message.obj;
            g(bVar.f4909a, bVar.f4910b, bVar.f4911c, bVar.f4913e, bVar.f4914f);
        } else if (i10 == 1) {
            bVar = (b) message.obj;
            h(bVar.f4909a, bVar.f4910b, bVar.f4912d, bVar.f4913e, bVar.f4914f);
        } else if (i10 != 2) {
            this.f4905d.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        } else {
            this.f4906e.e();
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    private void g(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f4902a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            this.f4905d.compareAndSet(null, e10);
        }
    }

    private void h(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f4901h) {
                this.f4902a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            this.f4905d.compareAndSet(null, e10);
        }
    }

    private void j() throws InterruptedException {
        ((Handler) ea.a.e(this.f4904c)).removeCallbacksAndMessages(null);
        b();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f4900g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private void l() {
        RuntimeException andSet = this.f4905d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private static void o(b bVar) {
        ArrayDeque<b> arrayDeque = f4900g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f4907f) {
            try {
                j();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void m(int i10, int i11, int i12, long j10, int i13) {
        l();
        b k10 = k();
        k10.a(i10, i11, i12, j10, i13);
        ((Handler) n0.j(this.f4904c)).obtainMessage(0, k10).sendToTarget();
    }

    public void n(int i10, int i11, m8.c cVar, long j10, int i12) {
        l();
        b k10 = k();
        k10.a(i10, i11, 0, j10, i12);
        c(cVar, k10.f4912d);
        ((Handler) n0.j(this.f4904c)).obtainMessage(1, k10).sendToTarget();
    }

    public void p() {
        if (this.f4907f) {
            i();
            this.f4903b.quit();
        }
        this.f4907f = false;
    }

    public void q() {
        if (this.f4907f) {
            return;
        }
        this.f4903b.start();
        this.f4904c = new a(this.f4903b.getLooper());
        this.f4907f = true;
    }

    public void r() throws InterruptedException {
        b();
    }

    e(MediaCodec mediaCodec, HandlerThread handlerThread, ea.f fVar) {
        this.f4902a = mediaCodec;
        this.f4903b = handlerThread;
        this.f4906e = fVar;
        this.f4905d = new AtomicReference<>();
    }
}
