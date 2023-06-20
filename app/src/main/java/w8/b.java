package w8;

import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry;
import ea.a0;
import ea.n0;
import ea.v;
import j8.j2;
import j8.p1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jb.s;
import p8.t;
import w8.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AtomParsers.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f38325a = n0.p0("OpusHead");

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f38326a;

        /* renamed from: b  reason: collision with root package name */
        public int f38327b;

        /* renamed from: c  reason: collision with root package name */
        public int f38328c;

        /* renamed from: d  reason: collision with root package name */
        public long f38329d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f38330e;

        /* renamed from: f  reason: collision with root package name */
        private final a0 f38331f;

        /* renamed from: g  reason: collision with root package name */
        private final a0 f38332g;

        /* renamed from: h  reason: collision with root package name */
        private int f38333h;

        /* renamed from: i  reason: collision with root package name */
        private int f38334i;

        public a(a0 a0Var, a0 a0Var2, boolean z10) throws j2 {
            this.f38332g = a0Var;
            this.f38331f = a0Var2;
            this.f38330e = z10;
            a0Var2.P(12);
            this.f38326a = a0Var2.H();
            a0Var.P(12);
            this.f38334i = a0Var.H();
            p8.l.a(a0Var.n() == 1, "first_chunk must be 1");
            this.f38327b = -1;
        }

        public boolean a() {
            long F;
            int i10 = this.f38327b + 1;
            this.f38327b = i10;
            if (i10 == this.f38326a) {
                return false;
            }
            if (this.f38330e) {
                F = this.f38331f.I();
            } else {
                F = this.f38331f.F();
            }
            this.f38329d = F;
            if (this.f38327b == this.f38333h) {
                this.f38328c = this.f38332g.H();
                this.f38332g.Q(4);
                int i11 = this.f38334i - 1;
                this.f38334i = i11;
                this.f38333h = i11 > 0 ? this.f38332g.H() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AtomParsers.java */
    /* renamed from: w8.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0530b {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final p[] f38335a;

        /* renamed from: b  reason: collision with root package name */
        public p1 f38336b;

        /* renamed from: c  reason: collision with root package name */
        public int f38337c;

        /* renamed from: d  reason: collision with root package name */
        public int f38338d = 0;

        public c(int i10) {
            this.f38335a = new p[i10];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public static final class d implements InterfaceC0530b {

        /* renamed from: a  reason: collision with root package name */
        private final int f38339a;

        /* renamed from: b  reason: collision with root package name */
        private final int f38340b;

        /* renamed from: c  reason: collision with root package name */
        private final a0 f38341c;

        public d(a.b bVar, p1 p1Var) {
            a0 a0Var = bVar.f38324b;
            this.f38341c = a0Var;
            a0Var.P(12);
            int H = a0Var.H();
            if ("audio/raw".equals(p1Var.f32709l)) {
                int f02 = n0.f0(p1Var.A, p1Var.f32722y);
                if (H == 0 || H % f02 != 0) {
                    StringBuilder sb2 = new StringBuilder(88);
                    sb2.append("Audio sample size mismatch. stsd sample size: ");
                    sb2.append(f02);
                    sb2.append(", stsz sample size: ");
                    sb2.append(H);
                    ea.r.h("AtomParsers", sb2.toString());
                    H = f02;
                }
            }
            this.f38339a = H == 0 ? -1 : H;
            this.f38340b = a0Var.H();
        }

        @Override // w8.b.InterfaceC0530b
        public int a() {
            int i10 = this.f38339a;
            return i10 == -1 ? this.f38341c.H() : i10;
        }

        @Override // w8.b.InterfaceC0530b
        public int b() {
            return this.f38339a;
        }

        @Override // w8.b.InterfaceC0530b
        public int c() {
            return this.f38340b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public static final class e implements InterfaceC0530b {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f38342a;

        /* renamed from: b  reason: collision with root package name */
        private final int f38343b;

        /* renamed from: c  reason: collision with root package name */
        private final int f38344c;

        /* renamed from: d  reason: collision with root package name */
        private int f38345d;

        /* renamed from: e  reason: collision with root package name */
        private int f38346e;

        public e(a.b bVar) {
            a0 a0Var = bVar.f38324b;
            this.f38342a = a0Var;
            a0Var.P(12);
            this.f38344c = a0Var.H() & 255;
            this.f38343b = a0Var.H();
        }

        @Override // w8.b.InterfaceC0530b
        public int a() {
            int i10 = this.f38344c;
            if (i10 == 8) {
                return this.f38342a.D();
            }
            if (i10 == 16) {
                return this.f38342a.J();
            }
            int i11 = this.f38345d;
            this.f38345d = i11 + 1;
            if (i11 % 2 == 0) {
                int D = this.f38342a.D();
                this.f38346e = D;
                return (D & 240) >> 4;
            }
            return this.f38346e & 15;
        }

        @Override // w8.b.InterfaceC0530b
        public int b() {
            return -1;
        }

        @Override // w8.b.InterfaceC0530b
        public int c() {
            return this.f38343b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AtomParsers.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final int f38347a;

        /* renamed from: b  reason: collision with root package name */
        private final long f38348b;

        /* renamed from: c  reason: collision with root package name */
        private final int f38349c;

        public f(int i10, long j10, int i11) {
            this.f38347a = i10;
            this.f38348b = j10;
            this.f38349c = i11;
        }
    }

    public static List<r> A(a.C0529a c0529a, t tVar, long j10, DrmInitData drmInitData, boolean z10, boolean z11, ib.f<o, o> fVar) throws j2 {
        o apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0529a.f38323d.size(); i10++) {
            a.C0529a c0529a2 = c0529a.f38323d.get(i10);
            if (c0529a2.f38320a == 1953653099 && (apply = fVar.apply(z(c0529a2, (a.b) ea.a.e(c0529a.g(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(v(apply, (a.C0529a) ea.a.e(((a.C0529a) ea.a.e(((a.C0529a) ea.a.e(c0529a2.f(1835297121))).f(1835626086))).f(1937007212)), tVar));
            }
        }
        return arrayList;
    }

    public static Pair<Metadata, Metadata> B(a.b bVar) {
        a0 a0Var = bVar.f38324b;
        a0Var.P(8);
        Metadata metadata = null;
        Metadata metadata2 = null;
        while (a0Var.a() >= 8) {
            int e10 = a0Var.e();
            int n10 = a0Var.n();
            int n11 = a0Var.n();
            if (n11 == 1835365473) {
                a0Var.P(e10);
                metadata = C(a0Var, e10 + n10);
            } else if (n11 == 1936553057) {
                a0Var.P(e10);
                metadata2 = u(a0Var, e10 + n10);
            }
            a0Var.P(e10 + n10);
        }
        return Pair.create(metadata, metadata2);
    }

    private static Metadata C(a0 a0Var, int i10) {
        a0Var.Q(8);
        e(a0Var);
        while (a0Var.e() < i10) {
            int e10 = a0Var.e();
            int n10 = a0Var.n();
            if (a0Var.n() == 1768715124) {
                a0Var.P(e10);
                return l(a0Var, e10 + n10);
            }
            a0Var.P(e10 + n10);
        }
        return null;
    }

    private static void D(a0 a0Var, int i10, int i11, int i12, int i13, int i14, DrmInitData drmInitData, c cVar, int i15) throws j2 {
        DrmInitData drmInitData2;
        int i16;
        int i17;
        byte[] bArr;
        float f10;
        List<byte[]> list;
        String str;
        int i18 = i11;
        int i19 = i12;
        DrmInitData drmInitData3 = drmInitData;
        c cVar2 = cVar;
        a0Var.P(i18 + 8 + 8);
        a0Var.Q(16);
        int J = a0Var.J();
        int J2 = a0Var.J();
        a0Var.Q(50);
        int e10 = a0Var.e();
        int i20 = i10;
        if (i20 == 1701733238) {
            Pair<Integer, p> s10 = s(a0Var, i18, i19);
            if (s10 != null) {
                i20 = ((Integer) s10.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.f(((p) s10.second).f38458b);
                cVar2.f38335a[i15] = (p) s10.second;
            }
            a0Var.P(e10);
        }
        String str2 = "video/3gpp";
        String str3 = i20 == 1831958048 ? "video/mpeg" : i20 == 1211250227 ? "video/3gpp" : null;
        float f11 = 1.0f;
        byte[] bArr2 = null;
        String str4 = null;
        List<byte[]> list2 = null;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        ByteBuffer byteBuffer = null;
        boolean z10 = false;
        while (true) {
            if (e10 - i18 >= i19) {
                drmInitData2 = drmInitData3;
                break;
            }
            a0Var.P(e10);
            int e11 = a0Var.e();
            String str5 = str2;
            int n10 = a0Var.n();
            if (n10 == 0) {
                drmInitData2 = drmInitData3;
                if (a0Var.e() - i18 == i19) {
                    break;
                }
            } else {
                drmInitData2 = drmInitData3;
            }
            p8.l.a(n10 > 0, "childAtomSize must be positive");
            int n11 = a0Var.n();
            if (n11 == 1635148611) {
                p8.l.a(str3 == null, null);
                a0Var.P(e11 + 8);
                com.google.android.exoplayer2.video.a b10 = com.google.android.exoplayer2.video.a.b(a0Var);
                list2 = b10.f21805a;
                cVar2.f38337c = b10.f21806b;
                if (!z10) {
                    f11 = b10.f21809e;
                }
                str4 = b10.f21810f;
                str = "video/avc";
            } else if (n11 == 1752589123) {
                p8.l.a(str3 == null, null);
                a0Var.P(e11 + 8);
                com.google.android.exoplayer2.video.b a10 = com.google.android.exoplayer2.video.b.a(a0Var);
                list2 = a10.f21811a;
                cVar2.f38337c = a10.f21812b;
                if (!z10) {
                    f11 = a10.f21813c;
                }
                str4 = a10.f21814d;
                str = "video/hevc";
            } else {
                if (n11 == 1685480259 || n11 == 1685485123) {
                    i16 = J2;
                    i17 = i20;
                    bArr = bArr2;
                    f10 = f11;
                    list = list2;
                    fa.c a11 = fa.c.a(a0Var);
                    if (a11 != null) {
                        str4 = a11.f30207a;
                        str3 = "video/dolby-vision";
                    }
                } else if (n11 == 1987076931) {
                    p8.l.a(str3 == null, null);
                    str = i20 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (n11 == 1635135811) {
                    p8.l.a(str3 == null, null);
                    str = "video/av01";
                } else if (n11 == 1668050025) {
                    ByteBuffer a12 = byteBuffer == null ? a() : byteBuffer;
                    a12.position(21);
                    a12.putShort(a0Var.z());
                    a12.putShort(a0Var.z());
                    byteBuffer = a12;
                    i16 = J2;
                    i17 = i20;
                    e10 += n10;
                    i18 = i11;
                    i19 = i12;
                    cVar2 = cVar;
                    str2 = str5;
                    drmInitData3 = drmInitData2;
                    i20 = i17;
                    J2 = i16;
                } else if (n11 == 1835295606) {
                    ByteBuffer a13 = byteBuffer == null ? a() : byteBuffer;
                    short z11 = a0Var.z();
                    short z12 = a0Var.z();
                    short z13 = a0Var.z();
                    i17 = i20;
                    short z14 = a0Var.z();
                    short z15 = a0Var.z();
                    List<byte[]> list3 = list2;
                    short z16 = a0Var.z();
                    byte[] bArr3 = bArr2;
                    short z17 = a0Var.z();
                    float f12 = f11;
                    short z18 = a0Var.z();
                    long F = a0Var.F();
                    long F2 = a0Var.F();
                    i16 = J2;
                    a13.position(1);
                    a13.putShort(z15);
                    a13.putShort(z16);
                    a13.putShort(z11);
                    a13.putShort(z12);
                    a13.putShort(z13);
                    a13.putShort(z14);
                    a13.putShort(z17);
                    a13.putShort(z18);
                    a13.putShort((short) (F / 10000));
                    a13.putShort((short) (F2 / 10000));
                    byteBuffer = a13;
                    list2 = list3;
                    bArr2 = bArr3;
                    f11 = f12;
                    e10 += n10;
                    i18 = i11;
                    i19 = i12;
                    cVar2 = cVar;
                    str2 = str5;
                    drmInitData3 = drmInitData2;
                    i20 = i17;
                    J2 = i16;
                } else {
                    i16 = J2;
                    i17 = i20;
                    bArr = bArr2;
                    f10 = f11;
                    list = list2;
                    if (n11 == 1681012275) {
                        p8.l.a(str3 == null, null);
                        str3 = str5;
                    } else if (n11 == 1702061171) {
                        p8.l.a(str3 == null, null);
                        Pair<String, byte[]> i25 = i(a0Var, e11);
                        String str6 = (String) i25.first;
                        byte[] bArr4 = (byte[]) i25.second;
                        list2 = bArr4 != null ? s.u(bArr4) : list;
                        str3 = str6;
                        bArr2 = bArr;
                        f11 = f10;
                        e10 += n10;
                        i18 = i11;
                        i19 = i12;
                        cVar2 = cVar;
                        str2 = str5;
                        drmInitData3 = drmInitData2;
                        i20 = i17;
                        J2 = i16;
                    } else if (n11 == 1885434736) {
                        f11 = q(a0Var, e11);
                        list2 = list;
                        bArr2 = bArr;
                        z10 = true;
                        e10 += n10;
                        i18 = i11;
                        i19 = i12;
                        cVar2 = cVar;
                        str2 = str5;
                        drmInitData3 = drmInitData2;
                        i20 = i17;
                        J2 = i16;
                    } else if (n11 == 1937126244) {
                        bArr2 = r(a0Var, e11, n10);
                        list2 = list;
                        f11 = f10;
                        e10 += n10;
                        i18 = i11;
                        i19 = i12;
                        cVar2 = cVar;
                        str2 = str5;
                        drmInitData3 = drmInitData2;
                        i20 = i17;
                        J2 = i16;
                    } else if (n11 == 1936995172) {
                        int D = a0Var.D();
                        a0Var.Q(3);
                        if (D == 0) {
                            int D2 = a0Var.D();
                            if (D2 == 0) {
                                i21 = 0;
                            } else if (D2 == 1) {
                                i21 = 1;
                            } else if (D2 == 2) {
                                i21 = 2;
                            } else if (D2 == 3) {
                                i21 = 3;
                            }
                        }
                    } else if (n11 == 1668246642) {
                        int n12 = a0Var.n();
                        if (n12 != 1852009592 && n12 != 1852009571) {
                            String valueOf = String.valueOf(w8.a.a(n12));
                            ea.r.h("AtomParsers", valueOf.length() != 0 ? "Unsupported color type: ".concat(valueOf) : new String("Unsupported color type: "));
                        } else {
                            int J3 = a0Var.J();
                            int J4 = a0Var.J();
                            a0Var.Q(2);
                            boolean z19 = n10 == 19 && (a0Var.D() & 128) != 0;
                            i22 = fa.b.b(J3);
                            i23 = z19 ? 1 : 2;
                            i24 = fa.b.c(J4);
                        }
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f11 = f10;
                e10 += n10;
                i18 = i11;
                i19 = i12;
                cVar2 = cVar;
                str2 = str5;
                drmInitData3 = drmInitData2;
                i20 = i17;
                J2 = i16;
            }
            str3 = str;
            i16 = J2;
            i17 = i20;
            e10 += n10;
            i18 = i11;
            i19 = i12;
            cVar2 = cVar;
            str2 = str5;
            drmInitData3 = drmInitData2;
            i20 = i17;
            J2 = i16;
        }
        int i26 = J2;
        byte[] bArr5 = bArr2;
        float f13 = f11;
        List<byte[]> list4 = list2;
        if (str3 == null) {
            return;
        }
        p1.b M = new p1.b().R(i13).e0(str3).I(str4).j0(J).Q(i26).a0(f13).d0(i14).b0(bArr5).h0(i21).T(list4).M(drmInitData2);
        int i27 = i22;
        int i28 = i23;
        int i29 = i24;
        if (i27 != -1 || i28 != -1 || i29 != -1 || byteBuffer != null) {
            M.J(new fa.b(i27, i28, i29, byteBuffer != null ? byteBuffer.array() : null));
        }
        cVar.f38336b = M.E();
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[n0.q(4, 0, length)] && jArr[n0.q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(a0 a0Var, int i10, int i11, int i12) throws j2 {
        int e10 = a0Var.e();
        p8.l.a(e10 >= i11, null);
        while (e10 - i11 < i12) {
            a0Var.P(e10);
            int n10 = a0Var.n();
            p8.l.a(n10 > 0, "childAtomSize must be positive");
            if (a0Var.n() == i10) {
                return e10;
            }
            e10 += n10;
        }
        return -1;
    }

    private static int d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void e(a0 a0Var) {
        int e10 = a0Var.e();
        a0Var.Q(4);
        if (a0Var.n() != 1751411826) {
            e10 += 4;
        }
        a0Var.P(e10);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(ea.a0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, com.google.android.exoplayer2.drm.DrmInitData r29, w8.b.c r30, int r31) throws j8.j2 {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.b.f(ea.a0, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, w8.b$c, int):void");
    }

    static Pair<Integer, p> g(a0 a0Var, int i10, int i11) throws j2 {
        int i12 = i10 + 8;
        String str = null;
        Integer num = null;
        int i13 = -1;
        int i14 = 0;
        while (i12 - i10 < i11) {
            a0Var.P(i12);
            int n10 = a0Var.n();
            int n11 = a0Var.n();
            if (n11 == 1718775137) {
                num = Integer.valueOf(a0Var.n());
            } else if (n11 == 1935894637) {
                a0Var.Q(4);
                str = a0Var.A(4);
            } else if (n11 == 1935894633) {
                i13 = i12;
                i14 = n10;
            }
            i12 += n10;
        }
        if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
            p8.l.a(num != null, "frma atom is mandatory");
            p8.l.a(i13 != -1, "schi atom is mandatory");
            p t10 = t(a0Var, i13, i14, str);
            p8.l.a(t10 != null, "tenc atom is mandatory");
            return Pair.create(num, (p) n0.j(t10));
        }
        return null;
    }

    private static Pair<long[], long[]> h(a.C0529a c0529a) {
        a.b g10 = c0529a.g(1701606260);
        if (g10 == null) {
            return null;
        }
        a0 a0Var = g10.f38324b;
        a0Var.P(8);
        int c10 = w8.a.c(a0Var.n());
        int H = a0Var.H();
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        for (int i10 = 0; i10 < H; i10++) {
            jArr[i10] = c10 == 1 ? a0Var.I() : a0Var.F();
            jArr2[i10] = c10 == 1 ? a0Var.w() : a0Var.n();
            if (a0Var.z() == 1) {
                a0Var.Q(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> i(a0 a0Var, int i10) {
        a0Var.P(i10 + 8 + 4);
        a0Var.Q(1);
        j(a0Var);
        a0Var.Q(2);
        int D = a0Var.D();
        if ((D & 128) != 0) {
            a0Var.Q(2);
        }
        if ((D & 64) != 0) {
            a0Var.Q(a0Var.J());
        }
        if ((D & 32) != 0) {
            a0Var.Q(2);
        }
        a0Var.Q(1);
        j(a0Var);
        String h10 = v.h(a0Var.D());
        if (!"audio/mpeg".equals(h10) && !"audio/vnd.dts".equals(h10) && !"audio/vnd.dts.hd".equals(h10)) {
            a0Var.Q(12);
            a0Var.Q(1);
            int j10 = j(a0Var);
            byte[] bArr = new byte[j10];
            a0Var.j(bArr, 0, j10);
            return Pair.create(h10, bArr);
        }
        return Pair.create(h10, null);
    }

    private static int j(a0 a0Var) {
        int D = a0Var.D();
        int i10 = D & 127;
        while ((D & 128) == 128) {
            D = a0Var.D();
            i10 = (i10 << 7) | (D & 127);
        }
        return i10;
    }

    private static int k(a0 a0Var) {
        a0Var.P(16);
        return a0Var.n();
    }

    private static Metadata l(a0 a0Var, int i10) {
        a0Var.Q(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var.e() < i10) {
            Metadata.Entry c10 = h.c(a0Var);
            if (c10 != null) {
                arrayList.add(c10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> m(a0 a0Var) {
        a0Var.P(8);
        int c10 = w8.a.c(a0Var.n());
        a0Var.Q(c10 == 0 ? 8 : 16);
        long F = a0Var.F();
        a0Var.Q(c10 == 0 ? 4 : 8);
        int J = a0Var.J();
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append((char) (((J >> 10) & 31) + 96));
        sb2.append((char) (((J >> 5) & 31) + 96));
        sb2.append((char) ((J & 31) + 96));
        return Pair.create(Long.valueOf(F), sb2.toString());
    }

    public static Metadata n(a.C0529a c0529a) {
        a.b g10 = c0529a.g(1751411826);
        a.b g11 = c0529a.g(1801812339);
        a.b g12 = c0529a.g(1768715124);
        if (g10 == null || g11 == null || g12 == null || k(g10.f38324b) != 1835299937) {
            return null;
        }
        a0 a0Var = g11.f38324b;
        a0Var.P(12);
        int n10 = a0Var.n();
        String[] strArr = new String[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            int n11 = a0Var.n();
            a0Var.Q(4);
            strArr[i10] = a0Var.A(n11 - 8);
        }
        a0 a0Var2 = g12.f38324b;
        a0Var2.P(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var2.a() > 8) {
            int e10 = a0Var2.e();
            int n12 = a0Var2.n();
            int n13 = a0Var2.n() - 1;
            if (n13 >= 0 && n13 < n10) {
                MdtaMetadataEntry f10 = h.f(a0Var2, e10 + n12, strArr[n13]);
                if (f10 != null) {
                    arrayList.add(f10);
                }
            } else {
                StringBuilder sb2 = new StringBuilder(52);
                sb2.append("Skipped metadata with unknown key index: ");
                sb2.append(n13);
                ea.r.h("AtomParsers", sb2.toString());
            }
            a0Var2.P(e10 + n12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void o(a0 a0Var, int i10, int i11, int i12, c cVar) {
        a0Var.P(i11 + 8 + 8);
        if (i10 == 1835365492) {
            a0Var.x();
            String x10 = a0Var.x();
            if (x10 != null) {
                cVar.f38336b = new p1.b().R(i12).e0(x10).E();
            }
        }
    }

    private static long p(a0 a0Var) {
        a0Var.P(8);
        a0Var.Q(w8.a.c(a0Var.n()) != 0 ? 16 : 8);
        return a0Var.F();
    }

    private static float q(a0 a0Var, int i10) {
        a0Var.P(i10 + 8);
        return a0Var.H() / a0Var.H();
    }

    private static byte[] r(a0 a0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            a0Var.P(i12);
            int n10 = a0Var.n();
            if (a0Var.n() == 1886547818) {
                return Arrays.copyOfRange(a0Var.d(), i12, n10 + i12);
            }
            i12 += n10;
        }
        return null;
    }

    private static Pair<Integer, p> s(a0 a0Var, int i10, int i11) throws j2 {
        Pair<Integer, p> g10;
        int e10 = a0Var.e();
        while (e10 - i10 < i11) {
            a0Var.P(e10);
            int n10 = a0Var.n();
            p8.l.a(n10 > 0, "childAtomSize must be positive");
            if (a0Var.n() == 1936289382 && (g10 = g(a0Var, e10, n10)) != null) {
                return g10;
            }
            e10 += n10;
        }
        return null;
    }

    private static p t(a0 a0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            a0Var.P(i14);
            int n10 = a0Var.n();
            if (a0Var.n() == 1952804451) {
                int c10 = w8.a.c(a0Var.n());
                a0Var.Q(1);
                if (c10 == 0) {
                    a0Var.Q(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int D = a0Var.D();
                    i12 = D & 15;
                    i13 = (D & 240) >> 4;
                }
                boolean z10 = a0Var.D() == 1;
                int D2 = a0Var.D();
                byte[] bArr2 = new byte[16];
                a0Var.j(bArr2, 0, 16);
                if (z10 && D2 == 0) {
                    int D3 = a0Var.D();
                    bArr = new byte[D3];
                    a0Var.j(bArr, 0, D3);
                }
                return new p(z10, str, D2, bArr2, i13, i12, bArr);
            }
            i14 += n10;
        }
    }

    private static Metadata u(a0 a0Var, int i10) {
        a0Var.Q(12);
        while (a0Var.e() < i10) {
            int e10 = a0Var.e();
            int n10 = a0Var.n();
            if (a0Var.n() == 1935766900) {
                if (n10 < 14) {
                    return null;
                }
                a0Var.Q(5);
                int D = a0Var.D();
                if (D == 12 || D == 13) {
                    float f10 = D == 12 ? 240.0f : 120.0f;
                    a0Var.Q(1);
                    return new Metadata(new SmtaMetadataEntry(f10, a0Var.D()));
                }
                return null;
            }
            a0Var.P(e10 + n10);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x043c A[EDGE_INSN: B:208:0x043c->B:170:0x043c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static w8.r v(w8.o r37, w8.a.C0529a r38, p8.t r39) throws j8.j2 {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.b.v(w8.o, w8.a$a, p8.t):w8.r");
    }

    private static c w(a0 a0Var, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws j2 {
        int i12;
        a0Var.P(12);
        int n10 = a0Var.n();
        c cVar = new c(n10);
        for (int i13 = 0; i13 < n10; i13++) {
            int e10 = a0Var.e();
            int n11 = a0Var.n();
            p8.l.a(n11 > 0, "childAtomSize must be positive");
            int n12 = a0Var.n();
            if (n12 == 1635148593 || n12 == 1635148595 || n12 == 1701733238 || n12 == 1831958048 || n12 == 1836070006 || n12 == 1752589105 || n12 == 1751479857 || n12 == 1932670515 || n12 == 1211250227 || n12 == 1987063864 || n12 == 1987063865 || n12 == 1635135537 || n12 == 1685479798 || n12 == 1685479729 || n12 == 1685481573 || n12 == 1685481521) {
                i12 = e10;
                D(a0Var, n12, i12, n11, i10, i11, drmInitData, cVar, i13);
            } else if (n12 == 1836069985 || n12 == 1701733217 || n12 == 1633889587 || n12 == 1700998451 || n12 == 1633889588 || n12 == 1835823201 || n12 == 1685353315 || n12 == 1685353317 || n12 == 1685353320 || n12 == 1685353324 || n12 == 1685353336 || n12 == 1935764850 || n12 == 1935767394 || n12 == 1819304813 || n12 == 1936684916 || n12 == 1953984371 || n12 == 778924082 || n12 == 778924083 || n12 == 1835557169 || n12 == 1835560241 || n12 == 1634492771 || n12 == 1634492791 || n12 == 1970037111 || n12 == 1332770163 || n12 == 1716281667) {
                i12 = e10;
                f(a0Var, n12, e10, n11, i10, str, z10, drmInitData, cVar, i13);
            } else {
                if (n12 == 1414810956 || n12 == 1954034535 || n12 == 2004251764 || n12 == 1937010800 || n12 == 1664495672) {
                    x(a0Var, n12, e10, n11, i10, str, cVar);
                } else if (n12 == 1835365492) {
                    o(a0Var, n12, e10, i10, cVar);
                } else if (n12 == 1667329389) {
                    cVar.f38336b = new p1.b().R(i10).e0("application/x-camera-motion").E();
                }
                i12 = e10;
            }
            a0Var.P(i12 + n11);
        }
        return cVar;
    }

    private static void x(a0 a0Var, int i10, int i11, int i12, int i13, String str, c cVar) {
        a0Var.P(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        s sVar = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                a0Var.j(bArr, 0, i14);
                sVar = s.u(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                cVar.f38338d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        cVar.f38336b = new p1.b().R(i13).e0(str2).V(str).i0(j10).T(sVar).E();
    }

    private static f y(a0 a0Var) {
        boolean z10;
        a0Var.P(8);
        int c10 = w8.a.c(a0Var.n());
        a0Var.Q(c10 == 0 ? 8 : 16);
        int n10 = a0Var.n();
        a0Var.Q(4);
        int e10 = a0Var.e();
        int i10 = c10 == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            } else if (a0Var.d()[e10 + i12] != -1) {
                z10 = false;
                break;
            } else {
                i12++;
            }
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            a0Var.Q(i10);
        } else {
            long F = c10 == 0 ? a0Var.F() : a0Var.I();
            if (F != 0) {
                j10 = F;
            }
        }
        a0Var.Q(16);
        int n11 = a0Var.n();
        int n12 = a0Var.n();
        a0Var.Q(4);
        int n13 = a0Var.n();
        int n14 = a0Var.n();
        if (n11 == 0 && n12 == 65536 && n13 == -65536 && n14 == 0) {
            i11 = 90;
        } else if (n11 == 0 && n12 == -65536 && n13 == 65536 && n14 == 0) {
            i11 = 270;
        } else if (n11 == -65536 && n12 == 0 && n13 == 0 && n14 == -65536) {
            i11 = 180;
        }
        return new f(n10, j10, i11);
    }

    private static o z(a.C0529a c0529a, a.b bVar, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws j2 {
        a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        a.C0529a f10;
        Pair<long[], long[]> h10;
        a.C0529a c0529a2 = (a.C0529a) ea.a.e(c0529a.f(1835297121));
        int d10 = d(k(((a.b) ea.a.e(c0529a2.g(1751411826))).f38324b));
        if (d10 == -1) {
            return null;
        }
        f y10 = y(((a.b) ea.a.e(c0529a.g(1953196132))).f38324b);
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = y10.f38348b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long p10 = p(bVar2.f38324b);
        long O0 = j11 != -9223372036854775807L ? n0.O0(j11, 1000000L, p10) : -9223372036854775807L;
        Pair<Long, String> m10 = m(((a.b) ea.a.e(c0529a2.g(1835296868))).f38324b);
        c w10 = w(((a.b) ea.a.e(((a.C0529a) ea.a.e(((a.C0529a) ea.a.e(c0529a2.f(1835626086))).f(1937007212))).g(1937011556))).f38324b, y10.f38347a, y10.f38349c, (String) m10.second, drmInitData, z11);
        if (z10 || (f10 = c0529a.f(1701082227)) == null || (h10 = h(f10)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            jArr2 = (long[]) h10.second;
            jArr = (long[]) h10.first;
        }
        if (w10.f38336b == null) {
            return null;
        }
        return new o(y10.f38347a, d10, ((Long) m10.first).longValue(), p10, O0, w10.f38336b, w10.f38338d, w10.f38335a, w10.f38337c, jArr, jArr2);
    }
}
