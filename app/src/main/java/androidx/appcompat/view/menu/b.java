package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.m0;
import androidx.appcompat.widget.n0;
import androidx.core.view.z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int B = d.g.f28761e;
    boolean A;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1016b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1017c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1018d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1019e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1020f;

    /* renamed from: g  reason: collision with root package name */
    final Handler f1021g;

    /* renamed from: o  reason: collision with root package name */
    private View f1029o;

    /* renamed from: p  reason: collision with root package name */
    View f1030p;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1032r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1033s;

    /* renamed from: t  reason: collision with root package name */
    private int f1034t;

    /* renamed from: u  reason: collision with root package name */
    private int f1035u;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1037w;

    /* renamed from: x  reason: collision with root package name */
    private j.a f1038x;

    /* renamed from: y  reason: collision with root package name */
    ViewTreeObserver f1039y;

    /* renamed from: z  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1040z;

    /* renamed from: h  reason: collision with root package name */
    private final List<e> f1022h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    final List<d> f1023i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1024j = new a();

    /* renamed from: k  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1025k = new View$OnAttachStateChangeListenerC0035b();

    /* renamed from: l  reason: collision with root package name */
    private final m0 f1026l = new c();

    /* renamed from: m  reason: collision with root package name */
    private int f1027m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f1028n = 0;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1036v = false;

    /* renamed from: q  reason: collision with root package name */
    private int f1031q = C();

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f1023i.size() <= 0 || b.this.f1023i.get(0).f1048a.w()) {
                return;
            }
            View view = b.this.f1030p;
            if (view != null && view.isShown()) {
                for (d dVar : b.this.f1023i) {
                    dVar.f1048a.show();
                }
                return;
            }
            b.this.dismiss();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC0035b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0035b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f1039y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f1039y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f1039y.removeGlobalOnLayoutListener(bVar.f1024j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    class c implements m0 {

        /* compiled from: CascadingMenuPopup.java */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f1044a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MenuItem f1045b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ e f1046c;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f1044a = dVar;
                this.f1045b = menuItem;
                this.f1046c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1044a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.f1049b.e(false);
                    b.this.A = false;
                }
                if (this.f1045b.isEnabled() && this.f1045b.hasSubMenu()) {
                    this.f1046c.L(this.f1045b, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.m0
        public void d(e eVar, MenuItem menuItem) {
            b.this.f1021g.removeCallbacksAndMessages(null);
            int size = b.this.f1023i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f1023i.get(i10).f1049b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f1021g.postAtTime(new a(i11 < b.this.f1023i.size() ? b.this.f1023i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.m0
        public void n(e eVar, MenuItem menuItem) {
            b.this.f1021g.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final n0 f1048a;

        /* renamed from: b  reason: collision with root package name */
        public final e f1049b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1050c;

        public d(n0 n0Var, e eVar, int i10) {
            this.f1048a = n0Var;
            this.f1049b = eVar;
            this.f1050c = i10;
        }

        public ListView a() {
            return this.f1048a.o();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z10) {
        this.f1016b = context;
        this.f1029o = view;
        this.f1018d = i10;
        this.f1019e = i11;
        this.f1020f = z10;
        Resources resources = context.getResources();
        this.f1017c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.d.f28693d));
        this.f1021g = new Handler();
    }

    private MenuItem A(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View B(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i10;
        int firstVisiblePosition;
        MenuItem A = A(dVar.f1049b, eVar);
        if (A == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (A == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int C() {
        return z.C(this.f1029o) == 1 ? 0 : 1;
    }

    private int D(int i10) {
        List<d> list = this.f1023i;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1030p.getWindowVisibleDisplayFrame(rect);
        return this.f1031q == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void E(e eVar) {
        d dVar;
        View view;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f1016b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f1020f, B);
        if (!a() && this.f1036v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.w(eVar));
        }
        int m10 = h.m(dVar2, null, this.f1016b, this.f1017c);
        n0 y10 = y();
        y10.m(dVar2);
        y10.A(m10);
        y10.B(this.f1028n);
        if (this.f1023i.size() > 0) {
            List<d> list = this.f1023i;
            dVar = list.get(list.size() - 1);
            view = B(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            y10.P(false);
            y10.M(null);
            int D = D(m10);
            boolean z10 = D == 1;
            this.f1031q = D;
            if (Build.VERSION.SDK_INT >= 26) {
                y10.y(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.f1029o.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1028n & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1029o.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f1028n & 5) == 5) {
                if (!z10) {
                    m10 = view.getWidth();
                    i12 = i10 - m10;
                }
                i12 = i10 + m10;
            } else {
                if (z10) {
                    m10 = view.getWidth();
                    i12 = i10 + m10;
                }
                i12 = i10 - m10;
            }
            y10.e(i12);
            y10.H(true);
            y10.i(i11);
        } else {
            if (this.f1032r) {
                y10.e(this.f1034t);
            }
            if (this.f1033s) {
                y10.i(this.f1035u);
            }
            y10.C(l());
        }
        this.f1023i.add(new d(y10, eVar, this.f1031q));
        y10.show();
        ListView o10 = y10.o();
        o10.setOnKeyListener(this);
        if (dVar == null && this.f1037w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(d.g.f28768l, (ViewGroup) o10, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            o10.addHeaderView(frameLayout, null, false);
            y10.show();
        }
    }

    private n0 y() {
        n0 n0Var = new n0(this.f1016b, null, this.f1018d, this.f1019e);
        n0Var.O(this.f1026l);
        n0Var.G(this);
        n0Var.F(this);
        n0Var.y(this.f1029o);
        n0Var.B(this.f1028n);
        n0Var.E(true);
        n0Var.D(2);
        return n0Var;
    }

    private int z(e eVar) {
        int size = this.f1023i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f1023i.get(i10).f1049b) {
                return i10;
            }
        }
        return -1;
    }

    @Override // j.e
    public boolean a() {
        return this.f1023i.size() > 0 && this.f1023i.get(0).f1048a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        int z11 = z(eVar);
        if (z11 < 0) {
            return;
        }
        int i10 = z11 + 1;
        if (i10 < this.f1023i.size()) {
            this.f1023i.get(i10).f1049b.e(false);
        }
        d remove = this.f1023i.remove(z11);
        remove.f1049b.O(this);
        if (this.A) {
            remove.f1048a.N(null);
            remove.f1048a.z(0);
        }
        remove.f1048a.dismiss();
        int size = this.f1023i.size();
        if (size > 0) {
            this.f1031q = this.f1023i.get(size - 1).f1050c;
        } else {
            this.f1031q = C();
        }
        if (size != 0) {
            if (z10) {
                this.f1023i.get(0).f1049b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f1038x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1039y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1039y.removeGlobalOnLayoutListener(this.f1024j);
            }
            this.f1039y = null;
        }
        this.f1030p.removeOnAttachStateChangeListener(this.f1025k);
        this.f1040z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1038x = aVar;
    }

    @Override // j.e
    public void dismiss() {
        int size = this.f1023i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1023i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f1048a.a()) {
                    dVar.f1048a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        for (d dVar : this.f1023i) {
            if (mVar == dVar.f1049b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (mVar.hasVisibleItems()) {
            j(mVar);
            j.a aVar = this.f1038x;
            if (aVar != null) {
                aVar.c(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        for (d dVar : this.f1023i) {
            h.x(dVar.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void j(e eVar) {
        eVar.c(this, this.f1016b);
        if (a()) {
            E(eVar);
        } else {
            this.f1022h.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean k() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void n(View view) {
        if (this.f1029o != view) {
            this.f1029o = view;
            this.f1028n = androidx.core.view.e.b(this.f1027m, z.C(view));
        }
    }

    @Override // j.e
    public ListView o() {
        if (this.f1023i.isEmpty()) {
            return null;
        }
        List<d> list = this.f1023i;
        return list.get(list.size() - 1).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1023i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1023i.get(i10);
            if (!dVar.f1048a.a()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f1049b.e(false);
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
        this.f1036v = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(int i10) {
        if (this.f1027m != i10) {
            this.f1027m = i10;
            this.f1028n = androidx.core.view.e.b(i10, z.C(this.f1029o));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f1032r = true;
        this.f1034t = i10;
    }

    @Override // j.e
    public void show() {
        if (a()) {
            return;
        }
        for (e eVar : this.f1022h) {
            E(eVar);
        }
        this.f1022h.clear();
        View view = this.f1029o;
        this.f1030p = view;
        if (view != null) {
            boolean z10 = this.f1039y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1039y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1024j);
            }
            this.f1030p.addOnAttachStateChangeListener(this.f1025k);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1040z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(boolean z10) {
        this.f1037w = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(int i10) {
        this.f1033s = true;
        this.f1035u = i10;
    }
}
