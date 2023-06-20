package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class j0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final float f1549a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1550b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1551c;

    /* renamed from: d  reason: collision with root package name */
    final View f1552d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f1553e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f1554f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1555g;

    /* renamed from: h  reason: collision with root package name */
    private int f1556h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f1557i = new int[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = j0.this.f1552d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.e();
        }
    }

    public j0(View view) {
        this.f1552d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1549a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1550b = tapTimeout;
        this.f1551c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1554f;
        if (runnable != null) {
            this.f1552d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1553e;
        if (runnable2 != null) {
            this.f1552d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        h0 h0Var;
        View view = this.f1552d;
        j.e b10 = b();
        if (b10 == null || !b10.a() || (h0Var = (h0) b10.o()) == null || !h0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(h0Var, obtainNoHistory);
        boolean e10 = h0Var.e(obtainNoHistory, this.f1556h);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e10 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1552d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1556h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1549a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1556h = r6
            java.lang.Runnable r6 = r5.f1553e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.j0$a r6 = new androidx.appcompat.widget.j0$a
            r6.<init>()
            r5.f1553e = r6
        L52:
            java.lang.Runnable r6 = r5.f1553e
            int r1 = r5.f1550b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1554f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.j0$b r6 = new androidx.appcompat.widget.j0$b
            r6.<init>()
            r5.f1554f = r6
        L65:
            java.lang.Runnable r6 = r5.f1554f
            int r1 = r5.f1551c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1557i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1557i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract j.e b();

    protected abstract boolean c();

    protected boolean d() {
        j.e b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f1552d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1555g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1555g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1552d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1555g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1555g = false;
        this.f1556h = -1;
        Runnable runnable = this.f1553e;
        if (runnable != null) {
            this.f1552d.removeCallbacks(runnable);
        }
    }
}
