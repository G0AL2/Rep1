package androidx.room;

import z0.h;

/* compiled from: AutoClosingRoomOpenHelperFactory.kt */
/* loaded from: classes.dex */
public final class e implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f3886a;

    /* renamed from: b  reason: collision with root package name */
    private final c f3887b;

    public e(h.c cVar, c cVar2) {
        qe.k.f(cVar, "delegate");
        qe.k.f(cVar2, "autoCloser");
        this.f3886a = cVar;
        this.f3887b = cVar2;
    }

    @Override // z0.h.c
    /* renamed from: b */
    public d a(h.b bVar) {
        qe.k.f(bVar, "configuration");
        return new d(this.f3886a.a(bVar), this.f3887b);
    }
}
