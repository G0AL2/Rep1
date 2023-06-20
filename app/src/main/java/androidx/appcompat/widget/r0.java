package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.k0;

/* compiled from: ScrollingTabContainerView.java */
/* loaded from: classes.dex */
public class r0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    Runnable f1660a;

    /* renamed from: b  reason: collision with root package name */
    private c f1661b;

    /* renamed from: c  reason: collision with root package name */
    k0 f1662c;

    /* renamed from: d  reason: collision with root package name */
    private Spinner f1663d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1664e;

    /* renamed from: f  reason: collision with root package name */
    int f1665f;

    /* renamed from: g  reason: collision with root package name */
    int f1666g;

    /* renamed from: h  reason: collision with root package name */
    private int f1667h;

    /* renamed from: i  reason: collision with root package name */
    private int f1668i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f1669a;

        a(View view) {
            this.f1669a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            r0.this.smoothScrollTo(this.f1669a.getLeft() - ((r0.this.getWidth() - this.f1669a.getWidth()) / 2), 0);
            r0.this.f1660a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return r0.this.f1662c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) r0.this.f1662c.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return r0.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = r0.this.f1662c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = r0.this.f1662c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ScrollingTabContainerView.java */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f1673a;

        /* renamed from: b  reason: collision with root package name */
        private a.c f1674b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f1675c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f1676d;

        /* renamed from: e  reason: collision with root package name */
        private View f1677e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.r0.this = r5
                int r5 = d.a.f28658d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1673a = r1
                r4.f1674b = r7
                androidx.appcompat.widget.z0 r5 = androidx.appcompat.widget.z0.v(r6, r0, r1, r5, r3)
                boolean r6 = r5.s(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.g(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.w()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.d.<init>(androidx.appcompat.widget.r0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1674b = cVar;
            c();
        }

        public a.c b() {
            return this.f1674b;
        }

        public void c() {
            a.c cVar = this.f1674b;
            View b10 = cVar.b();
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f1677e = b10;
                TextView textView = this.f1675c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1676d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1676d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1677e;
            if (view != null) {
                removeView(view);
                this.f1677e = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f1676d == null) {
                    r rVar = new r(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    rVar.setLayoutParams(layoutParams);
                    addView(rVar, 0);
                    this.f1676d = rVar;
                }
                this.f1676d.setImageDrawable(c10);
                this.f1676d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1676d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1676d.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f1675c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, d.a.f28659e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1675c = appCompatTextView;
                }
                this.f1675c.setText(d10);
                this.f1675c.setVisibility(0);
            } else {
                TextView textView2 = this.f1675c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1675c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1676d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            c1.a(this, z10 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (r0.this.f1665f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = r0.this.f1665f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, d.a.f28662h);
        appCompatSpinner.setLayoutParams(new k0.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private boolean d() {
        Spinner spinner = this.f1663d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1663d == null) {
            this.f1663d = b();
        }
        removeView(this.f1662c);
        addView(this.f1663d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1663d.getAdapter() == null) {
            this.f1663d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1660a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1660a = null;
        }
        this.f1663d.setSelection(this.f1668i);
    }

    private boolean f() {
        if (d()) {
            removeView(this.f1663d);
            addView(this.f1662c, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f1663d.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1662c.getChildAt(i10);
        Runnable runnable = this.f1660a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1660a = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1667h));
        } else {
            dVar.setFocusable(true);
            if (this.f1661b == null) {
                this.f1661b = new c();
            }
            dVar.setOnClickListener(this.f1661b);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1660a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i.a b10 = i.a.b(getContext());
        setContentHeight(b10.f());
        this.f1666g = b10.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1660a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = true;
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        int childCount = this.f1662c.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f1665f = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1665f = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1665f = Math.min(this.f1665f, this.f1666g);
        } else {
            this.f1665f = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1667h, 1073741824);
        if ((z11 || !this.f1664e) ? false : false) {
            this.f1662c.measure(0, makeMeasureSpec);
            if (this.f1662c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z11 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1668i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1664e = z10;
    }

    public void setContentHeight(int i10) {
        this.f1667h = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1668i = i10;
        int childCount = this.f1662c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1662c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1663d;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
