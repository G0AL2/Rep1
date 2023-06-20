package z6;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PositionAndSizeAnimation.java */
/* loaded from: classes.dex */
class m extends Animation implements j {

    /* renamed from: a  reason: collision with root package name */
    private final View f40099a;

    /* renamed from: b  reason: collision with root package name */
    private float f40100b;

    /* renamed from: c  reason: collision with root package name */
    private float f40101c;

    /* renamed from: d  reason: collision with root package name */
    private float f40102d;

    /* renamed from: e  reason: collision with root package name */
    private float f40103e;

    /* renamed from: f  reason: collision with root package name */
    private int f40104f;

    /* renamed from: g  reason: collision with root package name */
    private int f40105g;

    /* renamed from: h  reason: collision with root package name */
    private int f40106h;

    /* renamed from: i  reason: collision with root package name */
    private int f40107i;

    public m(View view, int i10, int i11, int i12, int i13) {
        this.f40099a = view;
        b(i10, i11, i12, i13);
    }

    private void b(int i10, int i11, int i12, int i13) {
        this.f40100b = this.f40099a.getX() - this.f40099a.getTranslationX();
        this.f40101c = this.f40099a.getY() - this.f40099a.getTranslationY();
        this.f40104f = this.f40099a.getWidth();
        int height = this.f40099a.getHeight();
        this.f40105g = height;
        this.f40102d = i10 - this.f40100b;
        this.f40103e = i11 - this.f40101c;
        this.f40106h = i12 - this.f40104f;
        this.f40107i = i13 - height;
    }

    @Override // z6.j
    public void a(int i10, int i11, int i12, int i13) {
        b(i10, i11, i12, i13);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation transformation) {
        float f11 = this.f40100b + (this.f40102d * f10);
        float f12 = this.f40101c + (this.f40103e * f10);
        this.f40099a.layout(Math.round(f11), Math.round(f12), Math.round(f11 + this.f40104f + (this.f40106h * f10)), Math.round(f12 + this.f40105g + (this.f40107i * f10)));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
