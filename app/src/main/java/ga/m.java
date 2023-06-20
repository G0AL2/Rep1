package ga;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import ga.d;

/* compiled from: TouchTracker.java */
/* loaded from: classes2.dex */
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: c  reason: collision with root package name */
    private final a f30782c;

    /* renamed from: d  reason: collision with root package name */
    private final float f30783d;

    /* renamed from: e  reason: collision with root package name */
    private final GestureDetector f30784e;

    /* renamed from: a  reason: collision with root package name */
    private final PointF f30780a = new PointF();

    /* renamed from: b  reason: collision with root package name */
    private final PointF f30781b = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private volatile float f30785f = 3.1415927f;

    /* compiled from: TouchTracker.java */
    /* loaded from: classes2.dex */
    public interface a {
        void b(PointF pointF);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    public m(Context context, a aVar, float f10) {
        this.f30782c = aVar;
        this.f30783d = f10;
        this.f30784e = new GestureDetector(context, this);
    }

    @Override // ga.d.a
    public void a(float[] fArr, float f10) {
        this.f30785f = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f30780a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f30780a.x) / this.f30783d;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f30780a;
        float f12 = (y10 - pointF.y) / this.f30783d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f30785f;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        PointF pointF2 = this.f30781b;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = pointF2.y + (sin * x10) + (cos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f30782c.b(this.f30781b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f30782c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f30784e.onTouchEvent(motionEvent);
    }
}
