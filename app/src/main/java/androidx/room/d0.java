package androidx.room;

import androidx.room.k0;
import java.util.concurrent.Executor;

/* compiled from: QueryInterceptorOpenHelper.kt */
/* loaded from: classes.dex */
public final class d0 implements z0.h, g {

    /* renamed from: a  reason: collision with root package name */
    private final z0.h f3883a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3884b;

    /* renamed from: c  reason: collision with root package name */
    private final k0.g f3885c;

    public d0(z0.h hVar, Executor executor, k0.g gVar) {
        qe.k.f(hVar, "delegate");
        qe.k.f(executor, "queryCallbackExecutor");
        qe.k.f(gVar, "queryCallback");
        this.f3883a = hVar;
        this.f3884b = executor;
        this.f3885c = gVar;
    }

    @Override // z0.h
    public z0.g F0() {
        return new c0(a().F0(), this.f3884b, this.f3885c);
    }

    @Override // androidx.room.g
    public z0.h a() {
        return this.f3883a;
    }

    @Override // z0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3883a.close();
    }

    @Override // z0.h
    public String getDatabaseName() {
        return this.f3883a.getDatabaseName();
    }

    @Override // z0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f3883a.setWriteAheadLoggingEnabled(z10);
    }
}
