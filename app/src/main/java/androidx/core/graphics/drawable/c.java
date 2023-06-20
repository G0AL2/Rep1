package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableApi21.java */
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: h  reason: collision with root package name */
    private static Method f2632h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f2632h == null) {
            try {
                f2632h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override // androidx.core.graphics.drawable.b
    protected boolean c() {
        if (Build.VERSION.SDK_INT == 21) {
            Drawable drawable = this.f2631f;
            return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2631f.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2631f.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2631f;
        if (drawable != null && (method = f2632h) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e10);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f2631f.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f2631f.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.core.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.b, android.graphics.drawable.Drawable, a0.a
    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.f2631f.setTint(i10);
        }
    }

    @Override // androidx.core.graphics.drawable.b, android.graphics.drawable.Drawable, a0.a
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2631f.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.b, android.graphics.drawable.Drawable, a0.a
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f2631f.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(d dVar, Resources resources) {
        super(dVar, resources);
        g();
    }
}
