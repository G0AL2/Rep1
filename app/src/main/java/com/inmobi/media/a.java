package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: AnimationController.java */
/* loaded from: classes3.dex */
final class a {

    /* compiled from: AnimationController.java */
    /* renamed from: com.inmobi.media.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0327a extends Animation {

        /* renamed from: c  reason: collision with root package name */
        private final float f24431c;

        /* renamed from: d  reason: collision with root package name */
        private final float f24432d;

        /* renamed from: g  reason: collision with root package name */
        private Camera f24435g;

        /* renamed from: a  reason: collision with root package name */
        private final float f24429a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        private final float f24430b = 90.0f;

        /* renamed from: e  reason: collision with root package name */
        private final float f24433e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f24434f = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0327a(float f10, float f11) {
            this.f24431c = f10;
            this.f24432d = f11;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f10, Transformation transformation) {
            float f11 = this.f24429a;
            float f12 = f11 + ((this.f24430b - f11) * f10);
            float f13 = this.f24431c;
            float f14 = this.f24432d;
            Camera camera = this.f24435g;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            if (this.f24434f) {
                camera.translate(0.0f, 0.0f, this.f24433e * f10);
            } else {
                camera.translate(0.0f, 0.0f, this.f24433e * (1.0f - f10));
            }
            camera.rotateX(f12);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f13, -f14);
            matrix.postTranslate(f13, f14);
        }

        @Override // android.view.animation.Animation
        public final void initialize(int i10, int i11, int i12, int i13) {
            super.initialize(i10, i11, i12, i13);
            this.f24435g = new Camera();
        }
    }

    /* compiled from: AnimationController.java */
    /* loaded from: classes3.dex */
    static class b extends Animation {

        /* renamed from: c  reason: collision with root package name */
        private final float f24438c;

        /* renamed from: d  reason: collision with root package name */
        private final float f24439d;

        /* renamed from: g  reason: collision with root package name */
        private Camera f24442g;

        /* renamed from: a  reason: collision with root package name */
        private final float f24436a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        private final float f24437b = 90.0f;

        /* renamed from: e  reason: collision with root package name */
        private final float f24440e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f24441f = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(float f10, float f11) {
            this.f24438c = f10;
            this.f24439d = f11;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f10, Transformation transformation) {
            float f11 = this.f24436a;
            float f12 = f11 + ((this.f24437b - f11) * f10);
            float f13 = this.f24438c;
            float f14 = this.f24439d;
            Camera camera = this.f24442g;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            if (this.f24441f) {
                camera.translate(0.0f, 0.0f, this.f24440e * f10);
            } else {
                camera.translate(0.0f, 0.0f, this.f24440e * (1.0f - f10));
            }
            camera.rotateY(f12);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f13, -f14);
            matrix.postTranslate(f13, f14);
        }

        @Override // android.view.animation.Animation
        public final void initialize(int i10, int i11, int i12, int i13) {
            super.initialize(i10, i11, i12, i13);
            this.f24442g = new Camera();
        }
    }
}
