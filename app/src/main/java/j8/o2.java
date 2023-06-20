package j8;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: PlaybackParameters.java */
/* loaded from: classes2.dex */
public final class o2 implements g {

    /* renamed from: d  reason: collision with root package name */
    public static final o2 f32663d = new o2(1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f32664a;

    /* renamed from: b  reason: collision with root package name */
    public final float f32665b;

    /* renamed from: c  reason: collision with root package name */
    private final int f32666c;

    public o2(float f10) {
        this(f10, 1.0f);
    }

    public long a(long j10) {
        return j10 * this.f32666c;
    }

    public o2 b(float f10) {
        return new o2(f10, this.f32665b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o2.class != obj.getClass()) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return this.f32664a == o2Var.f32664a && this.f32665b == o2Var.f32665b;
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToRawIntBits(this.f32664a)) * 31) + Float.floatToRawIntBits(this.f32665b);
    }

    public String toString() {
        return ea.n0.C("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f32664a), Float.valueOf(this.f32665b));
    }

    public o2(float f10, float f11) {
        ea.a.a(f10 > 0.0f);
        ea.a.a(f11 > 0.0f);
        this.f32664a = f10;
        this.f32665b = f11;
        this.f32666c = Math.round(f10 * 1000.0f);
    }
}
