package e8;

import a8.c;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.e;
import g8.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: Uploader.java */
/* loaded from: classes2.dex */
public class p {

    /* renamed from: a */
    private final Context f29616a;

    /* renamed from: b */
    private final x7.b f29617b;

    /* renamed from: c */
    private final f8.d f29618c;

    /* renamed from: d */
    private final v f29619d;

    /* renamed from: e */
    private final Executor f29620e;

    /* renamed from: f */
    private final g8.b f29621f;

    /* renamed from: g */
    private final h8.a f29622g;

    /* renamed from: h */
    private final h8.a f29623h;

    /* renamed from: i */
    private final f8.c f29624i;

    public p(Context context, x7.b bVar, f8.d dVar, v vVar, Executor executor, g8.b bVar2, h8.a aVar, h8.a aVar2, f8.c cVar) {
        this.f29616a = context;
        this.f29617b = bVar;
        this.f29618c = dVar;
        this.f29619d = vVar;
        this.f29620e = executor;
        this.f29621f = bVar2;
        this.f29622g = aVar;
        this.f29623h = aVar2;
        this.f29624i = cVar;
    }

    public static /* synthetic */ void a(p pVar, w7.o oVar, int i10, Runnable runnable) {
        pVar.t(oVar, i10, runnable);
    }

    public static /* synthetic */ Boolean b(p pVar, w7.o oVar) {
        return pVar.l(oVar);
    }

    public static /* synthetic */ Object c(p pVar, Map map) {
        return pVar.q(map);
    }

    public static /* synthetic */ Iterable d(p pVar, w7.o oVar) {
        return pVar.m(oVar);
    }

    public static /* synthetic */ Object e(p pVar, Iterable iterable, w7.o oVar, long j10) {
        return pVar.n(iterable, oVar, j10);
    }

    public static /* synthetic */ Object f(p pVar, w7.o oVar, long j10) {
        return pVar.r(oVar, j10);
    }

    public static /* synthetic */ Object g(p pVar, Iterable iterable) {
        return pVar.o(iterable);
    }

    public static /* synthetic */ Object h(p pVar, w7.o oVar, int i10) {
        return pVar.s(oVar, i10);
    }

    public static /* synthetic */ Object i(p pVar) {
        return pVar.p();
    }

    public /* synthetic */ Boolean l(w7.o oVar) {
        return Boolean.valueOf(this.f29618c.g1(oVar));
    }

    public /* synthetic */ Iterable m(w7.o oVar) {
        return this.f29618c.v0(oVar);
    }

    public /* synthetic */ Object n(Iterable iterable, w7.o oVar, long j10) {
        this.f29618c.i0(iterable);
        this.f29618c.r(oVar, this.f29622g.a() + j10);
        return null;
    }

    public /* synthetic */ Object o(Iterable iterable) {
        this.f29618c.n(iterable);
        return null;
    }

    public /* synthetic */ Object p() {
        this.f29624i.b();
        return null;
    }

    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f29624i.a(((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public /* synthetic */ Object r(w7.o oVar, long j10) {
        this.f29618c.r(oVar, this.f29622g.a() + j10);
        return null;
    }

    public /* synthetic */ Object s(w7.o oVar, int i10) {
        this.f29619d.a(oVar, i10 + 1);
        return null;
    }

    public /* synthetic */ void t(final w7.o oVar, final int i10, Runnable runnable) {
        try {
            try {
                g8.b bVar = this.f29621f;
                final f8.d dVar = this.f29618c;
                Objects.requireNonNull(dVar);
                bVar.e(new b.a() { // from class: e8.o
                    @Override // g8.b.a
                    public final Object h() {
                        return Integer.valueOf(f8.d.this.i());
                    }
                });
                if (!k()) {
                    this.f29621f.e(new b.a() { // from class: e8.l
                        @Override // g8.b.a
                        public final Object h() {
                            return p.h(p.this, oVar, i10);
                        }
                    });
                } else {
                    u(oVar, i10);
                }
            } catch (g8.a unused) {
                this.f29619d.a(oVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public w7.i j(x7.g gVar) {
        g8.b bVar = this.f29621f;
        final f8.c cVar = this.f29624i;
        Objects.requireNonNull(cVar);
        return gVar.a(w7.i.a().i(this.f29622g.a()).k(this.f29623h.a()).j("GDT_CLIENT_METRICS").h(new w7.h(u7.b.b("proto"), ((a8.a) bVar.e(new b.a() { // from class: e8.n
            @Override // g8.b.a
            public final Object h() {
                return f8.c.this.d();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f29616a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    void u(final w7.o oVar, int i10) {
        com.google.android.datatransport.runtime.backends.e b10;
        x7.g gVar = this.f29617b.get(oVar.b());
        long j10 = 0;
        while (true) {
            final long j11 = j10;
            while (((Boolean) this.f29621f.e(new b.a() { // from class: e8.j
                @Override // g8.b.a
                public final Object h() {
                    return p.b(p.this, oVar);
                }
            })).booleanValue()) {
                final Iterable<f8.k> iterable = (Iterable) this.f29621f.e(new b.a() { // from class: e8.k
                    @Override // g8.b.a
                    public final Object h() {
                        return p.d(p.this, oVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (gVar == null) {
                    b8.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    b10 = com.google.android.datatransport.runtime.backends.e.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (f8.k kVar : iterable) {
                        arrayList.add(kVar.b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(gVar));
                    }
                    b10 = gVar.b(com.google.android.datatransport.runtime.backends.d.a().b(arrayList).c(oVar.c()).a());
                }
                if (b10.c() == e.a.TRANSIENT_ERROR) {
                    this.f29621f.e(new b.a() { // from class: e8.h
                        @Override // g8.b.a
                        public final Object h() {
                            return p.e(p.this, iterable, oVar, j11);
                        }
                    });
                    this.f29619d.b(oVar, i10 + 1, true);
                    return;
                }
                this.f29621f.e(new b.a() { // from class: e8.g
                    @Override // g8.b.a
                    public final Object h() {
                        return p.g(p.this, iterable);
                    }
                });
                if (b10.c() == e.a.OK) {
                    j10 = Math.max(j11, b10.b());
                    if (oVar.e()) {
                        this.f29621f.e(new b.a() { // from class: e8.e
                            @Override // g8.b.a
                            public final Object h() {
                                return p.i(p.this);
                            }
                        });
                    }
                } else if (b10.c() == e.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (f8.k kVar2 : iterable) {
                        String j12 = kVar2.b().j();
                        if (!hashMap.containsKey(j12)) {
                            hashMap.put(j12, 1);
                        } else {
                            hashMap.put(j12, Integer.valueOf(((Integer) hashMap.get(j12)).intValue() + 1));
                        }
                    }
                    this.f29621f.e(new b.a() { // from class: e8.i
                        @Override // g8.b.a
                        public final Object h() {
                            return p.c(p.this, hashMap);
                        }
                    });
                }
            }
            this.f29621f.e(new b.a() { // from class: e8.m
                @Override // g8.b.a
                public final Object h() {
                    return p.f(p.this, oVar, j11);
                }
            });
            return;
        }
    }

    public void v(final w7.o oVar, final int i10, final Runnable runnable) {
        this.f29620e.execute(new Runnable() { // from class: e8.f
            @Override // java.lang.Runnable
            public final void run() {
                p.a(p.this, oVar, i10, runnable);
            }
        });
    }
}
