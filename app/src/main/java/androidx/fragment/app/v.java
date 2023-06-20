package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
class v extends w {

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f3256a;

        a(v vVar, Rect rect) {
            this.f3256a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f3256a;
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f3257a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f3258b;

        b(v vVar, View view, ArrayList arrayList) {
            this.f3257a = view;
            this.f3258b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3257a.setVisibility(8);
            int size = this.f3258b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f3258b.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f3259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f3260b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f3261c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f3262d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f3263e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f3264f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3259a = obj;
            this.f3260b = arrayList;
            this.f3261c = obj2;
            this.f3262d = arrayList2;
            this.f3263e = obj3;
            this.f3264f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f3259a;
            if (obj != null) {
                v.this.q(obj, this.f3260b, null);
            }
            Object obj2 = this.f3261c;
            if (obj2 != null) {
                v.this.q(obj2, this.f3262d, null);
            }
            Object obj3 = this.f3263e;
            if (obj3 != null) {
                v.this.q(obj3, this.f3264f, null);
            }
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    class d implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f3266a;

        d(v vVar, Runnable runnable) {
            this.f3266a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3266a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    /* loaded from: classes.dex */
    class e extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Rect f3267a;

        e(v vVar, Rect rect) {
            this.f3267a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3267a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3267a;
        }
    }

    private static boolean C(Transition transition) {
        return (w.l(transition.getTargetIds()) && w.l(transition.getTargetNames()) && w.l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.w
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.w
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.w
    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.w
    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
        } else if (C(transition) || !w.l(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i10 < size) {
                transition.addTarget(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.w
    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.w
    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.w
    public Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.w
    public Object m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.w
    public Object n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.w
    public void p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.w
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                q(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
        } else if (!C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                transition.addTarget(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.w
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.w
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.w
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(this, rect));
        }
    }

    @Override // androidx.fragment.app.w
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.w
    public void w(Fragment fragment, Object obj, e0.b bVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(this, runnable));
    }

    @Override // androidx.fragment.app.w
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w.d(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }
}
