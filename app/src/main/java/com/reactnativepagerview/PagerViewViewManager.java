package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import fm.castbox.mediation.BuildConfig;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import qe.k;
import qe.v;

/* compiled from: PagerViewViewManager.kt */
/* loaded from: classes3.dex */
public final class PagerViewViewManager extends ViewGroupManager<com.reactnativepagerview.a> {
    private static final int COMMAND_SET_PAGE = 1;
    private static final int COMMAND_SET_PAGE_WITHOUT_ANIMATION = 2;
    private static final int COMMAND_SET_SCROLL_ENABLED = 3;
    public static final a Companion = new a(null);
    private static final String REACT_CLASS = "RNCViewPager";
    private com.facebook.react.uimanager.events.d eventDispatcher;

    /* compiled from: PagerViewViewManager.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: PagerViewViewManager.kt */
    /* loaded from: classes3.dex */
    public static final class b extends ViewPager2.i {

        /* renamed from: b */
        final /* synthetic */ com.reactnativepagerview.a f28381b;

        b(com.reactnativepagerview.a aVar) {
            PagerViewViewManager.this = r1;
            this.f28381b = aVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void a(int i10) {
            String str;
            super.a(i10);
            if (i10 == 0) {
                str = "idle";
            } else if (i10 == 1) {
                str = "dragging";
            } else if (i10 != 2) {
                throw new IllegalStateException("Unsupported pageScrollState");
            } else {
                str = "settling";
            }
            com.facebook.react.uimanager.events.d dVar = PagerViewViewManager.this.eventDispatcher;
            if (dVar == null) {
                k.s("eventDispatcher");
                dVar = null;
            }
            dVar.g(new md.b(this.f28381b.getId(), str));
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void b(int i10, float f10, int i11) {
            super.b(i10, f10, i11);
            com.facebook.react.uimanager.events.d dVar = PagerViewViewManager.this.eventDispatcher;
            if (dVar == null) {
                k.s("eventDispatcher");
                dVar = null;
            }
            dVar.g(new md.a(this.f28381b.getId(), i10, f10));
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            super.c(i10);
            com.facebook.react.uimanager.events.d dVar = PagerViewViewManager.this.eventDispatcher;
            if (dVar == null) {
                k.s("eventDispatcher");
                dVar = null;
            }
            dVar.g(new md.c(this.f28381b.getId(), i10));
        }
    }

    /* renamed from: createViewInstance$lambda-0 */
    public static final void m2createViewInstance$lambda0(ViewPager2 viewPager2, PagerViewViewManager pagerViewViewManager, com.reactnativepagerview.a aVar) {
        k.f(viewPager2, "$vp");
        k.f(pagerViewViewManager, "this$0");
        k.f(aVar, "$host");
        viewPager2.g(new b(aVar));
        com.facebook.react.uimanager.events.d dVar = pagerViewViewManager.eventDispatcher;
        if (dVar == null) {
            k.s("eventDispatcher");
            dVar = null;
        }
        dVar.g(new md.c(aVar.getId(), viewPager2.getCurrentItem()));
    }

    public static /* synthetic */ void g(View view) {
        m3refreshViewChildrenLayout$lambda3(view);
    }

    private final ViewPager2 getViewPager(com.reactnativepagerview.a aVar) {
        if (aVar.getChildAt(0) instanceof ViewPager2) {
            View childAt = aVar.getChildAt(0);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            return (ViewPager2) childAt;
        }
        throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
    }

    public static /* synthetic */ void i(int i10, ViewPager2 viewPager2, View view, float f10) {
        m5setPageMargin$lambda2(i10, viewPager2, view, f10);
    }

    public static /* synthetic */ void j(com.reactnativepagerview.a aVar) {
        m4setInitialPage$lambda1(aVar);
    }

    public static /* synthetic */ void k(ViewPager2 viewPager2, PagerViewViewManager pagerViewViewManager, com.reactnativepagerview.a aVar) {
        m2createViewInstance$lambda0(viewPager2, pagerViewViewManager, aVar);
    }

    private final void refreshViewChildrenLayout(final View view) {
        view.post(new Runnable() { // from class: com.reactnativepagerview.d
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.g(view);
            }
        });
    }

