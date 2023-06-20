package l8;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import ea.n0;
import j8.o2;
import j8.p1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import k8.o1;
import l8.a0;
import l8.f;
import l8.s;
import l8.u;

/* compiled from: DefaultAudioSink.java */
/* loaded from: classes2.dex */
public final class y implements s {

    /* renamed from: c0  reason: collision with root package name */
    public static boolean f33953c0 = false;
    private int A;
    private long B;
    private long C;
    private long D;
    private long E;
    private int F;
    private boolean G;
    private boolean H;
    private long I;
    private float J;
    private l8.f[] K;
    private ByteBuffer[] L;
    private ByteBuffer M;
    private int N;
    private ByteBuffer O;
    private byte[] P;
    private int Q;
    private int R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    private v X;
    private boolean Y;
    private long Z;

    /* renamed from: a  reason: collision with root package name */
    private final l8.e f33954a;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f33955a0;

    /* renamed from: b  reason: collision with root package name */
    private final c f33956b;

    /* renamed from: b0  reason: collision with root package name */
    private boolean f33957b0;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33958c;

    /* renamed from: d  reason: collision with root package name */
    private final x f33959d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f33960e;

    /* renamed from: f  reason: collision with root package name */
    private final l8.f[] f33961f;

    /* renamed from: g  reason: collision with root package name */
    private final l8.f[] f33962g;

    /* renamed from: h  reason: collision with root package name */
    private final ConditionVariable f33963h;

    /* renamed from: i  reason: collision with root package name */
    private final u f33964i;

    /* renamed from: j  reason: collision with root package name */
    private final ArrayDeque<i> f33965j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f33966k;

    /* renamed from: l  reason: collision with root package name */
    private final int f33967l;

    /* renamed from: m  reason: collision with root package name */
    private l f33968m;

    /* renamed from: n  reason: collision with root package name */
    private final j<s.b> f33969n;

    /* renamed from: o  reason: collision with root package name */
    private final j<s.e> f33970o;

    /* renamed from: p  reason: collision with root package name */
    private final d f33971p;

    /* renamed from: q  reason: collision with root package name */
    private o1 f33972q;

    /* renamed from: r  reason: collision with root package name */
    private s.c f33973r;

    /* renamed from: s  reason: collision with root package name */
    private f f33974s;

    /* renamed from: t  reason: collision with root package name */
    private f f33975t;

    /* renamed from: u  reason: collision with root package name */
    private AudioTrack f33976u;

    /* renamed from: v  reason: collision with root package name */
    private l8.d f33977v;

    /* renamed from: w  reason: collision with root package name */
    private i f33978w;

    /* renamed from: x  reason: collision with root package name */
    private i f33979x;

    /* renamed from: y  reason: collision with root package name */
    private o2 f33980y;

