package j8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import ba.a0;
import com.google.android.exoplayer2.drm.j;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import i9.r;
import i9.u;
import j8.i2;
import j8.j3;
import j8.k;
import j8.r2;
import j8.w2;
import j8.x1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jb.s;

/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: classes2.dex */
public final class l1 implements Handler.Callback, r.a, a0.a, i2.d, k.a, r2.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private h K;
    private long L;
    private int M;
    private boolean N;
    private n O;
    private long P = -9223372036854775807L;

    /* renamed from: a */
    private final w2[] f32558a;

    /* renamed from: b */
    private final Set<w2> f32559b;

    /* renamed from: c */
    private final y2[] f32560c;

    /* renamed from: d */
    private final ba.a0 f32561d;

    /* renamed from: e */
    private final ba.b0 f32562e;

    /* renamed from: f */
    private final v1 f32563f;

    /* renamed from: g */
    private final da.f f32564g;

    /* renamed from: h */
    private final ea.n f32565h;

    /* renamed from: i */
    private final HandlerThread f32566i;

    /* renamed from: j */
    private final Looper f32567j;

    /* renamed from: k */
    private final j3.c f32568k;

    /* renamed from: l */
    private final j3.b f32569l;

    /* renamed from: m */
    private final long f32570m;

    /* renamed from: n */
    private final boolean f32571n;

    /* renamed from: o */
    private final k f32572o;

    /* renamed from: p */
    private final ArrayList<d> f32573p;

    /* renamed from: q */
    private final ea.c f32574q;

    /* renamed from: r */
    private final f f32575r;

    /* renamed from: s */
    private final f2 f32576s;

    /* renamed from: t */
    private final i2 f32577t;

    /* renamed from: u */
    private final u1 f32578u;

    /* renamed from: v */
    private final long f32579v;

    /* renamed from: w */
    private b3 f32580w;

    /* renamed from: x */
    private n2 f32581x;

    /* renamed from: y */
    private e f32582y;

    /* renamed from: z */
    private boolean f32583z;

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public class a implements w2.a {
        a() {
            l1.this = r1;
        }

        @Override // j8.w2.a
        public void a() {
            l1.this.f32565h.g(2);
        }

        @Override // j8.w2.a
        public void b(long j10) {
            if (j10 >= Constants.MIN_PROGRESS_TIME) {
                l1.this.H = true;
            }
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final List<i2.c> f32585a;

        /* renamed from: b */
        private final i9.q0 f32586b;

        /* renamed from: c */
        private final int f32587c;

        /* renamed from: d */
        private final long f32588d;

        /* synthetic */ b(List list, i9.q0 q0Var, int i10, long j10, a aVar) {
            this(list, q0Var, i10, j10);
        }

        private b(List<i2.c> list, i9.q0 q0Var, int i10, long j10) {
            this.f32585a = list;
            this.f32586b = q0Var;
            this.f32587c = i10;
            this.f32588d = j10;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        public final int f32589a;

        /* renamed from: b */
        public final int f32590b;

        /* renamed from: c */
        public final int f32591c;

        /* renamed from: d */
        public final i9.q0 f32592d;
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a */
        public final r2 f32593a;

        /* renamed from: b */
        public int f32594b;

        /* renamed from: c */
        public long f32595c;

        /* renamed from: d */
        public Object f32596d;

        public d(r2 r2Var) {
            this.f32593a = r2Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.f32596d;
            if ((obj == null) != (dVar.f32596d == null)) {
                return obj != null ? -1 : 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i10 = this.f32594b - dVar.f32594b;
                return i10 != 0 ? i10 : ea.n0.o(this.f32595c, dVar.f32595c);
            }
        }

        public void b(int i10, long j10, Object obj) {
            this.f32594b = i10;
            this.f32595c = j10;
            this.f32596d = obj;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a */
        private boolean f32597a;

        /* renamed from: b */
        public n2 f32598b;

        /* renamed from: c */
        public int f32599c;

        /* renamed from: d */
        public boolean f32600d;

        /* renamed from: e */
        public int f32601e;

        /* renamed from: f */
        public boolean f32602f;

        /* renamed from: g */
        public int f32603g;

        public e(n2 n2Var) {
            this.f32598b = n2Var;
        }

        public void b(int i10) {
            this.f32597a |= i10 > 0;
            this.f32599c += i10;
        }

        public void c(int i10) {
            this.f32597a = true;
            this.f32602f = true;
            this.f32603g = i10;
        }

        public void d(n2 n2Var) {
            this.f32597a |= this.f32598b != n2Var;
            this.f32598b = n2Var;
        }

        public void e(int i10) {
            if (this.f32600d && this.f32601e != 5) {
                ea.a.a(i10 == 5);
                return;
            }
            this.f32597a = true;
            this.f32600d = true;
            this.f32601e = i10;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public interface f {
        void a(e eVar);
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: a */
        public final u.b f32604a;

        /* renamed from: b */
        public final long f32605b;

        /* renamed from: c */
        public final long f32606c;

        /* renamed from: d */
        public final boolean f32607d;

        /* renamed from: e */
        public final boolean f32608e;

        /* renamed from: f */
        public final boolean f32609f;

        public g(u.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f32604a = bVar;
            this.f32605b = j10;
            this.f32606c = j11;
            this.f32607d = z10;
            this.f32608e = z11;
            this.f32609f = z12;
        }
    }

    /* compiled from: ExoPlayerImplInternal.java */
    /* loaded from: classes2.dex */
    public static final class h {

        /* renamed from: a */
        public final j3 f32610a;

        /* renamed from: b */
        public final int f32611b;

        /* renamed from: c */
        public final long f32612c;

        public h(j3 j3Var, int i10, long j10) {
            this.f32610a = j3Var;
            this.f32611b = i10;
            this.f32612c = j10;
        }
    }

    public l1(w2[] w2VarArr, ba.a0 a0Var, ba.b0 b0Var, v1 v1Var, da.f fVar, int i10, boolean z10, k8.a aVar, b3 b3Var, u1 u1Var, long j10, boolean z11, Looper looper, ea.c cVar, f fVar2, k8.o1 o1Var) {
        this.f32575r = fVar2;
        this.f32558a = w2VarArr;
        this.f32561d = a0Var;
        this.f32562e = b0Var;
        this.f32563f = v1Var;
        this.f32564g = fVar;
        this.E = i10;
        this.F = z10;
        this.f32580w = b3Var;
        this.f32578u = u1Var;
        this.f32579v = j10;
        this.A = z11;
        this.f32574q = cVar;
        this.f32570m = v1Var.b();
        this.f32571n = v1Var.a();
        n2 k10 = n2.k(b0Var);
        this.f32581x = k10;
        this.f32582y = new e(k10);
        this.f32560c = new y2[w2VarArr.length];
        for (int i11 = 0; i11 < w2VarArr.length; i11++) {
            w2VarArr[i11].i(i11, o1Var);
            this.f32560c[i11] = w2VarArr[i11].n();
        }
        this.f32572o = new k(this, cVar);
        this.f32573p = new ArrayList<>();
        this.f32559b = jb.q0.h();
        this.f32568k = new j3.c();
        this.f32569l = new j3.b();
        a0Var.b(this, fVar);
        this.N = true;
        Handler handler = new Handler(looper);
        this.f32576s = new f2(aVar, handler);
        this.f32577t = new i2(this, aVar, handler, o1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f32566i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f32567j = looper2;
        this.f32565h = cVar.b(looper2, this);
    }

    private Pair<u.b, Long> A(j3 j3Var) {
        if (j3Var.q()) {
            return Pair.create(n2.l(), 0L);
        }
        Pair<Object, Long> j10 = j3Var.j(this.f32568k, this.f32569l, j3Var.a(this.F), -9223372036854775807L);
        u.b B = this.f32576s.B(j3Var, j10.first, 0L);
        long longValue = ((Long) j10.second).longValue();
        if (B.b()) {
            j3Var.h(B.f31793a, this.f32569l);
            longValue = B.f31795c == this.f32569l.m(B.f31794b) ? this.f32569l.i() : 0L;
        }
        return Pair.create(B, Long.valueOf(longValue));
    }

    private void A0(long j10, long j11) {
        this.f32565h.j(2);
        this.f32565h.i(2, j10 + j11);
    }

    private long C() {
        return D(this.f32581x.f32651q);
    }

    private void C0(boolean z10) throws n {
        u.b bVar = this.f32576s.p().f32341f.f32367a;
        long F0 = F0(bVar, this.f32581x.f32653s, true, false);
        if (F0 != this.f32581x.f32653s) {
            n2 n2Var = this.f32581x;
            this.f32581x = L(bVar, F0, n2Var.f32637c, n2Var.f32638d, z10, 5);
        }
    }

    private long D(long j10) {
        c2 j11 = this.f32576s.j();
        if (j11 == null) {
            return 0L;
        }
        return Math.max(0L, j10 - j11.y(this.L));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ab A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:97:0x00a1, B:99:0x00ab, B:102:0x00b1, B:104:0x00b7, B:105:0x00ba, B:107:0x00c0, B:109:0x00ca, B:111:0x00d2, B:115:0x00da, B:117:0x00e4, B:119:0x00f4, B:123:0x00fe, B:127:0x0110, B:131:0x0119), top: B:149:0x00a1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void D0(j8.l1.h r20) throws j8.n {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.l1.D0(j8.l1$h):void");
    }

    private void E(i9.r rVar) {
        if (this.f32576s.v(rVar)) {
            this.f32576s.y(this.L);
            V();
        }
    }

    private long E0(u.b bVar, long j10, boolean z10) throws n {
        return F0(bVar, j10, this.f32576s.p() != this.f32576s.q(), z10);
    }

    private void F(IOException iOException, int i10) {
        n d10 = n.d(iOException, i10);
        c2 p10 = this.f32576s.p();
        if (p10 != null) {
            d10 = d10.b(p10.f32341f.f32367a);
        }
        ea.r.d("ExoPlayerImplInternal", "Playback error", d10);
        i1(false, false);
        this.f32581x = this.f32581x.f(d10);
    }

    private long F0(u.b bVar, long j10, boolean z10, boolean z11) throws n {
        j1();
        this.C = false;
        if (z11 || this.f32581x.f32639e == 3) {
            a1(2);
        }
        c2 p10 = this.f32576s.p();
        c2 c2Var = p10;
        while (c2Var != null && !bVar.equals(c2Var.f32341f.f32367a)) {
            c2Var = c2Var.j();
        }
        if (z10 || p10 != c2Var || (c2Var != null && c2Var.z(j10) < 0)) {
            for (w2 w2Var : this.f32558a) {
                o(w2Var);
            }
            if (c2Var != null) {
                while (this.f32576s.p() != c2Var) {
                    this.f32576s.b();
                }
                this.f32576s.z(c2Var);
                c2Var.x(1000000000000L);
                r();
            }
        }
        if (c2Var != null) {
            this.f32576s.z(c2Var);
            if (!c2Var.f32339d) {
                c2Var.f32341f = c2Var.f32341f.b(j10);
            } else if (c2Var.f32340e) {
                long k10 = c2Var.f32336a.k(j10);
                c2Var.f32336a.u(k10 - this.f32570m, this.f32571n);
                j10 = k10;
            }
            t0(j10);
            V();
        } else {
            this.f32576s.f();
            t0(j10);
        }
        G(false);
        this.f32565h.g(2);
        return j10;
    }

    private void G(boolean z10) {
        long i10;
        c2 j10 = this.f32576s.j();
        u.b bVar = j10 == null ? this.f32581x.f32636b : j10.f32341f.f32367a;
        boolean z11 = !this.f32581x.f32645k.equals(bVar);
        if (z11) {
            this.f32581x = this.f32581x.b(bVar);
        }
        n2 n2Var = this.f32581x;
        if (j10 == null) {
            i10 = n2Var.f32653s;
        } else {
            i10 = j10.i();
        }
        n2Var.f32651q = i10;
        this.f32581x.f32652r = C();
        if ((z11 || z10) && j10 != null && j10.f32339d) {
            l1(j10.n(), j10.o());
        }
    }

    private void G0(r2 r2Var) throws n {
        if (r2Var.f() == -9223372036854775807L) {
            H0(r2Var);
        } else if (this.f32581x.f32635a.q()) {
            this.f32573p.add(new d(r2Var));
        } else {
            d dVar = new d(r2Var);
            j3 j3Var = this.f32581x.f32635a;
            if (v0(dVar, j3Var, j3Var, this.E, this.F, this.f32568k, this.f32569l)) {
                this.f32573p.add(dVar);
                Collections.sort(this.f32573p);
                return;
            }
            r2Var.k(false);
        }
    }

    private void H(j3 j3Var, boolean z10) throws n {
        boolean z11;
        g x02 = x0(j3Var, this.f32581x, this.K, this.f32576s, this.E, this.F, this.f32568k, this.f32569l);
        u.b bVar = x02.f32604a;
        long j10 = x02.f32606c;
        boolean z12 = x02.f32607d;
        long j11 = x02.f32605b;
        boolean z13 = (this.f32581x.f32636b.equals(bVar) && j11 == this.f32581x.f32653s) ? false : true;
        h hVar = null;
        try {
            if (x02.f32608e) {
                if (this.f32581x.f32639e != 1) {
                    a1(4);
                }
                r0(false, false, false, true);
            }
            try {
                if (!z13) {
                    z11 = false;
                    if (!this.f32576s.F(j3Var, this.L, z())) {
                        C0(false);
                    }
                } else {
                    z11 = false;
                    if (!j3Var.q()) {
                        for (c2 p10 = this.f32576s.p(); p10 != null; p10 = p10.j()) {
                            if (p10.f32341f.f32367a.equals(bVar)) {
                                p10.f32341f = this.f32576s.r(j3Var, p10.f32341f);
                                p10.A();
                            }
                        }
                        j11 = E0(bVar, j11, z12);
                    }
                }
                n2 n2Var = this.f32581x;
                o1(j3Var, bVar, n2Var.f32635a, n2Var.f32636b, x02.f32609f ? j11 : -9223372036854775807L);
                if (z13 || j10 != this.f32581x.f32637c) {
                    n2 n2Var2 = this.f32581x;
                    Object obj = n2Var2.f32636b.f31793a;
                    j3 j3Var2 = n2Var2.f32635a;
                    this.f32581x = L(bVar, j11, j10, this.f32581x.f32638d, z13 && z10 && !j3Var2.q() && !j3Var2.h(obj, this.f32569l).f32513f, j3Var.b(obj) == -1 ? 4 : 3);
                }
                s0();
                w0(j3Var, this.f32581x.f32635a);
                this.f32581x = this.f32581x.j(j3Var);
                if (!j3Var.q()) {
                    this.K = null;
                }
                G(z11);
            } catch (Throwable th) {
                th = th;
                hVar = null;
                n2 n2Var3 = this.f32581x;
                h hVar2 = hVar;
                o1(j3Var, bVar, n2Var3.f32635a, n2Var3.f32636b, x02.f32609f ? j11 : -9223372036854775807L);
                if (z13 || j10 != this.f32581x.f32637c) {
                    n2 n2Var4 = this.f32581x;
                    Object obj2 = n2Var4.f32636b.f31793a;
                    j3 j3Var3 = n2Var4.f32635a;
                    this.f32581x = L(bVar, j11, j10, this.f32581x.f32638d, z13 && z10 && !j3Var3.q() && !j3Var3.h(obj2, this.f32569l).f32513f, j3Var.b(obj2) == -1 ? 4 : 3);
                }
                s0();
                w0(j3Var, this.f32581x.f32635a);
                this.f32581x = this.f32581x.j(j3Var);
                if (!j3Var.q()) {
                    this.K = hVar2;
                }
                G(false);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void H0(r2 r2Var) throws n {
        if (r2Var.c() == this.f32567j) {
            l(r2Var);
            int i10 = this.f32581x.f32639e;
            if (i10 == 3 || i10 == 2) {
                this.f32565h.g(2);
                return;
            }
            return;
        }
        this.f32565h.d(15, r2Var).a();
    }

    private void I(i9.r rVar) throws n {
        if (this.f32576s.v(rVar)) {
            c2 j10 = this.f32576s.j();
            j10.p(this.f32572o.c().f32664a, this.f32581x.f32635a);
            l1(j10.n(), j10.o());
            if (j10 == this.f32576s.p()) {
                t0(j10.f32341f.f32368b);
                r();
                n2 n2Var = this.f32581x;
                u.b bVar = n2Var.f32636b;
                long j11 = j10.f32341f.f32368b;
                this.f32581x = L(bVar, j11, n2Var.f32637c, j11, false, 5);
            }
            V();
        }
    }

    private void I0(final r2 r2Var) {
        Looper c10 = r2Var.c();
        if (!c10.getThread().isAlive()) {
            ea.r.h("TAG", "Trying to send message on a dead thread.");
            r2Var.k(false);
            return;
        }
        this.f32574q.b(c10, null).post(new Runnable() { // from class: j8.k1
            @Override // java.lang.Runnable
            public final void run() {
                l1.g(l1.this, r2Var);
            }
        });
    }

    private void J(o2 o2Var, float f10, boolean z10, boolean z11) throws n {
        w2[] w2VarArr;
        if (z10) {
            if (z11) {
                this.f32582y.b(1);
            }
            this.f32581x = this.f32581x.g(o2Var);
        }
        p1(o2Var.f32664a);
        for (w2 w2Var : this.f32558a) {
            if (w2Var != null) {
                w2Var.p(f10, o2Var.f32664a);
            }
        }
    }

    private void J0(long j10) {
        w2[] w2VarArr;
        for (w2 w2Var : this.f32558a) {
            if (w2Var.f() != null) {
                K0(w2Var, j10);
            }
        }
    }

    private void K(o2 o2Var, boolean z10) throws n {
        J(o2Var, o2Var.f32664a, true, z10);
    }

    private void K0(w2 w2Var, long j10) {
        w2Var.h();
        if (w2Var instanceof r9.m) {
            ((r9.m) w2Var).W(j10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n2 L(u.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        i9.y0 y0Var;
        ba.b0 b0Var;
        i9.y0 n10;
        ba.b0 o10;
        this.N = (!this.N && j10 == this.f32581x.f32653s && bVar.equals(this.f32581x.f32636b)) ? false : true;
        s0();
        n2 n2Var = this.f32581x;
        i9.y0 y0Var2 = n2Var.f32642h;
        ba.b0 b0Var2 = n2Var.f32643i;
        List list2 = n2Var.f32644j;
        if (this.f32577t.s()) {
            c2 p10 = this.f32576s.p();
            if (p10 == null) {
                n10 = i9.y0.f31861d;
            } else {
                n10 = p10.n();
            }
            if (p10 == null) {
                o10 = this.f32562e;
            } else {
                o10 = p10.o();
            }
            List v10 = v(o10.f5045c);
            if (p10 != null) {
                d2 d2Var = p10.f32341f;
                if (d2Var.f32369c != j11) {
                    p10.f32341f = d2Var.a(j11);
                }
            }
            y0Var = n10;
            b0Var = o10;
            list = v10;
        } else if (bVar.equals(this.f32581x.f32636b)) {
            list = list2;
            y0Var = y0Var2;
            b0Var = b0Var2;
        } else {
            y0Var = i9.y0.f31861d;
            b0Var = this.f32562e;
            list = jb.s.t();
        }
        if (z10) {
            this.f32582y.e(i10);
        }
        return this.f32581x.c(bVar, j10, j11, j12, C(), y0Var, b0Var, list);
    }

    private void L0(boolean z10, AtomicBoolean atomicBoolean) {
        w2[] w2VarArr;
        if (this.G != z10) {
            this.G = z10;
            if (!z10) {
                for (w2 w2Var : this.f32558a) {
                    if (!Q(w2Var) && this.f32559b.remove(w2Var)) {
                        w2Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private boolean M(w2 w2Var, c2 c2Var) {
        c2 j10 = c2Var.j();
        return c2Var.f32341f.f32372f && j10.f32339d && ((w2Var instanceof r9.m) || (w2Var instanceof com.google.android.exoplayer2.metadata.a) || w2Var.t() >= j10.m());
    }

    private void M0(b bVar) throws n {
        this.f32582y.b(1);
        if (bVar.f32587c != -1) {
            this.K = new h(new s2(bVar.f32585a, bVar.f32586b), bVar.f32587c, bVar.f32588d);
        }
        H(this.f32577t.C(bVar.f32585a, bVar.f32586b), false);
    }

    private boolean N() {
        c2 q10 = this.f32576s.q();
        if (q10.f32339d) {
            int i10 = 0;
            while (true) {
                w2[] w2VarArr = this.f32558a;
                if (i10 >= w2VarArr.length) {
                    return true;
                }
                w2 w2Var = w2VarArr[i10];
                i9.o0 o0Var = q10.f32338c[i10];
                if (w2Var.f() != o0Var || (o0Var != null && !w2Var.g() && !M(w2Var, q10))) {
                    break;
                }
                i10++;
            }
            return false;
        }
        return false;
    }

    private static boolean O(boolean z10, u.b bVar, long j10, u.b bVar2, j3.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f31793a.equals(bVar2.f31793a)) {
            return (bVar.b() && bVar3.s(bVar.f31794b)) ? (bVar3.j(bVar.f31794b, bVar.f31795c) == 4 || bVar3.j(bVar.f31794b, bVar.f31795c) == 2) ? false : true : bVar2.b() && bVar3.s(bVar2.f31794b);
        }
        return false;
    }

    private void O0(boolean z10) {
        if (z10 == this.I) {
            return;
        }
        this.I = z10;
        n2 n2Var = this.f32581x;
        int i10 = n2Var.f32639e;
        if (!z10 && i10 != 4 && i10 != 1) {
            this.f32565h.g(2);
        } else {
            this.f32581x = n2Var.d(z10);
        }
    }

    private boolean P() {
        c2 j10 = this.f32576s.j();
        return (j10 == null || j10.k() == Long.MIN_VALUE) ? false : true;
    }

    private void P0(boolean z10) throws n {
        this.A = z10;
        s0();
        if (!this.B || this.f32576s.q() == this.f32576s.p()) {
            return;
        }
        C0(true);
        G(false);
    }

    private static boolean Q(w2 w2Var) {
        return w2Var.getState() != 0;
    }

    private boolean R() {
        c2 p10 = this.f32576s.p();
        long j10 = p10.f32341f.f32371e;
        return p10.f32339d && (j10 == -9223372036854775807L || this.f32581x.f32653s < j10 || !d1());
    }

    private void R0(boolean z10, int i10, boolean z11, int i11) throws n {
        this.f32582y.b(z11 ? 1 : 0);
        this.f32582y.c(i11);
        this.f32581x = this.f32581x.e(z10, i10);
        this.C = false;
        g0(z10);
        if (!d1()) {
            j1();
            n1();
            return;
        }
        int i12 = this.f32581x.f32639e;
        if (i12 == 3) {
            g1();
            this.f32565h.g(2);
        } else if (i12 == 2) {
            this.f32565h.g(2);
        }
    }

    private static boolean S(n2 n2Var, j3.b bVar) {
        u.b bVar2 = n2Var.f32636b;
        j3 j3Var = n2Var.f32635a;
        return j3Var.q() || j3Var.h(bVar2.f31793a, bVar).f32513f;
    }

    public /* synthetic */ Boolean T() {
        return Boolean.valueOf(this.f32583z);
    }

    private void T0(o2 o2Var) throws n {
        this.f32572o.b(o2Var);
        K(this.f32572o.c(), true);
    }

    public /* synthetic */ void U(r2 r2Var) {
        try {
            l(r2Var);
        } catch (n e10) {
            ea.r.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void V() {
        boolean c12 = c1();
        this.D = c12;
        if (c12) {
            this.f32576s.j().d(this.L);
        }
        k1();
    }

    private void V0(int i10) throws n {
        this.E = i10;
        if (!this.f32576s.G(this.f32581x.f32635a, i10)) {
            C0(true);
        }
        G(false);
    }

    private void W() {
        this.f32582y.d(this.f32581x);
        if (this.f32582y.f32597a) {
            this.f32575r.a(this.f32582y);
            this.f32582y = new e(this.f32581x);
        }
    }

    private void W0(b3 b3Var) {
        this.f32580w = b3Var;
    }

    private boolean X(long j10, long j11) {
        if (this.I && this.H) {
            return false;
        }
        A0(j10, j11);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0090 A[LOOP:1: B:121:0x0074->B:131:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0044 -> B:108:0x0045). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0073 -> B:121:0x0074). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Y(long r8, long r10) throws j8.n {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.l1.Y(long, long):void");
    }

    private void Y0(boolean z10) throws n {
        this.F = z10;
        if (!this.f32576s.H(this.f32581x.f32635a, z10)) {
            C0(true);
        }
        G(false);
    }

    private void Z() throws n {
        d2 o10;
        this.f32576s.y(this.L);
        if (this.f32576s.D() && (o10 = this.f32576s.o(this.L, this.f32581x)) != null) {
            c2 g10 = this.f32576s.g(this.f32560c, this.f32561d, this.f32563f.d(), this.f32577t, o10, this.f32562e);
            g10.f32336a.i(this, o10.f32368b);
            if (this.f32576s.p() == g10) {
                t0(o10.f32368b);
            }
            G(false);
        }
        if (this.D) {
            this.D = P();
            k1();
            return;
        }
        V();
    }

    private void Z0(i9.q0 q0Var) throws n {
        this.f32582y.b(1);
        H(this.f32577t.D(q0Var), false);
    }

    private void a0() throws n {
        boolean z10;
        boolean z11 = false;
        while (b1()) {
            if (z11) {
                W();
            }
            c2 c2Var = (c2) ea.a.e(this.f32576s.b());
            if (this.f32581x.f32636b.f31793a.equals(c2Var.f32341f.f32367a.f31793a)) {
                u.b bVar = this.f32581x.f32636b;
                if (bVar.f31794b == -1) {
                    u.b bVar2 = c2Var.f32341f.f32367a;
                    if (bVar2.f31794b == -1 && bVar.f31797e != bVar2.f31797e) {
                        z10 = true;
                        d2 d2Var = c2Var.f32341f;
                        u.b bVar3 = d2Var.f32367a;
                        long j10 = d2Var.f32368b;
                        this.f32581x = L(bVar3, j10, d2Var.f32369c, j10, !z10, 0);
                        s0();
                        n1();
                        z11 = true;
                    }
                }
            }
            z10 = false;
            d2 d2Var2 = c2Var.f32341f;
            u.b bVar32 = d2Var2.f32367a;
            long j102 = d2Var2.f32368b;
            this.f32581x = L(bVar32, j102, d2Var2.f32369c, j102, !z10, 0);
            s0();
            n1();
            z11 = true;
        }
    }

    private void a1(int i10) {
        n2 n2Var = this.f32581x;
        if (n2Var.f32639e != i10) {
            if (i10 != 2) {
                this.P = -9223372036854775807L;
            }
            this.f32581x = n2Var.h(i10);
        }
    }

    private void b0() {
        c2 q10 = this.f32576s.q();
        if (q10 == null) {
            return;
        }
        int i10 = 0;
        if (q10.j() != null && !this.B) {
            if (N()) {
                if (q10.j().f32339d || this.L >= q10.j().m()) {
                    ba.b0 o10 = q10.o();
                    c2 c10 = this.f32576s.c();
                    ba.b0 o11 = c10.o();
                    j3 j3Var = this.f32581x.f32635a;
                    o1(j3Var, c10.f32341f.f32367a, j3Var, q10.f32341f.f32367a, -9223372036854775807L);
                    if (c10.f32339d && c10.f32336a.l() != -9223372036854775807L) {
                        J0(c10.m());
                        return;
                    }
                    for (int i11 = 0; i11 < this.f32558a.length; i11++) {
                        boolean c11 = o10.c(i11);
                        boolean c12 = o11.c(i11);
                        if (c11 && !this.f32558a[i11].m()) {
                            boolean z10 = this.f32560c[i11].e() == -2;
                            z2 z2Var = o10.f5044b[i11];
                            z2 z2Var2 = o11.f5044b[i11];
                            if (!c12 || !z2Var2.equals(z2Var) || z10) {
                                K0(this.f32558a[i11], c10.m());
                            }
                        }
                    }
                }
            }
        } else if (q10.f32341f.f32375i || this.B) {
            while (true) {
                w2[] w2VarArr = this.f32558a;
                if (i10 >= w2VarArr.length) {
                    return;
                }
                w2 w2Var = w2VarArr[i10];
                i9.o0 o0Var = q10.f32338c[i10];
                if (o0Var != null && w2Var.f() == o0Var && w2Var.g()) {
                    long j10 = q10.f32341f.f32371e;
                    K0(w2Var, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : q10.l() + q10.f32341f.f32371e);
                }
                i10++;
            }
        }
    }

    private boolean b1() {
        c2 p10;
        c2 j10;
        return d1() && !this.B && (p10 = this.f32576s.p()) != null && (j10 = p10.j()) != null && this.L >= j10.m() && j10.f32342g;
    }

    private void c0() throws n {
        c2 q10 = this.f32576s.q();
        if (q10 == null || this.f32576s.p() == q10 || q10.f32342g || !p0()) {
            return;
        }
        r();
    }

    private boolean c1() {
        long y10;
        if (P()) {
            c2 j10 = this.f32576s.j();
            long D = D(j10.k());
            if (j10 == this.f32576s.p()) {
                y10 = j10.y(this.L);
            } else {
                y10 = j10.y(this.L) - j10.f32341f.f32368b;
            }
            return this.f32563f.h(y10, D, this.f32572o.c().f32664a);
        }
        return false;
    }

    private void d0() throws n {
        H(this.f32577t.i(), true);
    }

    private boolean d1() {
        n2 n2Var = this.f32581x;
        return n2Var.f32646l && n2Var.f32647m == 0;
    }

    public static /* synthetic */ Boolean e(l1 l1Var) {
        return l1Var.T();
    }

    private void e0(c cVar) throws n {
        this.f32582y.b(1);
        H(this.f32577t.v(cVar.f32589a, cVar.f32590b, cVar.f32591c, cVar.f32592d), false);
    }

    private boolean e1(boolean z10) {
        if (this.J == 0) {
            return R();
        }
        if (z10) {
            n2 n2Var = this.f32581x;
            if (n2Var.f32641g) {
                long c10 = f1(n2Var.f32635a, this.f32576s.p().f32341f.f32367a) ? this.f32578u.c() : -9223372036854775807L;
                c2 j10 = this.f32576s.j();
                return (j10.q() && j10.f32341f.f32375i) || (j10.f32341f.f32367a.b() && !j10.f32339d) || this.f32563f.c(C(), this.f32572o.c().f32664a, this.C, c10);
            }
            return true;
        }
        return false;
    }

    private void f0() {
        ba.q[] qVarArr;
        for (c2 p10 = this.f32576s.p(); p10 != null; p10 = p10.j()) {
            for (ba.q qVar : p10.o().f5045c) {
                if (qVar != null) {
                    qVar.h();
                }
            }
        }
    }

    private boolean f1(j3 j3Var, u.b bVar) {
        if (bVar.b() || j3Var.q()) {
            return false;
        }
        j3Var.n(j3Var.h(bVar.f31793a, this.f32569l).f32510c, this.f32568k);
        if (this.f32568k.g()) {
            j3.c cVar = this.f32568k;
            return cVar.f32527i && cVar.f32524f != -9223372036854775807L;
        }
        return false;
    }

    public static /* synthetic */ void g(l1 l1Var, r2 r2Var) {
        l1Var.U(r2Var);
    }

    private void g0(boolean z10) {
        ba.q[] qVarArr;
        for (c2 p10 = this.f32576s.p(); p10 != null; p10 = p10.j()) {
            for (ba.q qVar : p10.o().f5045c) {
                if (qVar != null) {
                    qVar.l(z10);
                }
            }
        }
    }

    private void g1() throws n {
        w2[] w2VarArr;
        this.C = false;
        this.f32572o.g();
        for (w2 w2Var : this.f32558a) {
            if (Q(w2Var)) {
                w2Var.start();
            }
        }
    }

    private void h0() {
        ba.q[] qVarArr;
        for (c2 p10 = this.f32576s.p(); p10 != null; p10 = p10.j()) {
            for (ba.q qVar : p10.o().f5045c) {
                if (qVar != null) {
                    qVar.s();
                }
            }
        }
    }

    private void i1(boolean z10, boolean z11) {
        r0(z10 || !this.G, false, true, false);
        this.f32582y.b(z11 ? 1 : 0);
        this.f32563f.e();
        a1(1);
    }

    private void j(b bVar, int i10) throws n {
        this.f32582y.b(1);
        i2 i2Var = this.f32577t;
        if (i10 == -1) {
            i10 = i2Var.q();
        }
        H(i2Var.f(i10, bVar.f32585a, bVar.f32586b), false);
    }

    private void j1() throws n {
        w2[] w2VarArr;
        this.f32572o.h();
        for (w2 w2Var : this.f32558a) {
            if (Q(w2Var)) {
                t(w2Var);
            }
        }
    }

    private void k() throws n {
        C0(true);
    }

    private void k0() {
        this.f32582y.b(1);
        r0(false, false, false, true);
        this.f32563f.onPrepared();
        a1(this.f32581x.f32635a.q() ? 4 : 2);
        this.f32577t.w(this.f32564g.c());
        this.f32565h.g(2);
    }

    private void k1() {
        c2 j10 = this.f32576s.j();
        boolean z10 = this.D || (j10 != null && j10.f32336a.c());
        n2 n2Var = this.f32581x;
        if (z10 != n2Var.f32641g) {
            this.f32581x = n2Var.a(z10);
        }
    }

    private void l(r2 r2Var) throws n {
        if (r2Var.j()) {
            return;
        }
        try {
            r2Var.g().k(r2Var.i(), r2Var.e());
        } finally {
            r2Var.k(true);
        }
    }

    private void l1(i9.y0 y0Var, ba.b0 b0Var) {
        this.f32563f.f(this.f32558a, y0Var, b0Var.f5045c);
    }

    private void m0() {
        r0(true, false, true, false);
        this.f32563f.g();
        a1(1);
        this.f32566i.quit();
        synchronized (this) {
            this.f32583z = true;
            notifyAll();
        }
    }

    private void m1() throws n, IOException {
        if (this.f32581x.f32635a.q() || !this.f32577t.s()) {
            return;
        }
        Z();
        b0();
        c0();
        a0();
    }

    private void n0(int i10, int i11, i9.q0 q0Var) throws n {
        this.f32582y.b(1);
        H(this.f32577t.A(i10, i11, q0Var), false);
    }

    private void n1() throws n {
        c2 p10 = this.f32576s.p();
        if (p10 == null) {
            return;
        }
        long l10 = p10.f32339d ? p10.f32336a.l() : -9223372036854775807L;
        if (l10 != -9223372036854775807L) {
            t0(l10);
            if (l10 != this.f32581x.f32653s) {
                n2 n2Var = this.f32581x;
                this.f32581x = L(n2Var.f32636b, l10, n2Var.f32637c, l10, true, 5);
            }
        } else {
            long i10 = this.f32572o.i(p10 != this.f32576s.q());
            this.L = i10;
            long y10 = p10.y(i10);
            Y(this.f32581x.f32653s, y10);
            this.f32581x.f32653s = y10;
        }
        this.f32581x.f32651q = this.f32576s.j().i();
        this.f32581x.f32652r = C();
        n2 n2Var2 = this.f32581x;
        if (n2Var2.f32646l && n2Var2.f32639e == 3 && f1(n2Var2.f32635a, n2Var2.f32636b) && this.f32581x.f32648n.f32664a == 1.0f) {
            float b10 = this.f32578u.b(w(), C());
            if (this.f32572o.c().f32664a != b10) {
                this.f32572o.b(this.f32581x.f32648n.b(b10));
                J(this.f32581x.f32648n, this.f32572o.c().f32664a, false, false);
            }
        }
    }

    private void o(w2 w2Var) throws n {
        if (Q(w2Var)) {
            this.f32572o.a(w2Var);
            t(w2Var);
            w2Var.disable();
            this.J--;
        }
    }

    private void o1(j3 j3Var, u.b bVar, j3 j3Var2, u.b bVar2, long j10) {
        if (!f1(j3Var, bVar)) {
            o2 o2Var = bVar.b() ? o2.f32663d : this.f32581x.f32648n;
            if (this.f32572o.c().equals(o2Var)) {
                return;
            }
            this.f32572o.b(o2Var);
            return;
        }
        j3Var.n(j3Var.h(bVar.f31793a, this.f32569l).f32510c, this.f32568k);
        this.f32578u.a((x1.g) ea.n0.j(this.f32568k.f32529k));
        if (j10 != -9223372036854775807L) {
            this.f32578u.e(y(j3Var, bVar.f31793a, j10));
            return;
        }
        if (ea.n0.c(j3Var2.q() ? null : j3Var2.n(j3Var2.h(bVar2.f31793a, this.f32569l).f32510c, this.f32568k).f32519a, this.f32568k.f32519a)) {
            return;
        }
        this.f32578u.e(-9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:257:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p() throws j8.n, java.io.IOException {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.l1.p():void");
    }

    private boolean p0() throws n {
        c2 q10 = this.f32576s.q();
        ba.b0 o10 = q10.o();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            w2[] w2VarArr = this.f32558a;
            if (i10 >= w2VarArr.length) {
                return !z10;
            }
            w2 w2Var = w2VarArr[i10];
            if (Q(w2Var)) {
                boolean z11 = w2Var.f() != q10.f32338c[i10];
                if (!o10.c(i10) || z11) {
                    if (!w2Var.m()) {
                        w2Var.j(x(o10.f5045c[i10]), q10.f32338c[i10], q10.m(), q10.l());
                    } else if (w2Var.d()) {
                        o(w2Var);
                    } else {
                        z10 = true;
                    }
                }
            }
            i10++;
        }
    }

    private void p1(float f10) {
        ba.q[] qVarArr;
        for (c2 p10 = this.f32576s.p(); p10 != null; p10 = p10.j()) {
            for (ba.q qVar : p10.o().f5045c) {
                if (qVar != null) {
                    qVar.f(f10);
                }
            }
        }
    }

    private void q(int i10, boolean z10) throws n {
        w2 w2Var = this.f32558a[i10];
        if (Q(w2Var)) {
            return;
        }
        c2 q10 = this.f32576s.q();
        boolean z11 = q10 == this.f32576s.p();
        ba.b0 o10 = q10.o();
        z2 z2Var = o10.f5044b[i10];
        p1[] x10 = x(o10.f5045c[i10]);
        boolean z12 = d1() && this.f32581x.f32639e == 3;
        boolean z13 = !z10 && z12;
        this.J++;
        this.f32559b.add(w2Var);
        w2Var.s(z2Var, x10, q10.f32338c[i10], this.L, z13, z11, q10.m(), q10.l());
        w2Var.k(11, new a());
        this.f32572o.d(w2Var);
        if (z12) {
            w2Var.start();
        }
    }

    private void q0() throws n {
        float f10 = this.f32572o.c().f32664a;
        c2 q10 = this.f32576s.q();
        boolean z10 = true;
        for (c2 p10 = this.f32576s.p(); p10 != null && p10.f32339d; p10 = p10.j()) {
            ba.b0 v10 = p10.v(f10, this.f32581x.f32635a);
            if (!v10.a(p10.o())) {
                if (z10) {
                    c2 p11 = this.f32576s.p();
                    boolean z11 = this.f32576s.z(p11);
                    boolean[] zArr = new boolean[this.f32558a.length];
                    long b10 = p11.b(v10, this.f32581x.f32653s, z11, zArr);
                    n2 n2Var = this.f32581x;
                    boolean z12 = (n2Var.f32639e == 4 || b10 == n2Var.f32653s) ? false : true;
                    n2 n2Var2 = this.f32581x;
                    this.f32581x = L(n2Var2.f32636b, b10, n2Var2.f32637c, n2Var2.f32638d, z12, 5);
                    if (z12) {
                        t0(b10);
                    }
                    boolean[] zArr2 = new boolean[this.f32558a.length];
                    int i10 = 0;
                    while (true) {
                        w2[] w2VarArr = this.f32558a;
                        if (i10 >= w2VarArr.length) {
                            break;
                        }
                        w2 w2Var = w2VarArr[i10];
                        zArr2[i10] = Q(w2Var);
                        i9.o0 o0Var = p11.f32338c[i10];
                        if (zArr2[i10]) {
                            if (o0Var != w2Var.f()) {
                                o(w2Var);
                            } else if (zArr[i10]) {
                                w2Var.u(this.L);
                            }
                        }
                        i10++;
                    }
                    s(zArr2);
                } else {
                    this.f32576s.z(p10);
                    if (p10.f32339d) {
                        p10.a(v10, Math.max(p10.f32341f.f32368b, p10.y(this.L)), false);
                    }
                }
                G(true);
                if (this.f32581x.f32639e != 4) {
                    V();
                    n1();
                    this.f32565h.g(2);
                    return;
                }
                return;
            }
            if (p10 == q10) {
                z10 = false;
            }
        }
    }

    private synchronized void q1(ib.q<Boolean> qVar, long j10) {
        long elapsedRealtime = this.f32574q.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!qVar.get().booleanValue() && j10 > 0) {
            try {
                this.f32574q.c();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = elapsedRealtime - this.f32574q.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private void r() throws n {
        s(new boolean[this.f32558a.length]);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void r0(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.l1.r0(boolean, boolean, boolean, boolean):void");
    }

    private void s(boolean[] zArr) throws n {
        c2 q10 = this.f32576s.q();
        ba.b0 o10 = q10.o();
        for (int i10 = 0; i10 < this.f32558a.length; i10++) {
            if (!o10.c(i10) && this.f32559b.remove(this.f32558a[i10])) {
                this.f32558a[i10].reset();
            }
        }
        for (int i11 = 0; i11 < this.f32558a.length; i11++) {
            if (o10.c(i11)) {
                q(i11, zArr[i11]);
            }
        }
        q10.f32342g = true;
    }

    private void s0() {
        c2 p10 = this.f32576s.p();
        this.B = p10 != null && p10.f32341f.f32374h && this.A;
    }

    private void t(w2 w2Var) throws n {
        if (w2Var.getState() == 2) {
            w2Var.stop();
        }
    }

    private void t0(long j10) throws n {
        w2[] w2VarArr;
        c2 p10 = this.f32576s.p();
        long z10 = p10 == null ? j10 + 1000000000000L : p10.z(j10);
        this.L = z10;
        this.f32572o.e(z10);
        for (w2 w2Var : this.f32558a) {
            if (Q(w2Var)) {
                w2Var.u(this.L);
            }
        }
        f0();
    }

    private static void u0(j3 j3Var, d dVar, j3.c cVar, j3.b bVar) {
        int i10 = j3Var.n(j3Var.h(dVar.f32596d, bVar).f32510c, cVar).f32534p;
        Object obj = j3Var.g(i10, bVar, true).f32509b;
        long j10 = bVar.f32511d;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private jb.s<Metadata> v(ExoTrackSelection[] exoTrackSelectionArr) {
        s.a aVar = new s.a();
        boolean z10 = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.d(0).f32707j;
                if (metadata == null) {
                    aVar.a(new Metadata(new Metadata.Entry[0]));
                } else {
                    aVar.a(metadata);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.h() : jb.s.t();
    }

    private static boolean v0(d dVar, j3 j3Var, j3 j3Var2, int i10, boolean z10, j3.c cVar, j3.b bVar) {
        Object obj = dVar.f32596d;
        if (obj == null) {
            Pair<Object, Long> y02 = y0(j3Var, new h(dVar.f32593a.h(), dVar.f32593a.d(), dVar.f32593a.f() == Long.MIN_VALUE ? -9223372036854775807L : ea.n0.C0(dVar.f32593a.f())), false, i10, z10, cVar, bVar);
            if (y02 == null) {
                return false;
            }
            dVar.b(j3Var.b(y02.first), ((Long) y02.second).longValue(), y02.first);
            if (dVar.f32593a.f() == Long.MIN_VALUE) {
                u0(j3Var, dVar, cVar, bVar);
            }
            return true;
        }
        int b10 = j3Var.b(obj);
        if (b10 == -1) {
            return false;
        }
        if (dVar.f32593a.f() == Long.MIN_VALUE) {
            u0(j3Var, dVar, cVar, bVar);
            return true;
        }
        dVar.f32594b = b10;
        j3Var2.h(dVar.f32596d, bVar);
        if (bVar.f32513f && j3Var2.n(bVar.f32510c, cVar).f32533o == j3Var2.b(dVar.f32596d)) {
            Pair<Object, Long> j10 = j3Var.j(cVar, bVar, j3Var.h(dVar.f32596d, bVar).f32510c, dVar.f32595c + bVar.p());
            dVar.b(j3Var.b(j10.first), ((Long) j10.second).longValue(), j10.first);
        }
        return true;
    }

    private long w() {
        n2 n2Var = this.f32581x;
        return y(n2Var.f32635a, n2Var.f32636b.f31793a, n2Var.f32653s);
    }

    private void w0(j3 j3Var, j3 j3Var2) {
        if (j3Var.q() && j3Var2.q()) {
            return;
        }
        for (int size = this.f32573p.size() - 1; size >= 0; size--) {
            if (!v0(this.f32573p.get(size), j3Var, j3Var2, this.E, this.F, this.f32568k, this.f32569l)) {
                this.f32573p.get(size).f32593a.k(false);
                this.f32573p.remove(size);
            }
        }
        Collections.sort(this.f32573p);
    }

    private static p1[] x(ba.q qVar) {
        int length = qVar != null ? qVar.length() : 0;
        p1[] p1VarArr = new p1[length];
        for (int i10 = 0; i10 < length; i10++) {
            p1VarArr[i10] = qVar.d(i10);
        }
        return p1VarArr;
    }

    private static g x0(j3 j3Var, n2 n2Var, h hVar, f2 f2Var, int i10, boolean z10, j3.c cVar, j3.b bVar) {
        long j10;
        int i11;
        u.b bVar2;
        long j11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        boolean z14;
        f2 f2Var2;
        long j12;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        boolean z17;
        if (j3Var.q()) {
            return new g(n2.l(), 0L, -9223372036854775807L, false, true, false);
        }
        u.b bVar3 = n2Var.f32636b;
        Object obj = bVar3.f31793a;
        boolean S = S(n2Var, bVar);
        if (!n2Var.f32636b.b() && !S) {
            j10 = n2Var.f32653s;
        } else {
            j10 = n2Var.f32637c;
        }
        long j13 = j10;
        boolean z18 = true;
        if (hVar != null) {
            i11 = -1;
            Pair<Object, Long> y02 = y0(j3Var, hVar, true, i10, z10, cVar, bVar);
            if (y02 == null) {
                i16 = j3Var.a(z10);
                j11 = j13;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f32612c == -9223372036854775807L) {
                    i16 = j3Var.h(y02.first, bVar).f32510c;
                    j11 = j13;
                    z15 = false;
                } else {
                    obj = y02.first;
                    j11 = ((Long) y02.second).longValue();
                    z15 = true;
                    i16 = -1;
                }
                z16 = n2Var.f32639e == 4;
                z17 = false;
            }
            z13 = z15;
            z11 = z16;
            z12 = z17;
            i12 = i16;
            bVar2 = bVar3;
        } else {
            i11 = -1;
            if (n2Var.f32635a.q()) {
                i13 = j3Var.a(z10);
            } else if (j3Var.b(obj) == -1) {
                Object z02 = z0(cVar, bVar, i10, z10, obj, n2Var.f32635a, j3Var);
                if (z02 == null) {
                    i14 = j3Var.a(z10);
                    z14 = true;
                } else {
                    i14 = j3Var.h(z02, bVar).f32510c;
                    z14 = false;
                }
                i12 = i14;
                z12 = z14;
                j11 = j13;
                bVar2 = bVar3;
                z11 = false;
                z13 = false;
            } else if (j13 == -9223372036854775807L) {
                i13 = j3Var.h(obj, bVar).f32510c;
            } else if (S) {
                bVar2 = bVar3;
                n2Var.f32635a.h(bVar2.f31793a, bVar);
                if (n2Var.f32635a.n(bVar.f32510c, cVar).f32533o == n2Var.f32635a.b(bVar2.f31793a)) {
                    Pair<Object, Long> j14 = j3Var.j(cVar, bVar, j3Var.h(obj, bVar).f32510c, j13 + bVar.p());
                    obj = j14.first;
                    j11 = ((Long) j14.second).longValue();
                } else {
                    j11 = j13;
                }
                i12 = -1;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                bVar2 = bVar3;
                j11 = j13;
                i12 = -1;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            i12 = i13;
            j11 = j13;
            bVar2 = bVar3;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (i12 != i11) {
            Pair<Object, Long> j15 = j3Var.j(cVar, bVar, i12, -9223372036854775807L);
            obj = j15.first;
            j11 = ((Long) j15.second).longValue();
            f2Var2 = f2Var;
            j12 = -9223372036854775807L;
        } else {
            f2Var2 = f2Var;
            j12 = j11;
        }
        u.b B = f2Var2.B(j3Var, obj, j11);
        int i17 = B.f31797e;
        z18 = (!bVar2.f31793a.equals(obj) || bVar2.b() || B.b() || !(i17 == i11 || ((i15 = bVar2.f31797e) != i11 && i17 >= i15))) ? false : false;
        Object obj2 = bVar2;
        boolean O = O(S, bVar2, j13, B, j3Var.h(obj, bVar), j12);
        if (z18 || O) {
            B = obj2;
        }
        if (B.b()) {
            if (B.equals(obj2)) {
                j11 = n2Var.f32653s;
            } else {
                j3Var.h(B.f31793a, bVar);
                j11 = B.f31795c == bVar.m(B.f31794b) ? bVar.i() : 0L;
            }
        }
        return new g(B, j11, j12, z11, z12, z13);
    }

    private long y(j3 j3Var, Object obj, long j10) {
        j3Var.n(j3Var.h(obj, this.f32569l).f32510c, this.f32568k);
        j3.c cVar = this.f32568k;
        if (cVar.f32524f != -9223372036854775807L && cVar.g()) {
            j3.c cVar2 = this.f32568k;
            if (cVar2.f32527i) {
                return ea.n0.C0(cVar2.c() - this.f32568k.f32524f) - (j10 + this.f32569l.p());
            }
        }
        return -9223372036854775807L;
    }

    private static Pair<Object, Long> y0(j3 j3Var, h hVar, boolean z10, int i10, boolean z11, j3.c cVar, j3.b bVar) {
        Pair<Object, Long> j10;
        Object z02;
        j3 j3Var2 = hVar.f32610a;
        if (j3Var.q()) {
            return null;
        }
        j3 j3Var3 = j3Var2.q() ? j3Var : j3Var2;
        try {
            j10 = j3Var3.j(cVar, bVar, hVar.f32611b, hVar.f32612c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (j3Var.equals(j3Var3)) {
            return j10;
        }
        if (j3Var.b(j10.first) != -1) {
            return (j3Var3.h(j10.first, bVar).f32513f && j3Var3.n(bVar.f32510c, cVar).f32533o == j3Var3.b(j10.first)) ? j3Var.j(cVar, bVar, j3Var.h(j10.first, bVar).f32510c, hVar.f32612c) : j10;
        }
        if (z10 && (z02 = z0(cVar, bVar, i10, z11, j10.first, j3Var3, j3Var)) != null) {
            return j3Var.j(cVar, bVar, j3Var.h(z02, bVar).f32510c, -9223372036854775807L);
        }
        return null;
    }

    private long z() {
        c2 q10 = this.f32576s.q();
        if (q10 == null) {
            return 0L;
        }
        long l10 = q10.l();
        if (!q10.f32339d) {
            return l10;
        }
        int i10 = 0;
        while (true) {
            w2[] w2VarArr = this.f32558a;
            if (i10 >= w2VarArr.length) {
                return l10;
            }
            if (Q(w2VarArr[i10]) && this.f32558a[i10].f() == q10.f32338c[i10]) {
                long t10 = this.f32558a[i10].t();
                if (t10 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l10 = Math.max(t10, l10);
            }
            i10++;
        }
    }

    public static Object z0(j3.c cVar, j3.b bVar, int i10, boolean z10, Object obj, j3 j3Var, j3 j3Var2) {
        int b10 = j3Var.b(obj);
        int i11 = j3Var.i();
        int i12 = b10;
        int i13 = -1;
        for (int i14 = 0; i14 < i11 && i13 == -1; i14++) {
            i12 = j3Var.d(i12, bVar, cVar, i10, z10);
            if (i12 == -1) {
                break;
            }
            i13 = j3Var2.b(j3Var.m(i12));
        }
        if (i13 == -1) {
            return null;
        }
        return j3Var2.m(i13);
    }

    public Looper B() {
        return this.f32567j;
    }

    public void B0(j3 j3Var, int i10, long j10) {
        this.f32565h.d(3, new h(j3Var, i10, j10)).a();
    }

    public void N0(List<i2.c> list, int i10, long j10, i9.q0 q0Var) {
        this.f32565h.d(17, new b(list, q0Var, i10, j10, null)).a();
    }

    public void Q0(boolean z10, int i10) {
        this.f32565h.f(1, z10 ? 1 : 0, i10).a();
    }

    public void S0(o2 o2Var) {
        this.f32565h.d(4, o2Var).a();
    }

    public void U0(int i10) {
        this.f32565h.f(11, i10, 0).a();
    }

    public void X0(boolean z10) {
        this.f32565h.f(12, z10 ? 1 : 0, 0).a();
    }

    @Override // j8.r2.a
    public synchronized void a(r2 r2Var) {
        if (!this.f32583z && this.f32566i.isAlive()) {
            this.f32565h.d(14, r2Var).a();
            return;
        }
        ea.r.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        r2Var.k(false);
    }

    @Override // ba.a0.a
    public void b() {
        this.f32565h.g(10);
    }

    @Override // j8.i2.d
    public void c() {
        this.f32565h.g(22);
    }

    @Override // j8.k.a
    public void d(o2 o2Var) {
        this.f32565h.d(16, o2Var).a();
    }

    @Override // i9.r.a
    public void f(i9.r rVar) {
        this.f32565h.d(8, rVar).a();
    }

    public void h1() {
        this.f32565h.a(6).a();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        c2 q10;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    k0();
                    break;
                case 1:
                    R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    p();
                    break;
                case 3:
                    D0((h) message.obj);
                    break;
                case 4:
                    T0((o2) message.obj);
                    break;
                case 5:
                    W0((b3) message.obj);
                    break;
                case 6:
                    i1(false, true);
                    break;
                case 7:
                    m0();
                    return true;
                case 8:
                    I((i9.r) message.obj);
                    break;
                case 9:
                    E((i9.r) message.obj);
                    break;
                case 10:
                    q0();
                    break;
                case 11:
                    V0(message.arg1);
                    break;
                case 12:
                    Y0(message.arg1 != 0);
                    break;
                case 13:
                    L0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    G0((r2) message.obj);
                    break;
                case 15:
                    I0((r2) message.obj);
                    break;
                case 16:
                    K((o2) message.obj, false);
                    break;
                case 17:
                    M0((b) message.obj);
                    break;
                case 18:
                    j((b) message.obj, message.arg1);
                    break;
                case 19:
                    e0((c) message.obj);
                    break;
                case 20:
                    n0(message.arg1, message.arg2, (i9.q0) message.obj);
                    break;
                case 21:
                    Z0((i9.q0) message.obj);
                    break;
                case 22:
                    d0();
                    break;
                case 23:
                    P0(message.arg1 != 0);
                    break;
                case 24:
                    O0(message.arg1 == 1);
                    break;
                case 25:
                    k();
                    break;
                default:
                    return false;
            }
        } catch (j.a e10) {
            F(e10, e10.f21111a);
        } catch (da.m e11) {
            F(e11, e11.f29211a);
        } catch (i9.b e12) {
            F(e12, 1002);
        } catch (j2 e13) {
            int i11 = e13.f32505b;
            if (i11 == 1) {
                i10 = e13.f32504a ? 3001 : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else if (i11 == 4) {
                i10 = e13.f32504a ? 3002 : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
            }
            F(e13, i10);
        } catch (n e14) {
            e = e14;
            if (e.f32626c == 1 && (q10 = this.f32576s.q()) != null) {
                e = e.b(q10.f32341f.f32367a);
            }
            if (e.f32632i && this.O == null) {
                ea.r.i("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.O = e;
                ea.n nVar = this.f32565h;
                nVar.h(nVar.d(25, e));
            } else {
                n nVar2 = this.O;
                if (nVar2 != null) {
                    nVar2.addSuppressed(e);
                    e = this.O;
                }
                ea.r.d("ExoPlayerImplInternal", "Playback error", e);
                i1(true, false);
                this.f32581x = this.f32581x.f(e);
            }
        } catch (IOException e15) {
            F(e15, 2000);
        } catch (RuntimeException e16) {
            if ((e16 instanceof IllegalStateException) || (e16 instanceof IllegalArgumentException)) {
                i10 = IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL;
            }
            n f10 = n.f(e16, i10);
            ea.r.d("ExoPlayerImplInternal", "Playback error", f10);
            i1(true, false);
            this.f32581x = this.f32581x.f(f10);
        }
        W();
        return true;
    }

    @Override // i9.p0.a
    /* renamed from: i0 */
    public void m(i9.r rVar) {
        this.f32565h.d(9, rVar).a();
    }

    public void j0() {
        this.f32565h.a(0).a();
    }

    public synchronized boolean l0() {
        if (!this.f32583z && this.f32566i.isAlive()) {
            this.f32565h.g(7);
            q1(new ib.q() { // from class: j8.j1
                @Override // ib.q
                public final Object get() {
                    return l1.e(l1.this);
                }
            }, this.f32579v);
            return this.f32583z;
        }
        return true;
    }

    public void o0(int i10, int i11, i9.q0 q0Var) {
        this.f32565h.c(20, i10, i11, q0Var).a();
    }

    public void u(long j10) {
    }
}
