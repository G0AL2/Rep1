package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class c extends n {

    /* renamed from: s  reason: collision with root package name */
    private static TimeInterpolator f3681s;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f3682h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<RecyclerView.d0> f3683i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<j> f3684j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<i> f3685k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.d0>> f3686l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<ArrayList<j>> f3687m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    ArrayList<ArrayList<i>> f3688n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    ArrayList<RecyclerView.d0> f3689o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    ArrayList<RecyclerView.d0> f3690p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    ArrayList<RecyclerView.d0> f3691q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    ArrayList<RecyclerView.d0> f3692r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3693a;

        a(ArrayList arrayList) {
            this.f3693a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3693a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f3727a, jVar.f3728b, jVar.f3729c, jVar.f3730d, jVar.f3731e);
            }
            this.f3693a.clear();
            c.this.f3687m.remove(this.f3693a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3695a;

        b(ArrayList arrayList) {
            this.f3695a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3695a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f3695a.clear();
            c.this.f3688n.remove(this.f3695a);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0069c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f3697a;

        RunnableC0069c(ArrayList arrayList) {
            this.f3697a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3697a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.d0) it.next());
            }
            this.f3697a.clear();
            c.this.f3686l.remove(this.f3697a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f3699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3700b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3701c;

        d(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3699a = d0Var;
            this.f3700b = viewPropertyAnimator;
            this.f3701c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3700b.setListener(null);
            this.f3701c.setAlpha(1.0f);
            c.this.G(this.f3699a);
            c.this.f3691q.remove(this.f3699a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f3699a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f3703a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f3704b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3705c;

        e(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3703a = d0Var;
            this.f3704b = view;
            this.f3705c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3704b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3705c.setListener(null);
            c.this.A(this.f3703a);
            c.this.f3689o.remove(this.f3703a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f3703a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f3707a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f3708b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3709c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3710d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3711e;

        f(RecyclerView.d0 d0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3707a = d0Var;
            this.f3708b = i10;
            this.f3709c = view;
            this.f3710d = i11;
            this.f3711e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3708b != 0) {
                this.f3709c.setTranslationX(0.0f);
            }
            if (this.f3710d != 0) {
                this.f3709c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3711e.setListener(null);
            c.this.E(this.f3707a);
            c.this.f3690p.remove(this.f3707a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f3707a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f3713a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3714b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3715c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3713a = iVar;
            this.f3714b = viewPropertyAnimator;
            this.f3715c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3714b.setListener(null);
            this.f3715c.setAlpha(1.0f);
            this.f3715c.setTranslationX(0.0f);
            this.f3715c.setTranslationY(0.0f);
            c.this.C(this.f3713a.f3721a, true);
            c.this.f3692r.remove(this.f3713a.f3721a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3713a.f3721a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f3717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f3718b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3719c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3717a = iVar;
            this.f3718b = viewPropertyAnimator;
            this.f3719c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3718b.setListener(null);
            this.f3719c.setAlpha(1.0f);
            this.f3719c.setTranslationX(0.0f);
            this.f3719c.setTranslationY(0.0f);
            c.this.C(this.f3717a.f3722b, false);
            c.this.f3692r.remove(this.f3717a.f3722b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3717a.f3722b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f3727a;

        /* renamed from: b  reason: collision with root package name */
        public int f3728b;

        /* renamed from: c  reason: collision with root package name */
        public int f3729c;

        /* renamed from: d  reason: collision with root package name */
        public int f3730d;

        /* renamed from: e  reason: collision with root package name */
        public int f3731e;

        j(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
            this.f3727a = d0Var;
            this.f3728b = i10;
            this.f3729c = i11;
            this.f3730d = i12;
            this.f3731e = i13;
        }
    }

    private void T(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f3691q.add(d0Var);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(d0Var, animate, view)).start();
    }

    private void W(List<i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, d0Var) && iVar.f3721a == null && iVar.f3722b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.d0 d0Var = iVar.f3721a;
        if (d0Var != null) {
            Y(iVar, d0Var);
        }
        RecyclerView.d0 d0Var2 = iVar.f3722b;
        if (d0Var2 != null) {
            Y(iVar, d0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.d0 d0Var) {
        boolean z10 = false;
        if (iVar.f3722b == d0Var) {
            iVar.f3722b = null;
        } else if (iVar.f3721a != d0Var) {
            return false;
        } else {
            iVar.f3721a = null;
            z10 = true;
        }
        d0Var.itemView.setAlpha(1.0f);
        d0Var.itemView.setTranslationX(0.0f);
        d0Var.itemView.setTranslationY(0.0f);
        C(d0Var, z10);
        return true;
    }

    private void Z(RecyclerView.d0 d0Var) {
        if (f3681s == null) {
            f3681s = new ValueAnimator().getInterpolator();
        }
        d0Var.itemView.animate().setInterpolator(f3681s);
        j(d0Var);
    }

    void Q(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f3689o.add(d0Var);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(d0Var, view, animate)).start();
    }

    void R(i iVar) {
        RecyclerView.d0 d0Var = iVar.f3721a;
        View view = d0Var == null ? null : d0Var.itemView;
        RecyclerView.d0 d0Var2 = iVar.f3722b;
        View view2 = d0Var2 != null ? d0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f3692r.add(iVar.f3721a);
            duration.translationX(iVar.f3725e - iVar.f3723c);
            duration.translationY(iVar.f3726f - iVar.f3724d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f3692r.add(iVar.f3722b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    void S(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3690p.add(d0Var);
        animate.setDuration(n()).setListener(new f(d0Var, i14, view, i15, animate)).start();
    }

    void U(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.g(d0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        view.animate().cancel();
        int size = this.f3684j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3684j.get(size).f3727a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(d0Var);
                this.f3684j.remove(size);
            }
        }
        W(this.f3685k, d0Var);
        if (this.f3682h.remove(d0Var)) {
            view.setAlpha(1.0f);
            G(d0Var);
        }
        if (this.f3683i.remove(d0Var)) {
            view.setAlpha(1.0f);
            A(d0Var);
        }
        for (int size2 = this.f3688n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f3688n.get(size2);
            W(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f3688n.remove(size2);
            }
        }
        for (int size3 = this.f3687m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f3687m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f3727a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3687m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3686l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.f3686l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                A(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f3686l.remove(size5);
                }
            }
        }
        this.f3691q.remove(d0Var);
        this.f3689o.remove(d0Var);
        this.f3692r.remove(d0Var);
        this.f3690p.remove(d0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f3684j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f3684j.get(size);
            View view = jVar.f3727a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f3727a);
            this.f3684j.remove(size);
        }
        for (int size2 = this.f3682h.size() - 1; size2 >= 0; size2--) {
            G(this.f3682h.get(size2));
            this.f3682h.remove(size2);
        }
        int size3 = this.f3683i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.f3683i.get(size3);
            d0Var.itemView.setAlpha(1.0f);
            A(d0Var);
            this.f3683i.remove(size3);
        }
        for (int size4 = this.f3685k.size() - 1; size4 >= 0; size4--) {
            X(this.f3685k.get(size4));
        }
        this.f3685k.clear();
        if (p()) {
            for (int size5 = this.f3687m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f3687m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f3727a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f3727a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3687m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3686l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.d0> arrayList2 = this.f3686l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = arrayList2.get(size8);
                    d0Var2.itemView.setAlpha(1.0f);
                    A(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3686l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3688n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f3688n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3688n.remove(arrayList3);
                    }
                }
            }
            U(this.f3691q);
            U(this.f3690p);
            U(this.f3689o);
            U(this.f3692r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f3683i.isEmpty() && this.f3685k.isEmpty() && this.f3684j.isEmpty() && this.f3682h.isEmpty() && this.f3690p.isEmpty() && this.f3691q.isEmpty() && this.f3689o.isEmpty() && this.f3692r.isEmpty() && this.f3687m.isEmpty() && this.f3686l.isEmpty() && this.f3688n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean z10 = !this.f3682h.isEmpty();
        boolean z11 = !this.f3684j.isEmpty();
        boolean z12 = !this.f3685k.isEmpty();
        boolean z13 = !this.f3683i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.d0> it = this.f3682h.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.f3682h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f3684j);
                this.f3687m.add(arrayList);
                this.f3684j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    z.j0(arrayList.get(0).f3727a.itemView, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f3685k);
                this.f3688n.add(arrayList2);
                this.f3685k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    z.j0(arrayList2.get(0).f3721a.itemView, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f3683i);
                this.f3686l.add(arrayList3);
                this.f3683i.clear();
                RunnableC0069c runnableC0069c = new RunnableC0069c(arrayList3);
                if (!z10 && !z11 && !z12) {
                    runnableC0069c.run();
                } else {
                    z.j0(arrayList3.get(0).itemView, runnableC0069c, (z10 ? o() : 0L) + Math.max(z11 ? n() : 0L, z12 ? m() : 0L));
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.n
    public boolean w(RecyclerView.d0 d0Var) {
        Z(d0Var);
        d0Var.itemView.setAlpha(0.0f);
        this.f3683i.add(d0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean x(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
        if (d0Var == d0Var2) {
            return y(d0Var, i10, i11, i12, i13);
        }
        float translationX = d0Var.itemView.getTranslationX();
        float translationY = d0Var.itemView.getTranslationY();
        float alpha = d0Var.itemView.getAlpha();
        Z(d0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        d0Var.itemView.setTranslationX(translationX);
        d0Var.itemView.setTranslationY(translationY);
        d0Var.itemView.setAlpha(alpha);
        if (d0Var2 != null) {
            Z(d0Var2);
            d0Var2.itemView.setTranslationX(-i14);
            d0Var2.itemView.setTranslationY(-i15);
            d0Var2.itemView.setAlpha(0.0f);
        }
        this.f3685k.add(new i(d0Var, d0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean y(RecyclerView.d0 d0Var, int i10, int i11, int i12, int i13) {
        View view = d0Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) d0Var.itemView.getTranslationY());
        Z(d0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(d0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f3684j.add(new j(d0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean z(RecyclerView.d0 d0Var) {
        Z(d0Var);
        this.f3682h.add(d0Var);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.d0 f3721a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.d0 f3722b;

        /* renamed from: c  reason: collision with root package name */
        public int f3723c;

        /* renamed from: d  reason: collision with root package name */
        public int f3724d;

        /* renamed from: e  reason: collision with root package name */
        public int f3725e;

        /* renamed from: f  reason: collision with root package name */
        public int f3726f;

        private i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f3721a = d0Var;
            this.f3722b = d0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3721a + ", newHolder=" + this.f3722b + ", fromX=" + this.f3723c + ", fromY=" + this.f3724d + ", toX=" + this.f3725e + ", toY=" + this.f3726f + '}';
        }

        i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i10, int i11, int i12, int i13) {
            this(d0Var, d0Var2);
            this.f3723c = i10;
            this.f3724d = i11;
            this.f3725e = i12;
            this.f3726f = i13;
        }
    }
}
