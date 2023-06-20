package z6;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: OpacityAnimation.java */
/* loaded from: classes.dex */
class l extends Animation {

    /* renamed from: a  reason: collision with root package name */
    private final View f40094a;

    /* renamed from: b  reason: collision with root package name */
    private final float f40095b;

    /* renamed from: c  reason: collision with root package name */
    private final float f40096c;

    /* compiled from: OpacityAnimation.java */
    /* loaded from: classes.dex */
    static class a implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f40097a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f40098b = false;

        public a(View view) {
            this.f40097a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f40098b) {
                this.f40097a.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f40097a.hasOverlappingRendering() && this.f40097a.getLayerType() == 0) {
                this.f40098b = true;
                this.f40097a.setLayerType(2, null);
            }
        }
    }

    public l(View view, float f10, float f11) {
        this.f40094a = view;
        this.f40095b = f10;
        this.f40096c = f11 - f10;
        setAnimationListener(new a(view));
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f10, Transformation transformation) {
        this.f40094a.setAlpha(this.f40095b + (this.f40096c * f10));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return false;
    }
}
