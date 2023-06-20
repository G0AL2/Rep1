package za;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
final /* synthetic */ class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadFactory f40483a = new b();

    private b() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
