package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.n;
import com.fyber.inneractive.sdk.player.exoplayer2.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.inmobi.media.fq;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.f {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0  reason: collision with root package name */
    public static final byte[] f18422a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0  reason: collision with root package name */
    public static final UUID f18423b0 = new UUID(72057594037932032L, -9223371306706625679L);
    public com.fyber.inneractive.sdk.player.exoplayer2.util.f B;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.f C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public h Y;

    /* renamed from: a  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b f18424a;

    /* renamed from: b  reason: collision with root package name */
    public final f f18425b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseArray<c> f18426c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f18427d;

    /* renamed from: e  reason: collision with root package name */
    public final k f18428e;

    /* renamed from: f  reason: collision with root package name */
    public final k f18429f;

    /* renamed from: g  reason: collision with root package name */
    public final k f18430g;

    /* renamed from: h  reason: collision with root package name */
    public final k f18431h;

    /* renamed from: i  reason: collision with root package name */
    public final k f18432i;

    /* renamed from: j  reason: collision with root package name */
    public final k f18433j;

    /* renamed from: k  reason: collision with root package name */
    public final k f18434k;

    /* renamed from: l  reason: collision with root package name */
    public final k f18435l;

    /* renamed from: m  reason: collision with root package name */
    public final k f18436m;

    /* renamed from: n  reason: collision with root package name */
    public ByteBuffer f18437n;

    /* renamed from: o  reason: collision with root package name */
    public long f18438o;

    /* renamed from: t  reason: collision with root package name */
    public c f18443t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f18444u;

    /* renamed from: v  reason: collision with root package name */
    public int f18445v;

    /* renamed from: w  reason: collision with root package name */
    public long f18446w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f18447x;

    /* renamed from: p  reason: collision with root package name */
    public long f18439p = -1;

    /* renamed from: q  reason: collision with root package name */
    public long f18440q = -9223372036854775807L;

    /* renamed from: r  reason: collision with root package name */
    public long f18441r = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    public long f18442s = -9223372036854775807L;

    /* renamed from: y  reason: collision with root package name */
    public long f18448y = -1;

    /* renamed from: z  reason: collision with root package name */
    public long f18449z = -1;
    public long A = -9223372036854775807L;

    /* loaded from: classes.dex */
    public class a implements i {
    }

    /* loaded from: classes.dex */
    public final class b implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.c {
        public b() {
        }

        public boolean a(int i10) {
            d.this.getClass();
            return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
        }

        public /* synthetic */ b(d dVar, a aVar) {
            this();
        }

        public void a(int i10, long j10, long j11) throws l {
            d dVar = d.this;
            dVar.getClass();
            if (i10 == 160) {
                dVar.X = false;
            } else if (i10 == 174) {
                dVar.f18443t = new c();
            } else if (i10 == 187) {
                dVar.D = false;
            } else if (i10 == 19899) {
                dVar.f18445v = -1;
                dVar.f18446w = -1L;
            } else if (i10 == 20533) {
                dVar.f18443t.f18455e = true;
            } else if (i10 == 21968) {
                dVar.f18443t.f18467q = true;
            } else if (i10 == 408125543) {
                long j12 = dVar.f18439p;
                if (j12 != -1 && j12 != j10) {
                    throw new l("Multiple Segment elements not supported");
                }
                dVar.f18439p = j10;
                dVar.f18438o = j11;
            } else if (i10 != 475249515) {
                if (i10 == 524531317 && !dVar.f18444u) {
                    if (dVar.f18427d && dVar.f18448y != -1) {
                        dVar.f18447x = true;
                        return;
                    }
                    dVar.Y.a(new m.a(dVar.f18442s));
                    dVar.f18444u = true;
                }
            } else {
                dVar.B = new com.fyber.inneractive.sdk.player.exoplayer2.util.f(32);
                dVar.C = new com.fyber.inneractive.sdk.player.exoplayer2.util.f(32);
            }
        }

        public void a(int i10, long j10) throws l {
            d dVar = d.this;
            dVar.getClass();
            if (i10 == 20529) {
                if (j10 == 0) {
                    return;
                }
                throw new l("ContentEncodingOrder " + j10 + " not supported");
            } else if (i10 == 20530) {
                if (j10 == 1) {
                    return;
                }
                throw new l("ContentEncodingScope " + j10 + " not supported");
            } else {
                switch (i10) {
                    case 131:
                        dVar.f18443t.f18453c = (int) j10;
                        return;
                    case 136:
                        dVar.f18443t.L = j10 == 1;
                        return;
                    case 155:
                        dVar.G = dVar.a(j10);
                        return;
                    case 159:
                        dVar.f18443t.G = (int) j10;
                        return;
                    case 176:
                        dVar.f18443t.f18460j = (int) j10;
                        return;
                    case 179:
                        dVar.B.a(dVar.a(j10));
                        return;
                    case 186:
                        dVar.f18443t.f18461k = (int) j10;
                        return;
                    case 215:
                        dVar.f18443t.f18452b = (int) j10;
                        return;
                    case 231:
                        dVar.A = dVar.a(j10);
                        return;
                    case 241:
                        if (dVar.D) {
                            return;
                        }
                        dVar.C.a(j10);
                        dVar.D = true;
                        return;
                    case 251:
                        dVar.X = true;
                        return;
                    case 16980:
                        if (j10 == 3) {
                            return;
                        }
                        throw new l("ContentCompAlgo " + j10 + " not supported");
                    case 17029:
                        if (j10 < 1 || j10 > 2) {
                            throw new l("DocTypeReadVersion " + j10 + " not supported");
                        }
                        return;
                    case 17143:
                        if (j10 == 1) {
                            return;
                        }
                        throw new l("EBMLReadVersion " + j10 + " not supported");
                    case 18401:
                        if (j10 == 5) {
                            return;
                        }
                        throw new l("ContentEncAlgo " + j10 + " not supported");
                    case 18408:
                        if (j10 == 1) {
                            return;
                        }
                        throw new l("AESSettingsCipherMode " + j10 + " not supported");
                    case 21420:
                        dVar.f18446w = j10 + dVar.f18439p;
                        return;
                    case 21432:
                        int i11 = (int) j10;
                        if (i11 == 0) {
                            dVar.f18443t.f18466p = 0;
                            return;
                        } else if (i11 == 1) {
                            dVar.f18443t.f18466p = 2;
                            return;
                        } else if (i11 == 3) {
                            dVar.f18443t.f18466p = 1;
                            return;
                        } else if (i11 != 15) {
                            return;
                        } else {
                            dVar.f18443t.f18466p = 3;
                            return;
                        }
                    case 21680:
                        dVar.f18443t.f18462l = (int) j10;
                        return;
                    case 21682:
                        dVar.f18443t.f18464n = (int) j10;
                        return;
                    case 21690:
                        dVar.f18443t.f18463m = (int) j10;
                        return;
                    case 21930:
                        dVar.f18443t.M = j10 == 1;
                        return;
                    case 22186:
                        dVar.f18443t.J = j10;
                        return;
                    case 22203:
                        dVar.f18443t.K = j10;
                        return;
                    case 25188:
                        dVar.f18443t.H = (int) j10;
                        return;
                    case 2352003:
                        dVar.f18443t.f18454d = (int) j10;
                        return;
                    case 2807729:
                        dVar.f18440q = j10;
                        return;
                    default:
                        switch (i10) {
                            case 21945:
                                int i12 = (int) j10;
                                if (i12 == 1) {
                                    dVar.f18443t.f18470t = 2;
                                    return;
                                } else if (i12 != 2) {
                                    return;
                                } else {
                                    dVar.f18443t.f18470t = 1;
                                    return;
                                }
                            case 21946:
                                int i13 = (int) j10;
                                if (i13 != 1) {
                                    if (i13 == 16) {
                                        dVar.f18443t.f18469s = 6;
                                        return;
                                    } else if (i13 == 18) {
                                        dVar.f18443t.f18469s = 7;
                                        return;
                                    } else if (i13 != 6 && i13 != 7) {
                                        return;
                                    }
                                }
                                dVar.f18443t.f18469s = 3;
                                return;
                            case 21947:
                                c cVar = dVar.f18443t;
                                cVar.f18467q = true;
                                int i14 = (int) j10;
                                if (i14 == 1) {
                                    cVar.f18468r = 1;
                                    return;
                                } else if (i14 == 9) {
                                    cVar.f18468r = 6;
                                    return;
                                } else if (i14 == 4 || i14 == 5 || i14 == 6 || i14 == 7) {
                                    cVar.f18468r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                dVar.f18443t.f18471u = (int) j10;
                                return;
                            case 21949:
                                dVar.f18443t.f18472v = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            }
        }

        public void a(int i10, double d10) throws l {
            d dVar = d.this;
            dVar.getClass();
            if (i10 == 181) {
                dVar.f18443t.I = (int) d10;
            } else if (i10 != 17545) {
                switch (i10) {
                    case 21969:
                        dVar.f18443t.f18473w = (float) d10;
                        return;
                    case 21970:
                        dVar.f18443t.f18474x = (float) d10;
                        return;
                    case 21971:
                        dVar.f18443t.f18475y = (float) d10;
                        return;
                    case 21972:
                        dVar.f18443t.f18476z = (float) d10;
                        return;
                    case 21973:
                        dVar.f18443t.A = (float) d10;
                        return;
                    case 21974:
                        dVar.f18443t.B = (float) d10;
                        return;
                    case 21975:
                        dVar.f18443t.C = (float) d10;
                        return;
                    case 21976:
                        dVar.f18443t.D = (float) d10;
                        return;
                    case 21977:
                        dVar.f18443t.E = (float) d10;
                        return;
                    case 21978:
                        dVar.f18443t.F = (float) d10;
                        return;
                    default:
                        return;
                }
            } else {
                dVar.f18441r = (long) d10;
            }
        }

        public void a(int i10, String str) throws l {
            d dVar = d.this;
            dVar.getClass();
            if (i10 == 134) {
                dVar.f18443t.f18451a = str;
            } else if (i10 != 17026) {
                if (i10 != 2274716) {
                    return;
                }
                dVar.f18443t.N = str;
            } else if ("webm".equals(str) || "matroska".equals(str)) {
            } else {
                throw new l("DocType " + str + " not supported");
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x01fb, code lost:
            throw new com.fyber.inneractive.sdk.player.exoplayer2.l("EBML lacing sample size out of range.");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(int r24, int r25, com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r26) throws java.io.IOException, java.lang.InterruptedException {
            /*
                Method dump skipped, instructions count: 683
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d.b.a(int, int, com.fyber.inneractive.sdk.player.exoplayer2.extractor.g):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public boolean L;
        public n O;
        public int P;

        /* renamed from: a  reason: collision with root package name */
        public String f18451a;

        /* renamed from: b  reason: collision with root package name */
        public int f18452b;

        /* renamed from: c  reason: collision with root package name */
        public int f18453c;

        /* renamed from: d  reason: collision with root package name */
        public int f18454d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f18455e;

        /* renamed from: f  reason: collision with root package name */
        public byte[] f18456f;

        /* renamed from: g  reason: collision with root package name */
        public byte[] f18457g;

        /* renamed from: h  reason: collision with root package name */
        public byte[] f18458h;

        /* renamed from: i  reason: collision with root package name */
        public com.fyber.inneractive.sdk.player.exoplayer2.drm.a f18459i;

        /* renamed from: j  reason: collision with root package name */
        public int f18460j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f18461k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f18462l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f18463m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f18464n = 0;

        /* renamed from: o  reason: collision with root package name */
        public byte[] f18465o = null;

        /* renamed from: p  reason: collision with root package name */
        public int f18466p = -1;

        /* renamed from: q  reason: collision with root package name */
        public boolean f18467q = false;

        /* renamed from: r  reason: collision with root package name */
        public int f18468r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f18469s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f18470t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f18471u = 1000;

        /* renamed from: v  reason: collision with root package name */
        public int f18472v = 200;

        /* renamed from: w  reason: collision with root package name */
        public float f18473w = -1.0f;

        /* renamed from: x  reason: collision with root package name */
        public float f18474x = -1.0f;

        /* renamed from: y  reason: collision with root package name */
        public float f18475y = -1.0f;

        /* renamed from: z  reason: collision with root package name */
        public float f18476z = -1.0f;
        public float A = -1.0f;
        public float B = -1.0f;
        public float C = -1.0f;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public int G = 1;
        public int H = -1;
        public int I = 8000;
        public long J = 0;
        public long K = 0;
        public boolean M = true;
        public String N = "eng";
    }

    public d(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b bVar, int i10) {
        this.f18424a = bVar;
        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a) bVar).a(new b(this, null));
        this.f18427d = (i10 & 1) == 0;
        this.f18425b = new f();
        this.f18426c = new SparseArray<>();
        this.f18430g = new k(4);
        this.f18431h = new k(ByteBuffer.allocate(4).putInt(-1).array());
        this.f18432i = new k(4);
        this.f18428e = new k(com.fyber.inneractive.sdk.player.exoplayer2.util.i.f19558a);
        this.f18429f = new k(4);
        this.f18433j = new k();
        this.f18434k = new k();
        this.f18435l = new k(8);
        this.f18436m = new k();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public boolean a(g gVar) throws IOException, InterruptedException {
        long a10;
        int i10;
        e eVar = new e();
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar;
        long j10 = bVar.f18143b;
        long j11 = 1024;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        if (i11 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i12 = (int) j11;
        bVar.a(eVar.f18477a.f19579a, 0, 4, false);
        eVar.f18478b = 4;
        for (long m10 = eVar.f18477a.m(); m10 != 440786851; m10 = ((m10 << 8) & (-256)) | (eVar.f18477a.f19579a[0] & fq.i.NETWORK_LOAD_LIMIT_DISABLED)) {
            int i13 = eVar.f18478b + 1;
            eVar.f18478b = i13;
            if (i13 == i12) {
                return false;
            }
            bVar.a(eVar.f18477a.f19579a, 0, 1, false);
        }
        long a11 = eVar.a(gVar);
        long j12 = eVar.f18478b;
        if (a11 == Long.MIN_VALUE) {
            return false;
        }
        if (i11 != 0 && j12 + a11 >= j10) {
            return false;
        }
        while (true) {
            int i14 = (eVar.f18478b > (j12 + a11) ? 1 : (eVar.f18478b == (j12 + a11) ? 0 : -1));
            if (i14 >= 0) {
                return i14 == 0;
            } else if (eVar.a(gVar) == Long.MIN_VALUE || (a10 = eVar.a(gVar)) < 0 || a10 > 2147483647L) {
                return false;
            } else {
                if (i10 != 0) {
                    bVar.a((int) a10, false);
                    eVar.f18478b = (int) (eVar.f18478b + a10);
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void b() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(h hVar) {
        this.Y = hVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    public void a(long j10, long j11) {
        this.A = -9223372036854775807L;
        this.E = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a aVar = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a) this.f18424a;
        aVar.f18417e = 0;
        aVar.f18414b.clear();
        f fVar = aVar.f18415c;
        fVar.f18481b = 0;
        fVar.f18482c = 0;
        f fVar2 = this.f18425b;
        fVar2.f18481b = 0;
        fVar2.f18482c = 0;
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0005 A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g r9, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.W = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3d
            boolean r3 = r8.W
            if (r3 != 0) goto L3d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.b r2 = r8.f18424a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.a) r2
            boolean r2 = r2.a(r9)
            if (r2 == 0) goto L5
            r3 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) r3
            long r3 = r3.f18144c
            boolean r5 = r8.f18447x
            if (r5 == 0) goto L28
            r8.f18449z = r3
            long r3 = r8.f18448y
            r10.f18411a = r3
            r8.f18447x = r0
        L26:
            r3 = 1
            goto L3a
        L28:
            boolean r3 = r8.f18444u
            if (r3 == 0) goto L39
            long r3 = r8.f18449z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L39
            r10.f18411a = r3
            r8.f18449z = r5
            goto L26
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L5
            return r1
        L3d:
            if (r2 == 0) goto L40
            goto L41
        L40:
            r0 = -1
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.d.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    public final void a(c cVar, long j10) {
        int i10;
        byte[] bytes;
        if ("S_TEXT/UTF8".equals(cVar.f18451a)) {
            byte[] bArr = this.f18434k.f19579a;
            long j11 = this.G;
            if (j11 == -9223372036854775807L) {
                bytes = f18422a0;
            } else {
                int i11 = (int) (j11 / 3600000000L);
                long j12 = j11 - (i11 * 3600000000L);
                int i12 = (int) (j12 / 60000000);
                long j13 = j12 - (60000000 * i12);
                String format = String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) (j13 / 1000000)), Integer.valueOf((int) ((j13 - (1000000 * i10)) / 1000)));
                int i13 = u.f19606a;
                bytes = format.getBytes(Charset.defaultCharset());
            }
            System.arraycopy(bytes, 0, bArr, 19, 12);
            n nVar = cVar.O;
            k kVar = this.f18434k;
            nVar.a(kVar, kVar.f19581c);
            this.V += this.f18434k.f19581c;
        }
        cVar.O.a(j10, this.M, this.V, 0, cVar.f18457g);
        this.W = true;
        a();
    }

    public final void a() {
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        this.f18433j.r();
    }

    public final void a(g gVar, int i10) throws IOException, InterruptedException {
        k kVar = this.f18430g;
        if (kVar.f19581c >= i10) {
            return;
        }
        if (kVar.b() < i10) {
            k kVar2 = this.f18430g;
            byte[] bArr = kVar2.f19579a;
            kVar2.a(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i10)), this.f18430g.f19581c);
        }
        k kVar3 = this.f18430g;
        byte[] bArr2 = kVar3.f19579a;
        int i11 = kVar3.f19581c;
        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(bArr2, i11, i10 - i11, false);
        this.f18430g.d(i10);
    }

    public final void a(g gVar, c cVar, int i10) throws IOException, InterruptedException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f18451a)) {
            byte[] bArr = Z;
            int length = bArr.length + i10;
            if (this.f18434k.b() < length) {
                this.f18434k.f19579a = Arrays.copyOf(bArr, length + i10);
            }
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18434k.f19579a, bArr.length, i10, false);
            this.f18434k.e(0);
            this.f18434k.d(length);
            return;
        }
        n nVar = cVar.O;
        if (!this.O) {
            if (cVar.f18455e) {
                this.M &= -1073741825;
                if (!this.P) {
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18430g.f19579a, 0, 1, false);
                    this.N++;
                    byte[] bArr2 = this.f18430g.f19579a;
                    if ((bArr2[0] & 128) != 128) {
                        this.S = bArr2[0];
                        this.P = true;
                    } else {
                        throw new l("Extension bit is set in signal byte");
                    }
                }
                byte b10 = this.S;
                if ((b10 & 1) == 1) {
                    boolean z10 = (b10 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18435l.f19579a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        k kVar = this.f18430g;
                        kVar.f19579a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        kVar.e(0);
                        nVar.a(this.f18430g, 1);
                        this.V++;
                        this.f18435l.e(0);
                        nVar.a(this.f18435l, 8);
                        this.V += 8;
                    }
                    if (z10) {
                        if (!this.R) {
                            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18430g.f19579a, 0, 1, false);
                            this.N++;
                            this.f18430g.e(0);
                            this.T = this.f18430g.l();
                            this.R = true;
                        }
                        int i12 = this.T * 4;
                        this.f18430g.c(i12);
                        ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(this.f18430g.f19579a, 0, i12, false);
                        this.N += i12;
                        short s10 = (short) ((this.T / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f18437n;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f18437n = ByteBuffer.allocate(i13);
                        }
                        this.f18437n.position(0);
                        this.f18437n.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.T;
                            if (i14 >= i11) {
                                break;
                            }
                            int o10 = this.f18430g.o();
                            if (i14 % 2 == 0) {
                                this.f18437n.putShort((short) (o10 - i15));
                            } else {
                                this.f18437n.putInt(o10 - i15);
                            }
                            i14++;
                            i15 = o10;
                        }
                        int i16 = (i10 - this.N) - i15;
                        if (i11 % 2 == 1) {
                            this.f18437n.putInt(i16);
                        } else {
                            this.f18437n.putShort((short) i16);
                            this.f18437n.putInt(0);
                        }
                        this.f18436m.a(this.f18437n.array(), i13);
                        nVar.a(this.f18436m, i13);
                        this.V += i13;
                    }
                }
            } else {
                byte[] bArr3 = cVar.f18456f;
                if (bArr3 != null) {
                    k kVar2 = this.f18433j;
                    int length2 = bArr3.length;
                    kVar2.f19579a = bArr3;
                    kVar2.f19581c = length2;
                    kVar2.f19580b = 0;
                }
            }
            this.O = true;
        }
        int i17 = i10 + this.f18433j.f19581c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f18451a) && !"V_MPEGH/ISO/HEVC".equals(cVar.f18451a)) {
            while (true) {
                int i18 = this.N;
                if (i18 >= i17) {
                    break;
                }
                a(gVar, nVar, i17 - i18);
            }
        } else {
            byte[] bArr4 = this.f18429f.f19579a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i19 = cVar.P;
            int i20 = 4 - i19;
            while (this.N < i17) {
                int i21 = this.U;
                if (i21 == 0) {
                    int min = Math.min(i19, this.f18433j.a());
                    ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.b) gVar).b(bArr4, i20 + min, i19 - min, false);
                    if (min > 0) {
                        k kVar3 = this.f18433j;
                        System.arraycopy(kVar3.f19579a, kVar3.f19580b, bArr4, i20, min);
                        kVar3.f19580b += min;
                    }
                    this.N += i19;
                    this.f18429f.e(0);
                    this.U = this.f18429f.o();
                    this.f18428e.e(0);
                    nVar.a(this.f18428e, 4);
                    this.V += 4;
                } else {
                    this.U = i21 - a(gVar, nVar, i21);
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f18451a)) {
            this.f18431h.e(0);
            nVar.a(this.f18431h, 4);
            this.V += 4;
        }
    }

    public final int a(g gVar, n nVar, int i10) throws IOException, InterruptedException {
        int a10;
        int a11 = this.f18433j.a();
        if (a11 > 0) {
            a10 = Math.min(i10, a11);
            nVar.a(this.f18433j, a10);
        } else {
            a10 = nVar.a(gVar, i10, false);
        }
        this.N += a10;
        this.V += a10;
        return a10;
    }

    public final long a(long j10) throws l {
        long j11 = this.f18440q;
        if (j11 != -9223372036854775807L) {
            return u.a(j10, j11, 1000L);
        }
        throw new l("Can't scale timecode prior to timecodeScale being set.");
    }

    public static int[] a(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }
}
