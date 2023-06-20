package ye;

import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: ResponseBody.kt */
/* loaded from: classes3.dex */
public abstract class e0 implements Closeable {

    /* renamed from: a */
    public static final a f39649a = new a(null);

    /* compiled from: ResponseBody.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: ResponseBody.kt */
        /* renamed from: ye.e0$a$a */
        /* loaded from: classes3.dex */
        public static final class C0553a extends e0 {

            /* renamed from: b */
            final /* synthetic */ mf.h f39650b;

            /* renamed from: c */
            final /* synthetic */ x f39651c;

            /* renamed from: d */
            final /* synthetic */ long f39652d;

            C0553a(mf.h hVar, x xVar, long j10) {
                this.f39650b = hVar;
                this.f39651c = xVar;
                this.f39652d = j10;
            }

            @Override // ye.e0
            public long e() {
                return this.f39652d;
            }

            @Override // ye.e0
            public x h() {
                return this.f39651c;
            }

            @Override // ye.e0
            public mf.h q() {
                return this.f39650b;
            }
        }

        private a() {
        }

        public static /* synthetic */ e0 d(a aVar, byte[] bArr, x xVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                xVar = null;
            }
            return aVar.c(bArr, xVar);
        }

        public final e0 a(mf.h hVar, x xVar, long j10) {
            qe.k.f(hVar, "$this$asResponseBody");
            return new C0553a(hVar, xVar, j10);
        }

        public final e0 b(x xVar, long j10, mf.h hVar) {
            qe.k.f(hVar, AppLovinEventTypes.USER_VIEWED_CONTENT);
            return a(hVar, xVar, j10);
        }

        public final e0 c(byte[] bArr, x xVar) {
            qe.k.f(bArr, "$this$toResponseBody");
            return a(new mf.f().write(bArr), xVar, bArr.length);
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    private final Charset d() {
        Charset c10;
        x h10 = h();
        return (h10 == null || (c10 = h10.c(ve.d.f38080b)) == null) ? ve.d.f38080b : c10;
    }

    public static final e0 l(x xVar, long j10, mf.h hVar) {
        return f39649a.b(xVar, j10, hVar);
    }

    public final InputStream a() {
        return q().h1();
    }

    public final byte[] b() throws IOException {
        long e10 = e();
        if (e10 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
            mf.h q10 = q();
            try {
                byte[] u02 = q10.u0();
                ne.a.a(q10, null);
                int length = u02.length;
                if (e10 == -1 || e10 == length) {
                    return u02;
                }
                throw new IOException("Content-Length (" + e10 + ") and stream length (" + length + ") disagree");
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ze.c.j(q());
    }

    public abstract long e();

    public abstract x h();

    public abstract mf.h q();

    public final String w() throws IOException {
        mf.h q10 = q();
        try {
            String J0 = q10.J0(ze.c.G(q10, d()));
            ne.a.a(q10, null);
            return J0;
        } finally {
        }
    }
}
