package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f3213a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    static final w f3214b;

    /* renamed from: c  reason: collision with root package name */
    static final w f3215c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f3216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3217b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e0.b f3218c;

        a(g gVar, Fragment fragment, e0.b bVar) {
            this.f3216a = gVar;
            this.f3217b = fragment;
            this.f3218c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3216a.a(this.f3217b, this.f3218c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3219a;

        b(ArrayList arrayList) {
            this.f3219a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            u.A(this.f3219a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f3220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3221b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e0.b f3222c;

        c(g gVar, Fragment fragment, e0.b bVar) {
            this.f3220a = gVar;
            this.f3221b = fragment;
            this.f3222c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3220a.a(this.f3221b, this.f3222c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f3223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f3224b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3225c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Fragment f3226d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f3227e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f3228f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ArrayList f3229g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Object f3230h;

        d(Object obj, w wVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3223a = obj;
            this.f3224b = wVar;
            this.f3225c = view;
            this.f3226d = fragment;
            this.f3227e = arrayList;
            this.f3228f = arrayList2;
            this.f3229g = arrayList3;
            this.f3230h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f3223a;
            if (obj != null) {
                this.f3224b.p(obj, this.f3225c);
                this.f3228f.addAll(u.k(this.f3224b, this.f3223a, this.f3226d, this.f3227e, this.f3225c));
            }
            if (this.f3229g != null) {
                if (this.f3230h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f3225c);
                    this.f3224b.q(this.f3230h, this.f3229g, arrayList);
                }
                this.f3229g.clear();
                this.f3229g.add(this.f3225c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f3231a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f3232b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3233c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3234d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f3235e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w f3236f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Rect f3237g;

        e(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a aVar, View view, w wVar, Rect rect) {
            this.f3231a = fragment;
            this.f3232b = fragment2;
            this.f3233c = z10;
            this.f3234d = aVar;
            this.f3235e = view;
            this.f3236f = wVar;
            this.f3237g = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            u.f(this.f3231a, this.f3232b, this.f3233c, this.f3234d, false);
            View view = this.f3235e;
            if (view != null) {
                this.f3236f.k(view, this.f3237g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f3238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f3240c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h f3241d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f3242e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f3243f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Fragment f3244g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Fragment f3245h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f3246i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ ArrayList f3247j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Object f3248k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ Rect f3249l;

        f(w wVar, androidx.collection.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3238a = wVar;
            this.f3239b = aVar;
            this.f3240c = obj;
            this.f3241d = hVar;
            this.f3242e = arrayList;
            this.f3243f = view;
            this.f3244g = fragment;
            this.f3245h = fragment2;
            this.f3246i = z10;
            this.f3247j = arrayList2;
            this.f3248k = obj2;
            this.f3249l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.collection.a<String, View> h10 = u.h(this.f3238a, this.f3239b, this.f3240c, this.f3241d);
            if (h10 != null) {
                this.f3242e.addAll(h10.values());
                this.f3242e.add(this.f3243f);
            }
            u.f(this.f3244g, this.f3245h, this.f3246i, h10, false);
            Object obj = this.f3240c;
            if (obj != null) {
                this.f3238a.A(obj, this.f3247j, this.f3242e);
                View s10 = u.s(h10, this.f3241d, this.f3248k, this.f3246i);
                if (s10 != null) {
                    this.f3238a.k(s10, this.f3249l);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(Fragment fragment, e0.b bVar);

        void b(Fragment fragment, e0.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f3250a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3251b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.fragment.app.a f3252c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f3253d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3254e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.fragment.app.a f3255f;

        h() {
        }
    }

    static {
        f3214b = Build.VERSION.SDK_INT >= 21 ? new v() : null;
        f3215c = w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(Context context, androidx.fragment.app.f fVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                e(aVar, sparseArray, z10);
            } else {
                c(aVar, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                androidx.collection.a<String, String> d10 = d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (fVar.d() && (viewGroup = (ViewGroup) fVar.c(keyAt)) != null) {
                    if (z10) {
                        o(viewGroup, hVar, view, d10, gVar);
                    } else {
                        n(viewGroup, hVar, view, d10, gVar);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, androidx.collection.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View n10 = aVar.n(size);
            if (collection.contains(androidx.core.view.z.L(n10))) {
                arrayList.add(n10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
        if (r0.mAdded != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008a, code lost:
        if (r0.mHidden == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.t.a r9, android.util.SparseArray<androidx.fragment.app.u.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.u.b(androidx.fragment.app.a, androidx.fragment.app.t$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        int size = aVar.f3189a.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, aVar.f3189a.get(i10), sparseArray, false, z10);
        }
    }

    private static androidx.collection.a<String, String> d(int i10, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        androidx.collection.a<String, String> aVar = new androidx.collection.a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i13);
            if (aVar2.z(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3201m;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f3201m;
                        arrayList4 = aVar2.f3202n;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f3201m;
                        arrayList3 = aVar2.f3202n;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        if (aVar.f3083q.o0().d()) {
            for (int size = aVar.f3189a.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f3189a.get(size), sparseArray, true, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private static boolean g(w wVar, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!wVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static androidx.collection.a<String, View> h(w wVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3250a;
        View view = fragment.getView();
        if (!aVar.isEmpty() && obj != null && view != null) {
            androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
            wVar.j(aVar2, view);
            androidx.fragment.app.a aVar3 = hVar.f3252c;
            if (hVar.f3251b) {
                fragment.getExitTransitionCallback();
                arrayList = aVar3.f3201m;
            } else {
                fragment.getEnterTransitionCallback();
                arrayList = aVar3.f3202n;
            }
            if (arrayList != null) {
                aVar2.p(arrayList);
                aVar2.p(aVar.values());
            }
            x(aVar, aVar2);
            return aVar2;
        }
        aVar.clear();
        return null;
    }

    private static androidx.collection.a<String, View> i(w wVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (!aVar.isEmpty() && obj != null) {
            Fragment fragment = hVar.f3253d;
            androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
            wVar.j(aVar2, fragment.requireView());
            androidx.fragment.app.a aVar3 = hVar.f3255f;
            if (hVar.f3254e) {
                fragment.getEnterTransitionCallback();
                arrayList = aVar3.f3202n;
            } else {
                fragment.getExitTransitionCallback();
                arrayList = aVar3.f3201m;
            }
            if (arrayList != null) {
                aVar2.p(arrayList);
            }
            aVar.p(aVar2.keySet());
            return aVar2;
        }
        aVar.clear();
        return null;
    }

    private static w j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        w wVar = f3214b;
        if (wVar == null || !g(wVar, arrayList)) {
            w wVar2 = f3215c;
            if (wVar2 == null || !g(wVar2, arrayList)) {
                if (wVar == null && wVar2 == null) {
                    return null;
                }
                throw new IllegalArgumentException("Invalid Transition types");
            }
            return wVar2;
        }
        return wVar;
    }

    static ArrayList<View> k(w wVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = fragment.getView();
            if (view2 != null) {
                wVar.f(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            wVar.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    private static Object l(w wVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t10;
        androidx.collection.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f3250a;
        Fragment fragment2 = hVar.f3253d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3251b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            t10 = null;
        } else {
            t10 = t(wVar, fragment, fragment2, z10);
            aVar2 = aVar;
        }
        androidx.collection.a<String, View> i10 = i(wVar, aVar2, t10, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i10.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            rect = new Rect();
            wVar.z(obj3, view, arrayList);
            z(wVar, obj3, obj2, i10, hVar.f3254e, hVar.f3255f);
            if (obj != null) {
                wVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        androidx.core.view.v.a(viewGroup, new f(wVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(w wVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f3250a;
        Fragment fragment2 = hVar.f3253d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f3251b;
        Object t10 = aVar.isEmpty() ? null : t(wVar, fragment, fragment2, z10);
        androidx.collection.a<String, View> i10 = i(wVar, aVar, t10, hVar);
        androidx.collection.a<String, View> h10 = h(wVar, aVar, t10, hVar);
        if (aVar.isEmpty()) {
            if (i10 != null) {
                i10.clear();
            }
            if (h10 != null) {
                h10.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i10, aVar.keySet());
            a(arrayList2, h10, aVar.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            arrayList2.add(view);
            wVar.z(obj3, view, arrayList);
            z(wVar, obj3, obj2, i10, hVar.f3254e, hVar.f3255f);
            Rect rect2 = new Rect();
            View s10 = s(h10, hVar, obj, z10);
            if (s10 != null) {
                wVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s10;
        } else {
            view2 = null;
            rect = null;
        }
        androidx.core.view.v.a(viewGroup, new e(fragment, fragment2, z10, h10, view2, wVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3250a;
        Fragment fragment2 = hVar.f3253d;
        w j10 = j(fragment2, fragment);
        if (j10 == null) {
            return;
        }
        boolean z10 = hVar.f3251b;
        boolean z11 = hVar.f3254e;
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l10 = l(j10, viewGroup, view, aVar, hVar, arrayList, arrayList2, q10, r10);
        if (q10 == null && l10 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList, view);
        Object obj2 = (k10 == null || k10.isEmpty()) ? null : null;
        j10.a(q10, view);
        Object u10 = u(j10, q10, obj2, l10, fragment, hVar.f3251b);
        if (fragment2 != null && k10 != null && (k10.size() > 0 || arrayList.size() > 0)) {
            e0.b bVar = new e0.b();
            gVar.b(fragment2, bVar);
            j10.w(fragment2, u10, bVar, new c(gVar, fragment2, bVar));
        }
        if (u10 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j10.t(u10, q10, arrayList3, obj2, k10, l10, arrayList2);
            y(j10, viewGroup, fragment, view, arrayList2, q10, arrayList3, obj2, k10);
            j10.x(viewGroup, arrayList2, aVar);
            j10.c(viewGroup, u10);
            j10.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f3250a;
        Fragment fragment2 = hVar.f3253d;
        w j10 = j(fragment2, fragment);
        if (j10 == null) {
            return;
        }
        boolean z10 = hVar.f3251b;
        boolean z11 = hVar.f3254e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        Object m10 = m(j10, viewGroup, view, aVar, hVar, arrayList2, arrayList, q10, r10);
        if (q10 == null && m10 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList2, view);
        ArrayList<View> k11 = k(j10, q10, fragment, arrayList, view);
        A(k11, 4);
        Object u10 = u(j10, q10, obj, m10, fragment, z10);
        if (fragment2 != null && k10 != null && (k10.size() > 0 || arrayList2.size() > 0)) {
            e0.b bVar = new e0.b();
            gVar.b(fragment2, bVar);
            j10.w(fragment2, u10, bVar, new a(gVar, fragment2, bVar));
        }
        if (u10 != null) {
            v(j10, obj, fragment2, k10);
            ArrayList<String> o10 = j10.o(arrayList);
            j10.t(u10, q10, k11, obj, k10, m10, arrayList);
            j10.c(viewGroup, u10);
            j10.y(viewGroup, arrayList2, arrayList, o10, aVar);
            A(k11, 0);
            j10.A(m10, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar == null) {
            h hVar2 = new h();
            sparseArray.put(i10, hVar2);
            return hVar2;
        }
        return hVar;
    }

    private static Object q(w wVar, Fragment fragment, boolean z10) {
        Object enterTransition;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            enterTransition = fragment.getReenterTransition();
        } else {
            enterTransition = fragment.getEnterTransition();
        }
        return wVar.g(enterTransition);
    }

    private static Object r(w wVar, Fragment fragment, boolean z10) {
        Object exitTransition;
        if (fragment == null) {
            return null;
        }
        if (z10) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        return wVar.g(exitTransition);
    }

    static View s(androidx.collection.a<String, View> aVar, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        String str;
        androidx.fragment.app.a aVar2 = hVar.f3252c;
        if (obj == null || aVar == null || (arrayList = aVar2.f3201m) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z10) {
            str = aVar2.f3201m.get(0);
        } else {
            str = aVar2.f3202n.get(0);
        }
        return aVar.get(str);
    }

    private static Object t(w wVar, Fragment fragment, Fragment fragment2, boolean z10) {
        Object sharedElementEnterTransition;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z10) {
            sharedElementEnterTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementEnterTransition = fragment.getSharedElementEnterTransition();
        }
        return wVar.B(wVar.g(sharedElementEnterTransition));
    }

    private static Object u(w wVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        boolean z11;
        if (obj == null || obj2 == null || fragment == null) {
            z11 = true;
        } else if (z10) {
            z11 = fragment.getAllowReturnTransitionOverlap();
        } else {
            z11 = fragment.getAllowEnterTransitionOverlap();
        }
        if (z11) {
            return wVar.n(obj2, obj, obj3);
        }
        return wVar.m(obj2, obj, obj3);
    }

    private static void v(w wVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            wVar.r(obj, fragment.getView(), arrayList);
            androidx.core.view.v.a(fragment.mContainer, new b(arrayList));
        }
    }

    private static w w() {
        try {
            return (w) f1.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(androidx.collection.a<String, String> aVar, androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.n(size))) {
                aVar.l(size);
            }
        }
    }

    private static void y(w wVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        androidx.core.view.v.a(viewGroup, new d(obj, wVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(w wVar, Object obj, Object obj2, androidx.collection.a<String, View> aVar, boolean z10, androidx.fragment.app.a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f3201m;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z10) {
            str = aVar2.f3202n.get(0);
        } else {
            str = aVar2.f3201m.get(0);
        }
        View view = aVar.get(str);
        wVar.v(obj, view);
        if (obj2 != null) {
            wVar.v(obj2, view);
        }
    }
}
