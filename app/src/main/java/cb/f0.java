package cb;

/* loaded from: classes3.dex */
public final class f0<T> implements g0, d0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f5433c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile g0<T> f5434a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f5435b = f5433c;

    private f0(g0<T> g0Var) {
        this.f5434a = g0Var;
    }

    public static <P extends g0<T>, T> g0<T> a(P p10) {
        r.c(p10);
        return p10 instanceof f0 ? p10 : new f0(p10);
    }

    public static <P extends g0<T>, T> d0<T> b(P p10) {
        if (p10 instanceof d0) {
            return (d0) p10;
        }
        r.c(p10);
        return new f0(p10);
    }

    @Override // cb.g0
    public final T a() {
        T t10 = (T) this.f5435b;
        Object obj = f5433c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f5435b;
                if (t10 == obj) {
                    t10 = this.f5434a.a();
                    Object obj2 = this.f5435b;
                    if (obj2 != obj && obj2 != t10) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t10);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(valueOf);
                        sb2.append(" & ");
                        sb2.append(valueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.f5435b = t10;
                    this.f5434a = null;
                }
            }
        }
        return t10;
    }
}
