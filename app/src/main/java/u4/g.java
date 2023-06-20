package u4;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: ForwardingDrawable.java */
/* loaded from: classes.dex */
public class g extends Drawable implements Drawable.Callback, s, r, c {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f37466a;

    /* renamed from: b  reason: collision with root package name */
    private final d f37467b = new d();

    /* renamed from: c  reason: collision with root package name */
    protected s f37468c;

    static {
        new Matrix();
    }

    public g(Drawable drawable) {
        this.f37466a = drawable;
        e.d(drawable, this, this);
    }

    @Override // u4.r
    public void c(s sVar) {
        this.f37468c = sVar;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f37466a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // u4.s
    public void e(Matrix matrix) {
        t(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f37466a;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f37466a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f37466a;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f37466a;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f37466a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f37466a;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    @Override // u4.c
    public Drawable h(Drawable drawable) {
        return u(drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f37466a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f37466a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // u4.s
    public void o(RectF rectF) {
        s sVar = this.f37468c;
        if (sVar != null) {
            sVar.o(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f37466a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f37466a;
        if (drawable == null) {
            return super.onLevelChange(i10);
        }
        return drawable.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f37466a;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    @Override // u4.c
    public Drawable r() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f37467b.b(i10);
        Drawable drawable = this.f37466a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37467b.c(colorFilter);
        Drawable drawable = this.f37466a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f37467b.d(z10);
        Drawable drawable = this.f37466a;
        if (drawable != null) {
            drawable.setDither(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f37467b.e(z10);
        Drawable drawable = this.f37466a;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f37466a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f37466a;
        return drawable == null ? visible : drawable.setVisible(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t(Matrix matrix) {
        s sVar = this.f37468c;
        if (sVar != null) {
            sVar.e(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable u(Drawable drawable) {
        Drawable v10 = v(drawable);
        invalidateSelf();
        return v10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    protected Drawable v(Drawable drawable) {
        Drawable drawable2 = this.f37466a;
        e.d(drawable2, null, null);
        e.d(drawable, null, null);
        e.e(drawable, this.f37467b);
        e.a(drawable, this);
        e.d(drawable, this, this);
        this.f37466a = drawable;
        return drawable2;
    }
}
