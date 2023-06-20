package com.bytedance.sdk.openadsdk.b.b.b;

/* compiled from: VideoLogHelperModel.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private long f11059a;

    /* renamed from: b  reason: collision with root package name */
    private String f11060b;

    /* renamed from: c  reason: collision with root package name */
    private int f11061c;

    /* renamed from: d  reason: collision with root package name */
    private l3.c f11062d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f11063e;

    /* compiled from: VideoLogHelperModel.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: g  reason: collision with root package name */
        private int f11070g;

        /* renamed from: h  reason: collision with root package name */
        private int f11071h;

        /* renamed from: i  reason: collision with root package name */
        private int f11072i;

        /* renamed from: j  reason: collision with root package name */
        private int f11073j;

        /* renamed from: k  reason: collision with root package name */
        private int f11074k;

        /* renamed from: a  reason: collision with root package name */
        private long f11064a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f11065b = 0;

        /* renamed from: c  reason: collision with root package name */
        private long f11066c = 0;

        /* renamed from: d  reason: collision with root package name */
        private boolean f11067d = false;

        /* renamed from: e  reason: collision with root package name */
        private int f11068e = 0;

        /* renamed from: f  reason: collision with root package name */
        private int f11069f = 0;

        /* renamed from: l  reason: collision with root package name */
        private boolean f11075l = false;

        public long a() {
            return this.f11064a;
        }

        public long b() {
            return this.f11065b;
        }

        public long c() {
            return this.f11066c;
        }

        public int d() {
            return this.f11068e;
        }

        public int e() {
            return this.f11069f;
        }

        public int f() {
            return this.f11070g;
        }

        public int g() {
            return this.f11071h;
        }

        public int h() {
            long j10 = this.f11066c;
            if (j10 <= 0) {
                return 0;
            }
            return Math.min((int) ((this.f11064a * 100) / j10), 100);
        }

        public int i() {
            return this.f11072i;
        }

        public int j() {
            return this.f11073j;
        }

        public int k() {
            return this.f11074k;
        }

        public boolean l() {
            return this.f11075l;
        }

        public boolean m() {
            return this.f11067d;
        }

        public void a(long j10) {
            this.f11064a = j10;
        }

        public void b(long j10) {
            this.f11065b = j10;
        }

        public void c(long j10) {
            this.f11066c = j10;
        }

        public void d(int i10) {
            this.f11071h = i10;
        }

        public void e(int i10) {
            this.f11072i = i10;
        }

        public void f(int i10) {
            this.f11074k = i10;
        }

        public void a(int i10) {
            this.f11068e = i10;
        }

        public void b(int i10) {
            this.f11069f = i10;
        }

        public void c(int i10) {
            this.f11070g = i10;
        }

        public void a(boolean z10) {
            this.f11067d = z10;
        }
    }

    public o(long j10, String str, int i10, l3.c cVar, com.bytedance.sdk.openadsdk.core.e.n nVar) {
        this.f11059a = j10;
        this.f11060b = str;
        this.f11061c = i10;
        this.f11062d = cVar;
        this.f11063e = nVar;
    }

    public long a() {
        return this.f11059a;
    }

    public String b() {
        return this.f11060b;
    }

    public int c() {
        return this.f11061c;
    }

    public l3.c d() {
        return this.f11062d;
    }

    public com.bytedance.sdk.openadsdk.core.e.n e() {
        return this.f11063e;
    }
}
