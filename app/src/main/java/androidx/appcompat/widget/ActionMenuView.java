package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
public class ActionMenuView extends k0 implements e.b, androidx.appcompat.view.menu.k {
    e A;

    /* renamed from: p  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f1214p;

    /* renamed from: q  reason: collision with root package name */
    private Context f1215q;

    /* renamed from: r  reason: collision with root package name */
    private int f1216r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1217s;

    /* renamed from: t  reason: collision with root package name */
    private androidx.appcompat.widget.c f1218t;

    /* renamed from: u  reason: collision with root package name */
    private j.a f1219u;

    /* renamed from: v  reason: collision with root package name */
    e.a f1220v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1221w;

    /* renamed from: x  reason: collision with root package name */
    private int f1222x;

    /* renamed from: y  reason: collision with root package name */
    private int f1223y;

    /* renamed from: z  reason: collision with root package name */
    private int f1224z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends k0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f1225a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f1226b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f1227c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f1228d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f1229e;

        /* renamed from: f  reason: collision with root package name */
        boolean f1230f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1225a = cVar.f1225a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1225a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f1220v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int L(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = true;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.h();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        cVar.f1228d = (cVar.f1225a || !z11) ? false : false;
        cVar.f1226b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    private void M(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        boolean z12;
        int i15;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i16 = size - paddingLeft;
        int i17 = this.f1223y;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = i17 + (i19 / i18);
        int childCount = getChildCount();
        int i21 = 0;
        int i22 = 0;
        boolean z13 = false;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        long j10 = 0;
        while (i22 < childCount) {
            View childAt = getChildAt(i22);
            int i26 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i27 = i23 + 1;
                if (z14) {
                    int i28 = this.f1224z;
                    i15 = i27;
                    r14 = 0;
                    childAt.setPadding(i28, 0, i28, 0);
                } else {
                    i15 = i27;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1230f = r14;
                cVar.f1227c = r14;
                cVar.f1226b = r14;
                cVar.f1228d = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f1229e = z14 && ((ActionMenuItemView) childAt).h();
                int L = L(childAt, i20, cVar.f1225a ? 1 : i18, childMeasureSpec, paddingTop);
                i24 = Math.max(i24, L);
                if (cVar.f1228d) {
                    i25++;
                }
                if (cVar.f1225a) {
                    z13 = true;
                }
                i18 -= L;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (L == 1) {
                    j10 |= 1 << i22;
                    i21 = i21;
                }
                i23 = i15;
            }
            i22++;
            size2 = i26;
        }
        int i29 = size2;
        boolean z15 = z13 && i23 == 2;
        boolean z16 = false;
        while (i25 > 0 && i18 > 0) {
            int i30 = 0;
            int i31 = 0;
            int i32 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            long j11 = 0;
            while (i31 < childCount) {
                boolean z17 = z16;
                c cVar2 = (c) getChildAt(i31).getLayoutParams();
                int i33 = i21;
                if (cVar2.f1228d) {
                    int i34 = cVar2.f1226b;
                    if (i34 < i32) {
                        j11 = 1 << i31;
                        i32 = i34;
                        i30 = 1;
                    } else if (i34 == i32) {
                        i30++;
                        j11 |= 1 << i31;
                    }
                }
                i31++;
                i21 = i33;
                z16 = z17;
            }
            z10 = z16;
            i14 = i21;
            j10 |= j11;
            if (i30 > i18) {
                i12 = mode;
                i13 = i16;
                break;
            }
            int i35 = i32 + 1;
            int i36 = 0;
            while (i36 < childCount) {
                View childAt2 = getChildAt(i36);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i37 = i16;
                int i38 = mode;
                long j12 = 1 << i36;
                if ((j11 & j12) == 0) {
                    if (cVar3.f1226b == i35) {
                        j10 |= j12;
                    }
                    z12 = z15;
                } else {
                    if (z15 && cVar3.f1229e && i18 == 1) {
                        int i39 = this.f1224z;
                        z12 = z15;
                        childAt2.setPadding(i39 + i20, 0, i39, 0);
                    } else {
                        z12 = z15;
                    }
                    cVar3.f1226b++;
                    cVar3.f1230f = true;
                    i18--;
                }
                i36++;
                mode = i38;
                i16 = i37;
                z15 = z12;
            }
            i21 = i14;
            z16 = true;
        }
        i12 = mode;
        i13 = i16;
        z10 = z16;
        i14 = i21;
        boolean z18 = !z13 && i23 == 1;
        if (i18 <= 0 || j10 == 0 || (i18 >= i23 - 1 && !z18 && i24 <= 1)) {
            z11 = z10;
        } else {
            float bitCount = Long.bitCount(j10);
            if (!z18) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1229e) {
                    bitCount -= 0.5f;
                }
                int i40 = childCount - 1;
                if ((j10 & (1 << i40)) != 0 && !((c) getChildAt(i40).getLayoutParams()).f1229e) {
                    bitCount -= 0.5f;
                }
            }
            int i41 = bitCount > 0.0f ? (int) ((i18 * i20) / bitCount) : 0;
            z11 = z10;
            for (int i42 = 0; i42 < childCount; i42++) {
                if ((j10 & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1227c = i41;
                        cVar4.f1230f = true;
                        if (i42 == 0 && !cVar4.f1229e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i41) / 2;
                        }
                    } else if (cVar4.f1225a) {
                        cVar4.f1227c = i41;
                        cVar4.f1230f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i41) / 2;
                    } else {
                        if (i42 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i41 / 2;
                        }
                        if (i42 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i41 / 2;
                        }
                    }
                    z11 = true;
                }
            }
        }
        if (z11) {
            for (int i43 = 0; i43 < childCount; i43++) {
                View childAt4 = getChildAt(i43);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1230f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1226b * i20) + cVar5.f1227c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, i12 != 1073741824 ? i14 : i29);
    }

    public void B() {
        androidx.appcompat.widget.c cVar = this.f1218t;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.k0
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.k0
    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.k0
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams != null) {
            if (layoutParams instanceof c) {
                cVar = new c((c) layoutParams);
            } else {
                cVar = new c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return m();
    }

    public c F() {
        c m10 = m();
        m10.f1225a = true;
        return m10;
    }

    protected boolean G(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    public boolean H() {
        androidx.appcompat.widget.c cVar = this.f1218t;
        return cVar != null && cVar.B();
    }

    public boolean I() {
        androidx.appcompat.widget.c cVar = this.f1218t;
        return cVar != null && cVar.D();
    }

    public boolean J() {
        androidx.appcompat.widget.c cVar = this.f1218t;
        return cVar != null && cVar.E();
    }

    public boolean K() {
        return this.f1217s;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f1214p;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.f1219u = aVar;
        this.f1220v = aVar2;
    }

    public boolean P() {
        androidx.appcompat.widget.c cVar = this.f1218t;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.k
    public void a(androidx.appcompat.view.menu.e eVar) {
        this.f1214p = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.k0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean d(androidx.appcompat.view.menu.g gVar) {
        return this.f1214p.L(gVar, 0);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1214p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f1214p = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f1218t = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.f1218t;
            j.a aVar = this.f1219u;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.d(aVar);
            this.f1214p.c(this.f1218t, this.f1215q);
            this.f1218t.H(this);
        }
        return this.f1214p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1218t.A();
    }

    public int getPopupTheme() {
        return this.f1216r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f1218t;
        if (cVar != null) {
            cVar.f(false);
            if (this.f1218t.E()) {
                this.f1218t.B();
                this.f1218t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.k0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.f1221w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = g1.b(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1225a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (b10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1225a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1225a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = i28 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.k0, android.view.View
    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = this.f1221w;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1221w = z11;
        if (z10 != z11) {
            this.f1222x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1221w && (eVar = this.f1214p) != null && size != this.f1222x) {
            this.f1222x = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.f1221w && childCount > 0) {
            M(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1218t.G(z10);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1218t.I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f1217s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1216r != i10) {
            this.f1216r = i10;
            if (i10 == 0) {
                this.f1215q = getContext();
            } else {
                this.f1215q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f1218t = cVar;
        cVar.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1223y = (int) (56.0f * f10);
        this.f1224z = (int) (f10 * 4.0f);
        this.f1215q = context;
        this.f1216r = 0;
    }
}
