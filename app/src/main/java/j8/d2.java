package j8;

import com.ironsource.mediationsdk.logger.IronSourceError;
import i9.u;

/* compiled from: MediaPeriodInfo.java */
/* loaded from: classes2.dex */
final class d2 {

    /* renamed from: a  reason: collision with root package name */
    public final u.b f32367a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32368b;

    /* renamed from: c  reason: collision with root package name */
    public final long f32369c;

    /* renamed from: d  reason: collision with root package name */
    public final long f32370d;

    /* renamed from: e  reason: collision with root package name */
    public final long f32371e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f32372f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f32373g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f32374h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f32375i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d2(u.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        ea.a.a(!z13 || z11);
        ea.a.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        ea.a.a(z14);
        this.f32367a = bVar;
        this.f32368b = j10;
        this.f32369c = j11;
        this.f32370d = j12;
        this.f32371e = j13;
        this.f32372f = z10;
        this.f32373g = z11;
        this.f32374h = z12;
        this.f32375i = z13;
    }

    public d2 a(long j10) {
        return j10 == this.f32369c ? this : new d2(this.f32367a, this.f32368b, j10, this.f32370d, this.f32371e, this.f32372f, this.f32373g, this.f32374h, this.f32375i);
    }

    public d2 b(long j10) {
        return j10 == this.f32368b ? this : new d2(this.f32367a, j10, this.f32369c, this.f32370d, this.f32371e, this.f32372f, this.f32373g, this.f32374h, this.f32375i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d2.class != obj.getClass()) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f32368b == d2Var.f32368b && this.f32369c == d2Var.f32369c && this.f32370d == d2Var.f32370d && this.f32371e == d2Var.f32371e && this.f32372f == d2Var.f32372f && this.f32373g == d2Var.f32373g && this.f32374h == d2Var.f32374h && this.f32375i == d2Var.f32375i && ea.n0.c(this.f32367a, d2Var.f32367a);
    }

    public int hashCode() {
        return ((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f32367a.hashCode()) * 31) + ((int) this.f32368b)) * 31) + ((int) this.f32369c)) * 31) + ((int) this.f32370d)) * 31) + ((int) this.f32371e)) * 31) + (this.f32372f ? 1 : 0)) * 31) + (this.f32373g ? 1 : 0)) * 31) + (this.f32374h ? 1 : 0)) * 31) + (this.f32375i ? 1 : 0);
    }
}
