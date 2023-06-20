package d2;

/* compiled from: GradientColor.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f28933a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f28934b;

    public d(float[] fArr, int[] iArr) {
        this.f28933a = fArr;
        this.f28934b = iArr;
    }

    public int[] a() {
        return this.f28934b;
    }

    public float[] b() {
        return this.f28933a;
    }

    public int c() {
        return this.f28934b.length;
    }

    public void d(d dVar, d dVar2, float f10) {
        if (dVar.f28934b.length == dVar2.f28934b.length) {
            for (int i10 = 0; i10 < dVar.f28934b.length; i10++) {
                this.f28933a[i10] = i2.g.i(dVar.f28933a[i10], dVar2.f28933a[i10], f10);
                this.f28934b[i10] = i2.b.c(f10, dVar.f28934b[i10], dVar2.f28934b[i10]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f28934b.length + " vs " + dVar2.f28934b.length + ")");
    }
}
