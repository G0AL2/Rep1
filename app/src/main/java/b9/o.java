package b9;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import b9.l;
import b9.v;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.j;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import ea.i0;
import ea.k0;
import ea.n0;
import j8.p1;
import j8.q1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k8.o1;
import m8.g;

/* compiled from: MediaCodecRenderer.java */
/* loaded from: classes2.dex */
public abstract class o extends j8.f {
    private static final byte[] K0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private p1 A;
    private long A0;
    private p1 B;
    private boolean B0;
    private com.google.android.exoplayer2.drm.j C;
    private boolean C0;
    private com.google.android.exoplayer2.drm.j D;
    private boolean D0;
    private MediaCrypto E;
    private boolean E0;
    private boolean F;
    private j8.n F0;
    private long G;
    protected m8.e G0;
    private float H;
    private long H0;
    private float I;
    private long I0;
    private l J;
    private int J0;
    private p1 K;
    private MediaFormat L;
    private boolean M;
    private float N;
    private ArrayDeque<n> O;
    private b P;
    private n Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f4958g0;

    /* renamed from: h0  reason: collision with root package name */
    private boolean f4959h0;

    /* renamed from: i0  reason: collision with root package name */
    private i f4960i0;

    /* renamed from: j0  reason: collision with root package name */
    private long f4961j0;

    /* renamed from: k0  reason: collision with root package name */
    private int f4962k0;

    /* renamed from: l0  reason: collision with root package name */
    private int f4963l0;

    /* renamed from: m  reason: collision with root package name */
    private final l.b f4964m;

    /* renamed from: m0  reason: collision with root package name */
    private ByteBuffer f4965m0;

    /* renamed from: n  reason: collision with root package name */
    private final q f4966n;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f4967n0;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f4968o;

    /* renamed from: o0  reason: collision with root package name */
    private boolean f4969o0;

    /* renamed from: p  reason: collision with root package name */
    private final float f4970p;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f4971p0;

    /* renamed from: q  reason: collision with root package name */
    private final m8.g f4972q;

    /* renamed from: q0  reason: collision with root package name */
    private boolean f4973q0;

    /* renamed from: r  reason: collision with root package name */
    private final m8.g f4974r;

    /* renamed from: r0  reason: collision with root package name */
    private boolean f4975r0;

    /* renamed from: s  reason: collision with root package name */
    private final m8.g f4976s;

    /* renamed from: s0  reason: collision with root package name */
    private boolean f4977s0;

    /* renamed from: t  reason: collision with root package name */
    private final h f4978t;

    /* renamed from: t0  reason: collision with root package name */
    private int f4979t0;

    /* renamed from: u  reason: collision with root package name */
    private final i0<p1> f4980u;

    /* renamed from: u0  reason: collision with root package name */
    private int f4981u0;

    /* renamed from: v  reason: collision with root package name */
    private final ArrayList<Long> f4982v;

    /* renamed from: v0  reason: collision with root package name */
    private int f4983v0;

    /* renamed from: w  reason: collision with root package name */
    private final MediaCodec.BufferInfo f4984w;

    /* renamed from: w0  reason: collision with root package name */
    private boolean f4985w0;

    /* renamed from: x  reason: collision with root package name */
    private final long[] f4986x;

    /* renamed from: x0  reason: collision with root package name */
    private boolean f4987x0;

    /* renamed from: y  reason: collision with root package name */
    private final long[] f4988y;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f4989y0;

    /* renamed from: z  reason: collision with root package name */
    private final long[] f4990z;

