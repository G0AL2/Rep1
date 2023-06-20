package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r0;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.h0;
import androidx.core.view.z;
import i.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public class o extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator C = new AccelerateInterpolator();
    private static final Interpolator D = new DecelerateInterpolator();
    final f0 A;
    final h0 B;

    /* renamed from: a  reason: collision with root package name */
    Context f942a;

    /* renamed from: b  reason: collision with root package name */
    private Context f943b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f944c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f945d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f946e;

    /* renamed from: f  reason: collision with root package name */
    androidx.appcompat.widget.f0 f947f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f948g;

    /* renamed from: h  reason: collision with root package name */
    View f949h;

    /* renamed from: i  reason: collision with root package name */
    r0 f950i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f951j;

    /* renamed from: k  reason: collision with root package name */
    d f952k;

    /* renamed from: l  reason: collision with root package name */
    i.b f953l;

    /* renamed from: m  reason: collision with root package name */
    b.a f954m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f955n;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<a.b> f956o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f957p;

    /* renamed from: q  reason: collision with root package name */
    private int f958q;

    /* renamed from: r  reason: collision with root package name */
    boolean f959r;

    /* renamed from: s  reason: collision with root package name */
    boolean f960s;

    /* renamed from: t  reason: collision with root package name */
    boolean f961t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f962u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f963v;

    /* renamed from: w  reason: collision with root package name */
    i.h f964w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f965x;

    /* renamed from: y  reason: collision with root package name */
    boolean f966y;

    /* renamed from: z  reason: collision with root package name */
    final f0 f967z;

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class a extends g0 {
        a() {
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            View view2;
            o oVar = o.this;
            if (oVar.f959r && (view2 = oVar.f949h) != null) {
                view2.setTranslationY(0.0f);
                o.this.f946e.setTranslationY(0.0f);
            }
            o.this.f946e.setVisibility(8);
            o.this.f946e.setTransitioning(false);
            o oVar2 = o.this;
            oVar2.f964w = null;
            oVar2.C();
            ActionBarOverlayLayout actionBarOverlayLayout = o.this.f945d;
            if (actionBarOverlayLayout != null) {
                z.n0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class b extends g0 {
        b() {
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            o oVar = o.this;
            oVar.f964w = null;
            oVar.f946e.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class c implements h0 {
        c() {
        }

        @Override // androidx.core.view.h0
        public void a(View view) {
            ((View) o.this.f946e.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends i.b implements e.a {

        /* renamed from: c  reason: collision with root package name */
        private final Context f971c;

        /* renamed from: d  reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f972d;

        /* renamed from: e  reason: collision with root package name */
        private b.a f973e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<View> f974f;

        public d(Context context, b.a aVar) {
            this.f971c = context;
            this.f973e = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.f972d = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f973e;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f973e == null) {
                return;
            }
            k();
            o.this.f948g.l();
        }

        @Override // i.b
        public void c() {
            o oVar = o.this;
            if (oVar.f952k != this) {
                return;
            }
            if (!o.B(oVar.f960s, oVar.f961t, false)) {
                o oVar2 = o.this;
                oVar2.f953l = this;
                oVar2.f954m = this.f973e;
            } else {
                this.f973e.b(this);
            }
            this.f973e = null;
            o.this.A(false);
            o.this.f948g.g();
            o oVar3 = o.this;
            oVar3.f945d.setHideOnContentScrollEnabled(oVar3.f966y);
            o.this.f952k = null;
        }

        @Override // i.b
        public View d() {
            WeakReference<View> weakReference = this.f974f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // i.b
        public Menu e() {
            return this.f972d;
        }

        @Override // i.b
        public MenuInflater f() {
            return new i.g(this.f971c);
        }

        @Override // i.b
        public CharSequence g() {
            return o.this.f948g.getSubtitle();
        }

        @Override // i.b
        public CharSequence i() {
            return o.this.f948g.getTitle();
        }

        @Override // i.b
        public void k() {
            if (o.this.f952k != this) {
                return;
            }
            this.f972d.d0();
            try {
                this.f973e.c(this, this.f972d);
            } finally {
                this.f972d.c0();
            }
        }

        @Override // i.b
        public boolean l() {
            return o.this.f948g.j();
        }

        @Override // i.b
        public void m(View view) {
            o.this.f948g.setCustomView(view);
            this.f974f = new WeakReference<>(view);
        }

        @Override // i.b
        public void n(int i10) {
            o(o.this.f942a.getResources().getString(i10));
        }

        @Override // i.b
        public void o(CharSequence charSequence) {
            o.this.f948g.setSubtitle(charSequence);
        }

        @Override // i.b
        public void q(int i10) {
            r(o.this.f942a.getResources().getString(i10));
        }

        @Override // i.b
        public void r(CharSequence charSequence) {
            o.this.f948g.setTitle(charSequence);
        }

        @Override // i.b
        public void s(boolean z10) {
            super.s(z10);
            o.this.f948g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f972d.d0();
            try {
                return this.f973e.d(this, this.f972d);
            } finally {
                this.f972d.c0();
            }
        }
    }

    public o(Activity activity, boolean z10) {
        new ArrayList();
        this.f956o = new ArrayList<>();
        this.f958q = 0;
        this.f959r = true;
        this.f963v = true;
        this.f967z = new a();
        this.A = new b();
        this.B = new c();
        this.f944c = activity;
        View decorView = activity.getWindow().getDecorView();
        I(decorView);
        if (z10) {
            return;
        }
        this.f949h = decorView.findViewById(16908290);
    }

    static boolean B(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    private androidx.appcompat.widget.f0 F(View view) {
        if (view instanceof androidx.appcompat.widget.f0) {
            return (androidx.appcompat.widget.f0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    private void H() {
        if (this.f962u) {
            this.f962u = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f945d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            S(false);
        }
    }

    private void I(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(d.f.f28746p);
        this.f945d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f947f = F(view.findViewById(d.f.f28731a));
        this.f948g = (ActionBarContextView) view.findViewById(d.f.f28736f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(d.f.f28733c);
        this.f946e = actionBarContainer;
        androidx.appcompat.widget.f0 f0Var = this.f947f;
        if (f0Var != null && this.f948g != null && actionBarContainer != null) {
            this.f942a = f0Var.getContext();
            boolean z10 = (this.f947f.w() & 4) != 0;
            if (z10) {
                this.f951j = true;
            }
            i.a b10 = i.a.b(this.f942a);
            P(b10.a() || z10);
            N(b10.g());
            TypedArray obtainStyledAttributes = this.f942a.obtainStyledAttributes(null, d.j.f28795a, d.a.f28657c, 0);
            if (obtainStyledAttributes.getBoolean(d.j.f28845k, false)) {
                O(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(d.j.f28835i, 0);
            if (dimensionPixelSize != 0) {
                M(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(o.class.getSimpleName() + " can only be used with a compatible window decor layout");
    }

    private void N(boolean z10) {
        this.f957p = z10;
        if (!z10) {
            this.f947f.t(null);
            this.f946e.setTabContainer(this.f950i);
        } else {
            this.f946e.setTabContainer(null);
            this.f947f.t(this.f950i);
        }
        boolean z11 = true;
        boolean z12 = G() == 2;
        r0 r0Var = this.f950i;
        if (r0Var != null) {
            if (z12) {
                r0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f945d;
                if (actionBarOverlayLayout != null) {
                    z.n0(actionBarOverlayLayout);
                }
            } else {
                r0Var.setVisibility(8);
            }
        }
        this.f947f.q(!this.f957p && z12);
        this.f945d.setHasNonEmbeddedTabs((this.f957p || !z12) ? false : false);
    }

    private boolean Q() {
        return z.U(this.f946e);
    }

    private void R() {
        if (this.f962u) {
            return;
        }
        this.f962u = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f945d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        S(false);
    }

    private void S(boolean z10) {
        if (B(this.f960s, this.f961t, this.f962u)) {
            if (this.f963v) {
                return;
            }
            this.f963v = true;
            E(z10);
        } else if (this.f963v) {
            this.f963v = false;
            D(z10);
        }
    }

    public void A(boolean z10) {
        e0 m10;
        e0 f10;
        if (z10) {
            R();
        } else {
            H();
        }
        if (!Q()) {
            if (z10) {
                this.f947f.setVisibility(4);
                this.f948g.setVisibility(0);
                return;
            }
            this.f947f.setVisibility(0);
            this.f948g.setVisibility(8);
            return;
        }
        if (z10) {
            f10 = this.f947f.m(4, 100L);
            m10 = this.f948g.f(0, 200L);
        } else {
            m10 = this.f947f.m(0, 200L);
            f10 = this.f948g.f(8, 100L);
        }
        i.h hVar = new i.h();
        hVar.d(f10, m10);
        hVar.h();
    }

    void C() {
        b.a aVar = this.f954m;
        if (aVar != null) {
            aVar.b(this.f953l);
            this.f953l = null;
            this.f954m = null;
        }
    }

    public void D(boolean z10) {
        View view;
        int[] iArr;
        i.h hVar = this.f964w;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f958q == 0 && (this.f965x || z10)) {
            this.f946e.setAlpha(1.0f);
            this.f946e.setTransitioning(true);
            i.h hVar2 = new i.h();
            float f10 = -this.f946e.getHeight();
            if (z10) {
                this.f946e.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            e0 k10 = z.d(this.f946e).k(f10);
            k10.i(this.B);
            hVar2.c(k10);
            if (this.f959r && (view = this.f949h) != null) {
                hVar2.c(z.d(view).k(f10));
            }
            hVar2.f(C);
            hVar2.e(250L);
            hVar2.g(this.f967z);
            this.f964w = hVar2;
            hVar2.h();
            return;
        }
        this.f967z.b(null);
    }

    public void E(boolean z10) {
        View view;
        View view2;
        int[] iArr;
        i.h hVar = this.f964w;
        if (hVar != null) {
            hVar.a();
        }
        this.f946e.setVisibility(0);
        if (this.f958q == 0 && (this.f965x || z10)) {
            this.f946e.setTranslationY(0.0f);
            float f10 = -this.f946e.getHeight();
            if (z10) {
                this.f946e.getLocationInWindow(new int[]{0, 0});
                f10 -= iArr[1];
            }
            this.f946e.setTranslationY(f10);
            i.h hVar2 = new i.h();
            e0 k10 = z.d(this.f946e).k(0.0f);
            k10.i(this.B);
            hVar2.c(k10);
            if (this.f959r && (view2 = this.f949h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(z.d(this.f949h).k(0.0f));
            }
            hVar2.f(D);
            hVar2.e(250L);
            hVar2.g(this.A);
            this.f964w = hVar2;
            hVar2.h();
        } else {
            this.f946e.setAlpha(1.0f);
            this.f946e.setTranslationY(0.0f);
            if (this.f959r && (view = this.f949h) != null) {
                view.setTranslationY(0.0f);
            }
            this.A.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f945d;
        if (actionBarOverlayLayout != null) {
            z.n0(actionBarOverlayLayout);
        }
    }

    public int G() {
        return this.f947f.l();
    }

    public void J(View view) {
        this.f947f.x(view);
    }

    public void K(boolean z10) {
        L(z10 ? 4 : 0, 4);
    }

    public void L(int i10, int i11) {
        int w10 = this.f947f.w();
        if ((i11 & 4) != 0) {
            this.f951j = true;
        }
        this.f947f.i((i10 & i11) | ((~i11) & w10));
    }

    public void M(float f10) {
        z.y0(this.f946e, f10);
    }

    public void O(boolean z10) {
        if (z10 && !this.f945d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f966y = z10;
        this.f945d.setHideOnContentScrollEnabled(z10);
    }

    public void P(boolean z10) {
        this.f947f.o(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f961t) {
            this.f961t = false;
            S(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f959r = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f961t) {
            return;
        }
        this.f961t = true;
        S(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        i.h hVar = this.f964w;
        if (hVar != null) {
            hVar.a();
            this.f964w = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        androidx.appcompat.widget.f0 f0Var = this.f947f;
        if (f0Var == null || !f0Var.h()) {
            return false;
        }
        this.f947f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f955n) {
            return;
        }
        this.f955n = z10;
        int size = this.f956o.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f956o.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public View i() {
        return this.f947f.s();
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f947f.w();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f943b == null) {
            TypedValue typedValue = new TypedValue();
            this.f942a.getTheme().resolveAttribute(d.a.f28661g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f943b = new ContextThemeWrapper(this.f942a, i10);
            } else {
                this.f943b = this.f942a;
            }
        }
        return this.f943b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        N(i.a.b(this.f942a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f952k;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        e10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f958q = i10;
    }

    @Override // androidx.appcompat.app.a
    public void r(int i10) {
        J(LayoutInflater.from(k()).inflate(i10, this.f947f.n(), false));
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        if (this.f951j) {
            return;
        }
        K(z10);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        L(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        L(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        L(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z10) {
        i.h hVar;
        this.f965x = z10;
        if (z10 || (hVar = this.f964w) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f947f.j(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void y(CharSequence charSequence) {
        this.f947f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public i.b z(b.a aVar) {
        d dVar = this.f952k;
        if (dVar != null) {
            dVar.c();
        }
        this.f945d.setHideOnContentScrollEnabled(false);
        this.f948g.k();
        d dVar2 = new d(this.f948g.getContext(), aVar);
        if (dVar2.t()) {
            this.f952k = dVar2;
            dVar2.k();
            this.f948g.h(dVar2);
            A(true);
            return dVar2;
        }
        return null;
    }

    public o(Dialog dialog) {
        new ArrayList();
        this.f956o = new ArrayList<>();
        this.f958q = 0;
        this.f959r = true;
        this.f963v = true;
        this.f967z = new a();
        this.A = new b();
        this.B = new c();
        I(dialog.getWindow().getDecorView());
    }
}
