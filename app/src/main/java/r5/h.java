package r5;

import android.net.Uri;
import b6.b;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.v0;
import com.facebook.imagepipeline.producers.z;
import com.facebook.imagepipeline.producers.z0;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import p5.s;

/* compiled from: ImagePipeline.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: o  reason: collision with root package name */
    private static final CancellationException f36239o = new CancellationException("Prefetching is not enabled");

    /* renamed from: a  reason: collision with root package name */
    private final p f36240a;

    /* renamed from: b  reason: collision with root package name */
    private final y5.e f36241b;

    /* renamed from: c  reason: collision with root package name */
    private final y5.d f36242c;

    /* renamed from: d  reason: collision with root package name */
    private final y3.n<Boolean> f36243d;

    /* renamed from: e  reason: collision with root package name */
    private final s<t3.d, w5.c> f36244e;

    /* renamed from: f  reason: collision with root package name */
    private final s<t3.d, b4.g> f36245f;

    /* renamed from: g  reason: collision with root package name */
    private final p5.e f36246g;

    /* renamed from: h  reason: collision with root package name */
    private final p5.e f36247h;

    /* renamed from: i  reason: collision with root package name */
    private final p5.f f36248i;

    /* renamed from: j  reason: collision with root package name */
    private final y3.n<Boolean> f36249j;

    /* renamed from: k  reason: collision with root package name */
    private AtomicLong f36250k = new AtomicLong();

    /* renamed from: l  reason: collision with root package name */
    private final y3.n<Boolean> f36251l;

    /* renamed from: m  reason: collision with root package name */
    private final com.facebook.callercontext.a f36252m;

    /* renamed from: n  reason: collision with root package name */
    private final j f36253n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagePipeline.java */
    /* loaded from: classes.dex */
    public class a implements y3.l<t3.d> {
        a(h hVar) {
        }

        @Override // y3.l
        /* renamed from: a */
        public boolean apply(t3.d dVar) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagePipeline.java */
    /* loaded from: classes.dex */
    public class b implements y3.l<t3.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f36254a;

        b(h hVar, Uri uri) {
            this.f36254a = uri;
        }

        @Override // y3.l
        /* renamed from: a */
        public boolean apply(t3.d dVar) {
            return dVar.b(this.f36254a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImagePipeline.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36255a;

        static {
            int[] iArr = new int[b.EnumC0091b.values().length];
            f36255a = iArr;
            try {
                iArr[b.EnumC0091b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36255a[b.EnumC0091b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(p pVar, Set<y5.e> set, Set<y5.d> set2, y3.n<Boolean> nVar, s<t3.d, w5.c> sVar, s<t3.d, b4.g> sVar2, p5.e eVar, p5.e eVar2, p5.f fVar, z0 z0Var, y3.n<Boolean> nVar2, y3.n<Boolean> nVar3, com.facebook.callercontext.a aVar, j jVar) {
        this.f36240a = pVar;
        this.f36241b = new y5.c(set);
        this.f36242c = new y5.b(set2);
        this.f36243d = nVar;
        this.f36244e = sVar;
        this.f36245f = sVar2;
        this.f36246g = eVar;
        this.f36247h = eVar2;
        this.f36248i = fVar;
        this.f36249j = nVar2;
        this.f36251l = nVar3;
        this.f36252m = aVar;
        this.f36253n = jVar;
    }

    private y3.l<t3.d> p(Uri uri) {
        return new b(this, uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <T> com.facebook.datasource.c<c4.a<T>> t(com.facebook.imagepipeline.producers.o0<c4.a<T>> r15, b6.b r16, b6.b.c r17, java.lang.Object r18, y5.e r19, java.lang.String r20) {
        /*
            r14 = this;
            r1 = r14
            boolean r0 = c6.b.d()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            c6.b.a(r0)
        Lc:
            com.facebook.imagepipeline.producers.z r0 = new com.facebook.imagepipeline.producers.z
            r3 = r16
            r2 = r19
            y5.e r2 = r14.k(r3, r2)
            y5.d r4 = r1.f36242c
            r0.<init>(r2, r4)
            com.facebook.callercontext.a r2 = r1.f36252m
            r4 = 0
            r7 = r18
            if (r2 == 0) goto L25
            r2.a(r7, r4)
        L25:
            b6.b$c r2 = r16.f()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r5 = r17
            b6.b$c r8 = b6.b.c.a(r2, r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            com.facebook.imagepipeline.producers.v0 r13 = new com.facebook.imagepipeline.producers.v0     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            java.lang.String r5 = r14.h()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r9 = 0
            boolean r2 = r16.k()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            if (r2 != 0) goto L49
            android.net.Uri r2 = r16.q()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            boolean r2 = g4.f.l(r2)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            if (r2 != 0) goto L47
            goto L49
        L47:
            r10 = 0
            goto L4b
        L49:
            r2 = 1
            r10 = 1
        L4b:
            q5.d r11 = r16.j()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r5.j r12 = r1.f36253n     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r2 = r13
            r3 = r16
            r4 = r5
            r5 = r20
            r6 = r0
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r2 = r15
            com.facebook.datasource.c r0 = s5.b.I(r15, r13, r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            boolean r2 = c6.b.d()
            if (r2 == 0) goto L6b
            c6.b.b()
        L6b:
            return r0
        L6c:
            r0 = move-exception
            goto L7d
        L6e:
            r0 = move-exception
            com.facebook.datasource.c r0 = com.facebook.datasource.d.b(r0)     // Catch: java.lang.Throwable -> L6c
            boolean r2 = c6.b.d()
            if (r2 == 0) goto L7c
            c6.b.b()
        L7c:
            return r0
        L7d:
            boolean r2 = c6.b.d()
            if (r2 == 0) goto L86
            c6.b.b()
        L86:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r5.h.t(com.facebook.imagepipeline.producers.o0, b6.b, b6.b$c, java.lang.Object, y5.e, java.lang.String):com.facebook.datasource.c");
    }

    private com.facebook.datasource.c<Void> u(o0<Void> o0Var, b6.b bVar, b.c cVar, Object obj, q5.d dVar, y5.e eVar) {
        z zVar = new z(k(bVar, eVar), this.f36242c);
        com.facebook.callercontext.a aVar = this.f36252m;
        if (aVar != null) {
            aVar.a(obj, true);
        }
        try {
            return s5.c.H(o0Var, new v0(bVar, h(), zVar, obj, b.c.a(bVar.f(), cVar), true, false, dVar, this.f36253n), zVar);
        } catch (Exception e10) {
            return com.facebook.datasource.d.b(e10);
        }
    }

    public void a() {
        c();
        b();
    }

    public void b() {
        this.f36246g.j();
        this.f36247h.j();
    }

    public void c() {
        a aVar = new a(this);
        this.f36244e.c(aVar);
        this.f36245f.c(aVar);
    }

    public com.facebook.datasource.c<c4.a<w5.c>> d(b6.b bVar, Object obj) {
        return e(bVar, obj, b.c.FULL_FETCH);
    }

    public com.facebook.datasource.c<c4.a<w5.c>> e(b6.b bVar, Object obj, b.c cVar) {
        return f(bVar, obj, cVar, null);
    }

    public com.facebook.datasource.c<c4.a<w5.c>> f(b6.b bVar, Object obj, b.c cVar, y5.e eVar) {
        return g(bVar, obj, cVar, eVar, null);
    }

    public com.facebook.datasource.c<c4.a<w5.c>> g(b6.b bVar, Object obj, b.c cVar, y5.e eVar, String str) {
        try {
            return t(this.f36240a.g(bVar), bVar, cVar, obj, eVar, str);
        } catch (Exception e10) {
            return com.facebook.datasource.d.b(e10);
        }
    }

    public String h() {
        return String.valueOf(this.f36250k.getAndIncrement());
    }

    public s<t3.d, w5.c> i() {
        return this.f36244e;
    }

    public p5.f j() {
        return this.f36248i;
    }

    public y5.e k(b6.b bVar, y5.e eVar) {
        if (eVar == null) {
            if (bVar.l() == null) {
                return this.f36241b;
            }
            return new y5.c(this.f36241b, bVar.l());
        } else if (bVar.l() == null) {
            return new y5.c(this.f36241b, eVar);
        } else {
            return new y5.c(this.f36241b, eVar, bVar.l());
        }
    }

    public boolean l(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f36244e.d(p(uri));
    }

    public boolean m(Uri uri) {
        return n(uri, b.EnumC0091b.SMALL) || n(uri, b.EnumC0091b.DEFAULT);
    }

    public boolean n(Uri uri, b.EnumC0091b enumC0091b) {
        return o(b6.c.s(uri).v(enumC0091b).a());
    }

    public boolean o(b6.b bVar) {
        t3.d a10 = this.f36248i.a(bVar, null);
        int i10 = c.f36255a[bVar.b().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            return this.f36247h.l(a10);
        }
        return this.f36246g.l(a10);
    }

    public com.facebook.datasource.c<Void> q(b6.b bVar, Object obj) {
        return r(bVar, obj, q5.d.MEDIUM);
    }

    public com.facebook.datasource.c<Void> r(b6.b bVar, Object obj, q5.d dVar) {
        return s(bVar, obj, dVar, null);
    }

    public com.facebook.datasource.c<Void> s(b6.b bVar, Object obj, q5.d dVar, y5.e eVar) {
        if (!this.f36243d.get().booleanValue()) {
            return com.facebook.datasource.d.b(f36239o);
        }
        try {
            return u(this.f36240a.i(bVar), bVar, b.c.FULL_FETCH, obj, dVar, eVar);
        } catch (Exception e10) {
            return com.facebook.datasource.d.b(e10);
        }
    }
}