    /* renamed from: z  reason: collision with root package name */
    private ByteBuffer f33981z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AudioTrack f33982a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, AudioTrack audioTrack) {
            super(str);
            this.f33982a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f33982a.flush();
                this.f33982a.release();
            } finally {
                y.this.f33963h.open();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public static void a(AudioTrack audioTrack, o1 o1Var) {
            LogSessionId a10 = o1Var.a();
            if (a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(a10);
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public interface c {
        long a(long j10);

        l8.f[] b();

        o2 c(o2 o2Var);

        long d();

        boolean e(boolean z10);
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f33984a = new a0.a().g();

        int a(int i10, int i11, int i12, int i13, int i14, double d10);
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: b  reason: collision with root package name */
        private c f33986b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f33987c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f33988d;

        /* renamed from: a  reason: collision with root package name */
        private l8.e f33985a = l8.e.f33792c;

        /* renamed from: e  reason: collision with root package name */
        private int f33989e = 0;

        /* renamed from: f  reason: collision with root package name */
        d f33990f = d.f33984a;

        public y f() {
            if (this.f33986b == null) {
                this.f33986b = new g(new l8.f[0]);
            }
            return new y(this, null);
        }

        public e g(l8.e eVar) {
            ea.a.e(eVar);
            this.f33985a = eVar;
            return this;
        }

        public e h(boolean z10) {
            this.f33988d = z10;
            return this;
        }

        public e i(boolean z10) {
            this.f33987c = z10;
            return this;
        }

        public e j(int i10) {
            this.f33989e = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final p1 f33991a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33992b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33993c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33994d;

        /* renamed from: e  reason: collision with root package name */
        public final int f33995e;

        /* renamed from: f  reason: collision with root package name */
        public final int f33996f;

        /* renamed from: g  reason: collision with root package name */
        public final int f33997g;

        /* renamed from: h  reason: collision with root package name */
        public final int f33998h;

        /* renamed from: i  reason: collision with root package name */
        public final l8.f[] f33999i;

        public f(p1 p1Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, l8.f[] fVarArr) {
            this.f33991a = p1Var;
            this.f33992b = i10;
            this.f33993c = i11;
            this.f33994d = i12;
            this.f33995e = i13;
            this.f33996f = i14;
            this.f33997g = i15;
            this.f33998h = i16;
            this.f33999i = fVarArr;
        }

        private AudioTrack d(boolean z10, l8.d dVar, int i10) {
            int i11 = n0.f29709a;
            if (i11 >= 29) {
                return f(z10, dVar, i10);
            }
            if (i11 >= 21) {
                return e(z10, dVar, i10);
            }
            return g(dVar, i10);
        }

        private AudioTrack e(boolean z10, l8.d dVar, int i10) {
            return new AudioTrack(i(dVar, z10), y.J(this.f33995e, this.f33996f, this.f33997g), this.f33998h, 1, i10);
        }

        private AudioTrack f(boolean z10, l8.d dVar, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(i(dVar, z10)).setAudioFormat(y.J(this.f33995e, this.f33996f, this.f33997g)).setTransferMode(1).setBufferSizeInBytes(this.f33998h).setSessionId(i10).setOffloadedPlayback(this.f33993c == 1).build();
        }

        private AudioTrack g(l8.d dVar, int i10) {
            int h02 = n0.h0(dVar.f33782c);
            if (i10 == 0) {
                return new AudioTrack(h02, this.f33995e, this.f33996f, this.f33997g, this.f33998h, 1);
            }
            return new AudioTrack(h02, this.f33995e, this.f33996f, this.f33997g, this.f33998h, 1, i10);
        }

        private static AudioAttributes i(l8.d dVar, boolean z10) {
            if (z10) {
                return j();
            }
            return dVar.a();
        }

        private static AudioAttributes j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z10, l8.d dVar, int i10) throws s.b {
            try {
                AudioTrack d10 = d(z10, dVar, i10);
                int state = d10.getState();
                if (state == 1) {
                    return d10;
                }
                try {
                    d10.release();
                } catch (Exception unused) {
                }
                throw new s.b(state, this.f33995e, this.f33996f, this.f33998h, this.f33991a, l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new s.b(0, this.f33995e, this.f33996f, this.f33998h, this.f33991a, l(), e10);
            }
        }

        public boolean b(f fVar) {
            return fVar.f33993c == this.f33993c && fVar.f33997g == this.f33997g && fVar.f33995e == this.f33995e && fVar.f33996f == this.f33996f && fVar.f33994d == this.f33994d;
        }

        public f c(int i10) {
            return new f(this.f33991a, this.f33992b, this.f33993c, this.f33994d, this.f33995e, this.f33996f, this.f33997g, i10, this.f33999i);
        }

        public long h(long j10) {
            return (j10 * 1000000) / this.f33995e;
        }

        public long k(long j10) {
            return (j10 * 1000000) / this.f33991a.f32723z;
        }

        public boolean l() {
            return this.f33993c == 1;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static class g implements c {

        /* renamed from: a  reason: collision with root package name */
        private final l8.f[] f34000a;

        /* renamed from: b  reason: collision with root package name */
        private final h0 f34001b;

        /* renamed from: c  reason: collision with root package name */
        private final j0 f34002c;

        public g(l8.f... fVarArr) {
            this(fVarArr, new h0(), new j0());
        }

        @Override // l8.y.c
        public long a(long j10) {
            return this.f34002c.g(j10);
        }

        @Override // l8.y.c
        public l8.f[] b() {
            return this.f34000a;
        }

        @Override // l8.y.c
        public o2 c(o2 o2Var) {
            this.f34002c.i(o2Var.f32664a);
            this.f34002c.h(o2Var.f32665b);
            return o2Var;
        }

        @Override // l8.y.c
        public long d() {
            return this.f34001b.p();
        }

        @Override // l8.y.c
        public boolean e(boolean z10) {
            this.f34001b.v(z10);
            return z10;
        }

        public g(l8.f[] fVarArr, h0 h0Var, j0 j0Var) {
            l8.f[] fVarArr2 = new l8.f[fVarArr.length + 2];
            this.f34000a = fVarArr2;
            System.arraycopy(fVarArr, 0, fVarArr2, 0, fVarArr.length);
            this.f34001b = h0Var;
            this.f34002c = j0Var;
            fVarArr2[fVarArr.length] = h0Var;
            fVarArr2[fVarArr.length + 1] = j0Var;
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class h extends RuntimeException {
        /* synthetic */ h(String str, a aVar) {
            this(str);
        }

        private h(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public final o2 f34003a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f34004b;

        /* renamed from: c  reason: collision with root package name */
        public final long f34005c;

        /* renamed from: d  reason: collision with root package name */
        public final long f34006d;

        /* synthetic */ i(o2 o2Var, boolean z10, long j10, long j11, a aVar) {
            this(o2Var, z10, j10, j11);
        }

        private i(o2 o2Var, boolean z10, long j10, long j11) {
            this.f34003a = o2Var;
            this.f34004b = z10;
            this.f34005c = j10;
            this.f34006d = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public static final class j<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        private final long f34007a;

        /* renamed from: b  reason: collision with root package name */
        private T f34008b;

        /* renamed from: c  reason: collision with root package name */
        private long f34009c;

        public j(long j10) {
            this.f34007a = j10;
        }

        public void a() {
            this.f34008b = null;
        }

        public void b(T t10) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f34008b == null) {
                this.f34008b = t10;
                this.f34009c = this.f34007a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f34009c) {
                T t11 = this.f34008b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f34008b;
                a();
                throw t12;
            }
        }
    }

    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    private final class k implements u.a {
        private k() {
        }

        @Override // l8.u.a
        public void a(int i10, long j10) {
            if (y.this.f33973r != null) {
                y.this.f33973r.e(i10, j10, SystemClock.elapsedRealtime() - y.this.Z);
            }
        }

        @Override // l8.u.a
        public void b(long j10) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Ignoring impossibly large audio latency: ");
            sb2.append(j10);
            ea.r.h("DefaultAudioSink", sb2.toString());
        }

        @Override // l8.u.a
        public void c(long j10) {
            if (y.this.f33973r != null) {
                y.this.f33973r.c(j10);
            }
        }

        @Override // l8.u.a
        public void d(long j10, long j11, long j12, long j13) {
            long T = y.this.T();
            long U = y.this.U();
            StringBuilder sb2 = new StringBuilder(182);
            sb2.append("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(T);
            sb2.append(", ");
            sb2.append(U);
            String sb3 = sb2.toString();
            if (!y.f33953c0) {
                ea.r.h("DefaultAudioSink", sb3);
                return;
            }
            throw new h(sb3, null);
        }

        @Override // l8.u.a
        public void e(long j10, long j11, long j12, long j13) {
            long T = y.this.T();
            long U = y.this.U();
            StringBuilder sb2 = new StringBuilder(180);
            sb2.append("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(T);
            sb2.append(", ");
            sb2.append(U);
            String sb3 = sb2.toString();
            if (!y.f33953c0) {
                ea.r.h("DefaultAudioSink", sb3);
                return;
            }
            throw new h(sb3, null);
        }

        /* synthetic */ k(y yVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultAudioSink.java */
    /* loaded from: classes2.dex */
    public final class l {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f34011a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        private final AudioTrack.StreamEventCallback f34012b;

        /* compiled from: DefaultAudioSink.java */
        /* loaded from: classes2.dex */
        class a extends AudioTrack.StreamEventCallback {
            a(y yVar) {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                ea.a.f(audioTrack == y.this.f33976u);
                if (y.this.f33973r == null || !y.this.U) {
                    return;
                }
                y.this.f33973r.g();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                ea.a.f(audioTrack == y.this.f33976u);
                if (y.this.f33973r == null || !y.this.U) {
                    return;
                }
                y.this.f33973r.g();
            }
        }

        public l() {
            this.f34012b = new a(y.this);
        }

        public void a(AudioTrack audioTrack) {
            final Handler handler = this.f34011a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new Executor() { // from class: l8.z
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f34012b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f34012b);
            this.f34011a.removeCallbacksAndMessages(null);
        }
    }

    /* synthetic */ y(e eVar, a aVar) {
        this(eVar);
    }

    private void C(long j10) {
        o2 o2Var;
        if (l0()) {
            o2Var = this.f33956b.c(K());
        } else {
            o2Var = o2.f32663d;
        }
        o2 o2Var2 = o2Var;
        boolean e10 = l0() ? this.f33956b.e(S()) : false;
        this.f33965j.add(new i(o2Var2, e10, Math.max(0L, j10), this.f33975t.h(U()), null));
        k0();
        s.c cVar = this.f33973r;
        if (cVar != null) {
            cVar.a(e10);
        }
    }

    private long D(long j10) {
        while (!this.f33965j.isEmpty() && j10 >= this.f33965j.getFirst().f34006d) {
            this.f33979x = this.f33965j.remove();
        }
        i iVar = this.f33979x;
        long j11 = j10 - iVar.f34006d;
        if (iVar.f34003a.equals(o2.f32663d)) {
            return this.f33979x.f34005c + j11;
        }
        if (this.f33965j.isEmpty()) {
            return this.f33979x.f34005c + this.f33956b.a(j11);
        }
        i first = this.f33965j.getFirst();
        return first.f34005c - n0.b0(first.f34006d - j10, this.f33979x.f34003a.f32664a);
    }

    private long E(long j10) {
        return j10 + this.f33975t.h(this.f33956b.d());
    }

    private AudioTrack F(f fVar) throws s.b {
        try {
            return fVar.a(this.Y, this.f33977v, this.W);
        } catch (s.b e10) {
            s.c cVar = this.f33973r;
            if (cVar != null) {
                cVar.b(e10);
            }
            throw e10;
        }
    }

    private AudioTrack G() throws s.b {
        try {
            return F((f) ea.a.e(this.f33975t));
        } catch (s.b e10) {
            f fVar = this.f33975t;
            if (fVar.f33998h > 1000000) {
                f c10 = fVar.c(1000000);
                try {
                    AudioTrack F = F(c10);
                    this.f33975t = c10;
                    return F;
                } catch (s.b e11) {
                    e10.addSuppressed(e11);
                    a0();
                    throw e10;
                }
            }
            a0();
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean H() throws l8.s.e {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.R = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.R
            l8.f[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.f()
        L1f:
            r9.c0(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.R
            int r0 = r0 + r2
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.o0(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.R = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.y.H():boolean");
    }

    private void I() {
        int i10 = 0;
        while (true) {
            l8.f[] fVarArr = this.K;
            if (i10 >= fVarArr.length) {
                return;
            }
            l8.f fVar = fVarArr[i10];
            fVar.flush();
            this.L[i10] = fVar.b();
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat J(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    private o2 K() {
        return Q().f34003a;
    }

    private static int L(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        ea.a.f(minBufferSize != -2);
        return minBufferSize;
    }

    private static int M(int i10) {
        int i11 = n0.f29709a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(n0.f29710b) && i10 == 1) {
            i10 = 2;
        }
        return n0.G(i10);
    }

    private static Pair<Integer, Integer> N(p1 p1Var, l8.e eVar) {
        int f10 = ea.v.f((String) ea.a.e(p1Var.f32709l), p1Var.f32706i);
        int i10 = 6;
        if (f10 == 5 || f10 == 6 || f10 == 18 || f10 == 17 || f10 == 7 || f10 == 8 || f10 == 14) {
            if (f10 == 18 && !eVar.f(18)) {
                f10 = 6;
            } else if (f10 == 8 && !eVar.f(8)) {
                f10 = 7;
            }
            if (eVar.f(f10)) {
                if (f10 == 18) {
                    if (n0.f29709a >= 29) {
                        int i11 = p1Var.f32723z;
                        if (i11 == -1) {
                            i11 = 48000;
                        }
                        i10 = P(18, i11);
                        if (i10 == 0) {
                            ea.r.h("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                            return null;
                        }
                    }
                } else {
                    i10 = p1Var.f32722y;
                    if (i10 > eVar.e()) {
                        return null;
                    }
                }
                int M = M(i10);
                if (M == 0) {
                    return null;
                }
                return Pair.create(Integer.valueOf(f10), Integer.valueOf(M));
            }
            return null;
        }
        return null;
    }

    private static int O(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return l8.b.d(byteBuffer);
            case 7:
            case 8:
                return b0.e(byteBuffer);
            case 9:
                int m10 = e0.m(n0.I(byteBuffer, byteBuffer.position()));
                if (m10 != -1) {
                    return m10;
                }
                throw new IllegalArgumentException();
            case 10:
                return IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                StringBuilder sb2 = new StringBuilder(38);
                sb2.append("Unexpected audio encoding: ");
                sb2.append(i10);
                throw new IllegalStateException(sb2.toString());
            case 14:
                int a10 = l8.b.a(byteBuffer);
                if (a10 == -1) {
                    return 0;
                }
                return l8.b.h(byteBuffer, a10) * 16;
            case 15:
                return AdRequest.MAX_CONTENT_URL_LENGTH;
            case 16:
                return IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
            case 17:
                return l8.c.c(byteBuffer);
        }
    }

    private static int P(int i10, int i11) {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(n0.G(i12)).build(), build)) {
                return i12;
            }
        }
        return 0;
    }

    private i Q() {
        i iVar = this.f33978w;
        if (iVar != null) {
            return iVar;
        }
        if (!this.f33965j.isEmpty()) {
            return this.f33965j.getLast();
        }
        return this.f33979x;
    }

    @SuppressLint({"InlinedApi"})
    private int R(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = n0.f29709a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && n0.f29712d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long T() {
        f fVar = this.f33975t;
        if (fVar.f33993c == 0) {
            return this.B / fVar.f33992b;
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long U() {
        f fVar = this.f33975t;
        if (fVar.f33993c == 0) {
            return this.D / fVar.f33994d;
        }
        return this.E;
    }

    private void V() throws s.b {
        o1 o1Var;
        this.f33963h.block();
        AudioTrack G = G();
        this.f33976u = G;
        if (Y(G)) {
            d0(this.f33976u);
            if (this.f33967l != 3) {
                AudioTrack audioTrack = this.f33976u;
                p1 p1Var = this.f33975t.f33991a;
                audioTrack.setOffloadDelayPadding(p1Var.B, p1Var.C);
            }
        }
        if (n0.f29709a >= 31 && (o1Var = this.f33972q) != null) {
            b.a(this.f33976u, o1Var);
        }
        this.W = this.f33976u.getAudioSessionId();
        u uVar = this.f33964i;
        AudioTrack audioTrack2 = this.f33976u;
        f fVar = this.f33975t;
        uVar.t(audioTrack2, fVar.f33993c == 2, fVar.f33997g, fVar.f33994d, fVar.f33998h);
        h0();
        int i10 = this.X.f33942a;
        if (i10 != 0) {
            this.f33976u.attachAuxEffect(i10);
            this.f33976u.setAuxEffectSendLevel(this.X.f33943b);
        }
        this.H = true;
    }

    private static boolean W(int i10) {
        return (n0.f29709a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean X() {
        return this.f33976u != null;
    }

    private static boolean Y(AudioTrack audioTrack) {
        return n0.f29709a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private static boolean Z(p1 p1Var, l8.e eVar) {
        return N(p1Var, eVar) != null;
    }

    private void a0() {
        if (this.f33975t.l()) {
            this.f33955a0 = true;
        }
    }

    private void b0() {
        if (this.T) {
            return;
        }
        this.T = true;
        this.f33964i.h(U());
        this.f33976u.stop();
        this.A = 0;
    }

    private void c0(long j10) throws s.e {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = l8.f.f33811a;
                }
            }
            if (i10 == length) {
                o0(byteBuffer, j10);
            } else {
                l8.f fVar = this.K[i10];
                if (i10 > this.R) {
                    fVar.e(byteBuffer);
                }
                ByteBuffer b10 = fVar.b();
                this.L[i10] = b10;
                if (b10.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    private void d0(AudioTrack audioTrack) {
        if (this.f33968m == null) {
            this.f33968m = new l();
        }
        this.f33968m.a(audioTrack);
    }

    private void e0() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        this.f33957b0 = false;
        this.F = 0;
        this.f33979x = new i(K(), S(), 0L, 0L, null);
        this.I = 0L;
        this.f33978w = null;
        this.f33965j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f33981z = null;
        this.A = 0;
        this.f33960e.n();
        I();
    }

    private void f0(o2 o2Var, boolean z10) {
        i Q = Q();
        if (o2Var.equals(Q.f34003a) && z10 == Q.f34004b) {
            return;
        }
        i iVar = new i(o2Var, z10, -9223372036854775807L, -9223372036854775807L, null);
        if (X()) {
            this.f33978w = iVar;
        } else {
            this.f33979x = iVar;
        }
    }

    private void g0(o2 o2Var) {
        if (X()) {
            try {
                this.f33976u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(o2Var.f32664a).setPitch(o2Var.f32665b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                ea.r.i("DefaultAudioSink", "Failed to set playback params", e10);
            }
            o2Var = new o2(this.f33976u.getPlaybackParams().getSpeed(), this.f33976u.getPlaybackParams().getPitch());
            this.f33964i.u(o2Var.f32664a);
        }
        this.f33980y = o2Var;
    }

    private void h0() {
        if (X()) {
            if (n0.f29709a >= 21) {
                i0(this.f33976u, this.J);
            } else {
                j0(this.f33976u, this.J);
            }
        }
    }

    private static void i0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    private static void j0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    private void k0() {
        l8.f[] fVarArr = this.f33975t.f33999i;
        ArrayList arrayList = new ArrayList();
        for (l8.f fVar : fVarArr) {
            if (fVar.a()) {
                arrayList.add(fVar);
            } else {
                fVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (l8.f[]) arrayList.toArray(new l8.f[size]);
        this.L = new ByteBuffer[size];
        I();
    }

    private boolean l0() {
        return (this.Y || !"audio/raw".equals(this.f33975t.f33991a.f32709l) || m0(this.f33975t.f33991a.A)) ? false : true;
    }

    private boolean m0(int i10) {
        return this.f33958c && n0.t0(i10);
    }

    private boolean n0(p1 p1Var, l8.d dVar) {
        int f10;
        int G;
        int R;
        if (n0.f29709a < 29 || this.f33967l == 0 || (f10 = ea.v.f((String) ea.a.e(p1Var.f32709l), p1Var.f32706i)) == 0 || (G = n0.G(p1Var.f32722y)) == 0 || (R = R(J(p1Var.f32723z, G, f10), dVar.a())) == 0) {
            return false;
        }
        if (R == 1) {
            return ((p1Var.B != 0 || p1Var.C != 0) && (this.f33967l == 1)) ? false : true;
        } else if (R == 2) {
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    private void o0(ByteBuffer byteBuffer, long j10) throws s.e {
        int p02;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.O;
            if (byteBuffer2 != null) {
                ea.a.a(byteBuffer2 == byteBuffer);
            } else {
                this.O = byteBuffer;
                if (n0.f29709a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.P;
                    if (bArr == null || bArr.length < remaining) {
                        this.P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.P, 0, remaining);
                    byteBuffer.position(position);
                    this.Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (n0.f29709a < 21) {
                int c10 = this.f33964i.c(this.D);
                if (c10 > 0) {
                    p02 = this.f33976u.write(this.P, this.Q, Math.min(remaining2, c10));
                    if (p02 > 0) {
                        this.Q += p02;
                        byteBuffer.position(byteBuffer.position() + p02);
                    }
                } else {
                    p02 = 0;
                }
            } else if (this.Y) {
                ea.a.f(j10 != -9223372036854775807L);
                p02 = q0(this.f33976u, byteBuffer, remaining2, j10);
            } else {
                p02 = p0(this.f33976u, byteBuffer, remaining2);
            }
            this.Z = SystemClock.elapsedRealtime();
            if (p02 < 0) {
                boolean W = W(p02);
                if (W) {
                    a0();
                }
                s.e eVar = new s.e(p02, this.f33975t.f33991a, W);
                s.c cVar = this.f33973r;
                if (cVar != null) {
                    cVar.b(eVar);
                }
                if (!eVar.f33903a) {
                    this.f33970o.b(eVar);
                    return;
                }
                throw eVar;
            }
            this.f33970o.a();
            if (Y(this.f33976u)) {
                long j11 = this.E;
                if (j11 > 0) {
                    this.f33957b0 = false;
                }
                if (this.U && this.f33973r != null && p02 < remaining2 && !this.f33957b0) {
                    this.f33973r.d(this.f33964i.e(j11));
                }
            }
            int i10 = this.f33975t.f33993c;
            if (i10 == 0) {
                this.D += p02;
            }
            if (p02 == remaining2) {
                if (i10 != 0) {
                    ea.a.f(byteBuffer == this.M);
                    this.E += this.F * this.N;
                }
                this.O = null;
            }
        }
    }

    private static int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int q0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (n0.f29709a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f33981z == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f33981z = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f33981z.putInt(1431633921);
        }
        if (this.A == 0) {
            this.f33981z.putInt(4, i10);
            this.f33981z.putLong(8, j10 * 1000);
            this.f33981z.position(0);
            this.A = i10;
        }
        int remaining = this.f33981z.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f33981z, remaining, 1);
            if (write < 0) {
                this.A = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int p02 = p0(audioTrack, byteBuffer, i10);
        if (p02 < 0) {
            this.A = 0;
            return p02;
        }
        this.A -= p02;
        return p02;
    }

    public boolean S() {
        return Q().f34004b;
    }

    @Override // l8.s
    public boolean a(p1 p1Var) {
        return n(p1Var) != 0;
    }

    @Override // l8.s
    public void b(o2 o2Var) {
        o2 o2Var2 = new o2(n0.p(o2Var.f32664a, 0.1f, 8.0f), n0.p(o2Var.f32665b, 0.1f, 8.0f));
        if (this.f33966k && n0.f29709a >= 23) {
            g0(o2Var2);
        } else {
            f0(o2Var2, S());
        }
    }

    @Override // l8.s
    public o2 c() {
        if (this.f33966k) {
            return this.f33980y;
        }
        return K();
    }

    @Override // l8.s
    public boolean d() {
        return !X() || (this.S && !f());
    }

    @Override // l8.s
    public void e(l8.d dVar) {
        if (this.f33977v.equals(dVar)) {
            return;
        }
        this.f33977v = dVar;
        if (this.Y) {
            return;
        }
        flush();
    }

    @Override // l8.s
    public boolean f() {
        return X() && this.f33964i.i(U());
    }

    @Override // l8.s
    public void flush() {
        if (X()) {
            e0();
            if (this.f33964i.j()) {
                this.f33976u.pause();
            }
            if (Y(this.f33976u)) {
                ((l) ea.a.e(this.f33968m)).b(this.f33976u);
            }
            AudioTrack audioTrack = this.f33976u;
            this.f33976u = null;
            if (n0.f29709a < 21 && !this.V) {
                this.W = 0;
            }
            f fVar = this.f33974s;
            if (fVar != null) {
                this.f33975t = fVar;
                this.f33974s = null;
            }
            this.f33964i.r();
            this.f33963h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.f33970o.a();
        this.f33969n.a();
    }

    @Override // l8.s
    public void g(int i10) {
        if (this.W != i10) {
            this.W = i10;
            this.V = i10 != 0;
            flush();
        }
    }

    @Override // l8.s
    public void h(o1 o1Var) {
        this.f33972q = o1Var;
    }

    @Override // l8.s
    public void i() {
        if (this.Y) {
            this.Y = false;
            flush();
        }
    }

    @Override // l8.s
    public void j(v vVar) {
        if (this.X.equals(vVar)) {
            return;
        }
        int i10 = vVar.f33942a;
        float f10 = vVar.f33943b;
        AudioTrack audioTrack = this.f33976u;
        if (audioTrack != null) {
            if (this.X.f33942a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f33976u.setAuxEffectSendLevel(f10);
            }
        }
        this.X = vVar;
    }

    @Override // l8.s
    public void k(s.c cVar) {
        this.f33973r = cVar;
    }

    @Override // l8.s
    public boolean l(ByteBuffer byteBuffer, long j10, int i10) throws s.b, s.e {
        ByteBuffer byteBuffer2 = this.M;
        ea.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f33974s != null) {
            if (!H()) {
                return false;
            }
            if (!this.f33974s.b(this.f33975t)) {
                b0();
                if (f()) {
                    return false;
                }
                flush();
            } else {
                this.f33975t = this.f33974s;
                this.f33974s = null;
                if (Y(this.f33976u) && this.f33967l != 3) {
                    this.f33976u.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f33976u;
                    p1 p1Var = this.f33975t.f33991a;
                    audioTrack.setOffloadDelayPadding(p1Var.B, p1Var.C);
                    this.f33957b0 = true;
                }
            }
            C(j10);
        }
        if (!X()) {
            try {
                V();
            } catch (s.b e10) {
                if (!e10.f33901a) {
                    this.f33969n.b(e10);
                    return false;
                }
                throw e10;
            }
        }
        this.f33969n.a();
        if (this.H) {
            this.I = Math.max(0L, j10);
            this.G = false;
            this.H = false;
            if (this.f33966k && n0.f29709a >= 23) {
                g0(this.f33980y);
            }
            C(j10);
            if (this.U) {
                play();
            }
        }
        if (this.f33964i.l(U())) {
            if (this.M == null) {
                ea.a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                f fVar = this.f33975t;
                if (fVar.f33993c != 0 && this.F == 0) {
                    int O = O(fVar.f33997g, byteBuffer);
                    this.F = O;
                    if (O == 0) {
                        return true;
                    }
                }
                if (this.f33978w != null) {
                    if (!H()) {
                        return false;
                    }
                    C(j10);
                    this.f33978w = null;
                }
                long k10 = this.I + this.f33975t.k(T() - this.f33960e.m());
                if (!this.G && Math.abs(k10 - j10) > 200000) {
                    this.f33973r.b(new s.d(j10, k10));
                    this.G = true;
                }
                if (this.G) {
                    if (!H()) {
                        return false;
                    }
                    long j11 = j10 - k10;
                    this.I += j11;
                    this.G = false;
                    C(j10);
                    s.c cVar = this.f33973r;
                    if (cVar != null && j11 != 0) {
                        cVar.f();
                    }
                }
                if (this.f33975t.f33993c == 0) {
                    this.B += byteBuffer.remaining();
                } else {
                    this.C += this.F * i10;
                }
                this.M = byteBuffer;
                this.N = i10;
            }
            c0(j10);
            if (!this.M.hasRemaining()) {
                this.M = null;
                this.N = 0;
                return true;
            } else if (this.f33964i.k(U())) {
                ea.r.h("DefaultAudioSink", "Resetting stalled audio track");
                flush();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // l8.s
    public void m() {
        if (n0.f29709a < 25) {
            flush();
            return;
        }
        this.f33970o.a();
        this.f33969n.a();
        if (X()) {
            e0();
            if (this.f33964i.j()) {
                this.f33976u.pause();
            }
            this.f33976u.flush();
            this.f33964i.r();
            u uVar = this.f33964i;
            AudioTrack audioTrack = this.f33976u;
            f fVar = this.f33975t;
            uVar.t(audioTrack, fVar.f33993c == 2, fVar.f33997g, fVar.f33994d, fVar.f33998h);
            this.H = true;
        }
    }

    @Override // l8.s
    public int n(p1 p1Var) {
        if (!"audio/raw".equals(p1Var.f32709l)) {
            return ((this.f33955a0 || !n0(p1Var, this.f33977v)) && !Z(p1Var, this.f33954a)) ? 0 : 2;
        } else if (!n0.u0(p1Var.A)) {
            int i10 = p1Var.A;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Invalid PCM encoding: ");
            sb2.append(i10);
            ea.r.h("DefaultAudioSink", sb2.toString());
            return 0;
        } else {
            int i11 = p1Var.A;
            return (i11 == 2 || (this.f33958c && i11 == 4)) ? 2 : 1;
        }
    }

    @Override // l8.s
    public void o() throws s.e {
        if (!this.S && X() && H()) {
            b0();
            this.S = true;
        }
    }

    @Override // l8.s
    public void p(p1 p1Var, int i10, int[] iArr) throws s.a {
        l8.f[] fVarArr;
        int i11;
        int intValue;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int a10;
        l8.f[] fVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(p1Var.f32709l)) {
            ea.a.a(n0.u0(p1Var.A));
            i13 = n0.f0(p1Var.A, p1Var.f32722y);
            if (m0(p1Var.A)) {
                fVarArr2 = this.f33962g;
            } else {
                fVarArr2 = this.f33961f;
            }
            this.f33960e.o(p1Var.B, p1Var.C);
            if (n0.f29709a < 21 && p1Var.f32722y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i17 = 0; i17 < 6; i17++) {
                    iArr2[i17] = i17;
                }
            } else {
                iArr2 = iArr;
            }
            this.f33959d.m(iArr2);
            f.a aVar = new f.a(p1Var.f32723z, p1Var.f32722y, p1Var.A);
            for (l8.f fVar : fVarArr2) {
                try {
                    f.a c10 = fVar.c(aVar);
                    if (fVar.a()) {
                        aVar = c10;
                    }
                } catch (f.b e10) {
                    throw new s.a(e10, p1Var);
                }
            }
            int i18 = aVar.f33815c;
            int i19 = aVar.f33813a;
            int G = n0.G(aVar.f33814b);
            fVarArr = fVarArr2;
            i15 = n0.f0(i18, aVar.f33814b);
            i12 = i18;
            i11 = i19;
            intValue = G;
            i14 = 0;
        } else {
            l8.f[] fVarArr3 = new l8.f[0];
            int i20 = p1Var.f32723z;
            if (n0(p1Var, this.f33977v)) {
                fVarArr = fVarArr3;
                i11 = i20;
                i12 = ea.v.f((String) ea.a.e(p1Var.f32709l), p1Var.f32706i);
                intValue = n0.G(p1Var.f32722y);
                i13 = -1;
                i14 = 1;
            } else {
                Pair<Integer, Integer> N = N(p1Var, this.f33954a);
                if (N != null) {
                    int intValue2 = ((Integer) N.first).intValue();
                    fVarArr = fVarArr3;
                    i11 = i20;
                    intValue = ((Integer) N.second).intValue();
                    i12 = intValue2;
                    i13 = -1;
                    i14 = 2;
                } else {
                    String valueOf = String.valueOf(p1Var);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
                    sb2.append("Unable to configure passthrough for: ");
                    sb2.append(valueOf);
                    throw new s.a(sb2.toString(), p1Var);
                }
            }
            i15 = -1;
        }
        if (i10 != 0) {
            a10 = i10;
            i16 = i12;
        } else {
            i16 = i12;
            a10 = this.f33971p.a(L(i11, intValue, i12), i12, i14, i15, i11, this.f33966k ? 8.0d : 1.0d);
        }
        if (i16 == 0) {
            String valueOf2 = String.valueOf(p1Var);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 48);
            sb3.append("Invalid output encoding (mode=");
            sb3.append(i14);
            sb3.append(") for: ");
            sb3.append(valueOf2);
            throw new s.a(sb3.toString(), p1Var);
        } else if (intValue != 0) {
            this.f33955a0 = false;
            f fVar2 = new f(p1Var, i13, i14, i15, i11, intValue, i16, a10, fVarArr);
            if (X()) {
                this.f33974s = fVar2;
            } else {
                this.f33975t = fVar2;
            }
        } else {
            String valueOf3 = String.valueOf(p1Var);
            StringBuilder sb4 = new StringBuilder(valueOf3.length() + 54);
            sb4.append("Invalid output channel config (mode=");
            sb4.append(i14);
            sb4.append(") for: ");
            sb4.append(valueOf3);
            throw new s.a(sb4.toString(), p1Var);
        }
    }

    @Override // l8.s
    public void pause() {
        this.U = false;
        if (X() && this.f33964i.q()) {
            this.f33976u.pause();
        }
    }

    @Override // l8.s
    public void play() {
        this.U = true;
        if (X()) {
            this.f33964i.v();
            this.f33976u.play();
        }
    }

    @Override // l8.s
    public long q(boolean z10) {
        if (!X() || this.H) {
            return Long.MIN_VALUE;
        }
        return E(D(Math.min(this.f33964i.d(z10), this.f33975t.h(U()))));
    }

    @Override // l8.s
    public void r() {
        this.G = true;
    }

    @Override // l8.s
    public void reset() {
        flush();
        for (l8.f fVar : this.f33961f) {
            fVar.reset();
        }
        for (l8.f fVar2 : this.f33962g) {
            fVar2.reset();
        }
        this.U = false;
        this.f33955a0 = false;
    }

    @Override // l8.s
    public void s() {
        ea.a.f(n0.f29709a >= 21);
        ea.a.f(this.V);
        if (this.Y) {
            return;
        }
        this.Y = true;
        flush();
    }

    @Override // l8.s
    public void setVolume(float f10) {
        if (this.J != f10) {
            this.J = f10;
            h0();
        }
    }

    @Override // l8.s
    public void t(boolean z10) {
        f0(K(), z10);
    }

    private y(e eVar) {
        this.f33954a = eVar.f33985a;
        c cVar = eVar.f33986b;
        this.f33956b = cVar;
        int i10 = n0.f29709a;
        this.f33958c = i10 >= 21 && eVar.f33987c;
        this.f33966k = i10 >= 23 && eVar.f33988d;
        this.f33967l = i10 >= 29 ? eVar.f33989e : 0;
        this.f33971p = eVar.f33990f;
        this.f33963h = new ConditionVariable(true);
        this.f33964i = new u(new k(this, null));
        x xVar = new x();
        this.f33959d = xVar;
        k0 k0Var = new k0();
        this.f33960e = k0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new g0(), xVar, k0Var);
        Collections.addAll(arrayList, cVar.b());
        this.f33961f = (l8.f[]) arrayList.toArray(new l8.f[0]);
        this.f33962g = new l8.f[]{new c0()};
        this.J = 1.0f;
        this.f33977v = l8.d.f33779g;
        this.W = 0;
        this.X = new v(0, 0.0f);
        o2 o2Var = o2.f32663d;
        this.f33979x = new i(o2Var, false, 0L, 0L, null);
        this.f33980y = o2Var;
        this.R = -1;
        this.K = new l8.f[0];
        this.L = new ByteBuffer[0];
        this.f33965j = new ArrayDeque<>();
        this.f33969n = new j<>(100L);
        this.f33970o = new j<>(100L);
    }
}
