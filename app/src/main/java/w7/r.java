package w7;

/* compiled from: TransportImpl.java */
/* loaded from: classes2.dex */
final class r<T> implements u7.f<T> {

    /* renamed from: a */
    private final o f38305a;

    /* renamed from: b */
    private final String f38306b;

    /* renamed from: c */
    private final u7.b f38307c;

    /* renamed from: d */
    private final u7.e<T, byte[]> f38308d;

    /* renamed from: e */
    private final s f38309e;

    public r(o oVar, String str, u7.b bVar, u7.e<T, byte[]> eVar, s sVar) {
        this.f38305a = oVar;
        this.f38306b = str;
        this.f38307c = bVar;
        this.f38308d = eVar;
        this.f38309e = sVar;
    }

    public static /* synthetic */ void c(Exception exc) {
        d(exc);
    }

    public static /* synthetic */ void d(Exception exc) {
    }

    @Override // u7.f
    public void a(u7.c<T> cVar) {
        b(cVar, new u7.h() { // from class: w7.q
            @Override // u7.h
            public final void a(Exception exc) {
                r.c(exc);
            }
        });
    }

    @Override // u7.f
    public void b(u7.c<T> cVar, u7.h hVar) {
        this.f38309e.a(n.a().e(this.f38305a).c(cVar).f(this.f38306b).d(this.f38308d).b(this.f38307c).a(), hVar);
    }
}
