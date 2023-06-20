package com.google.android.exoplayer2.metadata.id3;

import c9.d;
import c9.f;
import com.google.android.exoplayer2.metadata.Metadata;
import com.inmobi.media.fq;
import ea.a0;
import ea.n0;
import ea.r;
import ea.z;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: Id3Decoder.java */
/* loaded from: classes2.dex */
public final class a extends f {

    /* renamed from: b */
    public static final InterfaceC0288a f21213b = new InterfaceC0288a() { // from class: g9.a
        @Override // com.google.android.exoplayer2.metadata.id3.a.InterfaceC0288a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return com.google.android.exoplayer2.metadata.id3.a.c(i10, i11, i12, i13, i14);
        }
    };

    /* renamed from: a */
    private final InterfaceC0288a f21214a;

    /* compiled from: Id3Decoder.java */
    /* renamed from: com.google.android.exoplayer2.metadata.id3.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC0288a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* compiled from: Id3Decoder.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final int f21215a;

        /* renamed from: b */
        private final boolean f21216b;

        /* renamed from: c */
        private final int f21217c;

        public b(int i10, boolean z10, int i11) {
            this.f21215a = i10;
            this.f21216b = z10;
            this.f21217c = i11;
        }
    }

    public a() {
        this(null);
    }

    private static int A(a0 a0Var, int i10) {
        byte[] d10 = a0Var.d();
        int e10 = a0Var.e();
        int i11 = e10;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= e10 + i10) {
                return i10;
            }
            if ((d10[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 255 && d10[i12] == 0) {
                System.arraycopy(d10, i11 + 2, d10, i12, (i10 - (i11 - e10)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0086, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean B(ea.a0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.e()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.n()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.F()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.J()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.G()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.G()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.P(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4b
            r1.P(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = 0
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = 0
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = 1
            goto L84
        L83:
            r3 = 0
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = 0
            goto L79
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L98
            r1.P(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La5
            r1.P(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.Q(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.P(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.P(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.a.B(ea.a0, int, int, boolean):boolean");
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return z(i10, i11, i12, i13, i14);
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return n0.f29714f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    private static ApicFrame f(a0 a0Var, int i10, int i11) throws UnsupportedEncodingException {
        int y10;
        String str;
        int D = a0Var.D();
        String v10 = v(D);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        a0Var.j(bArr, 0, i12);
        if (i11 == 2) {
            String valueOf = String.valueOf(ib.b.e(new String(bArr, 0, 3, "ISO-8859-1")));
            str = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            y10 = 2;
        } else {
            y10 = y(bArr, 0);
            String e10 = ib.b.e(new String(bArr, 0, y10, "ISO-8859-1"));
            if (e10.indexOf(47) == -1) {
                if (e10.length() != 0) {
                    str = "image/".concat(e10);
                } else {
                    e10 = new String("image/");
                }
            }
            str = e10;
        }
        int i13 = bArr[y10 + 1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
        int i14 = y10 + 2;
        int x10 = x(bArr, i14, D);
        return new ApicFrame(str, new String(bArr, i14, x10 - i14, v10), i13, d(bArr, x10 + u(D), i12));
    }

    private static BinaryFrame g(a0 a0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame h(a0 a0Var, int i10, int i11, boolean z10, int i12, InterfaceC0288a interfaceC0288a) throws UnsupportedEncodingException {
        int e10 = a0Var.e();
        int y10 = y(a0Var.d(), e10);
        String str = new String(a0Var.d(), e10, y10 - e10, "ISO-8859-1");
        a0Var.P(y10 + 1);
        int n10 = a0Var.n();
        int n11 = a0Var.n();
        long F = a0Var.F();
        long j10 = F == 4294967295L ? -1L : F;
        long F2 = a0Var.F();
        long j11 = F2 == 4294967295L ? -1L : F2;
        ArrayList arrayList = new ArrayList();
        int i13 = e10 + i10;
        while (a0Var.e() < i13) {
            Id3Frame k10 = k(i11, a0Var, z10, i12, interfaceC0288a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new ChapterFrame(str, n10, n11, j10, j11, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame i(a0 a0Var, int i10, int i11, boolean z10, int i12, InterfaceC0288a interfaceC0288a) throws UnsupportedEncodingException {
        int e10 = a0Var.e();
        int y10 = y(a0Var.d(), e10);
        String str = new String(a0Var.d(), e10, y10 - e10, "ISO-8859-1");
        a0Var.P(y10 + 1);
        int D = a0Var.D();
        boolean z11 = (D & 2) != 0;
        boolean z12 = (D & 1) != 0;
        int D2 = a0Var.D();
        String[] strArr = new String[D2];
        for (int i13 = 0; i13 < D2; i13++) {
            int e11 = a0Var.e();
            int y11 = y(a0Var.d(), e11);
            strArr[i13] = new String(a0Var.d(), e11, y11 - e11, "ISO-8859-1");
            a0Var.P(y11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = e10 + i10;
        while (a0Var.e() < i14) {
            Id3Frame k10 = k(i11, a0Var, z10, i12, interfaceC0288a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new ChapterTocFrame(str, z11, z12, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static CommentFrame j(a0 a0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int D = a0Var.D();
        String v10 = v(D);
        byte[] bArr = new byte[3];
        a0Var.j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        a0Var.j(bArr2, 0, i11);
        int x10 = x(bArr2, 0, D);
        String str2 = new String(bArr2, 0, x10, v10);
        int u10 = x10 + u(D);
        return new CommentFrame(str, str2, p(bArr2, u10, x(bArr2, u10, D), v10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x0190, code lost:
        if (r13 == 67) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame k(int r19, ea.a0 r20, boolean r21, int r22, com.google.android.exoplayer2.metadata.id3.a.InterfaceC0288a r23) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.a.k(int, ea.a0, boolean, int, com.google.android.exoplayer2.metadata.id3.a$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    private static GeobFrame l(a0 a0Var, int i10) throws UnsupportedEncodingException {
        int D = a0Var.D();
        String v10 = v(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        int y10 = y(bArr, 0);
        String str = new String(bArr, 0, y10, "ISO-8859-1");
        int i12 = y10 + 1;
        int x10 = x(bArr, i12, D);
        String p10 = p(bArr, i12, x10, v10);
        int u10 = x10 + u(D);
        int x11 = x(bArr, u10, D);
        return new GeobFrame(str, p10, p(bArr, u10, x11, v10), d(bArr, x11 + u(D), i11));
    }

    private static b m(a0 a0Var) {
        if (a0Var.a() < 10) {
            r.h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int G = a0Var.G();
        boolean z10 = false;
        if (G != 4801587) {
            String valueOf = String.valueOf(String.format("%06X", Integer.valueOf(G)));
            r.h("Id3Decoder", valueOf.length() != 0 ? "Unexpected first three bytes of ID3 tag header: 0x".concat(valueOf) : new String("Unexpected first three bytes of ID3 tag header: 0x"));
            return null;
        }
        int D = a0Var.D();
        a0Var.Q(1);
        int D2 = a0Var.D();
        int C = a0Var.C();
        if (D == 2) {
            if ((D2 & 64) != 0) {
                r.h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (D == 3) {
            if ((D2 & 64) != 0) {
                int n10 = a0Var.n();
                a0Var.Q(n10);
                C -= n10 + 4;
            }
        } else if (D != 4) {
            StringBuilder sb2 = new StringBuilder(57);
            sb2.append("Skipped ID3 tag with unsupported majorVersion=");
            sb2.append(D);
            r.h("Id3Decoder", sb2.toString());
            return null;
        } else {
            if ((D2 & 64) != 0) {
                int C2 = a0Var.C();
                a0Var.Q(C2 - 4);
                C -= C2;
            }
            if ((D2 & 16) != 0) {
                C -= 10;
            }
        }
        if (D < 4 && (D2 & 128) != 0) {
            z10 = true;
        }
        return new b(D, z10, C);
    }

    private static MlltFrame n(a0 a0Var, int i10) {
        int J = a0Var.J();
        int G = a0Var.G();
        int G2 = a0Var.G();
        int D = a0Var.D();
        int D2 = a0Var.D();
        z zVar = new z();
        zVar.m(a0Var);
        int i11 = ((i10 - 10) * 8) / (D + D2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = zVar.h(D);
            int h11 = zVar.h(D2);
            iArr[i12] = h10;
            iArr2[i12] = h11;
        }
        return new MlltFrame(J, G, G2, iArr, iArr2);
    }

    private static PrivFrame o(a0 a0Var, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        int y10 = y(bArr, 0);
        return new PrivFrame(new String(bArr, 0, y10, "ISO-8859-1"), d(bArr, y10 + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    private static TextInformationFrame q(a0 a0Var, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int D = a0Var.D();
        String v10 = v(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        return new TextInformationFrame(str, null, new String(bArr, 0, x(bArr, 0, D), v10));
    }

    private static TextInformationFrame r(a0 a0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int D = a0Var.D();
        String v10 = v(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        int x10 = x(bArr, 0, D);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(D);
        return new TextInformationFrame("TXXX", str, p(bArr, u10, x(bArr, u10, D), v10));
    }

    private static UrlLinkFrame s(a0 a0Var, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        a0Var.j(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, y(bArr, 0), "ISO-8859-1"));
    }

    private static UrlLinkFrame t(a0 a0Var, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int D = a0Var.D();
        String v10 = v(D);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        a0Var.j(bArr, 0, i11);
        int x10 = x(bArr, 0, D);
        String str = new String(bArr, 0, x10, v10);
        int u10 = x10 + u(D);
        return new UrlLinkFrame("WXXX", str, p(bArr, u10, y(bArr, u10), "ISO-8859-1"));
    }

    private static int u(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static String v(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String w(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int x(byte[] bArr, int i10, int i11) {
        int y10 = y(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return y10;
        }
        while (y10 < bArr.length - 1) {
            if ((y10 - i10) % 2 == 0 && bArr[y10 + 1] == 0) {
                return y10;
            }
            y10 = y(bArr, y10 + 1);
        }
        return bArr.length;
    }

    private static int y(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean z(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // c9.f
    protected Metadata b(d dVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    public Metadata e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        a0 a0Var = new a0(bArr, i10);
        b m10 = m(a0Var);
        if (m10 == null) {
            return null;
        }
        int e10 = a0Var.e();
        int i11 = m10.f21215a == 2 ? 6 : 10;
        int i12 = m10.f21217c;
        if (m10.f21216b) {
            i12 = A(a0Var, m10.f21217c);
        }
        a0Var.O(e10 + i12);
        boolean z10 = false;
        if (!B(a0Var, m10.f21215a, i11, false)) {
            if (m10.f21215a != 4 || !B(a0Var, 4, i11, true)) {
                int i13 = m10.f21215a;
                StringBuilder sb2 = new StringBuilder(56);
                sb2.append("Failed to validate ID3 tag with majorVersion=");
                sb2.append(i13);
                r.h("Id3Decoder", sb2.toString());
                return null;
            }
            z10 = true;
        }
        while (a0Var.a() >= i11) {
            Id3Frame k10 = k(m10.f21215a, a0Var, z10, i11, this.f21214a);
            if (k10 != null) {
                arrayList.add(k10);
            }
        }
        return new Metadata(arrayList);
    }

    public a(InterfaceC0288a interfaceC0288a) {
        this.f21214a = interfaceC0288a;
    }
}
