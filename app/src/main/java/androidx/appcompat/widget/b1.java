package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class b1 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1403a;

    /* renamed from: b  reason: collision with root package name */
    private int f1404b;

    /* renamed from: c  reason: collision with root package name */
    private View f1405c;

    /* renamed from: d  reason: collision with root package name */
    private View f1406d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1407e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1408f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1409g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1410h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1411i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1412j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1413k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1414l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1415m;

    /* renamed from: n  reason: collision with root package name */
    private c f1416n;

    /* renamed from: o  reason: collision with root package name */
    private int f1417o;

    /* renamed from: p  reason: collision with root package name */
    private int f1418p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1419q;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final j.a f1420a;

        a() {
            this.f1420a = new j.a(b1.this.f1403a.getContext(), 0, 16908332, 0, 0, b1.this.f1411i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b1 b1Var = b1.this;
            Window.Callback callback = b1Var.f1414l;
            if (callback == null || !b1Var.f1415m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1420a);
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    class b extends androidx.core.view.g0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1422a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1423b;

        b(int i10) {
            this.f1423b = i10;
        }

        @Override // androidx.core.view.g0, androidx.core.view.f0
        public void a(View view) {
            this.f1422a = true;
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            if (this.f1422a) {
                return;
            }
            b1.this.f1403a.setVisibility(this.f1423b);
        }

        @Override // androidx.core.view.g0, androidx.core.view.f0
        public void c(View view) {
            b1.this.f1403a.setVisibility(0);
        }
    }

    public b1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, d.h.f28777a, d.e.f28718n);
    }

    private void G(CharSequence charSequence) {
        this.f1411i = charSequence;
        if ((this.f1404b & 8) != 0) {
            this.f1403a.setTitle(charSequence);
            if (this.f1410h) {
                androidx.core.view.z.t0(this.f1403a.getRootView(), charSequence);
            }
        }
    }

    private void H() {
        if ((this.f1404b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1413k)) {
                this.f1403a.setNavigationContentDescription(this.f1418p);
            } else {
                this.f1403a.setNavigationContentDescription(this.f1413k);
            }
        }
    }

    private void I() {
        if ((this.f1404b & 4) != 0) {
            Toolbar toolbar = this.f1403a;
            Drawable drawable = this.f1409g;
            if (drawable == null) {
                drawable = this.f1419q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1403a.setNavigationIcon((Drawable) null);
    }

    private void J() {
        Drawable drawable;
        int i10 = this.f1404b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f1408f;
            if (drawable == null) {
                drawable = this.f1407e;
            }
        } else {
            drawable = this.f1407e;
        }
        this.f1403a.setLogo(drawable);
    }

    private int z() {
        if (this.f1403a.getNavigationIcon() != null) {
            this.f1419q = this.f1403a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    public void A(int i10) {
        if (i10 == this.f1418p) {
            return;
        }
        this.f1418p = i10;
        if (TextUtils.isEmpty(this.f1403a.getNavigationContentDescription())) {
            C(this.f1418p);
        }
    }

    public void B(Drawable drawable) {
        this.f1408f = drawable;
        J();
    }

    public void C(int i10) {
        D(i10 == 0 ? null : getContext().getString(i10));
    }

    public void D(CharSequence charSequence) {
        this.f1413k = charSequence;
        H();
    }

    public void E(Drawable drawable) {
        this.f1409g = drawable;
        I();
    }

    public void F(CharSequence charSequence) {
        this.f1410h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.f0
    public boolean a() {
        return this.f1403a.d();
    }

    @Override // androidx.appcompat.widget.f0
    public boolean b() {
        return this.f1403a.w();
    }

    @Override // androidx.appcompat.widget.f0
    public boolean c() {
        return this.f1403a.R();
    }

    @Override // androidx.appcompat.widget.f0
    public void collapseActionView() {
        this.f1403a.e();
    }

    @Override // androidx.appcompat.widget.f0
    public void d(Menu menu, j.a aVar) {
        if (this.f1416n == null) {
            c cVar = new c(this.f1403a.getContext());
            this.f1416n = cVar;
            cVar.p(d.f.f28737g);
        }
        this.f1416n.d(aVar);
        this.f1403a.L((androidx.appcompat.view.menu.e) menu, this.f1416n);
    }

    @Override // androidx.appcompat.widget.f0
    public boolean e() {
        return this.f1403a.B();
    }

    @Override // androidx.appcompat.widget.f0
    public void f() {
        this.f1415m = true;
    }

    @Override // androidx.appcompat.widget.f0
    public boolean g() {
        return this.f1403a.A();
    }

    @Override // androidx.appcompat.widget.f0
    public Context getContext() {
        return this.f1403a.getContext();
    }

    @Override // androidx.appcompat.widget.f0
    public CharSequence getTitle() {
        return this.f1403a.getTitle();
    }

    @Override // androidx.appcompat.widget.f0
    public boolean h() {
        return this.f1403a.v();
    }

    @Override // androidx.appcompat.widget.f0
    public void i(int i10) {
        View view;
        int i11 = this.f1404b ^ i10;
        this.f1404b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1403a.setTitle(this.f1411i);
                    this.f1403a.setSubtitle(this.f1412j);
                } else {
                    this.f1403a.setTitle((CharSequence) null);
                    this.f1403a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f1406d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f1403a.addView(view);
            } else {
                this.f1403a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.f0
    public void j(CharSequence charSequence) {
        this.f1412j = charSequence;
        if ((this.f1404b & 8) != 0) {
            this.f1403a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.f0
    public Menu k() {
        return this.f1403a.getMenu();
    }

    @Override // androidx.appcompat.widget.f0
    public int l() {
        return this.f1417o;
    }

    @Override // androidx.appcompat.widget.f0
    public androidx.core.view.e0 m(int i10, long j10) {
        return androidx.core.view.z.d(this.f1403a).a(i10 == 0 ? 1.0f : 0.0f).d(j10).f(new b(i10));
    }

    @Override // androidx.appcompat.widget.f0
    public ViewGroup n() {
        return this.f1403a;
    }

    @Override // androidx.appcompat.widget.f0
    public void o(boolean z10) {
    }

    @Override // androidx.appcompat.widget.f0
    public void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.f0
    public void q(boolean z10) {
        this.f1403a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.f0
    public void r() {
        this.f1403a.f();
    }

    @Override // androidx.appcompat.widget.f0
    public View s() {
        return this.f1406d;
    }

    @Override // androidx.appcompat.widget.f0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.f0
    public void setVisibility(int i10) {
        this.f1403a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.f0
    public void setWindowCallback(Window.Callback callback) {
        this.f1414l = callback;
    }

    @Override // androidx.appcompat.widget.f0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f1410h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.f0
    public void t(r0 r0Var) {
        View view = this.f1405c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1403a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1405c);
            }
        }
        this.f1405c = r0Var;
        if (r0Var == null || this.f1417o != 2) {
            return;
        }
        this.f1403a.addView(r0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1405c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f820a = 8388691;
        r0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.f0
    public void u(int i10) {
        B(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.f0
    public void v(j.a aVar, e.a aVar2) {
        this.f1403a.M(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.f0
    public int w() {
        return this.f1404b;
    }

    @Override // androidx.appcompat.widget.f0
    public void x(View view) {
        View view2 = this.f1406d;
        if (view2 != null && (this.f1404b & 16) != 0) {
            this.f1403a.removeView(view2);
        }
        this.f1406d = view;
        if (view == null || (this.f1404b & 16) == 0) {
            return;
        }
        this.f1403a.addView(view);
    }

    @Override // androidx.appcompat.widget.f0
    public void y() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public b1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1417o = 0;
        this.f1418p = 0;
        this.f1403a = toolbar;
        this.f1411i = toolbar.getTitle();
        this.f1412j = toolbar.getSubtitle();
        this.f1410h = this.f1411i != null;
        this.f1409g = toolbar.getNavigationIcon();
        z0 v10 = z0.v(toolbar.getContext(), null, d.j.f28795a, d.a.f28657c, 0);
        this.f1419q = v10.g(d.j.f28850l);
        if (z10) {
            CharSequence p10 = v10.p(d.j.f28880r);
            if (!TextUtils.isEmpty(p10)) {
                F(p10);
            }
            CharSequence p11 = v10.p(d.j.f28870p);
            if (!TextUtils.isEmpty(p11)) {
                j(p11);
            }
            Drawable g10 = v10.g(d.j.f28860n);
            if (g10 != null) {
                B(g10);
            }
            Drawable g11 = v10.g(d.j.f28855m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f1409g == null && (drawable = this.f1419q) != null) {
                E(drawable);
            }
            i(v10.k(d.j.f28830h, 0));
            int n10 = v10.n(d.j.f28825g, 0);
            if (n10 != 0) {
                x(LayoutInflater.from(this.f1403a.getContext()).inflate(n10, (ViewGroup) this.f1403a, false));
                i(this.f1404b | 16);
            }
            int m10 = v10.m(d.j.f28840j, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1403a.getLayoutParams();
                layoutParams.height = m10;
                this.f1403a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(d.j.f28820f, -1);
            int e11 = v10.e(d.j.f28815e, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f1403a.K(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(d.j.f28885s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f1403a;
                toolbar2.O(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(d.j.f28875q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f1403a;
                toolbar3.N(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(d.j.f28865o, 0);
            if (n13 != 0) {
                this.f1403a.setPopupTheme(n13);
            }
        } else {
            this.f1404b = z();
        }
        v10.w();
        A(i10);
        this.f1413k = this.f1403a.getNavigationContentDescription();
        this.f1403a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.f0
    public void setIcon(Drawable drawable) {
        this.f1407e = drawable;
        J();
    }
}
