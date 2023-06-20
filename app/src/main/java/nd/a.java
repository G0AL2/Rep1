package nd;

import android.os.Handler;
import android.view.MotionEvent;

/* compiled from: FlingGestureHandler.java */
/* loaded from: classes3.dex */
public class a extends b<a> {
    private float F;
    private float G;
    private Handler H;
    private int I;
    private long B = 800;
    private long C = 160;
    private int D = 1;
    private int E = 1;
    private final Runnable J = new RunnableC0461a();

    /* compiled from: FlingGestureHandler.java */
    /* renamed from: nd.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0461a implements Runnable {
        RunnableC0461a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.h();
        }
    }

    private void U(MotionEvent motionEvent) {
        if (Y(motionEvent)) {
            return;
        }
        h();
    }

    private void X(MotionEvent motionEvent) {
        this.F = motionEvent.getRawX();
        this.G = motionEvent.getRawY();
        c();
        this.I = 1;
        Handler handler = this.H;
        if (handler == null) {
            this.H = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.H.postDelayed(this.J, this.B);
    }

    private boolean Y(MotionEvent motionEvent) {
        if (this.I == this.E) {
            if (((this.D & 1) == 0 || motionEvent.getRawX() - this.F <= ((float) this.C)) && (((this.D & 2) == 0 || this.F - motionEvent.getRawX() <= ((float) this.C)) && (((this.D & 4) == 0 || this.G - motionEvent.getRawY() <= ((float) this.C)) && ((this.D & 8) == 0 || motionEvent.getRawY() - this.G <= ((float) this.C))))) {
                return false;
            }
            this.H.removeCallbacksAndMessages(null);
            a();
            g();
            return true;
        }
        return false;
    }

    @Override // nd.b
    protected void B() {
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // nd.b
    protected void C(MotionEvent motionEvent) {
        int p10 = p();
        if (p10 == 0) {
            X(motionEvent);
        }
        if (p10 == 2) {
            Y(motionEvent);
            if (motionEvent.getPointerCount() > this.I) {
                this.I = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() == 1) {
                U(motionEvent);
            }
        }
    }

    @Override // nd.b
    protected void D() {
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void V(int i10) {
        this.D = i10;
    }

    public void W(int i10) {
        this.E = i10;
    }
}
