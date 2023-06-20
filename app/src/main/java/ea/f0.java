package ea;

import j8.o2;

/* compiled from: StandaloneMediaClock.java */
/* loaded from: classes2.dex */
public final class f0 implements t {

    /* renamed from: a  reason: collision with root package name */
    private final c f29669a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29670b;

    /* renamed from: c  reason: collision with root package name */
    private long f29671c;

    /* renamed from: d  reason: collision with root package name */
    private long f29672d;

    /* renamed from: e  reason: collision with root package name */
    private o2 f29673e = o2.f32663d;

    public f0(c cVar) {
        this.f29669a = cVar;
    }

    public void a(long j10) {
        this.f29671c = j10;
        if (this.f29670b) {
            this.f29672d = this.f29669a.elapsedRealtime();
        }
    }

    @Override // ea.t
    public void b(o2 o2Var) {
        if (this.f29670b) {
            a(o());
        }
        this.f29673e = o2Var;
    }

    @Override // ea.t
    public o2 c() {
        return this.f29673e;
    }

    public void d() {
        if (this.f29670b) {
            return;
        }
        this.f29672d = this.f29669a.elapsedRealtime();
        this.f29670b = true;
    }

    public void e() {
        if (this.f29670b) {
            a(o());
            this.f29670b = false;
        }
    }

    @Override // ea.t
    public long o() {
        long a10;
        long j10 = this.f29671c;
        if (this.f29670b) {
            long elapsedRealtime = this.f29669a.elapsedRealtime() - this.f29672d;
            o2 o2Var = this.f29673e;
            if (o2Var.f32664a == 1.0f) {
                a10 = n0.C0(elapsedRealtime);
            } else {
                a10 = o2Var.a(elapsedRealtime);
            }
            return j10 + a10;
        }
        return j10;
    }
}
