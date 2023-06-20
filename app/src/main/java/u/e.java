package u;

import android.view.View;
import q.f;

/* compiled from: ViewTimeCycle.java */
/* loaded from: classes.dex */
public abstract class e extends f {

    /* compiled from: ViewTimeCycle.java */
    /* loaded from: classes.dex */
    public static class a extends e {
        @Override // u.e
        public boolean b(View view, float f10, long j10, q.c cVar) {
            return this.f35752h;
        }

        public boolean c(View view, q.c cVar, float f10, long j10, double d10, double d11) {
            view.setRotation(a(f10, j10, view, cVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f35752h;
        }
    }

    public float a(float f10, long j10, View view, q.c cVar) {
        this.f35745a.c(f10, this.f35751g);
        float[] fArr = this.f35751g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f35752h = false;
            return fArr[2];
        } else if (Float.isNaN(this.f35754j)) {
            throw null;
        } else {
            this.f35754j = (float) ((this.f35754j + (((j10 - this.f35753i) * 1.0E-9d) * f11)) % 1.0d);
            throw null;
        }
    }

    public abstract boolean b(View view, float f10, long j10, q.c cVar);
}
