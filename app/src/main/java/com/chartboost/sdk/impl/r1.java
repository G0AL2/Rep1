package com.chartboost.sdk.impl;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class r1 extends Animation {

    /* renamed from: a  reason: collision with root package name */
    private final float f14283a;

    /* renamed from: b  reason: collision with root package name */
    private final float f14284b;

    /* renamed from: c  reason: collision with root package name */
    private final float f14285c;

    /* renamed from: d  reason: collision with root package name */
    private final float f14286d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14287e;

    /* renamed from: f  reason: collision with root package name */
    private Camera f14288f;

    public r1(float f10, float f11, float f12, float f13, boolean z10) {
        this.f14287e = true;
        this.f14283a = f10;
        this.f14284b = f11;
        this.f14285c = f12;
        this.f14286d = f13;
        this.f14287e = z10;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation transformation) {
        float f11 = this.f14283a;
        float f12 = f11 + ((this.f14284b - f11) * f10);
        Camera camera = this.f14288f;
        Matrix matrix = transformation.getMatrix();
        camera.save();
        if (this.f14287e) {
            camera.rotateY(f12);
        } else {
            camera.rotateX(f12);
        }
        camera.getMatrix(matrix);
        camera.restore();
        matrix.preTranslate(-this.f14285c, -this.f14286d);
        matrix.postTranslate(this.f14285c, this.f14286d);
    }

    @Override // android.view.animation.Animation
    public void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        this.f14288f = new Camera();
    }
}
