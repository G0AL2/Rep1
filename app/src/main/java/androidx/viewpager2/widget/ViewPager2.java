package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import i0.c;
import i0.f;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: u  reason: collision with root package name */
    static boolean f4323u = true;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f4324a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f4325b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.viewpager2.widget.b f4326c;

    /* renamed from: d  reason: collision with root package name */
    int f4327d;

    /* renamed from: e  reason: collision with root package name */
    boolean f4328e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.j f4329f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayoutManager f4330g;

    /* renamed from: h  reason: collision with root package name */
    private int f4331h;

    /* renamed from: i  reason: collision with root package name */
    private Parcelable f4332i;

    /* renamed from: j  reason: collision with root package name */
    RecyclerView f4333j;

    /* renamed from: k  reason: collision with root package name */
    private androidx.recyclerview.widget.k f4334k;

    /* renamed from: l  reason: collision with root package name */
    androidx.viewpager2.widget.e f4335l;

    /* renamed from: m  reason: collision with root package name */
    private androidx.viewpager2.widget.b f4336m;

    /* renamed from: n  reason: collision with root package name */
    private androidx.viewpager2.widget.c f4337n;

    /* renamed from: o  reason: collision with root package name */
    private androidx.viewpager2.widget.d f4338o;

    /* renamed from: p  reason: collision with root package name */
    private RecyclerView.m f4339p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f4340q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f4341r;

    /* renamed from: s  reason: collision with root package name */
    private int f4342s;

    /* renamed from: t  reason: collision with root package name */
    e f4343t;

    /* loaded from: classes.dex */
    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void onChanged() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f4328e = true;
            viewPager2.f4335l.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.n();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f4327d != i10) {
                viewPager2.f4327d = i10;
                viewPager2.f4343t.q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f4333j.requestFocus(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements RecyclerView.r {
        d(ViewPager2 viewPager2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class e {
        private e(ViewPager2 viewPager2) {
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(RecyclerView.h<?> hVar) {
        }

        void f(RecyclerView.h<?> hVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(i0.c cVar) {
        }

        boolean k(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void m() {
        }

        CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        void o(AccessibilityEvent accessibilityEvent) {
        }

        void p() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this(viewPager2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(i0.c cVar) {
            if (ViewPager2.this.e()) {
                return;
            }
            cVar.S(c.a.f31495j);
            cVar.S(c.a.f31494i);
            cVar.v0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean k(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i10, int i11) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i10, int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i10, int i11) {
            onChanged();
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i10, int i11, Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean A1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void T0(RecyclerView.w wVar, RecyclerView.a0 a0Var, i0.c cVar) {
            super.T0(wVar, a0Var, cVar);
            ViewPager2.this.f4343t.j(cVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void U1(RecyclerView.a0 a0Var, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.U1(a0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean o1(RecyclerView.w wVar, RecyclerView.a0 a0Var, int i10, Bundle bundle) {
            if (ViewPager2.this.f4343t.b(i10)) {
                return ViewPager2.this.f4343t.k(i10);
            }
            return super.o1(wVar, a0Var, i10, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void a(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }

        public void c(int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j extends e {

        /* renamed from: a  reason: collision with root package name */
        private final i0.f f4351a;

        /* renamed from: b  reason: collision with root package name */
        private final i0.f f4352b;

        /* renamed from: c  reason: collision with root package name */
        private RecyclerView.j f4353c;

        /* loaded from: classes.dex */
        class a implements i0.f {
            a() {
            }

            @Override // i0.f
            public boolean a(View view, f.a aVar) {
                j.this.v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        class b implements i0.f {
            b() {
            }

            @Override // i0.f
            public boolean a(View view, f.a aVar) {
                j.this.v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.j
            public void onChanged() {
                j.this.w();
            }
        }

        j() {
            super(ViewPager2.this, null);
            this.f4351a = new a();
            this.f4352b = new b();
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i10;
            int i11;
            if (ViewPager2.this.getAdapter() == null) {
                i10 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i10 = ViewPager2.this.getAdapter().getItemCount();
            } else {
                i11 = ViewPager2.this.getAdapter().getItemCount();
                i10 = 0;
                i0.c.F0(accessibilityNodeInfo).c0(c.b.a(i10, i11, false, 0));
            }
            i11 = 0;
            i0.c.F0(accessibilityNodeInfo).c0(c.b.a(i10, i11, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.f4327d > 0) {
                accessibilityNodeInfo.addAction(Constants.BUFFER_SIZE);
            }
            if (ViewPager2.this.f4327d < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(RecyclerView.h<?> hVar) {
            w();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f4353c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f4353c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            z.A0(recyclerView, 2);
            this.f4353c = new c();
            if (z.A(ViewPager2.this) == 0) {
                z.A0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                u(accessibilityNodeInfo);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10, Bundle bundle) {
            int currentItem;
            if (c(i10, bundle)) {
                if (i10 == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                v(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void m() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            w();
            if (Build.VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        void v(int i10) {
            if (ViewPager2.this.e()) {
                ViewPager2.this.k(i10, true);
            }
        }

        void w() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            z.k0(viewPager2, 16908360);
            z.k0(viewPager2, 16908361);
            z.k0(viewPager2, 16908358);
            z.k0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                boolean d10 = ViewPager2.this.d();
                int i10 = d10 ? 16908360 : 16908361;
                int i11 = d10 ? 16908361 : 16908360;
                if (ViewPager2.this.f4327d < itemCount - 1) {
                    z.m0(viewPager2, new c.a(i10, null), null, this.f4351a);
                }
                if (ViewPager2.this.f4327d > 0) {
                    z.m0(viewPager2, new c.a(i11, null), null, this.f4352b);
                    return;
                }
                return;
            }
            if (ViewPager2.this.f4327d < itemCount - 1) {
                z.m0(viewPager2, new c.a(16908359, null), null, this.f4351a);
            }
            if (ViewPager2.this.f4327d > 0) {
                z.m0(viewPager2, new c.a(16908358, null), null, this.f4352b);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(View view, float f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l extends androidx.recyclerview.widget.k {
        l() {
        }

        @Override // androidx.recyclerview.widget.k, androidx.recyclerview.widget.o
        public View h(RecyclerView.p pVar) {
            if (ViewPager2.this.c()) {
                return null;
            }
            return super.h(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f4343t.d()) {
                return ViewPager2.this.f4343t.n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f4327d);
            accessibilityEvent.setToIndex(ViewPager2.this.f4327d);
            ViewPager2.this.f4343t.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final int f4360a;

        /* renamed from: b  reason: collision with root package name */
        private final RecyclerView f4361b;

        n(int i10, RecyclerView recyclerView) {
            this.f4360a = i10;
            this.f4361b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4361b.smoothScrollToPosition(this.f4360a);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        this.f4324a = new Rect();
        this.f4325b = new Rect();
        this.f4326c = new androidx.viewpager2.widget.b(3);
        this.f4328e = false;
        this.f4329f = new a();
        this.f4331h = -1;
        this.f4339p = null;
        this.f4340q = false;
        this.f4341r = true;
        this.f4342s = -1;
        b(context, null);
    }

    private RecyclerView.r a() {
        return new d(this);
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f4343t = f4323u ? new j() : new f();
        m mVar = new m(context);
        this.f4333j = mVar;
        mVar.setId(z.l());
        this.f4333j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f4330g = hVar;
        this.f4333j.setLayoutManager(hVar);
        this.f4333j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f4333j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f4333j.addOnChildAttachStateChangeListener(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f4335l = eVar;
        this.f4337n = new androidx.viewpager2.widget.c(this, eVar, this.f4333j);
        l lVar = new l();
        this.f4334k = lVar;
        lVar.b(this.f4333j);
        this.f4333j.addOnScrollListener(this.f4335l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f4336m = bVar;
        this.f4335l.o(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f4336m.d(bVar2);
        this.f4336m.d(cVar);
        this.f4343t.h(this.f4336m, this.f4333j);
        this.f4336m.d(this.f4326c);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f4330g);
        this.f4338o = dVar;
        this.f4336m.d(dVar);
        RecyclerView recyclerView = this.f4333j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f4329f);
        }
    }

    private void i() {
        RecyclerView.h adapter;
        if (this.f4331h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f4332i;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.a) {
                ((androidx.viewpager2.adapter.a) adapter).b(parcelable);
            }
            this.f4332i = null;
        }
        int max = Math.max(0, Math.min(this.f4331h, adapter.getItemCount() - 1));
        this.f4327d = max;
        this.f4331h = -1;
        this.f4333j.scrollToPosition(max);
        this.f4343t.m();
    }

    private void l(Context context, AttributeSet attributeSet) {
        int[] iArr = h1.a.f31054a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(h1.a.f31055b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f4329f);
        }
    }

    public boolean c() {
        return this.f4337n.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f4333j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f4333j.canScrollVertically(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f4330g.j0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f4344a;
            sparseArray.put(this.f4333j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f4341r;
    }

    public void g(i iVar) {
        this.f4326c.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.f4343t.a()) {
            return this.f4343t.g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f4333j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f4327d;
    }

    public int getItemDecorationCount() {
        return this.f4333j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f4342s;
    }

    public int getOrientation() {
        return this.f4330g.t2();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f4333j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f4335l.h();
    }

    public void h() {
        if (this.f4338o.d() == null) {
            return;
        }
        double g10 = this.f4335l.g();
        int i10 = (int) g10;
        float f10 = (float) (g10 - i10);
        this.f4338o.b(i10, f10, Math.round(getPageSize() * f10));
    }

    public void j(int i10, boolean z10) {
        if (!c()) {
            k(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    void k(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f4331h != -1) {
                this.f4331h = Math.max(i10, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
            if (min == this.f4327d && this.f4335l.j()) {
                return;
            }
            int i11 = this.f4327d;
            if (min == i11 && z10) {
                return;
            }
            double d10 = i11;
            this.f4327d = min;
            this.f4343t.q();
            if (!this.f4335l.j()) {
                d10 = this.f4335l.g();
            }
            this.f4335l.m(min, z10);
            if (!z10) {
                this.f4333j.scrollToPosition(min);
                return;
            }
            double d11 = min;
            if (Math.abs(d11 - d10) > 3.0d) {
                this.f4333j.scrollToPosition(d11 > d10 ? min - 3 : min + 3);
                RecyclerView recyclerView = this.f4333j;
                recyclerView.post(new n(min, recyclerView));
                return;
            }
            this.f4333j.smoothScrollToPosition(min);
        }
    }

    void n() {
        androidx.recyclerview.widget.k kVar = this.f4334k;
        if (kVar != null) {
            View h10 = kVar.h(this.f4330g);
            if (h10 == null) {
                return;
            }
            int n02 = this.f4330g.n0(h10);
            if (n02 != this.f4327d && getScrollState() == 0) {
                this.f4336m.c(n02);
            }
            this.f4328e = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f4343t.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f4333j.getMeasuredWidth();
        int measuredHeight = this.f4333j.getMeasuredHeight();
        this.f4324a.left = getPaddingLeft();
        this.f4324a.right = (i12 - i10) - getPaddingRight();
        this.f4324a.top = getPaddingTop();
        this.f4324a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f4324a, this.f4325b);
        RecyclerView recyclerView = this.f4333j;
        Rect rect = this.f4325b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f4328e) {
            n();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.f4333j, i10, i11);
        int measuredWidth = this.f4333j.getMeasuredWidth();
        int measuredHeight = this.f4333j.getMeasuredHeight();
        int measuredState = this.f4333j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4331h = savedState.f4345b;
        this.f4332i = savedState.f4346c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4344a = this.f4333j.getId();
        int i10 = this.f4331h;
        if (i10 == -1) {
            i10 = this.f4327d;
        }
        savedState.f4345b = i10;
        Parcelable parcelable = this.f4332i;
        if (parcelable != null) {
            savedState.f4346c = parcelable;
        } else {
            RecyclerView.h adapter = this.f4333j.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.a) {
                savedState.f4346c = ((androidx.viewpager2.adapter.a) adapter).a();
            }
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (this.f4343t.c(i10, bundle)) {
            return this.f4343t.l(i10, bundle);
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f4333j.getAdapter();
        this.f4343t.f(adapter);
        m(adapter);
        this.f4333j.setAdapter(hVar);
        this.f4327d = 0;
        i();
        this.f4343t.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i10) {
        j(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f4343t.p();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f4342s = i10;
        this.f4333j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f4330g.G2(i10);
        this.f4343t.r();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f4340q) {
                this.f4339p = this.f4333j.getItemAnimator();
                this.f4340q = true;
            }
            this.f4333j.setItemAnimator(null);
        } else if (this.f4340q) {
            this.f4333j.setItemAnimator(this.f4339p);
            this.f4339p = null;
            this.f4340q = false;
        }
        if (kVar == this.f4338o.d()) {
            return;
        }
        this.f4338o.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f4341r = z10;
        this.f4343t.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f4344a;

        /* renamed from: b  reason: collision with root package name */
        int f4345b;

        /* renamed from: c  reason: collision with root package name */
        Parcelable f4346c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            c(parcel, classLoader);
        }

        private void c(Parcel parcel, ClassLoader classLoader) {
            this.f4344a = parcel.readInt();
            this.f4345b = parcel.readInt();
            this.f4346c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4344a);
            parcel.writeInt(this.f4345b);
            parcel.writeParcelable(this.f4346c, i10);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            c(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
