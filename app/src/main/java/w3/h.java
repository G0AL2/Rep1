package w3;

import android.os.Handler;
import android.os.Looper;

/* compiled from: UiThreadImmediateExecutorService.java */
/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: b  reason: collision with root package name */
    private static h f38192b;

    private h() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static h g() {
        if (f38192b == null) {
            f38192b = new h();
        }
        return f38192b;
    }

    @Override // w3.d, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
