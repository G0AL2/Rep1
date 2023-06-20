package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.app.g;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.f0;
import androidx.core.view.z;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ToolbarActionBar.java */
/* loaded from: classes.dex */
public class l extends androidx.appcompat.app.a {

    /* renamed from: a  reason: collision with root package name */
    final f0 f917a;

    /* renamed from: b  reason: collision with root package name */
    final Window.Callback f918b;

    /* renamed from: c  reason: collision with root package name */
    final g.i f919c;

    /* renamed from: d  reason: collision with root package name */
    boolean f920d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f921e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f922f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<a.b> f923g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f924h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Toolbar.f f925i;

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.B();
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return l.this.f918b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class c implements j.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f928a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f928a) {
                return;
            }
            this.f928a = true;
            l.this.f917a.r();
            l.this.f918b.onPanelClosed(108, eVar);
            this.f928a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            l.this.f918b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    public final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (l.this.f917a.e()) {
                l.this.f918b.onPanelClosed(108, eVar);
            } else if (l.this.f918b.onPreparePanel(0, null, eVar)) {
                l.this.f918b.onMenuOpened(108, eVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar.java */
    /* loaded from: classes.dex */
    private class e implements g.i {
        e() {
        }

        @Override // androidx.appcompat.app.g.i
        public boolean a(int i10) {
            if (i10 == 0) {
                l lVar = l.this;
                if (lVar.f920d) {
                    return false;
                }
                lVar.f917a.f();
                l.this.f920d = true;
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.g.i
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(l.this.f917a.getContext());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f925i = bVar;
        h0.g.f(toolbar);
        b1 b1Var = new b1(toolbar, false);
        this.f917a = b1Var;
        this.f918b = (Window.Callback) h0.g.f(callback);
        b1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        b1Var.setWindowTitle(charSequence);
        this.f919c = new e();
    }

    private Menu A() {
        if (!this.f921e) {
            this.f917a.v(new c(), new d());
            this.f921e = true;
        }
        return this.f917a.k();
    }

    void B() {
        Menu A = A();
        androidx.appcompat.view.menu.e eVar = A instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) A : null;
        if (eVar != null) {
            eVar.d0();
        }
        try {
            A.clear();
            if (!this.f918b.onCreatePanelMenu(0, A) || !this.f918b.onPreparePanel(0, null, A)) {
                A.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.c0();
            }
        }
    }

    public void C(View view) {
        D(view, new a.C0033a(-2, -2));
    }

    public void D(View view, a.C0033a c0033a) {
        if (view != null) {
            view.setLayoutParams(c0033a);
        }
        this.f917a.x(view);
    }

    public void E(int i10, int i11) {
        this.f917a.i((i10 & i11) | ((~i11) & this.f917a.w()));
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.f917a.b();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (this.f917a.h()) {
            this.f917a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f922f) {
            return;
        }
        this.f922f = z10;
        int size = this.f923g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f923g.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public View i() {
        return this.f917a.s();
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f917a.w();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        return this.f917a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f917a.n().removeCallbacks(this.f924h);
        z.i0(this.f917a.n(), this.f924h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void n() {
        this.f917a.n().removeCallbacks(this.f924h);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu A = A();
        if (A != null) {
            A.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return A.performShortcut(i10, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.f917a.c();
    }

    @Override // androidx.appcompat.app.a
    public void r(int i10) {
        C(LayoutInflater.from(this.f917a.getContext()).inflate(i10, this.f917a.n(), false));
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        E(z10 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        E(z10 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        E(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f917a.j(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void y(CharSequence charSequence) {
        this.f917a.setWindowTitle(charSequence);
    }
}
