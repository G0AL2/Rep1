package cb;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class x extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f5462a;

    public x(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f5462a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == x.class) {
            if (this == obj) {
                return true;
            }
            x xVar = (x) obj;
            if (this.f5462a == xVar.f5462a && get() == xVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5462a;
    }
}
