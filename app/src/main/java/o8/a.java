package o8;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import da.a0;
import da.g;
import da.m0;
import da.p;
import ea.n0;
import ib.m;
import j8.m1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ye.b0;
import ye.c0;
import ye.d;
import ye.d0;
import ye.e;
import ye.e0;
import ye.u;
import ye.x;

/* compiled from: OkHttpDataSource.java */
/* loaded from: classes2.dex */
public class a extends g implements a0 {

    /* renamed from: e  reason: collision with root package name */
    private final e.a f35018e;

    /* renamed from: f  reason: collision with root package name */
    private final a0.f f35019f;

    /* renamed from: g  reason: collision with root package name */
    private final String f35020g;

    /* renamed from: h  reason: collision with root package name */
    private final d f35021h;

    /* renamed from: i  reason: collision with root package name */
    private final a0.f f35022i;

    /* renamed from: j  reason: collision with root package name */
    private m<String> f35023j;

    /* renamed from: k  reason: collision with root package name */
    private p f35024k;

    /* renamed from: l  reason: collision with root package name */
    private d0 f35025l;

    /* renamed from: m  reason: collision with root package name */
    private InputStream f35026m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f35027n;

    /* renamed from: o  reason: collision with root package name */
    private long f35028o;

    /* renamed from: p  reason: collision with root package name */
    private long f35029p;

    /* compiled from: OkHttpDataSource.java */
    /* loaded from: classes2.dex */
    public static final class b implements a0.b {

        /* renamed from: a  reason: collision with root package name */
        private final a0.f f35030a = new a0.f();

        /* renamed from: b  reason: collision with root package name */
        private final e.a f35031b;

        /* renamed from: c  reason: collision with root package name */
        private String f35032c;

        /* renamed from: d  reason: collision with root package name */
        private m0 f35033d;

        /* renamed from: e  reason: collision with root package name */
        private d f35034e;

        /* renamed from: f  reason: collision with root package name */
        private m<String> f35035f;

        public b(e.a aVar) {
            this.f35031b = aVar;
        }

        @Override // da.l.a
        /* renamed from: b */
        public a a() {
            a aVar = new a(this.f35031b, this.f35032c, this.f35034e, this.f35030a, this.f35035f);
            m0 m0Var = this.f35033d;
            if (m0Var != null) {
                aVar.l(m0Var);
            }
            return aVar;
        }

        public final b c(Map<String, String> map) {
            this.f35030a.a(map);
            return this;
        }

        public b d(m0 m0Var) {
            this.f35033d = m0Var;
            return this;
        }

        public b e(String str) {
            this.f35032c = str;
            return this;
        }
    }

    static {
        m1.a("goog.exo.okhttp");
    }

    private void u() {
        d0 d0Var = this.f35025l;
        if (d0Var != null) {
            ((e0) ea.a.e(d0Var.a())).close();
            this.f35025l = null;
        }
        this.f35026m = null;
    }

    private b0 v(p pVar) throws a0.c {
        long j10 = pVar.f29232f;
        long j11 = pVar.f29233g;
        u l10 = u.l(pVar.f29227a.toString());
        if (l10 != null) {
            b0.a n10 = new b0.a().n(l10);
            d dVar = this.f35021h;
            if (dVar != null) {
                n10.c(dVar);
            }
            HashMap hashMap = new HashMap();
            a0.f fVar = this.f35022i;
            if (fVar != null) {
                hashMap.putAll(fVar.b());
            }
            hashMap.putAll(this.f35019f.b());
            hashMap.putAll(pVar.f29231e);
            for (Map.Entry entry : hashMap.entrySet()) {
                n10.e((String) entry.getKey(), (String) entry.getValue());
            }
            String a10 = da.b0.a(j10, j11);
            if (a10 != null) {
                n10.a("Range", a10);
            }
            String str = this.f35020g;
            if (str != null) {
                n10.a("User-Agent", str);
            }
            if (!pVar.d(1)) {
                n10.a("Accept-Encoding", "identity");
            }
            byte[] bArr = pVar.f29230d;
            c0 c0Var = null;
            if (bArr != null) {
                c0Var = c0.create((x) null, bArr);
            } else if (pVar.f29229c == 2) {
                c0Var = c0.create((x) null, n0.f29714f);
            }
            n10.g(pVar.b(), c0Var);
            return n10.b();
        }
        throw new a0.c("Malformed URL", pVar, (int) IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL, 1);
    }

