package l8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import b9.l;
import b9.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ea.n0;
import j8.o2;
import j8.p1;
import j8.q1;
import j8.w2;
import j8.x2;
import java.nio.ByteBuffer;
import java.util.List;
import l8.r;
import l8.s;

/* compiled from: MediaCodecAudioRenderer.java */
/* loaded from: classes2.dex */
public class d0 extends b9.o implements ea.t {
    private final Context L0;
    private final r.a M0;
    private final s N0;
    private int O0;
    private boolean P0;
    private p1 Q0;
    private long R0;
    private boolean S0;
    private boolean T0;
    private boolean U0;
    private boolean V0;
    private w2.a W0;

    /* compiled from: MediaCodecAudioRenderer.java */
    /* loaded from: classes2.dex */
    private final class b implements s.c {
        private b() {
        }

        @Override // l8.s.c
        public void a(boolean z10) {
            d0.this.M0.C(z10);
        }

        @Override // l8.s.c
        public void b(Exception exc) {
            ea.r.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            d0.this.M0.l(exc);
        }

        @Override // l8.s.c
        public void c(long j10) {
            d0.this.M0.B(j10);
        }

        @Override // l8.s.c
        public void d(long j10) {
            if (d0.this.W0 != null) {
                d0.this.W0.b(j10);
            }
        }

        @Override // l8.s.c
        public void e(int i10, long j10, long j11) {
            d0.this.M0.D(i10, j10, j11);
        }

        @Override // l8.s.c
        public void f() {
            d0.this.u1();
        }

        @Override // l8.s.c
        public void g() {
            if (d0.this.W0 != null) {
                d0.this.W0.a();
            }
        }
    }

    public d0(Context context, l.b bVar, b9.q qVar, boolean z10, Handler handler, r rVar, s sVar) {
        super(1, bVar, qVar, z10, 44100.0f);
        this.L0 = context.getApplicationContext();
        this.N0 = sVar;
        this.M0 = new r.a(handler, rVar);
        sVar.k(new b());
    }

