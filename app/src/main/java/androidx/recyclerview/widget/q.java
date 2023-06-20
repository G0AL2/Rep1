package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    final androidx.collection.g<RecyclerView.d0, a> f3822a = new androidx.collection.g<>();

    /* renamed from: b  reason: collision with root package name */
    final androidx.collection.d<RecyclerView.d0> f3823b = new androidx.collection.d<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        static h0.e<a> f3824d = new Pools$SimplePool(20);

        /* renamed from: a  reason: collision with root package name */
        int f3825a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView.m.c f3826b;

        /* renamed from: c  reason: collision with root package name */
        RecyclerView.m.c f3827c;

        private a() {
        }

        static void a() {
            do {
            } while (f3824d.b() != null);
        }

        static a b() {
            a b10 = f3824d.b();
            return b10 == null ? new a() : b10;
        }

        static void c(a aVar) {
            aVar.f3825a = 0;
            aVar.f3826b = null;
            aVar.f3827c = null;
            f3824d.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void b(RecyclerView.d0 d0Var);

        void c(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    private RecyclerView.m.c l(RecyclerView.d0 d0Var, int i10) {
        a n10;
        RecyclerView.m.c cVar;
        int g10 = this.f3822a.g(d0Var);
        if (g10 >= 0 && (n10 = this.f3822a.n(g10)) != null) {
            int i11 = n10.f3825a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                n10.f3825a = i12;
                if (i10 == 4) {
                    cVar = n10.f3826b;
                } else if (i10 == 8) {
                    cVar = n10.f3827c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f3822a.l(g10);
                    a.c(n10);
                }
                return cVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = this.f3822a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3822a.put(d0Var, aVar);
        }
        aVar.f3825a |= 2;
        aVar.f3826b = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(RecyclerView.d0 d0Var) {
        a aVar = this.f3822a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3822a.put(d0Var, aVar);
        }
        aVar.f3825a |= 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(long j10, RecyclerView.d0 d0Var) {
        this.f3823b.k(j10, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = this.f3822a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3822a.put(d0Var, aVar);
        }
        aVar.f3827c = cVar;
        aVar.f3825a |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(RecyclerView.d0 d0Var, RecyclerView.m.c cVar) {
        a aVar = this.f3822a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3822a.put(d0Var, aVar);
        }
        aVar.f3826b = cVar;
        aVar.f3825a |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f3822a.clear();
        this.f3823b.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.d0 g(long j10) {
        return this.f3823b.f(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.f3822a.get(d0Var);
        return (aVar == null || (aVar.f3825a & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.f3822a.get(d0Var);
        return (aVar == null || (aVar.f3825a & 4) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RecyclerView.m.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(b bVar) {
        for (int size = this.f3822a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 j10 = this.f3822a.j(size);
            a l10 = this.f3822a.l(size);
            int i10 = l10.f3825a;
            if ((i10 & 3) == 3) {
                bVar.b(j10);
            } else if ((i10 & 1) != 0) {
                RecyclerView.m.c cVar = l10.f3826b;
                if (cVar == null) {
                    bVar.b(j10);
                } else {
                    bVar.c(j10, cVar, l10.f3827c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.a(j10, l10.f3826b, l10.f3827c);
            } else if ((i10 & 12) == 12) {
                bVar.d(j10, l10.f3826b, l10.f3827c);
            } else if ((i10 & 4) != 0) {
                bVar.c(j10, l10.f3826b, null);
            } else if ((i10 & 8) != 0) {
                bVar.a(j10, l10.f3826b, l10.f3827c);
            }
            a.c(l10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.f3822a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f3825a &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(RecyclerView.d0 d0Var) {
        int o10 = this.f3823b.o() - 1;
        while (true) {
            if (o10 < 0) {
                break;
            } else if (d0Var == this.f3823b.p(o10)) {
                this.f3823b.n(o10);
                break;
            } else {
                o10--;
            }
        }
        a remove = this.f3822a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
