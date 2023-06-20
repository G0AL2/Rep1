package ye;

import com.applovin.sdk.AppLovinEventTypes;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import ye.x;

/* compiled from: RequestBody.kt */
/* loaded from: classes3.dex */
public abstract class c0 {
    public static final a Companion = new a(null);

    /* compiled from: RequestBody.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: RequestBody.kt */
        /* renamed from: ye.c0$a$a */
        /* loaded from: classes3.dex */
        public static final class C0552a extends c0 {

            /* renamed from: a */
            final /* synthetic */ File f39591a;

            /* renamed from: b */
            final /* synthetic */ x f39592b;

            C0552a(File file, x xVar) {
                this.f39591a = file;
                this.f39592b = xVar;
            }

            @Override // ye.c0
            public long contentLength() {
                return this.f39591a.length();
            }

            @Override // ye.c0
            public x contentType() {
                return this.f39592b;
            }

            @Override // ye.c0
            public void writeTo(mf.g gVar) {
                qe.k.f(gVar, "sink");
                mf.e0 j10 = mf.r.j(this.f39591a);
                try {
                    gVar.t(j10);
                    ne.a.a(j10, null);
                } finally {
                }
            }
        }

        /* compiled from: RequestBody.kt */
        /* loaded from: classes3.dex */
        public static final class b extends c0 {

            /* renamed from: a */
            final /* synthetic */ mf.i f39593a;

            /* renamed from: b */
            final /* synthetic */ x f39594b;

            b(mf.i iVar, x xVar) {
                this.f39593a = iVar;
                this.f39594b = xVar;
            }

            @Override // ye.c0
            public long contentLength() {
                return this.f39593a.A();
            }

            @Override // ye.c0
            public x contentType() {
                return this.f39594b;
            }

            @Override // ye.c0
            public void writeTo(mf.g gVar) {
                qe.k.f(gVar, "sink");
                gVar.Y(this.f39593a);
            }
        }

        /* compiled from: RequestBody.kt */
        /* loaded from: classes3.dex */
        public static final class c extends c0 {

            /* renamed from: a */
            final /* synthetic */ byte[] f39595a;

            /* renamed from: b */
            final /* synthetic */ x f39596b;

            /* renamed from: c */
            final /* synthetic */ int f39597c;

            /* renamed from: d */
            final /* synthetic */ int f39598d;

            c(byte[] bArr, x xVar, int i10, int i11) {
                this.f39595a = bArr;
                this.f39596b = xVar;
                this.f39597c = i10;
                this.f39598d = i11;
            }

            @Override // ye.c0
            public long contentLength() {
                return this.f39597c;
            }

            @Override // ye.c0
            public x contentType() {
                return this.f39596b;
            }

            @Override // ye.c0
            public void writeTo(mf.g gVar) {
                qe.k.f(gVar, "sink");
                gVar.write(this.f39595a, this.f39598d, this.f39597c);
            }
        }

        private a() {
        }

        public static /* synthetic */ c0 i(a aVar, String str, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.b(str, xVar);
        }

        public static /* synthetic */ c0 j(a aVar, x xVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return aVar.g(xVar, bArr, i10, i11);
        }

        public static /* synthetic */ c0 k(a aVar, byte[] bArr, x xVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                xVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.h(bArr, xVar, i10, i11);
        }

        public final c0 a(File file, x xVar) {
            qe.k.f(file, "$this$asRequestBody");
            return new C0552a(file, xVar);
        }

        public final c0 b(String str, x xVar) {
            qe.k.f(str, "$this$toRequestBody");
            Charset charset = ve.d.f38080b;
            if (xVar != null) {
                Charset d10 = x.d(xVar, null, 1, null);
                if (d10 == null) {
                    x.a aVar = x.f39779f;
                    xVar = aVar.b(xVar + "; charset=utf-8");
                } else {
                    charset = d10;
                }
            }
            byte[] bytes = str.getBytes(charset);
            qe.k.e(bytes, "(this as java.lang.String).getBytes(charset)");
            return h(bytes, xVar, 0, bytes.length);
        }

        public final c0 c(mf.i iVar, x xVar) {
            qe.k.f(iVar, "$this$toRequestBody");
            return new b(iVar, xVar);
        }

        public final c0 d(x xVar, File file) {
            qe.k.f(file, "file");
            return a(file, xVar);
        }

        public final c0 e(x xVar, String str) {
            qe.k.f(str, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return b(str, xVar);
        }

        public final c0 f(x xVar, mf.i iVar) {
            qe.k.f(iVar, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return c(iVar, xVar);
        }

        public final c0 g(x xVar, byte[] bArr, int i10, int i11) {
            qe.k.f(bArr, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return h(bArr, xVar, i10, i11);
        }

        public final c0 h(byte[] bArr, x xVar, int i10, int i11) {
            qe.k.f(bArr, "$this$toRequestBody");
            ze.c.i(bArr.length, i10, i11);
            return new c(bArr, xVar, i11, i10);
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    public static final c0 create(File file, x xVar) {
        return Companion.a(file, xVar);
    }

    public static final c0 create(String str, x xVar) {
        return Companion.b(str, xVar);
    }

    public static final c0 create(mf.i iVar, x xVar) {
        return Companion.c(iVar, xVar);
    }

    public static final c0 create(x xVar, File file) {
        return Companion.d(xVar, file);
    }

    public static final c0 create(x xVar, String str) {
        return Companion.e(xVar, str);
    }

    public static final c0 create(x xVar, mf.i iVar) {
        return Companion.f(xVar, iVar);
    }

    public static final c0 create(x xVar, byte[] bArr) {
        return a.j(Companion, xVar, bArr, 0, 0, 12, null);
    }

    public static final c0 create(x xVar, byte[] bArr, int i10) {
        return a.j(Companion, xVar, bArr, i10, 0, 8, null);
    }

    public static final c0 create(x xVar, byte[] bArr, int i10, int i11) {
        return Companion.g(xVar, bArr, i10, i11);
    }

    public static final c0 create(byte[] bArr) {
        return a.k(Companion, bArr, null, 0, 0, 7, null);
    }

    public static final c0 create(byte[] bArr, x xVar) {
        return a.k(Companion, bArr, xVar, 0, 0, 6, null);
    }

    public static final c0 create(byte[] bArr, x xVar, int i10) {
        return a.k(Companion, bArr, xVar, i10, 0, 4, null);
    }

    public static final c0 create(byte[] bArr, x xVar, int i10, int i11) {
        return Companion.h(bArr, xVar, i10, i11);
    }

    public abstract long contentLength() throws IOException;

    public abstract x contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(mf.g gVar) throws IOException;
}
