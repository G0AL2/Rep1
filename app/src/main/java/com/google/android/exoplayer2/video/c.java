package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import b9.l;
import b9.m;
import b9.o;
import b9.q;
import b9.v;
import com.google.android.exoplayer2.video.d;
import com.google.android.gms.common.Scopes;
import ea.k0;
import ea.n0;
import ea.r;
import ea.u;
import fa.h;
import fa.j;
import fa.v;
import j8.n;
import j8.p1;
import j8.q1;
import j8.x2;
import java.nio.ByteBuffer;
import java.util.List;
import jb.s;
import m8.e;
import m8.g;
import m8.i;

/* compiled from: MediaCodecVideoRenderer.java */
/* loaded from: classes2.dex */
public class c extends o {

    /* renamed from: u1  reason: collision with root package name */
    private static final int[] f21815u1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: v1  reason: collision with root package name */
    private static boolean f21816v1;

    /* renamed from: w1  reason: collision with root package name */
    private static boolean f21817w1;
    private final Context L0;
    private final j M0;
    private final d.a N0;
    private final long O0;
    private final int P0;
    private final boolean Q0;
    private a R0;
    private boolean S0;
    private boolean T0;
    private Surface U0;
    private DummySurface V0;
    private boolean W0;
    private int X0;
    private boolean Y0;
    private boolean Z0;

    /* renamed from: a1  reason: collision with root package name */
    private boolean f21818a1;

    /* renamed from: b1  reason: collision with root package name */
    private long f21819b1;

    /* renamed from: c1  reason: collision with root package name */
    private long f21820c1;

    /* renamed from: d1  reason: collision with root package name */
    private long f21821d1;

    /* renamed from: e1  reason: collision with root package name */
    private int f21822e1;

    /* renamed from: f1  reason: collision with root package name */
    private int f21823f1;

    /* renamed from: g1  reason: collision with root package name */
    private int f21824g1;

    /* renamed from: h1  reason: collision with root package name */
    private long f21825h1;

    /* renamed from: i1  reason: collision with root package name */
    private long f21826i1;

    /* renamed from: j1  reason: collision with root package name */
    private long f21827j1;

    /* renamed from: k1  reason: collision with root package name */
    private int f21828k1;

    /* renamed from: l1  reason: collision with root package name */
    private int f21829l1;

    /* renamed from: m1  reason: collision with root package name */
    private int f21830m1;

    /* renamed from: n1  reason: collision with root package name */
    private int f21831n1;

    /* renamed from: o1  reason: collision with root package name */
    private float f21832o1;

    /* renamed from: p1  reason: collision with root package name */
    private v f21833p1;

    /* renamed from: q1  reason: collision with root package name */
    private boolean f21834q1;

    /* renamed from: r1  reason: collision with root package name */
    private int f21835r1;

    /* renamed from: s1  reason: collision with root package name */
    b f21836s1;

    /* renamed from: t1  reason: collision with root package name */
    private h f21837t1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f21838a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21839b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21840c;

        public a(int i10, int i11, int i12) {
            this.f21838a = i10;
            this.f21839b = i11;
            this.f21840c = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaCodecVideoRenderer.java */
    /* loaded from: classes2.dex */
    public final class b implements l.c, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f21841a;

        public b(l lVar) {
            Handler x10 = n0.x(this);
            this.f21841a = x10;
            lVar.a(this, x10);
        }

        private void b(long j10) {
            c cVar = c.this;
            if (this != cVar.f21836s1) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                cVar.M1();
                return;
            }
            try {
                cVar.L1(j10);
            } catch (n e10) {
                c.this.b1(e10);
            }
        }

