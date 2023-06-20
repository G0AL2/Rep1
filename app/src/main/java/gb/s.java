package gb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class s implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f30807a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f30807a.post(runnable);
    }
}