    private static boolean o1(String str) {
        if (n0.f29709a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(n0.f29711c)) {
            String str2 = n0.f29710b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean p1() {
        if (n0.f29709a == 23) {
            String str = n0.f29712d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int q1(b9.n nVar, p1 p1Var) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(nVar.f4950a) || (i10 = n0.f29709a) >= 24 || (i10 == 23 && n0.x0(this.L0))) {
            return p1Var.f32710m;
        }
        return -1;
    }

    private static List<b9.n> s1(b9.q qVar, p1 p1Var, boolean z10, s sVar) throws v.c {
        b9.n v10;
        String str = p1Var.f32709l;
        if (str == null) {
            return jb.s.t();
        }
        if (sVar.a(p1Var) && (v10 = b9.v.v()) != null) {
            return jb.s.u(v10);
        }
        List<b9.n> a10 = qVar.a(str, z10, false);
        String m10 = b9.v.m(p1Var);
        if (m10 == null) {
            return jb.s.p(a10);
        }
        return jb.s.n().g(a10).g(qVar.a(m10, z10, false)).h();
    }

    private void v1() {
        long q10 = this.N0.q(d());
        if (q10 != Long.MIN_VALUE) {
            if (!this.T0) {
                q10 = Math.max(this.R0, q10);
            }
            this.R0 = q10;
            this.T0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void E() {
        this.U0 = true;
        try {
            this.N0.flush();
            try {
                super.E();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.E();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void F(boolean z10, boolean z11) throws j8.n {
        super.F(z10, z11);
        this.M0.p(this.G0);
        if (y().f32905a) {
            this.N0.s();
        } else {
            this.N0.i();
        }
        this.N0.h(B());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void G(long j10, boolean z10) throws j8.n {
        super.G(j10, z10);
        if (this.V0) {
            this.N0.m();
        } else {
            this.N0.flush();
        }
        this.R0 = j10;
        this.S0 = true;
        this.T0 = true;
    }

    @Override // b9.o
    protected void G0(Exception exc) {
        ea.r.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.M0.k(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void H() {
        try {
            super.H();
        } finally {
            if (this.U0) {
                this.U0 = false;
                this.N0.reset();
            }
        }
    }

    @Override // b9.o
    protected void H0(String str, l.a aVar, long j10, long j11) {
        this.M0.m(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void I() {
        super.I();
        this.N0.play();
    }

    @Override // b9.o
    protected void I0(String str) {
        this.M0.n(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o, j8.f
    public void J() {
        v1();
        this.N0.pause();
        super.J();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o
    public m8.i J0(q1 q1Var) throws j8.n {
        m8.i J0 = super.J0(q1Var);
        this.M0.q(q1Var.f32770b, J0);
        return J0;
    }

    @Override // b9.o
    protected void K0(p1 p1Var, MediaFormat mediaFormat) throws j8.n {
        int d02;
        int i10;
        p1 p1Var2 = this.Q0;
        int[] iArr = null;
        if (p1Var2 != null) {
            p1Var = p1Var2;
        } else if (m0() != null) {
            if ("audio/raw".equals(p1Var.f32709l)) {
                d02 = p1Var.A;
            } else if (n0.f29709a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                d02 = mediaFormat.getInteger("pcm-encoding");
            } else {
                d02 = mediaFormat.containsKey("v-bits-per-sample") ? n0.d0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            p1 E = new p1.b().e0("audio/raw").Y(d02).N(p1Var.B).O(p1Var.C).H(mediaFormat.getInteger("channel-count")).f0(mediaFormat.getInteger("sample-rate")).E();
            if (this.P0 && E.f32722y == 6 && (i10 = p1Var.f32722y) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < p1Var.f32722y; i11++) {
                    iArr[i11] = i11;
                }
            }
            p1Var = E;
        }
        try {
            this.N0.p(p1Var, 0, iArr);
        } catch (s.a e10) {
            throw w(e10, e10.f33900a, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b9.o
    public void M0() {
        super.M0();
        this.N0.r();
    }

    @Override // b9.o
    protected void N0(m8.g gVar) {
        if (!this.S0 || gVar.k()) {
            return;
        }
        if (Math.abs(gVar.f34292e - this.R0) > 500000) {
            this.R0 = gVar.f34292e;
        }
        this.S0 = false;
    }

    @Override // b9.o
    protected boolean P0(long j10, long j11, b9.l lVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, p1 p1Var) throws j8.n {
        ea.a.e(byteBuffer);
        if (this.Q0 != null && (i11 & 2) != 0) {
            ((b9.l) ea.a.e(lVar)).releaseOutputBuffer(i10, false);
            return true;
        } else if (z10) {
            if (lVar != null) {
                lVar.releaseOutputBuffer(i10, false);
            }
            this.G0.f34282f += i12;
            this.N0.r();
            return true;
        } else {
            try {
                if (this.N0.l(byteBuffer, j12, i12)) {
                    if (lVar != null) {
                        lVar.releaseOutputBuffer(i10, false);
                    }
                    this.G0.f34281e += i12;
                    return true;
                }
                return false;
            } catch (s.b e10) {
                throw x(e10, e10.f33902b, e10.f33901a, IronSourceConstants.errorCode_biddingDataException);
            } catch (s.e e11) {
                throw x(e11, p1Var, e11.f33903a, IronSourceConstants.errorCode_isReadyException);
            }
        }
    }

    @Override // b9.o
    protected m8.i Q(b9.n nVar, p1 p1Var, p1 p1Var2) {
        m8.i e10 = nVar.e(p1Var, p1Var2);
        int i10 = e10.f34301e;
        if (q1(nVar, p1Var2) > this.O0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new m8.i(nVar.f4950a, p1Var, p1Var2, i11 != 0 ? 0 : e10.f34300d, i11);
    }

    @Override // b9.o
    protected void U0() throws j8.n {
        try {
            this.N0.o();
        } catch (s.e e10) {
            throw x(e10, e10.f33904b, e10.f33903a, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // ea.t
    public void b(o2 o2Var) {
        this.N0.b(o2Var);
    }

    @Override // ea.t
    public o2 c() {
        return this.N0.c();
    }

    @Override // b9.o, j8.w2
    public boolean d() {
        return super.d() && this.N0.d();
    }

    @Override // b9.o
    protected boolean g1(p1 p1Var) {
        return this.N0.a(p1Var);
    }

    @Override // j8.w2, j8.y2
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // b9.o
    protected int h1(b9.q qVar, p1 p1Var) throws v.c {
        boolean z10;
        if (!ea.v.p(p1Var.f32709l)) {
            return x2.a(0);
        }
        int i10 = n0.f29709a >= 21 ? 32 : 0;
        boolean z11 = true;
        boolean z12 = p1Var.E != 0;
        boolean i12 = b9.o.i1(p1Var);
        int i11 = 8;
        if (i12 && this.N0.a(p1Var) && (!z12 || b9.v.v() != null)) {
            return x2.b(4, 8, i10);
        }
        if ("audio/raw".equals(p1Var.f32709l) && !this.N0.a(p1Var)) {
            return x2.a(1);
        }
        if (!this.N0.a(n0.e0(2, p1Var.f32722y, p1Var.f32723z))) {
            return x2.a(1);
        }
        List<b9.n> s12 = s1(qVar, p1Var, false, this.N0);
        if (s12.isEmpty()) {
            return x2.a(1);
        }
        if (!i12) {
            return x2.a(2);
        }
        b9.n nVar = s12.get(0);
        boolean m10 = nVar.m(p1Var);
        if (!m10) {
            for (int i13 = 1; i13 < s12.size(); i13++) {
                b9.n nVar2 = s12.get(i13);
                if (nVar2.m(p1Var)) {
                    nVar = nVar2;
                    z10 = false;
                    break;
                }
            }
        }
        z11 = m10;
        z10 = true;
        int i14 = z11 ? 4 : 3;
        if (z11 && nVar.p(p1Var)) {
            i11 = 16;
        }
        return x2.c(i14, i11, i10, nVar.f4956g ? 64 : 0, z10 ? 128 : 0);
    }

    @Override // b9.o, j8.w2
    public boolean isReady() {
        return this.N0.f() || super.isReady();
    }

    @Override // j8.f, j8.r2.b
    public void k(int i10, Object obj) throws j8.n {
        if (i10 == 2) {
            this.N0.setVolume(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.N0.e((d) obj);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.N0.t(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.N0.g(((Integer) obj).intValue());
                    return;
                case 11:
                    this.W0 = (w2.a) obj;
                    return;
                default:
                    super.k(i10, obj);
                    return;
            }
        } else {
            this.N0.j((v) obj);
        }
    }

    @Override // ea.t
    public long o() {
        if (getState() == 2) {
            v1();
        }
        return this.R0;
    }

    @Override // b9.o
    protected float p0(float f10, p1 p1Var, p1[] p1VarArr) {
        int i10 = -1;
        for (p1 p1Var2 : p1VarArr) {
            int i11 = p1Var2.f32723z;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // b9.o
    protected List<b9.n> r0(b9.q qVar, p1 p1Var, boolean z10) throws v.c {
        return b9.v.u(s1(qVar, p1Var, z10, this.N0), p1Var);
    }

    protected int r1(b9.n nVar, p1 p1Var, p1[] p1VarArr) {
        int q12 = q1(nVar, p1Var);
        if (p1VarArr.length == 1) {
            return q12;
        }
        for (p1 p1Var2 : p1VarArr) {
            if (nVar.e(p1Var, p1Var2).f34300d != 0) {
                q12 = Math.max(q12, q1(nVar, p1Var2));
            }
        }
        return q12;
    }

    @Override // b9.o
    protected l.a t0(b9.n nVar, p1 p1Var, MediaCrypto mediaCrypto, float f10) {
        this.O0 = r1(nVar, p1Var, C());
        this.P0 = o1(nVar.f4950a);
        MediaFormat t12 = t1(p1Var, nVar.f4952c, this.O0, f10);
        this.Q0 = "audio/raw".equals(nVar.f4951b) && !"audio/raw".equals(p1Var.f32709l) ? p1Var : null;
        return l.a.a(nVar, t12, p1Var, mediaCrypto);
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat t1(p1 p1Var, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", p1Var.f32722y);
        mediaFormat.setInteger("sample-rate", p1Var.f32723z);
        ea.u.e(mediaFormat, p1Var.f32711n);
        ea.u.d(mediaFormat, "max-input-size", i10);
        int i11 = n0.f29709a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !p1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(p1Var.f32709l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.N0.n(n0.e0(4, p1Var.f32722y, p1Var.f32723z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    protected void u1() {
        this.T0 = true;
    }

    @Override // j8.f, j8.w2
    public ea.t v() {
        return this;
    }
}
