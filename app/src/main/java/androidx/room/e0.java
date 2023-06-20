package androidx.room;

import androidx.room.k0;
import java.util.concurrent.Executor;
import z0.h;

/* compiled from: QueryInterceptorOpenHelperFactory.kt */
/* loaded from: classes.dex */
public final class e0 implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f3888a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3889b;

    /* renamed from: c  reason: collision with root package name */
    private final k0.g f3890c;

    public e0(h.c cVar, Executor executor, k0.g gVar) {
        qe.k.f(cVar, "delegate");
        qe.k.f(executor, "queryCallbackExecutor");
        qe.k.f(gVar, "queryCallback");
        this.f3888a = cVar;
        this.f3889b = executor;
        this.f3890c = gVar;
    }

    @Override // z0.h.c
    public z0.h a(h.b bVar) {
        qe.k.f(bVar, "configuration");
        return new d0(this.f3888a.a(bVar), this.f3889b, this.f3890c);
    }
}
