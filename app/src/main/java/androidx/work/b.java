package androidx.work;

import android.os.Build;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final Executor f4404a;

    /* renamed from: b  reason: collision with root package name */
    final Executor f4405b;

    /* renamed from: c  reason: collision with root package name */
    final y f4406c;

    /* renamed from: d  reason: collision with root package name */
    final j f4407d;

    /* renamed from: e  reason: collision with root package name */
    final s f4408e;

    /* renamed from: f  reason: collision with root package name */
    final h0.a<Throwable> f4409f;

    /* renamed from: g  reason: collision with root package name */
    final h0.a<Throwable> f4410g;

    /* renamed from: h  reason: collision with root package name */
    final String f4411h;

    /* renamed from: i  reason: collision with root package name */
    final int f4412i;

    /* renamed from: j  reason: collision with root package name */
    final int f4413j;

    /* renamed from: k  reason: collision with root package name */
    final int f4414k;

    /* renamed from: l  reason: collision with root package name */
    final int f4415l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f4416a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4417b;

        a(b bVar, boolean z10) {
            this.f4417b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = this.f4417b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f4416a.incrementAndGet());
        }
    }

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0081b {

        /* renamed from: a  reason: collision with root package name */
        Executor f4418a;

        /* renamed from: b  reason: collision with root package name */
        y f4419b;

        /* renamed from: c  reason: collision with root package name */
        j f4420c;

        /* renamed from: d  reason: collision with root package name */
        Executor f4421d;

        /* renamed from: e  reason: collision with root package name */
        s f4422e;

        /* renamed from: f  reason: collision with root package name */
        h0.a<Throwable> f4423f;

        /* renamed from: g  reason: collision with root package name */
        h0.a<Throwable> f4424g;

        /* renamed from: h  reason: collision with root package name */
        String f4425h;

        /* renamed from: i  reason: collision with root package name */
        int f4426i = 4;

        /* renamed from: j  reason: collision with root package name */
        int f4427j = 0;

        /* renamed from: k  reason: collision with root package name */
        int f4428k = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* renamed from: l  reason: collision with root package name */
        int f4429l = 20;

        public b a() {
            return new b(this);
        }

        public C0081b b(Executor executor) {
            this.f4418a = executor;
            return this;
        }
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public interface c {
        b getWorkManagerConfiguration();
    }

    b(C0081b c0081b) {
        Executor executor = c0081b.f4418a;
        if (executor == null) {
            this.f4404a = a(false);
        } else {
            this.f4404a = executor;
        }
        Executor executor2 = c0081b.f4421d;
        if (executor2 == null) {
            this.f4405b = a(true);
        } else {
            this.f4405b = executor2;
        }
        y yVar = c0081b.f4419b;
        if (yVar == null) {
            this.f4406c = y.c();
        } else {
            this.f4406c = yVar;
        }
        j jVar = c0081b.f4420c;
        if (jVar == null) {
            this.f4407d = j.c();
        } else {
            this.f4407d = jVar;
        }
        s sVar = c0081b.f4422e;
        if (sVar == null) {
            this.f4408e = new androidx.work.impl.d();
        } else {
            this.f4408e = sVar;
        }
        this.f4412i = c0081b.f4426i;
        this.f4413j = c0081b.f4427j;
        this.f4414k = c0081b.f4428k;
        this.f4415l = c0081b.f4429l;
        this.f4409f = c0081b.f4423f;
        this.f4410g = c0081b.f4424g;
        this.f4411h = c0081b.f4425h;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new a(this, z10);
    }

    public String c() {
        return this.f4411h;
    }

    public Executor d() {
        return this.f4404a;
    }

    public h0.a<Throwable> e() {
        return this.f4409f;
    }

    public j f() {
        return this.f4407d;
    }

    public int g() {
        return this.f4414k;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f4415l / 2;
        }
        return this.f4415l;
    }

    public int i() {
        return this.f4413j;
    }

    public int j() {
        return this.f4412i;
    }

    public s k() {
        return this.f4408e;
    }

    public h0.a<Throwable> l() {
        return this.f4410g;
    }

    public Executor m() {
        return this.f4405b;
    }

    public y n() {
        return this.f4406c;
    }
}
