package z8;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import p8.x;
import z8.i0;

/* compiled from: Ac4Extractor.java */
/* loaded from: classes2.dex */
public final class e implements p8.i {

    /* renamed from: a */
    private final f f40157a = new f();

    /* renamed from: b */
    private final ea.a0 f40158b = new ea.a0(16384);

    /* renamed from: c */
    private boolean f40159c;

    static {
        d dVar = new p8.n() { // from class: z8.d
            @Override // p8.n
            public /* synthetic */ p8.i[] a(Uri uri, Map map) {
                return p8.m.a(this, uri, map);
            }

            @Override // p8.n
            public final p8.i[] b() {
                return e.b();
            }
        };
    }

    public static /* synthetic */ p8.i[] b() {
        return d();
    }

    public static /* synthetic */ p8.i[] d() {
        return new p8.i[]{new e()};
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        this.f40159c = false;
        this.f40157a.b();
    }

    @Override // p8.i
    public void c(p8.k kVar) {
        this.f40157a.e(kVar, new i0.d(0, 1));
        kVar.r();
        kVar.n(new x.b(-9223372036854775807L));
    }

    @Override // p8.i
    public int g(p8.j jVar, p8.w wVar) throws IOException {
        int c10 = jVar.c(this.f40158b.d(), 0, 16384);
        if (c10 == -1) {
            return -1;
        }
        this.f40158b.P(0);
        this.f40158b.O(c10);
        if (!this.f40159c) {
            this.f40157a.f(0L, 4);
            this.f40159c = true;
        }
        this.f40157a.c(this.f40158b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x003d, code lost:
        r9.f();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0046, code lost:
        if ((r4 - r3) < 8192) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
        return false;
     */
    @Override // p8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(p8.j r9) throws java.io.IOException {
        /*
            r8 = this;
            ea.a0 r0 = new ea.a0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.d()
            r9.p(r4, r2, r1)
            r0.P(r2)
            int r4 = r0.G()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L65
            r9.f()
            r9.j(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.d()
            r6 = 7
            r9.p(r5, r2, r6)
            r0.P(r2)
            int r5 = r0.J()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L4d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L4d
            r9.f()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L49
            return r2
        L49:
            r9.j(r4)
            goto L23
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.d()
            int r5 = l8.c.e(r6, r5)
            r6 = -1
            if (r5 != r6) goto L5f
            return r2
        L5f:
            int r5 = r5 + (-7)
            r9.j(r5)
            goto L24
        L65:
            r4 = 3
            r0.Q(r4)
            int r4 = r0.C()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.j(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.e.h(p8.j):boolean");
    }

    @Override // p8.i
    public void release() {
    }
}
