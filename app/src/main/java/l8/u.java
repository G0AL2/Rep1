package l8;

import android.media.AudioTrack;
import android.os.SystemClock;
import ea.n0;
import java.lang.reflect.Method;

/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: classes2.dex */
final class u {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a  reason: collision with root package name */
    private final a f33916a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f33917b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f33918c;

    /* renamed from: d  reason: collision with root package name */
    private int f33919d;

    /* renamed from: e  reason: collision with root package name */
    private int f33920e;

    /* renamed from: f  reason: collision with root package name */
    private t f33921f;

    /* renamed from: g  reason: collision with root package name */
    private int f33922g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33923h;

    /* renamed from: i  reason: collision with root package name */
    private long f33924i;

    /* renamed from: j  reason: collision with root package name */
    private float f33925j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f33926k;

    /* renamed from: l  reason: collision with root package name */
    private long f33927l;

    /* renamed from: m  reason: collision with root package name */
    private long f33928m;

    /* renamed from: n  reason: collision with root package name */
    private Method f33929n;

    /* renamed from: o  reason: collision with root package name */
    private long f33930o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f33931p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f33932q;

    /* renamed from: r  reason: collision with root package name */
    private long f33933r;

    /* renamed from: s  reason: collision with root package name */
    private long f33934s;

    /* renamed from: t  reason: collision with root package name */
    private long f33935t;

    /* renamed from: u  reason: collision with root package name */
    private long f33936u;

    /* renamed from: v  reason: collision with root package name */
    private int f33937v;

    /* renamed from: w  reason: collision with root package name */
    private int f33938w;

    /* renamed from: x  reason: collision with root package name */
    private long f33939x;

    /* renamed from: y  reason: collision with root package name */
    private long f33940y;

    /* renamed from: z  reason: collision with root package name */
    private long f33941z;

