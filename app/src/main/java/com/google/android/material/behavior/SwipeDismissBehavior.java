package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.z;
import m0.c;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    m0.c f22058a;

    /* renamed from: b  reason: collision with root package name */
    b f22059b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22060c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22062e;

    /* renamed from: d  reason: collision with root package name */
    private float f22061d = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    int f22063f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f22064g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f22065h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    float f22066i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private final c.AbstractC0449c f22067j = new a();

    /* loaded from: classes2.dex */
    class a extends c.AbstractC0449c {

        /* renamed from: a  reason: collision with root package name */
        private int f22068a;

        /* renamed from: b  reason: collision with root package name */
        private int f22069b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 == 0) {
                return Math.abs(view.getLeft() - this.f22068a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f22064g);
            }
            boolean z10 = z.C(view) == 1;
            int i11 = SwipeDismissBehavior.this.f22063f;
            if (i11 == 2) {
                return true;
            }
            if (i11 == 0) {
                if (z10) {
                    if (f10 >= 0.0f) {
                        return false;
                    }
                } else if (i10 <= 0) {
                    return false;
                }
                return true;
            } else if (i11 == 1) {
                if (z10) {
                    if (i10 <= 0) {
                        return false;
                    }
                } else if (f10 >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // m0.c.AbstractC0449c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = z.C(view) == 1;
            int i12 = SwipeDismissBehavior.this.f22063f;
            if (i12 == 0) {
                if (z10) {
                    width = this.f22068a - view.getWidth();
                    width2 = this.f22068a;
                } else {
                    width = this.f22068a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f22068a - view.getWidth();
                width2 = view.getWidth() + this.f22068a;
            } else if (z10) {
                width = this.f22068a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f22068a - view.getWidth();
                width2 = this.f22068a;
            }
            return SwipeDismissBehavior.G(width, i10, width2);
        }

        @Override // m0.c.AbstractC0449c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // m0.c.AbstractC0449c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // m0.c.AbstractC0449c
        public void i(View view, int i10) {
            this.f22069b = i10;
            this.f22068a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // m0.c.AbstractC0449c
        public void j(int i10) {
            b bVar = SwipeDismissBehavior.this.f22059b;
            if (bVar != null) {
                bVar.b(i10);
            }
        }

        @Override // m0.c.AbstractC0449c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = this.f22068a + (view.getWidth() * SwipeDismissBehavior.this.f22065h);
            float width2 = this.f22068a + (view.getWidth() * SwipeDismissBehavior.this.f22066i);
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f10), 1.0f));
            }
        }

        @Override // m0.c.AbstractC0449c
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            b bVar;
            this.f22069b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                int left = view.getLeft();
                int i11 = this.f22068a;
                i10 = left < i11 ? i11 - width : i11 + width;
                z10 = true;
            } else {
                i10 = this.f22068a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f22058a.M(i10, view.getTop())) {
                z.i0(view, new c(view, z10));
            } else if (!z10 || (bVar = SwipeDismissBehavior.this.f22059b) == null) {
            } else {
                bVar.a(view);
            }
        }

        @Override // m0.c.AbstractC0449c
        public boolean m(View view, int i10) {
            int i11 = this.f22069b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.E(view);
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(View view);

        void b(int i10);
    }

    /* loaded from: classes2.dex */
    private class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f22071a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f22072b;

        c(View view, boolean z10) {
            this.f22071a = view;
            this.f22072b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar;
            m0.c cVar = SwipeDismissBehavior.this.f22058a;
            if (cVar != null && cVar.m(true)) {
                z.i0(this.f22071a, this);
            } else if (!this.f22072b || (bVar = SwipeDismissBehavior.this.f22059b) == null) {
            } else {
                bVar.a(this.f22071a);
            }
        }
    }

    static float F(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int G(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void H(ViewGroup viewGroup) {
        m0.c o10;
        if (this.f22058a == null) {
            if (this.f22062e) {
                o10 = m0.c.n(viewGroup, this.f22061d, this.f22067j);
            } else {
                o10 = m0.c.o(viewGroup, this.f22067j);
            }
            this.f22058a = o10;
        }
    }

    static float I(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        m0.c cVar = this.f22058a;
        if (cVar != null) {
            cVar.E(motionEvent);
            return true;
        }
        return false;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f10) {
        this.f22066i = F(0.0f, f10, 1.0f);
    }

    public void K(float f10) {
        this.f22065h = F(0.0f, f10, 1.0f);
    }

    public void L(int i10) {
        this.f22063f = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f22060c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.B(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f22060c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f22060c = false;
        }
        if (z10) {
            H(coordinatorLayout);
            return this.f22058a.N(motionEvent);
        }
        return false;
    }
}
