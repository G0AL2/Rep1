package u8;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.inmobi.media.fq;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import ea.a0;
import ea.n0;
import ea.r;
import ea.s;
import ea.v;
import j8.h;
import j8.j2;
import j8.p1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import l8.a;
import p8.a0;
import p8.b0;
import p8.i;
import p8.j;
import p8.k;
import p8.m;
import p8.n;
import p8.w;
import p8.x;

/* compiled from: MatroskaExtractor.java */
/* loaded from: classes2.dex */
public class e implements i {

    /* renamed from: b0 */
    private static final byte[] f37599b0;

    /* renamed from: c0 */
    private static final byte[] f37600c0;

    /* renamed from: d0 */
    private static final byte[] f37601d0;

    /* renamed from: e0 */
    private static final byte[] f37602e0;

    /* renamed from: f0 */
    private static final UUID f37603f0;

    /* renamed from: g0 */
    private static final Map<String, Integer> f37604g0;
    private long A;
    private long B;
    private s C;
    private s D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private byte Y;
    private boolean Z;

    /* renamed from: a */
    private final u8.c f37605a;

    /* renamed from: a0 */
    private k f37606a0;

    /* renamed from: b */
    private final g f37607b;

    /* renamed from: c */
    private final SparseArray<c> f37608c;

    /* renamed from: d */
    private final boolean f37609d;

    /* renamed from: e */
    private final a0 f37610e;

    /* renamed from: f */
    private final a0 f37611f;

    /* renamed from: g */
    private final a0 f37612g;

    /* renamed from: h */
    private final a0 f37613h;

    /* renamed from: i */
    private final a0 f37614i;

    /* renamed from: j */
    private final a0 f37615j;

    /* renamed from: k */
    private final a0 f37616k;

    /* renamed from: l */
    private final a0 f37617l;

    /* renamed from: m */
    private final a0 f37618m;

    /* renamed from: n */
    private final a0 f37619n;

    /* renamed from: o */
    private ByteBuffer f37620o;

    /* renamed from: p */
    private long f37621p;

    /* renamed from: q */
    private long f37622q;

    /* renamed from: r */
    private long f37623r;

    /* renamed from: s */
    private long f37624s;

    /* renamed from: t */
    private long f37625t;

    /* renamed from: u */
    private c f37626u;

    /* renamed from: v */
    private boolean f37627v;

    /* renamed from: w */
    private int f37628w;

    /* renamed from: x */
    private long f37629x;

    /* renamed from: y */
    private boolean f37630y;

    /* renamed from: z */
    private long f37631z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes2.dex */
    public final class b implements u8.b {
        private b() {
            e.this = r1;
        }

        @Override // u8.b
        public void a(int i10) throws j2 {
            e.this.o(i10);
        }

        @Override // u8.b
        public void b(int i10, int i11, j jVar) throws IOException {
            e.this.l(i10, i11, jVar);
        }

        @Override // u8.b
        public void c(int i10, double d10) throws j2 {
            e.this.r(i10, d10);
        }

        @Override // u8.b
        public void d(int i10, long j10) throws j2 {
            e.this.x(i10, j10);
        }

        @Override // u8.b
        public int e(int i10) {
            return e.this.u(i10);
        }

        @Override // u8.b
        public boolean f(int i10) {
            return e.this.z(i10);
        }

        @Override // u8.b
        public void g(int i10, String str) throws j2 {
            e.this.H(i10, str);
        }

        @Override // u8.b
        public void h(int i10, long j10, long j11) throws j2 {
            e.this.G(i10, j10, j11);
        }
    }

    /* compiled from: MatroskaExtractor.java */
    /* loaded from: classes2.dex */
    public static final class c {
        public byte[] N;
        public b0 T;
        public boolean U;
        public p8.a0 X;
        public int Y;

        /* renamed from: a */
        public String f37633a;

        /* renamed from: b */
        public String f37634b;

        /* renamed from: c */
        public int f37635c;

        /* renamed from: d */
        public int f37636d;

        /* renamed from: e */
        public int f37637e;

        /* renamed from: f */
        public int f37638f;

        /* renamed from: g */
        private int f37639g;

        /* renamed from: h */
        public boolean f37640h;

        /* renamed from: i */
        public byte[] f37641i;

        /* renamed from: j */
        public a0.a f37642j;

        /* renamed from: k */
        public byte[] f37643k;

        /* renamed from: l */
        public DrmInitData f37644l;

        /* renamed from: m */
        public int f37645m = -1;

        /* renamed from: n */
        public int f37646n = -1;

        /* renamed from: o */
        public int f37647o = -1;

        /* renamed from: p */
        public int f37648p = -1;

        /* renamed from: q */
        public int f37649q = 0;

        /* renamed from: r */
        public int f37650r = -1;

        /* renamed from: s */
        public float f37651s = 0.0f;

        /* renamed from: t */
        public float f37652t = 0.0f;

        /* renamed from: u */
        public float f37653u = 0.0f;

        /* renamed from: v */
        public byte[] f37654v = null;

        /* renamed from: w */
        public int f37655w = -1;

        /* renamed from: x */
        public boolean f37656x = false;

        /* renamed from: y */
        public int f37657y = -1;

        /* renamed from: z */
        public int f37658z = -1;
        public int A = -1;
        public int B = 1000;
        public int C = 200;
        public float D = -1.0f;
        public float E = -1.0f;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public int O = 1;
        public int P = -1;
        public int Q = 8000;
        public long R = 0;
        public long S = 0;
        public boolean V = true;
        private String W = "eng";

        protected c() {
        }

        public void e() {
            ea.a.e(this.X);
        }

