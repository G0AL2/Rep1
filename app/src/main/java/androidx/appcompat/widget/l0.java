package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class l0 implements j.e {
    private static Method F;
    private static Method G;
    private static Method H;
    final Handler A;
    private final Rect B;
    private Rect C;
    private boolean D;
    PopupWindow E;

    /* renamed from: a  reason: collision with root package name */
    private Context f1589a;

    /* renamed from: b  reason: collision with root package name */
    private ListAdapter f1590b;

    /* renamed from: c  reason: collision with root package name */
    h0 f1591c;

    /* renamed from: d  reason: collision with root package name */
    private int f1592d;

    /* renamed from: e  reason: collision with root package name */
    private int f1593e;

    /* renamed from: f  reason: collision with root package name */
    private int f1594f;

    /* renamed from: g  reason: collision with root package name */
    private int f1595g;

    /* renamed from: h  reason: collision with root package name */
    private int f1596h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f1597i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f1598j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1599k;

    /* renamed from: l  reason: collision with root package name */
    private int f1600l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1601m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1602n;

    /* renamed from: o  reason: collision with root package name */
    int f1603o;

    /* renamed from: p  reason: collision with root package name */
    private View f1604p;

    /* renamed from: q  reason: collision with root package name */
    private int f1605q;

    /* renamed from: r  reason: collision with root package name */
    private DataSetObserver f1606r;

    /* renamed from: s  reason: collision with root package name */
    private View f1607s;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f1608t;

    /* renamed from: u  reason: collision with root package name */
    private AdapterView.OnItemClickListener f1609u;

    /* renamed from: v  reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f1610v;

    /* renamed from: w  reason: collision with root package name */
    final g f1611w;

    /* renamed from: x  reason: collision with root package name */
    private final f f1612x;

    /* renamed from: y  reason: collision with root package name */
    private final e f1613y;

    /* renamed from: z  reason: collision with root package name */
    private final c f1614z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View s10 = l0.this.s();
            if (s10 == null || s10.getWindowToken() == null) {
                return;
            }
            l0.this.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            h0 h0Var;
            if (i10 == -1 || (h0Var = l0.this.f1591c) == null) {
                return;
            }
            h0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l0.this.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (l0.this.a()) {
                l0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            l0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || l0.this.v() || l0.this.E.getContentView() == null) {
                return;
            }
            l0 l0Var = l0.this;
            l0Var.A.removeCallbacks(l0Var.f1611w);
            l0.this.f1611w.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = l0.this.E) != null && popupWindow.isShowing() && x10 >= 0 && x10 < l0.this.E.getWidth() && y10 >= 0 && y10 < l0.this.E.getHeight()) {
                l0 l0Var = l0.this;
                l0Var.A.postDelayed(l0Var.f1611w, 250L);
                return false;
            } else if (action == 1) {
                l0 l0Var2 = l0.this;
                l0Var2.A.removeCallbacks(l0Var2.f1611w);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0 h0Var = l0.this.f1591c;
            if (h0Var == null || !androidx.core.view.z.T(h0Var) || l0.this.f1591c.getCount() <= l0.this.f1591c.getChildCount()) {
                return;
            }
            int childCount = l0.this.f1591c.getChildCount();
            l0 l0Var = l0.this;
            if (childCount <= l0Var.f1603o) {
                l0Var.E.setInputMethodMode(2);
                l0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                F = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                G = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public l0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    private void I(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = F;
            if (method != null) {
                try {
                    method.invoke(this.E, Boolean.valueOf(z10));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        this.E.setIsClippedToScreen(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int p() {
        int i10;
        int i11;
        int makeMeasureSpec;
        int i12;
        if (this.f1591c == null) {
            Context context = this.f1589a;
            new a();
            h0 r10 = r(context, !this.D);
            this.f1591c = r10;
            Drawable drawable = this.f1608t;
            if (drawable != null) {
                r10.setSelector(drawable);
            }
            this.f1591c.setAdapter(this.f1590b);
            this.f1591c.setOnItemClickListener(this.f1609u);
            this.f1591c.setFocusable(true);
            this.f1591c.setFocusableInTouchMode(true);
            this.f1591c.setOnItemSelectedListener(new b());
            this.f1591c.setOnScrollListener(this.f1613y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1610v;
            if (onItemSelectedListener != null) {
                this.f1591c.setOnItemSelectedListener(onItemSelectedListener);
            }
            h0 h0Var = this.f1591c;
            View view = this.f1604p;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.f1605q;
                if (i13 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(h0Var, layoutParams);
                } else if (i13 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1605q);
                } else {
                    linearLayout.addView(h0Var, layoutParams);
                    linearLayout.addView(view);
                }
                int i14 = this.f1593e;
                if (i14 >= 0) {
                    i12 = RecyclerView.UNDEFINED_DURATION;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i10 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                h0Var = linearLayout;
            } else {
                i10 = 0;
            }
            this.E.setContentView(h0Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.E.getContentView();
            View view2 = this.f1604p;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i10 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i10 = 0;
            }
        }
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            Rect rect = this.B;
            int i15 = rect.top;
            i11 = rect.bottom + i15;
            if (!this.f1597i) {
                this.f1595g = -i15;
            }
        } else {
            this.B.setEmpty();
            i11 = 0;
        }
        int t10 = t(s(), this.f1595g, this.E.getInputMethodMode() == 2);
        if (this.f1601m || this.f1592d == -1) {
            return t10 + i11;
        }
        int i16 = this.f1593e;
        if (i16 == -2) {
            int i17 = this.f1589a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.B;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect2.left + rect2.right), RecyclerView.UNDEFINED_DURATION);
        } else if (i16 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        } else {
            int i18 = this.f1589a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.B;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect3.left + rect3.right), 1073741824);
        }
        int d10 = this.f1591c.d(makeMeasureSpec, 0, -1, t10 - i10, -1);
        if (d10 > 0) {
            i10 += i11 + this.f1591c.getPaddingTop() + this.f1591c.getPaddingBottom();
        }
        return d10 + i10;
    }

    private int t(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = G;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.E, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.E.getMaxAvailableHeight(view, i10);
        }
        return this.E.getMaxAvailableHeight(view, i10, z10);
    }

    private void x() {
        View view = this.f1604p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1604p);
            }
        }
    }

    public void A(int i10) {
        Drawable background = this.E.getBackground();
        if (background != null) {
            background.getPadding(this.B);
            Rect rect = this.B;
            this.f1593e = rect.left + rect.right + i10;
            return;
        }
        L(i10);
    }

    public void B(int i10) {
        this.f1600l = i10;
    }

    public void C(Rect rect) {
        this.C = rect != null ? new Rect(rect) : null;
    }

    public void D(int i10) {
        this.E.setInputMethodMode(i10);
    }

    public void E(boolean z10) {
        this.D = z10;
        this.E.setFocusable(z10);
    }

    public void F(PopupWindow.OnDismissListener onDismissListener) {
        this.E.setOnDismissListener(onDismissListener);
    }

    public void G(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1609u = onItemClickListener;
    }

    public void H(boolean z10) {
        this.f1599k = true;
        this.f1598j = z10;
    }

    public void J(int i10) {
        this.f1605q = i10;
    }

    public void K(int i10) {
        h0 h0Var = this.f1591c;
        if (!a() || h0Var == null) {
            return;
        }
        h0Var.setListSelectionHidden(false);
        h0Var.setSelection(i10);
        if (h0Var.getChoiceMode() != 0) {
            h0Var.setItemChecked(i10, true);
        }
    }

    public void L(int i10) {
        this.f1593e = i10;
    }

    @Override // j.e
    public boolean a() {
        return this.E.isShowing();
    }

    public void b(Drawable drawable) {
        this.E.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.f1594f;
    }

    @Override // j.e
    public void dismiss() {
        this.E.dismiss();
        x();
        this.E.setContentView(null);
        this.f1591c = null;
        this.A.removeCallbacks(this.f1611w);
    }

    public void e(int i10) {
        this.f1594f = i10;
    }

    public Drawable g() {
        return this.E.getBackground();
    }

    public void i(int i10) {
        this.f1595g = i10;
        this.f1597i = true;
    }

    public int l() {
        if (this.f1597i) {
            return this.f1595g;
        }
        return 0;
    }

    public void m(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1606r;
        if (dataSetObserver == null) {
            this.f1606r = new d();
        } else {
            ListAdapter listAdapter2 = this.f1590b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1590b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1606r);
        }
        h0 h0Var = this.f1591c;
        if (h0Var != null) {
            h0Var.setAdapter(this.f1590b);
        }
    }

    @Override // j.e
    public ListView o() {
        return this.f1591c;
    }

    public void q() {
        h0 h0Var = this.f1591c;
        if (h0Var != null) {
            h0Var.setListSelectionHidden(true);
            h0Var.requestLayout();
        }
    }

    h0 r(Context context, boolean z10) {
        return new h0(context, z10);
    }

    public View s() {
        return this.f1607s;
    }

    @Override // j.e
    public void show() {
        int p10 = p();
        boolean v10 = v();
        androidx.core.widget.i.b(this.E, this.f1596h);
        boolean z10 = true;
        if (this.E.isShowing()) {
            if (androidx.core.view.z.T(s())) {
                int i10 = this.f1593e;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = s().getWidth();
                }
                int i11 = this.f1592d;
                if (i11 == -1) {
                    if (!v10) {
                        p10 = -1;
                    }
                    if (v10) {
                        this.E.setWidth(this.f1593e == -1 ? -1 : 0);
                        this.E.setHeight(0);
                    } else {
                        this.E.setWidth(this.f1593e == -1 ? -1 : 0);
                        this.E.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    p10 = i11;
                }
                this.E.setOutsideTouchable((this.f1602n || this.f1601m) ? false : false);
                this.E.update(s(), this.f1594f, this.f1595g, i10 < 0 ? -1 : i10, p10 < 0 ? -1 : p10);
                return;
            }
            return;
        }
        int i12 = this.f1593e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = s().getWidth();
        }
        int i13 = this.f1592d;
        if (i13 == -1) {
            p10 = -1;
        } else if (i13 != -2) {
            p10 = i13;
        }
        this.E.setWidth(i12);
        this.E.setHeight(p10);
        I(true);
        this.E.setOutsideTouchable((this.f1602n || this.f1601m) ? false : true);
        this.E.setTouchInterceptor(this.f1612x);
        if (this.f1599k) {
            androidx.core.widget.i.a(this.E, this.f1598j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = H;
            if (method != null) {
                try {
                    method.invoke(this.E, this.C);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            this.E.setEpicenterBounds(this.C);
        }
        androidx.core.widget.i.c(this.E, s(), this.f1594f, this.f1595g, this.f1600l);
        this.f1591c.setSelection(-1);
        if (!this.D || this.f1591c.isInTouchMode()) {
            q();
        }
        if (this.D) {
            return;
        }
        this.A.post(this.f1614z);
    }

    public int u() {
        return this.f1593e;
    }

    public boolean v() {
        return this.E.getInputMethodMode() == 2;
    }

    public boolean w() {
        return this.D;
    }

    public void y(View view) {
        this.f1607s = view;
    }

    public void z(int i10) {
        this.E.setAnimationStyle(i10);
    }

    public l0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1592d = -2;
        this.f1593e = -2;
        this.f1596h = 1002;
        this.f1600l = 0;
        this.f1601m = false;
        this.f1602n = false;
        this.f1603o = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f1605q = 0;
        this.f1611w = new g();
        this.f1612x = new f();
        this.f1613y = new e();
        this.f1614z = new c();
        this.B = new Rect();
        this.f1589a = context;
        this.A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f28827g1, i10, i11);
        this.f1594f = obtainStyledAttributes.getDimensionPixelOffset(d.j.f28832h1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(d.j.f28837i1, 0);
        this.f1595g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1597i = true;
        }
        obtainStyledAttributes.recycle();
        t tVar = new t(context, attributeSet, i10, i11);
        this.E = tVar;
        tVar.setInputMethodMode(1);
    }
}
