package w7;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* compiled from: TransportRuntime.java */
/* loaded from: classes2.dex */
public class t implements s {

    /* renamed from: e  reason: collision with root package name */
    private static volatile u f38310e;

    /* renamed from: a  reason: collision with root package name */
    private final h8.a f38311a;

    /* renamed from: b  reason: collision with root package name */
    private final h8.a f38312b;

    /* renamed from: c  reason: collision with root package name */
    private final d8.e f38313c;

    /* renamed from: d  reason: collision with root package name */
    private final e8.p f38314d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(h8.a aVar, h8.a aVar2, d8.e eVar, e8.p pVar, e8.t tVar) {
        this.f38311a = aVar;
        this.f38312b = aVar2;
        this.f38313c = eVar;
        this.f38314d = pVar;
        tVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f38311a.a()).k(this.f38312b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f38310e;
        if (uVar != null) {
            return uVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<u7.b> d(f fVar) {
        if (fVar instanceof g) {
            return Collections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(u7.b.b("proto"));
    }

    public static void f(Context context) {
        if (f38310e == null) {
            synchronized (t.class) {
                if (f38310e == null) {
                    f38310e = e.d().a(context).build();
                }
            }
        }
    }

    @Override // w7.s
    public void a(n nVar, u7.h hVar) {
        this.f38313c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public e8.p e() {
        return this.f38314d;
    }

    public u7.g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
