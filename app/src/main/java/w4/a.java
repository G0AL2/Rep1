package w4;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* compiled from: GestureDetector.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    InterfaceC0526a f38193a;

    /* renamed from: b  reason: collision with root package name */
    final float f38194b;

    /* renamed from: c  reason: collision with root package name */
    boolean f38195c;

    /* renamed from: d  reason: collision with root package name */
    boolean f38196d;

    /* renamed from: e  reason: collision with root package name */
    long f38197e;

    /* renamed from: f  reason: collision with root package name */
    float f38198f;

    /* renamed from: g  reason: collision with root package name */
    float f38199g;

    /* compiled from: GestureDetector.java */
    /* renamed from: w4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0526a {
        boolean a();
    }

    public a(Context context) {
        this.f38194b = ViewConfiguration.get(context).getScaledTouchSlop();
        a();
    }

    public static a c(Context context) {
        return new a(context);
    }

    public void a() {
        this.f38193a = null;
        e();
    }

    public boolean b() {
        return this.f38195c;
    }

    public boolean d(MotionEvent motionEvent) {
        InterfaceC0526a interfaceC0526a;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f38195c = true;
            this.f38196d = true;
            this.f38197e = motionEvent.getEventTime();
            this.f38198f = motionEvent.getX();
            this.f38199g = motionEvent.getY();
        } else if (action == 1) {
            this.f38195c = false;
            if (Math.abs(motionEvent.getX() - this.f38198f) > this.f38194b || Math.abs(motionEvent.getY() - this.f38199g) > this.f38194b) {
                this.f38196d = false;
            }
            if (this.f38196d && motionEvent.getEventTime() - this.f38197e <= ViewConfiguration.getLongPressTimeout() && (interfaceC0526a = this.f38193a) != null) {
                interfaceC0526a.a();
            }
            this.f38196d = false;
        } else if (action != 2) {
            if (action == 3) {
                this.f38195c = false;
                this.f38196d = false;
            }
        } else if (Math.abs(motionEvent.getX() - this.f38198f) > this.f38194b || Math.abs(motionEvent.getY() - this.f38199g) > this.f38194b) {
            this.f38196d = false;
        }
        return true;
    }

    public void e() {
        this.f38195c = false;
        this.f38196d = false;
    }

    public void f(InterfaceC0526a interfaceC0526a) {
        this.f38193a = interfaceC0526a;
    }
}
