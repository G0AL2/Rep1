package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class w {

    /* compiled from: FragmentTransitionImpl.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f3268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f3269b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f3270c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f3271d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f3272e;

        a(w wVar, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3268a = i10;
            this.f3269b = arrayList;
            this.f3270c = arrayList2;
            this.f3271d = arrayList3;
            this.f3272e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f3268a; i10++) {
                androidx.core.view.z.J0((View) this.f3269b.get(i10), (String) this.f3270c.get(i10));
                androidx.core.view.z.J0((View) this.f3271d.get(i10), (String) this.f3272e.get(i10));
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f3274b;

        b(w wVar, ArrayList arrayList, Map map) {
            this.f3273a = arrayList;
            this.f3274b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3273a.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f3273a.get(i10);
                String L = androidx.core.view.z.L(view);
                if (L != null) {
                    androidx.core.view.z.J0(view, w.i(this.f3274b, L));
                }
            }
        }
    }

    /* compiled from: FragmentTransitionImpl.java */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3275a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f3276b;

        c(w wVar, ArrayList arrayList, Map map) {
            this.f3275a = arrayList;
            this.f3276b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3275a.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f3275a.get(i10);
                androidx.core.view.z.J0(view, (String) this.f3276b.get(androidx.core.view.z.L(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        if (androidx.core.view.z.L(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!h(list, childAt, size) && androidx.core.view.z.L(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (c0.a(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    f(arrayList, viewGroup.getChildAt(i10));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    public abstract Object g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String L = androidx.core.view.z.L(view);
            if (L != null) {
                map.put(L, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k(View view, Rect rect) {
        if (androidx.core.view.z.T(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(androidx.core.view.z.L(view));
            androidx.core.view.z.J0(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        androidx.core.view.v.a(viewGroup, new c(this, arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public void w(Fragment fragment, Object obj, e0.b bVar, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        androidx.core.view.v.a(view, new b(this, arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String L = androidx.core.view.z.L(view2);
            arrayList4.add(L);
            if (L != null) {
                androidx.core.view.z.J0(view2, null);
                String str = map.get(L);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i11))) {
                        androidx.core.view.z.J0(arrayList2.get(i11), L);
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        androidx.core.view.v.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList<View> arrayList);
}
