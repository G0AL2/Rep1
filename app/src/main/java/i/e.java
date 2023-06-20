package i;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import i.b;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: c  reason: collision with root package name */
    private Context f31426c;

    /* renamed from: d  reason: collision with root package name */
    private ActionBarContextView f31427d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f31428e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<View> f31429f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f31430g;

    /* renamed from: h  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f31431h;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f31426c = context;
        this.f31427d = actionBarContextView;
        this.f31428e = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f31431h = S;
        S.R(this);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f31428e.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f31427d.l();
    }

    @Override // i.b
    public void c() {
        if (this.f31430g) {
            return;
        }
        this.f31430g = true;
        this.f31428e.b(this);
    }

    @Override // i.b
    public View d() {
        WeakReference<View> weakReference = this.f31429f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // i.b
    public Menu e() {
        return this.f31431h;
    }

    @Override // i.b
    public MenuInflater f() {
        return new g(this.f31427d.getContext());
    }

    @Override // i.b
    public CharSequence g() {
        return this.f31427d.getSubtitle();
    }

    @Override // i.b
    public CharSequence i() {
        return this.f31427d.getTitle();
    }

    @Override // i.b
    public void k() {
        this.f31428e.c(this, this.f31431h);
    }

    @Override // i.b
    public boolean l() {
        return this.f31427d.j();
    }

    @Override // i.b
    public void m(View view) {
        this.f31427d.setCustomView(view);
        this.f31429f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // i.b
    public void n(int i10) {
        o(this.f31426c.getString(i10));
    }

    @Override // i.b
    public void o(CharSequence charSequence) {
        this.f31427d.setSubtitle(charSequence);
    }

    @Override // i.b
    public void q(int i10) {
        r(this.f31426c.getString(i10));
    }

    @Override // i.b
    public void r(CharSequence charSequence) {
        this.f31427d.setTitle(charSequence);
    }

    @Override // i.b
    public void s(boolean z10) {
        super.s(z10);
        this.f31427d.setTitleOptional(z10);
    }
}
