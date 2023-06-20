package j2;

/* compiled from: ScaleXY.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private float f32205a;

    /* renamed from: b  reason: collision with root package name */
    private float f32206b;

    public d(float f10, float f11) {
        this.f32205a = f10;
        this.f32206b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f32205a == f10 && this.f32206b == f11;
    }

    public float b() {
        return this.f32205a;
    }

    public float c() {
        return this.f32206b;
    }

    public void d(float f10, float f11) {
        this.f32205a = f10;
        this.f32206b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
