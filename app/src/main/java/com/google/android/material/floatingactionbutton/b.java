package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes2.dex */
public class b extends a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FloatingActionButton floatingActionButton, wa.b bVar) {
        super(floatingActionButton, bVar);
    }

    private Animator e0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f22420x, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f22420x, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(a.E);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void A() {
        b0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void C(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f22420x.isEnabled()) {
                this.f22420x.setElevation(this.f22403g);
                if (this.f22420x.isPressed()) {
                    this.f22420x.setTranslationZ(this.f22405i);
                    return;
                } else if (!this.f22420x.isFocused() && !this.f22420x.isHovered()) {
                    this.f22420x.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f22420x.setTranslationZ(this.f22404h);
                    return;
                }
            }
            this.f22420x.setElevation(0.0f);
            this.f22420x.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void D(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f22420x.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(a.F, e0(f10, f12));
            stateListAnimator.addState(a.G, e0(f10, f11));
            stateListAnimator.addState(a.H, e0(f10, f11));
            stateListAnimator.addState(a.I, e0(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f22420x, "elevation", f10).setDuration(0L));
            if (i10 >= 22 && i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f22420x;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f22420x, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a.E);
            stateListAnimator.addState(a.J, animatorSet);
            stateListAnimator.addState(a.K, e0(0.0f, 0.0f));
            this.f22420x.setStateListAnimator(stateListAnimator);
        }
        if (V()) {
            b0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean I() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void R(ColorStateList colorStateList) {
        Drawable drawable = this.f22399c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(va.b.d(colorStateList));
        } else {
            super.R(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean V() {
        return this.f22421y.c() || !X();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void Z() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float m() {
        return this.f22420x.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void r(Rect rect) {
        if (this.f22421y.c()) {
            super.r(rect);
        } else if (!X()) {
            int sizeDimension = (this.f22406j - this.f22420x.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void y() {
    }
}
