package m0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.h;
import androidx.core.view.d0;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import i0.d;
import i0.e;
import java.util.ArrayList;
import java.util.List;
import m0.b;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n  reason: collision with root package name */
    private static final Rect f34133n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o  reason: collision with root package name */
    private static final b.a<i0.c> f34134o = new C0447a();

    /* renamed from: p  reason: collision with root package name */
    private static final b.InterfaceC0448b<h<i0.c>, i0.c> f34135p = new b();

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f34140h;

    /* renamed from: i  reason: collision with root package name */
    private final View f34141i;

    /* renamed from: j  reason: collision with root package name */
    private c f34142j;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f34136d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f34137e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f34138f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f34139g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    int f34143k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l  reason: collision with root package name */
    int f34144l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m  reason: collision with root package name */
    private int f34145m = RecyclerView.UNDEFINED_DURATION;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: m0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0447a implements b.a<i0.c> {
        C0447a() {
        }

        @Override // m0.b.a
        /* renamed from: b */
        public void a(i0.c cVar, Rect rect) {
            cVar.m(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    static class b implements b.InterfaceC0448b<h<i0.c>, i0.c> {
        b() {
        }

        @Override // m0.b.InterfaceC0448b
        /* renamed from: c */
        public i0.c a(h<i0.c> hVar, int i10) {
            return hVar.m(i10);
        }

        @Override // m0.b.InterfaceC0448b
        /* renamed from: d */
        public int b(h<i0.c> hVar) {
            return hVar.k();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    private class c extends d {
        c() {
        }

        @Override // i0.d
        public i0.c b(int i10) {
            return i0.c.P(a.this.H(i10));
        }

        @Override // i0.d
        public i0.c d(int i10) {
            int i11 = i10 == 2 ? a.this.f34143k : a.this.f34144l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // i0.d
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f34141i = view;
            this.f34140h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (z.A(view) == 0) {
                z.A0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f34141i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f34141i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i10) {
        if (i10 != 19) {
            if (i10 != 21) {
                return i10 != 22 ? 130 : 66;
            }
            return 17;
        }
        return 33;
    }

    private boolean G(int i10, Rect rect) {
        i0.c cVar;
        h<i0.c> y10 = y();
        int i11 = this.f34144l;
        int i12 = RecyclerView.UNDEFINED_DURATION;
        i0.c e10 = i11 == Integer.MIN_VALUE ? null : y10.e(i11);
        if (i10 == 1 || i10 == 2) {
            cVar = (i0.c) m0.b.d(y10, f34135p, f34134o, e10, i10, z.C(this.f34141i) == 1, false);
        } else if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i13 = this.f34144l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f34141i, i10, rect2);
            }
            cVar = (i0.c) m0.b.c(y10, f34135p, f34134o, e10, rect2, i10);
        }
        if (cVar != null) {
            i12 = y10.i(y10.g(cVar));
        }
        return T(i12);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 64) {
                    if (i11 != 128) {
                        return J(i10, i11, bundle);
                    }
                    return n(i10);
                }
                return S(i10);
            }
            return o(i10);
        }
        return T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return z.f0(this.f34141i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (this.f34140h.isEnabled() && this.f34140h.isTouchExplorationEnabled() && (i11 = this.f34143k) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                n(i11);
            }
            this.f34143k = i10;
            this.f34141i.invalidate();
            U(i10, 32768);
            return true;
        }
        return false;
    }

    private void V(int i10) {
        int i11 = this.f34145m;
        if (i11 == i10) {
            return;
        }
        this.f34145m = i10;
        U(i10, 128);
        U(i11, 256);
    }

    private boolean n(int i10) {
        if (this.f34143k == i10) {
            this.f34143k = RecyclerView.UNDEFINED_DURATION;
            this.f34141i.invalidate();
            U(i10, Constants.MIN_PROGRESS_STEP);
            return true;
        }
        return false;
    }

    private boolean p() {
        int i10 = this.f34144l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        if (i10 != -1) {
            return r(i10, i11);
        }
        return s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        i0.c H = H(i10);
        obtain.getText().add(H.w());
        obtain.setContentDescription(H.r());
        obtain.setScrollable(H.J());
        obtain.setPassword(H.I());
        obtain.setEnabled(H.E());
        obtain.setChecked(H.C());
        L(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H.p());
        e.c(obtain, this.f34141i, i10);
        obtain.setPackageName(this.f34141i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f34141i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private i0.c t(int i10) {
        i0.c N = i0.c.N();
        N.g0(true);
        N.i0(true);
        N.a0("android.view.View");
        Rect rect = f34133n;
        N.W(rect);
        N.X(rect);
        N.q0(this.f34141i);
        N(i10, N);
        if (N.w() == null && N.r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        N.m(this.f34137e);
        if (!this.f34137e.equals(rect)) {
            int k10 = N.k();
            if ((k10 & 64) == 0) {
                if ((k10 & 128) == 0) {
                    N.o0(this.f34141i.getContext().getPackageName());
                    N.z0(this.f34141i, i10);
                    if (this.f34143k == i10) {
                        N.U(true);
                        N.a(128);
                    } else {
                        N.U(false);
                        N.a(64);
                    }
                    boolean z10 = this.f34144l == i10;
                    if (z10) {
                        N.a(2);
                    } else if (N.F()) {
                        N.a(1);
                    }
                    N.j0(z10);
                    this.f34141i.getLocationOnScreen(this.f34139g);
                    N.n(this.f34136d);
                    if (this.f34136d.equals(rect)) {
                        N.m(this.f34136d);
                        if (N.f31488b != -1) {
                            i0.c N2 = i0.c.N();
                            for (int i11 = N.f31488b; i11 != -1; i11 = N2.f31488b) {
                                N2.r0(this.f34141i, -1);
                                N2.W(f34133n);
                                N(i11, N2);
                                N2.m(this.f34137e);
                                Rect rect2 = this.f34136d;
                                Rect rect3 = this.f34137e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            N2.R();
                        }
                        this.f34136d.offset(this.f34139g[0] - this.f34141i.getScrollX(), this.f34139g[1] - this.f34141i.getScrollY());
                    }
                    if (this.f34141i.getLocalVisibleRect(this.f34138f)) {
                        this.f34138f.offset(this.f34139g[0] - this.f34141i.getScrollX(), this.f34139g[1] - this.f34141i.getScrollY());
                        if (this.f34136d.intersect(this.f34138f)) {
                            N.X(this.f34136d);
                            if (E(this.f34136d)) {
                                N.D0(true);
                            }
                        }
                    }
                    return N;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    private i0.c u() {
        i0.c O = i0.c.O(this.f34141i);
        z.d0(this.f34141i, O);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (O.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            O.d(this.f34141i, ((Integer) arrayList.get(i10)).intValue());
        }
        return O;
    }

    private h<i0.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<i0.c> hVar = new h<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hVar.j(i10, t(i10));
        }
        return hVar;
    }

    private void z(int i10, Rect rect) {
        H(i10).m(rect);
    }

    public final int A() {
        return this.f34144l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List<Integer> list);

    i0.c H(int i10) {
        if (i10 == -1) {
            return u();
        }
        return t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f34144l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected void M(i0.c cVar) {
    }

    protected abstract void N(int i10, i0.c cVar);

    protected void O(int i10, boolean z10) {
    }

    boolean P(int i10, int i11, Bundle bundle) {
        if (i10 != -1) {
            return Q(i10, i11, bundle);
        }
        return R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((this.f34141i.isFocused() || this.f34141i.requestFocus()) && (i11 = this.f34144l) != i10) {
            if (i11 != Integer.MIN_VALUE) {
                o(i11);
            }
            this.f34144l = i10;
            O(i10, true);
            U(i10, 8);
            return true;
        }
        return false;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f34140h.isEnabled() || (parent = this.f34141i.getParent()) == null) {
            return false;
        }
        return d0.h(parent, this.f34141i, q(i10, i11));
    }

    @Override // androidx.core.view.a
    public d b(View view) {
        if (this.f34142j == null) {
            this.f34142j = new c();
        }
        return this.f34142j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, i0.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean o(int i10) {
        if (this.f34144l != i10) {
            return false;
        }
        this.f34144l = RecyclerView.UNDEFINED_DURATION;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f34140h.isEnabled() && this.f34140h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && this.f34145m != Integer.MIN_VALUE) {
                    V(RecyclerView.UNDEFINED_DURATION);
                    return true;
                }
                return false;
            }
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            return B != Integer.MIN_VALUE;
        }
        return false;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int F = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && G(F, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            return false;
                        case 23:
                            break;
                        default:
                            return false;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    p();
                    return true;
                }
                return false;
            } else if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
                return false;
            }
        }
        return false;
    }

    public final int x() {
        return this.f34143k;
    }
}
