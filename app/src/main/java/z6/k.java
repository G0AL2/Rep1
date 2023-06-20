package z6;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: LayoutUpdateAnimation.java */
/* loaded from: classes.dex */
class k extends a {
    @Override // z6.a
    Animation b(View view, int i10, int i11, int i12, int i13) {
        boolean z10 = false;
        boolean z11 = (view.getX() == ((float) i10) && view.getY() == ((float) i11)) ? false : true;
        z10 = (view.getWidth() == i12 && view.getHeight() == i13) ? true : true;
        if (z11 || z10) {
            return new m(view, i10, i11, i12, i13);
        }
        return null;
    }

    @Override // z6.a
    boolean e() {
        return this.f40064d > 0;
    }
}
