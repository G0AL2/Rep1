package df;

import java.io.IOException;

/* compiled from: RouteException.kt */
/* loaded from: classes3.dex */
public final class j extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private IOException f29457a;

    /* renamed from: b  reason: collision with root package name */
    private final IOException f29458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(IOException iOException) {
        super(iOException);
        qe.k.f(iOException, "firstConnectException");
        this.f29458b = iOException;
        this.f29457a = iOException;
    }

    public final void a(IOException iOException) {
        qe.k.f(iOException, "e");
        ee.b.a(this.f29458b, iOException);
        this.f29457a = iOException;
    }

    public final IOException b() {
        return this.f29458b;
    }

    public final IOException c() {
        return this.f29457a;
    }
}
