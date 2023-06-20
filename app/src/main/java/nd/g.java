package nd;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;

/* compiled from: LongPressGestureHandler.java */
/* loaded from: classes3.dex */
public class g extends b<g> {
    private static float G = 10.0f;
    private long B = 500;
    private float C;
    private float D;
    private float E;
    private Handler F;

    /* compiled from: LongPressGestureHandler.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.a();
        }
    }

    public g(Context context) {
        L(true);
        this.C = G * context.getResources().getDisplayMetrics().density;
    }

    @Override // nd.b
    protected void C(MotionEvent motionEvent) {
        if (p() == 0) {
            c();
            this.D = motionEvent.getRawX();
            this.E = motionEvent.getRawY();
            Handler handler = new Handler();
            this.F = handler;
            long j10 = this.B;
            if (j10 > 0) {
                handler.postDelayed(new a(), this.B);
            } else if (j10 == 0) {
                a();
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            Handler handler2 = this.F;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.F = null;
            }
            if (p() == 4) {
                g();
                return;
            } else {
                h();
                return;
            }
        }
        float rawX = motionEvent.getRawX() - this.D;
        float rawY = motionEvent.getRawY() - this.E;
        if ((rawX * rawX) + (rawY * rawY) > this.C) {
            if (p() == 4) {
                d();
            } else {
                h();
            }
        }
    }

    @Override // nd.b
    protected void E(int i10, int i11) {
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.F = null;
        }
    }

    public g U(float f10) {
        this.C = f10 * f10;
        return this;
    }

    public void V(long j10) {
        this.B = j10;
    }
}
