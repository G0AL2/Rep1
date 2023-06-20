package za;

import cb.g0;
import cb.r;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class d implements g0<Executor> {
    public static Executor b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(b.f40483a);
        r.g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    @Override // cb.g0
    public final /* bridge */ /* synthetic */ Executor a() {
        return b();
    }
}
