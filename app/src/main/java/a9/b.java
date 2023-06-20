package a9;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.fq;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import ea.n0;
import ea.r;
import j8.j2;
import j8.p1;
import java.io.IOException;
import java.util.Map;
import l8.l0;
import p8.a0;
import p8.i;
import p8.j;
import p8.k;
import p8.m;
import p8.n;
import p8.w;

/* compiled from: WavExtractor.java */
/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: a */
    private k f118a;

    /* renamed from: b */
    private a0 f119b;

    /* renamed from: e */
    private InterfaceC0007b f122e;

    /* renamed from: c */
    private int f120c = 0;

    /* renamed from: d */
    private long f121d = -1;

    /* renamed from: f */
    private int f123f = -1;

    /* renamed from: g */
    private long f124g = -1;

    /* compiled from: WavExtractor.java */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC0007b {

        /* renamed from: m */
        private static final int[] f125m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        private static final int[] f126n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, DownloadResource.STATUS_PENDING, 209, 230, 253, 279, DownloadConnection.HTTP_TEMP_REDIRECT, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, DownloadResource.STATUS_UNHANDLED_HTTP_CODE, 544, 598, 658, 724, 796, 876, 963, IronSourceError.ERROR_DO_RV_LOAD_MISSING_ACTIVITY, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        private final k f127a;

        /* renamed from: b */
        private final a0 f128b;

        /* renamed from: c */
        private final a9.c f129c;

        /* renamed from: d */
        private final int f130d;

        /* renamed from: e */
        private final byte[] f131e;

        /* renamed from: f */
        private final ea.a0 f132f;

        /* renamed from: g */
        private final int f133g;

        /* renamed from: h */
        private final p1 f134h;

        /* renamed from: i */
        private int f135i;

        /* renamed from: j */
        private long f136j;

        /* renamed from: k */
        private int f137k;

        /* renamed from: l */
        private long f138l;

        public a(k kVar, a0 a0Var, a9.c cVar) throws j2 {
            this.f127a = kVar;
            this.f128b = a0Var;
            this.f129c = cVar;
            int max = Math.max(1, cVar.f149c / 10);
            this.f133g = max;
            ea.a0 a0Var2 = new ea.a0(cVar.f152f);
            a0Var2.v();
            int v10 = a0Var2.v();
            this.f130d = v10;
            int i10 = cVar.f148b;
            int i11 = (((cVar.f150d - (i10 * 4)) * 8) / (cVar.f151e * i10)) + 1;
            if (v10 == i11) {
                int l10 = n0.l(max, v10);
                this.f131e = new byte[cVar.f150d * l10];
                this.f132f = new ea.a0(l10 * h(v10, i10));
                int i12 = ((cVar.f149c * cVar.f150d) * 8) / v10;
                this.f134h = new p1.b().e0("audio/raw").G(i12).Z(i12).W(h(max, i10)).H(cVar.f148b).f0(cVar.f149c).Y(2).E();
                return;
            }
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Expected frames per block: ");
            sb2.append(i11);
            sb2.append("; got: ");
            sb2.append(v10);
            throw j2.a(sb2.toString(), null);
        }

        private void d(byte[] bArr, int i10, ea.a0 a0Var) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f129c.f148b; i12++) {
                    e(bArr, i11, i12, a0Var.d());
                }
            }
            int g10 = g(this.f130d * i10);
            a0Var.P(0);
            a0Var.O(g10);
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            a9.c cVar = this.f129c;
            int i12 = cVar.f150d;
            int i13 = cVar.f148b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[i14] & fq.i.NETWORK_LOAD_LIMIT_DISABLED));
            int min = Math.min(bArr[i14 + 2] & fq.i.NETWORK_LOAD_LIMIT_DISABLED, 88);
            int i18 = f126n[min];
            int i19 = ((i10 * this.f130d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                int i21 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                int i22 = i20 % 2 == 0 ? i21 & 15 : i21 >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                i17 = n0.q(i17 + i23, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i24 = min + f125m[i22];
                int[] iArr = f126n;
                min = n0.q(i24, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        private int f(int i10) {
            return i10 / (this.f129c.f148b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f129c.f148b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long O0 = this.f136j + n0.O0(this.f138l, 1000000L, this.f129c.f149c);
            int g10 = g(i10);
            this.f128b.e(O0, 1, g10, this.f137k - g10, null);
            this.f138l += i10;
            this.f137k -= g10;
        }

        @Override // a9.b.InterfaceC0007b
        public void a(int i10, long j10) {
            this.f127a.n(new e(this.f129c, this.f130d, i10, j10));
            this.f128b.d(this.f134h);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0048  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0036 -> B:31:0x001c). Please submit an issue!!! */
        @Override // a9.b.InterfaceC0007b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(p8.j r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f133g
                int r1 = r6.f137k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f130d
                int r0 = ea.n0.l(r0, r1)
                a9.c r1 = r6.f129c
                int r1 = r1.f150d
                int r0 = r0 * r1
                r1 = 1
                r2 = 0
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                if (r2 != 0) goto L3f
                int r3 = r6.f135i
                if (r3 >= r0) goto L3f
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r4 = (int) r3
                byte[] r3 = r6.f131e
                int r5 = r6.f135i
                int r3 = r7.c(r3, r5, r4)
                r4 = -1
                if (r3 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.f135i
                int r4 = r4 + r3
                r6.f135i = r4
                goto L1f
            L3f:
                int r7 = r6.f135i
                a9.c r8 = r6.f129c
                int r8 = r8.f150d
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.f131e
                ea.a0 r9 = r6.f132f
                r6.d(r8, r7, r9)
                int r8 = r6.f135i
                a9.c r9 = r6.f129c
                int r9 = r9.f150d
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f135i = r8
                ea.a0 r7 = r6.f132f
                int r7 = r7.f()
                p8.a0 r8 = r6.f128b
                ea.a0 r9 = r6.f132f
                r8.a(r9, r7)
                int r8 = r6.f137k
                int r8 = r8 + r7
                r6.f137k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f133g
                if (r7 < r8) goto L77
                r6.i(r8)
            L77:
                if (r2 == 0) goto L84
                int r7 = r6.f137k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L84
                r6.i(r7)
            L84:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: a9.b.a.b(p8.j, long):boolean");
        }

        @Override // a9.b.InterfaceC0007b
        public void c(long j10) {
            this.f135i = 0;
            this.f136j = j10;
            this.f137k = 0;
            this.f138l = 0L;
        }
    }

    /* compiled from: WavExtractor.java */
    /* renamed from: a9.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC0007b {
        void a(int i10, long j10) throws j2;

        boolean b(j jVar, long j10) throws IOException;

        void c(long j10);
    }

    /* compiled from: WavExtractor.java */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC0007b {

        /* renamed from: a */
        private final k f139a;

        /* renamed from: b */
        private final a0 f140b;

        /* renamed from: c */
        private final a9.c f141c;

        /* renamed from: d */
        private final p1 f142d;

        /* renamed from: e */
        private final int f143e;

        /* renamed from: f */
        private long f144f;

        /* renamed from: g */
        private int f145g;

        /* renamed from: h */
        private long f146h;

        public c(k kVar, a0 a0Var, a9.c cVar, String str, int i10) throws j2 {
            this.f139a = kVar;
            this.f140b = a0Var;
            this.f141c = cVar;
            int i11 = (cVar.f148b * cVar.f151e) / 8;
            int i12 = cVar.f150d;
            if (i12 == i11) {
                int i13 = cVar.f149c;
                int i14 = i13 * i11 * 8;
                int max = Math.max(i11, (i13 * i11) / 10);
                this.f143e = max;
                this.f142d = new p1.b().e0(str).G(i14).Z(i14).W(max).H(cVar.f148b).f0(cVar.f149c).Y(i10).E();
                return;
            }
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Expected block size: ");
            sb2.append(i11);
            sb2.append("; got: ");
            sb2.append(i12);
            throw j2.a(sb2.toString(), null);
        }

        @Override // a9.b.InterfaceC0007b
        public void a(int i10, long j10) {
            this.f139a.n(new e(this.f141c, 1, i10, j10));
            this.f140b.d(this.f142d);
        }

        @Override // a9.b.InterfaceC0007b
        public boolean b(j jVar, long j10) throws IOException {
            int i10;
            a9.c cVar;
            int i11;
            int i12;
            long j11 = j10;
            while (true) {
                i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i10 <= 0 || (i11 = this.f145g) >= (i12 = this.f143e)) {
                    break;
                }
                int c10 = this.f140b.c(jVar, (int) Math.min(i12 - i11, j11), true);
                if (c10 == -1) {
                    j11 = 0;
                } else {
                    this.f145g += c10;
                    j11 -= c10;
                }
            }
            int i13 = this.f141c.f150d;
            int i14 = this.f145g / i13;
            if (i14 > 0) {
                int i15 = i14 * i13;
                int i16 = this.f145g - i15;
                this.f140b.e(this.f144f + n0.O0(this.f146h, 1000000L, cVar.f149c), 1, i15, i16, null);
                this.f146h += i14;
                this.f145g = i16;
            }
            return i10 <= 0;
        }

        @Override // a9.b.InterfaceC0007b
        public void c(long j10) {
            this.f144f = j10;
            this.f145g = 0;
            this.f146h = 0L;
        }
    }

    static {
        a9.a aVar = new n() { // from class: a9.a
            @Override // p8.n
            public /* synthetic */ i[] a(Uri uri, Map map) {
                return m.a(this, uri, map);
            }

            @Override // p8.n
            public final i[] b() {
                return b.b();
            }
        };
    }

    public static /* synthetic */ i[] b() {
        return e();
    }

    private void d() {
        ea.a.h(this.f119b);
        n0.j(this.f118a);
    }

    public static /* synthetic */ i[] e() {
        return new i[]{new b()};
    }

    private void f(j jVar) throws IOException {
        ea.a.f(jVar.getPosition() == 0);
        int i10 = this.f123f;
        if (i10 != -1) {
            jVar.m(i10);
            this.f120c = 4;
        } else if (d.a(jVar)) {
            jVar.m((int) (jVar.i() - jVar.getPosition()));
            this.f120c = 1;
        } else {
            throw j2.a("Unsupported or unrecognized wav file type.", null);
        }
    }

    private void i(j jVar) throws IOException {
        a9.c b10 = d.b(jVar);
        int i10 = b10.f147a;
        if (i10 == 17) {
            this.f122e = new a(this.f118a, this.f119b, b10);
        } else if (i10 == 6) {
            this.f122e = new c(this.f118a, this.f119b, b10, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f122e = new c(this.f118a, this.f119b, b10, "audio/g711-mlaw", -1);
        } else {
            int a10 = l0.a(i10, b10.f151e);
            if (a10 != 0) {
                this.f122e = new c(this.f118a, this.f119b, b10, "audio/raw", a10);
            } else {
                int i11 = b10.f147a;
                StringBuilder sb2 = new StringBuilder(40);
                sb2.append("Unsupported WAV format type: ");
                sb2.append(i11);
                throw j2.d(sb2.toString());
            }
        }
        this.f120c = 3;
    }

    private void j(j jVar) throws IOException {
        this.f121d = d.c(jVar);
        this.f120c = 2;
    }

    private int k(j jVar) throws IOException {
        ea.a.f(this.f124g != -1);
        return ((InterfaceC0007b) ea.a.e(this.f122e)).b(jVar, this.f124g - jVar.getPosition()) ? -1 : 0;
    }

    private void l(j jVar) throws IOException {
        Pair<Long, Long> e10 = d.e(jVar);
        this.f123f = ((Long) e10.first).intValue();
        long longValue = ((Long) e10.second).longValue();
        long j10 = this.f121d;
        if (j10 != -1 && longValue == 4294967295L) {
            longValue = j10;
        }
        this.f124g = this.f123f + longValue;
        long b10 = jVar.b();
        if (b10 != -1) {
            long j11 = this.f124g;
            if (j11 > b10) {
                StringBuilder sb2 = new StringBuilder(69);
                sb2.append("Data exceeds input length: ");
                sb2.append(j11);
                sb2.append(", ");
                sb2.append(b10);
                r.h("WavExtractor", sb2.toString());
                this.f124g = b10;
            }
        }
        ((InterfaceC0007b) ea.a.e(this.f122e)).a(this.f123f, this.f124g);
        this.f120c = 4;
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        this.f120c = j10 == 0 ? 0 : 4;
        InterfaceC0007b interfaceC0007b = this.f122e;
        if (interfaceC0007b != null) {
            interfaceC0007b.c(j11);
        }
    }

    @Override // p8.i
    public void c(k kVar) {
        this.f118a = kVar;
        this.f119b = kVar.f(0, 1);
        kVar.r();
    }

    @Override // p8.i
    public int g(j jVar, w wVar) throws IOException {
        d();
        int i10 = this.f120c;
        if (i10 == 0) {
            f(jVar);
            return 0;
        } else if (i10 == 1) {
            j(jVar);
            return 0;
        } else if (i10 == 2) {
            i(jVar);
            return 0;
        } else if (i10 == 3) {
            l(jVar);
            return 0;
        } else if (i10 == 4) {
            return k(jVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // p8.i
    public boolean h(j jVar) throws IOException {
        return d.a(jVar);
    }

    @Override // p8.i
    public void release() {
    }
}
