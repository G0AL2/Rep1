package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private boolean B;
    private boolean C;
    private final ArrayList<View> D;
    private final ArrayList<View> E;
    private final int[] F;
    final androidx.core.view.i G;
    private ArrayList<MenuItem> H;
    f I;
    private final ActionMenuView.e J;
    private b1 K;
    private androidx.appcompat.widget.c L;
    private d M;
    private j.a N;
    private e.a O;
    private boolean P;
    private final Runnable Q;

    /* renamed from: a  reason: collision with root package name */
    private ActionMenuView f1328a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1329b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f1330c;

    /* renamed from: d  reason: collision with root package name */
    private ImageButton f1331d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f1332e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1333f;

    /* renamed from: g  reason: collision with root package name */
    private CharSequence f1334g;

    /* renamed from: h  reason: collision with root package name */
    ImageButton f1335h;

    /* renamed from: i  reason: collision with root package name */
    View f1336i;

    /* renamed from: j  reason: collision with root package name */
    private Context f1337j;

    /* renamed from: k  reason: collision with root package name */
    private int f1338k;

    /* renamed from: l  reason: collision with root package name */
    private int f1339l;

    /* renamed from: m  reason: collision with root package name */
    private int f1340m;

    /* renamed from: n  reason: collision with root package name */
    int f1341n;

    /* renamed from: o  reason: collision with root package name */
    private int f1342o;

    /* renamed from: p  reason: collision with root package name */
    private int f1343p;

    /* renamed from: q  reason: collision with root package name */
    private int f1344q;

    /* renamed from: r  reason: collision with root package name */
    private int f1345r;

    /* renamed from: s  reason: collision with root package name */
    private int f1346s;

    /* renamed from: t  reason: collision with root package name */
    private q0 f1347t;

    /* renamed from: u  reason: collision with root package name */
    private int f1348u;

    /* renamed from: v  reason: collision with root package name */
    private int f1349v;

    /* renamed from: w  reason: collision with root package name */
    private int f1350w;

    /* renamed from: x  reason: collision with root package name */
    private CharSequence f1351x;

    /* renamed from: y  reason: collision with root package name */
    private CharSequence f1352y;

    /* renamed from: z  reason: collision with root package name */
    private ColorStateList f1353z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.G.b(menuItem)) {
                return true;
            }
            f fVar = Toolbar.this.I;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.j {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.view.menu.e f1359a;

        /* renamed from: b  reason: collision with root package name */
        androidx.appcompat.view.menu.g f1360b;

        d() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1335h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1335h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1335h);
            }
            Toolbar.this.f1336i = gVar.getActionView();
            this.f1360b = gVar;
            ViewParent parent2 = Toolbar.this.f1336i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1336i);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f820a = 8388611 | (toolbar4.f1341n & 112);
                generateDefaultLayoutParams.f1362b = 2;
                toolbar4.f1336i.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1336i);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.f1336i;
            if (view instanceof i.c) {
                ((i.c) view).b();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(boolean z10) {
            if (this.f1360b != null) {
                androidx.appcompat.view.menu.e eVar = this.f1359a;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f1359a.getItem(i10) == this.f1360b) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                h(this.f1359a, this.f1360b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f1336i;
            if (view instanceof i.c) {
                ((i.c) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1336i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1335h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1336i = null;
            toolbar3.a();
            this.f1360b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1359a;
            if (eVar2 != null && (gVar = this.f1360b) != null) {
                eVar2.f(gVar);
            }
            this.f1359a = eVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.N);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.G.a(getMenu(), getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.Q);
        post(this.Q);
    }

    private boolean P() {
        if (this.P) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = androidx.core.view.z.C(this) == 1;
        int childCount = getChildCount();
        int b10 = androidx.core.view.e.b(i10, androidx.core.view.z.C(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1362b == 0 && Q(childAt) && p(eVar.f820a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1362b == 0 && Q(childAt2) && p(eVar2.f820a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f1362b = 1;
        if (z10 && this.f1336i != null) {
            view.setLayoutParams(eVar);
            this.E.add(view);
            return;
        }
        addView(view, eVar);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i.g(getContext());
    }

    private void h() {
        if (this.f1347t == null) {
            this.f1347t = new q0();
        }
    }

    private void i() {
        if (this.f1332e == null) {
            this.f1332e = new r(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1328a.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1328a.getMenu();
            if (this.M == null) {
                this.M = new d();
            }
            this.f1328a.setExpandedActionViewsExclusive(true);
            eVar.c(this.M, this.f1337j);
        }
    }

    private void k() {
        if (this.f1328a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1328a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1338k);
            this.f1328a.setOnMenuItemClickListener(this.J);
            this.f1328a.O(this.N, this.O);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f820a = 8388613 | (this.f1341n & 112);
            this.f1328a.setLayoutParams(generateDefaultLayoutParams);
            c(this.f1328a, false);
        }
    }

    private void l() {
        if (this.f1331d == null) {
            this.f1331d = new p(getContext(), null, d.a.M);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f820a = 8388611 | (this.f1341n & 112);
            this.f1331d.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int C = androidx.core.view.z.C(this);
        int b10 = androidx.core.view.e.b(i10, C) & 7;
        return (b10 == 1 || b10 == 3 || b10 == 5) ? b10 : C == 1 ? 5 : 3;
    }

    private int q(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int r10 = r(eVar.f820a);
        if (r10 != 48) {
            if (r10 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1350w & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.h.b(marginLayoutParams) + androidx.core.view.h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean z(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1328a;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1328a;
        return actionMenuView != null && actionMenuView.J();
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f1362b != 2 && childAt != this.f1328a) {
                removeViewAt(childCount);
                this.E.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.f1347t.e(i10, i11);
    }

    public void K(int i10, int i11) {
        h();
        this.f1347t.g(i10, i11);
    }

    public void L(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f1328a == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e N = this.f1328a.N();
        if (N == eVar) {
            return;
        }
        if (N != null) {
            N.O(this.L);
            N.O(this.M);
        }
        if (this.M == null) {
            this.M = new d();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.f1337j);
            eVar.c(this.M, this.f1337j);
        } else {
            cVar.i(this.f1337j, null);
            this.M.i(this.f1337j, null);
            cVar.f(true);
            this.M.f(true);
        }
        this.f1328a.setPopupTheme(this.f1338k);
        this.f1328a.setPresenter(cVar);
        this.L = cVar;
    }

    public void M(j.a aVar, e.a aVar2) {
        this.N = aVar;
        this.O = aVar2;
        ActionMenuView actionMenuView = this.f1328a;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void N(Context context, int i10) {
        this.f1340m = i10;
        TextView textView = this.f1330c;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void O(Context context, int i10) {
        this.f1339l = i10;
        TextView textView = this.f1329b;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.f1328a;
        return actionMenuView != null && actionMenuView.P();
    }

    void a() {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            addView(this.E.get(size));
        }
        this.E.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1328a) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.M;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f1360b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1328a;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f1335h == null) {
            p pVar = new p(getContext(), null, d.a.M);
            this.f1335h = pVar;
            pVar.setImageDrawable(this.f1333f);
            this.f1335h.setContentDescription(this.f1334g);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f820a = 8388611 | (this.f1341n & 112);
            generateDefaultLayoutParams.f1362b = 2;
            this.f1335h.setLayoutParams(generateDefaultLayoutParams);
            this.f1335h.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1335h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1335h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        q0 q0Var = this.f1347t;
        if (q0Var != null) {
            return q0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1349v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        q0 q0Var = this.f1347t;
        if (q0Var != null) {
            return q0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        q0 q0Var = this.f1347t;
        if (q0Var != null) {
            return q0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        q0 q0Var = this.f1347t;
        if (q0Var != null) {
            return q0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1348u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e N;
        ActionMenuView actionMenuView = this.f1328a;
        if ((actionMenuView == null || (N = actionMenuView.N()) == null || !N.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1349v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (androidx.core.view.z.C(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (androidx.core.view.z.C(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1348u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1332e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1332e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1328a.getMenu();
    }

    View getNavButtonView() {
        return this.f1331d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1331d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1331d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1328a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1337j;
    }

    public int getPopupTheme() {
        return this.f1338k;
    }

    public CharSequence getSubtitle() {
        return this.f1352y;
    }

    final TextView getSubtitleTextView() {
        return this.f1330c;
    }

    public CharSequence getTitle() {
        return this.f1351x;
    }

    public int getTitleMarginBottom() {
        return this.f1346s;
    }

    public int getTitleMarginEnd() {
        return this.f1344q;
    }

    public int getTitleMarginStart() {
        return this.f1343p;
    }

    public int getTitleMarginTop() {
        return this.f1345r;
    }

    final TextView getTitleTextView() {
        return this.f1329b;
    }

    public f0 getWrapper() {
        if (this.K == null) {
            this.K = new b1(this, true);
        }
        return this.K;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0033a) {
            return new e((a.C0033a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.F;
        boolean b10 = g1.b(this);
        int i19 = !b10 ? 1 : 0;
        if (Q(this.f1331d)) {
            F(this.f1331d, i10, 0, i11, 0, this.f1342o);
            i12 = this.f1331d.getMeasuredWidth() + s(this.f1331d);
            i13 = Math.max(0, this.f1331d.getMeasuredHeight() + t(this.f1331d));
            i14 = View.combineMeasuredStates(0, this.f1331d.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (Q(this.f1335h)) {
            F(this.f1335h, i10, 0, i11, 0, this.f1342o);
            i12 = this.f1335h.getMeasuredWidth() + s(this.f1335h);
            i13 = Math.max(i13, this.f1335h.getMeasuredHeight() + t(this.f1335h));
            i14 = View.combineMeasuredStates(i14, this.f1335h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        iArr[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (Q(this.f1328a)) {
            F(this.f1328a, i10, max, i11, 0, this.f1342o);
            i15 = this.f1328a.getMeasuredWidth() + s(this.f1328a);
            i13 = Math.max(i13, this.f1328a.getMeasuredHeight() + t(this.f1328a));
            i14 = View.combineMeasuredStates(i14, this.f1328a.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i19] = Math.max(0, currentContentInsetEnd - i15);
        if (Q(this.f1336i)) {
            max2 += E(this.f1336i, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1336i.getMeasuredHeight() + t(this.f1336i));
            i14 = View.combineMeasuredStates(i14, this.f1336i.getMeasuredState());
        }
        if (Q(this.f1332e)) {
            max2 += E(this.f1332e, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1332e.getMeasuredHeight() + t(this.f1332e));
            i14 = View.combineMeasuredStates(i14, this.f1332e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (((e) childAt.getLayoutParams()).f1362b == 0 && Q(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i21 = this.f1345r + this.f1346s;
        int i22 = this.f1343p + this.f1344q;
        if (Q(this.f1329b)) {
            E(this.f1329b, i10, max2 + i22, i11, i21, iArr);
            int measuredWidth = this.f1329b.getMeasuredWidth() + s(this.f1329b);
            i18 = this.f1329b.getMeasuredHeight() + t(this.f1329b);
            i16 = View.combineMeasuredStates(i14, this.f1329b.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = i14;
            i17 = 0;
            i18 = 0;
        }
        if (Q(this.f1330c)) {
            i17 = Math.max(i17, E(this.f1330c, i10, max2 + i22, i11, i18 + i21, iArr));
            i18 += this.f1330c.getMeasuredHeight() + t(this.f1330c);
            i16 = View.combineMeasuredStates(i16, this.f1330c.getMeasuredState());
        }
        int max3 = Math.max(i13, i18);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i17 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & i16), P() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i16 << 16));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        ActionMenuView actionMenuView = this.f1328a;
        androidx.appcompat.view.menu.e N = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = savedState.f1354c;
        if (i10 != 0 && this.M != null && N != null && (findItem = N.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1355d) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i10);
        }
        h();
        this.f1347t.f(i10 == 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.M;
        if (dVar != null && (gVar = dVar.f1360b) != null) {
            savedState.f1354c = gVar.getItemId();
        }
        savedState.f1355d = B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(e.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.P = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.f1349v) {
            this.f1349v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.f1348u) {
            this.f1348u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(e.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(e.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1331d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.I = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1328a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1338k != i10) {
            this.f1338k = i10;
            if (i10 == 0) {
                this.f1337j = getContext();
            } else {
                this.f1337j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f1346s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1344q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1343p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1345r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        d dVar = this.M;
        return (dVar == null || dVar.f1360b == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1328a;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0033a {

        /* renamed from: b  reason: collision with root package name */
        int f1362b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1362b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f1362b = 0;
            this.f820a = 8388627;
        }

        public e(e eVar) {
            super((a.C0033a) eVar);
            this.f1362b = 0;
            this.f1362b = eVar.f1362b;
        }

        public e(a.C0033a c0033a) {
            super(c0033a);
            this.f1362b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1362b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1362b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1350w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.G = new androidx.core.view.i(new Runnable() { // from class: androidx.appcompat.widget.a1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.H = new ArrayList<>();
        this.J = new a();
        this.Q = new b();
        Context context2 = getContext();
        int[] iArr = d.j.Z2;
        z0 v10 = z0.v(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.z.o0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        this.f1339l = v10.n(d.j.B3, 0);
        this.f1340m = v10.n(d.j.f28889s3, 0);
        this.f1350w = v10.l(d.j.f28799a3, this.f1350w);
        this.f1341n = v10.l(d.j.f28804b3, 48);
        int e10 = v10.e(d.j.f28904v3, 0);
        int i11 = d.j.A3;
        e10 = v10.s(i11) ? v10.e(i11, e10) : e10;
        this.f1346s = e10;
        this.f1345r = e10;
        this.f1344q = e10;
        this.f1343p = e10;
        int e11 = v10.e(d.j.f28919y3, -1);
        if (e11 >= 0) {
            this.f1343p = e11;
        }
        int e12 = v10.e(d.j.f28914x3, -1);
        if (e12 >= 0) {
            this.f1344q = e12;
        }
        int e13 = v10.e(d.j.f28924z3, -1);
        if (e13 >= 0) {
            this.f1345r = e13;
        }
        int e14 = v10.e(d.j.f28909w3, -1);
        if (e14 >= 0) {
            this.f1346s = e14;
        }
        this.f1342o = v10.f(d.j.f28859m3, -1);
        int e15 = v10.e(d.j.f28839i3, RecyclerView.UNDEFINED_DURATION);
        int e16 = v10.e(d.j.f28819e3, RecyclerView.UNDEFINED_DURATION);
        int f10 = v10.f(d.j.f28829g3, 0);
        int f11 = v10.f(d.j.f28834h3, 0);
        h();
        this.f1347t.e(f10, f11);
        if (e15 != Integer.MIN_VALUE || e16 != Integer.MIN_VALUE) {
            this.f1347t.g(e15, e16);
        }
        this.f1348u = v10.e(d.j.f28844j3, RecyclerView.UNDEFINED_DURATION);
        this.f1349v = v10.e(d.j.f28824f3, RecyclerView.UNDEFINED_DURATION);
        this.f1333f = v10.g(d.j.f28814d3);
        this.f1334g = v10.p(d.j.f28809c3);
        CharSequence p10 = v10.p(d.j.f28899u3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(d.j.f28884r3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.f1337j = getContext();
        setPopupTheme(v10.n(d.j.f28879q3, 0));
        Drawable g10 = v10.g(d.j.f28874p3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(d.j.f28869o3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(d.j.f28849k3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(d.j.f28854l3);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        int i12 = d.j.C3;
        if (v10.s(i12)) {
            setTitleTextColor(v10.c(i12));
        }
        int i13 = d.j.f28894t3;
        if (v10.s(i13)) {
            setSubtitleTextColor(v10.c(i13));
        }
        int i14 = d.j.f28864n3;
        if (v10.s(i14)) {
            x(v10.n(i14, 0));
        }
        v10.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1335h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1335h.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1335h;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1333f);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1332e)) {
                c(this.f1332e, true);
            }
        } else {
            ImageView imageView = this.f1332e;
            if (imageView != null && z(imageView)) {
                removeView(this.f1332e);
                this.E.remove(this.f1332e);
            }
        }
        ImageView imageView2 = this.f1332e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1332e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1331d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            c1.a(this.f1331d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1331d)) {
                c(this.f1331d, true);
            }
        } else {
            ImageButton imageButton = this.f1331d;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1331d);
                this.E.remove(this.f1331d);
            }
        }
        ImageButton imageButton2 = this.f1331d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1330c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1330c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1330c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1340m;
                if (i10 != 0) {
                    this.f1330c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1330c.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1330c)) {
                c(this.f1330c, true);
            }
        } else {
            TextView textView = this.f1330c;
            if (textView != null && z(textView)) {
                removeView(this.f1330c);
                this.E.remove(this.f1330c);
            }
        }
        TextView textView2 = this.f1330c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1352y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1330c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1329b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1329b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1329b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1339l;
                if (i10 != 0) {
                    this.f1329b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1353z;
                if (colorStateList != null) {
                    this.f1329b.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1329b)) {
                c(this.f1329b, true);
            }
        } else {
            TextView textView = this.f1329b;
            if (textView != null && z(textView)) {
                removeView(this.f1329b);
                this.E.remove(this.f1329b);
            }
        }
        TextView textView2 = this.f1329b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1351x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1353z = colorStateList;
        TextView textView = this.f1329b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f1354c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1355d;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1354c = parcel.readInt();
            this.f1355d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1354c);
            parcel.writeInt(this.f1355d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