        private byte[] f(String str) throws j2 {
            byte[] bArr = this.f37643k;
            if (bArr == null) {
                String valueOf = String.valueOf(str);
                throw j2.a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
            }
            return bArr;
        }

        private byte[] g() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.K * 50000.0f) + 0.5f));
            order.putShort((short) (this.L + 0.5f));
            order.putShort((short) (this.M + 0.5f));
            order.putShort((short) this.B);
            order.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> j(ea.a0 a0Var) throws j2 {
            try {
                a0Var.Q(16);
                long t10 = a0Var.t();
                if (t10 == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (t10 == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (t10 == 826496599) {
                    byte[] d10 = a0Var.d();
                    for (int e10 = a0Var.e() + 20; e10 < d10.length - 4; e10++) {
                        if (d10[e10] == 0 && d10[e10 + 1] == 0 && d10[e10 + 2] == 1 && d10[e10 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d10, e10, d10.length)));
                        }
                    }
                    throw j2.a("Failed to find FourCC VC1 initialization data", null);
                }
                r.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw j2.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean k(ea.a0 a0Var) throws j2 {
            try {
                int v10 = a0Var.v();
                if (v10 == 1) {
                    return true;
                }
                if (v10 == 65534) {
                    a0Var.P(24);
                    if (a0Var.w() == e.f37603f0.getMostSignificantBits()) {
                        if (a0Var.w() == e.f37603f0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw j2.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> l(byte[] bArr) throws j2 {
            try {
                if (bArr[0] == 2) {
                    int i10 = 1;
                    int i11 = 0;
                    while ((bArr[i10] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 255) {
                        i11 += 255;
                        i10++;
                    }
                    int i12 = i10 + 1;
                    int i13 = i11 + (bArr[i10] & 255);
                    int i14 = 0;
                    while ((bArr[i12] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 255) {
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + (bArr[i12] & 255);
                    if (bArr[i15] == 1) {
                        byte[] bArr2 = new byte[i13];
                        System.arraycopy(bArr, i15, bArr2, 0, i13);
                        int i17 = i15 + i13;
                        if (bArr[i17] == 3) {
                            int i18 = i17 + i16;
                            if (bArr[i18] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i18];
                                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw j2.a("Error parsing vorbis codec private", null);
                        }
                        throw j2.a("Error parsing vorbis codec private", null);
                    }
                    throw j2.a("Error parsing vorbis codec private", null);
                }
                throw j2.a("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw j2.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public void h(k kVar, int i10) throws j2 {
            char c10;
            List<byte[]> singletonList;
            int d02;
            String str;
            int i11;
            int i12;
            List<byte[]> list;
            String str2;
            int i13;
            int i14;
            int i15;
            int i16;
            fa.c a10;
            String str3 = this.f37634b;
            str3.hashCode();
            switch (str3.hashCode()) {
                case -2095576542:
                    if (str3.equals("V_MPEG4/ISO/AP")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -2095575984:
                    if (str3.equals("V_MPEG4/ISO/SP")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1985379776:
                    if (str3.equals("A_MS/ACM")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1784763192:
                    if (str3.equals("A_TRUEHD")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1730367663:
                    if (str3.equals("A_VORBIS")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1482641358:
                    if (str3.equals("A_MPEG/L2")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1482641357:
                    if (str3.equals("A_MPEG/L3")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1373388978:
                    if (str3.equals("V_MS/VFW/FOURCC")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -933872740:
                    if (str3.equals("S_DVBSUB")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -538363189:
                    if (str3.equals("V_MPEG4/ISO/ASP")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -538363109:
                    if (str3.equals("V_MPEG4/ISO/AVC")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -425012669:
                    if (str3.equals("S_VOBSUB")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -356037306:
                    if (str3.equals("A_DTS/LOSSLESS")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 62923557:
                    if (str3.equals("A_AAC")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 62923603:
                    if (str3.equals("A_AC3")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 62927045:
                    if (str3.equals("A_DTS")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 82318131:
                    if (str3.equals("V_AV1")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 82338133:
                    if (str3.equals("V_VP8")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 82338134:
                    if (str3.equals("V_VP9")) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99146302:
                    if (str3.equals("S_HDMV/PGS")) {
                        c10 = 19;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 444813526:
                    if (str3.equals("V_THEORA")) {
                        c10 = 20;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 542569478:
                    if (str3.equals("A_DTS/EXPRESS")) {
                        c10 = 21;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 635596514:
                    if (str3.equals("A_PCM/FLOAT/IEEE")) {
                        c10 = 22;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 725948237:
                    if (str3.equals("A_PCM/INT/BIG")) {
                        c10 = 23;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 725957860:
                    if (str3.equals("A_PCM/INT/LIT")) {
                        c10 = 24;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 738597099:
                    if (str3.equals("S_TEXT/ASS")) {
                        c10 = 25;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 855502857:
                    if (str3.equals("V_MPEGH/ISO/HEVC")) {
                        c10 = 26;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1045209816:
                    if (str3.equals("S_TEXT/WEBVTT")) {
                        c10 = 27;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1422270023:
                    if (str3.equals("S_TEXT/UTF8")) {
                        c10 = 28;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1809237540:
                    if (str3.equals("V_MPEG2")) {
                        c10 = 29;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1950749482:
                    if (str3.equals("A_EAC3")) {
                        c10 = 30;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1950789798:
                    if (str3.equals("A_FLAC")) {
                        c10 = 31;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1951062397:
                    if (str3.equals("A_OPUS")) {
                        c10 = ' ';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            String str4 = "audio/raw";
            switch (c10) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr = this.f37643k;
                    singletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str4 = "video/mp4v-es";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 2:
                    if (k(new ea.a0(f(this.f37634b)))) {
                        d02 = n0.d0(this.P);
                        if (d02 == 0) {
                            int i17 = this.P;
                            StringBuilder sb2 = new StringBuilder("audio/x-unknown".length() + 60);
                            sb2.append("Unsupported PCM bit depth: ");
                            sb2.append(i17);
                            sb2.append(". Setting mimeType to ");
                            sb2.append("audio/x-unknown");
                            r.h("MatroskaExtractor", sb2.toString());
                        }
                        i11 = d02;
                        singletonList = null;
                        str = null;
                        i12 = -1;
                        break;
                    } else {
                        r.h("MatroskaExtractor", "audio/x-unknown".length() != 0 ? "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown") : new String("Non-PCM MS/ACM is unsupported. Setting mimeType to "));
                    }
                    singletonList = null;
                    str = null;
                    str4 = "audio/x-unknown";
                    i11 = -1;
                    i12 = -1;
                case 3:
                    this.T = new b0();
                    str4 = "audio/true-hd";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 4:
                    singletonList = l(f(this.f37634b));
                    str4 = "audio/vorbis";
                    str = null;
                    i11 = -1;
                    i12 = Constants.BUFFER_SIZE;
                    break;
                case 5:
                    str4 = "audio/mpeg-L2";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = 4096;
                    break;
                case 6:
                    str4 = "audio/mpeg";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = 4096;
                    break;
                case 7:
                    Pair<String, List<byte[]>> j10 = j(new ea.a0(f(this.f37634b)));
                    str4 = (String) j10.first;
                    singletonList = (List) j10.second;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case '\b':
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(f(this.f37634b), 0, bArr2, 0, 4);
                    singletonList = jb.s.u(bArr2);
                    str4 = "application/dvbsubs";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case '\n':
                    com.google.android.exoplayer2.video.a b10 = com.google.android.exoplayer2.video.a.b(new ea.a0(f(this.f37634b)));
                    list = b10.f21805a;
                    this.Y = b10.f21806b;
                    str2 = b10.f21810f;
                    str4 = "video/avc";
                    i11 = -1;
                    i12 = -1;
                    List<byte[]> list2 = list;
                    str = str2;
                    singletonList = list2;
                    break;
                case 11:
                    singletonList = jb.s.u(f(this.f37634b));
                    str = null;
                    str4 = "application/vobsub";
                    i11 = -1;
                    i12 = -1;
                    break;
                case '\f':
                    str4 = "audio/vnd.dts.hd";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case '\r':
                    singletonList = Collections.singletonList(f(this.f37634b));
                    a.b f10 = l8.a.f(this.f37643k);
                    this.Q = f10.f33744a;
                    this.O = f10.f33745b;
                    str = f10.f33746c;
                    str4 = AudioTrackTranscoder.MIMETYPE_AUDIO_AAC;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 14:
                    str4 = "audio/ac3";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 15:
                case 21:
                    str4 = "audio/vnd.dts";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 16:
                    str4 = "video/av01";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 17:
                    str4 = "video/x-vnd.on2.vp8";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 18:
                    str4 = "video/x-vnd.on2.vp9";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 19:
                    singletonList = null;
                    str = null;
                    str4 = "application/pgs";
                    i11 = -1;
                    i12 = -1;
                    break;
                case 20:
                    str4 = "video/x-unknown";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 22:
                    int i18 = this.P;
                    if (i18 == 32) {
                        singletonList = null;
                        str = null;
                        i11 = 4;
                        i12 = -1;
                        break;
                    } else {
                        StringBuilder sb3 = new StringBuilder("audio/x-unknown".length() + 75);
                        sb3.append("Unsupported floating point PCM bit depth: ");
                        sb3.append(i18);
                        sb3.append(". Setting mimeType to ");
                        sb3.append("audio/x-unknown");
                        r.h("MatroskaExtractor", sb3.toString());
                        singletonList = null;
                        str = null;
                        str4 = "audio/x-unknown";
                        i11 = -1;
                        i12 = -1;
                    }
                case 23:
                    int i19 = this.P;
                    if (i19 == 8) {
                        singletonList = null;
                        str = null;
                        i11 = 3;
                    } else if (i19 == 16) {
                        singletonList = null;
                        str = null;
                        i11 = 268435456;
                    } else {
                        StringBuilder sb4 = new StringBuilder("audio/x-unknown".length() + 71);
                        sb4.append("Unsupported big endian PCM bit depth: ");
                        sb4.append(i19);
                        sb4.append(". Setting mimeType to ");
                        sb4.append("audio/x-unknown");
                        r.h("MatroskaExtractor", sb4.toString());
                        singletonList = null;
                        str = null;
                        str4 = "audio/x-unknown";
                        i11 = -1;
                    }
                    i12 = -1;
                    break;
                case 24:
                    d02 = n0.d0(this.P);
                    if (d02 == 0) {
                        int i20 = this.P;
                        StringBuilder sb5 = new StringBuilder("audio/x-unknown".length() + 74);
                        sb5.append("Unsupported little endian PCM bit depth: ");
                        sb5.append(i20);
                        sb5.append(". Setting mimeType to ");
                        sb5.append("audio/x-unknown");
                        r.h("MatroskaExtractor", sb5.toString());
                        singletonList = null;
                        str = null;
                        str4 = "audio/x-unknown";
                        i11 = -1;
                        i12 = -1;
                        break;
                    }
                    i11 = d02;
                    singletonList = null;
                    str = null;
                    i12 = -1;
                case 25:
                    singletonList = jb.s.v(e.f37600c0, f(this.f37634b));
                    str = null;
                    str4 = "text/x-ssa";
                    i11 = -1;
                    i12 = -1;
                    break;
                case 26:
                    com.google.android.exoplayer2.video.b a11 = com.google.android.exoplayer2.video.b.a(new ea.a0(f(this.f37634b)));
                    list = a11.f21811a;
                    this.Y = a11.f21812b;
                    str2 = a11.f21814d;
                    str4 = "video/hevc";
                    i11 = -1;
                    i12 = -1;
                    List<byte[]> list22 = list;
                    str = str2;
                    singletonList = list22;
                    break;
                case 27:
                    singletonList = null;
                    str = null;
                    str4 = "text/vtt";
                    i11 = -1;
                    i12 = -1;
                    break;
                case 28:
                    str4 = "application/x-subrip";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 29:
                    str4 = "video/mpeg2";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 30:
                    str4 = "audio/eac3";
                    singletonList = null;
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case 31:
                    singletonList = Collections.singletonList(f(this.f37634b));
                    str4 = "audio/flac";
                    str = null;
                    i11 = -1;
                    i12 = -1;
                    break;
                case ' ':
                    singletonList = new ArrayList<>(3);
                    singletonList.add(f(this.f37634b));
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    singletonList.add(allocate.order(byteOrder).putLong(this.R).array());
                    singletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str4 = "audio/opus";
                    str = null;
                    i11 = -1;
                    i12 = 5760;
                    break;
                default:
                    throw j2.a("Unrecognized codec identifier.", null);
            }
            byte[] bArr3 = this.N;
            if (bArr3 != null && (a10 = fa.c.a(new ea.a0(bArr3))) != null) {
                str = a10.f30207a;
                str4 = "video/dolby-vision";
            }
            String str5 = str4;
            int i21 = (this.U ? 2 : 0) | (this.V ? 1 : 0) | 0;
            p1.b bVar = new p1.b();
            if (v.p(str5)) {
                bVar.H(this.O).f0(this.Q).Y(i11);
                i13 = 1;
            } else if (v.t(str5)) {
                if (this.f37649q == 0) {
                    int i22 = this.f37647o;
                    i14 = -1;
                    if (i22 == -1) {
                        i22 = this.f37645m;
                    }
                    this.f37647o = i22;
                    int i23 = this.f37648p;
                    if (i23 == -1) {
                        i23 = this.f37646n;
                    }
                    this.f37648p = i23;
                } else {
                    i14 = -1;
                }
                float f11 = -1.0f;
                if (this.f37647o != i14 && (i16 = this.f37648p) != i14) {
                    f11 = (this.f37646n * i15) / (this.f37645m * i16);
                }
                fa.b bVar2 = this.f37656x ? new fa.b(this.f37657y, this.A, this.f37658z, g()) : null;
                if (this.f37633a != null && e.f37604g0.containsKey(this.f37633a)) {
                    i14 = ((Integer) e.f37604g0.get(this.f37633a)).intValue();
                }
                if (this.f37650r == 0 && Float.compare(this.f37651s, 0.0f) == 0 && Float.compare(this.f37652t, 0.0f) == 0) {
                    if (Float.compare(this.f37653u, 0.0f) == 0) {
                        i14 = 0;
                    } else if (Float.compare(this.f37652t, 90.0f) == 0) {
                        i14 = 90;
                    } else if (Float.compare(this.f37652t, -180.0f) == 0 || Float.compare(this.f37652t, 180.0f) == 0) {
                        i14 = 180;
                    } else if (Float.compare(this.f37652t, -90.0f) == 0) {
                        i14 = 270;
                    }
                }
                bVar.j0(this.f37645m).Q(this.f37646n).a0(f11).d0(i14).b0(this.f37654v).h0(this.f37655w).J(bVar2);
                i13 = 2;
            } else if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
                throw j2.a("Unexpected MIME type.", null);
            } else {
                i13 = 3;
            }
            if (this.f37633a != null && !e.f37604g0.containsKey(this.f37633a)) {
                bVar.U(this.f37633a);
            }
            p1 E = bVar.R(i10).e0(str5).W(i12).V(this.W).g0(i21).T(singletonList).I(str).M(this.f37644l).E();
            p8.a0 f12 = kVar.f(this.f37635c, i13);
            this.X = f12;
            f12.d(E);
        }

        public void i() {
            b0 b0Var = this.T;
            if (b0Var != null) {
                b0Var.a(this.X, this.f37642j);
            }
        }

        public void m() {
            b0 b0Var = this.T;
            if (b0Var != null) {
                b0Var.b();
            }
        }
    }

    static {
        d dVar = new n() { // from class: u8.d
            @Override // p8.n
            public /* synthetic */ i[] a(Uri uri, Map map) {
                return m.a(this, uri, map);
            }

            @Override // p8.n
            public final i[] b() {
                return e.b();
            }
        };
        f37599b0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f37600c0 = n0.p0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f37601d0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f37602e0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f37603f0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f37604g0 = Collections.unmodifiableMap(hashMap);
    }

    public e() {
        this(0);
    }

    public static /* synthetic */ i[] A() {
        return new i[]{new e()};
    }

    private boolean B(w wVar, long j10) {
        if (this.f37630y) {
            this.A = j10;
            wVar.f35701a = this.f37631z;
            this.f37630y = false;
            return true;
        }
        if (this.f37627v) {
            long j11 = this.A;
            if (j11 != -1) {
                wVar.f35701a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    private void C(j jVar, int i10) throws IOException {
        if (this.f37612g.f() >= i10) {
            return;
        }
        if (this.f37612g.b() < i10) {
            ea.a0 a0Var = this.f37612g;
            a0Var.c(Math.max(a0Var.b() * 2, i10));
        }
        jVar.readFully(this.f37612g.d(), this.f37612g.f(), i10 - this.f37612g.f());
        this.f37612g.O(i10);
    }

    private void D() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f37615j.L(0);
    }

    private long E(long j10) throws j2 {
        long j11 = this.f37623r;
        if (j11 != -9223372036854775807L) {
            return n0.O0(j10, j11, 1000L);
        }
        throw j2.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void F(String str, long j10, byte[] bArr) {
        byte[] s10;
        int i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                s10 = s(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case 1:
                s10 = s(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case 2:
                s10 = s(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(s10, 0, bArr, i10, s10.length);
    }

    private int I(j jVar, c cVar, int i10) throws IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f37634b)) {
            J(jVar, f37599b0, i10);
            return q();
        } else if ("S_TEXT/ASS".equals(cVar.f37634b)) {
            J(jVar, f37601d0, i10);
            return q();
        } else if ("S_TEXT/WEBVTT".equals(cVar.f37634b)) {
            J(jVar, f37602e0, i10);
            return q();
        } else {
            p8.a0 a0Var = cVar.X;
            if (!this.U) {
                if (cVar.f37640h) {
                    this.O &= -1073741825;
                    if (!this.V) {
                        jVar.readFully(this.f37612g.d(), 0, 1);
                        this.R++;
                        if ((this.f37612g.d()[0] & 128) != 128) {
                            this.Y = this.f37612g.d()[0];
                            this.V = true;
                        } else {
                            throw j2.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b10 = this.Y;
                    if ((b10 & 1) == 1) {
                        boolean z10 = (b10 & 2) == 2;
                        this.O |= 1073741824;
                        if (!this.Z) {
                            jVar.readFully(this.f37617l.d(), 0, 8);
                            this.R += 8;
                            this.Z = true;
                            this.f37612g.d()[0] = (byte) ((z10 ? 128 : 0) | 8);
                            this.f37612g.P(0);
                            a0Var.f(this.f37612g, 1, 1);
                            this.S++;
                            this.f37617l.P(0);
                            a0Var.f(this.f37617l, 8, 1);
                            this.S += 8;
                        }
                        if (z10) {
                            if (!this.W) {
                                jVar.readFully(this.f37612g.d(), 0, 1);
                                this.R++;
                                this.f37612g.P(0);
                                this.X = this.f37612g.D();
                                this.W = true;
                            }
                            int i12 = this.X * 4;
                            this.f37612g.L(i12);
                            jVar.readFully(this.f37612g.d(), 0, i12);
                            this.R += i12;
                            short s10 = (short) ((this.X / 2) + 1);
                            int i13 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f37620o;
                            if (byteBuffer == null || byteBuffer.capacity() < i13) {
                                this.f37620o = ByteBuffer.allocate(i13);
                            }
                            this.f37620o.position(0);
                            this.f37620o.putShort(s10);
                            int i14 = 0;
                            int i15 = 0;
                            while (true) {
                                i11 = this.X;
                                if (i14 >= i11) {
                                    break;
                                }
                                int H = this.f37612g.H();
                                if (i14 % 2 == 0) {
                                    this.f37620o.putShort((short) (H - i15));
                                } else {
                                    this.f37620o.putInt(H - i15);
                                }
                                i14++;
                                i15 = H;
                            }
                            int i16 = (i10 - this.R) - i15;
                            if (i11 % 2 == 1) {
                                this.f37620o.putInt(i16);
                            } else {
                                this.f37620o.putShort((short) i16);
                                this.f37620o.putInt(0);
                            }
                            this.f37618m.N(this.f37620o.array(), i13);
                            a0Var.f(this.f37618m, i13, 1);
                            this.S += i13;
                        }
                    }
                } else {
                    byte[] bArr = cVar.f37641i;
                    if (bArr != null) {
                        this.f37615j.N(bArr, bArr.length);
                    }
                }
                if (cVar.f37638f > 0) {
                    this.O |= 268435456;
                    this.f37619n.L(0);
                    this.f37612g.L(4);
                    this.f37612g.d()[0] = (byte) ((i10 >> 24) & 255);
                    this.f37612g.d()[1] = (byte) ((i10 >> 16) & 255);
                    this.f37612g.d()[2] = (byte) ((i10 >> 8) & 255);
                    this.f37612g.d()[3] = (byte) (i10 & 255);
                    a0Var.f(this.f37612g, 4, 2);
                    this.S += 4;
                }
                this.U = true;
            }
            int f10 = i10 + this.f37615j.f();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f37634b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f37634b)) {
                if (cVar.T != null) {
                    ea.a.f(this.f37615j.f() == 0);
                    cVar.T.d(jVar);
                }
                while (true) {
                    int i17 = this.R;
                    if (i17 >= f10) {
                        break;
                    }
                    int K = K(jVar, a0Var, f10 - i17);
                    this.R += K;
                    this.S += K;
                }
            } else {
                byte[] d10 = this.f37611f.d();
                d10[0] = 0;
                d10[1] = 0;
                d10[2] = 0;
                int i18 = cVar.Y;
                int i19 = 4 - i18;
                while (this.R < f10) {
                    int i20 = this.T;
                    if (i20 == 0) {
                        L(jVar, d10, i19, i18);
                        this.R += i18;
                        this.f37611f.P(0);
                        this.T = this.f37611f.H();
                        this.f37610e.P(0);
                        a0Var.a(this.f37610e, 4);
                        this.S += 4;
                    } else {
                        int K2 = K(jVar, a0Var, i20);
                        this.R += K2;
                        this.S += K2;
                        this.T -= K2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f37634b)) {
                this.f37613h.P(0);
                a0Var.a(this.f37613h, 4);
                this.S += 4;
            }
            return q();
        }
    }

    private void J(j jVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f37616k.b() < length) {
            this.f37616k.M(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f37616k.d(), 0, bArr.length);
        }
        jVar.readFully(this.f37616k.d(), bArr.length, i10);
        this.f37616k.P(0);
        this.f37616k.O(length);
    }

    private int K(j jVar, p8.a0 a0Var, int i10) throws IOException {
        int a10 = this.f37615j.a();
        if (a10 > 0) {
            int min = Math.min(i10, a10);
            a0Var.a(this.f37615j, min);
            return min;
        }
        return a0Var.c(jVar, i10, false);
    }

    private void L(j jVar, byte[] bArr, int i10, int i11) throws IOException {
        int min = Math.min(i11, this.f37615j.a());
        jVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f37615j.j(bArr, i10, min);
        }
    }

    public static /* synthetic */ i[] b() {
        return A();
    }

    private void i(int i10) throws j2 {
        if (this.C == null || this.D == null) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Element ");
            sb2.append(i10);
            sb2.append(" must be in a Cues");
            throw j2.a(sb2.toString(), null);
        }
    }

    private void j(int i10) throws j2 {
        if (this.f37626u != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw j2.a(sb2.toString(), null);
    }

    private void k() {
        ea.a.h(this.f37606a0);
    }

    private x m(s sVar, s sVar2) {
        int i10;
        if (this.f37622q != -1 && this.f37625t != -9223372036854775807L && sVar != null && sVar.c() != 0 && sVar2 != null && sVar2.c() == sVar.c()) {
            int c10 = sVar.c();
            int[] iArr = new int[c10];
            long[] jArr = new long[c10];
            long[] jArr2 = new long[c10];
            long[] jArr3 = new long[c10];
            int i11 = 0;
            for (int i12 = 0; i12 < c10; i12++) {
                jArr3[i12] = sVar.b(i12);
                jArr[i12] = this.f37622q + sVar2.b(i12);
            }
            while (true) {
                i10 = c10 - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArr[i11] = (int) (jArr[i13] - jArr[i11]);
                jArr2[i11] = jArr3[i13] - jArr3[i11];
                i11 = i13;
            }
            iArr[i10] = (int) ((this.f37622q + this.f37621p) - jArr[i10]);
            jArr2[i10] = this.f37625t - jArr3[i10];
            long j10 = jArr2[i10];
            if (j10 <= 0) {
                StringBuilder sb2 = new StringBuilder(72);
                sb2.append("Discarding last cue point with unexpected duration: ");
                sb2.append(j10);
                r.h("MatroskaExtractor", sb2.toString());
                iArr = Arrays.copyOf(iArr, i10);
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                jArr3 = Arrays.copyOf(jArr3, i10);
            }
            return new p8.d(iArr, jArr, jArr2, jArr3);
        }
        return new x.b(this.f37625t);
    }

    private void n(c cVar, long j10, int i10, int i11, int i12) {
        b0 b0Var = cVar.T;
        if (b0Var != null) {
            b0Var.c(cVar.X, j10, i10, i11, i12, cVar.f37642j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f37634b) || "S_TEXT/ASS".equals(cVar.f37634b) || "S_TEXT/WEBVTT".equals(cVar.f37634b)) {
                if (this.K > 1) {
                    r.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        r.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        F(cVar.f37634b, j11, this.f37616k.d());
                        int e10 = this.f37616k.e();
                        while (true) {
                            if (e10 >= this.f37616k.f()) {
                                break;
                            } else if (this.f37616k.d()[e10] == 0) {
                                this.f37616k.O(e10);
                                break;
                            } else {
                                e10++;
                            }
                        }
                        p8.a0 a0Var = cVar.X;
                        ea.a0 a0Var2 = this.f37616k;
                        a0Var.a(a0Var2, a0Var2.f());
                        i11 += this.f37616k.f();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    i10 &= -268435457;
                } else {
                    int f10 = this.f37619n.f();
                    cVar.X.f(this.f37619n, f10, 2);
                    i11 += f10;
                }
            }
            cVar.X.e(j10, i10, i11, i12, cVar.f37642j);
        }
        this.F = true;
    }

    private static int[] p(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int q() {
        int i10 = this.S;
        D();
        return i10;
    }

    private static byte[] s(long j10, String str, long j11) {
        ea.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return n0.p0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    private static boolean y(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    protected void G(int i10, long j10, long j11) throws j2 {
        k();
        if (i10 == 160) {
            this.Q = false;
        } else if (i10 == 174) {
            this.f37626u = new c();
        } else if (i10 == 187) {
            this.E = false;
        } else if (i10 == 19899) {
            this.f37628w = -1;
            this.f37629x = -1L;
        } else if (i10 == 20533) {
            t(i10).f37640h = true;
        } else if (i10 == 21968) {
            t(i10).f37656x = true;
        } else if (i10 == 408125543) {
            long j12 = this.f37622q;
            if (j12 != -1 && j12 != j10) {
                throw j2.a("Multiple Segment elements not supported", null);
            }
            this.f37622q = j10;
            this.f37621p = j11;
        } else if (i10 != 475249515) {
            if (i10 == 524531317 && !this.f37627v) {
                if (this.f37609d && this.f37631z != -1) {
                    this.f37630y = true;
                    return;
                }
                this.f37606a0.n(new x.b(this.f37625t));
                this.f37627v = true;
            }
        } else {
            this.C = new s();
            this.D = new s();
        }
    }

    protected void H(int i10, String str) throws j2 {
        if (i10 == 134) {
            t(i10).f37634b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                t(i10).f37633a = str;
            } else if (i10 != 2274716) {
            } else {
                t(i10).W = str;
            }
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
            sb2.append("DocType ");
            sb2.append(str);
            sb2.append(" not supported");
            throw j2.a(sb2.toString(), null);
        }
    }

    @Override // p8.i
    public void a(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f37605a.reset();
        this.f37607b.e();
        D();
        for (int i10 = 0; i10 < this.f37608c.size(); i10++) {
            this.f37608c.valueAt(i10).m();
        }
    }

    @Override // p8.i
    public final void c(k kVar) {
        this.f37606a0 = kVar;
    }

    @Override // p8.i
    public final int g(j jVar, w wVar) throws IOException {
        this.F = false;
        boolean z10 = true;
        while (z10 && !this.F) {
            z10 = this.f37605a.a(jVar);
            if (z10 && B(wVar, jVar.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f37608c.size(); i10++) {
            c valueAt = this.f37608c.valueAt(i10);
            valueAt.e();
            valueAt.i();
        }
        return -1;
    }

    @Override // p8.i
    public final boolean h(j jVar) throws IOException {
        return new f().b(jVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0243, code lost:
        throw j8.j2.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void l(int r22, int r23, p8.j r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.e.l(int, int, p8.j):void");
    }

    protected void o(int i10) throws j2 {
        k();
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            c cVar = this.f37608c.get(this.M);
            cVar.e();
            for (int i13 = 0; i13 < this.K; i13++) {
                long j10 = ((cVar.f37637e * i13) / 1000) + this.H;
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                i11 -= i15;
                n(cVar, j10, i14, i15, i11);
            }
            this.G = 0;
        } else if (i10 == 174) {
            c cVar2 = (c) ea.a.h(this.f37626u);
            String str = cVar2.f37634b;
            if (str != null) {
                if (y(str)) {
                    cVar2.h(this.f37606a0, cVar2.f37635c);
                    this.f37608c.put(cVar2.f37635c, cVar2);
                }
                this.f37626u = null;
                return;
            }
            throw j2.a("CodecId is missing in TrackEntry element", null);
        } else if (i10 == 19899) {
            int i16 = this.f37628w;
            if (i16 != -1) {
                long j11 = this.f37629x;
                if (j11 != -1) {
                    if (i16 == 475249515) {
                        this.f37631z = j11;
                        return;
                    }
                    return;
                }
            }
            throw j2.a("Mandatory element SeekID or SeekPosition not found", null);
        } else if (i10 == 25152) {
            j(i10);
            c cVar3 = this.f37626u;
            if (cVar3.f37640h) {
                if (cVar3.f37642j != null) {
                    cVar3.f37644l = new DrmInitData(new DrmInitData.SchemeData(h.f32425a, "video/webm", this.f37626u.f37642j.f35612b));
                    return;
                }
                throw j2.a("Encrypted Track found but ContentEncKeyID was not found", null);
            }
        } else if (i10 == 28032) {
            j(i10);
            c cVar4 = this.f37626u;
            if (cVar4.f37640h && cVar4.f37641i != null) {
                throw j2.a("Combining encryption and compression is not supported", null);
            }
        } else if (i10 == 357149030) {
            if (this.f37623r == -9223372036854775807L) {
                this.f37623r = 1000000L;
            }
            long j12 = this.f37624s;
            if (j12 != -9223372036854775807L) {
                this.f37625t = E(j12);
            }
        } else if (i10 == 374648427) {
            if (this.f37608c.size() != 0) {
                this.f37606a0.r();
                return;
            }
            throw j2.a("No valid tracks were found", null);
        } else if (i10 == 475249515) {
            if (!this.f37627v) {
                this.f37606a0.n(m(this.C, this.D));
                this.f37627v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    protected void r(int i10, double d10) throws j2 {
        if (i10 == 181) {
            t(i10).Q = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case 21969:
                    t(i10).D = (float) d10;
                    return;
                case 21970:
                    t(i10).E = (float) d10;
                    return;
                case 21971:
                    t(i10).F = (float) d10;
                    return;
                case 21972:
                    t(i10).G = (float) d10;
                    return;
                case 21973:
                    t(i10).H = (float) d10;
                    return;
                case 21974:
                    t(i10).I = (float) d10;
                    return;
                case 21975:
                    t(i10).J = (float) d10;
                    return;
                case 21976:
                    t(i10).K = (float) d10;
                    return;
                case 21977:
                    t(i10).L = (float) d10;
                    return;
                case 21978:
                    t(i10).M = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case 30323:
                            t(i10).f37651s = (float) d10;
                            return;
                        case 30324:
                            t(i10).f37652t = (float) d10;
                            return;
                        case 30325:
                            t(i10).f37653u = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f37624s = (long) d10;
        }
    }

    @Override // p8.i
    public final void release() {
    }

    protected c t(int i10) throws j2 {
        j(i10);
        return this.f37626u;
    }

    protected int u(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void v(c cVar, j jVar, int i10) throws IOException {
        if (cVar.f37639g != 1685485123 && cVar.f37639g != 1685480259) {
            jVar.m(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.N = bArr;
        jVar.readFully(bArr, 0, i10);
    }

    protected void w(c cVar, int i10, j jVar, int i11) throws IOException {
        if (i10 == 4 && "V_VP9".equals(cVar.f37634b)) {
            this.f37619n.L(i11);
            jVar.readFully(this.f37619n.d(), 0, i11);
            return;
        }
        jVar.m(i11);
    }

    protected void x(int i10, long j10) throws j2 {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw j2.a(sb2.toString(), null);
        } else if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw j2.a(sb3.toString(), null);
        } else {
            switch (i10) {
                case 131:
                    t(i10).f37636d = (int) j10;
                    return;
                case 136:
                    t(i10).V = j10 == 1;
                    return;
                case 155:
                    this.I = E(j10);
                    return;
                case 159:
                    t(i10).O = (int) j10;
                    return;
                case 176:
                    t(i10).f37645m = (int) j10;
                    return;
                case 179:
                    i(i10);
                    this.C.a(E(j10));
                    return;
                case 186:
                    t(i10).f37646n = (int) j10;
                    return;
                case 215:
                    t(i10).f37635c = (int) j10;
                    return;
                case 231:
                    this.B = E(j10);
                    return;
                case 238:
                    this.P = (int) j10;
                    return;
                case 241:
                    if (this.E) {
                        return;
                    }
                    i(i10);
                    this.D.a(j10);
                    this.E = true;
                    return;
                case 251:
                    this.Q = true;
                    return;
                case 16871:
                    t(i10).f37639g = (int) j10;
                    return;
                case 16980:
                    if (j10 == 3) {
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder(50);
                    sb4.append("ContentCompAlgo ");
                    sb4.append(j10);
                    sb4.append(" not supported");
                    throw j2.a(sb4.toString(), null);
                case 17029:
                    if (j10 < 1 || j10 > 2) {
                        StringBuilder sb5 = new StringBuilder(53);
                        sb5.append("DocTypeReadVersion ");
                        sb5.append(j10);
                        sb5.append(" not supported");
                        throw j2.a(sb5.toString(), null);
                    }
                    return;
                case 17143:
                    if (j10 == 1) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(50);
                    sb6.append("EBMLReadVersion ");
                    sb6.append(j10);
                    sb6.append(" not supported");
                    throw j2.a(sb6.toString(), null);
                case 18401:
                    if (j10 == 5) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(49);
                    sb7.append("ContentEncAlgo ");
                    sb7.append(j10);
                    sb7.append(" not supported");
                    throw j2.a(sb7.toString(), null);
                case 18408:
                    if (j10 == 1) {
                        return;
                    }
                    StringBuilder sb8 = new StringBuilder(56);
                    sb8.append("AESSettingsCipherMode ");
                    sb8.append(j10);
                    sb8.append(" not supported");
                    throw j2.a(sb8.toString(), null);
                case 21420:
                    this.f37629x = j10 + this.f37622q;
                    return;
                case 21432:
                    int i11 = (int) j10;
                    j(i10);
                    if (i11 == 0) {
                        this.f37626u.f37655w = 0;
                        return;
                    } else if (i11 == 1) {
                        this.f37626u.f37655w = 2;
                        return;
                    } else if (i11 == 3) {
                        this.f37626u.f37655w = 1;
                        return;
                    } else if (i11 != 15) {
                        return;
                    } else {
                        this.f37626u.f37655w = 3;
                        return;
                    }
                case 21680:
                    t(i10).f37647o = (int) j10;
                    return;
                case 21682:
                    t(i10).f37649q = (int) j10;
                    return;
                case 21690:
                    t(i10).f37648p = (int) j10;
                    return;
                case 21930:
                    t(i10).U = j10 == 1;
                    return;
                case 21998:
                    t(i10).f37638f = (int) j10;
                    return;
                case 22186:
                    t(i10).R = j10;
                    return;
                case 22203:
                    t(i10).S = j10;
                    return;
                case 25188:
                    t(i10).P = (int) j10;
                    return;
                case 30321:
                    j(i10);
                    int i12 = (int) j10;
                    if (i12 == 0) {
                        this.f37626u.f37650r = 0;
                        return;
                    } else if (i12 == 1) {
                        this.f37626u.f37650r = 1;
                        return;
                    } else if (i12 == 2) {
                        this.f37626u.f37650r = 2;
                        return;
                    } else if (i12 != 3) {
                        return;
                    } else {
                        this.f37626u.f37650r = 3;
                        return;
                    }
                case 2352003:
                    t(i10).f37637e = (int) j10;
                    return;
                case 2807729:
                    this.f37623r = j10;
                    return;
                default:
                    switch (i10) {
                        case 21945:
                            j(i10);
                            int i13 = (int) j10;
                            if (i13 == 1) {
                                this.f37626u.A = 2;
                                return;
                            } else if (i13 != 2) {
                                return;
                            } else {
                                this.f37626u.A = 1;
                                return;
                            }
                        case 21946:
                            j(i10);
                            int c10 = fa.b.c((int) j10);
                            if (c10 != -1) {
                                this.f37626u.f37658z = c10;
                                return;
                            }
                            return;
                        case 21947:
                            j(i10);
                            this.f37626u.f37656x = true;
                            int b10 = fa.b.b((int) j10);
                            if (b10 != -1) {
                                this.f37626u.f37657y = b10;
                                return;
                            }
                            return;
                        case 21948:
                            t(i10).B = (int) j10;
                            return;
                        case 21949:
                            t(i10).C = (int) j10;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    protected boolean z(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public e(int i10) {
        this(new u8.a(), i10);
    }

    e(u8.c cVar, int i10) {
        this.f37622q = -1L;
        this.f37623r = -9223372036854775807L;
        this.f37624s = -9223372036854775807L;
        this.f37625t = -9223372036854775807L;
        this.f37631z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f37605a = cVar;
        cVar.b(new b());
        this.f37609d = (i10 & 1) == 0;
        this.f37607b = new g();
        this.f37608c = new SparseArray<>();
        this.f37612g = new ea.a0(4);
        this.f37613h = new ea.a0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f37614i = new ea.a0(4);
        this.f37610e = new ea.a0(ea.w.f29749a);
        this.f37611f = new ea.a0(4);
        this.f37615j = new ea.a0();
        this.f37616k = new ea.a0();
        this.f37617l = new ea.a0(8);
        this.f37618m = new ea.a0();
        this.f37619n = new ea.a0();
        this.L = new int[1];
    }
}
