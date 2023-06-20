package i2;

/* compiled from: MeanCalculator.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private float f31524a;

    /* renamed from: b  reason: collision with root package name */
    private int f31525b;

    public void a(float f10) {
        float f11 = this.f31524a + f10;
        this.f31524a = f11;
        int i10 = this.f31525b + 1;
        this.f31525b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f31524a = f11 / 2.0f;
            this.f31525b = i10 / 2;
        }
    }
}
