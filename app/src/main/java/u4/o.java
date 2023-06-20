package u4;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* compiled from: RoundedNinePatchDrawable.java */
/* loaded from: classes.dex */
public class o extends n {
    public o(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // u4.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (c6.b.d()) {
            c6.b.a("RoundedNinePatchDrawable#draw");
        }
        if (!e()) {
            super.draw(canvas);
            if (c6.b.d()) {
                c6.b.b();
                return;
            }
            return;
        }
        g();
        f();
        canvas.clipPath(this.f37518e);
        super.draw(canvas);
        if (c6.b.d()) {
            c6.b.b();
        }
    }
}