    /* compiled from: AudioTrackPositionTracker.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public u(a aVar) {
        this.f33916a = (a) ea.a.e(aVar);
        if (n0.f29709a >= 18) {
            try {
                this.f33929n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f33917b = new long[10];
    }

    private boolean a() {
        return this.f33923h && ((AudioTrack) ea.a.e(this.f33918c)).getPlayState() == 2 && f() == 0;
    }

    private long b(long j10) {
        return (j10 * 1000000) / this.f33922g;
    }

    private long f() {
        AudioTrack audioTrack = (AudioTrack) ea.a.e(this.f33918c);
        if (this.f33939x != -9223372036854775807L) {
            return Math.min(this.A, this.f33941z + ((((SystemClock.elapsedRealtime() * 1000) - this.f33939x) * this.f33922g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f33923h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f33936u = this.f33934s;
            }
            playbackHeadPosition += this.f33936u;
        }
        if (n0.f29709a <= 29) {
            if (playbackHeadPosition == 0 && this.f33934s > 0 && playState == 3) {
                if (this.f33940y == -9223372036854775807L) {
                    this.f33940y = SystemClock.elapsedRealtime();
                }
                return this.f33934s;
            }
            this.f33940y = -9223372036854775807L;
        }
        if (this.f33934s > playbackHeadPosition) {
            this.f33935t++;
        }
        this.f33934s = playbackHeadPosition;
        return playbackHeadPosition + (this.f33935t << 32);
    }

    private long g() {
        return b(f());
    }

    private void m(long j10, long j11) {
        t tVar = (t) ea.a.e(this.f33921f);
        if (tVar.e(j10)) {
            long c10 = tVar.c();
            long b10 = tVar.b();
            if (Math.abs(c10 - j10) > 5000000) {
                this.f33916a.e(b10, c10, j10, j11);
                tVar.f();
            } else if (Math.abs(b(b10) - j11) > 5000000) {
                this.f33916a.d(b10, c10, j10, j11);
                tVar.f();
            } else {
                tVar.a();
            }
        }
    }

    private void n() {
        long g10 = g();
        if (g10 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f33928m >= 30000) {
            long[] jArr = this.f33917b;
            int i10 = this.f33937v;
            jArr[i10] = g10 - nanoTime;
            this.f33937v = (i10 + 1) % 10;
            int i11 = this.f33938w;
            if (i11 < 10) {
                this.f33938w = i11 + 1;
            }
            this.f33928m = nanoTime;
            this.f33927l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f33938w;
                if (i12 >= i13) {
                    break;
                }
                this.f33927l += this.f33917b[i12] / i13;
                i12++;
            }
        }
        if (this.f33923h) {
            return;
        }
        m(nanoTime, g10);
        o(nanoTime);
    }

    private void o(long j10) {
        Method method;
        if (!this.f33932q || (method = this.f33929n) == null || j10 - this.f33933r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) n0.j((Integer) method.invoke(ea.a.e(this.f33918c), new Object[0]))).intValue() * 1000) - this.f33924i;
            this.f33930o = intValue;
            long max = Math.max(intValue, 0L);
            this.f33930o = max;
            if (max > 5000000) {
                this.f33916a.b(max);
                this.f33930o = 0L;
            }
        } catch (Exception unused) {
            this.f33929n = null;
        }
        this.f33933r = j10;
    }

    private static boolean p(int i10) {
        return n0.f29709a < 23 && (i10 == 5 || i10 == 6);
    }

    private void s() {
        this.f33927l = 0L;
        this.f33938w = 0;
        this.f33937v = 0;
        this.f33928m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f33926k = false;
    }

    public int c(long j10) {
        return this.f33920e - ((int) (j10 - (f() * this.f33919d)));
    }

    public long d(boolean z10) {
        long j10;
        if (((AudioTrack) ea.a.e(this.f33918c)).getPlayState() == 3) {
            n();
        }
        long nanoTime = System.nanoTime() / 1000;
        t tVar = (t) ea.a.e(this.f33921f);
        boolean d10 = tVar.d();
        if (d10) {
            j10 = b(tVar.b()) + n0.b0(nanoTime - tVar.c(), this.f33925j);
        } else {
            if (this.f33938w == 0) {
                j10 = g();
            } else {
                j10 = this.f33927l + nanoTime;
            }
            if (!z10) {
                j10 = Math.max(0L, j10 - this.f33930o);
            }
        }
        if (this.D != d10) {
            this.F = this.C;
            this.E = this.B;
        }
        long j11 = nanoTime - this.F;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (this.E + n0.b0(j11, this.f33925j)))) / 1000;
        }
        if (!this.f33926k) {
            long j13 = this.B;
            if (j10 > j13) {
                this.f33926k = true;
                this.f33916a.c(System.currentTimeMillis() - n0.Z0(n0.g0(n0.Z0(j10 - j13), this.f33925j)));
            }
        }
        this.C = nanoTime;
        this.B = j10;
        this.D = d10;
        return j10;
    }

    public long e(long j10) {
        return n0.Z0(b(j10 - f()));
    }

    public void h(long j10) {
        this.f33941z = f();
        this.f33939x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean i(long j10) {
        return j10 > f() || a();
    }

    public boolean j() {
        return ((AudioTrack) ea.a.e(this.f33918c)).getPlayState() == 3;
    }

    public boolean k(long j10) {
        return this.f33940y != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.f33940y >= 200;
    }

    public boolean l(long j10) {
        int playState = ((AudioTrack) ea.a.e(this.f33918c)).getPlayState();
        if (this.f33923h) {
            if (playState == 2) {
                this.f33931p = false;
                return false;
            } else if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z10 = this.f33931p;
        boolean i10 = i(j10);
        this.f33931p = i10;
        if (z10 && !i10 && playState != 1) {
            this.f33916a.a(this.f33920e, n0.Z0(this.f33924i));
        }
        return true;
    }

    public boolean q() {
        s();
        if (this.f33939x == -9223372036854775807L) {
            ((t) ea.a.e(this.f33921f)).g();
            return true;
        }
        return false;
    }

    public void r() {
        s();
        this.f33918c = null;
        this.f33921f = null;
    }

    public void t(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f33918c = audioTrack;
        this.f33919d = i11;
        this.f33920e = i12;
        this.f33921f = new t(audioTrack);
        this.f33922g = audioTrack.getSampleRate();
        this.f33923h = z10 && p(i10);
        boolean u02 = n0.u0(i10);
        this.f33932q = u02;
        this.f33924i = u02 ? b(i12 / i11) : -9223372036854775807L;
        this.f33934s = 0L;
        this.f33935t = 0L;
        this.f33936u = 0L;
        this.f33931p = false;
        this.f33939x = -9223372036854775807L;
        this.f33940y = -9223372036854775807L;
        this.f33933r = 0L;
        this.f33930o = 0L;
        this.f33925j = 1.0f;
    }

    public void u(float f10) {
        this.f33925j = f10;
        t tVar = this.f33921f;
        if (tVar != null) {
            tVar.g();
        }
    }

    public void v() {
        ((t) ea.a.e(this.f33921f)).g();
    }
}
