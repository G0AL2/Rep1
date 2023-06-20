package j8;

import android.os.SystemClock;
import j8.x1;

/* compiled from: DefaultLivePlaybackSpeedControl.java */
/* loaded from: classes2.dex */
public final class i implements u1 {

    /* renamed from: a  reason: collision with root package name */
    private final float f32434a;

    /* renamed from: b  reason: collision with root package name */
    private final float f32435b;

    /* renamed from: c  reason: collision with root package name */
    private final long f32436c;

    /* renamed from: d  reason: collision with root package name */
    private final float f32437d;

    /* renamed from: e  reason: collision with root package name */
    private final long f32438e;

    /* renamed from: f  reason: collision with root package name */
    private final long f32439f;

    /* renamed from: g  reason: collision with root package name */
    private final float f32440g;

    /* renamed from: h  reason: collision with root package name */
    private long f32441h;

    /* renamed from: i  reason: collision with root package name */
    private long f32442i;

    /* renamed from: j  reason: collision with root package name */
    private long f32443j;

    /* renamed from: k  reason: collision with root package name */
    private long f32444k;

    /* renamed from: l  reason: collision with root package name */
    private long f32445l;

    /* renamed from: m  reason: collision with root package name */
    private long f32446m;

    /* renamed from: n  reason: collision with root package name */
    private float f32447n;

    /* renamed from: o  reason: collision with root package name */
    private float f32448o;

    /* renamed from: p  reason: collision with root package name */
    private float f32449p;

    /* renamed from: q  reason: collision with root package name */
    private long f32450q;

    /* renamed from: r  reason: collision with root package name */
    private long f32451r;

    /* renamed from: s  reason: collision with root package name */
    private long f32452s;

    /* compiled from: DefaultLivePlaybackSpeedControl.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f32453a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f32454b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f32455c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f32456d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f32457e = ea.n0.C0(20);

        /* renamed from: f  reason: collision with root package name */
        private long f32458f = ea.n0.C0(500);

        /* renamed from: g  reason: collision with root package name */
        private float f32459g = 0.999f;

        public i a() {
            return new i(this.f32453a, this.f32454b, this.f32455c, this.f32456d, this.f32457e, this.f32458f, this.f32459g);
        }
    }

    private void f(long j10) {
        long j11 = this.f32451r + (this.f32452s * 3);
        if (this.f32446m > j11) {
            float C0 = (float) ea.n0.C0(this.f32436c);
            this.f32446m = mb.f.b(j11, this.f32443j, this.f32446m - (((this.f32449p - 1.0f) * C0) + ((this.f32447n - 1.0f) * C0)));
            return;
        }
        long r10 = ea.n0.r(j10 - (Math.max(0.0f, this.f32449p - 1.0f) / this.f32437d), this.f32446m, j11);
        this.f32446m = r10;
        long j12 = this.f32445l;
        if (j12 == -9223372036854775807L || r10 <= j12) {
            return;
        }
        this.f32446m = j12;
    }

    private void g() {
        long j10 = this.f32441h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f32442i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f32444k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f32445l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f32443j == j10) {
            return;
        }
        this.f32443j = j10;
        this.f32446m = j10;
        this.f32451r = -9223372036854775807L;
        this.f32452s = -9223372036854775807L;
        this.f32450q = -9223372036854775807L;
    }

    private static long h(long j10, long j11, float f10) {
        return (((float) j10) * f10) + ((1.0f - f10) * ((float) j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f32451r;
        if (j13 == -9223372036854775807L) {
            this.f32451r = j12;
            this.f32452s = 0L;
            return;
        }
        long max = Math.max(j12, h(j13, j12, this.f32440g));
        this.f32451r = max;
        this.f32452s = h(this.f32452s, Math.abs(j12 - max), this.f32440g);
    }

    @Override // j8.u1
    public void a(x1.g gVar) {
        this.f32441h = ea.n0.C0(gVar.f32866a);
        this.f32444k = ea.n0.C0(gVar.f32867b);
        this.f32445l = ea.n0.C0(gVar.f32868c);
        float f10 = gVar.f32869d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f32434a;
        }
        this.f32448o = f10;
        float f11 = gVar.f32870e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f32435b;
        }
        this.f32447n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f32441h = -9223372036854775807L;
        }
        g();
    }

    @Override // j8.u1
    public float b(long j10, long j11) {
        if (this.f32441h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f32450q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f32450q < this.f32436c) {
            return this.f32449p;
        }
        this.f32450q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f32446m;
        if (Math.abs(j12) < this.f32438e) {
            this.f32449p = 1.0f;
        } else {
            this.f32449p = ea.n0.p((this.f32437d * ((float) j12)) + 1.0f, this.f32448o, this.f32447n);
        }
        return this.f32449p;
    }

    @Override // j8.u1
    public long c() {
        return this.f32446m;
    }

    @Override // j8.u1
    public void d() {
        long j10 = this.f32446m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f32439f;
        this.f32446m = j11;
        long j12 = this.f32445l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f32446m = j12;
        }
        this.f32450q = -9223372036854775807L;
    }

    @Override // j8.u1
    public void e(long j10) {
        this.f32442i = j10;
        g();
    }

    private i(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f32434a = f10;
        this.f32435b = f11;
        this.f32436c = j10;
        this.f32437d = f12;
        this.f32438e = j11;
        this.f32439f = j12;
        this.f32440g = f13;
        this.f32441h = -9223372036854775807L;
        this.f32442i = -9223372036854775807L;
        this.f32444k = -9223372036854775807L;
        this.f32445l = -9223372036854775807L;
        this.f32448o = f10;
        this.f32447n = f11;
        this.f32449p = 1.0f;
        this.f32450q = -9223372036854775807L;
        this.f32443j = -9223372036854775807L;
        this.f32446m = -9223372036854775807L;
        this.f32451r = -9223372036854775807L;
        this.f32452s = -9223372036854775807L;
    }
}
