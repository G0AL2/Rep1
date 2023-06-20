package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableApi14.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback, a0.b, a0.a {

    /* renamed from: g  reason: collision with root package name */
    static final PorterDuff.Mode f2625g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    private int f2626a;

    /* renamed from: b  reason: collision with root package name */
    private PorterDuff.Mode f2627b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2628c;

    /* renamed from: d  reason: collision with root package name */
    d f2629d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2630e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f2631f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(d dVar, Resources resources) {
        this.f2629d = dVar;
        e(resources);
    }

    private d d() {
        return new d(this.f2629d);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        d dVar = this.f2629d;
        if (dVar == null || (constantState = dVar.f2634b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (c()) {
            d dVar = this.f2629d;
            ColorStateList colorStateList = dVar.f2635c;
            PorterDuff.Mode mode = dVar.f2636d;
            if (colorStateList != null && mode != null) {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f2628c || colorForState != this.f2626a || mode != this.f2627b) {
                    setColorFilter(colorForState, mode);
                    this.f2626a = colorForState;
                    this.f2627b = mode;
                    this.f2628c = true;
                    return true;
                }
            } else {
                this.f2628c = false;
                clearColorFilter();
            }
            return false;
        }
        return false;
    }

    @Override // a0.b
    public final Drawable a() {
        return this.f2631f;
    }

    @Override // a0.b
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f2631f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2631f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            d dVar = this.f2629d;
            if (dVar != null) {
                dVar.f2634b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2631f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        d dVar = this.f2629d;
        return changingConfigurations | (dVar != null ? dVar.getChangingConfigurations() : 0) | this.f2631f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        d dVar = this.f2629d;
        if (dVar == null || !dVar.a()) {
            return null;
        }
        this.f2629d.f2633a = getChangingConfigurations();
        return this.f2629d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2631f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2631f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2631f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.f(this.f2631f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2631f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2631f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2631f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2631f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2631f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2631f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.h(this.f2631f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        d dVar;
        ColorStateList colorStateList = (!c() || (dVar = this.f2629d) == null) ? null : dVar.f2635c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2631f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2631f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2630e && super.mutate() == this) {
            this.f2629d = d();
            Drawable drawable = this.f2631f;
            if (drawable != null) {
                drawable.mutate();
            }
            d dVar = this.f2629d;
            if (dVar != null) {
                Drawable drawable2 = this.f2631f;
                dVar.f2634b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2630e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2631f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return a.m(this.f2631f, i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f2631f.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f2631f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        a.j(this.f2631f, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f2631f.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2631f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f2631f.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f2631f.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f2631f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintList(ColorStateList colorStateList) {
        this.f2629d.f2635c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2629d.f2636d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f2631f.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Drawable drawable) {
        this.f2629d = d();
        b(drawable);
    }
}
