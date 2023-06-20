package bf;

import ee.u;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import mf.c0;
import mf.e0;
import mf.g;
import mf.h;
import mf.r;
import qe.k;
import qe.l;
import ve.p;
import ve.q;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class d implements Closeable, Flushable {
    public static final long A;
    public static final ve.f B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;

    /* renamed from: v */
    public static final String f5237v;

    /* renamed from: w */
    public static final String f5238w;

    /* renamed from: x */
    public static final String f5239x;

    /* renamed from: y */
    public static final String f5240y;

    /* renamed from: z */
    public static final String f5241z;

    /* renamed from: a */
    private long f5242a;

    /* renamed from: b */
    private final File f5243b;

    /* renamed from: c */
    private final File f5244c;

    /* renamed from: d */
    private final File f5245d;

    /* renamed from: e */
    private long f5246e;

    /* renamed from: f */
    private g f5247f;

    /* renamed from: g */
    private final LinkedHashMap<String, c> f5248g;

    /* renamed from: h */
    private int f5249h;

    /* renamed from: i */
    private boolean f5250i;

    /* renamed from: j */
    private boolean f5251j;

    /* renamed from: k */
    private boolean f5252k;

    /* renamed from: l */
    private boolean f5253l;

    /* renamed from: m */
    private boolean f5254m;

    /* renamed from: n */
    private boolean f5255n;

    /* renamed from: o */
    private long f5256o;

    /* renamed from: p */
    private final cf.d f5257p;

    /* renamed from: q */
    private final e f5258q;

    /* renamed from: r */
    private final hf.a f5259r;

    /* renamed from: s */
    private final File f5260s;

    /* renamed from: t */
    private final int f5261t;

    /* renamed from: u */
    private final int f5262u;

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes3.dex */
    public final class b {

        /* renamed from: a */
        private final boolean[] f5263a;

        /* renamed from: b */
        private boolean f5264b;

        /* renamed from: c */
        private final c f5265c;

        /* renamed from: d */
        final /* synthetic */ d f5266d;

        /* compiled from: DiskLruCache.kt */
        /* loaded from: classes3.dex */
        public static final class a extends l implements pe.l<IOException, u> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i10) {
                super(1);
                b.this = r1;
            }

            public final void a(IOException iOException) {
                k.f(iOException, "it");
                synchronized (b.this.f5266d) {
                    b.this.c();
                    u uVar = u.f29813a;
                }
            }

            @Override // pe.l
            public /* bridge */ /* synthetic */ u b(IOException iOException) {
                a(iOException);
                return u.f29813a;
            }
        }

        public b(d dVar, c cVar) {
            k.f(cVar, "entry");
            this.f5266d = dVar;
            this.f5265c = cVar;
            this.f5263a = cVar.g() ? null : new boolean[dVar.d0()];
        }

        public final void a() throws IOException {
            synchronized (this.f5266d) {
                if (!this.f5264b) {
                    if (k.a(this.f5265c.b(), this)) {
                        this.f5266d.z(this, false);
                    }
                    this.f5264b = true;
                    u uVar = u.f29813a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void b() throws IOException {
            synchronized (this.f5266d) {
                if (!this.f5264b) {
                    if (k.a(this.f5265c.b(), this)) {
                        this.f5266d.z(this, true);
                    }
                    this.f5264b = true;
                    u uVar = u.f29813a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void c() {
            if (k.a(this.f5265c.b(), this)) {
                if (this.f5266d.f5251j) {
                    this.f5266d.z(this, false);
                } else {
                    this.f5265c.q(true);
                }
            }
        }

        public final c d() {
            return this.f5265c;
        }

        public final boolean[] e() {
            return this.f5263a;
        }

        public final c0 f(int i10) {
            synchronized (this.f5266d) {
                if (!this.f5264b) {
                    if (!k.a(this.f5265c.b(), this)) {
                        return r.b();
                    }
                    if (!this.f5265c.g()) {
                        boolean[] zArr = this.f5263a;
                        k.c(zArr);
                        zArr[i10] = true;
                    }
                    try {
                        return new bf.e(this.f5266d.Z().f(this.f5265c.c().get(i10)), new a(i10));
                    } catch (FileNotFoundException unused) {
                        return r.b();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes3.dex */
    public final class c {

        /* renamed from: a */
        private final long[] f5268a;

        /* renamed from: b */
        private final List<File> f5269b;

        /* renamed from: c */
        private final List<File> f5270c;

        /* renamed from: d */
        private boolean f5271d;

        /* renamed from: e */
        private boolean f5272e;

        /* renamed from: f */
        private b f5273f;

        /* renamed from: g */
        private int f5274g;

        /* renamed from: h */
        private long f5275h;

        /* renamed from: i */
        private final String f5276i;

        /* renamed from: j */
        final /* synthetic */ d f5277j;

        /* compiled from: DiskLruCache.kt */
        /* loaded from: classes3.dex */
        public static final class a extends mf.l {

            /* renamed from: b */
            private boolean f5278b;

            /* renamed from: d */
            final /* synthetic */ e0 f5280d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, e0 e0Var2) {
                super(e0Var2);
                c.this = r1;
                this.f5280d = e0Var;
            }

            @Override // mf.l, mf.e0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f5278b) {
                    return;
                }
                this.f5278b = true;
                synchronized (c.this.f5277j) {
                    c cVar = c.this;
                    cVar.n(cVar.f() - 1);
                    if (c.this.f() == 0 && c.this.i()) {
                        c cVar2 = c.this;
                        cVar2.f5277j.E0(cVar2);
                    }
                    u uVar = u.f29813a;
                }
            }
        }

        public c(d dVar, String str) {
            k.f(str, "key");
            this.f5277j = dVar;
            this.f5276i = str;
            this.f5268a = new long[dVar.d0()];
            this.f5269b = new ArrayList();
            this.f5270c = new ArrayList();
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int d02 = dVar.d0();
            for (int i10 = 0; i10 < d02; i10++) {
                sb2.append(i10);
                this.f5269b.add(new File(dVar.U(), sb2.toString()));
                sb2.append(".tmp");
                this.f5270c.add(new File(dVar.U(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final e0 k(int i10) {
            e0 e10 = this.f5277j.Z().e(this.f5269b.get(i10));
            if (this.f5277j.f5251j) {
                return e10;
            }
            this.f5274g++;
            return new a(e10, e10);
        }

        public final List<File> a() {
            return this.f5269b;
        }

        public final b b() {
            return this.f5273f;
        }

        public final List<File> c() {
            return this.f5270c;
        }

        public final String d() {
            return this.f5276i;
        }

        public final long[] e() {
            return this.f5268a;
        }

        public final int f() {
            return this.f5274g;
        }

        public final boolean g() {
            return this.f5271d;
        }

        public final long h() {
            return this.f5275h;
        }

        public final boolean i() {
            return this.f5272e;
        }

        public final void l(b bVar) {
            this.f5273f = bVar;
        }

        public final void m(List<String> list) throws IOException {
            k.f(list, "strings");
            if (list.size() == this.f5277j.d0()) {
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        this.f5268a[i10] = Long.parseLong(list.get(i10));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    j(list);
                    throw new ee.d();
                }
            }
            j(list);
            throw new ee.d();
        }

        public final void n(int i10) {
            this.f5274g = i10;
        }

        public final void o(boolean z10) {
            this.f5271d = z10;
        }

        public final void p(long j10) {
            this.f5275h = j10;
        }

        public final void q(boolean z10) {
            this.f5272e = z10;
        }

        public final C0096d r() {
            d dVar = this.f5277j;
            if (ze.c.f40525g && !Thread.holdsLock(dVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread currentThread = Thread.currentThread();
                k.e(currentThread, "Thread.currentThread()");
                sb2.append(currentThread.getName());
                sb2.append(" MUST hold lock on ");
                sb2.append(dVar);
                throw new AssertionError(sb2.toString());
            } else if (this.f5271d) {
                if (this.f5277j.f5251j || (this.f5273f == null && !this.f5272e)) {
                    ArrayList<e0> arrayList = new ArrayList();
                    long[] jArr = (long[]) this.f5268a.clone();
                    try {
                        int d02 = this.f5277j.d0();
                        for (int i10 = 0; i10 < d02; i10++) {
                            arrayList.add(k(i10));
                        }
                        return new C0096d(this.f5277j, this.f5276i, this.f5275h, arrayList, jArr);
                    } catch (FileNotFoundException unused) {
                        for (e0 e0Var : arrayList) {
                            ze.c.j(e0Var);
                        }
                        try {
                            this.f5277j.E0(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                return null;
            } else {
                return null;
            }
        }

        public final void s(g gVar) throws IOException {
            k.f(gVar, "writer");
            for (long j10 : this.f5268a) {
                gVar.writeByte(32).k0(j10);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* renamed from: bf.d$d */
    /* loaded from: classes3.dex */
    public final class C0096d implements Closeable {

        /* renamed from: a */
        private final String f5281a;

        /* renamed from: b */
        private final long f5282b;

        /* renamed from: c */
        private final List<e0> f5283c;

        /* renamed from: d */
        final /* synthetic */ d f5284d;

        /* JADX WARN: Multi-variable type inference failed */
        public C0096d(d dVar, String str, long j10, List<? extends e0> list, long[] jArr) {
            k.f(str, "key");
            k.f(list, "sources");
            k.f(jArr, "lengths");
            this.f5284d = dVar;
            this.f5281a = str;
            this.f5282b = j10;
            this.f5283c = list;
        }

        public final b a() throws IOException {
            return this.f5284d.C(this.f5281a, this.f5282b);
        }

        public final e0 b(int i10) {
            return this.f5283c.get(i10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (e0 e0Var : this.f5283c) {
                ze.c.j(e0Var);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes3.dex */
    public static final class e extends cf.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(str, false, 2, null);
            d.this = r3;
        }

        @Override // cf.a
        public long f() {
            synchronized (d.this) {
                if (!d.this.f5252k || d.this.T()) {
                    return -1L;
                }
                try {
                    d.this.K0();
                } catch (IOException unused) {
                    d.this.f5254m = true;
                }
                try {
                    if (d.this.h0()) {
                        d.this.z0();
                        d.this.f5249h = 0;
                    }
                } catch (IOException unused2) {
                    d.this.f5255n = true;
                    d.this.f5247f = r.c(r.b());
                }
                return -1L;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes3.dex */
    public static final class f extends l implements pe.l<IOException, u> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(1);
            d.this = r1;
        }

        public final void a(IOException iOException) {
            k.f(iOException, "it");
            d dVar = d.this;
            if (!ze.c.f40525g || Thread.holdsLock(dVar)) {
                d.this.f5250i = true;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(dVar);
            throw new AssertionError(sb2.toString());
        }

        @Override // pe.l
        public /* bridge */ /* synthetic */ u b(IOException iOException) {
            a(iOException);
            return u.f29813a;
        }
    }

    static {
        new a(null);
        f5237v = "journal";
        f5238w = "journal.tmp";
        f5239x = "journal.bkp";
        f5240y = "libcore.io.DiskLruCache";
        f5241z = "1";
        A = -1L;
        B = new ve.f("[a-z0-9_-]{1,120}");
        C = "CLEAN";
        D = "DIRTY";
        E = "REMOVE";
        F = "READ";
    }

    public d(hf.a aVar, File file, int i10, int i11, long j10, cf.e eVar) {
        k.f(aVar, "fileSystem");
        k.f(file, "directory");
        k.f(eVar, "taskRunner");
        this.f5259r = aVar;
        this.f5260s = file;
        this.f5261t = i10;
        this.f5262u = i11;
        this.f5242a = j10;
        this.f5248g = new LinkedHashMap<>(0, 0.75f, true);
        this.f5257p = eVar.i();
        this.f5258q = new e(ze.c.f40526h + " Cache");
        if (!(j10 > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i11 > 0) {
            this.f5243b = new File(file, f5237v);
            this.f5244c = new File(file, f5238w);
            this.f5245d = new File(file, f5239x);
            return;
        }
        throw new IllegalArgumentException("valueCount <= 0".toString());
    }

    private final boolean H0() {
        for (c cVar : this.f5248g.values()) {
            if (!cVar.i()) {
                k.e(cVar, "toEvict");
                E0(cVar);
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ b L(d dVar, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = A;
        }
        return dVar.C(str, j10);
    }

    private final void N0(String str) {
        if (B.a(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final boolean h0() {
        int i10 = this.f5249h;
        return i10 >= 2000 && i10 >= this.f5248g.size();
    }

    private final g m0() throws FileNotFoundException {
        return r.c(new bf.e(this.f5259r.c(this.f5243b), new f()));
    }

    private final void q0() throws IOException {
        this.f5259r.h(this.f5244c);
        Iterator<c> it = this.f5248g.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            k.e(next, "i.next()");
            c cVar = next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f5262u;
                while (i10 < i11) {
                    this.f5246e += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f5262u;
                while (i10 < i12) {
                    this.f5259r.h(cVar.a().get(i10));
                    this.f5259r.h(cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void r0() throws IOException {
        h d10 = r.d(this.f5259r.e(this.f5243b));
        try {
            String a02 = d10.a0();
            String a03 = d10.a0();
            String a04 = d10.a0();
            String a05 = d10.a0();
            String a06 = d10.a0();
            if (!(!k.a(f5240y, a02)) && !(!k.a(f5241z, a03)) && !(!k.a(String.valueOf(this.f5261t), a04)) && !(!k.a(String.valueOf(this.f5262u), a05))) {
                int i10 = 0;
                if (!(a06.length() > 0)) {
                    while (true) {
                        try {
                            s0(d10.a0());
                            i10++;
                        } catch (EOFException unused) {
                            this.f5249h = i10 - this.f5248g.size();
                            if (!d10.w0()) {
                                z0();
                            } else {
                                this.f5247f = m0();
                            }
                            u uVar = u.f29813a;
                            ne.a.a(d10, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + a02 + ", " + a03 + ", " + a05 + ", " + a06 + ']');
        } finally {
        }
    }

    private final void s0(String str) throws IOException {
        int N;
        int N2;
        String substring;
        boolean y10;
        boolean y11;
        boolean y12;
        List<String> j02;
        boolean y13;
        N = q.N(str, ' ', 0, false, 6, null);
        if (N != -1) {
            int i10 = N + 1;
            N2 = q.N(str, ' ', i10, false, 4, null);
            if (N2 == -1) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                substring = str.substring(i10);
                k.e(substring, "(this as java.lang.String).substring(startIndex)");
                String str2 = E;
                if (N == str2.length()) {
                    y13 = p.y(str, str2, false, 2, null);
                    if (y13) {
                        this.f5248g.remove(substring);
                        return;
                    }
                }
            } else {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                substring = str.substring(i10, N2);
                k.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            c cVar = this.f5248g.get(substring);
            if (cVar == null) {
                cVar = new c(this, substring);
                this.f5248g.put(substring, cVar);
            }
            if (N2 != -1) {
                String str3 = C;
                if (N == str3.length()) {
                    y12 = p.y(str, str3, false, 2, null);
                    if (y12) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                        String substring2 = str.substring(N2 + 1);
                        k.e(substring2, "(this as java.lang.String).substring(startIndex)");
                        j02 = q.j0(substring2, new char[]{' '}, false, 0, 6, null);
                        cVar.o(true);
                        cVar.l(null);
                        cVar.m(j02);
                        return;
                    }
                }
            }
            if (N2 == -1) {
                String str4 = D;
                if (N == str4.length()) {
                    y11 = p.y(str, str4, false, 2, null);
                    if (y11) {
                        cVar.l(new b(this, cVar));
                        return;
                    }
                }
            }
            if (N2 == -1) {
                String str5 = F;
                if (N == str5.length()) {
                    y10 = p.y(str, str5, false, 2, null);
                    if (y10) {
                        return;
                    }
                }
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final synchronized void y() {
        if (!(!this.f5253l)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public final void A() throws IOException {
        close();
        this.f5259r.a(this.f5260s);
    }

    public final synchronized b C(String str, long j10) throws IOException {
        k.f(str, "key");
        g0();
        y();
        N0(str);
        c cVar = this.f5248g.get(str);
        if (j10 == A || (cVar != null && cVar.h() == j10)) {
            if ((cVar != null ? cVar.b() : null) != null) {
                return null;
            }
            if (cVar == null || cVar.f() == 0) {
                if (!this.f5254m && !this.f5255n) {
                    g gVar = this.f5247f;
                    k.c(gVar);
                    gVar.M(D).writeByte(32).M(str).writeByte(10);
                    gVar.flush();
                    if (this.f5250i) {
                        return null;
                    }
                    if (cVar == null) {
                        cVar = new c(this, str);
                        this.f5248g.put(str, cVar);
                    }
                    b bVar = new b(this, cVar);
                    cVar.l(bVar);
                    return bVar;
                }
                cf.d.j(this.f5257p, this.f5258q, 0L, 2, null);
                return null;
            }
            return null;
        }
        return null;
    }

    public final synchronized boolean C0(String str) throws IOException {
        k.f(str, "key");
        g0();
        y();
        N0(str);
        c cVar = this.f5248g.get(str);
        if (cVar != null) {
            k.e(cVar, "lruEntries[key] ?: return false");
            boolean E0 = E0(cVar);
            if (E0 && this.f5246e <= this.f5242a) {
                this.f5254m = false;
            }
            return E0;
        }
        return false;
    }

    public final boolean E0(c cVar) throws IOException {
        g gVar;
        k.f(cVar, "entry");
        if (!this.f5251j) {
            if (cVar.f() > 0 && (gVar = this.f5247f) != null) {
                gVar.M(D);
                gVar.writeByte(32);
                gVar.M(cVar.d());
                gVar.writeByte(10);
                gVar.flush();
            }
            if (cVar.f() > 0 || cVar.b() != null) {
                cVar.q(true);
                return true;
            }
        }
        b b10 = cVar.b();
        if (b10 != null) {
            b10.c();
        }
        int i10 = this.f5262u;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f5259r.h(cVar.a().get(i11));
            this.f5246e -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f5249h++;
        g gVar2 = this.f5247f;
        if (gVar2 != null) {
            gVar2.M(E);
            gVar2.writeByte(32);
            gVar2.M(cVar.d());
            gVar2.writeByte(10);
        }
        this.f5248g.remove(cVar.d());
        if (h0()) {
            cf.d.j(this.f5257p, this.f5258q, 0L, 2, null);
        }
        return true;
    }

    public final void K0() throws IOException {
        while (this.f5246e > this.f5242a) {
            if (!H0()) {
                return;
            }
        }
        this.f5254m = false;
    }

    public final synchronized C0096d O(String str) throws IOException {
        k.f(str, "key");
        g0();
        y();
        N0(str);
        c cVar = this.f5248g.get(str);
        if (cVar != null) {
            k.e(cVar, "lruEntries[key] ?: return null");
            C0096d r10 = cVar.r();
            if (r10 != null) {
                this.f5249h++;
                g gVar = this.f5247f;
                k.c(gVar);
                gVar.M(F).writeByte(32).M(str).writeByte(10);
                if (h0()) {
                    cf.d.j(this.f5257p, this.f5258q, 0L, 2, null);
                }
                return r10;
            }
            return null;
        }
        return null;
    }

    public final boolean T() {
        return this.f5253l;
    }

    public final File U() {
        return this.f5260s;
    }

    public final hf.a Z() {
        return this.f5259r;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        c[] cVarArr;
        b b10;
        if (this.f5252k && !this.f5253l) {
            Collection<c> values = this.f5248g.values();
            k.e(values, "lruEntries.values");
            Object[] array = values.toArray(new c[0]);
            if (array != null) {
                for (c cVar : (c[]) array) {
                    if (cVar.b() != null && (b10 = cVar.b()) != null) {
                        b10.c();
                    }
                }
                K0();
                g gVar = this.f5247f;
                k.c(gVar);
                gVar.close();
                this.f5247f = null;
                this.f5253l = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f5253l = true;
    }

    public final int d0() {
        return this.f5262u;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f5252k) {
            y();
            K0();
            g gVar = this.f5247f;
            k.c(gVar);
            gVar.flush();
        }
    }

    public final synchronized void g0() throws IOException {
        if (ze.c.f40525g && !Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread currentThread = Thread.currentThread();
            k.e(currentThread, "Thread.currentThread()");
            sb2.append(currentThread.getName());
            sb2.append(" MUST hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        if (this.f5252k) {
            return;
        }
        if (this.f5259r.b(this.f5245d)) {
            if (this.f5259r.b(this.f5243b)) {
                this.f5259r.h(this.f5245d);
            } else {
                this.f5259r.g(this.f5245d, this.f5243b);
            }
        }
        this.f5251j = ze.c.C(this.f5259r, this.f5245d);
        if (this.f5259r.b(this.f5243b)) {
            try {
                r0();
                q0();
                this.f5252k = true;
                return;
            } catch (IOException e10) {
                okhttp3.internal.platform.h g10 = okhttp3.internal.platform.h.f35277c.g();
                g10.k("DiskLruCache " + this.f5260s + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                A();
                this.f5253l = false;
            }
        }
        z0();
        this.f5252k = true;
    }

    public final synchronized void z(b bVar, boolean z10) throws IOException {
        k.f(bVar, "editor");
        c d10 = bVar.d();
        if (k.a(d10.b(), bVar)) {
            if (z10 && !d10.g()) {
                int i10 = this.f5262u;
                for (int i11 = 0; i11 < i10; i11++) {
                    boolean[] e10 = bVar.e();
                    k.c(e10);
                    if (e10[i11]) {
                        if (!this.f5259r.b(d10.c().get(i11))) {
                            bVar.a();
                            return;
                        }
                    } else {
                        bVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                }
            }
            int i12 = this.f5262u;
            for (int i13 = 0; i13 < i12; i13++) {
                File file = d10.c().get(i13);
                if (z10 && !d10.i()) {
                    if (this.f5259r.b(file)) {
                        File file2 = d10.a().get(i13);
                        this.f5259r.g(file, file2);
                        long j10 = d10.e()[i13];
                        long d11 = this.f5259r.d(file2);
                        d10.e()[i13] = d11;
                        this.f5246e = (this.f5246e - j10) + d11;
                    }
                } else {
                    this.f5259r.h(file);
                }
            }
            d10.l(null);
            if (d10.i()) {
                E0(d10);
                return;
            }
            this.f5249h++;
            g gVar = this.f5247f;
            k.c(gVar);
            if (!d10.g() && !z10) {
                this.f5248g.remove(d10.d());
                gVar.M(E).writeByte(32);
                gVar.M(d10.d());
                gVar.writeByte(10);
                gVar.flush();
                if (this.f5246e <= this.f5242a || h0()) {
                    cf.d.j(this.f5257p, this.f5258q, 0L, 2, null);
                }
                return;
            }
            d10.o(true);
            gVar.M(C).writeByte(32);
            gVar.M(d10.d());
            d10.s(gVar);
            gVar.writeByte(10);
            if (z10) {
                long j11 = this.f5256o;
                this.f5256o = 1 + j11;
                d10.p(j11);
            }
            gVar.flush();
            if (this.f5246e <= this.f5242a) {
            }
            cf.d.j(this.f5257p, this.f5258q, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final synchronized void z0() throws IOException {
        g gVar = this.f5247f;
        if (gVar != null) {
            gVar.close();
        }
        g c10 = r.c(this.f5259r.f(this.f5244c));
        c10.M(f5240y).writeByte(10);
        c10.M(f5241z).writeByte(10);
        c10.k0(this.f5261t).writeByte(10);
        c10.k0(this.f5262u).writeByte(10);
        c10.writeByte(10);
        for (c cVar : this.f5248g.values()) {
            if (cVar.b() != null) {
                c10.M(D).writeByte(32);
                c10.M(cVar.d());
                c10.writeByte(10);
            } else {
                c10.M(C).writeByte(32);
                c10.M(cVar.d());
                cVar.s(c10);
                c10.writeByte(10);
            }
        }
        u uVar = u.f29813a;
        ne.a.a(c10, null);
        if (this.f5259r.b(this.f5243b)) {
            this.f5259r.g(this.f5243b, this.f5245d);
        }
        this.f5259r.g(this.f5244c, this.f5243b);
        this.f5259r.h(this.f5245d);
        this.f5247f = m0();
        this.f5250i = false;
        this.f5255n = false;
    }
}
