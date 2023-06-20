package g7;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* compiled from: VelocityHelper.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private VelocityTracker f30693a;

    /* renamed from: b  reason: collision with root package name */
    private float f30694b;

    /* renamed from: c  reason: collision with root package name */
    private float f30695c;

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f30693a == null) {
            this.f30693a = VelocityTracker.obtain();
        }
        this.f30693a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f30693a.computeCurrentVelocity(1);
            this.f30694b = this.f30693a.getXVelocity();
            this.f30695c = this.f30693a.getYVelocity();
            VelocityTracker velocityTracker = this.f30693a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f30693a = null;
            }
        }
    }

    public float b() {
        return this.f30694b;
    }

    public float c() {
        return this.f30695c;
    }
}
