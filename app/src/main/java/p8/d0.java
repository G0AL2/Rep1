package p8;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import ea.n0;
import j8.j2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: VorbisUtil.java */
/* loaded from: classes2.dex */
public final class d0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VorbisUtil.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
        }
    }

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f35632a;

        public b(String str, String[] strArr, int i10) {
            this.f35632a = strArr;
        }
    }

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f35633a;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f35633a = z10;
        }
    }

    /* compiled from: VorbisUtil.java */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f35634a;

        /* renamed from: b  reason: collision with root package name */
        public final int f35635b;

        /* renamed from: c  reason: collision with root package name */
        public final int f35636c;

        /* renamed from: d  reason: collision with root package name */
        public final int f35637d;

        /* renamed from: e  reason: collision with root package name */
        public final int f35638e;

        /* renamed from: f  reason: collision with root package name */
        public final int f35639f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f35640g;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f35634a = i11;
            this.f35635b = i12;
            this.f35636c = i13;
            this.f35637d = i14;
            this.f35638e = i16;
            this.f35639f = i17;
            this.f35640g = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    private static long b(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static Metadata c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] S0 = n0.S0(str, "=");
            if (S0.length != 2) {
                String valueOf = String.valueOf(str);
                ea.r.h("VorbisUtil", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else if (S0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.c(new ea.a0(Base64.decode(S0[1], 0))));
                } catch (RuntimeException e10) {
                    ea.r.i("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new VorbisComment(S0[0], S0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static a d(c0 c0Var) throws j2 {
        if (c0Var.d(24) == 5653314) {
            int d10 = c0Var.d(16);
            int d11 = c0Var.d(24);
            long[] jArr = new long[d11];
            boolean c10 = c0Var.c();
            long j10 = 0;
            if (!c10) {
                boolean c11 = c0Var.c();
                for (int i10 = 0; i10 < d11; i10++) {
                    if (c11) {
                        if (c0Var.c()) {
                            jArr[i10] = c0Var.d(5) + 1;
                        } else {
                            jArr[i10] = 0;
                        }
                    } else {
                        jArr[i10] = c0Var.d(5) + 1;
                    }
                }
            } else {
                int d12 = c0Var.d(5) + 1;
                int i11 = 0;
                while (i11 < d11) {
                    int d13 = c0Var.d(a(d11 - i11));
                    for (int i12 = 0; i12 < d13 && i11 < d11; i12++) {
                        jArr[i11] = d12;
                        i11++;
                    }
                    d12++;
                }
            }
            int d14 = c0Var.d(4);
            if (d14 <= 2) {
                if (d14 == 1 || d14 == 2) {
                    c0Var.e(32);
                    c0Var.e(32);
                    int d15 = c0Var.d(4) + 1;
                    c0Var.e(1);
                    if (d14 != 1) {
                        j10 = d11 * d10;
                    } else if (d10 != 0) {
                        j10 = b(d11, d10);
                    }
                    c0Var.e((int) (j10 * d15));
                }
                return new a(d10, d11, jArr, d14, c10);
            }
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("lookup type greater than 2 not decodable: ");
            sb2.append(d14);
            throw j2.a(sb2.toString(), null);
        }
        int b10 = c0Var.b();
        StringBuilder sb3 = new StringBuilder(66);
        sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
        sb3.append(b10);
        throw j2.a(sb3.toString(), null);
    }

    private static void e(c0 c0Var) throws j2 {
        int d10 = c0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            int d11 = c0Var.d(16);
            if (d11 == 0) {
                c0Var.e(8);
                c0Var.e(16);
                c0Var.e(16);
                c0Var.e(6);
                c0Var.e(8);
                int d12 = c0Var.d(4) + 1;
                for (int i11 = 0; i11 < d12; i11++) {
                    c0Var.e(8);
                }
            } else if (d11 == 1) {
                int d13 = c0Var.d(5);
                int i12 = -1;
                int[] iArr = new int[d13];
                for (int i13 = 0; i13 < d13; i13++) {
                    iArr[i13] = c0Var.d(4);
                    if (iArr[i13] > i12) {
                        i12 = iArr[i13];
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = c0Var.d(3) + 1;
                    int d14 = c0Var.d(2);
                    if (d14 > 0) {
                        c0Var.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << d14); i16++) {
                        c0Var.e(8);
                    }
                }
                c0Var.e(2);
                int d15 = c0Var.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < d13; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        c0Var.e(d15);
                        i18++;
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("floor type greater than 1 not decodable: ");
                sb2.append(d11);
                throw j2.a(sb2.toString(), null);
            }
        }
    }

    private static void f(int i10, c0 c0Var) throws j2 {
        int d10 = c0Var.d(6) + 1;
        for (int i11 = 0; i11 < d10; i11++) {
            int d11 = c0Var.d(16);
            if (d11 != 0) {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("mapping type other than 0 not supported: ");
                sb2.append(d11);
                ea.r.c("VorbisUtil", sb2.toString());
            } else {
                int d12 = c0Var.c() ? c0Var.d(4) + 1 : 1;
                if (c0Var.c()) {
                    int d13 = c0Var.d(8) + 1;
                    for (int i12 = 0; i12 < d13; i12++) {
                        int i13 = i10 - 1;
                        c0Var.e(a(i13));
                        c0Var.e(a(i13));
                    }
                }
                if (c0Var.d(2) != 0) {
                    throw j2.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (d12 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        c0Var.e(4);
                    }
                }
                for (int i15 = 0; i15 < d12; i15++) {
                    c0Var.e(8);
                    c0Var.e(8);
                    c0Var.e(8);
                }
            }
        }
    }

    private static c[] g(c0 c0Var) {
        int d10 = c0Var.d(6) + 1;
        c[] cVarArr = new c[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            cVarArr[i10] = new c(c0Var.c(), c0Var.d(16), c0Var.d(16), c0Var.d(8));
        }
        return cVarArr;
    }

    private static void h(c0 c0Var) throws j2 {
        int d10 = c0Var.d(6) + 1;
        for (int i10 = 0; i10 < d10; i10++) {
            if (c0Var.d(16) <= 2) {
                c0Var.e(24);
                c0Var.e(24);
                c0Var.e(24);
                int d11 = c0Var.d(6) + 1;
                c0Var.e(8);
                int[] iArr = new int[d11];
                for (int i11 = 0; i11 < d11; i11++) {
                    iArr[i11] = ((c0Var.c() ? c0Var.d(5) : 0) * 8) + c0Var.d(3);
                }
                for (int i12 = 0; i12 < d11; i12++) {
                    for (int i13 = 0; i13 < 8; i13++) {
                        if ((iArr[i12] & (1 << i13)) != 0) {
                            c0Var.e(8);
                        }
                    }
                }
            } else {
                throw j2.a("residueType greater than 2 is not decodable", null);
            }
        }
    }

    public static b i(ea.a0 a0Var) throws j2 {
        return j(a0Var, true, true);
    }

    public static b j(ea.a0 a0Var, boolean z10, boolean z11) throws j2 {
        if (z10) {
            m(3, a0Var, false);
        }
        String A = a0Var.A((int) a0Var.t());
        int length = 11 + A.length();
        long t10 = a0Var.t();
        String[] strArr = new String[(int) t10];
        int i10 = length + 4;
        for (int i11 = 0; i11 < t10; i11++) {
            strArr[i11] = a0Var.A((int) a0Var.t());
            i10 = i10 + 4 + strArr[i11].length();
        }
        if (z11 && (a0Var.D() & 1) == 0) {
            throw j2.a("framing bit expected to be set", null);
        }
        return new b(A, strArr, i10 + 1);
    }

    public static d k(ea.a0 a0Var) throws j2 {
        m(1, a0Var, false);
        int u10 = a0Var.u();
        int D = a0Var.D();
        int u11 = a0Var.u();
        int q10 = a0Var.q();
        if (q10 <= 0) {
            q10 = -1;
        }
        int q11 = a0Var.q();
        if (q11 <= 0) {
            q11 = -1;
        }
        int q12 = a0Var.q();
        if (q12 <= 0) {
            q12 = -1;
        }
        int D2 = a0Var.D();
        return new d(u10, D, u11, q10, q11, q12, (int) Math.pow(2.0d, D2 & 15), (int) Math.pow(2.0d, (D2 & 240) >> 4), (a0Var.D() & 1) > 0, Arrays.copyOf(a0Var.d(), a0Var.f()));
    }

    public static c[] l(ea.a0 a0Var, int i10) throws j2 {
        m(5, a0Var, false);
        int D = a0Var.D() + 1;
        c0 c0Var = new c0(a0Var.d());
        c0Var.e(a0Var.e() * 8);
        for (int i11 = 0; i11 < D; i11++) {
            d(c0Var);
        }
        int d10 = c0Var.d(6) + 1;
        for (int i12 = 0; i12 < d10; i12++) {
            if (c0Var.d(16) != 0) {
                throw j2.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        e(c0Var);
        h(c0Var);
        f(i10, c0Var);
        c[] g10 = g(c0Var);
        if (c0Var.c()) {
            return g10;
        }
        throw j2.a("framing bit after modes not set as expected", null);
    }

    public static boolean m(int i10, ea.a0 a0Var, boolean z10) throws j2 {
        if (a0Var.a() < 7) {
            if (z10) {
                return false;
            }
            int a10 = a0Var.a();
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("too short header: ");
            sb2.append(a10);
            throw j2.a(sb2.toString(), null);
        } else if (a0Var.D() != i10) {
            if (z10) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i10));
            throw j2.a(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "), null);
        } else if (a0Var.D() == 118 && a0Var.D() == 111 && a0Var.D() == 114 && a0Var.D() == 98 && a0Var.D() == 105 && a0Var.D() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw j2.a("expected characters 'vorbis'", null);
        }
    }
}