    /* renamed from: refreshViewChildrenLayout$lambda-3 */
    public static final void m3refreshViewChildrenLayout$lambda3(View view) {
        k.f(view, "$view");
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private final void setCurrentItem(ViewPager2 viewPager2, int i10, boolean z10) {
        refreshViewChildrenLayout(viewPager2);
        viewPager2.j(i10, z10);
    }

    /* renamed from: setInitialPage$lambda-1 */
    public static final void m4setInitialPage$lambda1(com.reactnativepagerview.a aVar) {
        k.f(aVar, "$host");
        aVar.setDidSetInitialIndex(true);
    }

    /* renamed from: setPageMargin$lambda-2 */
    public static final void m5setPageMargin$lambda2(int i10, ViewPager2 viewPager2, View view, float f10) {
        k.f(viewPager2, "$pager");
        k.f(view, "page");
        float f11 = i10 * f10;
        if (viewPager2.getOrientation() == 0) {
            if (viewPager2.getLayoutDirection() == 1) {
                f11 = -f11;
            }
            view.setTranslationX(f11);
            return;
        }
        view.setTranslationY(f11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return h6.e.f("setPage", 1, "setPageWithoutAnimation", 2, "setScrollEnabled", 3);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map<String, Map<String, String>> f10 = h6.e.f("topPageScroll", h6.e.d("registrationName", "onPageScroll"), "topPageScrollStateChanged", h6.e.d("registrationName", "onPageScrollStateChanged"), "topPageSelected", h6.e.d("registrationName", "onPageSelected"));
        k.e(f10, "of(\n      PageScrollEven…Name\", \"onPageSelected\"))");
        return f10;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @w6.a(defaultInt = -1, name = "offscreenPageLimit")
    public final void set(com.reactnativepagerview.a aVar, int i10) {
        k.f(aVar, "host");
        getViewPager(aVar).setOffscreenPageLimit(i10);
    }

    @w6.a(defaultInt = 0, name = "initialPage")
    public final void setInitialPage(final com.reactnativepagerview.a aVar, int i10) {
        k.f(aVar, "host");
        ViewPager2 viewPager = getViewPager(aVar);
        if (aVar.getInitialIndex() == null) {
            aVar.setInitialIndex(Integer.valueOf(i10));
            viewPager.post(new Runnable() { // from class: com.reactnativepagerview.f
                @Override // java.lang.Runnable
                public final void run() {
                    PagerViewViewManager.j(a.this);
                }
            });
        }
    }

    @w6.a(name = "layoutDirection")
    public final void setLayoutDirection(com.reactnativepagerview.a aVar, String str) {
        k.f(aVar, "host");
        k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ViewPager2 viewPager = getViewPager(aVar);
        if (k.a(str, "rtl")) {
            viewPager.setLayoutDirection(1);
        } else {
            viewPager.setLayoutDirection(0);
        }
    }

    @w6.a(name = AdUnitActivity.EXTRA_ORIENTATION)
    public final void setOrientation(com.reactnativepagerview.a aVar, String str) {
        k.f(aVar, "host");
        k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        getViewPager(aVar).setOrientation(k.a(str, "vertical") ? 1 : 0);
    }

    @w6.a(name = "overScrollMode")
    public final void setOverScrollMode(com.reactnativepagerview.a aVar, String str) {
        k.f(aVar, "host");
        k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        View childAt = getViewPager(aVar).getChildAt(0);
        if (k.a(str, "never")) {
            childAt.setOverScrollMode(2);
        } else if (k.a(str, "always")) {
            childAt.setOverScrollMode(0);
        } else {
            childAt.setOverScrollMode(1);
        }
    }

    @w6.a(defaultFloat = 0.0f, name = "pageMargin")
    public final void setPageMargin(com.reactnativepagerview.a aVar, float f10) {
        k.f(aVar, "host");
        final ViewPager2 viewPager = getViewPager(aVar);
        final int c10 = (int) r.c(f10);
        viewPager.setPageTransformer(new ViewPager2.k() { // from class: com.reactnativepagerview.c
            @Override // androidx.viewpager2.widget.ViewPager2.k
            public final void a(View view, float f11) {
                PagerViewViewManager.i(c10, viewPager, view, f11);
            }
        });
    }

    @w6.a(defaultBoolean = BuildConfig.SHOULD_GZIP_HTTP_REQUEST, name = "scrollEnabled")
    public final void setScrollEnabled(com.reactnativepagerview.a aVar, boolean z10) {
        k.f(aVar, "host");
        getViewPager(aVar).setUserInputEnabled(z10);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(com.reactnativepagerview.a aVar, View view, int i10) {
        Integer initialIndex;
        k.f(aVar, "host");
        if (view == null) {
            return;
        }
        ViewPager2 viewPager = getViewPager(aVar);
        g gVar = (g) viewPager.getAdapter();
        if (gVar != null) {
            gVar.a(view, i10);
        }
        if (viewPager.getCurrentItem() == i10) {
            refreshViewChildrenLayout(viewPager);
        }
        if (aVar.getDidSetInitialIndex() || (initialIndex = aVar.getInitialIndex()) == null || initialIndex.intValue() != i10) {
            return;
        }
        aVar.setDidSetInitialIndex(true);
        setCurrentItem(viewPager, i10, false);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.reactnativepagerview.a createViewInstance(n0 n0Var) {
        k.f(n0Var, "reactContext");
        final com.reactnativepagerview.a aVar = new com.reactnativepagerview.a(n0Var);
        aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aVar.setSaveEnabled(false);
        final ViewPager2 viewPager2 = new ViewPager2(n0Var);
        viewPager2.setAdapter(new g());
        viewPager2.setSaveEnabled(false);
        NativeModule nativeModule = n0Var.getNativeModule(UIManagerModule.class);
        k.c(nativeModule);
        com.facebook.react.uimanager.events.d eventDispatcher = ((UIManagerModule) nativeModule).getEventDispatcher();
        k.e(eventDispatcher, "reactContext.getNativeMo…s.java)!!.eventDispatcher");
        this.eventDispatcher = eventDispatcher;
        viewPager2.post(new Runnable() { // from class: com.reactnativepagerview.e
            @Override // java.lang.Runnable
            public final void run() {
                PagerViewViewManager.k(ViewPager2.this, this, aVar);
            }
        });
        aVar.addView(viewPager2);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(com.reactnativepagerview.a aVar, int i10) {
        k.f(aVar, "parent");
        g gVar = (g) getViewPager(aVar).getAdapter();
        k.c(gVar);
        return gVar.b(i10);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(com.reactnativepagerview.a aVar) {
        k.f(aVar, "parent");
        RecyclerView.h adapter = getViewPager(aVar).getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getItemCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.reactnativepagerview.a aVar, int i10, ReadableArray readableArray) {
        k.f(aVar, "root");
        super.receiveCommand((PagerViewViewManager) aVar, i10, readableArray);
        ViewPager2 viewPager = getViewPager(aVar);
        f6.a.c(viewPager);
        f6.a.c(readableArray);
        RecyclerView.h adapter = viewPager.getAdapter();
        com.facebook.react.uimanager.events.d dVar = null;
        Integer valueOf = adapter == null ? null : Integer.valueOf(adapter.getItemCount());
        if (i10 != 1 && i10 != 2) {
            if (i10 == 3) {
                k.c(readableArray);
                viewPager.setUserInputEnabled(readableArray.getBoolean(0));
                return;
            }
            v vVar = v.f36113a;
            String format = String.format("Unsupported command %d received by %s.", Arrays.copyOf(new Object[]{Integer.valueOf(i10), PagerViewViewManager.class.getSimpleName()}, 2));
            k.e(format, "java.lang.String.format(format, *args)");
            throw new IllegalArgumentException(format);
        }
        k.c(readableArray);
        int i11 = readableArray.getInt(0);
        if (valueOf != null && valueOf.intValue() > 0 && i11 >= 0 && i11 < valueOf.intValue()) {
            setCurrentItem(viewPager, i11, i10 == 1);
            com.facebook.react.uimanager.events.d dVar2 = this.eventDispatcher;
            if (dVar2 == null) {
                k.s("eventDispatcher");
            } else {
                dVar = dVar2;
            }
            dVar.g(new md.c(aVar.getId(), i11));
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(com.reactnativepagerview.a aVar) {
        k.f(aVar, "parent");
        ViewPager2 viewPager = getViewPager(aVar);
        viewPager.setUserInputEnabled(false);
        g gVar = (g) viewPager.getAdapter();
        if (gVar == null) {
            return;
        }
        gVar.e();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(com.reactnativepagerview.a aVar, View view) {
        k.f(aVar, "parent");
        k.f(view, "view");
        ViewPager2 viewPager = getViewPager(aVar);
        g gVar = (g) viewPager.getAdapter();
        if (gVar != null) {
            gVar.f(view);
        }
        refreshViewChildrenLayout(viewPager);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(com.reactnativepagerview.a aVar, int i10) {
        k.f(aVar, "parent");
        ViewPager2 viewPager = getViewPager(aVar);
        g gVar = (g) viewPager.getAdapter();
        if (gVar != null) {
            gVar.g(i10);
        }
        refreshViewChildrenLayout(viewPager);
    }
}