        @Override // b9.l.c
        public void a(l lVar, long j10, long j11) {
            if (n0.f29709a < 30) {
                this.f21841a.sendMessageAtFrontOfQueue(Message.obtain(this.f21841a, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            b(j10);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(n0.W0(message.arg1, message.arg2));
            return true;
        }
    }

    public c(Context context, l.b bVar, q qVar, long j10, boolean z10, Handler handler, d dVar, int i10) {
        this(context, bVar, qVar, j10, z10, handler, dVar, i10, 30.0f);
    }

    private static boolean B1(long j10) {
        return j10 < -30000;
    }

    private static boolean C1(long j10) {
        return j10 < -500000;
    }

    private void E1() {
        if (this.f21822e1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.N0.n(this.f21822e1, elapsedRealtime - this.f21821d1);
            this.f21822e1 = 0;
            this.f21821d1 = elapsedRealtime;
        }
    }

    private void G1() {
        int i10 = this.f21828k1;
        if (i10 != 0) {
            this.N0.B(this.f21827j1, i10);
            this.f21827j1 = 0L;
            this.f21828k1 = 0;
        }
    }

    private void H1() {
        int i10 = this.f21829l1;
        if (i10 == -1 && this.f21830m1 == -1) {
            return;
        }
        v vVar = this.f21833p1;
        if (vVar != null && vVar.f30292a == i10 && vVar.f30293b == this.f21830m1 && vVar.f30294c == this.f21831n1 && vVar.f30295d == this.f21832o1) {
            return;
        }
        v vVar2 = new v(this.f21829l1, this.f21830m1, this.f21831n1, this.f21832o1);
        this.f21833p1 = vVar2;
        this.N0.D(vVar2);
    }

    private void I1() {
        if (this.W0) {
            this.N0.A(this.U0);
        }
    }

    private void J1() {
        v vVar = this.f21833p1;
        if (vVar != null) {
            this.N0.D(vVar);
        }
    }

    private void K1(long j10, long j11, p1 p1Var) {
        h hVar = this.f21837t1;
        if (hVar != null) {
            hVar.a(j10, j11, p1Var, q0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M1() {
        a1();
    }

    private void N1() {
        Surface surface = this.U0;
        DummySurface dummySurface = this.V0;
        if (surface == dummySurface) {
            this.U0 = null;
        }
        dummySurface.release();
        this.V0 = null;
    }

    private static void Q1(l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.e(bundle);
    }

    private void R1() {
        this.f21820c1 = this.O0 > 0 ? SystemClock.elapsedRealtime() + this.O0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.video.c, b9.o, j8.f] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void S1(Object obj) throws n {
        DummySurface dummySurface = obj instanceof Surface ? (Surface) obj : null;
        if (dummySurface == null) {
            DummySurface dummySurface2 = this.V0;
            if (dummySurface2 != null) {
                dummySurface = dummySurface2;
            } else {
                b9.n n02 = n0();
                if (n02 != null && X1(n02)) {
                    dummySurface = DummySurface.f(this.L0, n02.f4955f);
                    this.V0 = dummySurface;
                }
            }
        }
        if (this.U0 != dummySurface) {
            this.U0 = dummySurface;
            this.M0.m(dummySurface);
            this.W0 = false;
            int state = getState();
            l m02 = m0();
            if (m02 != null) {
                if (n0.f29709a >= 23 && dummySurface != null && !this.S0) {
                    T1(m02, dummySurface);
                } else {
                    T0();
                    E0();
                }
            }
            if (dummySurface != null && dummySurface != this.V0) {
                J1();
                o1();
                if (state == 2) {
                    R1();
                    return;
                }
                return;
            }
            p1();
            o1();
        } else if (dummySurface == null || dummySurface == this.V0) {
        } else {
            J1();
            I1();
        }
    }

    private boolean X1(b9.n nVar) {
        return n0.f29709a >= 23 && !this.f21834q1 && !q1(nVar.f4950a) && (!nVar.f4955f || DummySurface.e(this.L0));
    }

    private void o1() {
        l m02;
        this.Y0 = false;
        if (n0.f29709a < 23 || !this.f21834q1 || (m02 = m0()) == null) {
            return;
        }
        this.f21836s1 = new b(m02);
    }

    private void p1() {
        this.f21833p1 = null;
    }

    private static void r1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    private static boolean s1() {
        return "NVIDIA".equals(n0.f29711c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x07d0, code lost:
        if (r0.equals("PGN528") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x083e, code lost:
        if (r0.equals("AFTN") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean u1() {
        /*
            Method dump skipped, instructions count: 3064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.c.u1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
        if (r3.equals("video/hevc") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int v1(b9.n r10, j8.p1 r11) {
        /*
            int r0 = r11.f32714q
            int r1 = r11.f32715r
            r2 = -1
            if (r0 == r2) goto Lc8
            if (r1 != r2) goto Lb
            goto Lc8
        Lb:
            java.lang.String r3 = r11.f32709l
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            r6 = 1
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r11 = b9.v.q(r11)
            if (r11 == 0) goto L33
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r11 == r3) goto L31
            if (r11 == r6) goto L31
            if (r11 != r8) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = r7
        L34:
            r3.hashCode()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L73;
                case -1662541442: goto L6c;
                case 1187890754: goto L61;
                case 1331836730: goto L58;
                case 1599127256: goto L4d;
                case 1599127257: goto L42;
                default: goto L40;
            }
        L40:
            r6 = -1
            goto L7d
        L42:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L4b
            goto L40
        L4b:
            r6 = 5
            goto L7d
        L4d:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L56
            goto L40
        L56:
            r6 = 4
            goto L7d
        L58:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L5f
            goto L40
        L5f:
            r6 = 3
            goto L7d
        L61:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L6a
            goto L40
        L6a:
            r6 = 2
            goto L7d
        L6c:
            boolean r11 = r3.equals(r7)
            if (r11 != 0) goto L7d
            goto L40
        L73:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L7c
            goto L40
        L7c:
            r6 = 0
        L7d:
            switch(r6) {
                case 0: goto Lbf;
                case 1: goto Lbc;
                case 2: goto Lbf;
                case 3: goto L81;
                case 4: goto Lbf;
                case 5: goto Lbc;
                default: goto L80;
            }
        L80:
            return r2
        L81:
            java.lang.String r11 = ea.n0.f29712d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = ea.n0.f29711c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Laa
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Laa
            boolean r10 = r10.f4955f
            if (r10 == 0) goto Laa
            goto Lbb
        Laa:
            r10 = 16
            int r11 = ea.n0.l(r0, r10)
            int r0 = ea.n0.l(r1, r10)
            int r11 = r11 * r0
            int r11 = r11 * 16
            int r0 = r11 * 16
            goto Lc1
        Lbb:
            return r2
        Lbc:
            int r0 = r0 * r1
            goto Lc2
        Lbf:
            int r0 = r0 * r1
        Lc1:
            r4 = 2
        Lc2:
            int r0 = r0 * 3
            int r4 = r4 * 2
            int r0 = r0 / r4
            return r0
        Lc8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.c.v1(b9.n, j8.p1):int");
    }

    private static Point w1(b9.n nVar, p1 p1Var) {
        int[] iArr;
        int i10 = p1Var.f32715r;
        int i11 = p1Var.f32714q;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f21815u1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (n0.f29709a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point b10 = nVar.b(i15, i13);
                if (nVar.u(b10.x, b10.y, p1Var.f32716s)) {
                    return b10;
                }
            } else {
                try {
                    int l10 = n0.l(i13, 16) * 16;
                    int l11 = n0.l(i14, 16) * 16;
                    if (l10 * l11 <= b9.v.N()) {
                        int i16 = z10 ? l11 : l10;
                        if (!z10) {
                            l10 = l11;
                        }
                        return new Point(i16, l10);
                    }
                } catch (v.c unused) {
                }
            }
        }
        return null;
    }

    private static List<b9.n> y1(q qVar, p1 p1Var, boolean z10, boolean z11) throws v.c {
        String str = p1Var.f32709l;
        if (str == null) {
            return s.t();
        }
        List<b9.n> a10 = qVar.a(str, z10, z11);
        String m10 = b9.v.m(p1Var);
        if (m10 == null) {
            return s.p(a10);
        }
        return s.n().g(a10).g(qVar.a(m10, z10, z11)).h();
    }

    protected static int z1(b9.n nVar, p1 p1Var) {
        if (p1Var.f32710m != -1) {
            int size = p1Var.f32711n.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                i10 += p1Var.f32711n.get(i11).length;
            }
            return p1Var.f32710m + i10;
        }
        return v1(nVar, p1Var);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    protected MediaFormat A1(p1 p1Var, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> q10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", p1Var.f32714q);
        mediaFormat.setInteger("height", p1Var.f32715r);
        u.e(mediaFormat, p1Var.f32711n);
        u.c(mediaFormat, "frame-rate", p1Var.f32716s);
        u.d(mediaFormat, "rotation-degrees", p1Var.f32717t);
        u.b(mediaFormat, p1Var.f32721x);
        if ("video/dolby-vision".equals(p1Var.f32709l) && (q10 = b9.v.q(p1Var)) != null) {
            u.d(mediaFormat, Scopes.PROFILE, ((Integer) q10.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f21838a);
        mediaFormat.setInteger("max-height", aVar.f21839b);
        u.d(mediaFormat, "max-input-size", aVar.f21840c);
        if (n0.f29709a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            r1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    protected boolean D1(long j10, boolean z10) throws n {
        int N = N(j10);
        if (N == 0) {
            return false;
        }
        if (z10) {
            e eVar = this.G0;
            eVar.f34280d += N;
            eVar.f34282f += this.f21824g1;
        } else {
            this.G0.f34286j++;
            Z1(N, this.f21824g1);
        }
        j0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void E() {
        p1();
        o1();
        this.W0 = false;
        this.f21836s1 = null;
        try {
            super.E();
        } finally {
            this.N0.m(this.G0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void F(boolean z10, boolean z11) throws n {
        super.F(z10, z11);
        boolean z12 = y().f32905a;
        ea.a.f((z12 && this.f21835r1 == 0) ? false : true);
        if (this.f21834q1 != z12) {
            this.f21834q1 = z12;
            T0();
        }
        this.N0.o(this.G0);
        this.Z0 = z11;
        this.f21818a1 = false;
    }

    void F1() {
        this.f21818a1 = true;
        if (this.Y0) {
            return;
        }
        this.Y0 = true;
        this.N0.A(this.U0);
        this.W0 = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void G(long j10, boolean z10) throws n {
        super.G(j10, z10);
        o1();
        this.M0.j();
        this.f21825h1 = -9223372036854775807L;
        this.f21819b1 = -9223372036854775807L;
        this.f21823f1 = 0;
        if (z10) {
            R1();
        } else {
            this.f21820c1 = -9223372036854775807L;
        }
    }

    @Override // b9.o
    protected void G0(Exception exc) {
        r.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.N0.C(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    @TargetApi(17)
    public void H() {
        try {
            super.H();
        } finally {
            if (this.V0 != null) {
                N1();
            }
        }
    }

    @Override // b9.o
    protected void H0(String str, l.a aVar, long j10, long j11) {
        this.N0.k(str, j10, j11);
        this.S0 = q1(str);
        this.T0 = ((b9.n) ea.a.e(n0())).n();
        if (n0.f29709a < 23 || !this.f21834q1) {
            return;
        }
        this.f21836s1 = new b((l) ea.a.e(m0()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void I() {
        super.I();
        this.f21822e1 = 0;
        this.f21821d1 = SystemClock.elapsedRealtime();
        this.f21826i1 = SystemClock.elapsedRealtime() * 1000;
        this.f21827j1 = 0L;
        this.f21828k1 = 0;
        this.M0.k();
    }

    @Override // b9.o
    protected void I0(String str) {
        this.N0.l(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void J() {
        this.f21820c1 = -9223372036854775807L;
        E1();
        G1();
        this.M0.l();
        super.J();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o
    public i J0(q1 q1Var) throws n {
        i J0 = super.J0(q1Var);
        this.N0.p(q1Var.f32770b, J0);
        return J0;
    }

    @Override // b9.o
    protected void K0(p1 p1Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        l m02 = m0();
        if (m02 != null) {
            m02.b(this.X0);
        }
        if (this.f21834q1) {
            this.f21829l1 = p1Var.f32714q;
            this.f21830m1 = p1Var.f32715r;
        } else {
            ea.a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f21829l1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f21830m1 = integer2;
        }
        float f10 = p1Var.f32718u;
        this.f21832o1 = f10;
        if (n0.f29709a >= 21) {
            int i10 = p1Var.f32717t;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f21829l1;
                this.f21829l1 = this.f21830m1;
                this.f21830m1 = i11;
                this.f21832o1 = 1.0f / f10;
            }
        } else {
            this.f21831n1 = p1Var.f32717t;
        }
        this.M0.g(p1Var.f32716s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o
    public void L0(long j10) {
        super.L0(j10);
        if (this.f21834q1) {
            return;
        }
        this.f21824g1--;
    }

    protected void L1(long j10) throws n {
        l1(j10);
        H1();
        this.G0.f34281e++;
        F1();
        L0(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o
    public void M0() {
        super.M0();
        o1();
    }

    @Override // b9.o
    protected void N0(g gVar) throws n {
        boolean z10 = this.f21834q1;
        if (!z10) {
            this.f21824g1++;
        }
        if (n0.f29709a >= 23 || !z10) {
            return;
        }
        L1(gVar.f34292e);
    }

    protected void O1(l lVar, int i10, long j10) {
        H1();
        k0.a("releaseOutputBuffer");
        lVar.releaseOutputBuffer(i10, true);
        k0.c();
        this.f21826i1 = SystemClock.elapsedRealtime() * 1000;
        this.G0.f34281e++;
        this.f21823f1 = 0;
        F1();
    }

    @Override // b9.o
    protected boolean P0(long j10, long j11, l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, p1 p1Var) throws n {
        long j13;
        boolean z12;
        ea.a.e(lVar);
        if (this.f21819b1 == -9223372036854775807L) {
            this.f21819b1 = j10;
        }
        if (j12 != this.f21825h1) {
            this.M0.h(j12);
            this.f21825h1 = j12;
        }
        long u02 = u0();
        long j14 = j12 - u02;
        if (z10 && !z11) {
            Y1(lVar, i10, j14);
            return true;
        }
        double v02 = v0();
        boolean z13 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j12 - j10) / v02);
        if (z13) {
            j15 -= elapsedRealtime - j11;
        }
        if (this.U0 == this.V0) {
            if (B1(j15)) {
                Y1(lVar, i10, j14);
                a2(j15);
                return true;
            }
            return false;
        }
        long j16 = elapsedRealtime - this.f21826i1;
        if (this.f21818a1 ? this.Y0 : !(z13 || this.Z0)) {
            j13 = j16;
            z12 = false;
        } else {
            j13 = j16;
            z12 = true;
        }
        if (this.f21820c1 == -9223372036854775807L && j10 >= u02 && (z12 || (z13 && W1(j15, j13)))) {
            long nanoTime = System.nanoTime();
            K1(j14, nanoTime, p1Var);
            if (n0.f29709a >= 21) {
                P1(lVar, i10, j14, nanoTime);
            } else {
                O1(lVar, i10, j14);
            }
            a2(j15);
            return true;
        }
        if (z13 && j10 != this.f21819b1) {
            long nanoTime2 = System.nanoTime();
            long b10 = this.M0.b((j15 * 1000) + nanoTime2);
            long j17 = (b10 - nanoTime2) / 1000;
            boolean z14 = this.f21820c1 != -9223372036854775807L;
            if (U1(j17, j11, z11) && D1(j10, z14)) {
                return false;
            }
            if (V1(j17, j11, z11)) {
                if (z14) {
                    Y1(lVar, i10, j14);
                } else {
                    t1(lVar, i10, j14);
                }
                a2(j17);
                return true;
            } else if (n0.f29709a >= 21) {
                if (j17 < 50000) {
                    K1(j14, b10, p1Var);
                    P1(lVar, i10, j14, b10);
                    a2(j17);
                    return true;
                }
            } else if (j17 < 30000) {
                if (j17 > 11000) {
                    try {
                        Thread.sleep((j17 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                K1(j14, b10, p1Var);
                O1(lVar, i10, j14);
                a2(j17);
                return true;
            }
        }
        return false;
    }

    protected void P1(l lVar, int i10, long j10, long j11) {
        H1();
        k0.a("releaseOutputBuffer");
        lVar.f(i10, j11);
        k0.c();
        this.f21826i1 = SystemClock.elapsedRealtime() * 1000;
        this.G0.f34281e++;
        this.f21823f1 = 0;
        F1();
    }

    @Override // b9.o
    protected i Q(b9.n nVar, p1 p1Var, p1 p1Var2) {
        i e10 = nVar.e(p1Var, p1Var2);
        int i10 = e10.f34301e;
        int i11 = p1Var2.f32714q;
        a aVar = this.R0;
        if (i11 > aVar.f21838a || p1Var2.f32715r > aVar.f21839b) {
            i10 |= 256;
        }
        if (z1(nVar, p1Var2) > this.R0.f21840c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new i(nVar.f4950a, p1Var, p1Var2, i12 != 0 ? 0 : e10.f34300d, i12);
    }

    protected void T1(l lVar, Surface surface) {
        lVar.c(surface);
    }

    protected boolean U1(long j10, long j11, boolean z10) {
        return C1(j10) && !z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o
    public void V0() {
        super.V0();
        this.f21824g1 = 0;
    }

    protected boolean V1(long j10, long j11, boolean z10) {
        return B1(j10) && !z10;
    }

    protected boolean W1(long j10, long j11) {
        return B1(j10) && j11 > 100000;
    }

    protected void Y1(l lVar, int i10, long j10) {
        k0.a("skipVideoBuffer");
        lVar.releaseOutputBuffer(i10, false);
        k0.c();
        this.G0.f34282f++;
    }

    protected void Z1(int i10, int i11) {
        e eVar = this.G0;
        eVar.f34284h += i10;
        int i12 = i10 + i11;
        eVar.f34283g += i12;
        this.f21822e1 += i12;
        int i13 = this.f21823f1 + i12;
        this.f21823f1 = i13;
        eVar.f34285i = Math.max(i13, eVar.f34285i);
        int i14 = this.P0;
        if (i14 <= 0 || this.f21822e1 < i14) {
            return;
        }
        E1();
    }

    @Override // b9.o
    protected m a0(Throwable th, b9.n nVar) {
        return new fa.e(th, nVar, this.U0);
    }

    protected void a2(long j10) {
        this.G0.a(j10);
        this.f21827j1 += j10;
        this.f21828k1++;
    }

    @Override // b9.o
    protected boolean e1(b9.n nVar) {
        return this.U0 != null || X1(nVar);
    }

    @Override // j8.w2, j8.y2
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // b9.o
    protected int h1(q qVar, p1 p1Var) throws v.c {
        boolean z10;
        int i10 = 0;
        if (!ea.v.t(p1Var.f32709l)) {
            return x2.a(0);
        }
        boolean z11 = p1Var.f32712o != null;
        List<b9.n> y12 = y1(qVar, p1Var, z11, false);
        if (z11 && y12.isEmpty()) {
            y12 = y1(qVar, p1Var, false, false);
        }
        if (y12.isEmpty()) {
            return x2.a(1);
        }
        if (!o.i1(p1Var)) {
            return x2.a(2);
        }
        b9.n nVar = y12.get(0);
        boolean m10 = nVar.m(p1Var);
        if (!m10) {
            for (int i11 = 1; i11 < y12.size(); i11++) {
                b9.n nVar2 = y12.get(i11);
                if (nVar2.m(p1Var)) {
                    nVar = nVar2;
                    z10 = false;
                    m10 = true;
                    break;
                }
            }
        }
        z10 = true;
        int i12 = m10 ? 4 : 3;
        int i13 = nVar.p(p1Var) ? 16 : 8;
        int i14 = nVar.f4956g ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (m10) {
            List<b9.n> y13 = y1(qVar, p1Var, z11, true);
            if (!y13.isEmpty()) {
                b9.n nVar3 = b9.v.u(y13, p1Var).get(0);
                if (nVar3.m(p1Var) && nVar3.p(p1Var)) {
                    i10 = 32;
                }
            }
        }
        return x2.c(i12, i13, i10, i14, i15);
    }

    @Override // b9.o, j8.w2
    public boolean isReady() {
        DummySurface dummySurface;
        if (super.isReady() && (this.Y0 || (((dummySurface = this.V0) != null && this.U0 == dummySurface) || m0() == null || this.f21834q1))) {
            this.f21820c1 = -9223372036854775807L;
            return true;
        } else if (this.f21820c1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f21820c1) {
                return true;
            }
            this.f21820c1 = -9223372036854775807L;
            return false;
        }
    }

    @Override // j8.f, j8.r2.b
    public void k(int i10, Object obj) throws n {
        if (i10 == 1) {
            S1(obj);
        } else if (i10 == 7) {
            this.f21837t1 = (h) obj;
        } else if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f21835r1 != intValue) {
                this.f21835r1 = intValue;
                if (this.f21834q1) {
                    T0();
                }
            }
        } else if (i10 != 4) {
            if (i10 != 5) {
                super.k(i10, obj);
            } else {
                this.M0.o(((Integer) obj).intValue());
            }
        } else {
            this.X0 = ((Integer) obj).intValue();
            l m02 = m0();
            if (m02 != null) {
                m02.b(this.X0);
            }
        }
    }

    @Override // b9.o
    protected boolean o0() {
        return this.f21834q1 && n0.f29709a < 23;
    }

    @Override // b9.o, j8.f, j8.w2
    public void p(float f10, float f11) throws n {
        super.p(f10, f11);
        this.M0.i(f10);
    }

    @Override // b9.o
    protected float p0(float f10, p1 p1Var, p1[] p1VarArr) {
        float f11 = -1.0f;
        for (p1 p1Var2 : p1VarArr) {
            float f12 = p1Var2.f32716s;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    protected boolean q1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (c.class) {
            if (!f21816v1) {
                f21817w1 = u1();
                f21816v1 = true;
            }
        }
        return f21817w1;
    }

    @Override // b9.o
    protected List<b9.n> r0(q qVar, p1 p1Var, boolean z10) throws v.c {
        return b9.v.u(y1(qVar, p1Var, z10, this.f21834q1), p1Var);
    }

    @Override // b9.o
    @TargetApi(17)
    protected l.a t0(b9.n nVar, p1 p1Var, MediaCrypto mediaCrypto, float f10) {
        DummySurface dummySurface = this.V0;
        if (dummySurface != null && dummySurface.f21797a != nVar.f4955f) {
            N1();
        }
        String str = nVar.f4952c;
        a x12 = x1(nVar, p1Var, C());
        this.R0 = x12;
        MediaFormat A1 = A1(p1Var, str, x12, f10, this.Q0, this.f21834q1 ? this.f21835r1 : 0);
        if (this.U0 == null) {
            if (X1(nVar)) {
                if (this.V0 == null) {
                    this.V0 = DummySurface.f(this.L0, nVar.f4955f);
                }
                this.U0 = this.V0;
            } else {
                throw new IllegalStateException();
            }
        }
        return l.a.b(nVar, A1, p1Var, this.U0, mediaCrypto);
    }

    protected void t1(l lVar, int i10, long j10) {
        k0.a("dropVideoBuffer");
        lVar.releaseOutputBuffer(i10, false);
        k0.c();
        Z1(0, 1);
    }

    @Override // b9.o
    @TargetApi(29)
    protected void w0(g gVar) throws n {
        if (this.T0) {
            ByteBuffer byteBuffer = (ByteBuffer) ea.a.e(gVar.f34293f);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    Q1(m0(), bArr);
                }
            }
        }
    }

    protected a x1(b9.n nVar, p1 p1Var, p1[] p1VarArr) {
        int v12;
        int i10 = p1Var.f32714q;
        int i11 = p1Var.f32715r;
        int z12 = z1(nVar, p1Var);
        if (p1VarArr.length == 1) {
            if (z12 != -1 && (v12 = v1(nVar, p1Var)) != -1) {
                z12 = Math.min((int) (z12 * 1.5f), v12);
            }
            return new a(i10, i11, z12);
        }
        int length = p1VarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            p1 p1Var2 = p1VarArr[i12];
            if (p1Var.f32721x != null && p1Var2.f32721x == null) {
                p1Var2 = p1Var2.b().J(p1Var.f32721x).E();
            }
            if (nVar.e(p1Var, p1Var2).f34300d != 0) {
                int i13 = p1Var2.f32714q;
                z10 |= i13 == -1 || p1Var2.f32715r == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, p1Var2.f32715r);
                z12 = Math.max(z12, z1(nVar, p1Var2));
            }
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Resolutions unknown. Codec max resolution: ");
            sb2.append(i10);
            sb2.append("x");
            sb2.append(i11);
            r.h("MediaCodecVideoRenderer", sb2.toString());
            Point w12 = w1(nVar, p1Var);
            if (w12 != null) {
                i10 = Math.max(i10, w12.x);
                i11 = Math.max(i11, w12.y);
                z12 = Math.max(z12, v1(nVar, p1Var.b().j0(i10).Q(i11).E()));
                StringBuilder sb3 = new StringBuilder(57);
                sb3.append("Codec max resolution adjusted to: ");
                sb3.append(i10);
                sb3.append("x");
                sb3.append(i11);
                r.h("MediaCodecVideoRenderer", sb3.toString());
            }
        }
        return new a(i10, i11, z12);
    }

    public c(Context context, l.b bVar, q qVar, long j10, boolean z10, Handler handler, d dVar, int i10, float f10) {
        super(2, bVar, qVar, z10, f10);
        this.O0 = j10;
        this.P0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.L0 = applicationContext;
        this.M0 = new j(applicationContext);
        this.N0 = new d.a(handler, dVar);
        this.Q0 = s1();
        this.f21820c1 = -9223372036854775807L;
        this.f21829l1 = -1;
        this.f21830m1 = -1;
        this.f21832o1 = -1.0f;
        this.X0 = 1;
        this.f21835r1 = 0;
        p1();
    }
}
