package ye;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ye.x;

/* compiled from: MultipartBody.kt */
/* loaded from: classes3.dex */
public final class y extends c0 {

    /* renamed from: f  reason: collision with root package name */
    public static final x f39783f;

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f39784g;

    /* renamed from: h  reason: collision with root package name */
    private static final byte[] f39785h;

    /* renamed from: i  reason: collision with root package name */
    private static final byte[] f39786i;

    /* renamed from: a  reason: collision with root package name */
    private final x f39787a;

    /* renamed from: b  reason: collision with root package name */
    private long f39788b;

    /* renamed from: c  reason: collision with root package name */
    private final mf.i f39789c;

    /* renamed from: d  reason: collision with root package name */
    private final x f39790d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f39791e;

    /* compiled from: MultipartBody.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    /* compiled from: MultipartBody.kt */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        public static final a f39795c = new a(null);

        /* renamed from: a  reason: collision with root package name */
        private final t f39796a;

        /* renamed from: b  reason: collision with root package name */
        private final c0 f39797b;

        /* compiled from: MultipartBody.kt */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public final c a(t tVar, c0 c0Var) {
                qe.k.f(c0Var, "body");
                if ((tVar != null ? tVar.a("Content-Type") : null) == null) {
                    if ((tVar != null ? tVar.a("Content-Length") : null) == null) {
                        return new c(tVar, c0Var, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            public /* synthetic */ a(qe.g gVar) {
                this();
            }
        }

        private c(t tVar, c0 c0Var) {
            this.f39796a = tVar;
            this.f39797b = c0Var;
        }

        public final c0 a() {
            return this.f39797b;
        }

        public final t b() {
            return this.f39796a;
        }

        public /* synthetic */ c(t tVar, c0 c0Var, qe.g gVar) {
            this(tVar, c0Var);
        }
    }

    static {
        new b(null);
        x.a aVar = x.f39779f;
        f39783f = aVar.a("multipart/mixed");
        aVar.a("multipart/alternative");
        aVar.a("multipart/digest");
        aVar.a("multipart/parallel");
        aVar.a("multipart/form-data");
        f39784g = new byte[]{(byte) 58, (byte) 32};
        f39785h = new byte[]{(byte) 13, (byte) 10};
        byte b10 = (byte) 45;
        f39786i = new byte[]{b10, b10};
    }

    public y(mf.i iVar, x xVar, List<c> list) {
        qe.k.f(iVar, "boundaryByteString");
        qe.k.f(xVar, "type");
        qe.k.f(list, "parts");
        this.f39789c = iVar;
        this.f39790d = xVar;
        this.f39791e = list;
        x.a aVar = x.f39779f;
        this.f39787a = aVar.a(xVar + "; boundary=" + a());
        this.f39788b = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long b(mf.g gVar, boolean z10) throws IOException {
        mf.f fVar;
        if (z10) {
            gVar = new mf.f();
            fVar = gVar;
        } else {
            fVar = 0;
        }
        int size = this.f39791e.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.f39791e.get(i10);
            t b10 = cVar.b();
            c0 a10 = cVar.a();
            qe.k.c(gVar);
            gVar.write(f39786i);
            gVar.Y(this.f39789c);
            gVar.write(f39785h);
            if (b10 != null) {
                int size2 = b10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    gVar.M(b10.c(i11)).write(f39784g).M(b10.h(i11)).write(f39785h);
                }
            }
            x contentType = a10.contentType();
            if (contentType != null) {
                gVar.M("Content-Type: ").M(contentType.toString()).write(f39785h);
            }
            long contentLength = a10.contentLength();
            if (contentLength != -1) {
                gVar.M("Content-Length: ").k0(contentLength).write(f39785h);
            } else if (z10) {
                qe.k.c(fVar);
                fVar.b();
                return -1L;
            }
            byte[] bArr = f39785h;
            gVar.write(bArr);
            if (z10) {
                j10 += contentLength;
            } else {
                a10.writeTo(gVar);
            }
            gVar.write(bArr);
        }
        qe.k.c(gVar);
        byte[] bArr2 = f39786i;
        gVar.write(bArr2);
        gVar.Y(this.f39789c);
        gVar.write(bArr2);
        gVar.write(f39785h);
        if (z10) {
            qe.k.c(fVar);
            long C0 = j10 + fVar.C0();
            fVar.b();
            return C0;
        }
        return j10;
    }

    public final String a() {
        return this.f39789c.E();
    }

    @Override // ye.c0
    public long contentLength() throws IOException {
        long j10 = this.f39788b;
        if (j10 == -1) {
            long b10 = b(null, true);
            this.f39788b = b10;
            return b10;
        }
        return j10;
    }

    @Override // ye.c0
    public x contentType() {
        return this.f39787a;
    }

    @Override // ye.c0
    public void writeTo(mf.g gVar) throws IOException {
        qe.k.f(gVar, "sink");
        b(gVar, false);
    }

    /* compiled from: MultipartBody.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final mf.i f39792a;

        /* renamed from: b  reason: collision with root package name */
        private x f39793b;

        /* renamed from: c  reason: collision with root package name */
        private final List<c> f39794c;

        public a() {
            this(null, 1, null);
        }

        public a(String str) {
            qe.k.f(str, "boundary");
            this.f39792a = mf.i.f34462e.d(str);
            this.f39793b = y.f39783f;
            this.f39794c = new ArrayList();
        }

        public final a a(t tVar, c0 c0Var) {
            qe.k.f(c0Var, "body");
            b(c.f39795c.a(tVar, c0Var));
            return this;
        }

        public final a b(c cVar) {
            qe.k.f(cVar, "part");
            this.f39794c.add(cVar);
            return this;
        }

        public final y c() {
            if (!this.f39794c.isEmpty()) {
                return new y(this.f39792a, this.f39793b, ze.c.R(this.f39794c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final a d(x xVar) {
            qe.k.f(xVar, "type");
            if (qe.k.a(xVar.g(), "multipart")) {
                this.f39793b = xVar;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + xVar).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ a(java.lang.String r1, int r2, qe.g r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "UUID.randomUUID().toString()"
                qe.k.e(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ye.y.a.<init>(java.lang.String, int, qe.g):void");
        }
    }
}
