package ye;

import bf.d;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ImagesContract;
import fe.m0;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import mf.i;
import okhttp3.internal.platform.h;
import ye.b0;
import ye.d0;
import ye.t;

/* compiled from: Cache.kt */
/* loaded from: classes3.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: g  reason: collision with root package name */
    public static final b f39560g = new b(null);

    /* renamed from: a  reason: collision with root package name */
    private final bf.d f39561a;

    /* renamed from: b  reason: collision with root package name */
    private int f39562b;

    /* renamed from: c  reason: collision with root package name */
    private int f39563c;

    /* renamed from: d  reason: collision with root package name */
    private int f39564d;

    /* renamed from: e  reason: collision with root package name */
    private int f39565e;

    /* renamed from: f  reason: collision with root package name */
    private int f39566f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cache.kt */
    /* loaded from: classes3.dex */
    public static final class a extends e0 {

        /* renamed from: b  reason: collision with root package name */
        private final mf.h f39567b;

        /* renamed from: c  reason: collision with root package name */
        private final d.C0096d f39568c;

        /* renamed from: d  reason: collision with root package name */
        private final String f39569d;

        /* renamed from: e  reason: collision with root package name */
        private final String f39570e;

        /* compiled from: Cache.kt */
        /* renamed from: ye.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0550a extends mf.l {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ mf.e0 f39572c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0550a(mf.e0 e0Var, mf.e0 e0Var2) {
                super(e0Var2);
                this.f39572c = e0Var;
            }

            @Override // mf.l, mf.e0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.y().close();
                super.close();
            }
        }

        public a(d.C0096d c0096d, String str, String str2) {
            qe.k.f(c0096d, "snapshot");
            this.f39568c = c0096d;
            this.f39569d = str;
            this.f39570e = str2;
            mf.e0 b10 = c0096d.b(1);
            this.f39567b = mf.r.d(new C0550a(b10, b10));
        }

        @Override // ye.e0
        public long e() {
            String str = this.f39570e;
            if (str != null) {
                return ze.c.T(str, -1L);
            }
            return -1L;
        }

        @Override // ye.e0
        public x h() {
            String str = this.f39569d;
            if (str != null) {
                return x.f39779f.b(str);
            }
            return null;
        }

        @Override // ye.e0
        public mf.h q() {
            return this.f39567b;
        }

        public final d.C0096d y() {
            return this.f39568c;
        }
    }

    /* compiled from: Cache.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        private final Set<String> d(t tVar) {
            Set<String> d10;
            boolean l10;
            List<String> j02;
            CharSequence x02;
            Comparator<String> m10;
            int size = tVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                l10 = ve.p.l("Vary", tVar.c(i10), true);
                if (l10) {
                    String h10 = tVar.h(i10);
                    if (treeSet == null) {
                        m10 = ve.p.m(qe.v.f36113a);
                        treeSet = new TreeSet(m10);
                    }
                    j02 = ve.q.j0(h10, new char[]{','}, false, 0, 6, null);
                    for (String str : j02) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        x02 = ve.q.x0(str);
                        treeSet.add(x02.toString());
                    }
                }
            }
            if (treeSet != null) {
                return treeSet;
            }
            d10 = m0.d();
            return d10;
        }

        private final t e(t tVar, t tVar2) {
            Set<String> d10 = d(tVar2);
            if (d10.isEmpty()) {
                return ze.c.f40520b;
            }
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String c10 = tVar.c(i10);
                if (d10.contains(c10)) {
                    aVar.a(c10, tVar.h(i10));
                }
            }
            return aVar.d();
        }

        public final boolean a(d0 d0Var) {
            qe.k.f(d0Var, "$this$hasVaryAll");
            return d(d0Var.A()).contains("*");
        }

        public final String b(u uVar) {
            qe.k.f(uVar, ImagesContract.URL);
            return mf.i.f34462e.d(uVar.toString()).s().p();
        }

        public final int c(mf.h hVar) throws IOException {
            qe.k.f(hVar, "source");
            try {
                long x02 = hVar.x0();
                String a02 = hVar.a0();
                if (x02 >= 0 && x02 <= ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)) {
                    if (!(a02.length() > 0)) {
                        return (int) x02;
                    }
                }
                throw new IOException("expected an int but was \"" + x02 + a02 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final t f(d0 d0Var) {
            qe.k.f(d0Var, "$this$varyHeaders");
            d0 L = d0Var.L();
            qe.k.c(L);
            return e(L.d0().f(), d0Var.A());
        }

        public final boolean g(d0 d0Var, t tVar, b0 b0Var) {
            qe.k.f(d0Var, "cachedResponse");
            qe.k.f(tVar, "cachedRequest");
            qe.k.f(b0Var, "newRequest");
            Set<String> d10 = d(d0Var.A());
            if ((d10 instanceof Collection) && d10.isEmpty()) {
                return true;
            }
            for (String str : d10) {
                if (!qe.k.a(tVar.i(str), b0Var.e(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    /* compiled from: Cache.kt */
    /* loaded from: classes3.dex */
    private final class d implements bf.b {

        /* renamed from: a  reason: collision with root package name */
        private final mf.c0 f39585a;

        /* renamed from: b  reason: collision with root package name */
        private final mf.c0 f39586b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f39587c;

        /* renamed from: d  reason: collision with root package name */
        private final d.b f39588d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f39589e;

        /* compiled from: Cache.kt */
        /* loaded from: classes3.dex */
        public static final class a extends mf.k {
            a(mf.c0 c0Var) {
                super(c0Var);
            }

            @Override // mf.k, mf.c0, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (d.this.f39589e) {
                    if (d.this.c()) {
                        return;
                    }
                    d.this.d(true);
                    c cVar = d.this.f39589e;
                    cVar.w(cVar.e() + 1);
                    super.close();
                    d.this.f39588d.b();
                }
            }
        }

        public d(c cVar, d.b bVar) {
            qe.k.f(bVar, "editor");
            this.f39589e = cVar;
            this.f39588d = bVar;
            mf.c0 f10 = bVar.f(1);
            this.f39585a = f10;
            this.f39586b = new a(f10);
        }

        @Override // bf.b
        public mf.c0 a() {
            return this.f39586b;
        }

        @Override // bf.b
        public void abort() {
            synchronized (this.f39589e) {
                if (this.f39587c) {
                    return;
                }
                this.f39587c = true;
                c cVar = this.f39589e;
                cVar.q(cVar.d() + 1);
                ze.c.j(this.f39585a);
                try {
                    this.f39588d.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean c() {
            return this.f39587c;
        }

        public final void d(boolean z10) {
            this.f39587c = z10;
        }
    }

    public c(File file, long j10, hf.a aVar) {
        qe.k.f(file, "directory");
        qe.k.f(aVar, "fileSystem");
        this.f39561a = new bf.d(aVar, file, 201105, 2, j10, cf.e.f5513h);
    }

    private final void a(d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public final void A(d0 d0Var, d0 d0Var2) {
        qe.k.f(d0Var, "cached");
        qe.k.f(d0Var2, "network");
        C0551c c0551c = new C0551c(d0Var2);
        e0 a10 = d0Var.a();
        Objects.requireNonNull(a10, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        d.b bVar = null;
        try {
            bVar = ((a) a10).y().a();
            if (bVar != null) {
                c0551c.f(bVar);
                bVar.b();
            }
        } catch (IOException unused) {
            a(bVar);
        }
    }

    public final d0 b(b0 b0Var) {
        qe.k.f(b0Var, "request");
        try {
            d.C0096d O = this.f39561a.O(f39560g.b(b0Var.l()));
            if (O != null) {
                try {
                    C0551c c0551c = new C0551c(O.b(0));
                    d0 d10 = c0551c.d(O);
                    if (c0551c.b(b0Var, d10)) {
                        return d10;
                    }
                    e0 a10 = d10.a();
                    if (a10 != null) {
                        ze.c.j(a10);
                    }
                    return null;
                } catch (IOException unused) {
                    ze.c.j(O);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39561a.close();
    }

    public final int d() {
        return this.f39563c;
    }

    public final int e() {
        return this.f39562b;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.f39561a.flush();
    }

    public final bf.b h(d0 d0Var) {
        d.b bVar;
        qe.k.f(d0Var, "response");
        String h10 = d0Var.d0().h();
        if (ef.f.f29821a.a(d0Var.d0().h())) {
            try {
                l(d0Var.d0());
            } catch (IOException unused) {
            }
            return null;
        } else if (!qe.k.a(h10, "GET")) {
            return null;
        } else {
            b bVar2 = f39560g;
            if (bVar2.a(d0Var)) {
                return null;
            }
            C0551c c0551c = new C0551c(d0Var);
            try {
                bVar = bf.d.L(this.f39561a, bVar2.b(d0Var.d0().l()), 0L, 2, null);
                if (bVar != null) {
                    try {
                        c0551c.f(bVar);
                        return new d(this, bVar);
                    } catch (IOException unused2) {
                        a(bVar);
                        return null;
                    }
                }
                return null;
            } catch (IOException unused3) {
                bVar = null;
            }
        }
    }

    public final void l(b0 b0Var) throws IOException {
        qe.k.f(b0Var, "request");
        this.f39561a.C0(f39560g.b(b0Var.l()));
    }

    public final void q(int i10) {
        this.f39563c = i10;
    }

    public final void w(int i10) {
        this.f39562b = i10;
    }

    public final synchronized void y() {
        this.f39565e++;
    }

    public final synchronized void z(bf.c cVar) {
        qe.k.f(cVar, "cacheStrategy");
        this.f39566f++;
        if (cVar.b() != null) {
            this.f39564d++;
        } else if (cVar.a() != null) {
            this.f39565e++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(File file, long j10) {
        this(file, j10, hf.a.f31417a);
        qe.k.f(file, "directory");
    }

    /* compiled from: Cache.kt */
    /* renamed from: ye.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0551c {

        /* renamed from: k  reason: collision with root package name */
        private static final String f39573k;

        /* renamed from: l  reason: collision with root package name */
        private static final String f39574l;

        /* renamed from: a  reason: collision with root package name */
        private final String f39575a;

        /* renamed from: b  reason: collision with root package name */
        private final t f39576b;

        /* renamed from: c  reason: collision with root package name */
        private final String f39577c;

        /* renamed from: d  reason: collision with root package name */
        private final a0 f39578d;

        /* renamed from: e  reason: collision with root package name */
        private final int f39579e;

        /* renamed from: f  reason: collision with root package name */
        private final String f39580f;

        /* renamed from: g  reason: collision with root package name */
        private final t f39581g;

        /* renamed from: h  reason: collision with root package name */
        private final s f39582h;

        /* renamed from: i  reason: collision with root package name */
        private final long f39583i;

        /* renamed from: j  reason: collision with root package name */
        private final long f39584j;

        /* compiled from: Cache.kt */
        /* renamed from: ye.c$c$a */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qe.g gVar) {
                this();
            }
        }

        static {
            new a(null);
            StringBuilder sb2 = new StringBuilder();
            h.a aVar = okhttp3.internal.platform.h.f35277c;
            sb2.append(aVar.g().g());
            sb2.append("-Sent-Millis");
            f39573k = sb2.toString();
            f39574l = aVar.g().g() + "-Received-Millis";
        }

        public C0551c(mf.e0 e0Var) throws IOException {
            g0 g0Var;
            qe.k.f(e0Var, "rawSource");
            try {
                mf.h d10 = mf.r.d(e0Var);
                this.f39575a = d10.a0();
                this.f39577c = d10.a0();
                t.a aVar = new t.a();
                int c10 = c.f39560g.c(d10);
                for (int i10 = 0; i10 < c10; i10++) {
                    aVar.b(d10.a0());
                }
                this.f39576b = aVar.d();
                ef.k a10 = ef.k.f29836d.a(d10.a0());
                this.f39578d = a10.f29837a;
                this.f39579e = a10.f29838b;
                this.f39580f = a10.f29839c;
                t.a aVar2 = new t.a();
                int c11 = c.f39560g.c(d10);
                for (int i11 = 0; i11 < c11; i11++) {
                    aVar2.b(d10.a0());
                }
                String str = f39573k;
                String e10 = aVar2.e(str);
                String str2 = f39574l;
                String e11 = aVar2.e(str2);
                aVar2.g(str);
                aVar2.g(str2);
                this.f39583i = e10 != null ? Long.parseLong(e10) : 0L;
                this.f39584j = e11 != null ? Long.parseLong(e11) : 0L;
                this.f39581g = aVar2.d();
                if (a()) {
                    String a02 = d10.a0();
                    if (!(a02.length() > 0)) {
                        i b10 = i.f39695t.b(d10.a0());
                        List<Certificate> c12 = c(d10);
                        List<Certificate> c13 = c(d10);
                        if (!d10.w0()) {
                            g0Var = g0.f39673h.a(d10.a0());
                        } else {
                            g0Var = g0.SSL_3_0;
                        }
                        this.f39582h = s.f39744e.b(g0Var, b10, c12, c13);
                    } else {
                        throw new IOException("expected \"\" but was \"" + a02 + '\"');
                    }
                } else {
                    this.f39582h = null;
                }
            } finally {
                e0Var.close();
            }
        }

        private final boolean a() {
            boolean y10;
            y10 = ve.p.y(this.f39575a, "https://", false, 2, null);
            return y10;
        }

        private final List<Certificate> c(mf.h hVar) throws IOException {
            List<Certificate> h10;
            int c10 = c.f39560g.c(hVar);
            if (c10 == -1) {
                h10 = fe.p.h();
                return h10;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c10);
                for (int i10 = 0; i10 < c10; i10++) {
                    String a02 = hVar.a0();
                    mf.f fVar = new mf.f();
                    mf.i a10 = mf.i.f34462e.a(a02);
                    qe.k.c(a10);
                    fVar.Y(a10);
                    arrayList.add(certificateFactory.generateCertificate(fVar.h1()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(mf.g gVar, List<? extends Certificate> list) throws IOException {
            try {
                gVar.k0(list.size()).writeByte(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    byte[] encoded = list.get(i10).getEncoded();
                    i.a aVar = mf.i.f34462e;
                    qe.k.e(encoded, "bytes");
                    gVar.M(i.a.g(aVar, encoded, 0, 0, 3, null).f()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(b0 b0Var, d0 d0Var) {
            qe.k.f(b0Var, "request");
            qe.k.f(d0Var, "response");
            return qe.k.a(this.f39575a, b0Var.l().toString()) && qe.k.a(this.f39577c, b0Var.h()) && c.f39560g.g(d0Var, this.f39576b, b0Var);
        }

        public final d0 d(d.C0096d c0096d) {
            qe.k.f(c0096d, "snapshot");
            String a10 = this.f39581g.a("Content-Type");
            String a11 = this.f39581g.a("Content-Length");
            return new d0.a().r(new b0.a().l(this.f39575a).g(this.f39577c, null).f(this.f39576b).b()).p(this.f39578d).g(this.f39579e).m(this.f39580f).k(this.f39581g).b(new a(c0096d, a10, a11)).i(this.f39582h).s(this.f39583i).q(this.f39584j).c();
        }

        public final void f(d.b bVar) throws IOException {
            qe.k.f(bVar, "editor");
            mf.g c10 = mf.r.c(bVar.f(0));
            try {
                c10.M(this.f39575a).writeByte(10);
                c10.M(this.f39577c).writeByte(10);
                c10.k0(this.f39576b.size()).writeByte(10);
                int size = this.f39576b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c10.M(this.f39576b.c(i10)).M(": ").M(this.f39576b.h(i10)).writeByte(10);
                }
                c10.M(new ef.k(this.f39578d, this.f39579e, this.f39580f).toString()).writeByte(10);
                c10.k0(this.f39581g.size() + 2).writeByte(10);
                int size2 = this.f39581g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c10.M(this.f39581g.c(i11)).M(": ").M(this.f39581g.h(i11)).writeByte(10);
                }
                c10.M(f39573k).M(": ").k0(this.f39583i).writeByte(10);
                c10.M(f39574l).M(": ").k0(this.f39584j).writeByte(10);
                if (a()) {
                    c10.writeByte(10);
                    s sVar = this.f39582h;
                    qe.k.c(sVar);
                    c10.M(sVar.a().c()).writeByte(10);
                    e(c10, this.f39582h.d());
                    e(c10, this.f39582h.c());
                    c10.M(this.f39582h.e().f()).writeByte(10);
                }
                ee.u uVar = ee.u.f29813a;
                ne.a.a(c10, null);
            } finally {
            }
        }

        public C0551c(d0 d0Var) {
            qe.k.f(d0Var, "response");
            this.f39575a = d0Var.d0().l().toString();
            this.f39576b = c.f39560g.f(d0Var);
            this.f39577c = d0Var.d0().h();
            this.f39578d = d0Var.U();
            this.f39579e = d0Var.h();
            this.f39580f = d0Var.C();
            this.f39581g = d0Var.A();
            this.f39582h = d0Var.q();
            this.f39583i = d0Var.g0();
            this.f39584j = d0Var.Z();
        }
    }
}
