package z8;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import p8.x;
import z8.i0;

/* compiled from: Ac3Extractor.java */
/* loaded from: classes2.dex */
public final class b implements p8.i {

    /* renamed from: a */
    private final c f40133a = new c();

    /* renamed from: b */
    private final ea.a0 f40134b = new ea.a0(2786);

    /* renamed from: c */
    private boolean f40135c;

    static {
        a aVar = new p8.n() { // from class: z8.a
            @Override // p8.n
            public /* synthetic */ p8.i[] a(Uri uri, Map map) {
                return p8.m.a(this, uri, map);
            }

            @Override // p8.n
            public final p8.i[] b() {
                return b.b();
            }
        };
    }

    public static /* synthetic */ p8.i[] b() {
        return d();
    }

    public static /* synthetic */ p8.i[] d() {
        return new p8.i[]{new b()};
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        this.f40135c = false;
        this.f40133a.b();
    }

    @Override // p8.i
    public void c(p8.k kVar) {
        this.f40133a.e(kVar, new i0.d(0, 1));
        kVar.r();
        kVar.n(new x.b(-9223372036854775807L));
    }

    @Override // p8.i
    public int g(p8.j jVar, p8.w wVar) throws IOException {
        int c10 = jVar.c(this.f40134b.d(), 0, 2786);
        if (c10 == -1) {
            return -1;
        }
        this.f40134b.P(0);
        this.f40134b.O(c10);
        if (!this.f40135c) {
            this.f40133a.f(0L, 4);
            this.f40135c = true;
        }
        this.f40133a.c(this.f40134b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0037, code lost:
        r8.f();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0040, code lost:
        if ((r4 - r3) < 8192) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0042, code lost:
        return false;
     */
    @Override // p8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(p8.j r8) throws java.io.IOException {
        /*
            r7 = this;
            ea.a0 r0 = new ea.a0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.d()
            r8.p(r4, r2, r1)
            r0.P(r2)
            int r4 = r0.G()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L5f
            r8.f()
            r8.j(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.d()
            r6 = 6
            r8.p(r5, r2, r6)
            r0.P(r2)
            int r5 = r0.J()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L47
            r8.f()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L43
            return r2
        L43:
            r8.j(r4)
            goto L23
        L47:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L4d
            return r5
        L4d:
            byte[] r5 = r0.d()
            int r5 = l8.b.f(r5)
            r6 = -1
            if (r5 != r6) goto L59
            return r2
        L59:
            int r5 = r5 + (-6)
            r8.j(r5)
            goto L24
        L5f:
            r4 = 3
            r0.Q(r4)
            int r4 = r0.C()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.j(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.b.h(p8.j):boolean");
    }

    @Override // p8.i
    public void release() {
    }
}
