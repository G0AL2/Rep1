package l8;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.ads.AdRequest;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import ea.n0;
import j8.p1;
import java.nio.ByteBuffer;

/* compiled from: Ac3Util.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f33759a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f33760b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f33761c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f33762d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f33763e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, DownloadResource.STATUS_RUNNING, 224, 256, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f33764f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* compiled from: Ac3Util.java */
    /* renamed from: l8.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0440b {

        /* renamed from: a  reason: collision with root package name */
        public final String f33765a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33766b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33767c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33768d;

        /* renamed from: e  reason: collision with root package name */
        public final int f33769e;

        private C0440b(String str, int i10, int i11, int i12, int i13, int i14) {
            this.f33765a = str;
            this.f33767c = i11;
            this.f33766b = i12;
            this.f33768d = i13;
            this.f33769e = i14;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i10 = position; i10 <= limit; i10++) {
            if ((n0.I(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                return i10 - position;
            }
        }
        return -1;
    }

    private static int b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0) {
            int[] iArr = f33760b;
            if (i10 >= iArr.length || i11 < 0) {
                return -1;
            }
            int[] iArr2 = f33764f;
            if (i12 >= iArr2.length) {
                return -1;
            }
            int i13 = iArr[i10];
            if (i13 == 44100) {
                return (iArr2[i12] + (i11 % 2)) * 2;
            }
            int i14 = f33763e[i12];
            return i13 == 32000 ? i14 * 6 : i14 * 4;
        }
        return -1;
    }

    public static p1 c(ea.a0 a0Var, String str, String str2, DrmInitData drmInitData) {
        int i10 = f33760b[(a0Var.D() & DownloadResource.STATUS_RUNNING) >> 6];
        int D = a0Var.D();
        int i11 = f33762d[(D & 56) >> 3];
        if ((D & 4) != 0) {
            i11++;
        }
        return new p1.b().S(str).e0("audio/ac3").H(i11).f0(i10).M(drmInitData).V(str2).E();
    }

    public static int d(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f33759a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static C0440b e(ea.z zVar) {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int h10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int e10 = zVar.e();
        zVar.r(40);
        boolean z10 = zVar.h(5) > 10;
        zVar.p(e10);
        int i20 = -1;
        if (z10) {
            zVar.r(16);
            int h11 = zVar.h(2);
            if (h11 == 0) {
                i20 = 0;
            } else if (h11 == 1) {
                i20 = 1;
            } else if (h11 == 2) {
                i20 = 2;
            }
            zVar.r(3);
            int h12 = (zVar.h(11) + 1) * 2;
            int h13 = zVar.h(2);
            if (h13 == 3) {
                i16 = f33761c[zVar.h(2)];
                h10 = 3;
                i15 = 6;
            } else {
                h10 = zVar.h(2);
                i15 = f33759a[h10];
                i16 = f33760b[h13];
            }
            int i21 = i15 * 256;
            int h14 = zVar.h(3);
            boolean g10 = zVar.g();
            int i22 = f33762d[h14] + (g10 ? 1 : 0);
            zVar.r(10);
            if (zVar.g()) {
                zVar.r(8);
            }
            if (h14 == 0) {
                zVar.r(5);
                if (zVar.g()) {
                    zVar.r(8);
                }
            }
            if (i20 == 1 && zVar.g()) {
                zVar.r(16);
            }
            if (zVar.g()) {
                if (h14 > 2) {
                    zVar.r(2);
                }
                if ((h14 & 1) == 0 || h14 <= 2) {
                    i18 = 6;
                } else {
                    i18 = 6;
                    zVar.r(6);
                }
                if ((h14 & 4) != 0) {
                    zVar.r(i18);
                }
                if (g10 && zVar.g()) {
                    zVar.r(5);
                }
                if (i20 == 0) {
                    if (zVar.g()) {
                        i19 = 6;
                        zVar.r(6);
                    } else {
                        i19 = 6;
                    }
                    if (h14 == 0 && zVar.g()) {
                        zVar.r(i19);
                    }
                    if (zVar.g()) {
                        zVar.r(i19);
                    }
                    int h15 = zVar.h(2);
                    if (h15 == 1) {
                        zVar.r(5);
                    } else if (h15 == 2) {
                        zVar.r(12);
                    } else if (h15 == 3) {
                        int h16 = zVar.h(5);
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                zVar.r(4);
                            }
                            if (zVar.g()) {
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                                if (zVar.g()) {
                                    zVar.r(4);
                                }
                            }
                        }
                        if (zVar.g()) {
                            zVar.r(5);
                            if (zVar.g()) {
                                zVar.r(7);
                                if (zVar.g()) {
                                    zVar.r(8);
                                }
                            }
                        }
                        zVar.r((h16 + 2) * 8);
                        zVar.c();
                    }
                    if (h14 < 2) {
                        if (zVar.g()) {
                            zVar.r(14);
                        }
                        if (h14 == 0 && zVar.g()) {
                            zVar.r(14);
                        }
                    }
                    if (zVar.g()) {
                        if (h10 == 0) {
                            zVar.r(5);
                        } else {
                            for (int i23 = 0; i23 < i15; i23++) {
                                if (zVar.g()) {
                                    zVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.g()) {
                zVar.r(5);
                if (h14 == 2) {
                    zVar.r(4);
                }
                if (h14 >= 6) {
                    zVar.r(2);
                }
                if (zVar.g()) {
                    zVar.r(8);
                }
                if (h14 == 0 && zVar.g()) {
                    zVar.r(8);
                }
                if (h13 < 3) {
                    zVar.q();
                }
            }
            if (i20 == 0 && h10 != 3) {
                zVar.q();
            }
            if (i20 == 2 && (h10 == 3 || zVar.g())) {
                i17 = 6;
                zVar.r(6);
            } else {
                i17 = 6;
            }
            str = (zVar.g() && zVar.h(i17) == 1 && zVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i20;
            i14 = i21;
            i10 = h12;
            i11 = i16;
            i12 = i22;
        } else {
            zVar.r(32);
            int h17 = zVar.h(2);
            String str2 = h17 == 3 ? null : "audio/ac3";
            int b10 = b(h17, zVar.h(6));
            zVar.r(8);
            int h18 = zVar.h(3);
            if ((h18 & 1) != 0 && h18 != 1) {
                zVar.r(2);
            }
            if ((h18 & 4) != 0) {
                zVar.r(2);
            }
            if (h18 == 2) {
                zVar.r(2);
            }
            int[] iArr = f33760b;
            str = str2;
            i10 = b10;
            i11 = h17 < iArr.length ? iArr[h17] : -1;
            i12 = f33762d[h18] + (zVar.g() ? 1 : 0);
            i13 = -1;
            i14 = 1536;
        }
        return new C0440b(str, i13, i12, i11, i10, i14);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        return b((bArr[4] & 192) >> 6, bArr[4] & 63);
    }

    public static p1 g(ea.a0 a0Var, String str, String str2, DrmInitData drmInitData) {
        a0Var.Q(2);
        int i10 = f33760b[(a0Var.D() & DownloadResource.STATUS_RUNNING) >> 6];
        int D = a0Var.D();
        int i11 = f33762d[(D & 14) >> 1];
        if ((D & 1) != 0) {
            i11++;
        }
        if (((a0Var.D() & 30) >> 1) > 0 && (2 & a0Var.D()) != 0) {
            i11 += 2;
        }
        return new p1.b().S(str).e0((a0Var.a() <= 0 || (a0Var.D() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").H(i11).f0(i10).M(drmInitData).V(str2).E();
    }

    public static int h(ByteBuffer byteBuffer, int i10) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i10) + ((byteBuffer.get((byteBuffer.position() + i10) + 7) & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }
}
