package nd;

import android.view.MotionEvent;

/* compiled from: RotationGestureDetector.java */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private long f34804a;

    /* renamed from: b  reason: collision with root package name */
    private long f34805b;

    /* renamed from: c  reason: collision with root package name */
    private double f34806c;

    /* renamed from: d  reason: collision with root package name */
    private double f34807d;

    /* renamed from: e  reason: collision with root package name */
    private float f34808e;

    /* renamed from: f  reason: collision with root package name */
    private float f34809f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f34810g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f34811h = new int[2];

    /* renamed from: i  reason: collision with root package name */
    private a f34812i;

    /* compiled from: RotationGestureDetector.java */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(m mVar);

        void b(m mVar);

        boolean c(m mVar);
    }

    public m(a aVar) {
        this.f34812i = aVar;
    }

    private void a() {
        if (this.f34810g) {
            this.f34810g = false;
            a aVar = this.f34812i;
            if (aVar != null) {
                aVar.b(this);
            }
        }
    }

    private void g(MotionEvent motionEvent) {
        this.f34805b = this.f34804a;
        this.f34804a = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.f34811h[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.f34811h[1]);
        float x10 = motionEvent.getX(findPointerIndex);
        float y10 = motionEvent.getY(findPointerIndex);
        float x11 = motionEvent.getX(findPointerIndex2);
        float y11 = motionEvent.getY(findPointerIndex2);
        float f10 = y11 - y10;
        this.f34808e = (x10 + x11) * 0.5f;
        this.f34809f = (y10 + y11) * 0.5f;
        double d10 = -Math.atan2(f10, x11 - x10);
        if (Double.isNaN(this.f34806c)) {
            this.f34807d = 0.0d;
        } else {
            this.f34807d = this.f34806c - d10;
        }
        this.f34806c = d10;
        double d11 = this.f34807d;
        if (d11 > 3.141592653589793d) {
            this.f34807d = d11 - 3.141592653589793d;
        } else if (d11 < -3.141592653589793d) {
            this.f34807d = d11 + 3.141592653589793d;
        }
        double d12 = this.f34807d;
        if (d12 > 1.5707963267948966d) {
            this.f34807d = d12 - 3.141592653589793d;
        } else if (d12 < -1.5707963267948966d) {
            this.f34807d = d12 + 3.141592653589793d;
        }
    }

    public float b() {
        return this.f34808e;
    }

    public float c() {
        return this.f34809f;
    }

    public double d() {
        return this.f34807d;
    }

    public long e() {
        return this.f34804a - this.f34805b;
    }

    public boolean f(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f34810g = false;
            this.f34811h[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f34811h[1] = -1;
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionMasked == 6 && this.f34810g) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int[] iArr = this.f34811h;
                    if (pointerId == iArr[0] || pointerId == iArr[1]) {
                        a();
                    }
                }
            } else if (!this.f34810g) {
                this.f34811h[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f34810g = true;
                this.f34805b = motionEvent.getEventTime();
                this.f34806c = Double.NaN;
                g(motionEvent);
                a aVar = this.f34812i;
                if (aVar != null) {
                    aVar.a(this);
                }
            }
        } else if (this.f34810g) {
            g(motionEvent);
            a aVar2 = this.f34812i;
            if (aVar2 != null) {
                aVar2.c(this);
            }
        }
        return true;
    }
}
