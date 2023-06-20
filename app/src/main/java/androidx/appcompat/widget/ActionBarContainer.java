package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1162a;

    /* renamed from: b  reason: collision with root package name */
    private View f1163b;

    /* renamed from: c  reason: collision with root package name */
    private View f1164c;

    /* renamed from: d  reason: collision with root package name */
    private View f1165d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f1166e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f1167f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f1168g;

    /* renamed from: h  reason: collision with root package name */
    boolean f1169h;

    /* renamed from: i  reason: collision with root package name */
    boolean f1170i;

    /* renamed from: j  reason: collision with root package name */
    private int f1171j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.z.u0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f28795a);
        this.f1166e = obtainStyledAttributes.getDrawable(d.j.f28800b);
        this.f1167f = obtainStyledAttributes.getDrawable(d.j.f28810d);
        this.f1171j = obtainStyledAttributes.getDimensionPixelSize(d.j.f28840j, -1);
        boolean z10 = true;
        if (getId() == d.f.H) {
            this.f1169h = true;
            this.f1168g = obtainStyledAttributes.getDrawable(d.j.f28805c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1169h ? this.f1166e != null || this.f1167f != null : this.f1168g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1166e;
        if (drawable != null && drawable.isStateful()) {
            this.f1166e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1167f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1167f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1168g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1168g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1163b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1166e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1167f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1168g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1164c = findViewById(d.f.f28731a);
        this.f1165d = findViewById(d.f.f28736f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1162a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f1163b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i10, (measuredHeight - view.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f1169h) {
            Drawable drawable2 = this.f1168g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.f1166e != null) {
                if (this.f1164c.getVisibility() == 0) {
                    this.f1166e.setBounds(this.f1164c.getLeft(), this.f1164c.getTop(), this.f1164c.getRight(), this.f1164c.getBottom());
                } else {
                    View view2 = this.f1165d;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f1166e.setBounds(this.f1165d.getLeft(), this.f1165d.getTop(), this.f1165d.getRight(), this.f1165d.getBottom());
                    } else {
                        this.f1166e.setBounds(0, 0, 0, 0);
                    }
                }
                z12 = true;
            }
            this.f1170i = z13;
            if (!z13 || (drawable = this.f1167f) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int a10;
        int i12;
        if (this.f1164c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f1171j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i10, i11);
        if (this.f1164c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f1163b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!b(this.f1164c)) {
            a10 = a(this.f1164c);
        } else {
            a10 = !b(this.f1165d) ? a(this.f1165d) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a10 + a(this.f1163b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1166e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1166e);
        }
        this.f1166e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1164c;
            if (view != null) {
                this.f1166e.setBounds(view.getLeft(), this.f1164c.getTop(), this.f1164c.getRight(), this.f1164c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1169h ? this.f1166e != null || this.f1167f != null : this.f1168g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1168g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1168g);
        }
        this.f1168g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1169h && (drawable2 = this.f1168g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1169h ? !(this.f1166e != null || this.f1167f != null) : this.f1168g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1167f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1167f);
        }
        this.f1167f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1170i && (drawable2 = this.f1167f) != null) {
                drawable2.setBounds(this.f1163b.getLeft(), this.f1163b.getTop(), this.f1163b.getRight(), this.f1163b.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f1169h ? this.f1166e != null || this.f1167f != null : this.f1168g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(r0 r0Var) {
        View view = this.f1163b;
        if (view != null) {
            removeView(view);
        }
        this.f1163b = r0Var;
        if (r0Var != null) {
            addView(r0Var);
            ViewGroup.LayoutParams layoutParams = r0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            r0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f1162a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f1166e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f1167f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f1168g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1166e && !this.f1169h) || (drawable == this.f1167f && this.f1170i) || ((drawable == this.f1168g && this.f1169h) || super.verifyDrawable(drawable));
    }
}
