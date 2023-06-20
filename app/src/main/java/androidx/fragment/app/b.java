package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.view.c0;
import androidx.fragment.app.e;
import androidx.fragment.app.z;
import e0.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
class b extends z {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3086a;

        static {
            int[] iArr = new int[z.e.c.values().length];
            f3086a = iArr;
            try {
                iArr[z.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3086a[z.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3086a[z.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3086a[z.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0058b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f3087a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f3088b;

        RunnableC0058b(List list, z.e eVar) {
            this.f3087a = list;
            this.f3088b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3087a.contains(this.f3088b)) {
                this.f3087a.remove(this.f3088b);
                b.this.s(this.f3088b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3092c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f3093d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f3094e;

        c(b bVar, ViewGroup viewGroup, View view, boolean z10, z.e eVar, k kVar) {
            this.f3090a = viewGroup;
            this.f3091b = view;
            this.f3092c = z10;
            this.f3093d = eVar;
            this.f3094e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3090a.endViewTransition(this.f3091b);
            if (this.f3092c) {
                this.f3093d.e().a(this.f3091b);
            }
            this.f3094e.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class d implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Animator f3095a;

        d(b bVar, Animator animator) {
            this.f3095a = animator;
        }

        @Override // e0.b.a
        public void onCancel() {
            this.f3095a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3097b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3098c;

        /* compiled from: DefaultSpecialEffectsController.java */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f3096a.endViewTransition(eVar.f3097b);
                e.this.f3098c.a();
            }
        }

        e(b bVar, ViewGroup viewGroup, View view, k kVar) {
            this.f3096a = viewGroup;
            this.f3097b = view;
            this.f3098c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3096a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class f implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f3100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f3101b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f3102c;

        f(b bVar, View view, ViewGroup viewGroup, k kVar) {
            this.f3100a = view;
            this.f3101b = viewGroup;
            this.f3102c = kVar;
        }

        @Override // e0.b.a
        public void onCancel() {
            this.f3100a.clearAnimation();
            this.f3101b.endViewTransition(this.f3100a);
            this.f3102c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f3103a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f3104b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f3105c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f3106d;

        g(b bVar, z.e eVar, z.e eVar2, boolean z10, androidx.collection.a aVar) {
            this.f3103a = eVar;
            this.f3104b = eVar2;
            this.f3105c = z10;
            this.f3106d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            u.f(this.f3103a.f(), this.f3104b.f(), this.f3105c, this.f3106d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f3107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3108b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Rect f3109c;

        h(b bVar, w wVar, View view, Rect rect) {
            this.f3107a = wVar;
            this.f3108b = view;
            this.f3109c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3107a.k(this.f3108b, this.f3109c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3110a;

        i(b bVar, ArrayList arrayList) {
            this.f3110a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            u.A(this.f3110a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f3111a;

        j(b bVar, m mVar) {
            this.f3111a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3111a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f3112c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3113d;

        /* renamed from: e  reason: collision with root package name */
        private e.d f3114e;

        k(z.e eVar, e0.b bVar, boolean z10) {
            super(eVar, bVar);
            this.f3113d = false;
            this.f3112c = z10;
        }

        e.d e(Context context) {
            if (this.f3113d) {
                return this.f3114e;
            }
            e.d c10 = androidx.fragment.app.e.c(context, b().f(), b().e() == z.e.c.VISIBLE, this.f3112c);
            this.f3114e = c10;
            this.f3113d = true;
            return c10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a  reason: collision with root package name */
        private final z.e f3115a;

        /* renamed from: b  reason: collision with root package name */
        private final e0.b f3116b;

        l(z.e eVar, e0.b bVar) {
            this.f3115a = eVar;
            this.f3116b = bVar;
        }

        void a() {
            this.f3115a.d(this.f3116b);
        }

        z.e b() {
            return this.f3115a;
        }

        e0.b c() {
            return this.f3116b;
        }

        boolean d() {
            z.e.c cVar;
            z.e.c c10 = z.e.c.c(this.f3115a.f().mView);
            z.e.c e10 = this.f3115a.e();
            return c10 == e10 || !(c10 == (cVar = z.e.c.VISIBLE) || e10 == cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f3117c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f3118d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f3119e;

        m(z.e eVar, e0.b bVar, boolean z10, boolean z11) {
            super(eVar, bVar);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (eVar.e() == z.e.c.VISIBLE) {
                if (z10) {
                    enterTransition = eVar.f().getReenterTransition();
                } else {
                    enterTransition = eVar.f().getEnterTransition();
                }
                this.f3117c = enterTransition;
                if (z10) {
                    allowEnterTransitionOverlap = eVar.f().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = eVar.f().getAllowEnterTransitionOverlap();
                }
                this.f3118d = allowEnterTransitionOverlap;
            } else {
                if (z10) {
                    exitTransition = eVar.f().getReturnTransition();
                } else {
                    exitTransition = eVar.f().getExitTransition();
                }
                this.f3117c = exitTransition;
                this.f3118d = true;
            }
            if (!z11) {
                this.f3119e = null;
            } else if (z10) {
                this.f3119e = eVar.f().getSharedElementReturnTransition();
            } else {
                this.f3119e = eVar.f().getSharedElementEnterTransition();
            }
        }

        private w f(Object obj) {
            if (obj == null) {
                return null;
            }
            w wVar = u.f3214b;
            if (wVar == null || !wVar.e(obj)) {
                w wVar2 = u.f3215c;
                if (wVar2 == null || !wVar2.e(obj)) {
                    throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
                }
                return wVar2;
            }
            return wVar;
        }

        w e() {
            w f10 = f(this.f3117c);
            w f11 = f(this.f3119e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f3117c + " which uses a different Transition  type than its shared element transition " + this.f3119e);
        }

        public Object g() {
            return this.f3119e;
        }

        Object h() {
            return this.f3117c;
        }

        public boolean i() {
            return this.f3119e != null;
        }

        boolean j() {
            return this.f3118d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<z.e> list2, boolean z10, Map<z.e, Boolean> map) {
        ViewGroup m10 = m();
        Context context = m10.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k kVar : list) {
            if (kVar.d()) {
                kVar.a();
            } else {
                e.d e10 = kVar.e(context);
                if (e10 == null) {
                    kVar.a();
                } else {
                    Animator animator = e10.f3141b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        z.e b10 = kVar.b();
                        Fragment f10 = b10.f();
                        if (Boolean.TRUE.equals(map.get(b10))) {
                            if (FragmentManager.G0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f10 + " as this Fragment was involved in a Transition.");
                            }
                            kVar.a();
                        } else {
                            boolean z12 = b10.e() == z.e.c.GONE;
                            if (z12) {
                                list2.remove(b10);
                            }
                            View view = f10.mView;
                            m10.startViewTransition(view);
                            animator.addListener(new c(this, m10, view, z12, b10, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.c().d(new d(this, animator));
                            z11 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            z.e b11 = kVar2.b();
            Fragment f11 = b11.f();
            if (z10) {
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f11 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.a();
            } else if (z11) {
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f11 + " as Animations cannot run alongside Animators.");
                }
                kVar2.a();
            } else {
                View view2 = f11.mView;
                Animation animation = (Animation) h0.g.f(((e.d) h0.g.f(kVar2.e(context))).f3140a);
                if (b11.e() != z.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    m10.startViewTransition(view2);
                    e.RunnableC0060e runnableC0060e = new e.RunnableC0060e(animation, m10, view2);
                    runnableC0060e.setAnimationListener(new e(this, m10, view2, kVar2));
                    view2.startAnimation(runnableC0060e);
                }
                kVar2.c().d(new f(this, view2, m10, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<z.e, Boolean> x(List<m> list, List<z.e> list2, boolean z10, z.e eVar, z.e eVar2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        z.e eVar3;
        z.e eVar4;
        View view2;
        Object n10;
        androidx.collection.a aVar;
        ArrayList<View> arrayList3;
        z.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        w wVar;
        z.e eVar6;
        View view4;
        boolean z11 = z10;
        z.e eVar7 = eVar;
        z.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        w wVar2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                w e10 = mVar.e();
                if (wVar2 == null) {
                    wVar2 = e10;
                } else if (e10 != null && wVar2 != e10) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (wVar2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Object obj3 = null;
        View view6 = null;
        boolean z12 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                wVar = wVar2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object B = wVar2.B(wVar2.g(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view7 = view6;
                int i10 = 0;
                while (i10 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                    }
                    i10++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                if (!z11) {
                    eVar.f().getExitTransitionCallback();
                    eVar2.f().getEnterTransitionCallback();
                } else {
                    eVar.f().getEnterTransitionCallback();
                    eVar2.f().getExitTransitionCallback();
                }
                int i11 = 0;
                for (int size = sharedElementSourceNames.size(); i11 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i11), sharedElementTargetNames2.get(i11));
                    i11++;
                }
                androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
                u(aVar3, eVar.f().mView);
                aVar3.p(sharedElementSourceNames);
                aVar2.p(aVar3.keySet());
                androidx.collection.a<String, View> aVar4 = new androidx.collection.a<>();
                u(aVar4, eVar2.f().mView);
                aVar4.p(sharedElementTargetNames2);
                aVar4.p(aVar2.values());
                u.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    wVar = wVar2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    u.f(eVar2.f(), eVar.f(), z11, aVar3, true);
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    androidx.core.view.v.a(m(), new g(this, eVar2, eVar, z10, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = aVar3.get(sharedElementSourceNames.get(0));
                        wVar2.v(B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(aVar4.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view4 = aVar4.get(sharedElementTargetNames2.get(0))) != null) {
                        androidx.core.view.v.a(m(), new h(this, wVar2, view4, rect2));
                        z12 = true;
                    }
                    wVar2.z(B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    wVar = wVar2;
                    wVar2.t(B, null, null, null, null, B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = B;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            z11 = z10;
            arrayList6 = arrayList3;
            wVar2 = wVar;
        }
        View view9 = view6;
        androidx.collection.a aVar5 = aVar2;
        Collection<?> collection = arrayList6;
        z.e eVar9 = eVar7;
        Collection<?> collection2 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        w wVar3 = wVar2;
        z.e eVar10 = eVar8;
        ArrayList arrayList9 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar4 : list) {
            if (mVar4.d()) {
                hashMap.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object g10 = wVar3.g(mVar4.h());
                z.e b10 = mVar4.b();
                boolean z13 = obj3 != null && (b10 == eVar9 || b10 == eVar10);
                if (g10 == null) {
                    if (!z13) {
                        hashMap.put(b10, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = collection;
                    arrayList = collection2;
                    view = view10;
                    n10 = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList10 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList10, b10.f().mView);
                    if (z13) {
                        if (b10 == eVar9) {
                            arrayList10.removeAll(collection2);
                        } else {
                            arrayList10.removeAll(collection);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        wVar3.a(g10, view10);
                        arrayList2 = collection;
                        arrayList = collection2;
                        view = view10;
                        eVar4 = b10;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        wVar3.b(g10, arrayList10);
                        view = view10;
                        obj = obj6;
                        arrayList = collection2;
                        obj2 = obj5;
                        arrayList2 = collection;
                        eVar3 = eVar10;
                        wVar3.t(g10, g10, arrayList10, null, null, null, null);
                        if (b10.e() == z.e.c.GONE) {
                            eVar4 = b10;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList11 = new ArrayList<>(arrayList10);
                            arrayList11.remove(eVar4.f().mView);
                            wVar3.r(g10, eVar4.f().mView, arrayList11);
                            androidx.core.view.v.a(m(), new i(this, arrayList10));
                        } else {
                            eVar4 = b10;
                        }
                    }
                    if (eVar4.e() == z.e.c.VISIBLE) {
                        arrayList9.addAll(arrayList10);
                        if (z12) {
                            wVar3.u(g10, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        wVar3.v(g10, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (mVar4.j()) {
                        obj5 = wVar3.n(obj2, g10, null);
                        n10 = obj;
                    } else {
                        n10 = wVar3.n(obj, g10, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = n10;
                view9 = view2;
                view10 = view;
                collection2 = arrayList;
                collection = arrayList2;
            }
        }
        ArrayList<View> arrayList12 = collection;
        ArrayList<View> arrayList13 = collection2;
        z.e eVar11 = eVar10;
        Object m10 = wVar3.m(obj5, obj4, obj3);
        for (m mVar5 : list) {
            if (!mVar5.d()) {
                Object h10 = mVar5.h();
                z.e b11 = mVar5.b();
                boolean z14 = obj3 != null && (b11 == eVar9 || b11 == eVar11);
                if (h10 != null || z14) {
                    if (!androidx.core.view.z.U(m())) {
                        if (FragmentManager.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b11);
                        }
                        mVar5.a();
                    } else {
                        wVar3.w(mVar5.b().f(), m10, mVar5.c(), new j(this, mVar5));
                    }
                }
            }
        }
        if (androidx.core.view.z.U(m())) {
            u.A(arrayList9, 4);
            ArrayList<String> o10 = wVar3.o(arrayList12);
            wVar3.c(m(), m10);
            wVar3.y(m(), arrayList13, arrayList12, o10, aVar5);
            u.A(arrayList9, 0);
            wVar3.A(obj3, arrayList13, arrayList12);
            return hashMap;
        }
        return hashMap;
    }

    @Override // androidx.fragment.app.z
    void f(List<z.e> list, boolean z10) {
        z.e eVar = null;
        z.e eVar2 = null;
        for (z.e eVar3 : list) {
            z.e.c c10 = z.e.c.c(eVar3.f().mView);
            int i10 = a.f3086a[eVar3.e().ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                if (i10 == 4 && c10 != z.e.c.VISIBLE) {
                    eVar2 = eVar3;
                }
            } else if (c10 == z.e.c.VISIBLE && eVar == null) {
                eVar = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<z.e> arrayList3 = new ArrayList(list);
        for (z.e eVar4 : list) {
            e0.b bVar = new e0.b();
            eVar4.j(bVar);
            arrayList.add(new k(eVar4, bVar, z10));
            e0.b bVar2 = new e0.b();
            eVar4.j(bVar2);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, bVar2, z10, z11));
                    eVar4.a(new RunnableC0058b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, bVar2, z10, z11));
                eVar4.a(new RunnableC0058b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, bVar2, z10, z11));
                    eVar4.a(new RunnableC0058b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, bVar2, z10, z11));
                eVar4.a(new RunnableC0058b(arrayList3, eVar4));
            }
        }
        Map<z.e, Boolean> x10 = x(arrayList2, arrayList3, z10, eVar, eVar2);
        w(arrayList, arrayList3, x10.containsValue(Boolean.TRUE), x10);
        for (z.e eVar5 : arrayList3) {
            s(eVar5);
        }
        arrayList3.clear();
    }

    void s(z.e eVar) {
        eVar.e().a(eVar.f().mView);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (c0.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    void u(Map<String, View> map, View view) {
        String L = androidx.core.view.z.L(view);
        if (L != null) {
            map.put(L, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(androidx.core.view.z.L(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
