package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public class f extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    e f2211a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public e getConstraintSet() {
        if (this.f2211a == null) {
            this.f2211a = new e();
        }
        this.f2211a.g(this);
        return this.f2211a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float E0;

        /* renamed from: s0  reason: collision with root package name */
        public float f2212s0;

        /* renamed from: t0  reason: collision with root package name */
        public boolean f2213t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f2214u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f2215v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f2216w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f2217x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f2218y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f2219z0;

        public a(int i10, int i11) {
            super(i10, i11);
            this.f2212s0 = 1.0f;
            this.f2213t0 = false;
            this.f2214u0 = 0.0f;
            this.f2215v0 = 0.0f;
            this.f2216w0 = 0.0f;
            this.f2217x0 = 0.0f;
            this.f2218y0 = 1.0f;
            this.f2219z0 = 1.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            this.E0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2212s0 = 1.0f;
            this.f2213t0 = false;
            this.f2214u0 = 0.0f;
            this.f2215v0 = 0.0f;
            this.f2216w0 = 0.0f;
            this.f2217x0 = 0.0f;
            this.f2218y0 = 1.0f;
            this.f2219z0 = 1.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            this.E0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Q3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.R3) {
                    this.f2212s0 = obtainStyledAttributes.getFloat(index, this.f2212s0);
                } else if (index == k.f2245c4) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2214u0 = obtainStyledAttributes.getFloat(index, this.f2214u0);
                        this.f2213t0 = true;
                    }
                } else if (index == k.Z3) {
                    this.f2216w0 = obtainStyledAttributes.getFloat(index, this.f2216w0);
                } else if (index == k.f2229a4) {
                    this.f2217x0 = obtainStyledAttributes.getFloat(index, this.f2217x0);
                } else if (index == k.Y3) {
                    this.f2215v0 = obtainStyledAttributes.getFloat(index, this.f2215v0);
                } else if (index == k.W3) {
                    this.f2218y0 = obtainStyledAttributes.getFloat(index, this.f2218y0);
                } else if (index == k.X3) {
                    this.f2219z0 = obtainStyledAttributes.getFloat(index, this.f2219z0);
                } else if (index == k.S3) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == k.T3) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == k.U3) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == k.V3) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                } else if (index == k.f2237b4 && Build.VERSION.SDK_INT >= 21) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
