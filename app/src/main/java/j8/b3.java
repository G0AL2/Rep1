package j8;

/* compiled from: SeekParameters.java */
/* loaded from: classes2.dex */
public final class b3 {

    /* renamed from: c  reason: collision with root package name */
    public static final b3 f32328c;

    /* renamed from: d  reason: collision with root package name */
    public static final b3 f32329d;

    /* renamed from: a  reason: collision with root package name */
    public final long f32330a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32331b;

    static {
        b3 b3Var = new b3(0L, 0L);
        f32328c = b3Var;
        new b3(Long.MAX_VALUE, Long.MAX_VALUE);
        new b3(Long.MAX_VALUE, 0L);
        new b3(0L, Long.MAX_VALUE);
        f32329d = b3Var;
    }

    public b3(long j10, long j11) {
        ea.a.a(j10 >= 0);
        ea.a.a(j11 >= 0);
        this.f32330a = j10;
        this.f32331b = j11;
    }

    public long a(long j10, long j11, long j12) {
        long j13 = this.f32330a;
        if (j13 == 0 && this.f32331b == 0) {
            return j10;
        }
        long U0 = ea.n0.U0(j10, j13, Long.MIN_VALUE);
        long b10 = ea.n0.b(j10, this.f32331b, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = U0 <= j11 && j11 <= b10;
        z10 = (U0 > j12 || j12 > b10) ? false : false;
        return (z11 && z10) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z11 ? j11 : z10 ? j12 : U0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b3.class != obj.getClass()) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return this.f32330a == b3Var.f32330a && this.f32331b == b3Var.f32331b;
    }

    public int hashCode() {
        return (((int) this.f32330a) * 31) + ((int) this.f32331b);
    }
}
