package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable.java */
/* loaded from: classes.dex */
class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    final ActionBarContainer f1382a;

    public b(ActionBarContainer actionBarContainer) {
        this.f1382a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1382a;
        if (actionBarContainer.f1169h) {
            Drawable drawable = actionBarContainer.f1168g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1166e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1382a;
        Drawable drawable3 = actionBarContainer2.f1167f;
        if (drawable3 == null || !actionBarContainer2.f1170i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1382a;
        if (actionBarContainer.f1169h) {
            Drawable drawable = actionBarContainer.f1168g;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1166e;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
