package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public abstract class m extends c {

    /* renamed from: j  reason: collision with root package name */
    private boolean f2420j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f2421k;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.c
    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.c
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.U0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.W0) {
                    this.f2420j = true;
                } else if (index == k.f2234b1) {
                    this.f2421k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2420j || this.f2421k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i10 = 0; i10 < this.f2084b; i10++) {
                    View h10 = constraintLayout.h(this.f2083a[i10]);
                    if (h10 != null) {
                        if (this.f2420j) {
                            h10.setVisibility(visibility);
                        }
                        if (this.f2421k && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                            h10.setTranslationZ(h10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        g();
    }

    public void t(s.k kVar, int i10, int i11) {
    }
}
