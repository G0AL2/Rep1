package s1;

import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: BoltsExecutors.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: c  reason: collision with root package name */
    private static final b f36683c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f36684a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f36685b;

    /* compiled from: BoltsExecutors.java */
    /* renamed from: s1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class ExecutorC0494b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private ThreadLocal<Integer> f36686a;

        private ExecutorC0494b() {
            this.f36686a = new ThreadLocal<>();
        }

        private int a() {
            Integer num = this.f36686a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f36686a.remove();
            } else {
                this.f36686a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        private int b() {
            Integer num = this.f36686a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f36686a.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    b.a().execute(runnable);
                }
            } finally {
                a();
            }
        }
    }

    private b() {
        this.f36684a = !c() ? Executors.newCachedThreadPool() : s1.a.b();
        Executors.newSingleThreadScheduledExecutor();
        this.f36685b = new ExecutorC0494b();
    }

    public static ExecutorService a() {
        return f36683c.f36684a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor b() {
        return f36683c.f36685b;
    }

    private static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
    }
}
