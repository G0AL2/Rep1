package k;

import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f33111c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f33112d;

    /* renamed from: a  reason: collision with root package name */
    private c f33113a;

    /* renamed from: b  reason: collision with root package name */
    private c f33114b;

    /* compiled from: ArchTaskExecutor.java */
    /* renamed from: k.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class ExecutorC0422a implements Executor {
        ExecutorC0422a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().d(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor.java */
    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.f().a(runnable);
        }
    }

    static {
        new ExecutorC0422a();
        f33112d = new b();
    }

    private a() {
        k.b bVar = new k.b();
        this.f33114b = bVar;
        this.f33113a = bVar;
    }

    public static Executor e() {
        return f33112d;
    }

    public static a f() {
        if (f33111c != null) {
            return f33111c;
        }
        synchronized (a.class) {
            if (f33111c == null) {
                f33111c = new a();
            }
        }
        return f33111c;
    }

    @Override // k.c
    public void a(Runnable runnable) {
        this.f33113a.a(runnable);
    }

    @Override // k.c
    public boolean c() {
        return this.f33113a.c();
    }

    @Override // k.c
    public void d(Runnable runnable) {
        this.f33113a.d(runnable);
    }
}
