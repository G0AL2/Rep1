package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Api;

/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
class d1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j  reason: collision with root package name */
    private static d1 f1472j;

    /* renamed from: k  reason: collision with root package name */
    private static d1 f1473k;

    /* renamed from: a  reason: collision with root package name */
    private final View f1474a;

    /* renamed from: b  reason: collision with root package name */
    private final CharSequence f1475b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1476c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f1477d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f1478e = new b();

    /* renamed from: f  reason: collision with root package name */
    private int f1479f;

    /* renamed from: g  reason: collision with root package name */
    private int f1480g;

    /* renamed from: h  reason: collision with root package name */
    private e1 f1481h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1482i;

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.g(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.c();
        }
    }

    private d1(View view, CharSequence charSequence) {
        this.f1474a = view;
        this.f1475b = charSequence;
        this.f1476c = androidx.core.view.b0.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1474a.removeCallbacks(this.f1477d);
    }

    private void b() {
        this.f1479f = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1480g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    private void d() {
        this.f1474a.postDelayed(this.f1477d, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(d1 d1Var) {
        d1 d1Var2 = f1472j;
        if (d1Var2 != null) {
            d1Var2.a();
        }
        f1472j = d1Var;
        if (d1Var != null) {
            d1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        d1 d1Var = f1472j;
        if (d1Var != null && d1Var.f1474a == view) {
            e(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            d1 d1Var2 = f1473k;
            if (d1Var2 != null && d1Var2.f1474a == view) {
                d1Var2.c();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new d1(view, charSequence);
    }

    private boolean h(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (Math.abs(x10 - this.f1479f) > this.f1476c || Math.abs(y10 - this.f1480g) > this.f1476c) {
            this.f1479f = x10;
            this.f1480g = y10;
            return true;
        }
        return false;
    }

    void c() {
        if (f1473k == this) {
            f1473k = null;
            e1 e1Var = this.f1481h;
            if (e1Var != null) {
                e1Var.c();
                this.f1481h = null;
                b();
                this.f1474a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1472j == this) {
            e(null);
        }
        this.f1474a.removeCallbacks(this.f1478e);
    }

    void g(boolean z10) {
        long j10;
        int longPressTimeout;
        long j11;
        if (androidx.core.view.z.T(this.f1474a)) {
            e(null);
            d1 d1Var = f1473k;
            if (d1Var != null) {
                d1Var.c();
            }
            f1473k = this;
            this.f1482i = z10;
            e1 e1Var = new e1(this.f1474a.getContext());
            this.f1481h = e1Var;
            e1Var.e(this.f1474a, this.f1479f, this.f1480g, this.f1482i, this.f1475b);
            this.f1474a.addOnAttachStateChangeListener(this);
            if (this.f1482i) {
                j11 = 2500;
            } else {
                if ((androidx.core.view.z.M(this.f1474a) & 1) == 1) {
                    j10 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j10 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j11 = j10 - longPressTimeout;
            }
            this.f1474a.removeCallbacks(this.f1478e);
            this.f1474a.postDelayed(this.f1478e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1481h == null || !this.f1482i) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1474a.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    b();
                    c();
                }
            } else if (this.f1474a.isEnabled() && this.f1481h == null && h(motionEvent)) {
                e(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1479f = view.getWidth() / 2;
        this.f1480g = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
