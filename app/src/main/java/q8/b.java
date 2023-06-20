package q8;

import android.net.Uri;
import ea.n0;
import j8.j2;
import j8.p1;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import p8.a0;
import p8.e;
import p8.i;
import p8.j;
import p8.k;
import p8.m;
import p8.n;
import p8.w;
import p8.x;

/* compiled from: AmrExtractor.java */
/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: p */
    private static final int[] f35975p;

    /* renamed from: q */
    private static final int[] f35976q;

    /* renamed from: r */
    private static final byte[] f35977r;

    /* renamed from: s */
    private static final byte[] f35978s;

    /* renamed from: t */
    private static final int f35979t;

    /* renamed from: a */
    private final byte[] f35980a;

    /* renamed from: b */
    private final int f35981b;

    /* renamed from: c */
    private boolean f35982c;

    /* renamed from: d */
    private long f35983d;

    /* renamed from: e */
    private int f35984e;

    /* renamed from: f */
    private int f35985f;

    /* renamed from: g */
    private boolean f35986g;

    /* renamed from: h */
    private long f35987h;

    /* renamed from: i */
    private int f35988i;

    /* renamed from: j */
    private int f35989j;

    /* renamed from: k */
    private long f35990k;

    /* renamed from: l */
    private k f35991l;

    /* renamed from: m */
    private a0 f35992m;

    /* renamed from: n */
    private x f35993n;

    /* renamed from: o */
    private boolean f35994o;

    static {
        a aVar = new n() { // from class: q8.a
            @Override // p8.n
            public /* synthetic */ i[] a(Uri uri, Map map) {
                return m.a(this, uri, map);
            }

            @Override // p8.n
            public final i[] b() {
                return b.b();
            }
        };
        f35975p = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f35976q = iArr;
        f35977r = n0.p0("#!AMR\n");
        f35978s = n0.p0("#!AMR-WB\n");
        f35979t = iArr[8];
    }

    public b() {
        this(0);
    }

    public static /* synthetic */ i[] b() {
        return m();
    }

    private void d() {
        ea.a.h(this.f35992m);
        n0.j(this.f35991l);
    }

    private static int e(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    private x f(long j10, boolean z10) {
        return new e(j10, this.f35987h, e(this.f35988i, 20000L), this.f35988i, z10);
    }

    private int i(int i10) throws j2 {
        if (k(i10)) {
            return this.f35982c ? f35976q[i10] : f35975p[i10];
        }
        String str = this.f35982c ? "WB" : "NB";
        StringBuilder sb2 = new StringBuilder(str.length() + 35);
        sb2.append("Illegal AMR ");
        sb2.append(str);
        sb2.append(" frame type ");
        sb2.append(i10);
        throw j2.a(sb2.toString(), null);
    }

    private boolean j(int i10) {
        return !this.f35982c && (i10 < 12 || i10 > 14);
    }

    private boolean k(int i10) {
        return i10 >= 0 && i10 <= 15 && (l(i10) || j(i10));
    }

    private boolean l(int i10) {
        return this.f35982c && (i10 < 10 || i10 > 13);
    }

    public static /* synthetic */ i[] m() {
        return new i[]{new b()};
    }

    private void n() {
        if (this.f35994o) {
            return;
        }
        this.f35994o = true;
        boolean z10 = this.f35982c;
        this.f35992m.d(new p1.b().e0(z10 ? "audio/amr-wb" : "audio/3gpp").W(f35979t).H(1).f0(z10 ? 16000 : 8000).E());
    }

    private void o(long j10, int i10) {
        int i11;
        if (this.f35986g) {
            return;
        }
        int i12 = this.f35981b;
        if ((i12 & 1) != 0 && j10 != -1 && ((i11 = this.f35988i) == -1 || i11 == this.f35984e)) {
            if (this.f35989j >= 20 || i10 == -1) {
                x f10 = f(j10, (i12 & 2) != 0);
                this.f35993n = f10;
                this.f35991l.n(f10);
                this.f35986g = true;
                return;
            }
            return;
        }
        x.b bVar = new x.b(-9223372036854775807L);
        this.f35993n = bVar;
        this.f35991l.n(bVar);
        this.f35986g = true;
    }

    private static boolean p(j jVar, byte[] bArr) throws IOException {
        jVar.f();
        byte[] bArr2 = new byte[bArr.length];
        jVar.p(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int q(j jVar) throws IOException {
        jVar.f();
        jVar.p(this.f35980a, 0, 1);
        byte b10 = this.f35980a[0];
        if ((b10 & 131) <= 0) {
            return i((b10 >> 3) & 15);
        }
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("Invalid padding bits for frame header ");
        sb2.append((int) b10);
        throw j2.a(sb2.toString(), null);
    }

    private boolean r(j jVar) throws IOException {
        byte[] bArr = f35977r;
        if (p(jVar, bArr)) {
            this.f35982c = false;
            jVar.m(bArr.length);
            return true;
        }
        byte[] bArr2 = f35978s;
        if (p(jVar, bArr2)) {
            this.f35982c = true;
            jVar.m(bArr2.length);
            return true;
        }
        return false;
    }

    private int s(j jVar) throws IOException {
        if (this.f35985f == 0) {
            try {
                int q10 = q(jVar);
                this.f35984e = q10;
                this.f35985f = q10;
                if (this.f35988i == -1) {
                    this.f35987h = jVar.getPosition();
                    this.f35988i = this.f35984e;
                }
                if (this.f35988i == this.f35984e) {
                    this.f35989j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int c10 = this.f35992m.c(jVar, this.f35985f, true);
        if (c10 == -1) {
            return -1;
        }
        int i10 = this.f35985f - c10;
        this.f35985f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f35992m.e(this.f35990k + this.f35983d, 1, this.f35984e, 0, null);
        this.f35983d += 20000;
        return 0;
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        this.f35983d = 0L;
        this.f35984e = 0;
        this.f35985f = 0;
        if (j10 != 0) {
            x xVar = this.f35993n;
            if (xVar instanceof e) {
                this.f35990k = ((e) xVar).c(j10);
                return;
            }
        }
        this.f35990k = 0L;
    }

    @Override // p8.i
    public void c(k kVar) {
        this.f35991l = kVar;
        this.f35992m = kVar.f(0, 1);
        kVar.r();
    }

    @Override // p8.i
    public int g(j jVar, w wVar) throws IOException {
        d();
        if (jVar.getPosition() == 0 && !r(jVar)) {
            throw j2.a("Could not find AMR header.", null);
        }
        n();
        int s10 = s(jVar);
        o(jVar.b(), s10);
        return s10;
    }

    @Override // p8.i
    public boolean h(j jVar) throws IOException {
        return r(jVar);
    }

    @Override // p8.i
    public void release() {
    }

    public b(int i10) {
        this.f35981b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f35980a = new byte[1];
        this.f35988i = -1;
    }
}
