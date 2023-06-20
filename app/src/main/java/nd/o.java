package nd;

import android.os.Handler;
import android.view.MotionEvent;

/* compiled from: TapGestureHandler.java */
/* loaded from: classes3.dex */
public class o extends b<o> {
    private static float S = Float.MIN_VALUE;
    private float B;
    private float C;
    private float D;
    private long E;
    private long F;
    private int G;
    private int H;
    private int I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private Handler P;
    private int Q;
    private final Runnable R;

    /* compiled from: TapGestureHandler.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.h();
        }
    }

    public o() {
        float f10 = S;
        this.B = f10;
        this.C = f10;
        this.D = f10;
        this.E = 500L;
        this.F = 500L;
        this.G = 1;
        this.H = 1;
        this.I = 1;
        this.R = new a();
        L(true);
    }

    private void U() {
        Handler handler = this.P;
        if (handler == null) {
            this.P = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        int i10 = this.Q + 1;
        this.Q = i10;
        if (i10 == this.G && this.I >= this.H) {
            a();
            g();
            return;
        }
        this.P.postDelayed(this.R, this.F);
    }

    private boolean c0() {
        float f10 = (this.N - this.J) + this.L;
        if (this.B == S || Math.abs(f10) <= this.B) {
            float f11 = (this.O - this.K) + this.M;
            if (this.C == S || Math.abs(f11) <= this.C) {
                float f12 = (f11 * f11) + (f10 * f10);
                float f13 = this.D;
                return f13 != S && f12 > f13;
            }
            return true;
        }
        return true;
    }

    private void d0() {
        Handler handler = this.P;
        if (handler == null) {
            this.P = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.P.postDelayed(this.R, this.E);
    }

    @Override // nd.b
    protected void B() {
        Handler handler = this.P;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // nd.b
    protected void C(MotionEvent motionEvent) {
        int p10 = p();
        int actionMasked = motionEvent.getActionMasked();
        if (p10 == 0) {
            this.L = 0.0f;
            this.M = 0.0f;
            this.J = motionEvent.getRawX();
            this.K = motionEvent.getRawY();
        }
        if (actionMasked != 6 && actionMasked != 5) {
            this.N = f.a(motionEvent, true);
            this.O = f.b(motionEvent, true);
        } else {
            this.L += this.N - this.J;
            this.M += this.O - this.K;
            this.N = f.a(motionEvent, true);
            float b10 = f.b(motionEvent, true);
            this.O = b10;
            this.J = this.N;
            this.K = b10;
        }
        if (this.I < motionEvent.getPointerCount()) {
            this.I = motionEvent.getPointerCount();
        }
        if (c0()) {
            h();
        } else if (p10 == 0) {
            if (actionMasked == 0) {
                c();
            }
            d0();
        } else if (p10 == 2) {
            if (actionMasked == 1) {
                U();
            } else if (actionMasked == 0) {
                d0();
            }
        }
    }

    @Override // nd.b
    protected void D() {
        this.Q = 0;
        this.I = 0;
        Handler handler = this.P;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public o V(long j10) {
        this.F = j10;
        return this;
    }

    public o W(float f10) {
        this.D = f10 * f10;
        return this;
    }

    public o X(long j10) {
        this.E = j10;
        return this;
    }

    public o Y(float f10) {
        this.B = f10;
        return this;
    }

    public o Z(float f10) {
        this.C = f10;
        return this;
    }

    public o a0(int i10) {
        this.H = i10;
        return this;
    }

    public o b0(int i10) {
        this.G = i10;
        return this;
    }
}
