package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public class q extends i {

    /* renamed from: b  reason: collision with root package name */
    private l.a<o, a> f3394b;

    /* renamed from: c  reason: collision with root package name */
    private i.c f3395c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<p> f3396d;

    /* renamed from: e  reason: collision with root package name */
    private int f3397e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3398f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3399g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<i.c> f3400h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f3401i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        i.c f3402a;

        /* renamed from: b  reason: collision with root package name */
        m f3403b;

        a(o oVar, i.c cVar) {
            this.f3403b = t.f(oVar);
            this.f3402a = cVar;
        }

        void a(p pVar, i.b bVar) {
            i.c f10 = bVar.f();
            this.f3402a = q.k(this.f3402a, f10);
            this.f3403b.b(pVar, bVar);
            this.f3402a = f10;
        }
    }

    public q(p pVar) {
        this(pVar, true);
    }

    private void d(p pVar) {
        Iterator<Map.Entry<o, a>> descendingIterator = this.f3394b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f3399g) {
            Map.Entry<o, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.f3402a.compareTo(this.f3395c) > 0 && !this.f3399g && this.f3394b.contains(next.getKey())) {
                i.b a10 = i.b.a(value.f3402a);
                if (a10 != null) {
                    n(a10.f());
                    value.a(pVar, a10);
                    m();
                } else {
                    throw new IllegalStateException("no event down from " + value.f3402a);
                }
            }
        }
    }

    private i.c e(o oVar) {
        Map.Entry<o, a> l10 = this.f3394b.l(oVar);
        i.c cVar = null;
        i.c cVar2 = l10 != null ? l10.getValue().f3402a : null;
        if (!this.f3400h.isEmpty()) {
            ArrayList<i.c> arrayList = this.f3400h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.f3395c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (!this.f3401i || k.a.f().c()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private void g(p pVar) {
        l.b<o, a>.d g10 = this.f3394b.g();
        while (g10.hasNext() && !this.f3399g) {
            Map.Entry next = g10.next();
            a aVar = (a) next.getValue();
            while (aVar.f3402a.compareTo(this.f3395c) < 0 && !this.f3399g && this.f3394b.contains((o) next.getKey())) {
                n(aVar.f3402a);
                i.b g11 = i.b.g(aVar.f3402a);
                if (g11 != null) {
                    aVar.a(pVar, g11);
                    m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3402a);
                }
            }
        }
    }

    private boolean i() {
        if (this.f3394b.size() == 0) {
            return true;
        }
        i.c cVar = this.f3394b.e().getValue().f3402a;
        i.c cVar2 = this.f3394b.h().getValue().f3402a;
        return cVar == cVar2 && this.f3395c == cVar2;
    }

    static i.c k(i.c cVar, i.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(i.c cVar) {
        if (this.f3395c == cVar) {
            return;
        }
        this.f3395c = cVar;
        if (!this.f3398f && this.f3397e == 0) {
            this.f3398f = true;
            p();
            this.f3398f = false;
            return;
        }
        this.f3399g = true;
    }

    private void m() {
        ArrayList<i.c> arrayList = this.f3400h;
        arrayList.remove(arrayList.size() - 1);
    }

    private void n(i.c cVar) {
        this.f3400h.add(cVar);
    }

    private void p() {
        p pVar = this.f3396d.get();
        if (pVar != null) {
            while (!i()) {
                this.f3399g = false;
                if (this.f3395c.compareTo(this.f3394b.e().getValue().f3402a) < 0) {
                    d(pVar);
                }
                Map.Entry<o, a> h10 = this.f3394b.h();
                if (!this.f3399g && h10 != null && this.f3395c.compareTo(h10.getValue().f3402a) > 0) {
                    g(pVar);
                }
            }
            this.f3399g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @Override // androidx.lifecycle.i
    public void a(o oVar) {
        p pVar;
        f("addObserver");
        i.c cVar = this.f3395c;
        i.c cVar2 = i.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = i.c.INITIALIZED;
        }
        a aVar = new a(oVar, cVar2);
        if (this.f3394b.j(oVar, aVar) == null && (pVar = this.f3396d.get()) != null) {
            boolean z10 = this.f3397e != 0 || this.f3398f;
            i.c e10 = e(oVar);
            this.f3397e++;
            while (aVar.f3402a.compareTo(e10) < 0 && this.f3394b.contains(oVar)) {
                n(aVar.f3402a);
                i.b g10 = i.b.g(aVar.f3402a);
                if (g10 != null) {
                    aVar.a(pVar, g10);
                    m();
                    e10 = e(oVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3402a);
                }
            }
            if (!z10) {
                p();
            }
            this.f3397e--;
        }
    }

    @Override // androidx.lifecycle.i
    public i.c b() {
        return this.f3395c;
    }

    @Override // androidx.lifecycle.i
    public void c(o oVar) {
        f("removeObserver");
        this.f3394b.k(oVar);
    }

    public void h(i.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.f());
    }

    @Deprecated
    public void j(i.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(i.c cVar) {
        f("setCurrentState");
        l(cVar);
    }

    private q(p pVar, boolean z10) {
        this.f3394b = new l.a<>();
        this.f3397e = 0;
        this.f3398f = false;
        this.f3399g = false;
        this.f3400h = new ArrayList<>();
        this.f3396d = new WeakReference<>(pVar);
        this.f3395c = i.c.INITIALIZED;
        this.f3401i = z10;
    }
}