    /* renamed from: z0  reason: collision with root package name */
    private long f4991z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(l.a aVar, o1 o1Var) {
            LogSessionId a10 = o1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f4945b.setString("log-session-id", a10.getStringId());
        }
    }

    public o(int i10, l.b bVar, q qVar, boolean z10, float f10) {
        super(i10);
        this.f4964m = bVar;
        this.f4966n = (q) ea.a.e(qVar);
        this.f4968o = z10;
        this.f4970p = f10;
        this.f4972q = m8.g.s();
        this.f4974r = new m8.g(0);
        this.f4976s = new m8.g(2);
        h hVar = new h();
        this.f4978t = hVar;
        this.f4980u = new i0<>();
        this.f4982v = new ArrayList<>();
        this.f4984w = new MediaCodec.BufferInfo();
        this.H = 1.0f;
        this.I = 1.0f;
        this.G = -9223372036854775807L;
        this.f4986x = new long[10];
        this.f4988y = new long[10];
        this.f4990z = new long[10];
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        hVar.p(0);
        hVar.f34290c.order(ByteOrder.nativeOrder());
        this.N = -1.0f;
        this.R = 0;
        this.f4979t0 = 0;
        this.f4962k0 = -1;
        this.f4963l0 = -1;
        this.f4961j0 = -9223372036854775807L;
        this.f4991z0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.f4981u0 = 0;
        this.f4983v0 = 0;
    }

    private boolean A0(long j10) {
        int size = this.f4982v.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f4982v.get(i10).longValue() == j10) {
                this.f4982v.remove(i10);
                return true;
            }
        }
        return false;
    }

    private static boolean B0(IllegalStateException illegalStateException) {
        if (n0.f29709a < 21 || !C0(illegalStateException)) {
            StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
            return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
        }
        return true;
    }

    private static boolean C0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean D0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void F0(android.media.MediaCrypto r9, boolean r10) throws b9.o.b {
        /*
            r8 = this;
            java.util.ArrayDeque<b9.n> r0 = r8.O
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r8.l0(r10)     // Catch: b9.v.c -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: b9.v.c -> L2d
            r2.<init>()     // Catch: b9.v.c -> L2d
            r8.O = r2     // Catch: b9.v.c -> L2d
            boolean r3 = r8.f4968o     // Catch: b9.v.c -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: b9.v.c -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: b9.v.c -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<b9.n> r2 = r8.O     // Catch: b9.v.c -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: b9.v.c -> L2d
            b9.n r0 = (b9.n) r0     // Catch: b9.v.c -> L2d
            r2.add(r0)     // Catch: b9.v.c -> L2d
        L2a:
            r8.P = r1     // Catch: b9.v.c -> L2d
            goto L39
        L2d:
            r9 = move-exception
            b9.o$b r0 = new b9.o$b
            j8.p1 r1 = r8.A
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r9, r10, r2)
            throw r0
        L39:
            java.util.ArrayDeque<b9.n> r0 = r8.O
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbe
            java.util.ArrayDeque<b9.n> r0 = r8.O
            java.lang.Object r0 = r0.peekFirst()
            b9.n r0 = (b9.n) r0
        L49:
            b9.l r2 = r8.J
            if (r2 != 0) goto Lbb
            java.util.ArrayDeque<b9.n> r2 = r8.O
            java.lang.Object r2 = r2.peekFirst()
            b9.n r2 = (b9.n) r2
            boolean r3 = r8.e1(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r8.z0(r2, r9)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            ea.r.h(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r8.z0(r2, r9)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r6 = r5.length()
            int r6 = r6 + 30
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Failed to initialize decoder: "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            ea.r.i(r4, r5, r3)
            java.util.ArrayDeque<b9.n> r4 = r8.O
            r4.removeFirst()
            b9.o$b r4 = new b9.o$b
            j8.p1 r5 = r8.A
            r4.<init>(r5, r3, r10, r2)
            r8.G0(r4)
            b9.o$b r2 = r8.P
            if (r2 != 0) goto La9
            r8.P = r4
            goto Laf
        La9:
            b9.o$b r2 = b9.o.b.a(r2, r4)
            r8.P = r2
        Laf:
            java.util.ArrayDeque<b9.n> r2 = r8.O
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lb8
            goto L49
        Lb8:
            b9.o$b r9 = r8.P
            throw r9
        Lbb:
            r8.O = r1
            return
        Lbe:
            b9.o$b r9 = new b9.o$b
            j8.p1 r0 = r8.A
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r9.<init>(r0, r1, r10, r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.o.F0(android.media.MediaCrypto, boolean):void");
    }

    private void O() throws j8.n {
        ea.a.f(!this.B0);
        q1 z10 = z();
        this.f4976s.g();
        do {
            this.f4976s.g();
            int L = L(z10, this.f4976s, 0);
            if (L == -5) {
                J0(z10);
                return;
            } else if (L != -4) {
                if (L != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f4976s.l()) {
                this.B0 = true;
                return;
            } else {
                if (this.D0) {
                    p1 p1Var = (p1) ea.a.e(this.A);
                    this.B = p1Var;
                    K0(p1Var, null);
                    this.D0 = false;
                }
                this.f4976s.q();
            }
        } while (this.f4978t.u(this.f4976s));
        this.f4973q0 = true;
    }

    @TargetApi(23)
    private void O0() throws j8.n {
        int i10 = this.f4983v0;
        if (i10 == 1) {
            i0();
        } else if (i10 == 2) {
            i0();
            k1();
        } else if (i10 != 3) {
            this.C0 = true;
            U0();
        } else {
            S0();
        }
    }

    private boolean P(long j10, long j11) throws j8.n {
        ea.a.f(!this.C0);
        if (this.f4978t.z()) {
            h hVar = this.f4978t;
            if (!P0(j10, j11, null, hVar.f34290c, this.f4963l0, 0, hVar.y(), this.f4978t.w(), this.f4978t.k(), this.f4978t.l(), this.B)) {
                return false;
            }
            L0(this.f4978t.x());
            this.f4978t.g();
        }
        if (this.B0) {
            this.C0 = true;
            return false;
        }
        if (this.f4973q0) {
            ea.a.f(this.f4978t.u(this.f4976s));
            this.f4973q0 = false;
        }
        if (this.f4975r0) {
            if (this.f4978t.z()) {
                return true;
            }
            b0();
            this.f4975r0 = false;
            E0();
            if (!this.f4971p0) {
                return false;
            }
        }
        O();
        if (this.f4978t.z()) {
            this.f4978t.q();
        }
        return this.f4978t.z() || this.B0 || this.f4975r0;
    }

    private void Q0() {
        this.f4989y0 = true;
        MediaFormat outputFormat = this.J.getOutputFormat();
        if (this.R != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f4958g0 = true;
            return;
        }
        if (this.Y) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.L = outputFormat;
        this.M = true;
    }

    private int R(String str) {
        int i10 = n0.f29709a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = n0.f29712d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 < 24) {
            if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
                String str3 = n0.f29710b;
                return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
            }
            return 0;
        }
        return 0;
    }

    private boolean R0(int i10) throws j8.n {
        q1 z10 = z();
        this.f4972q.g();
        int L = L(z10, this.f4972q, i10 | 4);
        if (L == -5) {
            J0(z10);
            return true;
        } else if (L == -4 && this.f4972q.l()) {
            this.B0 = true;
            O0();
            return false;
        } else {
            return false;
        }
    }

    private static boolean S(String str, p1 p1Var) {
        return n0.f29709a < 21 && p1Var.f32711n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private void S0() throws j8.n {
        T0();
        E0();
    }

    private static boolean T(String str) {
        if (n0.f29709a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(n0.f29711c)) {
            String str2 = n0.f29710b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean U(String str) {
        int i10 = n0.f29709a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = n0.f29710b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean V(String str) {
        return n0.f29709a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean W(n nVar) {
        String str = nVar.f4950a;
        int i10 = n0.f29709a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(n0.f29711c) && "AFTS".equals(n0.f29712d) && nVar.f4955f));
    }

    private static boolean X(String str) {
        int i10 = n0.f29709a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && n0.f29712d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private void X0() {
        this.f4962k0 = -1;
        this.f4974r.f34290c = null;
    }

    private static boolean Y(String str, p1 p1Var) {
        return n0.f29709a <= 18 && p1Var.f32722y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void Y0() {
        this.f4963l0 = -1;
        this.f4965m0 = null;
    }

    private static boolean Z(String str) {
        return n0.f29709a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void Z0(com.google.android.exoplayer2.drm.j jVar) {
        n8.d.a(this.C, jVar);
        this.C = jVar;
    }

    private void b0() {
        this.f4975r0 = false;
        this.f4978t.g();
        this.f4976s.g();
        this.f4973q0 = false;
        this.f4971p0 = false;
    }

    private boolean c0() {
        if (this.f4985w0) {
            this.f4981u0 = 1;
            if (!this.T && !this.V) {
                this.f4983v0 = 1;
            } else {
                this.f4983v0 = 3;
                return false;
            }
        }
        return true;
    }

    private void c1(com.google.android.exoplayer2.drm.j jVar) {
        n8.d.a(this.D, jVar);
        this.D = jVar;
    }

    private void d0() throws j8.n {
        if (this.f4985w0) {
            this.f4981u0 = 1;
            this.f4983v0 = 3;
            return;
        }
        S0();
    }

    private boolean d1(long j10) {
        return this.G == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.G;
    }

    @TargetApi(23)
    private boolean e0() throws j8.n {
        if (this.f4985w0) {
            this.f4981u0 = 1;
            if (!this.T && !this.V) {
                this.f4983v0 = 2;
            } else {
                this.f4983v0 = 3;
                return false;
            }
        } else {
            k1();
        }
        return true;
    }

    private boolean f0(long j10, long j11) throws j8.n {
        boolean z10;
        boolean P0;
        l lVar;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int h10;
        if (!x0()) {
            if (this.W && this.f4987x0) {
                try {
                    h10 = this.J.h(this.f4984w);
                } catch (IllegalStateException unused) {
                    O0();
                    if (this.C0) {
                        T0();
                    }
                    return false;
                }
            } else {
                h10 = this.J.h(this.f4984w);
            }
            if (h10 < 0) {
                if (h10 == -2) {
                    Q0();
                    return true;
                }
                if (this.f4959h0 && (this.B0 || this.f4981u0 == 2)) {
                    O0();
                }
                return false;
            } else if (this.f4958g0) {
                this.f4958g0 = false;
                this.J.releaseOutputBuffer(h10, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo2 = this.f4984w;
                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                    O0();
                    return false;
                }
                this.f4963l0 = h10;
                ByteBuffer outputBuffer = this.J.getOutputBuffer(h10);
                this.f4965m0 = outputBuffer;
                if (outputBuffer != null) {
                    outputBuffer.position(this.f4984w.offset);
                    ByteBuffer byteBuffer2 = this.f4965m0;
                    MediaCodec.BufferInfo bufferInfo3 = this.f4984w;
                    byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                }
                if (this.X) {
                    MediaCodec.BufferInfo bufferInfo4 = this.f4984w;
                    if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                        long j12 = this.f4991z0;
                        if (j12 != -9223372036854775807L) {
                            bufferInfo4.presentationTimeUs = j12;
                        }
                    }
                }
                this.f4967n0 = A0(this.f4984w.presentationTimeUs);
                long j13 = this.A0;
                long j14 = this.f4984w.presentationTimeUs;
                this.f4969o0 = j13 == j14;
                l1(j14);
            }
        }
        if (this.W && this.f4987x0) {
            try {
                lVar = this.J;
                byteBuffer = this.f4965m0;
                i10 = this.f4963l0;
                bufferInfo = this.f4984w;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                P0 = P0(j10, j11, lVar, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f4967n0, this.f4969o0, this.B);
            } catch (IllegalStateException unused3) {
                O0();
                if (this.C0) {
                    T0();
                }
                return z10;
            }
        } else {
            z10 = false;
            l lVar2 = this.J;
            ByteBuffer byteBuffer3 = this.f4965m0;
            int i11 = this.f4963l0;
            MediaCodec.BufferInfo bufferInfo5 = this.f4984w;
            P0 = P0(j10, j11, lVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f4967n0, this.f4969o0, this.B);
        }
        if (P0) {
            L0(this.f4984w.presentationTimeUs);
            boolean z11 = (this.f4984w.flags & 4) != 0;
            Y0();
            if (!z11) {
                return true;
            }
            O0();
        }
        return z10;
    }

    private boolean g0(n nVar, p1 p1Var, com.google.android.exoplayer2.drm.j jVar, com.google.android.exoplayer2.drm.j jVar2) throws j8.n {
        n8.q s02;
        if (jVar == jVar2) {
            return false;
        }
        if (jVar2 == null || jVar == null || n0.f29709a < 23) {
            return true;
        }
        UUID uuid = j8.h.f32429e;
        if (uuid.equals(jVar.c()) || uuid.equals(jVar2.c()) || (s02 = s0(jVar2)) == null) {
            return true;
        }
        return !nVar.f4955f && (s02.f34715c ? false : jVar2.g(p1Var.f32709l));
    }

    private boolean h0() throws j8.n {
        int i10;
        if (this.J == null || (i10 = this.f4981u0) == 2 || this.B0) {
            return false;
        }
        if (i10 == 0 && f1()) {
            d0();
        }
        if (this.f4962k0 < 0) {
            int g10 = this.J.g();
            this.f4962k0 = g10;
            if (g10 < 0) {
                return false;
            }
            this.f4974r.f34290c = this.J.getInputBuffer(g10);
            this.f4974r.g();
        }
        if (this.f4981u0 == 1) {
            if (!this.f4959h0) {
                this.f4987x0 = true;
                this.J.queueInputBuffer(this.f4962k0, 0, 0, 0L, 4);
                X0();
            }
            this.f4981u0 = 2;
            return false;
        } else if (this.Z) {
            this.Z = false;
            ByteBuffer byteBuffer = this.f4974r.f34290c;
            byte[] bArr = K0;
            byteBuffer.put(bArr);
            this.J.queueInputBuffer(this.f4962k0, 0, bArr.length, 0L, 0);
            X0();
            this.f4985w0 = true;
            return true;
        } else {
            if (this.f4979t0 == 1) {
                for (int i11 = 0; i11 < this.K.f32711n.size(); i11++) {
                    this.f4974r.f34290c.put(this.K.f32711n.get(i11));
                }
                this.f4979t0 = 2;
            }
            int position = this.f4974r.f34290c.position();
            q1 z10 = z();
            try {
                int L = L(z10, this.f4974r, 0);
                if (g()) {
                    this.A0 = this.f4991z0;
                }
                if (L == -3) {
                    return false;
                }
                if (L == -5) {
                    if (this.f4979t0 == 2) {
                        this.f4974r.g();
                        this.f4979t0 = 1;
                    }
                    J0(z10);
                    return true;
                } else if (this.f4974r.l()) {
                    if (this.f4979t0 == 2) {
                        this.f4974r.g();
                        this.f4979t0 = 1;
                    }
                    this.B0 = true;
                    if (!this.f4985w0) {
                        O0();
                        return false;
                    }
                    try {
                        if (!this.f4959h0) {
                            this.f4987x0 = true;
                            this.J.queueInputBuffer(this.f4962k0, 0, 0, 0L, 4);
                            X0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw w(e10, this.A, n0.W(e10.getErrorCode()));
                    }
                } else if (!this.f4985w0 && !this.f4974r.m()) {
                    this.f4974r.g();
                    if (this.f4979t0 == 2) {
                        this.f4979t0 = 1;
                    }
                    return true;
                } else {
                    boolean r10 = this.f4974r.r();
                    if (r10) {
                        this.f4974r.f34289b.b(position);
                    }
                    if (this.S && !r10) {
                        ea.w.b(this.f4974r.f34290c);
                        if (this.f4974r.f34290c.position() == 0) {
                            return true;
                        }
                        this.S = false;
                    }
                    m8.g gVar = this.f4974r;
                    long j10 = gVar.f34292e;
                    i iVar = this.f4960i0;
                    if (iVar != null) {
                        j10 = iVar.d(this.A, gVar);
                        this.f4991z0 = Math.max(this.f4991z0, this.f4960i0.b(this.A));
                    }
                    long j11 = j10;
                    if (this.f4974r.k()) {
                        this.f4982v.add(Long.valueOf(j11));
                    }
                    if (this.D0) {
                        this.f4980u.a(j11, this.A);
                        this.D0 = false;
                    }
                    this.f4991z0 = Math.max(this.f4991z0, j11);
                    this.f4974r.q();
                    if (this.f4974r.j()) {
                        w0(this.f4974r);
                    }
                    N0(this.f4974r);
                    try {
                        if (r10) {
                            this.J.i(this.f4962k0, 0, this.f4974r.f34289b, j11, 0);
                        } else {
                            this.J.queueInputBuffer(this.f4962k0, 0, this.f4974r.f34290c.limit(), j11, 0);
                        }
                        X0();
                        this.f4985w0 = true;
                        this.f4979t0 = 0;
                        this.G0.f34279c++;
                        return true;
                    } catch (MediaCodec.CryptoException e11) {
                        throw w(e11, this.A, n0.W(e11.getErrorCode()));
                    }
                }
            } catch (g.a e12) {
                G0(e12);
                R0(0);
                i0();
                return true;
            }
        }
    }

    private void i0() {
        try {
            this.J.flush();
        } finally {
            V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean i1(p1 p1Var) {
        int i10 = p1Var.E;
        return i10 == 0 || i10 == 2;
    }

    private boolean j1(p1 p1Var) throws j8.n {
        if (n0.f29709a >= 23 && this.J != null && this.f4983v0 != 3 && getState() != 0) {
            float p02 = p0(this.I, p1Var, C());
            float f10 = this.N;
            if (f10 == p02) {
                return true;
            }
            if (p02 == -1.0f) {
                d0();
                return false;
            } else if (f10 == -1.0f && p02 <= this.f4970p) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", p02);
                this.J.e(bundle);
                this.N = p02;
            }
        }
        return true;
    }

    private void k1() throws j8.n {
        try {
            this.E.setMediaDrmSession(s0(this.D).f34714b);
            Z0(this.D);
            this.f4981u0 = 0;
            this.f4983v0 = 0;
        } catch (MediaCryptoException e10) {
            throw w(e10, this.A, 6006);
        }
    }

    private List<n> l0(boolean z10) throws v.c {
        List<n> r02 = r0(this.f4966n, this.A, z10);
        if (r02.isEmpty() && z10) {
            r02 = r0(this.f4966n, this.A, false);
            if (!r02.isEmpty()) {
                String str = this.A.f32709l;
                String valueOf = String.valueOf(r02);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 99 + valueOf.length());
                sb2.append("Drm session requires secure decoder for ");
                sb2.append(str);
                sb2.append(", but no secure decoder available. Trying to proceed with ");
                sb2.append(valueOf);
                sb2.append(".");
                ea.r.h("MediaCodecRenderer", sb2.toString());
            }
        }
        return r02;
    }

    private n8.q s0(com.google.android.exoplayer2.drm.j jVar) throws j8.n {
        m8.b e10 = jVar.e();
        if (e10 != null && !(e10 instanceof n8.q)) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 43);
            sb2.append("Expecting FrameworkCryptoConfig but found: ");
            sb2.append(valueOf);
            throw w(new IllegalArgumentException(sb2.toString()), this.A, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
        }
        return (n8.q) e10;
    }

    private boolean x0() {
        return this.f4963l0 >= 0;
    }

    private void y0(p1 p1Var) {
        b0();
        String str = p1Var.f32709l;
        if (!AudioTrackTranscoder.MIMETYPE_AUDIO_AAC.equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.f4978t.A(1);
        } else {
            this.f4978t.A(32);
        }
        this.f4971p0 = true;
    }

    private void z0(n nVar, MediaCrypto mediaCrypto) throws Exception {
        String str = nVar.f4950a;
        int i10 = n0.f29709a;
        float p02 = i10 < 23 ? -1.0f : p0(this.I, this.A, C());
        float f10 = p02 > this.f4970p ? p02 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        l.a t02 = t0(nVar, this.A, mediaCrypto, f10);
        if (i10 >= 31) {
            a.a(t02, B());
        }
        try {
            String valueOf = String.valueOf(str);
            k0.a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            this.J = this.f4964m.a(t02);
            k0.c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.Q = nVar;
            this.N = f10;
            this.K = this.A;
            this.R = R(str);
            this.S = S(str, this.K);
            this.T = X(str);
            this.U = Z(str);
            this.V = U(str);
            this.W = V(str);
            this.X = T(str);
            this.Y = Y(str, this.K);
            this.f4959h0 = W(nVar) || o0();
            if (this.J.d()) {
                this.f4977s0 = true;
                this.f4979t0 = 1;
                this.Z = this.R != 0;
            }
            if ("c2.android.mp3.decoder".equals(nVar.f4950a)) {
                this.f4960i0 = new i();
            }
            if (getState() == 2) {
                this.f4961j0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.G0.f34277a++;
            H0(str, t02, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            k0.c();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j8.f
    public void E() {
        this.A = null;
        this.H0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.J0 = 0;
        k0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void E0() throws j8.n {
        p1 p1Var;
        if (this.J != null || this.f4971p0 || (p1Var = this.A) == null) {
            return;
        }
        if (this.D == null && g1(p1Var)) {
            y0(this.A);
            return;
        }
        Z0(this.D);
        String str = this.A.f32709l;
        com.google.android.exoplayer2.drm.j jVar = this.C;
        if (jVar != null) {
            if (this.E == null) {
                n8.q s02 = s0(jVar);
                if (s02 == null) {
                    if (this.C.getError() == null) {
                        return;
                    }
                } else {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(s02.f34713a, s02.f34714b);
                        this.E = mediaCrypto;
                        this.F = !s02.f34715c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw w(e10, this.A, 6006);
                    }
                }
            }
            if (n8.q.f34712d) {
                int state = this.C.getState();
                if (state == 1) {
                    j.a aVar = (j.a) ea.a.e(this.C.getError());
                    throw w(aVar, this.A, aVar.f21111a);
                } else if (state != 4) {
                    return;
                }
            }
        }
        try {
            F0(this.E, this.F);
        } catch (b e11) {
            throw w(e11, this.A, 4001);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j8.f
    public void F(boolean z10, boolean z11) throws j8.n {
        this.G0 = new m8.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j8.f
    public void G(long j10, boolean z10) throws j8.n {
        this.B0 = false;
        this.C0 = false;
        this.E0 = false;
        if (this.f4971p0) {
            this.f4978t.g();
            this.f4976s.g();
            this.f4973q0 = false;
        } else {
            j0();
        }
        if (this.f4980u.l() > 0) {
            this.D0 = true;
        }
        this.f4980u.c();
        int i10 = this.J0;
        if (i10 != 0) {
            this.I0 = this.f4988y[i10 - 1];
            this.H0 = this.f4986x[i10 - 1];
            this.J0 = 0;
        }
    }

    protected abstract void G0(Exception exc);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j8.f
    public void H() {
        try {
            b0();
            T0();
        } finally {
            c1(null);
        }
    }

    protected abstract void H0(String str, l.a aVar, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j8.f
    public void I() {
    }

    protected abstract void I0(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j8.f
    public void J() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (e0() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b2, code lost:
        if (e0() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cf, code lost:
        r7 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m8.i J0(j8.q1 r12) throws j8.n {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.o.J0(j8.q1):m8.i");
    }

    @Override // j8.f
    protected void K(p1[] p1VarArr, long j10, long j11) throws j8.n {
        if (this.I0 == -9223372036854775807L) {
            ea.a.f(this.H0 == -9223372036854775807L);
            this.H0 = j10;
            this.I0 = j11;
            return;
        }
        int i10 = this.J0;
        long[] jArr = this.f4988y;
        if (i10 == jArr.length) {
            long j12 = jArr[i10 - 1];
            StringBuilder sb2 = new StringBuilder(65);
            sb2.append("Too many stream changes, so dropping offset: ");
            sb2.append(j12);
            ea.r.h("MediaCodecRenderer", sb2.toString());
        } else {
            this.J0 = i10 + 1;
        }
        long[] jArr2 = this.f4986x;
        int i11 = this.J0;
        jArr2[i11 - 1] = j10;
        this.f4988y[i11 - 1] = j11;
        this.f4990z[i11 - 1] = this.f4991z0;
    }

    protected abstract void K0(p1 p1Var, MediaFormat mediaFormat) throws j8.n;

    /* JADX INFO: Access modifiers changed from: protected */
    public void L0(long j10) {
        while (true) {
            int i10 = this.J0;
            if (i10 == 0 || j10 < this.f4990z[0]) {
                return;
            }
            long[] jArr = this.f4986x;
            this.H0 = jArr[0];
            this.I0 = this.f4988y[0];
            int i11 = i10 - 1;
            this.J0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f4988y;
            System.arraycopy(jArr2, 1, jArr2, 0, this.J0);
            long[] jArr3 = this.f4990z;
            System.arraycopy(jArr3, 1, jArr3, 0, this.J0);
            M0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M0() {
    }

    protected abstract void N0(m8.g gVar) throws j8.n;

    protected abstract boolean P0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, p1 p1Var) throws j8.n;

    protected abstract m8.i Q(n nVar, p1 p1Var, p1 p1Var2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.exoplayer2.drm.j, android.media.MediaCrypto] */
    public void T0() {
        try {
            l lVar = this.J;
            if (lVar != null) {
                lVar.release();
                this.G0.f34278b++;
                I0(this.Q.f4950a);
            }
            this.J = null;
            try {
                MediaCrypto mediaCrypto = this.E;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.J = null;
            try {
                MediaCrypto mediaCrypto2 = this.E;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected void U0() throws j8.n {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void V0() {
        X0();
        Y0();
        this.f4961j0 = -9223372036854775807L;
        this.f4987x0 = false;
        this.f4985w0 = false;
        this.Z = false;
        this.f4958g0 = false;
        this.f4967n0 = false;
        this.f4969o0 = false;
        this.f4982v.clear();
        this.f4991z0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        i iVar = this.f4960i0;
        if (iVar != null) {
            iVar.c();
        }
        this.f4981u0 = 0;
        this.f4983v0 = 0;
        this.f4979t0 = this.f4977s0 ? 1 : 0;
    }

    protected void W0() {
        V0();
        this.F0 = null;
        this.f4960i0 = null;
        this.O = null;
        this.Q = null;
        this.K = null;
        this.L = null;
        this.M = false;
        this.f4989y0 = false;
        this.N = -1.0f;
        this.R = 0;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.f4959h0 = false;
        this.f4977s0 = false;
        this.f4979t0 = 0;
        this.F = false;
    }

    @Override // j8.y2
    public final int a(p1 p1Var) throws j8.n {
        try {
            return h1(this.f4966n, p1Var);
        } catch (v.c e10) {
            throw w(e10, p1Var, 4002);
        }
    }

    protected m a0(Throwable th, n nVar) {
        return new m(th, nVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a1() {
        this.E0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b1(j8.n nVar) {
        this.F0 = nVar;
    }

    @Override // j8.w2
    public boolean d() {
        return this.C0;
    }

    protected boolean e1(n nVar) {
        return true;
    }

    protected boolean f1() {
        return false;
    }

    protected boolean g1(p1 p1Var) {
        return false;
    }

    protected abstract int h1(q qVar, p1 p1Var) throws v.c;

    @Override // j8.w2
    public boolean isReady() {
        return this.A != null && (D() || x0() || (this.f4961j0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f4961j0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean j0() throws j8.n {
        boolean k02 = k0();
        if (k02) {
            E0();
        }
        return k02;
    }

    protected boolean k0() {
        if (this.J == null) {
            return false;
        }
        if (this.f4983v0 != 3 && !this.T && ((!this.U || this.f4989y0) && (!this.V || !this.f4987x0))) {
            i0();
            return false;
        }
        T0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l1(long j10) throws j8.n {
        boolean z10;
        p1 j11 = this.f4980u.j(j10);
        if (j11 == null && this.M) {
            j11 = this.f4980u.i();
        }
        if (j11 != null) {
            this.B = j11;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.M && this.B != null)) {
            K0(this.B, this.L);
            this.M = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final l m0() {
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final n n0() {
        return this.Q;
    }

    protected boolean o0() {
        return false;
    }

    @Override // j8.f, j8.w2
    public void p(float f10, float f11) throws j8.n {
        this.H = f10;
        this.I = f11;
        j1(this.K);
    }

    protected abstract float p0(float f10, p1 p1Var, p1[] p1VarArr);

    @Override // j8.f, j8.y2
    public final int q() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaFormat q0() {
        return this.L;
    }

    @Override // j8.w2
    public void r(long j10, long j11) throws j8.n {
        boolean z10 = false;
        if (this.E0) {
            this.E0 = false;
            O0();
        }
        j8.n nVar = this.F0;
        if (nVar == null) {
            try {
                if (this.C0) {
                    U0();
                    return;
                } else if (this.A != null || R0(2)) {
                    E0();
                    if (this.f4971p0) {
                        k0.a("bypassRender");
                        while (P(j10, j11)) {
                        }
                        k0.c();
                    } else if (this.J != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        k0.a("drainAndFeed");
                        while (f0(j10, j11) && d1(elapsedRealtime)) {
                        }
                        while (h0() && d1(elapsedRealtime)) {
                        }
                        k0.c();
                    } else {
                        this.G0.f34280d += N(j10);
                        R0(1);
                    }
                    this.G0.c();
                    return;
                } else {
                    return;
                }
            } catch (IllegalStateException e10) {
                if (B0(e10)) {
                    G0(e10);
                    if (n0.f29709a >= 21 && D0(e10)) {
                        z10 = true;
                    }
                    if (z10) {
                        T0();
                    }
                    throw x(a0(e10, n0()), this.A, z10, 4003);
                }
                throw e10;
            }
        }
        this.F0 = null;
        throw nVar;
    }

    protected abstract List<n> r0(q qVar, p1 p1Var, boolean z10) throws v.c;

    protected abstract l.a t0(n nVar, p1 p1Var, MediaCrypto mediaCrypto, float f10);

    /* JADX INFO: Access modifiers changed from: protected */
    public final long u0() {
        return this.I0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float v0() {
        return this.H;
    }

    protected void w0(m8.g gVar) throws j8.n {
    }

    /* compiled from: MediaCodecRenderer.java */
    /* loaded from: classes2.dex */
    public static class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f4992a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4993b;

        /* renamed from: c  reason: collision with root package name */
        public final n f4994c;

        /* renamed from: d  reason: collision with root package name */
        public final String f4995d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(j8.p1 r12, java.lang.Throwable r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.f32709l
                java.lang.String r9 = b(r15)
                r8 = 0
                r10 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b9.o.b.<init>(j8.p1, java.lang.Throwable, boolean, int):void");
        }

        private static String b(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            int abs = Math.abs(i10);
            StringBuilder sb2 = new StringBuilder(str.length() + 71);
            sb2.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb2.append(str);
            sb2.append(abs);
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b c(b bVar) {
            return new b(getMessage(), getCause(), this.f4992a, this.f4993b, this.f4994c, this.f4995d, bVar);
        }

        private static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(j8.p1 r9, java.lang.Throwable r10, boolean r11, b9.n r12) {
            /*
                r8 = this;
                java.lang.String r0 = r12.f4950a
                java.lang.String r1 = java.lang.String.valueOf(r9)
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                int r2 = r2 + 23
                int r3 = r1.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Decoder init failed: "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ", "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.String r3 = r9.f32709l
                int r0 = ea.n0.f29709a
                r2 = 21
                if (r0 < r2) goto L3b
                java.lang.String r0 = d(r10)
                goto L3c
            L3b:
                r0 = 0
            L3c:
                r6 = r0
                r7 = 0
                r0 = r8
                r2 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b9.o.b.<init>(j8.p1, java.lang.Throwable, boolean, b9.n):void");
        }

        private b(String str, Throwable th, String str2, boolean z10, n nVar, String str3, b bVar) {
            super(str, th);
            this.f4992a = str2;
            this.f4993b = z10;
            this.f4994c = nVar;
            this.f4995d = str3;
        }
    }
}
