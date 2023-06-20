package cb;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
final class y {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<x, List<Throwable>> f5463a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f5464b = new ReferenceQueue<>();

    public final List<Throwable> a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f5464b.poll();
            if (poll == null) {
                break;
            }
            this.f5463a.remove(poll);
        }
        List<Throwable> list = this.f5463a.get(new x(th, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f5463a.putIfAbsent(new x(th, this.f5464b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
