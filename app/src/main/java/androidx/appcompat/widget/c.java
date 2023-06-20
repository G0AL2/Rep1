package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuPresenter.java */
/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.a implements b.a {
    final f A;
    int B;

    /* renamed from: i  reason: collision with root package name */
    d f1425i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f1426j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1427k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f1428l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1429m;

    /* renamed from: n  reason: collision with root package name */
    private int f1430n;

    /* renamed from: o  reason: collision with root package name */
    private int f1431o;

    /* renamed from: p  reason: collision with root package name */
    private int f1432p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1433q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f1434r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1435s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1436t;

    /* renamed from: u  reason: collision with root package name */
    private int f1437u;

    /* renamed from: v  reason: collision with root package name */
    private final SparseBooleanArray f1438v;

    /* renamed from: w  reason: collision with root package name */
    e f1439w;

    /* renamed from: x  reason: collision with root package name */
    a f1440x;

    /* renamed from: y  reason: collision with root package name */
    RunnableC0037c f1441y;

    /* renamed from: z  reason: collision with root package name */
    private b f1442z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, d.a.f28666l);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.f1425i;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f1015h : view2);
            }
            j(c.this.A);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.f1440x = null;
            cVar.B = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public j.e a() {
            a aVar = c.this.f1440x;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0037c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private e f1445a;

        public RunnableC0037c(e eVar) {
            this.f1445a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f1010c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f1010c.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f1015h;
            if (view != null && view.getWindowToken() != null && this.f1445a.m()) {
                c.this.f1439w = this.f1445a;
            }
            c.this.f1441y = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class d extends r implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        /* loaded from: classes.dex */
        class a extends j0 {
            a(View view, c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.j0
            public j.e b() {
                e eVar = c.this.f1439w;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.j0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.j0
            public boolean d() {
                c cVar = c.this;
                if (cVar.f1441y != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, d.a.f28665k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            c1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, d.a.f28666l);
            h(8388613);
            j(c.this.A);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f1010c != null) {
                ((androidx.appcompat.view.menu.a) c.this).f1010c.close();
            }
            c.this.f1439w = null;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m10 = c.this.m();
            if (m10 != null) {
                m10.b(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f1010c) {
                return false;
            }
            c.this.B = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m10 = c.this.m();
            if (m10 != null) {
                return m10.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, d.g.f28759c, d.g.f28758b);
        this.f1438v = new SparseBooleanArray();
        this.A = new f();
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1015h;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1425i;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1427k) {
            return this.f1426j;
        }
        return null;
    }

    public boolean B() {
        androidx.appcompat.view.menu.k kVar;
        RunnableC0037c runnableC0037c = this.f1441y;
        if (runnableC0037c != null && (kVar = this.f1015h) != null) {
            ((View) kVar).removeCallbacks(runnableC0037c);
            this.f1441y = null;
            return true;
        }
        e eVar = this.f1439w;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }

    public boolean C() {
        a aVar = this.f1440x;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean D() {
        return this.f1441y != null || E();
    }

    public boolean E() {
        e eVar = this.f1439w;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f1433q) {
            this.f1432p = i.a.b(this.f1009b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f1010c;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.f1436t = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f1015h = actionMenuView;
        actionMenuView.a(this.f1010c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1425i;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1427k = true;
        this.f1426j = drawable;
    }

    public void J(boolean z10) {
        this.f1428l = z10;
        this.f1429m = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1428l || E() || (eVar = this.f1010c) == null || this.f1015h == null || this.f1441y != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0037c runnableC0037c = new RunnableC0037c(new e(this.f1009b, this.f1010c, this.f1425i, true));
        this.f1441y = runnableC0037c;
        ((View) this.f1015h).post(runnableC0037c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        y();
        super.b(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean e(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (mVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.m mVar2 = mVar;
            while (mVar2.e0() != this.f1010c) {
                mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
            }
            View z11 = z(mVar2.getItem());
            if (z11 == null) {
                return false;
            }
            mVar.getItem().getItemId();
            int size = mVar.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                MenuItem item = mVar.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            a aVar = new a(this.f1009b, mVar, z11);
            this.f1440x = aVar;
            aVar.g(z10);
            this.f1440x.k();
            super.e(mVar);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.f1015h).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f1010c;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> s10 = eVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b a10 = s10.get(i10).a();
                if (a10 != null) {
                    a10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f1010c;
        ArrayList<androidx.appcompat.view.menu.g> z12 = eVar2 != null ? eVar2.z() : null;
        if (this.f1428l && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !z12.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1425i == null) {
                this.f1425i = new d(this.f1008a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1425i.getParent();
            if (viewGroup != this.f1015h) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1425i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1015h;
                actionMenuView.addView(this.f1425i, actionMenuView.F());
            }
        } else {
            d dVar = this.f1425i;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                androidx.appcompat.view.menu.k kVar = this.f1015h;
                if (parent == kVar) {
                    ((ViewGroup) kVar).removeView(this.f1425i);
                }
            }
        }
        ((ActionMenuView) this.f1015h).setOverflowReserved(this.f1428l);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f1010c;
        View view = null;
        int i14 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i15 = cVar.f1432p;
        int i16 = cVar.f1431o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1015h;
        boolean z10 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            androidx.appcompat.view.menu.g gVar = arrayList.get(i19);
            if (gVar.o()) {
                i17++;
            } else if (gVar.n()) {
                i18++;
            } else {
                z10 = true;
            }
            if (cVar.f1436t && gVar.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (cVar.f1428l && (z10 || i18 + i17 > i15)) {
            i15--;
        }
        int i20 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = cVar.f1438v;
        sparseBooleanArray.clear();
        if (cVar.f1434r) {
            int i21 = cVar.f1437u;
            i12 = i16 / i21;
            i11 = i21 + ((i16 % i21) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i22 = 0;
        int i23 = 0;
        while (i22 < i10) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i22);
            if (gVar2.o()) {
                View n10 = cVar.n(gVar2, view, viewGroup);
                if (cVar.f1434r) {
                    i12 -= ActionMenuView.L(n10, i11, i12, makeMeasureSpec, i14);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i23 == 0) {
                    i23 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z11 = sparseBooleanArray.get(groupId2);
                boolean z12 = (i20 > 0 || z11) && i16 > 0 && (!cVar.f1434r || i12 > 0);
                boolean z13 = z12;
                i13 = i10;
                if (z12) {
                    View n11 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.f1434r) {
                        int L = ActionMenuView.L(n11, i11, i12, makeMeasureSpec, 0);
                        i12 -= L;
                        if (L == 0) {
                            z13 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z14 = z13;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i23 == 0) {
                        i23 = measuredWidth2;
                    }
                    z12 = z14 & (!cVar.f1434r ? i16 + i23 <= 0 : i16 < 0);
                }
                if (z12 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z11) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i24 = 0; i24 < i22; i24++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i24);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i20++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z12) {
                    i20--;
                }
                gVar2.u(z12);
            } else {
                i13 = i10;
                gVar2.u(false);
                i22++;
                view = null;
                cVar = this;
                i10 = i13;
                i14 = 0;
            }
            i22++;
            view = null;
            cVar = this;
            i10 = i13;
            i14 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        i.a b10 = i.a.b(context);
        if (!this.f1429m) {
            this.f1428l = b10.h();
        }
        if (!this.f1435s) {
            this.f1430n = b10.c();
        }
        if (!this.f1433q) {
            this.f1432p = b10.d();
        }
        int i10 = this.f1430n;
        if (this.f1428l) {
            if (this.f1425i == null) {
                d dVar = new d(this.f1008a);
                this.f1425i = dVar;
                if (this.f1427k) {
                    dVar.setImageDrawable(this.f1426j);
                    this.f1426j = null;
                    this.f1427k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1425i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1425i.getMeasuredWidth();
        } else {
            this.f1425i = null;
        }
        this.f1431o = i10;
        this.f1437u = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void j(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.c(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1015h);
        if (this.f1442z == null) {
            this.f1442z = new b();
        }
        actionMenuItemView.setPopupCallback(this.f1442z);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1425i) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f1015h;
        androidx.appcompat.view.menu.k o10 = super.o(viewGroup);
        if (kVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
