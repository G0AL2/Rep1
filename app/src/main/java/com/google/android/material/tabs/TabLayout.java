package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.c1;
import androidx.core.util.Pools$SimplePool;
import androidx.core.view.w;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.common.api.Api;
import com.google.android.material.badge.BadgeDrawable;
import ha.k;
import ha.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    private static final h0.e<g> O = new h0.f(16);
    boolean A;
    boolean B;
    boolean C;
    private c D;
    private final ArrayList<c> E;
    private c F;
    private ValueAnimator G;
    ViewPager H;
    private androidx.viewpager.widget.a I;
    private DataSetObserver J;
    private h K;
    private b L;
    private boolean M;
    private final h0.e<i> N;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<g> f22532a;

    /* renamed from: b  reason: collision with root package name */
    private g f22533b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f22534c;

    /* renamed from: d  reason: collision with root package name */
    private final f f22535d;

    /* renamed from: e  reason: collision with root package name */
    int f22536e;

    /* renamed from: f  reason: collision with root package name */
    int f22537f;

    /* renamed from: g  reason: collision with root package name */
    int f22538g;

    /* renamed from: h  reason: collision with root package name */
    int f22539h;

    /* renamed from: i  reason: collision with root package name */
    int f22540i;

    /* renamed from: j  reason: collision with root package name */
    ColorStateList f22541j;

    /* renamed from: k  reason: collision with root package name */
    ColorStateList f22542k;

    /* renamed from: l  reason: collision with root package name */
    ColorStateList f22543l;

    /* renamed from: m  reason: collision with root package name */
    Drawable f22544m;

    /* renamed from: n  reason: collision with root package name */
    PorterDuff.Mode f22545n;

    /* renamed from: o  reason: collision with root package name */
    float f22546o;

    /* renamed from: p  reason: collision with root package name */
    float f22547p;

    /* renamed from: q  reason: collision with root package name */
    final int f22548q;

    /* renamed from: r  reason: collision with root package name */
    int f22549r;

    /* renamed from: s  reason: collision with root package name */
    private final int f22550s;

    /* renamed from: t  reason: collision with root package name */
    private final int f22551t;

    /* renamed from: u  reason: collision with root package name */
    private final int f22552u;

    /* renamed from: v  reason: collision with root package name */
    private int f22553v;

    /* renamed from: w  reason: collision with root package name */
    int f22554w;

    /* renamed from: x  reason: collision with root package name */
    int f22555x;

    /* renamed from: y  reason: collision with root package name */
    int f22556y;

    /* renamed from: z  reason: collision with root package name */
    int f22557z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        private boolean f22559a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.H == viewPager) {
                tabLayout.D(aVar2, this.f22559a);
            }
        }

        void b(boolean z10) {
            this.f22559a = z10;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface c<T extends g> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    /* loaded from: classes3.dex */
    public interface d extends c<g> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.w();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class f extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private int f22562a;

        /* renamed from: b  reason: collision with root package name */
        private final Paint f22563b;

        /* renamed from: c  reason: collision with root package name */
        private final GradientDrawable f22564c;

        /* renamed from: d  reason: collision with root package name */
        int f22565d;

        /* renamed from: e  reason: collision with root package name */
        float f22566e;

        /* renamed from: f  reason: collision with root package name */
        private int f22567f;

        /* renamed from: g  reason: collision with root package name */
        private int f22568g;

        /* renamed from: h  reason: collision with root package name */
        private int f22569h;

        /* renamed from: i  reason: collision with root package name */
        private ValueAnimator f22570i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f22572a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f22573b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f22574c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f22575d;

            a(int i10, int i11, int i12, int i13) {
                this.f22572a = i10;
                this.f22573b = i11;
                this.f22574c = i12;
                this.f22575d = i13;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                f.this.d(ia.a.b(this.f22572a, this.f22573b, animatedFraction), ia.a.b(this.f22574c, this.f22575d, animatedFraction));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f22577a;

            b(int i10) {
                this.f22577a = i10;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f fVar = f.this;
                fVar.f22565d = this.f22577a;
                fVar.f22566e = 0.0f;
            }
        }

        f(Context context) {
            super(context);
            this.f22565d = -1;
            this.f22567f = -1;
            this.f22568g = -1;
            this.f22569h = -1;
            setWillNotDraw(false);
            this.f22563b = new Paint();
            this.f22564c = new GradientDrawable();
        }

        private void b(i iVar, RectF rectF) {
            int contentWidth = iVar.getContentWidth();
            int a10 = (int) com.google.android.material.internal.h.a(getContext(), 24);
            if (contentWidth < a10) {
                contentWidth = a10;
            }
            int left = (iVar.getLeft() + iVar.getRight()) / 2;
            int i10 = contentWidth / 2;
            rectF.set(left - i10, 0.0f, left + i10, 0.0f);
        }

        private void h() {
            int i10;
            int i11;
            View childAt = getChildAt(this.f22565d);
            if (childAt == null || childAt.getWidth() <= 0) {
                i10 = -1;
                i11 = -1;
            } else {
                i10 = childAt.getLeft();
                i11 = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.B && (childAt instanceof i)) {
                    b((i) childAt, tabLayout.f22534c);
                    i10 = (int) TabLayout.this.f22534c.left;
                    i11 = (int) TabLayout.this.f22534c.right;
                }
                if (this.f22566e > 0.0f && this.f22565d < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f22565d + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.B && (childAt2 instanceof i)) {
                        b((i) childAt2, tabLayout2.f22534c);
                        left = (int) TabLayout.this.f22534c.left;
                        right = (int) TabLayout.this.f22534c.right;
                    }
                    float f10 = this.f22566e;
                    i10 = (int) ((left * f10) + ((1.0f - f10) * i10));
                    i11 = (int) ((right * f10) + ((1.0f - f10) * i11));
                }
            }
            d(i10, i11);
        }

        void a(int i10, int i11) {
            ValueAnimator valueAnimator = this.f22570i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f22570i.cancel();
            }
            View childAt = getChildAt(i10);
            if (childAt == null) {
                h();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.B && (childAt instanceof i)) {
                b((i) childAt, tabLayout.f22534c);
                left = (int) TabLayout.this.f22534c.left;
                right = (int) TabLayout.this.f22534c.right;
            }
            int i12 = left;
            int i13 = right;
            int i14 = this.f22568g;
            int i15 = this.f22569h;
            if (i14 == i12 && i15 == i13) {
                return;
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f22570i = valueAnimator2;
            valueAnimator2.setInterpolator(ia.a.f31870b);
            valueAnimator2.setDuration(i11);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new a(i14, i12, i15, i13));
            valueAnimator2.addListener(new b(i10));
            valueAnimator2.start();
        }

        boolean c() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        void d(int i10, int i11) {
            if (i10 == this.f22568g && i11 == this.f22569h) {
                return;
            }
            this.f22568g = i10;
            this.f22569h = i11;
            z.h0(this);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            Drawable drawable = TabLayout.this.f22544m;
            int i10 = 0;
            int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
            int i11 = this.f22562a;
            if (i11 >= 0) {
                intrinsicHeight = i11;
            }
            int i12 = TabLayout.this.f22556y;
            if (i12 == 0) {
                i10 = getHeight() - intrinsicHeight;
                intrinsicHeight = getHeight();
            } else if (i12 == 1) {
                i10 = (getHeight() - intrinsicHeight) / 2;
                intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
            } else if (i12 != 2) {
                intrinsicHeight = i12 != 3 ? 0 : getHeight();
            }
            int i13 = this.f22568g;
            if (i13 >= 0 && this.f22569h > i13) {
                Drawable drawable2 = TabLayout.this.f22544m;
                if (drawable2 == null) {
                    drawable2 = this.f22564c;
                }
                Drawable r10 = androidx.core.graphics.drawable.a.r(drawable2);
                r10.setBounds(this.f22568g, i10, this.f22569h, intrinsicHeight);
                Paint paint = this.f22563b;
                if (paint != null) {
                    if (Build.VERSION.SDK_INT == 21) {
                        r10.setColorFilter(paint.getColor(), PorterDuff.Mode.SRC_IN);
                    } else {
                        androidx.core.graphics.drawable.a.n(r10, paint.getColor());
                    }
                }
                r10.draw(canvas);
            }
            super.draw(canvas);
        }

        void e(int i10, float f10) {
            ValueAnimator valueAnimator = this.f22570i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f22570i.cancel();
            }
            this.f22565d = i10;
            this.f22566e = f10;
            h();
        }

        void f(int i10) {
            if (this.f22563b.getColor() != i10) {
                this.f22563b.setColor(i10);
                z.h0(this);
            }
        }

        void g(int i10) {
            if (this.f22562a != i10) {
                this.f22562a = i10;
                z.h0(this);
            }
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f22570i;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f22570i.cancel();
                a(this.f22565d, Math.round((1.0f - this.f22570i.getAnimatedFraction()) * ((float) this.f22570i.getDuration())));
                return;
            }
            h();
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.f22554w == 1 || tabLayout.f22557z == 2) {
                int childCount = getChildCount();
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() == 0) {
                        i12 = Math.max(i12, childAt.getMeasuredWidth());
                    }
                }
                if (i12 <= 0) {
                    return;
                }
                if (i12 * childCount <= getMeasuredWidth() - (((int) com.google.android.material.internal.h.a(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i14 = 0; i14 < childCount; i14++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                        if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i12;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f22554w = 0;
                    tabLayout2.K(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
            if (Build.VERSION.SDK_INT >= 23 || this.f22567f == i10) {
                return;
            }
            requestLayout();
            this.f22567f = i10;
        }
    }

    /* loaded from: classes3.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f22579a;

        /* renamed from: b  reason: collision with root package name */
        private CharSequence f22580b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f22581c;

        /* renamed from: e  reason: collision with root package name */
        private View f22583e;

        /* renamed from: g  reason: collision with root package name */
        public TabLayout f22585g;

        /* renamed from: h  reason: collision with root package name */
        public i f22586h;

        /* renamed from: d  reason: collision with root package name */
        private int f22582d = -1;

        /* renamed from: f  reason: collision with root package name */
        private int f22584f = 1;

        public View d() {
            return this.f22583e;
        }

        public Drawable e() {
            return this.f22579a;
        }

        public int f() {
            return this.f22582d;
        }

        public int g() {
            return this.f22584f;
        }

        public CharSequence h() {
            return this.f22580b;
        }

        public boolean i() {
            TabLayout tabLayout = this.f22585g;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f22582d;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void j() {
            this.f22585g = null;
            this.f22586h = null;
            this.f22579a = null;
            this.f22580b = null;
            this.f22581c = null;
            this.f22582d = -1;
            this.f22583e = null;
        }

        public void k() {
            TabLayout tabLayout = this.f22585g;
            if (tabLayout != null) {
                tabLayout.B(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g l(CharSequence charSequence) {
            this.f22581c = charSequence;
            r();
            return this;
        }

        public g m(int i10) {
            return n(LayoutInflater.from(this.f22586h.getContext()).inflate(i10, (ViewGroup) this.f22586h, false));
        }

        public g n(View view) {
            this.f22583e = view;
            r();
            return this;
        }

        public g o(Drawable drawable) {
            this.f22579a = drawable;
            TabLayout tabLayout = this.f22585g;
            if (tabLayout.f22554w == 1 || tabLayout.f22557z == 2) {
                tabLayout.K(true);
            }
            r();
            if (com.google.android.material.badge.a.f22052a && this.f22586h.l() && this.f22586h.f22594e.isVisible()) {
                this.f22586h.invalidate();
            }
            return this;
        }

        void p(int i10) {
            this.f22582d = i10;
        }

        public g q(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f22581c) && !TextUtils.isEmpty(charSequence)) {
                this.f22586h.setContentDescription(charSequence);
            }
            this.f22580b = charSequence;
            r();
            return this;
        }

        void r() {
            i iVar = this.f22586h;
            if (iVar != null) {
                iVar.t();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class h implements ViewPager.j {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TabLayout> f22587a;

        /* renamed from: b  reason: collision with root package name */
        private int f22588b;

        /* renamed from: c  reason: collision with root package name */
        private int f22589c;

        public h(TabLayout tabLayout) {
            this.f22587a = new WeakReference<>(tabLayout);
        }

        void a() {
            this.f22589c = 0;
            this.f22588b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
            this.f22588b = this.f22589c;
            this.f22589c = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f22587a.get();
            if (tabLayout != null) {
                int i12 = this.f22589c;
                boolean z10 = false;
                tabLayout.F(i10, f10, i12 != 2 || this.f22588b == 1, (i12 == 2 && this.f22588b == 0) ? true : true);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            TabLayout tabLayout = this.f22587a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f22589c;
            tabLayout.C(tabLayout.u(i10), i11 == 0 || (i11 == 2 && this.f22588b == 0));
        }
    }

    /* loaded from: classes3.dex */
    public final class i extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private g f22590a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f22591b;

        /* renamed from: c  reason: collision with root package name */
        private ImageView f22592c;

        /* renamed from: d  reason: collision with root package name */
        private View f22593d;

        /* renamed from: e  reason: collision with root package name */
        private BadgeDrawable f22594e;

        /* renamed from: f  reason: collision with root package name */
        private View f22595f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f22596g;

        /* renamed from: h  reason: collision with root package name */
        private ImageView f22597h;

        /* renamed from: i  reason: collision with root package name */
        private Drawable f22598i;

        /* renamed from: j  reason: collision with root package name */
        private int f22599j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements View.OnLayoutChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ View f22601a;

            a(View view) {
                this.f22601a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f22601a.getVisibility() == 0) {
                    i.this.s(this.f22601a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f22599j = 2;
            u(context);
            z.E0(this, TabLayout.this.f22536e, TabLayout.this.f22537f, TabLayout.this.f22538g, TabLayout.this.f22539h);
            setGravity(17);
            setOrientation(!TabLayout.this.A ? 1 : 0);
            setClickable(true);
            z.F0(this, w.b(getContext(), 1002));
            z.q0(this, null);
        }

        private void g(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private BadgeDrawable getBadge() {
            return this.f22594e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.f22591b, this.f22592c, this.f22595f};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f22594e == null) {
                this.f22594e = BadgeDrawable.c(getContext());
            }
            r();
            BadgeDrawable badgeDrawable = this.f22594e;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private float h(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private FrameLayout i() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(Canvas canvas) {
            Drawable drawable = this.f22598i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f22598i.draw(canvas);
            }
        }

        private FrameLayout k(View view) {
            if ((view == this.f22592c || view == this.f22591b) && com.google.android.material.badge.a.f22052a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean l() {
            return this.f22594e != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void m() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.a.f22052a) {
                frameLayout = i();
                addView(frameLayout, 0);
            } else {
                frameLayout = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(ha.h.f31221a, (ViewGroup) frameLayout, false);
            this.f22592c = imageView;
            frameLayout.addView(imageView, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void n() {
            FrameLayout frameLayout;
            if (com.google.android.material.badge.a.f22052a) {
                frameLayout = i();
                addView(frameLayout);
            } else {
                frameLayout = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(ha.h.f31222b, (ViewGroup) frameLayout, false);
            this.f22591b = textView;
            frameLayout.addView(textView);
        }

        private void p(View view) {
            if (l() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                com.google.android.material.badge.a.a(this.f22594e, view, k(view));
                this.f22593d = view;
            }
        }

        private void q() {
            if (l() && this.f22593d != null) {
                setClipChildren(true);
                setClipToPadding(true);
                BadgeDrawable badgeDrawable = this.f22594e;
                View view = this.f22593d;
                com.google.android.material.badge.a.b(badgeDrawable, view, k(view));
                this.f22593d = null;
            }
        }

        private void r() {
            g gVar;
            g gVar2;
            if (l()) {
                if (this.f22595f != null) {
                    q();
                } else if (this.f22592c != null && (gVar2 = this.f22590a) != null && gVar2.e() != null) {
                    View view = this.f22593d;
                    ImageView imageView = this.f22592c;
                    if (view != imageView) {
                        q();
                        p(this.f22592c);
                        return;
                    }
                    s(imageView);
                } else if (this.f22591b != null && (gVar = this.f22590a) != null && gVar.g() == 1) {
                    View view2 = this.f22593d;
                    TextView textView = this.f22591b;
                    if (view2 != textView) {
                        q();
                        p(this.f22591b);
                        return;
                    }
                    s(textView);
                } else {
                    q();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(View view) {
            if (l() && view == this.f22593d) {
                com.google.android.material.badge.a.c(this.f22594e, view, k(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        public void u(Context context) {
            int i10 = TabLayout.this.f22548q;
            if (i10 != 0) {
                Drawable b10 = e.a.b(context, i10);
                this.f22598i = b10;
                if (b10 != null && b10.isStateful()) {
                    this.f22598i.setState(getDrawableState());
                }
            } else {
                this.f22598i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            if (TabLayout.this.f22543l != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList a10 = va.b.a(TabLayout.this.f22543l);
                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z10 = TabLayout.this.C;
                    if (z10) {
                        gradientDrawable = null;
                    }
                    gradientDrawable = new RippleDrawable(a10, gradientDrawable, z10 ? null : gradientDrawable2);
                } else {
                    Drawable r10 = androidx.core.graphics.drawable.a.r(gradientDrawable2);
                    androidx.core.graphics.drawable.a.o(r10, a10);
                    gradientDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, r10});
                }
            }
            z.u0(this, gradientDrawable);
            TabLayout.this.invalidate();
        }

        private void w(TextView textView, ImageView imageView) {
            g gVar = this.f22590a;
            Drawable mutate = (gVar == null || gVar.e() == null) ? null : androidx.core.graphics.drawable.a.r(this.f22590a.e()).mutate();
            g gVar2 = this.f22590a;
            CharSequence h10 = gVar2 != null ? gVar2.h() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(h10);
            if (textView != null) {
                if (z10) {
                    textView.setText(h10);
                    if (this.f22590a.f22584f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int a10 = (z10 && imageView.getVisibility() == 0) ? (int) com.google.android.material.internal.h.a(getContext(), 8) : 0;
                if (TabLayout.this.A) {
                    if (a10 != androidx.core.view.h.a(marginLayoutParams)) {
                        androidx.core.view.h.c(marginLayoutParams, a10);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (a10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = a10;
                    androidx.core.view.h.c(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f22590a;
            c1.a(this, z10 ? null : gVar3 != null ? gVar3.f22581c : null);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f22598i;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.f22598i.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public g getTab() {
            return this.f22590a;
        }

        void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.c.class.getName());
        }

        @Override // android.view.View
        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(a.c.class.getName());
            BadgeDrawable badgeDrawable = this.f22594e;
            if (badgeDrawable == null || !badgeDrawable.isVisible()) {
                return;
            }
            CharSequence contentDescription = getContentDescription();
            accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.f22594e.g()));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f22549r, RecyclerView.UNDEFINED_DURATION);
            }
            super.onMeasure(i10, i11);
            if (this.f22591b != null) {
                float f10 = TabLayout.this.f22546o;
                int i12 = this.f22599j;
                ImageView imageView = this.f22592c;
                boolean z10 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f22591b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f22547p;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f22591b.getTextSize();
                int lineCount = this.f22591b.getLineCount();
                int d10 = androidx.core.widget.j.d(this.f22591b);
                int i13 = (f10 > textSize ? 1 : (f10 == textSize ? 0 : -1));
                if (i13 != 0 || (d10 >= 0 && i12 != d10)) {
                    if (TabLayout.this.f22557z == 1 && i13 > 0 && lineCount == 1 && ((layout = this.f22591b.getLayout()) == null || h(layout, 0, f10) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f22591b.setTextSize(0, f10);
                        this.f22591b.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f22590a != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.f22590a.k();
                return true;
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10 && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            TextView textView = this.f22591b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f22592c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f22595f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(g gVar) {
            if (gVar != this.f22590a) {
                this.f22590a = gVar;
                t();
            }
        }

        final void t() {
            g gVar = this.f22590a;
            Drawable drawable = null;
            View d10 = gVar != null ? gVar.d() : null;
            if (d10 != null) {
                ViewParent parent = d10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(d10);
                    }
                    addView(d10);
                }
                this.f22595f = d10;
                TextView textView = this.f22591b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f22592c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f22592c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) d10.findViewById(16908308);
                this.f22596g = textView2;
                if (textView2 != null) {
                    this.f22599j = androidx.core.widget.j.d(textView2);
                }
                this.f22597h = (ImageView) d10.findViewById(16908294);
            } else {
                View view = this.f22595f;
                if (view != null) {
                    removeView(view);
                    this.f22595f = null;
                }
                this.f22596g = null;
                this.f22597h = null;
            }
            if (this.f22595f == null) {
                if (this.f22592c == null) {
                    m();
                }
                if (gVar != null && gVar.e() != null) {
                    drawable = androidx.core.graphics.drawable.a.r(gVar.e()).mutate();
                }
                if (drawable != null) {
                    androidx.core.graphics.drawable.a.o(drawable, TabLayout.this.f22542k);
                    PorterDuff.Mode mode = TabLayout.this.f22545n;
                    if (mode != null) {
                        androidx.core.graphics.drawable.a.p(drawable, mode);
                    }
                }
                if (this.f22591b == null) {
                    n();
                    this.f22599j = androidx.core.widget.j.d(this.f22591b);
                }
                androidx.core.widget.j.q(this.f22591b, TabLayout.this.f22540i);
                ColorStateList colorStateList = TabLayout.this.f22541j;
                if (colorStateList != null) {
                    this.f22591b.setTextColor(colorStateList);
                }
                w(this.f22591b, this.f22592c);
                r();
                g(this.f22592c);
                g(this.f22591b);
            } else {
                TextView textView3 = this.f22596g;
                if (textView3 != null || this.f22597h != null) {
                    w(textView3, this.f22597h);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f22581c)) {
                setContentDescription(gVar.f22581c);
            }
            setSelected(gVar != null && gVar.i());
        }

        final void v() {
            setOrientation(!TabLayout.this.A ? 1 : 0);
            TextView textView = this.f22596g;
            if (textView == null && this.f22597h == null) {
                w(this.f22591b, this.f22592c);
            } else {
                w(textView, this.f22597h);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class j implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f22603a;

        public j(ViewPager viewPager) {
            this.f22603a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
            this.f22603a.setCurrentItem(gVar.f());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ha.b.f31155z);
    }

    private void A(int i10) {
        i iVar = (i) this.f22535d.getChildAt(i10);
        this.f22535d.removeViewAt(i10);
        if (iVar != null) {
            iVar.o();
            this.N.a(iVar);
        }
        requestLayout();
    }

    private void H(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.H;
        if (viewPager2 != null) {
            h hVar = this.K;
            if (hVar != null) {
                viewPager2.J(hVar);
            }
            b bVar = this.L;
            if (bVar != null) {
                this.H.I(bVar);
            }
        }
        c cVar = this.F;
        if (cVar != null) {
            z(cVar);
            this.F = null;
        }
        if (viewPager != null) {
            this.H = viewPager;
            if (this.K == null) {
                this.K = new h(this);
            }
            this.K.a();
            viewPager.c(this.K);
            j jVar = new j(viewPager);
            this.F = jVar;
            b(jVar);
            androidx.viewpager.widget.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                D(adapter, z10);
            }
            if (this.L == null) {
                this.L = new b();
            }
            this.L.b(z10);
            viewPager.b(this.L);
            E(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.H = null;
            D(null, false);
        }
        this.M = z11;
    }

    private void I() {
        int size = this.f22532a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f22532a.get(i10).r();
        }
    }

    private void J(LinearLayout.LayoutParams layoutParams) {
        if (this.f22557z == 1 && this.f22554w == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    private void f(com.google.android.material.tabs.a aVar) {
        g v10 = v();
        CharSequence charSequence = aVar.f22604a;
        if (charSequence != null) {
            v10.q(charSequence);
        }
        Drawable drawable = aVar.f22605b;
        if (drawable != null) {
            v10.o(drawable);
        }
        int i10 = aVar.f22606c;
        if (i10 != 0) {
            v10.m(i10);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            v10.l(aVar.getContentDescription());
        }
        c(v10);
    }

    private void g(g gVar) {
        i iVar = gVar.f22586h;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f22535d.addView(iVar, gVar.f(), n());
    }

    private int getDefaultHeight() {
        int size = this.f22532a.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                g gVar = this.f22532a.get(i10);
                if (gVar != null && gVar.e() != null && !TextUtils.isEmpty(gVar.h())) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return (!z10 || this.A) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.f22550s;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f22557z;
        if (i11 == 0 || i11 == 2) {
            return this.f22552u;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f22535d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void h(View view) {
        if (view instanceof com.google.android.material.tabs.a) {
            f((com.google.android.material.tabs.a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void i(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null && z.U(this) && !this.f22535d.c()) {
            int scrollX = getScrollX();
            int k10 = k(i10, 0.0f);
            if (scrollX != k10) {
                t();
                this.G.setIntValues(scrollX, k10);
                this.G.start();
            }
            this.f22535d.a(i10, this.f22555x);
            return;
        }
        E(i10, 0.0f, true);
    }

    private void j() {
        int i10 = this.f22557z;
        z.E0(this.f22535d, (i10 == 0 || i10 == 2) ? Math.max(0, this.f22553v - this.f22536e) : 0, 0, 0, 0);
        int i11 = this.f22557z;
        if (i11 == 0) {
            this.f22535d.setGravity(8388611);
        } else if (i11 == 1 || i11 == 2) {
            this.f22535d.setGravity(1);
        }
        K(true);
    }

    private int k(int i10, float f10) {
        int i11 = this.f22557z;
        if (i11 == 0 || i11 == 2) {
            View childAt = this.f22535d.getChildAt(i10);
            int i12 = i10 + 1;
            View childAt2 = i12 < this.f22535d.getChildCount() ? this.f22535d.getChildAt(i12) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
            int i13 = (int) ((width + width2) * 0.5f * f10);
            return z.C(this) == 0 ? left + i13 : left - i13;
        }
        return 0;
    }

    private void l(g gVar, int i10) {
        gVar.p(i10);
        this.f22532a.add(i10, gVar);
        int size = this.f22532a.size();
        while (true) {
            i10++;
            if (i10 >= size) {
                return;
            }
            this.f22532a.get(i10).p(i10);
        }
    }

    private static ColorStateList m(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams n() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        J(layoutParams);
        return layoutParams;
    }

    private i p(g gVar) {
        h0.e<i> eVar = this.N;
        i b10 = eVar != null ? eVar.b() : null;
        if (b10 == null) {
            b10 = new i(getContext());
        }
        b10.setTab(gVar);
        b10.setFocusable(true);
        b10.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f22581c)) {
            b10.setContentDescription(gVar.f22580b);
        } else {
            b10.setContentDescription(gVar.f22581c);
        }
        return b10;
    }

    private void q(g gVar) {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size).c(gVar);
        }
    }

    private void r(g gVar) {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size).a(gVar);
        }
    }

    private void s(g gVar) {
        for (int size = this.E.size() - 1; size >= 0; size--) {
            this.E.get(size).b(gVar);
        }
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f22535d.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f22535d.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    private void t() {
        if (this.G == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.G = valueAnimator;
            valueAnimator.setInterpolator(ia.a.f31870b);
            this.G.setDuration(this.f22555x);
            this.G.addUpdateListener(new a());
        }
    }

    public void B(g gVar) {
        C(gVar, true);
    }

    public void C(g gVar, boolean z10) {
        g gVar2 = this.f22533b;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                q(gVar);
                i(gVar.f());
                return;
            }
            return;
        }
        int f10 = gVar != null ? gVar.f() : -1;
        if (z10) {
            if ((gVar2 == null || gVar2.f() == -1) && f10 != -1) {
                E(f10, 0.0f, true);
            } else {
                i(f10);
            }
            if (f10 != -1) {
                setSelectedTabView(f10);
            }
        }
        this.f22533b = gVar;
        if (gVar2 != null) {
            s(gVar2);
        }
        if (gVar != null) {
            r(gVar);
        }
    }

    void D(androidx.viewpager.widget.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        androidx.viewpager.widget.a aVar2 = this.I;
        if (aVar2 != null && (dataSetObserver = this.J) != null) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.I = aVar;
        if (z10 && aVar != null) {
            if (this.J == null) {
                this.J = new e();
            }
            aVar.registerDataSetObserver(this.J);
        }
        w();
    }

    public void E(int i10, float f10, boolean z10) {
        F(i10, f10, z10, true);
    }

    public void F(int i10, float f10, boolean z10, boolean z11) {
        int round = Math.round(i10 + f10);
        if (round < 0 || round >= this.f22535d.getChildCount()) {
            return;
        }
        if (z11) {
            this.f22535d.e(i10, f10);
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.G.cancel();
        }
        scrollTo(k(i10, f10), 0);
        if (z10) {
            setSelectedTabView(round);
        }
    }

    public void G(ViewPager viewPager, boolean z10) {
        H(viewPager, z10, false);
    }

    void K(boolean z10) {
        for (int i10 = 0; i10 < this.f22535d.getChildCount(); i10++) {
            View childAt = this.f22535d.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            J((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        h(view);
    }

    @Deprecated
    public void b(c cVar) {
        if (this.E.contains(cVar)) {
            return;
        }
        this.E.add(cVar);
    }

    public void c(g gVar) {
        e(gVar, this.f22532a.isEmpty());
    }

    public void d(g gVar, int i10, boolean z10) {
        if (gVar.f22585g == this) {
            l(gVar, i10);
            g(gVar);
            if (z10) {
                gVar.k();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void e(g gVar, boolean z10) {
        d(gVar, this.f22532a.size(), z10);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f22533b;
        if (gVar != null) {
            return gVar.f();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f22532a.size();
    }

    public int getTabGravity() {
        return this.f22554w;
    }

    public ColorStateList getTabIconTint() {
        return this.f22542k;
    }

    public int getTabIndicatorGravity() {
        return this.f22556y;
    }

    int getTabMaxWidth() {
        return this.f22549r;
    }

    public int getTabMode() {
        return this.f22557z;
    }

    public ColorStateList getTabRippleColor() {
        return this.f22543l;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f22544m;
    }

    public ColorStateList getTabTextColors() {
        return this.f22541j;
    }

    protected g o() {
        g b10 = O.b();
        return b10 == null ? new g() : b10;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        xa.h.e(this);
        if (this.H == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                H((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.M) {
            setupWithViewPager(null);
            this.M = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f22535d.getChildCount(); i10++) {
            View childAt = this.f22535d.getChildAt(i10);
            if (childAt instanceof i) {
                ((i) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.h.a(r0, r1)
            int r0 = (int) r0
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2b
            if (r1 == 0) goto L1c
            goto L3e
        L1c:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L3e
        L2b:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L3e
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L3e
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L3e:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5c
            int r1 = r6.f22551t
            if (r1 <= 0) goto L4d
            goto L5a
        L4d:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.h.a(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5a:
            r6.f22549r = r1
        L5c:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f22557z
            if (r0 == 0) goto L7f
            if (r0 == r5) goto L73
            r1 = 2
            if (r0 == r1) goto L7f
            goto L8a
        L73:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8a
        L7d:
            r4 = 1
            goto L8a
        L7f:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8a
            goto L7d
        L8a:
            if (r4 == 0) goto Laa
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        xa.h.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            for (int i10 = 0; i10 < this.f22535d.getChildCount(); i10++) {
                View childAt = this.f22535d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).v();
                }
            }
            j();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        t();
        this.G.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f22544m != drawable) {
            this.f22544m = drawable;
            z.h0(this.f22535d);
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f22535d.f(i10);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f22556y != i10) {
            this.f22556y = i10;
            z.h0(this.f22535d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.f22535d.g(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f22554w != i10) {
            this.f22554w = i10;
            j();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f22542k != colorStateList) {
            this.f22542k = colorStateList;
            I();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(e.a.a(getContext(), i10));
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.B = z10;
        z.h0(this.f22535d);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f22557z) {
            this.f22557z = i10;
            j();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f22543l != colorStateList) {
            this.f22543l = colorStateList;
            for (int i10 = 0; i10 < this.f22535d.getChildCount(); i10++) {
                View childAt = this.f22535d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(e.a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f22541j != colorStateList) {
            this.f22541j = colorStateList;
            I();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(androidx.viewpager.widget.a aVar) {
        D(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            for (int i10 = 0; i10 < this.f22535d.getChildCount(); i10++) {
                View childAt = this.f22535d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        G(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public g u(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.f22532a.get(i10);
    }

    public g v() {
        g o10 = o();
        o10.f22585g = this;
        o10.f22586h = p(o10);
        return o10;
    }

    void w() {
        int currentItem;
        y();
        androidx.viewpager.widget.a aVar = this.I;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                e(v().q(this.I.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.H;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            B(u(currentItem));
        }
    }

    protected boolean x(g gVar) {
        return O.a(gVar);
    }

    public void y() {
        for (int childCount = this.f22535d.getChildCount() - 1; childCount >= 0; childCount--) {
            A(childCount);
        }
        Iterator<g> it = this.f22532a.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.j();
            x(next);
        }
        this.f22533b = null;
    }

    @Deprecated
    public void z(c cVar) {
        this.E.remove(cVar);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22532a = new ArrayList<>();
        this.f22534c = new RectF();
        this.f22549r = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.E = new ArrayList<>();
        this.N = new Pools$SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context);
        this.f22535d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = l.f31300g2;
        int i11 = k.f31257f;
        int i12 = l.D2;
        TypedArray k10 = com.google.android.material.internal.g.k(context, attributeSet, iArr, i10, i11, i12);
        if (getBackground() instanceof ColorDrawable) {
            xa.g gVar = new xa.g();
            gVar.U(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.L(context);
            gVar.T(z.w(this));
            z.u0(this, gVar);
        }
        fVar.g(k10.getDimensionPixelSize(l.f31355r2, -1));
        fVar.f(k10.getColor(l.f31340o2, 0));
        setSelectedTabIndicator(ua.c.d(context, k10, l.f31330m2));
        setSelectedTabIndicatorGravity(k10.getInt(l.f31350q2, 0));
        setTabIndicatorFullWidth(k10.getBoolean(l.f31345p2, true));
        int dimensionPixelSize = k10.getDimensionPixelSize(l.f31380w2, 0);
        this.f22539h = dimensionPixelSize;
        this.f22538g = dimensionPixelSize;
        this.f22537f = dimensionPixelSize;
        this.f22536e = dimensionPixelSize;
        this.f22536e = k10.getDimensionPixelSize(l.f31395z2, dimensionPixelSize);
        this.f22537f = k10.getDimensionPixelSize(l.A2, this.f22537f);
        this.f22538g = k10.getDimensionPixelSize(l.f31390y2, this.f22538g);
        this.f22539h = k10.getDimensionPixelSize(l.f31385x2, this.f22539h);
        int resourceId = k10.getResourceId(i12, k.f31253b);
        this.f22540i = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, d.j.M2);
        try {
            this.f22546o = obtainStyledAttributes.getDimensionPixelSize(d.j.N2, 0);
            this.f22541j = ua.c.a(context, obtainStyledAttributes, d.j.Q2);
            obtainStyledAttributes.recycle();
            int i13 = l.E2;
            if (k10.hasValue(i13)) {
                this.f22541j = ua.c.a(context, k10, i13);
            }
            int i14 = l.C2;
            if (k10.hasValue(i14)) {
                this.f22541j = m(this.f22541j.getDefaultColor(), k10.getColor(i14, 0));
            }
            this.f22542k = ua.c.a(context, k10, l.f31320k2);
            this.f22545n = com.google.android.material.internal.h.c(k10.getInt(l.f31325l2, -1), null);
            this.f22543l = ua.c.a(context, k10, l.B2);
            this.f22555x = k10.getInt(l.f31335n2, ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
            this.f22550s = k10.getDimensionPixelSize(l.f31370u2, -1);
            this.f22551t = k10.getDimensionPixelSize(l.f31365t2, -1);
            this.f22548q = k10.getResourceId(l.f31305h2, 0);
            this.f22553v = k10.getDimensionPixelSize(l.f31310i2, 0);
            this.f22557z = k10.getInt(l.f31375v2, 1);
            this.f22554w = k10.getInt(l.f31315j2, 0);
            this.A = k10.getBoolean(l.f31360s2, false);
            this.C = k10.getBoolean(l.F2, false);
            k10.recycle();
            Resources resources = getResources();
            this.f22547p = resources.getDimensionPixelSize(ha.d.f31169i);
            this.f22552u = resources.getDimensionPixelSize(ha.d.f31168h);
            j();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        h(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.D;
        if (cVar2 != null) {
            z(cVar2);
        }
        this.D = cVar;
        if (cVar != null) {
            b(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        h(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        h(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(e.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
