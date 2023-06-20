package cb;

import java.util.Objects;

/* loaded from: classes3.dex */
final class z extends w {

    /* renamed from: a  reason: collision with root package name */
    private final y f5465a = new y();

    @Override // cb.w
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        }
        Objects.requireNonNull(th2, "The suppressed exception cannot be null.");
        this.f5465a.a(th).add(th2);
    }
}
