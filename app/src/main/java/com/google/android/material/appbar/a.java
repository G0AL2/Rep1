package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeaderBehavior.java */
/* loaded from: classes2.dex */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f22001d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f22002e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22003f;

    /* renamed from: g  reason: collision with root package name */
    private int f22004g;

    /* renamed from: h  reason: collision with root package name */
    private int f22005h;

    /* renamed from: i  reason: collision with root package name */
    private int f22006i;

    /* renamed from: j  reason: collision with root package name */
    private VelocityTracker f22007j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HeaderBehavior.java */
    /* renamed from: com.google.android.material.appbar.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0294a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final CoordinatorLayout f22008a;

        /* renamed from: b  reason: collision with root package name */
        private final V f22009b;

        RunnableC0294a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f22008a = coordinatorLayout;
            this.f22009b = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f22009b == null || (overScroller = a.this.f22002e) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                a aVar = a.this;
                aVar.P(this.f22008a, this.f22009b, aVar.f22002e.getCurrY());
                z.i0(this.f22009b, this);
                return;
            }
            a.this.N(this.f22008a, this.f22009b);
        }
    }

    public a() {
        this.f22004g = -1;
        this.f22006i = -1;
    }

    private void I() {
        if (this.f22007j == null) {
            this.f22007j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r0 != 3) goto L15;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f22006i
            if (r0 >= 0) goto L12
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f22006i = r0
        L12:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8d
            r3 = -1
            if (r0 == r1) goto L5c
            r4 = 2
            if (r0 == r4) goto L25
            r12 = 3
            if (r0 == r12) goto L7e
            goto Lae
        L25:
            int r0 = r11.f22004g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L2e
            return r2
        L2e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f22005h
            int r2 = r2 - r0
            boolean r3 = r11.f22003f
            if (r3 != 0) goto L49
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f22006i
            if (r3 <= r4) goto L49
            r11.f22003f = r1
            if (r2 <= 0) goto L48
            int r2 = r2 - r4
            goto L49
        L48:
            int r2 = r2 + r4
        L49:
            r6 = r2
            boolean r2 = r11.f22003f
            if (r2 == 0) goto Lae
            r11.f22005h = r0
            int r7 = r11.K(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.O(r4, r5, r6, r7, r8)
            goto Lae
        L5c:
            android.view.VelocityTracker r0 = r11.f22007j
            if (r0 == 0) goto L7e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f22007j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f22007j
            int r4 = r11.f22004g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.J(r6, r7, r8, r9, r10)
        L7e:
            r11.f22003f = r2
            r11.f22004g = r3
            android.view.VelocityTracker r12 = r11.f22007j
            if (r12 == 0) goto Lae
            r12.recycle()
            r12 = 0
            r11.f22007j = r12
            goto Lae
        L8d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.B(r13, r0, r3)
            if (r12 == 0) goto Lb6
            boolean r12 = r11.H(r13)
            if (r12 == 0) goto Lb6
            r11.f22005h = r3
            int r12 = r14.getPointerId(r2)
            r11.f22004g = r12
            r11.I()
        Lae:
            android.view.VelocityTracker r12 = r11.f22007j
            if (r12 == 0) goto Lb5
            r12.addMovement(r14)
        Lb5:
            return r1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    abstract boolean H(V v10);

    final boolean J(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f22001d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f22001d = null;
        }
        if (this.f22002e == null) {
            this.f22002e = new OverScroller(v10.getContext());
        }
        this.f22002e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (this.f22002e.computeScrollOffset()) {
            RunnableC0294a runnableC0294a = new RunnableC0294a(coordinatorLayout, v10);
            this.f22001d = runnableC0294a;
            z.i0(v10, runnableC0294a);
            return true;
        }
        N(coordinatorLayout, v10);
        return false;
    }

    abstract int K(V v10);

    abstract int L(V v10);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, V v10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return Q(coordinatorLayout, v10, M() - i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int P(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return Q(coordinatorLayout, v10, i10, RecyclerView.UNDEFINED_DURATION, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12);

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f22006i
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f22006i = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.f22003f
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L60
            r5 = -1
            if (r0 == r2) goto L51
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L51
            goto L83
        L2f:
            int r6 = r4.f22004g
            if (r6 != r5) goto L34
            goto L83
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L83
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f22005h
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f22006i
            if (r6 <= r0) goto L83
            r4.f22003f = r2
            r4.f22005h = r5
            goto L83
        L51:
            r4.f22003f = r3
            r4.f22004g = r5
            android.view.VelocityTracker r5 = r4.f22007j
            if (r5 == 0) goto L83
            r5.recycle()
            r5 = 0
            r4.f22007j = r5
            goto L83
        L60:
            r4.f22003f = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.H(r6)
            if (r2 == 0) goto L83
            boolean r5 = r5.B(r6, r0, r1)
            if (r5 == 0) goto L83
            r4.f22005h = r1
            int r5 = r7.getPointerId(r3)
            r4.f22004g = r5
            r4.I()
        L83:
            android.view.VelocityTracker r5 = r4.f22007j
            if (r5 == 0) goto L8a
            r5.addMovement(r7)
        L8a:
            boolean r5 = r4.f22003f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.a.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22004g = -1;
        this.f22006i = -1;
    }
}
