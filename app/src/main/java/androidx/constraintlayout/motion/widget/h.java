package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: MotionHelper.java */
/* loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.c implements j.d {

    /* renamed from: j  reason: collision with root package name */
    private boolean f1931j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1932k;

    /* renamed from: l  reason: collision with root package name */
    private float f1933l;

    /* renamed from: m  reason: collision with root package name */
    protected View[] f1934m;

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void a(j jVar, int i10, int i11, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void b(j jVar, int i10) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    public void c(j jVar, int i10, int i11) {
    }

    public float getProgress() {
        return this.f1933l;
    }

    @Override // androidx.constraintlayout.widget.c
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.k.K5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == androidx.constraintlayout.widget.k.M5) {
                    this.f1931j = obtainStyledAttributes.getBoolean(index, this.f1931j);
                } else if (index == androidx.constraintlayout.widget.k.L5) {
                    this.f1932k = obtainStyledAttributes.getBoolean(index, this.f1932k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f1933l = f10;
        int i10 = 0;
        if (this.f2084b > 0) {
            this.f1934m = l((ConstraintLayout) getParent());
            while (i10 < this.f2084b) {
                x(this.f1934m[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof h)) {
                x(childAt, f10);
            }
            i10++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.f1932k;
    }

    public boolean v() {
        return this.f1931j;
    }

    public void w(Canvas canvas) {
    }

    public void x(View view, float f10) {
    }
}
