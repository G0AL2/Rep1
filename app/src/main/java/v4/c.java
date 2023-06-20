package v4;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import u4.g;
import u4.t;
import u4.u;

/* compiled from: RootDrawable.java */
/* loaded from: classes.dex */
public class c extends g implements t {

    /* renamed from: d  reason: collision with root package name */
    Drawable f37797d;

    /* renamed from: e  reason: collision with root package name */
    private u f37798e;

    public c(Drawable drawable) {
        super(drawable);
        this.f37797d = null;
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            u uVar = this.f37798e;
            if (uVar != null) {
                uVar.a();
            }
            super.draw(canvas);
            Drawable drawable = this.f37797d;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f37797d.draw(canvas);
            }
        }
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // u4.t
    public void k(u uVar) {
        this.f37798e = uVar;
    }

    @Override // u4.g, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        u uVar = this.f37798e;
        if (uVar != null) {
            uVar.b(z10);
        }
        return super.setVisible(z10, z11);
    }

    public void w(Drawable drawable) {
        this.f37797d = drawable;
        invalidateSelf();
    }
}
