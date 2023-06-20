package df;

import java.util.LinkedHashSet;
import java.util.Set;
import ye.f0;

/* compiled from: RouteDatabase.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Set<f0> f29456a = new LinkedHashSet();

    public final synchronized void a(f0 f0Var) {
        qe.k.f(f0Var, "route");
        this.f29456a.remove(f0Var);
    }

    public final synchronized void b(f0 f0Var) {
        qe.k.f(f0Var, "failedRoute");
        this.f29456a.add(f0Var);
    }

    public final synchronized boolean c(f0 f0Var) {
        qe.k.f(f0Var, "route");
        return this.f29456a.contains(f0Var);
    }
}
