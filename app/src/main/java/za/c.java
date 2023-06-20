package za;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
final /* synthetic */ class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadFactory f40484a = new c();

    private c() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
