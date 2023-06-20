package b9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import j8.p1;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: MediaCodecAdapter.java */
/* loaded from: classes2.dex */
public interface l {

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f4944a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f4945b;

        /* renamed from: c  reason: collision with root package name */
        public final p1 f4946c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f4947d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f4948e;

        /* renamed from: f  reason: collision with root package name */
        public final int f4949f;

        private a(n nVar, MediaFormat mediaFormat, p1 p1Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f4944a = nVar;
            this.f4945b = mediaFormat;
            this.f4946c = p1Var;
            this.f4947d = surface;
            this.f4948e = mediaCrypto;
            this.f4949f = i10;
        }

        public static a a(n nVar, MediaFormat mediaFormat, p1 p1Var, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, p1Var, null, mediaCrypto, 0);
        }

        public static a b(n nVar, MediaFormat mediaFormat, p1 p1Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, p1Var, surface, mediaCrypto, 0);
        }
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes2.dex */
    public interface b {
        l a(a aVar) throws IOException;
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(l lVar, long j10, long j11);
    }

    void a(c cVar, Handler handler);

    void b(int i10);

    void c(Surface surface);

    boolean d();

    void e(Bundle bundle);

    void f(int i10, long j10);

    void flush();

    int g();

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    int h(MediaCodec.BufferInfo bufferInfo);

    void i(int i10, int i11, m8.c cVar, long j10, int i12);

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void release();

    void releaseOutputBuffer(int i10, boolean z10);
}
