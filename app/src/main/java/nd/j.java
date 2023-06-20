package nd;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* compiled from: PanGestureHandler.java */
/* loaded from: classes3.dex */
public class j extends b<j> {
    private static float Z = Float.MAX_VALUE;

    /* renamed from: a0  reason: collision with root package name */
    private static float f34795a0 = Float.MIN_VALUE;

    /* renamed from: b0  reason: collision with root package name */
    private static int f34796b0 = 1;

    /* renamed from: c0  reason: collision with root package name */
    private static int f34797c0 = 10;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private int N;
    private int O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private float V;
    private float W;
    private VelocityTracker X;
    private boolean Y;

    public j(Context context) {
        float f10 = f34795a0;
        this.B = f10;
        float f11 = Z;
        this.C = f11;
        this.D = f10;
        this.E = f10;
        this.F = f11;
        this.G = f11;
        this.H = f10;
        this.I = f10;
        this.J = f11;
        this.K = f11;
        this.L = f11;
        this.M = f11;
        this.N = f34796b0;
        this.O = f34797c0;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.B = scaledTouchSlop * scaledTouchSlop;
    }

    private static void U(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    private boolean o0() {
        float f10 = (this.T - this.P) + this.R;
        float f11 = this.C;
        float f12 = Z;
        if (f11 == f12 || f10 >= f11) {
            float f13 = this.D;
            float f14 = f34795a0;
            if (f13 == f14 || f10 <= f13) {
                float f15 = (this.U - this.Q) + this.S;
                float f16 = this.G;
                if (f16 == f12 || f15 >= f16) {
                    float f17 = this.H;
                    if (f17 == f14 || f15 <= f17) {
                        float f18 = (f10 * f10) + (f15 * f15);
                        float f19 = this.B;
                        if (f19 == f12 || f18 < f19) {
                            float f20 = this.V;
                            float f21 = this.K;
                            if (f21 == f12 || ((f21 >= 0.0f || f20 > f21) && (f21 < 0.0f || f20 < f21))) {
                                float f22 = this.W;
                                float f23 = this.L;
                                if (f23 == f12 || ((f23 >= 0.0f || f20 > f23) && (f23 < 0.0f || f20 < f23))) {
                                    float f24 = (f20 * f20) + (f22 * f22);
                                    float f25 = this.M;
                                    return f25 != f12 && f24 >= f25;
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    private boolean p0() {
        float f10 = (this.T - this.P) + this.R;
        float f11 = this.E;
        float f12 = f34795a0;
        if (f11 == f12 || f10 >= f11) {
            float f13 = this.F;
            float f14 = Z;
            if (f13 == f14 || f10 <= f13) {
                float f15 = (this.U - this.Q) + this.S;
                float f16 = this.I;
                if (f16 == f12 || f15 >= f16) {
                    float f17 = this.J;
                    return f17 != f14 && f15 > f17;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // nd.b
    protected void C(MotionEvent motionEvent) {
        int p10 = p();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 6 && actionMasked != 5) {
            this.T = f.a(motionEvent, this.Y);
            this.U = f.b(motionEvent, this.Y);
        } else {
            this.R += this.T - this.P;
            this.S += this.U - this.Q;
            this.T = f.a(motionEvent, this.Y);
            float b10 = f.b(motionEvent, this.Y);
            this.U = b10;
            this.P = this.T;
            this.Q = b10;
        }
        if (p10 == 0 && motionEvent.getPointerCount() >= this.N) {
            this.P = this.T;
            this.Q = this.U;
            this.R = 0.0f;
            this.S = 0.0f;
            VelocityTracker obtain = VelocityTracker.obtain();
            this.X = obtain;
            U(obtain, motionEvent);
            c();
        } else {
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                U(velocityTracker, motionEvent);
                this.X.computeCurrentVelocity(1000);
                this.V = this.X.getXVelocity();
                this.W = this.X.getYVelocity();
            }
        }
        if (actionMasked == 1) {
            if (p10 != 4 && p10 != 2) {
                h();
            } else {
                g();
            }
        } else if (actionMasked == 5 && motionEvent.getPointerCount() > this.O) {
            if (p10 == 4) {
                d();
            } else {
                h();
            }
        } else if (actionMasked == 6 && p10 == 4 && motionEvent.getPointerCount() < this.N) {
            h();
        } else if (p10 == 2) {
            if (p0()) {
                h();
            } else if (o0()) {
                this.P = this.T;
                this.Q = this.U;
                a();
            }
        }
    }

    @Override // nd.b
    protected void D() {
        VelocityTracker velocityTracker = this.X;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.X = null;
        }
    }

    public float V() {
        return (this.T - this.P) + this.R;
    }

    public float W() {
        return (this.U - this.Q) + this.S;
    }

    public float X() {
        return this.V;
    }

    public float Y() {
        return this.W;
    }

    public j Z(float f10) {
        this.D = f10;
        return this;
    }

    public j a0(float f10) {
        this.C = f10;
        return this;
    }

    public j b0(float f10) {
        this.H = f10;
        return this;
    }

    public j c0(float f10) {
        this.G = f10;
        return this;
    }

    public j d0(boolean z10) {
        this.Y = z10;
        return this;
    }

    public j e0(float f10) {
        this.F = f10;
        return this;
    }

    public j f0(float f10) {
        this.E = f10;
        return this;
    }

    public j g0(float f10) {
        this.J = f10;
        return this;
    }

    public j h0(float f10) {
        this.I = f10;
        return this;
    }

    public j i0(int i10) {
        this.O = i10;
        return this;
    }

    public j j0(float f10) {
        this.B = f10 * f10;
        return this;
    }

    public j k0(int i10) {
        this.N = i10;
        return this;
    }

    public j l0(float f10) {
        this.M = f10 * f10;
        return this;
    }

    public j m0(float f10) {
        this.K = f10;
        return this;
    }

    public j n0(float f10) {
        this.L = f10;
        return this;
    }
}
