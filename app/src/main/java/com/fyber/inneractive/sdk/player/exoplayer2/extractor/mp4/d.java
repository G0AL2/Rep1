package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* loaded from: classes.dex */
public final class d implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public static final int D = u.a("seig");
    public static final byte[] E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public n A;
    public n[] B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public final int f18586a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<b> f18587b;

    /* renamed from: c  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18588c;

    /* renamed from: d  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18589d;

    /* renamed from: e  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18590e;

    /* renamed from: f  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18591f;

    /* renamed from: g  reason: collision with root package name */
    public final r f18592g;

    /* renamed from: h  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.k f18593h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f18594i;

    /* renamed from: j  reason: collision with root package name */
    public final Stack<a.C0253a> f18595j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedList<a> f18596k;

    /* renamed from: l  reason: collision with root package name */
    public int f18597l;

    /* renamed from: m  reason: collision with root package name */
    public int f18598m;

    /* renamed from: n  reason: collision with root package name */
    public long f18599n;

    /* renamed from: o  reason: collision with root package name */
    public int f18600o;

    /* renamed from: p  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.k f18601p;

    /* renamed from: q  reason: collision with root package name */
    public long f18602q;

    /* renamed from: r  reason: collision with root package name */
    public int f18603r;

    /* renamed from: s  reason: collision with root package name */
    public long f18604s;

    /* renamed from: t  reason: collision with root package name */
    public long f18605t;

    /* renamed from: u  reason: collision with root package name */
    public b f18606u;

    /* renamed from: v  reason: collision with root package name */
    public int f18607v;

    /* renamed from: w  reason: collision with root package name */
    public int f18608w;

    /* renamed from: x  reason: collision with root package name */
    public int f18609x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f18610y;

    /* renamed from: z  reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.h f18611z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f18612a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18613b;

        public a(long j10, int i10) {
            this.f18612a = j10;
            this.f18613b = i10;
        }
    }

    public d(int i10, r rVar) {
        this(i10, null, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVar) throws IOException, InterruptedException {
        return g.a(gVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    public final void c() {
        if ((this.f18586a & 4) != 0 && this.A == null) {
            n a10 = this.f18611z.a(this.f18587b.size(), 4);
            this.A = a10;
            a10.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "application/x-emsg", Long.MAX_VALUE));
        }
        if ((this.f18586a & 8) == 0 || this.B != null) {
            return;
        }
        n a11 = this.f18611z.a(this.f18587b.size() + 1, 3);
        a11.a(com.fyber.inneractive.sdk.player.exoplayer2.i.a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null));
        this.B = new n[]{a11};
    }

    public d(int i10, r rVar, h hVar) {
        this.f18586a = i10 | 0;
        this.f18592g = rVar;
        this.f18593h = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(16);
        this.f18588c = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(com.fyber.inneractive.sdk.player.exoplayer2.util.i.f19558a);
        this.f18589d = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(5);
        this.f18590e = new com.fyber.inneractive.sdk.player.exoplayer2.util.k();
        this.f18591f = new com.fyber.inneractive.sdk.player.exoplayer2.util.k(1);
        this.f18594i = new byte[16];
        this.f18595j = new Stack<>();
        this.f18596k = new LinkedList<>();
        this.f18587b = new SparseArray<>();
        this.f18604s = -9223372036854775807L;
        this.f18605t = -9223372036854775807L;
        a();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar) {
        this.f18611z = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        int size = this.f18587b.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18587b.valueAt(i10).a();
        }
        this.f18596k.clear();
        this.f18603r = 0;
        this.f18595j.clear();
        a();
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final j f18614a = new j();

        /* renamed from: b  reason: collision with root package name */
        public final n f18615b;

        /* renamed from: c  reason: collision with root package name */
        public h f18616c;

        /* renamed from: d  reason: collision with root package name */
        public c f18617d;

        /* renamed from: e  reason: collision with root package name */
        public int f18618e;

        /* renamed from: f  reason: collision with root package name */
        public int f18619f;

        /* renamed from: g  reason: collision with root package name */
        public int f18620g;

        public b(n nVar) {
            this.f18615b = nVar;
        }

        public void a(h hVar, c cVar) {
            hVar.getClass();
            this.f18616c = hVar;
            cVar.getClass();
            this.f18617d = cVar;
            this.f18615b.a(hVar.f18673f);
            a();
        }

        public void a() {
            j jVar = this.f18614a;
            jVar.f18684d = 0;
            jVar.f18698r = 0L;
            jVar.f18692l = false;
            jVar.f18697q = false;
            jVar.f18694n = null;
            this.f18618e = 0;
            this.f18620g = 0;
            this.f18619f = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:270:0x028c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0004 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r26, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    public final void a() {
        this.f18597l = 0;
        this.f18600o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:282:0x0704, code lost:
        a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0708, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r57) throws com.fyber.inneractive.sdk.player.exoplayer2.l {
        /*
            Method dump skipped, instructions count: 1801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d.a(long):void");
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, int i10, j jVar) throws l {
        kVar.e(i10 + 8);
        int c10 = kVar.c();
        int i11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.f18511b;
        int i12 = c10 & 16777215;
        if ((i12 & 1) == 0) {
            boolean z10 = (i12 & 2) != 0;
            int o10 = kVar.o();
            if (o10 == jVar.f18685e) {
                Arrays.fill(jVar.f18693m, 0, o10, z10);
                jVar.a(kVar.a());
                kVar.a(jVar.f18696p.f19579a, 0, jVar.f18695o);
                jVar.f18696p.e(0);
                jVar.f18697q = false;
                return;
            }
            throw new l("Length mismatch: " + o10 + ", " + jVar.f18685e);
        }
        throw new l("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.a a(java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L8:
            if (r3 >= r0) goto Lbc
            java.lang.Object r5 = r14.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.b) r5
            int r6 = r5.f18561a
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.V
            if (r6 != r7) goto Lb8
            if (r4 != 0) goto L1d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r5.P0
            byte[] r5 = r5.f19579a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r6.<init>(r5)
            int r8 = r6.f19581c
            r9 = 32
            if (r8 >= r9) goto L2d
            goto L88
        L2d:
            r6.e(r1)
            int r8 = r6.c()
            int r9 = r6.a()
            int r9 = r9 + 4
            if (r8 == r9) goto L3d
            goto L88
        L3d:
            int r8 = r6.c()
            if (r8 == r7) goto L44
            goto L88
        L44:
            int r7 = r6.c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a.b(r7)
            r8 = 1
            if (r7 <= r8) goto L66
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L88
        L66:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.i()
            long r12 = r6.i()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L7e
            int r7 = r6.o()
            int r7 = r7 * 16
            r6.f(r7)
        L7e:
            int r7 = r6.o()
            int r8 = r6.a()
            if (r7 == r8) goto L8a
        L88:
            r6 = r2
            goto L9c
        L8a:
            byte[] r8 = new byte[r7]
            byte[] r10 = r6.f19579a
            int r11 = r6.f19580b
            java.lang.System.arraycopy(r10, r11, r8, r1, r7)
            int r10 = r6.f19580b
            int r10 = r10 + r7
            r6.f19580b = r10
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L9c:
            if (r6 != 0) goto La0
            r6 = r2
            goto La4
        La0:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        La4:
            if (r6 != 0) goto Lae
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto Lb8
        Lae:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        Lb8:
            int r3 = r3 + 1
            goto L8
        Lbc:
            if (r4 != 0) goto Lbf
            goto Ld0
        Lbf:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a
            int r14 = r4.size()
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a.b[r14]
            java.lang.Object[] r14 = r4.toArray(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = (com.fyber.inneractive.sdk.player.exoplayer2.drm.a.b[]) r14
            r2.<init>(r1, r14)
        Ld0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d.a(java.util.List):com.fyber.inneractive.sdk.player.exoplayer2.drm.a");
    }
}
