package u;

import android.view.View;

/* compiled from: ViewOscillator.java */
/* loaded from: classes.dex */
public abstract class c extends q.d {

    /* compiled from: ViewOscillator.java */
    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // u.c
        public void b(View view, float f10) {
        }

        public void c(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    public abstract void b(View view, float f10);
}
