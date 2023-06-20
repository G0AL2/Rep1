package ye;

import java.util.concurrent.TimeUnit;

/* compiled from: ConnectionPool.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final df.h f39697a;

    public k(df.h hVar) {
        qe.k.f(hVar, "delegate");
        this.f39697a = hVar;
    }

    public final df.h a() {
        return this.f39697a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new df.h(cf.e.f5513h, i10, j10, timeUnit));
        qe.k.f(timeUnit, "timeUnit");
    }

    public k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
