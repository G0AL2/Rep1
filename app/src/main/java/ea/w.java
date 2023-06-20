package ea;

import com.inmobi.media.fq;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: NalUnitUtil.java */
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f29749a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f29750b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    private static final Object f29751c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static int[] f29752d = new int[10];

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f29753a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f29754b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29755c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29756d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f29757e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29758f;

        /* renamed from: g  reason: collision with root package name */
        public final int f29759g;

        /* renamed from: h  reason: collision with root package name */
        public final int f29760h;

        /* renamed from: i  reason: collision with root package name */
        public final float f29761i;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10) {
            this.f29753a = i10;
            this.f29754b = z10;
            this.f29755c = i11;
            this.f29756d = i12;
            this.f29757e = iArr;
            this.f29758f = i13;
            this.f29759g = i15;
            this.f29760h = i16;
            this.f29761i = f10;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f29762a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29763b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f29764c;

        public b(int i10, int i11, boolean z10) {
            this.f29762a = i10;
            this.f29763b = i11;
            this.f29764c = z10;
        }
    }

    /* compiled from: NalUnitUtil.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f29765a;

        /* renamed from: b  reason: collision with root package name */
        public final int f29766b;

        /* renamed from: c  reason: collision with root package name */
        public final int f29767c;

        /* renamed from: d  reason: collision with root package name */
        public final int f29768d;

        /* renamed from: e  reason: collision with root package name */
        public final int f29769e;

        /* renamed from: f  reason: collision with root package name */
        public final int f29770f;

        /* renamed from: g  reason: collision with root package name */
        public final float f29771g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f29772h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f29773i;

        /* renamed from: j  reason: collision with root package name */
        public final int f29774j;

        /* renamed from: k  reason: collision with root package name */
        public final int f29775k;

        /* renamed from: l  reason: collision with root package name */
        public final int f29776l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f29777m;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f29765a = i10;
            this.f29766b = i11;
            this.f29767c = i12;
            this.f29768d = i13;
            this.f29769e = i14;
            this.f29770f = i15;
            this.f29771g = f10;
            this.f29772h = z10;
            this.f29773i = z11;
            this.f29774j = i16;
            this.f29775k = i17;
            this.f29776l = i18;
            this.f29777m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 < position) {
                int i13 = byteBuffer.get(i10) & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                if (i11 == 3) {
                    if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i10 - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i13 == 0) {
                    i11++;
                }
                if (i13 != 0) {
                    i11 = 0;
                }
                i10 = i12;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        ea.a.f(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        } else if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        } else if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        } else {
            int i13 = i11 - 1;
            int i14 = i10 + 2;
            while (i14 < i13) {
                if ((bArr[i14] & 254) == 0) {
                    int i15 = i14 - 2;
                    if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && bArr[i14] == 1) {
                        a(zArr);
                        return i15;
                    }
                    i14 -= 2;
                }
                i14 += 3;
            }
            zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
            zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
            zArr[2] = bArr[i13] == 0;
            return i11;
        }
    }

    private static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    public static a i(byte[] bArr, int i10, int i11) {
        b0 b0Var = new b0(bArr, i10, i11);
        b0Var.l(4);
        int e10 = b0Var.e(3);
        b0Var.k();
        int e11 = b0Var.e(2);
        boolean d10 = b0Var.d();
        int e12 = b0Var.e(5);
        int i12 = 0;
        for (int i13 = 0; i13 < 32; i13++) {
            if (b0Var.d()) {
                i12 |= 1 << i13;
            }
        }
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = b0Var.e(8);
        }
        int e13 = b0Var.e(8);
        int i15 = 0;
        for (int i16 = 0; i16 < e10; i16++) {
            if (b0Var.d()) {
                i15 += 89;
            }
            if (b0Var.d()) {
                i15 += 8;
            }
        }
        b0Var.l(i15);
        if (e10 > 0) {
            b0Var.l((8 - e10) * 2);
        }
        int h10 = b0Var.h();
        int h11 = b0Var.h();
        if (h11 == 3) {
            b0Var.k();
        }
        int h12 = b0Var.h();
        int h13 = b0Var.h();
        if (b0Var.d()) {
            int h14 = b0Var.h();
            int h15 = b0Var.h();
            int h16 = b0Var.h();
            int h17 = b0Var.h();
            h12 -= ((h11 == 1 || h11 == 2) ? 2 : 1) * (h14 + h15);
            h13 -= (h11 == 1 ? 2 : 1) * (h16 + h17);
        }
        b0Var.h();
        b0Var.h();
        int h18 = b0Var.h();
        for (int i17 = b0Var.d() ? 0 : e10; i17 <= e10; i17++) {
            b0Var.h();
            b0Var.h();
            b0Var.h();
        }
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        b0Var.h();
        if (b0Var.d() && b0Var.d()) {
            n(b0Var);
        }
        b0Var.l(2);
        if (b0Var.d()) {
            b0Var.l(8);
            b0Var.h();
            b0Var.h();
            b0Var.k();
        }
        p(b0Var);
        if (b0Var.d()) {
            for (int i18 = 0; i18 < b0Var.h(); i18++) {
                b0Var.l(h18 + 4 + 1);
            }
        }
        b0Var.l(2);
        float f10 = 1.0f;
        if (b0Var.d()) {
            if (b0Var.d()) {
                int e14 = b0Var.e(8);
                if (e14 == 255) {
                    int e15 = b0Var.e(16);
                    int e16 = b0Var.e(16);
                    if (e15 != 0 && e16 != 0) {
                        f10 = e15 / e16;
                    }
                } else {
                    float[] fArr = f29750b;
                    if (e14 < fArr.length) {
                        f10 = fArr[e14];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(e14);
                        r.h("NalUnitUtil", sb2.toString());
                    }
                }
            }
            if (b0Var.d()) {
                b0Var.k();
            }
            if (b0Var.d()) {
                b0Var.l(4);
                if (b0Var.d()) {
                    b0Var.l(24);
                }
            }
            if (b0Var.d()) {
                b0Var.h();
                b0Var.h();
            }
            b0Var.k();
            if (b0Var.d()) {
                h13 *= 2;
            }
        }
        return new a(e11, d10, e12, i12, iArr, e13, h10, h12, h13, f10);
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        b0 b0Var = new b0(bArr, i10, i11);
        int h10 = b0Var.h();
        int h11 = b0Var.h();
        b0Var.k();
        return new b(h10, h11, b0Var.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ea.w.c m(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.w.m(byte[], int, int):ea.w$c");
    }

    private static void n(b0 b0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (!b0Var.d()) {
                    b0Var.h();
                } else {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        b0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        b0Var.g();
                    }
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void o(b0 b0Var, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((b0Var.g() + i12) + 256) % 256;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    private static void p(b0 b0Var) {
        int h10 = b0Var.h();
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < h10; i11++) {
            if (i11 != 0) {
                z10 = b0Var.d();
            }
            if (z10) {
                b0Var.k();
                b0Var.h();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (!b0Var.d()) {
                        b0Var.k();
                    }
                }
            } else {
                int h11 = b0Var.h();
                int h12 = b0Var.h();
                int i13 = h11 + h12;
                for (int i14 = 0; i14 < h11; i14++) {
                    b0Var.h();
                    b0Var.k();
                }
                for (int i15 = 0; i15 < h12; i15++) {
                    b0Var.h();
                    b0Var.k();
                }
                i10 = i13;
            }
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f29751c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f29752d;
                        if (iArr.length <= i13) {
                            f29752d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f29752d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f29752d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
