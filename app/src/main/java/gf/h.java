package gf;

import com.google.android.gms.common.api.Api;
import gf.d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mf.e0;
import mf.f0;

/* compiled from: Http2Reader.kt */
/* loaded from: classes3.dex */
public final class h implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f30992e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f30993f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final b f30994a;

    /* renamed from: b  reason: collision with root package name */
    private final d.a f30995b;

    /* renamed from: c  reason: collision with root package name */
    private final mf.h f30996c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f30997d;

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final Logger a() {
            return h.f30992e;
        }

        public final int b(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes3.dex */
    public static final class b implements e0 {

        /* renamed from: a  reason: collision with root package name */
        private int f30998a;

        /* renamed from: b  reason: collision with root package name */
        private int f30999b;

        /* renamed from: c  reason: collision with root package name */
        private int f31000c;

        /* renamed from: d  reason: collision with root package name */
        private int f31001d;

        /* renamed from: e  reason: collision with root package name */
        private int f31002e;

        /* renamed from: f  reason: collision with root package name */
        private final mf.h f31003f;

        public b(mf.h hVar) {
            qe.k.f(hVar, "source");
            this.f31003f = hVar;
        }

        private final void b() throws IOException {
            int i10 = this.f31000c;
            int H = ze.c.H(this.f31003f);
            this.f31001d = H;
            this.f30998a = H;
            int b10 = ze.c.b(this.f31003f.readByte(), 255);
            this.f30999b = ze.c.b(this.f31003f.readByte(), 255);
            a aVar = h.f30993f;
            if (aVar.a().isLoggable(Level.FINE)) {
                aVar.a().fine(e.f30909e.c(true, this.f31000c, this.f30998a, b10, this.f30999b));
            }
            int readInt = this.f31003f.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f31000c = readInt;
            if (b10 == 9) {
                if (readInt != i10) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
                return;
            }
            throw new IOException(b10 + " != TYPE_CONTINUATION");
        }

        public final int a() {
            return this.f31001d;
        }

        @Override // mf.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        public final void d(int i10) {
            this.f30999b = i10;
        }

        public final void e(int i10) {
            this.f31001d = i10;
        }

        @Override // mf.e0
        public long e0(mf.f fVar, long j10) throws IOException {
            qe.k.f(fVar, "sink");
            while (true) {
                int i10 = this.f31001d;
                if (i10 == 0) {
                    this.f31003f.O0(this.f31002e);
                    this.f31002e = 0;
                    if ((this.f30999b & 4) != 0) {
                        return -1L;
                    }
                    b();
                } else {
                    long e02 = this.f31003f.e0(fVar, Math.min(j10, i10));
                    if (e02 == -1) {
                        return -1L;
                    }
                    this.f31001d -= (int) e02;
                    return e02;
                }
            }
        }

        public final void h(int i10) {
            this.f30998a = i10;
        }

        @Override // mf.e0
        public f0 k() {
            return this.f31003f.k();
        }

        public final void l(int i10) {
            this.f31002e = i10;
        }

        public final void q(int i10) {
            this.f31000c = i10;
        }
    }

    /* compiled from: Http2Reader.kt */
    /* loaded from: classes3.dex */
    public interface c {
        void a(boolean z10, int i10, int i11, List<gf.c> list);

        void c(int i10, long j10);

        void d(int i10, int i11, List<gf.c> list) throws IOException;

        void e();

        void f(boolean z10, m mVar);

        void g(boolean z10, int i10, mf.h hVar, int i11) throws IOException;

        void i(int i10, gf.b bVar, mf.i iVar);

        void j(boolean z10, int i10, int i11);

        void k(int i10, int i11, int i12, boolean z10);

        void l(int i10, gf.b bVar);
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        qe.k.e(logger, "Logger.getLogger(Http2::class.java.name)");
        f30992e = logger;
    }

    public h(mf.h hVar, boolean z10) {
        qe.k.f(hVar, "source");
        this.f30996c = hVar;
        this.f30997d = z10;
        b bVar = new b(hVar);
        this.f30994a = bVar;
        this.f30995b = new d.a(bVar, 4096, 0, 4, null);
    }

    private final void A(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 != 0) {
            int b10 = (i11 & 8) != 0 ? ze.c.b(this.f30996c.readByte(), 255) : 0;
            cVar.d(i12, this.f30996c.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, l(f30993f.b(i10 - 4, i11, b10), b10, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }

    private final void C(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i10 + " != 4");
        } else if (i12 != 0) {
            int readInt = this.f30996c.readInt();
            gf.b a10 = gf.b.f30873i.a(readInt);
            if (a10 != null) {
                cVar.l(i12, a10);
                return;
            }
            throw new IOException("TYPE_RST_STREAM unexpected error code: " + readInt);
        } else {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        throw new java.io.IOException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: " + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void L(gf.h.c r8, int r9, int r10, int r11) throws java.io.IOException {
        /*
            r7 = this;
            if (r11 != 0) goto Lb8
            r11 = 1
            r10 = r10 & r11
            if (r10 == 0) goto L14
            if (r9 != 0) goto Lc
            r8.e()
            return
        Lc:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r8.<init>(r9)
            throw r8
        L14:
            int r10 = r9 % 6
            if (r10 != 0) goto La1
            gf.m r10 = new gf.m
            r10.<init>()
            r0 = 0
            se.c r9 = se.d.i(r0, r9)
            r1 = 6
            se.a r9 = se.d.h(r9, r1)
            int r1 = r9.e()
            int r2 = r9.f()
            int r9 = r9.g()
            if (r9 < 0) goto L38
            if (r1 > r2) goto L9d
            goto L3a
        L38:
            if (r1 < r2) goto L9d
        L3a:
            mf.h r3 = r7.f30996c
            short r3 = r3.readShort()
            r4 = 65535(0xffff, float:9.1834E-41)
            int r3 = ze.c.c(r3, r4)
            mf.h r4 = r7.f30996c
            int r4 = r4.readInt()
            r5 = 2
            r6 = 4
            if (r3 == r5) goto L89
            r5 = 3
            if (r3 == r5) goto L87
            if (r3 == r6) goto L7b
            r5 = 5
            if (r3 == r5) goto L5a
            goto L96
        L5a:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L64
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L64
            goto L96
        L64:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L7b:
            r3 = 7
            if (r4 < 0) goto L7f
            goto L96
        L7f:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r8.<init>(r9)
            throw r8
        L87:
            r3 = 4
            goto L96
        L89:
            if (r4 == 0) goto L96
            if (r4 != r11) goto L8e
            goto L96
        L8e:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r8.<init>(r9)
            throw r8
        L96:
            r10.h(r3, r4)
            if (r1 == r2) goto L9d
            int r1 = r1 + r9
            goto L3a
        L9d:
            r8.f(r0, r10)
            return
        La1:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "TYPE_SETTINGS length % 6 != 0: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        Lb8:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "TYPE_SETTINGS streamId != 0"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.h.L(gf.h$c, int, int, int):void");
    }

    private final void O(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 4) {
            long d10 = ze.c.d(this.f30996c.readInt(), 2147483647L);
            if (d10 != 0) {
                cVar.c(i12, d10);
                return;
            }
            throw new IOException("windowSizeIncrement was 0");
        }
        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i10);
    }

    private final void e(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z10 = (i11 & 1) != 0;
        if (!((i11 & 32) != 0)) {
            int b10 = (i11 & 8) != 0 ? ze.c.b(this.f30996c.readByte(), 255) : 0;
            cVar.g(z10, i12, this.f30996c, f30993f.b(i10, i11, b10));
            this.f30996c.O0(b10);
            return;
        }
        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
    }

    private final void h(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 < 8) {
            throw new IOException("TYPE_GOAWAY length < 8: " + i10);
        } else if (i12 == 0) {
            int readInt = this.f30996c.readInt();
            int readInt2 = this.f30996c.readInt();
            int i13 = i10 - 8;
            gf.b a10 = gf.b.f30873i.a(readInt2);
            if (a10 != null) {
                mf.i iVar = mf.i.f34461d;
                if (i13 > 0) {
                    iVar = this.f30996c.o0(i13);
                }
                cVar.i(readInt, a10, iVar);
                return;
            }
            throw new IOException("TYPE_GOAWAY unexpected error code: " + readInt2);
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    private final List<gf.c> l(int i10, int i11, int i12, int i13) throws IOException {
        this.f30994a.e(i10);
        b bVar = this.f30994a;
        bVar.h(bVar.a());
        this.f30994a.l(i11);
        this.f30994a.d(i12);
        this.f30994a.q(i13);
        this.f30995b.k();
        return this.f30995b.e();
    }

    private final void q(c cVar, int i10, int i11, int i12) throws IOException {
        if (i12 != 0) {
            boolean z10 = (i11 & 1) != 0;
            int b10 = (i11 & 8) != 0 ? ze.c.b(this.f30996c.readByte(), 255) : 0;
            if ((i11 & 32) != 0) {
                y(cVar, i12);
                i10 -= 5;
            }
            cVar.a(z10, i12, -1, l(f30993f.b(i10, i11, b10), b10, i11, i12));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    private final void w(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException("TYPE_PING length != 8: " + i10);
        } else if (i12 == 0) {
            cVar.j((i11 & 1) != 0, this.f30996c.readInt(), this.f30996c.readInt());
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    private final void y(c cVar, int i10) throws IOException {
        int readInt = this.f30996c.readInt();
        cVar.k(i10, readInt & Api.BaseClientBuilder.API_PRIORITY_OTHER, ze.c.b(this.f30996c.readByte(), 255) + 1, (readInt & ((int) 2147483648L)) != 0);
    }

    private final void z(c cVar, int i10, int i11, int i12) throws IOException {
        if (i10 == 5) {
            if (i12 != 0) {
                y(cVar, i12);
                return;
            }
            throw new IOException("TYPE_PRIORITY streamId == 0");
        }
        throw new IOException("TYPE_PRIORITY length: " + i10 + " != 5");
    }

    public final boolean b(boolean z10, c cVar) throws IOException {
        qe.k.f(cVar, "handler");
        try {
            this.f30996c.j0(9L);
            int H = ze.c.H(this.f30996c);
            if (H <= 16384) {
                int b10 = ze.c.b(this.f30996c.readByte(), 255);
                int b11 = ze.c.b(this.f30996c.readByte(), 255);
                int readInt = this.f30996c.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                Logger logger = f30992e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(e.f30909e.c(true, readInt, H, b10, b11));
                }
                if (z10 && b10 != 4) {
                    throw new IOException("Expected a SETTINGS frame but was " + e.f30909e.b(b10));
                }
                switch (b10) {
                    case 0:
                        e(cVar, H, b11, readInt);
                        return true;
                    case 1:
                        q(cVar, H, b11, readInt);
                        return true;
                    case 2:
                        z(cVar, H, b11, readInt);
                        return true;
                    case 3:
                        C(cVar, H, b11, readInt);
                        return true;
                    case 4:
                        L(cVar, H, b11, readInt);
                        return true;
                    case 5:
                        A(cVar, H, b11, readInt);
                        return true;
                    case 6:
                        w(cVar, H, b11, readInt);
                        return true;
                    case 7:
                        h(cVar, H, b11, readInt);
                        return true;
                    case 8:
                        O(cVar, H, b11, readInt);
                        return true;
                    default:
                        this.f30996c.O0(H);
                        return true;
                }
            }
            throw new IOException("FRAME_SIZE_ERROR: " + H);
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30996c.close();
    }

    public final void d(c cVar) throws IOException {
        qe.k.f(cVar, "handler");
        if (this.f30997d) {
            if (!b(true, cVar)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        mf.h hVar = this.f30996c;
        mf.i iVar = e.f30905a;
        mf.i o02 = hVar.o0(iVar.A());
        Logger logger = f30992e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(ze.c.q("<< CONNECTION " + o02.p(), new Object[0]));
        }
        if (!qe.k.a(iVar, o02)) {
            throw new IOException("Expected a connection header but was " + o02.E());
        }
    }
}
