package e8;

import g8.b;
import java.util.concurrent.Executor;

/* compiled from: WorkInitializer.java */
/* loaded from: classes2.dex */
public class t {

    /* renamed from: a */
    private final Executor f29636a;

    /* renamed from: b */
    private final f8.d f29637b;

    /* renamed from: c */
    private final v f29638c;

    /* renamed from: d */
    private final g8.b f29639d;

    public t(Executor executor, f8.d dVar, v vVar, g8.b bVar) {
        this.f29636a = executor;
        this.f29637b = dVar;
        this.f29638c = vVar;
        this.f29639d = bVar;
    }

    public static /* synthetic */ Object a(t tVar) {
        return tVar.d();
    }

    public static /* synthetic */ void b(t tVar) {
        tVar.e();
    }

    public /* synthetic */ Object d() {
        for (w7.o oVar : this.f29637b.B()) {
            this.f29638c.a(oVar, 1);
        }
        return null;
    }

    public /* synthetic */ void e() {
        this.f29639d.e(new b.a() { // from class: e8.r
            @Override // g8.b.a
            public final Object h() {
                return t.a(t.this);
            }
        });
    }

    public void c() {
        this.f29636a.execute(new Runnable() { // from class: e8.s
            @Override // java.lang.Runnable
            public final void run() {
                t.b(t.this);
            }
        });
    }
}
