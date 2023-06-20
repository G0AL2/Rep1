package l6;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.c1;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.z;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import l6.c;

/* compiled from: SurfaceMountingManager.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: l  reason: collision with root package name */
    public static final String f33719l = "d";

    /* renamed from: c  reason: collision with root package name */
    private n0 f33722c;

    /* renamed from: f  reason: collision with root package name */
    private v6.a f33725f;

    /* renamed from: g  reason: collision with root package name */
    private c1 f33726g;

    /* renamed from: h  reason: collision with root package name */
    private RootViewManager f33727h;

    /* renamed from: i  reason: collision with root package name */
    private c.b f33728i;

    /* renamed from: j  reason: collision with root package name */
    private Set<Integer> f33729j;

    /* renamed from: k  reason: collision with root package name */
    private final int f33730k;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f33720a = false;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f33721b = false;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<Integer, c> f33723d = new ConcurrentHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentLinkedQueue<m6.d> f33724e = new ConcurrentLinkedQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SurfaceMountingManager.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f33731a;

        a(View view) {
            this.f33731a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.C()) {
                return;
            }
            if (this.f33731a.getId() == d.this.f33730k) {
                String str = d.f33719l;
                ReactSoftExceptionLogger.logSoftException(str, new h("Race condition in addRootView detected. Trying to set an id of [" + d.this.f33730k + "] on the RootView, but that id has already been set. "));
            } else if (this.f33731a.getId() != -1) {
                z3.a.l(d.f33719l, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(this.f33731a.getId()), Integer.valueOf(d.this.f33730k));
                throw new h("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.f33731a.setId(d.this.f33730k);
            View view = this.f33731a;
            if (view instanceof b0) {
                ((b0) view).setRootViewTag(d.this.f33730k);
            }
            d.this.f33721b = true;
            d.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SurfaceMountingManager.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (c cVar : d.this.f33723d.values()) {
                d.this.E(cVar);
            }
            d dVar = d.this;
            dVar.f33729j = dVar.f33723d.keySet();
            d.this.f33723d = null;
            d.this.f33725f = null;
            d.this.f33727h = null;
            d.this.f33728i = null;
            d.this.f33724e.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SurfaceMountingManager.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final View f33734a;

        /* renamed from: b  reason: collision with root package name */
        final int f33735b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f33736c;

        /* renamed from: d  reason: collision with root package name */
        final ViewManager f33737d;

        /* renamed from: e  reason: collision with root package name */
        public f0 f33738e;

        /* renamed from: f  reason: collision with root package name */
        public ReadableMap f33739f;

        /* renamed from: g  reason: collision with root package name */
        public m0 f33740g;

        /* renamed from: h  reason: collision with root package name */
        public EventEmitterWrapper f33741h;

        /* synthetic */ c(int i10, View view, ViewManager viewManager, a aVar) {
            this(i10, view, viewManager);
        }

        public String toString() {
            boolean z10 = this.f33737d == null;
            return "ViewState [" + this.f33735b + "] - isRoot: " + this.f33736c + " - props: " + this.f33738e + " - localData: " + this.f33739f + " - viewManager: " + this.f33737d + " - isLayoutOnly: " + z10;
        }

        /* synthetic */ c(int i10, View view, ViewManager viewManager, boolean z10, a aVar) {
            this(i10, view, viewManager, z10);
        }

        private c(int i10, View view, ViewManager viewManager) {
            this(i10, view, viewManager, false);
        }

        private c(int i10, View view, ViewManager viewManager, boolean z10) {
            this.f33738e = null;
            this.f33739f = null;
            this.f33740g = null;
            this.f33741h = null;
            this.f33735b = i10;
            this.f33734a = view;
            this.f33736c = z10;
            this.f33737d = viewManager;
        }
    }

    public d(int i10, v6.a aVar, c1 c1Var, RootViewManager rootViewManager, c.b bVar, n0 n0Var) {
        this.f33730k = i10;
        this.f33725f = aVar;
        this.f33726g = c1Var;
        this.f33727h = rootViewManager;
        this.f33728i = bVar;
        this.f33722c = n0Var;
    }

    private c A(int i10) {
        c cVar = this.f33723d.get(Integer.valueOf(i10));
        if (cVar != null) {
            return cVar;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i10);
    }

    private static void D(ViewGroup viewGroup, boolean z10) {
        int id2 = viewGroup.getId();
        String str = f33719l;
        z3.a.j(str, "  <ViewGroup tag=" + id2 + " class=" + viewGroup.getClass().toString() + ">");
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            String str2 = f33719l;
            z3.a.j(str2, "     <View idx=" + i10 + " tag=" + viewGroup.getChildAt(i10).getId() + " class=" + viewGroup.getChildAt(i10).getClass().toString() + ">");
        }
        String str3 = f33719l;
        z3.a.j(str3, "  </ViewGroup tag=" + id2 + ">");
        if (z10) {
            z3.a.j(str3, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int id3 = viewGroup2 == null ? -1 : viewGroup2.getId();
                String str4 = f33719l;
                z3.a.j(str4, "<ViewParent tag=" + id3 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(c cVar) {
        m0 m0Var = cVar.f33740g;
        if (m0Var != null) {
            m0Var.d();
            cVar.f33740g = null;
        }
        EventEmitterWrapper eventEmitterWrapper = cVar.f33741h;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.a();
            cVar.f33741h = null;
        }
        ViewManager viewManager = cVar.f33737d;
        if (cVar.f33736c || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(cVar.f33734a);
    }

    private void l(View view) {
        if (C()) {
            return;
        }
        this.f33723d.put(Integer.valueOf(this.f33730k), new c(this.f33730k, view, this.f33727h, true, null));
        a aVar = new a(view);
        if (UiThreadUtil.isOnUiThread()) {
            aVar.run();
        } else {
            UiThreadUtil.runOnUiThread(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.f33728i.a(this.f33724e);
    }

    private c v(int i10) {
        ConcurrentHashMap<Integer, c> concurrentHashMap = this.f33723d;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i10));
    }

    private static ViewGroupManager<ViewGroup> z(c cVar) {
        ViewManager viewManager = cVar.f33737d;
        if (viewManager != null) {
            return (ViewGroupManager) viewManager;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + cVar);
    }

    public boolean B() {
        return this.f33721b;
    }

    public boolean C() {
        return this.f33720a;
    }

    public void F(String str, int i10, ReadableMap readableMap, m0 m0Var, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (!C() && v(i10) == null) {
            p(str, i10, readableMap, m0Var, eventEmitterWrapper, z10);
        }
    }

    public void G() {
        z3.a.l(f33719l, "Views created for surface {%d}:", Integer.valueOf(w()));
        for (c cVar : this.f33723d.values()) {
            ViewManager viewManager = cVar.f33737d;
            Integer num = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = cVar.f33734a;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                num = Integer.valueOf(view2.getId());
            }
            z3.a.l(f33719l, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(cVar.f33735b), num, Boolean.valueOf(cVar.f33736c));
        }
    }

    @Deprecated
    public void H(int i10, int i11, ReadableArray readableArray) {
        if (C()) {
            return;
        }
        c v10 = v(i10);
        if (v10 != null) {
            ViewManager viewManager = v10.f33737d;
            if (viewManager != null) {
                View view = v10.f33734a;
                if (view != null) {
                    viewManager.receiveCommand((ViewManager) view, i11, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
            }
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i10);
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i10 + "] for commandId: " + i11);
    }

    public void I(int i10, String str, ReadableArray readableArray) {
        if (C()) {
            return;
        }
        c v10 = v(i10);
        if (v10 != null) {
            ViewManager viewManager = v10.f33737d;
            if (viewManager != null) {
                View view = v10.f33734a;
                if (view != null) {
                    viewManager.receiveCommand((ViewManager) view, str, readableArray);
                    return;
                }
                throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
            }
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i10 + " for commandId: " + str);
    }

    public void J(int i10, int i11, int i12) {
        if (C()) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        c v10 = v(i11);
        if (v10 == null) {
            ReactSoftExceptionLogger.logSoftException(l6.c.f33710i, new IllegalStateException("Unable to find viewState for tag: [" + i11 + "] for removeViewAt"));
            return;
        }
        View view = v10.f33734a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                ViewGroupManager<ViewGroup> z10 = z(v10);
                View childAt = z10.getChildAt(viewGroup, i12);
                int id2 = childAt != null ? childAt.getId() : -1;
                if (id2 != i10) {
                    int childCount = viewGroup.getChildCount();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= childCount) {
                            i13 = -1;
                            break;
                        } else if (viewGroup.getChildAt(i13).getId() == i10) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    if (i13 == -1) {
                        z3.a.j(f33719l, "removeViewAt: [" + i10 + "] -> [" + i11 + "] @" + i12 + ": view already removed from parent! Children in parent: " + childCount);
                        return;
                    }
                    D(viewGroup, true);
                    ReactSoftExceptionLogger.logSoftException(f33719l, new IllegalStateException("Tried to remove view [" + i10 + "] of parent [" + i11 + "] at index " + i12 + ", but got view tag " + id2 + " - actual index of view: " + i13));
                    i12 = i13;
                }
                try {
                    z10.removeViewAt(viewGroup, i12);
                    return;
                } catch (RuntimeException e10) {
                    int childCount2 = z10.getChildCount(viewGroup);
                    D(viewGroup, true);
                    throw new IllegalStateException("Cannot remove child at index " + i12 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e10);
                }
            }
            throw new IllegalStateException("Unable to find view for tag [" + i11 + "]");
        }
        String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i11 + " - Tag: " + i10 + " - Index: " + i12;
        z3.a.j(f33719l, str);
        throw new IllegalStateException(str);
    }

    public void K(int i10, int i11) {
        if (C()) {
            return;
        }
        c A = A(i10);
        if (A.f33737d != null) {
            View view = A.f33734a;
            if (view != null) {
                view.sendAccessibilityEvent(i11);
                return;
            }
            throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i10);
        }
        throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i10);
    }

    public synchronized void L(int i10, int i11, boolean z10) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        if (!z10) {
            this.f33725f.d(i11, null);
            return;
        }
        c A = A(i10);
        View view = A.f33734a;
        if (i11 != i10 && (view instanceof ViewParent)) {
            this.f33725f.d(i11, (ViewParent) view);
        } else if (view == null) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i10 + "].");
        } else {
            if (A.f33736c) {
                SoftAssertions.assertUnreachable("Cannot block native responder on [" + i10 + "] that is a root view");
            }
            this.f33725f.d(i11, view.getParent());
        }
    }

    public void M() {
        EventEmitterWrapper eventEmitterWrapper;
        if (C()) {
            return;
        }
        this.f33720a = true;
        for (c cVar : this.f33723d.values()) {
            m0 m0Var = cVar.f33740g;
            if (m0Var != null) {
                m0Var.d();
                cVar.f33740g = null;
            }
            if (ReactFeatureFlags.enableAggressiveEventEmitterCleanup && (eventEmitterWrapper = cVar.f33741h) != null) {
                eventEmitterWrapper.a();
                cVar.f33741h = null;
            }
        }
        b bVar = new b();
        if (UiThreadUtil.isOnUiThread()) {
            bVar.run();
        } else {
            UiThreadUtil.runOnUiThread(bVar);
        }
    }

    public void N(int i10, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c cVar = this.f33723d.get(Integer.valueOf(i10));
        if (cVar == null) {
            cVar = new c(i10, (View) null, (ViewManager) null, (a) null);
            this.f33723d.put(Integer.valueOf(i10), cVar);
        }
        EventEmitterWrapper eventEmitterWrapper2 = cVar.f33741h;
        cVar.f33741h = eventEmitterWrapper;
        if (eventEmitterWrapper2 == eventEmitterWrapper || eventEmitterWrapper2 == null) {
            return;
        }
        eventEmitterWrapper2.a();
    }

    public void O(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (C()) {
            return;
        }
        c A = A(i10);
        if (A.f33736c) {
            return;
        }
        View view = A.f33734a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
            ViewParent parent = view.getParent();
            if (parent instanceof i0) {
                parent.requestLayout();
            }
            view.layout(i11, i12, i13 + i11, i14 + i12);
            int i16 = i15 == 0 ? 4 : 0;
            if (view.getVisibility() != i16) {
                view.setVisibility(i16);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to find View for tag: " + i10);
    }

    public void P(int i10, int i11, int i12, int i13, int i14) {
        if (C()) {
            return;
        }
        c A = A(i10);
        if (A.f33736c) {
            return;
        }
        View view = A.f33734a;
        if (view != null) {
            if (view instanceof z) {
                ((z) view).f(i11, i12, i13, i14);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to find View for tag: " + i10);
    }

    public void Q(int i10, int i11, int i12, int i13, int i14) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c A = A(i10);
        if (A.f33736c) {
            return;
        }
        View view = A.f33734a;
        if (view != null) {
            ViewManager viewManager = A.f33737d;
            if (viewManager != null) {
                viewManager.setPadding(view, i11, i12, i13, i14);
                return;
            }
            throw new IllegalStateException("Unable to find ViewManager for view: " + A);
        }
        throw new IllegalStateException("Unable to find View for tag: " + i10);
    }

    public void R(int i10, ReadableMap readableMap) {
        if (C()) {
            return;
        }
        c A = A(i10);
        A.f33738e = new f0(readableMap);
        View view = A.f33734a;
        if (view != null) {
            ((ViewManager) f6.a.c(A.f33737d)).updateProperties(view, A.f33738e);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag [" + i10 + "]");
    }

    public void S(int i10, m0 m0Var) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c A = A(i10);
        m0 m0Var2 = A.f33740g;
        A.f33740g = m0Var;
        ViewManager viewManager = A.f33737d;
        if (viewManager != null) {
            Object updateState = viewManager.updateState(A.f33734a, A.f33738e, m0Var);
            if (updateState != null) {
                viewManager.updateExtraData(A.f33734a, updateState);
            }
            if (m0Var2 != null) {
                m0Var2.d();
                return;
            }
            return;
        }
        throw new IllegalStateException("Unable to find ViewManager for tag: " + i10);
    }

    public void m(int i10, int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c A = A(i10);
        View view = A.f33734a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            c A2 = A(i11);
            View view2 = A2.f33734a;
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                if (parent != null) {
                    int id2 = parent instanceof ViewGroup ? ((ViewGroup) parent).getId() : -1;
                    ReactSoftExceptionLogger.logSoftException(f33719l, new IllegalStateException("addViewAt: cannot insert view [" + i11 + "] into parent [" + i10 + "]: View already has a parent: [" + id2 + "] " + parent.getClass().getSimpleName()));
                }
                try {
                    z(A).addView(viewGroup, view2, i12);
                    return;
                } catch (IllegalStateException e10) {
                    throw new IllegalStateException("addViewAt: failed to insert view [" + i11 + "] into parent [" + i10 + "] at index " + i12, e10);
                }
            }
            throw new IllegalStateException("Unable to find view for viewState " + A2 + " and tag " + i11);
        }
        String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i10 + " - Tag: " + i11 + " - Index: " + i12;
        z3.a.j(f33719l, str);
        throw new IllegalStateException(str);
    }

    public void n(View view, n0 n0Var) {
        this.f33722c = n0Var;
        l(view);
    }

    public void o(String str, int i10, ReadableMap readableMap, m0 m0Var, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        if (!C() && v(i10) == null) {
            p(str, i10, readableMap, m0Var, eventEmitterWrapper, z10);
        }
    }

    public void p(String str, int i10, ReadableMap readableMap, m0 m0Var, EventEmitterWrapper eventEmitterWrapper, boolean z10) {
        ViewManager viewManager;
        View view;
        f0 f0Var = readableMap != null ? new f0(readableMap) : null;
        if (z10) {
            viewManager = this.f33726g.a(str);
            view = viewManager.createView(i10, this.f33722c, f0Var, m0Var, this.f33725f);
        } else {
            viewManager = null;
            view = null;
        }
        c cVar = new c(i10, view, viewManager, (a) null);
        cVar.f33738e = f0Var;
        cVar.f33740g = m0Var;
        cVar.f33741h = eventEmitterWrapper;
        this.f33723d.put(Integer.valueOf(i10), cVar);
    }

    public void q(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (C()) {
            return;
        }
        c v10 = v(i10);
        if (v10 == null) {
            String str = l6.c.f33710i;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Unable to find viewState for tag: " + i10 + " for deleteView"));
            return;
        }
        this.f33723d.remove(Integer.valueOf(i10));
        E(v10);
    }

    public void r(m6.d dVar) {
        this.f33724e.add(dVar);
    }

    public n0 t() {
        return this.f33722c;
    }

    public EventEmitterWrapper u(int i10) {
        c v10 = v(i10);
        if (v10 == null) {
            return null;
        }
        return v10.f33741h;
    }

    public int w() {
        return this.f33730k;
    }

    public View x(int i10) {
        c v10 = v(i10);
        View view = v10 == null ? null : v10.f33734a;
        if (view != null) {
            return view;
        }
        throw new h("Trying to resolve view with tag " + i10 + " which doesn't exist");
    }

    public boolean y(int i10) {
        Set<Integer> set = this.f33729j;
        if (set == null || !set.contains(Integer.valueOf(i10))) {
            ConcurrentHashMap<Integer, c> concurrentHashMap = this.f33723d;
            if (concurrentHashMap == null) {
                return false;
            }
            return concurrentHashMap.containsKey(Integer.valueOf(i10));
        }
        return true;
    }
}
