package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.n0;
import androidx.core.view.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: v  reason: collision with root package name */
    private static final int f1139v = d.g.f28769m;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1140b;

    /* renamed from: c  reason: collision with root package name */
    private final e f1141c;

    /* renamed from: d  reason: collision with root package name */
    private final d f1142d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1143e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1144f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1145g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1146h;

    /* renamed from: i  reason: collision with root package name */
    final n0 f1147i;

    /* renamed from: l  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1150l;

    /* renamed from: m  reason: collision with root package name */
    private View f1151m;

    /* renamed from: n  reason: collision with root package name */
    View f1152n;

    /* renamed from: o  reason: collision with root package name */
    private j.a f1153o;

    /* renamed from: p  reason: collision with root package name */
    ViewTreeObserver f1154p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1155q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1156r;

    /* renamed from: s  reason: collision with root package name */
    private int f1157s;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1159u;

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1148j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1149k = new b();

    /* renamed from: t  reason: collision with root package name */
    private int f1158t = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f1147i.w()) {
                return;
            }
            View view = l.this.f1152n;
            if (view != null && view.isShown()) {
                l.this.f1147i.show();
            } else {
                l.this.dismiss();
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f1154p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f1154p = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f1154p.removeGlobalOnLayoutListener(lVar.f1148j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f1140b = context;
        this.f1141c = eVar;
        this.f1143e = z10;
        this.f1142d = new d(eVar, LayoutInflater.from(context), z10, f1139v);
        this.f1145g = i10;
        this.f1146h = i11;
        Resources resources = context.getResources();
        this.f1144f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.d.f28693d));
        this.f1151m = view;
        this.f1147i = new n0(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f1155q || (view = this.f1151m) == null) {
            return false;
        }
        this.f1152n = view;
        this.f1147i.F(this);
        this.f1147i.G(this);
        this.f1147i.E(true);
        View view2 = this.f1152n;
        boolean z10 = this.f1154p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1154p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1148j);
        }
        view2.addOnAttachStateChangeListener(this.f1149k);
        this.f1147i.y(view2);
        this.f1147i.B(this.f1158t);
        if (!this.f1156r) {
            this.f1157s = h.m(this.f1142d, null, this.f1140b, this.f1144f);
            this.f1156r = true;
        }
        this.f1147i.A(this.f1157s);
        this.f1147i.D(2);
        this.f1147i.C(l());
        this.f1147i.show();
        ListView o10 = this.f1147i.o();
        o10.setOnKeyListener(this);
        if (this.f1159u && this.f1141c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1140b).inflate(d.g.f28768l, (ViewGroup) o10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1141c.x());
            }
            frameLayout.setEnabled(false);
            o10.addHeaderView(frameLayout, null, false);
        }
        this.f1147i.m(this.f1142d);
        this.f1147i.show();
        return true;
    }

    @Override // j.e
    public boolean a() {
        return !this.f1155q && this.f1147i.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        if (eVar != this.f1141c) {
            return;
        }
        dismiss();
        j.a aVar = this.f1153o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1153o = aVar;
    }

    @Override // j.e
    public void dismiss() {
        if (a()) {
            this.f1147i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f1140b, mVar, this.f1152n, this.f1143e, this.f1145g, this.f1146h);
            iVar.j(this.f1153o);
            iVar.g(h.w(mVar));
            iVar.i(this.f1150l);
            this.f1150l = null;
            this.f1141c.e(false);
            int c10 = this.f1147i.c();
            int l10 = this.f1147i.l();
            if ((Gravity.getAbsoluteGravity(this.f1158t, z.C(this.f1151m)) & 7) == 5) {
                c10 += this.f1151m.getWidth();
            }
            if (iVar.n(c10, l10)) {
                j.a aVar = this.f1153o;
                if (aVar != null) {
                    aVar.c(mVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        this.f1156r = false;
        d dVar = this.f1142d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void j(e eVar) {
    }

    @Override // androidx.appcompat.view.menu.h
    public void n(View view) {
        this.f1151m = view;
    }

    @Override // j.e
    public ListView o() {
        return this.f1147i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1155q = true;
        this.f1141c.close();
        ViewTreeObserver viewTreeObserver = this.f1154p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1154p = this.f1152n.getViewTreeObserver();
            }
            this.f1154p.removeGlobalOnLayoutListener(this.f1148j);
            this.f1154p = null;
        }
        this.f1152n.removeOnAttachStateChangeListener(this.f1149k);
        PopupWindow.OnDismissListener onDismissListener = this.f1150l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void q(boolean z10) {
        this.f1142d.d(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(int i10) {
        this.f1158t = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f1147i.e(i10);
    }

    @Override // j.e
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1150l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z10) {
        this.f1159u = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f1147i.i(i10);
    }
}
