package w7;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes2.dex */
class m implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f38299a;

    /* compiled from: SafeLoggingExecutor.java */
    /* loaded from: classes2.dex */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f38300a;

        a(Runnable runnable) {
            this.f38300a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38300a.run();
            } catch (Exception e10) {
                b8.a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Executor executor) {
        this.f38299a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f38299a.execute(new a(runnable));
    }
}