    private int w(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f35028o;
        if (j10 != -1) {
            long j11 = j10 - this.f35029p;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = ((InputStream) n0.j(this.f35026m)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f35029p += read;
        q(read);
        return read;
    }

    private void x(long j10, p pVar) throws a0.c {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            try {
                int read = ((InputStream) n0.j(this.f35026m)).read(bArr, 0, (int) Math.min(j10, 4096));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read != -1) {
                    j10 -= read;
                    q(read);
                } else {
                    throw new a0.c(pVar, AdError.REMOTE_ADS_SERVICE_ERROR, 1);
                }
            } catch (IOException e10) {
                if (e10 instanceof a0.c) {
                    throw ((a0.c) e10);
                }
                throw new a0.c(pVar, 2000, 1);
            }
        }
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws a0.c {
        try {
            return w(bArr, i10, i11);
        } catch (IOException e10) {
            throw a0.c.c(e10, (p) n0.j(this.f35024k), 2);
        }
    }

    @Override // da.l
    public void close() {
        if (this.f35027n) {
            this.f35027n = false;
            r();
            u();
        }
    }

    @Override // da.g, da.l
    public Map<String, List<String>> e() {
        d0 d0Var = this.f35025l;
        return d0Var == null ? Collections.emptyMap() : d0Var.A().g();
    }

    @Override // da.l
    public long g(p pVar) throws a0.c {
        byte[] bArr;
        this.f35024k = pVar;
        long j10 = 0;
        this.f35029p = 0L;
        this.f35028o = 0L;
        s(pVar);
        try {
            d0 h10 = this.f35018e.a(v(pVar)).h();
            this.f35025l = h10;
            e0 e0Var = (e0) ea.a.e(h10.a());
            this.f35026m = e0Var.a();
            int h11 = h10.h();
            if (!h10.c0()) {
                if (h11 == 416) {
                    if (pVar.f29232f == da.b0.c(h10.A().a("Content-Range"))) {
                        this.f35027n = true;
                        t(pVar);
                        long j11 = pVar.f29233g;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                try {
                    bArr = n0.V0((InputStream) ea.a.e(this.f35026m));
                } catch (IOException unused) {
                    bArr = n0.f29714f;
                }
                byte[] bArr2 = bArr;
                Map<String, List<String>> g10 = h10.A().g();
                u();
                throw new a0.e(h11, h10.C(), h11 == 416 ? new da.m(AdError.REMOTE_ADS_SERVICE_ERROR) : null, g10, pVar, bArr2);
            }
            x h12 = e0Var.h();
            String xVar = h12 != null ? h12.toString() : "";
            m<String> mVar = this.f35023j;
            if (mVar != null && !mVar.apply(xVar)) {
                u();
                throw new a0.d(xVar, pVar);
            }
            if (h11 == 200) {
                long j12 = pVar.f29232f;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            long j13 = pVar.f29233g;
            if (j13 != -1) {
                this.f35028o = j13;
            } else {
                long e10 = e0Var.e();
                this.f35028o = e10 != -1 ? e10 - j10 : -1L;
            }
            this.f35027n = true;
            t(pVar);
            try {
                x(j10, pVar);
                return this.f35028o;
            } catch (a0.c e11) {
                u();
                throw e11;
            }
        } catch (IOException e12) {
            throw a0.c.c(e12, pVar, 1);
        }
    }

    @Override // da.l
    public Uri o() {
        d0 d0Var = this.f35025l;
        if (d0Var == null) {
            return null;
        }
        return Uri.parse(d0Var.d0().l().toString());
    }

    private a(e.a aVar, String str, d dVar, a0.f fVar, m<String> mVar) {
        super(true);
        this.f35018e = (e.a) ea.a.e(aVar);
        this.f35020g = str;
        this.f35021h = dVar;
        this.f35022i = fVar;
        this.f35023j = mVar;
        this.f35019f = new a0.f();
    }
}
