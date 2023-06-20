package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.i0;
import java.util.ArrayList;

/* compiled from: FragmentContainerView.java */
/* loaded from: classes.dex */
public final class g extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<View> f3147a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<View> f3148b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f3149c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3150d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.f3150d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q0.c.f35768e);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(q0.c.f35769f) : classAttribute;
        String string = obtainStyledAttributes.getString(q0.c.f35770g);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment h02 = fragmentManager.h0(id2);
        if (classAttribute != null && h02 == null) {
            if (id2 <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a10 = fragmentManager.r0().a(context.getClassLoader(), classAttribute);
            a10.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.m().q(true).d(this, a10, string).j();
        }
        fragmentManager.V0(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f3148b;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f3147a == null) {
            this.f3147a = new ArrayList<>();
        }
        this.f3147a.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.A0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        if (FragmentManager.A0(view) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        i0 c02;
        i0 u10 = i0.u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3149c;
        if (onApplyWindowInsetsListener != null) {
            c02 = i0.u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            c02 = androidx.core.view.z.c0(this, u10);
        }
        if (!c02.n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                androidx.core.view.z.h(getChildAt(i10), c02);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f3150d && this.f3147a != null) {
            for (int i10 = 0; i10 < this.f3147a.size(); i10++) {
                super.drawChild(canvas, this.f3147a.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f3150d || (arrayList = this.f3147a) == null || arrayList.size() <= 0 || !this.f3147a.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3148b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3147a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3150d = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f3150d = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3149c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3148b == null) {
                this.f3148b = new ArrayList<>();
            }
            this.f3148b.add(view);
        }
        super.startViewTransition(view);
    }
}
