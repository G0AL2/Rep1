package nd;

import android.view.MotionEvent;
import nd.m;

/* compiled from: RotationGestureHandler.java */
/* loaded from: classes3.dex */
public class n extends b<n> {
    private m B;
    private double C;
    private double D;
    private m.a E = new a();

    /* compiled from: RotationGestureHandler.java */
    /* loaded from: classes3.dex */
    class a implements m.a {
        a() {
        }

        @Override // nd.m.a
        public boolean a(m mVar) {
            return true;
        }

        @Override // nd.m.a
        public void b(m mVar) {
            n.this.g();
        }

        @Override // nd.m.a
        public boolean c(m mVar) {
            double d10 = n.this.C;
            n.V(n.this, mVar.d());
            long e10 = mVar.e();
            if (e10 > 0) {
                n nVar = n.this;
                nVar.D = (nVar.C - d10) / e10;
            }
            if (Math.abs(n.this.C) < 0.08726646259971647d || n.this.p() != 2) {
                return true;
            }
            n.this.a();
            return true;
        }
    }

    public n() {
        L(false);
    }

    static /* synthetic */ double V(n nVar, double d10) {
        double d11 = nVar.C + d10;
        nVar.C = d11;
        return d11;
    }

    @Override // nd.b
    protected void C(MotionEvent motionEvent) {
        int p10 = p();
        if (p10 == 0) {
            this.D = 0.0d;
            this.C = 0.0d;
            this.B = new m(this.E);
            c();
        }
        m mVar = this.B;
        if (mVar != null) {
            mVar.f(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            if (p10 == 4) {
                g();
            } else {
                h();
            }
        }
    }

    @Override // nd.b
    protected void D() {
        this.B = null;
        this.D = 0.0d;
        this.C = 0.0d;
    }

    public float X() {
        m mVar = this.B;
        if (mVar == null) {
            return Float.NaN;
        }
        return mVar.b();
    }

    public float Y() {
        m mVar = this.B;
        if (mVar == null) {
            return Float.NaN;
        }
        return mVar.c();
    }

    public double Z() {
        return this.C;
    }

    public double a0() {
        return this.D;
    }
}
