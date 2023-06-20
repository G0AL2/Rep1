package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import e0.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SpecialEffectsController.java */
/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f3282a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<e> f3283b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<e> f3284c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f3285d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f3286e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f3287a;

        a(d dVar) {
            this.f3287a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (z.this.f3283b.contains(this.f3287a)) {
                this.f3287a.e().a(this.f3287a.f().mView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f3289a;

        b(d dVar) {
            this.f3289a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f3283b.remove(this.f3289a);
            z.this.f3284c.remove(this.f3289a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3291a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f3292b;

        static {
            int[] iArr = new int[e.b.values().length];
            f3292b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3292b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3292b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f3291a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3291a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3291a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3291a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final q f3293h;

        d(e.c cVar, e.b bVar, q qVar, e0.b bVar2) {
            super(cVar, bVar, qVar.k(), bVar2);
            this.f3293h = qVar;
        }

        @Override // androidx.fragment.app.z.e
        public void c() {
            super.c();
            this.f3293h.m();
        }

        @Override // androidx.fragment.app.z.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment k10 = this.f3293h.k();
                View findFocus = k10.mView.findFocus();
                if (findFocus != null) {
                    k10.setFocusedView(findFocus);
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                    }
                }
                View requireView = f().requireView();
                if (requireView.getParent() == null) {
                    this.f3293h.b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(k10.getPostOnViewCreatedAlpha());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private c f3294a;

        /* renamed from: b  reason: collision with root package name */
        private b f3295b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f3296c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f3297d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<e0.b> f3298e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f3299f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3300g = false;

        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        class a implements b.a {
            a() {
            }

            @Override // e0.b.a
            public void onCancel() {
                e.this.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SpecialEffectsController.java */
        /* loaded from: classes.dex */
        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c b(int i10) {
                if (i10 != 0) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i10);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public static c c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return b(view.getVisibility());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public void a(View view) {
                int i10 = c.f3291a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.G0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i10 == 2) {
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                } else if (i10 == 3) {
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                } else if (i10 != 4) {
                } else {
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                    }
                    view.setVisibility(4);
                }
            }
        }

        e(c cVar, b bVar, Fragment fragment, e0.b bVar2) {
            this.f3294a = cVar;
            this.f3295b = bVar;
            this.f3296c = fragment;
            bVar2.d(new a());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f3297d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f3299f = true;
            if (this.f3298e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f3298e).iterator();
            while (it.hasNext()) {
                ((e0.b) it.next()).a();
            }
        }

        public void c() {
            if (this.f3300g) {
                return;
            }
            if (FragmentManager.G0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3300g = true;
            for (Runnable runnable : this.f3297d) {
                runnable.run();
            }
        }

        public final void d(e0.b bVar) {
            if (this.f3298e.remove(bVar) && this.f3298e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f3294a;
        }

        public final Fragment f() {
            return this.f3296c;
        }

        b g() {
            return this.f3295b;
        }

        final boolean h() {
            return this.f3299f;
        }

        final boolean i() {
            return this.f3300g;
        }

        public final void j(e0.b bVar) {
            l();
            this.f3298e.add(bVar);
        }

        final void k(c cVar, b bVar) {
            int i10 = c.f3292b[bVar.ordinal()];
            if (i10 == 1) {
                if (this.f3294a == c.REMOVED) {
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3296c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3295b + " to ADDING.");
                    }
                    this.f3294a = c.VISIBLE;
                    this.f3295b = b.ADDING;
                }
            } else if (i10 != 2) {
                if (i10 == 3 && this.f3294a != c.REMOVED) {
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3296c + " mFinalState = " + this.f3294a + " -> " + cVar + ". ");
                    }
                    this.f3294a = cVar;
                }
            } else {
                if (FragmentManager.G0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3296c + " mFinalState = " + this.f3294a + " -> REMOVED. mLifecycleImpact  = " + this.f3295b + " to REMOVING.");
                }
                this.f3294a = c.REMOVED;
                this.f3295b = b.REMOVING;
            }
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f3294a + "} {mLifecycleImpact = " + this.f3295b + "} {mFragment = " + this.f3296c + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(ViewGroup viewGroup) {
        this.f3282a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, q qVar) {
        synchronized (this.f3283b) {
            e0.b bVar2 = new e0.b();
            e h10 = h(qVar.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, qVar, bVar2);
            this.f3283b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.f3283b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.f3284c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.z0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z o(ViewGroup viewGroup, a0 a0Var) {
        int i10 = q0.b.f35762b;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof z) {
            return (z) tag;
        }
        z a10 = a0Var.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    private void q() {
        Iterator<e> it = this.f3283b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.b(next.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(e.c cVar, q qVar) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + qVar.k());
        }
        a(cVar, e.b.ADDING, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(q qVar) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + qVar.k());
        }
        a(e.c.GONE, e.b.NONE, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(q qVar) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + qVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(q qVar) {
        if (FragmentManager.G0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + qVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, qVar);
    }

    abstract void f(List<e> list, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (this.f3286e) {
            return;
        }
        if (!androidx.core.view.z.T(this.f3282a)) {
            j();
            this.f3285d = false;
            return;
        }
        synchronized (this.f3283b) {
            if (!this.f3283b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f3284c);
                this.f3284c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (FragmentManager.G0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f3284c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f3283b);
                this.f3283b.clear();
                this.f3284c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).l();
                }
                f(arrayList2, this.f3285d);
                this.f3285d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean T = androidx.core.view.z.T(this.f3282a);
        synchronized (this.f3283b) {
            q();
            Iterator<e> it = this.f3283b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f3284c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (FragmentManager.G0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (T) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f3282a + " is not attached to window. ";
                    }
                    sb2.append(str2);
                    sb2.append("Cancelling running operation ");
                    sb2.append(eVar);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f3283b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (FragmentManager.G0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: ");
                    if (T) {
                        str = "";
                    } else {
                        str = "Container " + this.f3282a + " is not attached to window. ";
                    }
                    sb3.append(str);
                    sb3.append("Cancelling pending operation ");
                    sb3.append(eVar2);
                    Log.v("FragmentManager", sb3.toString());
                }
                eVar2.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        if (this.f3286e) {
            this.f3286e = false;
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e.b l(q qVar) {
        e h10 = h(qVar.k());
        e.b g10 = h10 != null ? h10.g() : null;
        e i10 = i(qVar.k());
        return (i10 == null || !(g10 == null || g10 == e.b.NONE)) ? g10 : i10.g();
    }

    public ViewGroup m() {
        return this.f3282a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f3283b) {
            q();
            this.f3286e = false;
            int size = this.f3283b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f3283b.get(size);
                e.c c10 = e.c.c(eVar.f().mView);
                e.c e10 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e10 == cVar && c10 != cVar) {
                    this.f3286e = eVar.f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(boolean z10) {
        this.f3285d = z10;
    }
}
