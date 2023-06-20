package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: NativeViewHierarchyManager.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: l  reason: collision with root package name */
    private static final String f15886l = "n";

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<View> f15887a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<ViewManager> f15888b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f15889c;

    /* renamed from: d  reason: collision with root package name */
    private final c1 f15890d;

    /* renamed from: e  reason: collision with root package name */
    private final v6.a f15891e;

    /* renamed from: f  reason: collision with root package name */
    private final RootViewManager f15892f;

    /* renamed from: g  reason: collision with root package name */
    private final z6.e f15893g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f15894h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15895i;

    /* renamed from: j  reason: collision with root package name */
    private PopupMenu f15896j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap<Integer, Set<Integer>> f15897k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeViewHierarchyManager.java */
    /* loaded from: classes.dex */
    public class a implements z6.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroupManager f15898a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f15899b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f15900c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Set f15901d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f15902e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i10) {
            this.f15898a = viewGroupManager;
            this.f15899b = viewGroup;
            this.f15900c = view;
            this.f15901d = set;
            this.f15902e = i10;
        }

        @Override // z6.f
        public void a() {
            UiThreadUtil.assertOnUiThread();
            this.f15898a.removeView(this.f15899b, this.f15900c);
            n.this.n(this.f15900c);
            this.f15901d.remove(Integer.valueOf(this.f15900c.getId()));
            if (this.f15901d.isEmpty()) {
                n.this.f15897k.remove(Integer.valueOf(this.f15902e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeViewHierarchyManager.java */
    /* loaded from: classes.dex */
    public static class b implements PopupMenu.OnMenuItemClickListener, PopupMenu.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final Callback f15904a;

        /* renamed from: b  reason: collision with root package name */
        boolean f15905b;

        /* synthetic */ b(Callback callback, a aVar) {
            this(callback);
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
            if (this.f15905b) {
                return;
            }
            this.f15904a.invoke("dismissed");
            this.f15905b = true;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.f15905b) {
                return false;
            }
            this.f15904a.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
            this.f15905b = true;
            return true;
        }

        private b(Callback callback) {
            this.f15905b = false;
            this.f15904a = callback;
        }
    }

    public n(c1 c1Var) {
        this(c1Var, new RootViewManager());
    }

    private void D(View view, int i10, int i11, int i12, int i13) {
        if (this.f15895i && this.f15893g.h(view)) {
            this.f15893g.b(view, i10, i11, i12, i13);
        } else {
            view.layout(i10, i11, i12 + i10, i13 + i11);
        }
    }

    private boolean d(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void g(View view, int[] iArr) {
        this.f15894h.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        s(view, this.f15894h);
        iArr[0] = Math.round(this.f15894h.left);
        iArr[1] = Math.round(this.f15894h.top);
        RectF rectF = this.f15894h;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.f15894h;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String i(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, y0[] y0VarArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        if (viewGroup != null) {
            sb2.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  children(");
            sb3.append(viewGroupManager.getChildCount(viewGroup));
            sb3.append("): [\n");
            sb2.append(sb3.toString());
            for (int i10 = 0; viewGroupManager.getChildAt(viewGroup, i10) != null; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (viewGroupManager.getChildAt(viewGroup, i12) != null && i11 < 16) {
                        sb2.append(viewGroupManager.getChildAt(viewGroup, i12).getId() + ",");
                        i11++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr != null) {
            sb2.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i13 = 0; i13 < iArr.length; i13 += 16) {
                int i14 = 0;
                while (true) {
                    int i15 = i13 + i14;
                    if (i15 < iArr.length && i14 < 16) {
                        sb2.append(iArr[i15] + ",");
                        i14++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (y0VarArr != null) {
            sb2.append("  viewsToAdd(" + y0VarArr.length + "): [\n");
            for (int i16 = 0; i16 < y0VarArr.length; i16 += 16) {
                int i17 = 0;
                while (true) {
                    int i18 = i16 + i17;
                    if (i18 < y0VarArr.length && i17 < 16) {
                        sb2.append("[" + y0VarArr[i18].f16079b + "," + y0VarArr[i18].f16078a + "],");
                        i17++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr2 != null) {
            sb2.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i19 = 0; i19 < iArr2.length; i19 += 16) {
                int i20 = 0;
                while (true) {
                    int i21 = i19 + i20;
                    if (i21 < iArr2.length && i20 < 16) {
                        sb2.append(iArr2[i21] + ",");
                        i20++;
                    }
                }
                sb2.append("\n");
            }
            sb2.append(" ]\n");
        }
        return sb2.toString();
    }

    private Set<Integer> p(int i10) {
        if (this.f15897k == null) {
            this.f15897k = new HashMap<>();
        }
        if (!this.f15897k.containsKey(Integer.valueOf(i10))) {
            this.f15897k.put(Integer.valueOf(i10), new HashSet());
        }
        return this.f15897k.get(Integer.valueOf(i10));
    }

    private n0 q(int i10) {
        View view = this.f15887a.get(i10);
        if (view != null) {
            return (n0) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
    }

    private void s(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public void A(boolean z10) {
        this.f15895i = z10;
    }

    public synchronized void B(int i10, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f15887a.get(i10);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i10);
            return;
        }
        PopupMenu popupMenu = new PopupMenu(q(i10), view);
        this.f15896j = popupMenu;
        Menu menu = popupMenu.getMenu();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            menu.add(0, 0, i11, readableArray.getString(i11));
        }
        b bVar = new b(callback, null);
        this.f15896j.setOnMenuItemClickListener(bVar);
        this.f15896j.setOnDismissListener(bVar);
        this.f15896j.show();
    }

    public synchronized void C(int i10, int i11, int i12, int i13, int i14, int i15) {
        UiThreadUtil.assertOnUiThread();
        com.facebook.systrace.b.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i10).a("tag", i11).c();
        View w10 = w(i11);
        w10.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
        ViewParent parent = w10.getParent();
        if (parent instanceof i0) {
            parent.requestLayout();
        }
        if (!this.f15889c.get(i10)) {
            ViewManager viewManager = this.f15888b.get(i10);
            if (viewManager instanceof g) {
                g gVar = (g) viewManager;
                if (gVar != null && !gVar.needsCustomLayoutForChildren()) {
                    D(w10, i12, i13, i14, i15);
                }
            } else {
                throw new h("Trying to use view with tag " + i10 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
            }
        } else {
            D(w10, i12, i13, i14, i15);
        }
        com.facebook.systrace.a.g(0L);
    }

    public synchronized void E(int i10, f0 f0Var) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager x10 = x(i10);
            View w10 = w(i10);
            if (f0Var != null) {
                x10.updateProperties(w10, f0Var);
            }
        } catch (h e10) {
            String str = f15886l;
            z3.a.k(str, "Unable to update properties for view tag " + i10, e10);
        }
    }

    public synchronized void F(int i10, Object obj) {
        UiThreadUtil.assertOnUiThread();
        x(i10).updateExtraData(w(i10), obj);
    }

    public synchronized void b(int i10, View view) {
        c(i10, view);
    }

    protected final synchronized void c(int i10, View view) {
        if (view.getId() != -1) {
            String str = f15886l;
            z3.a.j(str, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        this.f15887a.put(i10, view);
        this.f15888b.put(i10, this.f15892f);
        this.f15889c.put(i10, true);
        view.setId(i10);
    }

    public void e() {
        this.f15891e.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f15893g.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(ReadableMap readableMap, Callback callback) {
        this.f15893g.e(readableMap, callback);
    }

    public synchronized void j(n0 n0Var, int i10, String str, f0 f0Var) {
        UiThreadUtil.assertOnUiThread();
        com.facebook.systrace.b.a(0L, "NativeViewHierarchyManager_createView").a("tag", i10).b("className", str).c();
        ViewManager a10 = this.f15890d.a(str);
        this.f15887a.put(i10, a10.createView(i10, n0Var, f0Var, null, this.f15891e));
        this.f15888b.put(i10, a10);
        com.facebook.systrace.a.g(0L);
    }

    public void k() {
        PopupMenu popupMenu = this.f15896j;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }

    @Deprecated
    public synchronized void l(int i10, int i11, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f15887a.get(i10);
        if (view != null) {
            x(i10).receiveCommand((ViewManager) view, i11, readableArray);
        } else {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + i11);
        }
    }

    public synchronized void m(int i10, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f15887a.get(i10);
        if (view != null) {
            ViewManager x10 = x(i10);
            a1 delegate = x10.getDelegate();
            if (delegate != null) {
                delegate.b(view, str, readableArray);
            } else {
                x10.receiveCommand((ViewManager) view, str, readableArray);
            }
        } else {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + str);
        }
    }

    protected synchronized void n(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view == null) {
            return;
        }
        if (this.f15888b.get(view.getId()) == null) {
            return;
        }
        if (!this.f15889c.get(view.getId())) {
            x(view.getId()).onDropViewInstance(view);
        }
        ViewManager viewManager = this.f15888b.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (childAt == null) {
                    z3.a.j(f15886l, "Unable to drop null child view");
                } else if (this.f15887a.get(childAt.getId()) != null) {
                    n(childAt);
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.f15887a.remove(view.getId());
        this.f15888b.remove(view.getId());
    }

    public synchronized int o(int i10, float f10, float f11) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.f15887a.get(i10);
        if (view != null) {
        } else {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
        }
        return o0.c(f10, f11, (ViewGroup) view);
    }

    public synchronized void r(int i10, int[] iArr, y0[] y0VarArr, int[] iArr2) {
        int i11;
        int[] iArr3 = iArr;
        synchronized (this) {
            UiThreadUtil.assertOnUiThread();
            Set<Integer> p10 = p(i10);
            ViewGroup viewGroup = (ViewGroup) this.f15887a.get(i10);
            ViewGroupManager viewGroupManager = (ViewGroupManager) x(i10);
            if (viewGroup != null) {
                int childCount = viewGroupManager.getChildCount(viewGroup);
                if (iArr3 != null) {
                    int length = iArr3.length - 1;
                    while (length >= 0) {
                        int i12 = iArr3[length];
                        if (i12 >= 0) {
                            if (viewGroupManager.getChildAt(viewGroup, i12) == null) {
                                if (this.f15889c.get(i10) && viewGroupManager.getChildCount(viewGroup) == 0) {
                                    return;
                                }
                                throw new h("Trying to remove a view index above child count " + i12 + " view tag: " + i10 + "\n detail: " + i(viewGroup, viewGroupManager, iArr3, y0VarArr, iArr2));
                            } else if (i12 < childCount) {
                                View childAt = viewGroupManager.getChildAt(viewGroup, i12);
                                if (!this.f15895i || !this.f15893g.h(childAt) || !d(iArr2, childAt.getId())) {
                                    viewGroupManager.removeViewAt(viewGroup, i12);
                                }
                                length--;
                                childCount = i12;
                            } else {
                                throw new h("Trying to remove an out of order view index:" + i12 + " view tag: " + i10 + "\n detail: " + i(viewGroup, viewGroupManager, iArr3, y0VarArr, iArr2));
                            }
                        } else {
                            throw new h("Trying to remove a negative view index:" + i12 + " view tag: " + i10 + "\n detail: " + i(viewGroup, viewGroupManager, iArr3, y0VarArr, iArr2));
                        }
                    }
                }
                if (iArr2 != null) {
                    int i13 = 0;
                    while (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        View view = this.f15887a.get(i14);
                        if (view != null) {
                            if (this.f15895i && this.f15893g.h(view)) {
                                p10.add(Integer.valueOf(i14));
                                i11 = i13;
                                this.f15893g.c(view, new a(viewGroupManager, viewGroup, view, p10, i10));
                            } else {
                                i11 = i13;
                                n(view);
                            }
                            i13 = i11 + 1;
                            iArr3 = iArr;
                        } else {
                            throw new h("Trying to destroy unknown view tag: " + i14 + "\n detail: " + i(viewGroup, viewGroupManager, iArr, y0VarArr, iArr2));
                        }
                    }
                }
                int[] iArr4 = iArr3;
                if (y0VarArr != null) {
                    for (y0 y0Var : y0VarArr) {
                        View view2 = this.f15887a.get(y0Var.f16078a);
                        if (view2 != null) {
                            int i15 = y0Var.f16079b;
                            if (!p10.isEmpty()) {
                                i15 = 0;
                                int i16 = 0;
                                while (i15 < viewGroup.getChildCount() && i16 != y0Var.f16079b) {
                                    if (!p10.contains(Integer.valueOf(viewGroup.getChildAt(i15).getId()))) {
                                        i16++;
                                    }
                                    i15++;
                                }
                            }
                            viewGroupManager.addView(viewGroup, view2, i15);
                        } else {
                            throw new h("Trying to add unknown view tag: " + y0Var.f16078a + "\n detail: " + i(viewGroup, viewGroupManager, iArr4, y0VarArr, iArr2));
                        }
                    }
                }
                if (p10.isEmpty()) {
                    this.f15897k.remove(Integer.valueOf(i10));
                }
                return;
            }
            throw new h("Trying to manageChildren view with tag " + i10 + " which doesn't exist\n detail: " + i(viewGroup, viewGroupManager, iArr3, y0VarArr, iArr2));
        }
    }

    public synchronized void t(int i10, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f15887a.get(i10);
        if (view != null) {
            View view2 = (View) j0.a(view);
            if (view2 != null) {
                g(view2, iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                g(view, iArr);
                iArr[0] = iArr[0] - i11;
                iArr[1] = iArr[1] - i12;
            } else {
                throw new p("Native view " + i10 + " is no longer on screen");
            }
        } else {
            throw new p("No native view for " + i10 + " currently exists");
        }
    }

    public synchronized void u(int i10, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f15887a.get(i10);
        if (view != null) {
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } else {
            throw new p("No native view for " + i10 + " currently exists");
        }
    }

    public synchronized void v(int i10) {
        UiThreadUtil.assertOnUiThread();
        if (!this.f15889c.get(i10)) {
            SoftAssertions.assertUnreachable("View with tag " + i10 + " is not registered as a root view");
        }
        n(this.f15887a.get(i10));
        this.f15889c.delete(i10);
    }

    public final synchronized View w(int i10) {
        View view;
        view = this.f15887a.get(i10);
        if (view == null) {
            throw new h("Trying to resolve view with tag " + i10 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager x(int i10) {
        ViewManager viewManager;
        viewManager = this.f15888b.get(i10);
        if (viewManager == null) {
            throw new h("ViewManager for tag " + i10 + " could not be found.\n");
        }
        return viewManager;
    }

    public void y(int i10, int i11) {
        View view = this.f15887a.get(i10);
        if (view != null) {
            view.sendAccessibilityEvent(i11);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
    }

    public synchronized void z(int i10, int i11, boolean z10) {
        if (!z10) {
            this.f15891e.d(i11, null);
            return;
        }
        View view = this.f15887a.get(i10);
        if (i11 != i10 && (view instanceof ViewParent)) {
            this.f15891e.d(i11, (ViewParent) view);
            return;
        }
        if (this.f15889c.get(i10)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i10 + " that is a root view");
        }
        this.f15891e.d(i11, view.getParent());
    }

    public n(c1 c1Var, RootViewManager rootViewManager) {
        this.f15891e = new v6.a();
        this.f15893g = new z6.e();
        this.f15894h = new RectF();
        this.f15890d = c1Var;
        this.f15887a = new SparseArray<>();
        this.f15888b = new SparseArray<>();
        this.f15889c = new SparseBooleanArray();
        this.f15892f = rootViewManager;
    }
}
