package w7;

import java.util.concurrent.Executor;

/* compiled from: ExecutionModule_ExecutorFactory.java */
/* loaded from: classes2.dex */
public final class k implements z7.b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final k f38297a = new k();
    }

    public static k a() {
        return a.f38297a;
    }

    public static Executor b() {
        return (Executor) z7.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
