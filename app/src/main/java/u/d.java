package u;

import android.view.View;

/* compiled from: ViewSpline.java */
/* loaded from: classes.dex */
public abstract class d extends q.e {

    /* compiled from: ViewSpline.java */
    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // u.d
        public void b(View view, float f10) {
        }

        public void c(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    public abstract void b(View view, float f10);
}
