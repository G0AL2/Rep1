package fa;

/* compiled from: VideoSize.java */
/* loaded from: classes2.dex */
public final class v implements j8.g {

    /* renamed from: e  reason: collision with root package name */
    public static final v f30291e = new v(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f30292a;

    /* renamed from: b  reason: collision with root package name */
    public final int f30293b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30294c;

    /* renamed from: d  reason: collision with root package name */
    public final float f30295d;

    public v(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return this.f30292a == vVar.f30292a && this.f30293b == vVar.f30293b && this.f30294c == vVar.f30294c && this.f30295d == vVar.f30295d;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f30292a) * 31) + this.f30293b) * 31) + this.f30294c) * 31) + Float.floatToRawIntBits(this.f30295d);
    }

    public v(int i10, int i11, int i12, float f10) {
        this.f30292a = i10;
        this.f30293b = i11;
        this.f30294c = i12;
        this.f30295d = f10;
    }
}
