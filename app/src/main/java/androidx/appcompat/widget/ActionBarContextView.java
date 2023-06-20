package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f1172i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1173j;

    /* renamed from: k  reason: collision with root package name */
    private View f1174k;

    /* renamed from: l  reason: collision with root package name */
    private View f1175l;

    /* renamed from: m  reason: collision with root package name */
    private View f1176m;

    /* renamed from: n  reason: collision with root package name */
    private LinearLayout f1177n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f1178o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f1179p;

    /* renamed from: q  reason: collision with root package name */
    private int f1180q;

    /* renamed from: r  reason: collision with root package name */
    private int f1181r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f1182s;

    /* renamed from: t  reason: collision with root package name */
    private int f1183t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.b f1184a;

        a(ActionBarContextView actionBarContextView, i.b bVar) {
            this.f1184a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1184a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f1177n == null) {
            LayoutInflater.from(getContext()).inflate(d.g.f28757a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1177n = linearLayout;
            this.f1178o = (TextView) linearLayout.findViewById(d.f.f28735e);
            this.f1179p = (TextView) this.f1177n.findViewById(d.f.f28734d);
            if (this.f1180q != 0) {
                this.f1178o.setTextAppearance(getContext(), this.f1180q);
            }
            if (this.f1181r != 0) {
                this.f1179p.setTextAppearance(getContext(), this.f1181r);
            }
        }
        this.f1178o.setText(this.f1172i);
        this.f1179p.setText(this.f1173j);
        boolean z10 = !TextUtils.isEmpty(this.f1172i);
        boolean z11 = !TextUtils.isEmpty(this.f1173j);
        int i10 = 0;
        this.f1179p.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1177n;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f1177n.getParent() == null) {
            addView(this.f1177n);
        }
    }

    public void g() {
        if (this.f1174k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1173j;
    }

    public CharSequence getTitle() {
        return this.f1172i;
    }

    public void h(i.b bVar) {
        View view = this.f1174k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1183t, (ViewGroup) this, false);
            this.f1174k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1174k);
        }
        View findViewById = this.f1174k.findViewById(d.f.f28739i);
        this.f1175l = findViewById;
        findViewById.setOnClickListener(new a(this, bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        c cVar = this.f1371d;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f1371d = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f1371d, this.f1369b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1371d.o(this);
        this.f1370c = actionMenuView;
        androidx.core.view.z.u0(actionMenuView, null);
        addView(this.f1370c, layoutParams);
    }

    public boolean j() {
        return this.f1182s;
    }

    public void k() {
        removeAllViews();
        this.f1176m = null;
        this.f1370c = null;
        this.f1371d = null;
        View view = this.f1175l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f1371d;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1371d;
        if (cVar != null) {
            cVar.B();
            this.f1371d.C();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = g1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1174k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1174k.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = androidx.appcompat.widget.a.d(paddingRight, i14, b10);
            paddingRight = androidx.appcompat.widget.a.d(d10 + e(this.f1174k, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f1177n;
        if (linearLayout != null && this.f1176m == null && linearLayout.getVisibility() != 8) {
            i16 += e(this.f1177n, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f1176m;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1370c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i12 = this.f1372e;
                if (i12 <= 0) {
                    i12 = View.MeasureSpec.getSize(i11);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i13 = i12 - paddingTop;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, RecyclerView.UNDEFINED_DURATION);
                View view = this.f1174k;
                if (view != null) {
                    int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1174k.getLayoutParams();
                    paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f1370c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = c(this.f1370c, paddingLeft, makeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.f1177n;
                if (linearLayout != null && this.f1176m == null) {
                    if (this.f1182s) {
                        this.f1177n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f1177n.getMeasuredWidth();
                        boolean z10 = measuredWidth <= paddingLeft;
                        if (z10) {
                            paddingLeft -= measuredWidth;
                        }
                        this.f1177n.setVisibility(z10 ? 0 : 8);
                    } else {
                        paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                    }
                }
                View view2 = this.f1176m;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i14 = layoutParams.width;
                    int i15 = i14 != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                    if (i14 >= 0) {
                        paddingLeft = Math.min(i14, paddingLeft);
                    }
                    int i16 = layoutParams.height;
                    int i17 = i16 == -2 ? RecyclerView.UNDEFINED_DURATION : 1073741824;
                    if (i16 >= 0) {
                        i13 = Math.min(i16, i13);
                    }
                    this.f1176m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
                }
                if (this.f1372e <= 0) {
                    int childCount = getChildCount();
                    int i18 = 0;
                    for (int i19 = 0; i19 < childCount; i19++) {
                        int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i18) {
                            i18 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i18);
                    return;
                }
                setMeasuredDimension(size, i12);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f1372e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1176m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1176m = view;
        if (view != null && (linearLayout = this.f1177n) != null) {
            removeView(linearLayout);
            this.f1177n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1173j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1172i = charSequence;
        i();
        androidx.core.view.z.t0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1182s) {
            requestLayout();
        }
        this.f1182s = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.f28664j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        z0 v10 = z0.v(context, attributeSet, d.j.f28910x, i10, 0);
        androidx.core.view.z.u0(this, v10.g(d.j.f28915y));
        this.f1180q = v10.n(d.j.C, 0);
        this.f1181r = v10.n(d.j.B, 0);
        this.f1372e = v10.m(d.j.A, 0);
        this.f1183t = v10.n(d.j.f28920z, d.g.f28760d);
        v10.w();
    }
}
