package fa;

import java.util.Arrays;

/* compiled from: FixedFrameRateEstimator.java */
/* loaded from: classes2.dex */
final class d {

    /* renamed from: c  reason: collision with root package name */
    private boolean f30210c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30211d;

    /* renamed from: f  reason: collision with root package name */
    private int f30213f;

    /* renamed from: a  reason: collision with root package name */
    private a f30208a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f30209b = new a();

    /* renamed from: e  reason: collision with root package name */
    private long f30212e = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FixedFrameRateEstimator.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f30214a;

        /* renamed from: b  reason: collision with root package name */
        private long f30215b;

        /* renamed from: c  reason: collision with root package name */
        private long f30216c;

        /* renamed from: d  reason: collision with root package name */
        private long f30217d;

        /* renamed from: e  reason: collision with root package name */
        private long f30218e;

        /* renamed from: f  reason: collision with root package name */
        private long f30219f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f30220g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f30221h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f30218e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f30219f / j10;
        }

        public long b() {
            return this.f30219f;
        }

        public boolean d() {
            long j10 = this.f30217d;
            if (j10 == 0) {
                return false;
            }
            return this.f30220g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f30217d > 15 && this.f30221h == 0;
        }

        public void f(long j10) {
            long j11 = this.f30217d;
            if (j11 == 0) {
                this.f30214a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f30214a;
                this.f30215b = j12;
                this.f30219f = j12;
                this.f30218e = 1L;
            } else {
                long j13 = j10 - this.f30216c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f30215b) <= 1000000) {
                    this.f30218e++;
                    this.f30219f += j13;
                    boolean[] zArr = this.f30220g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        this.f30221h--;
                    }
                } else {
                    boolean[] zArr2 = this.f30220g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        this.f30221h++;
                    }
                }
            }
            this.f30217d++;
            this.f30216c = j10;
        }

        public void g() {
            this.f30217d = 0L;
            this.f30218e = 0L;
            this.f30219f = 0L;
            this.f30221h = 0;
            Arrays.fill(this.f30220g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f30208a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f30208a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f30213f;
    }

    public long d() {
        if (e()) {
            return this.f30208a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f30208a.e();
    }

    public void f(long j10) {
        this.f30208a.f(j10);
        if (this.f30208a.e() && !this.f30211d) {
            this.f30210c = false;
        } else if (this.f30212e != -9223372036854775807L) {
            if (!this.f30210c || this.f30209b.d()) {
                this.f30209b.g();
                this.f30209b.f(this.f30212e);
            }
            this.f30210c = true;
            this.f30209b.f(j10);
        }
        if (this.f30210c && this.f30209b.e()) {
            a aVar = this.f30208a;
            this.f30208a = this.f30209b;
            this.f30209b = aVar;
            this.f30210c = false;
            this.f30211d = false;
        }
        this.f30212e = j10;
        this.f30213f = this.f30208a.e() ? 0 : this.f30213f + 1;
    }

    public void g() {
        this.f30208a.g();
        this.f30209b.g();
        this.f30210c = false;
        this.f30212e = -9223372036854775807L;
        this.f30213f = 0;
    }
}
