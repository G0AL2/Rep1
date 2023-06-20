package p1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;

/* compiled from: WorkForegroundRunnable.java */
/* loaded from: classes.dex */
public class x implements Runnable {

    /* renamed from: g */
    static final String f35477g = androidx.work.l.i("WorkForegroundRunnable");

    /* renamed from: a */
    final androidx.work.impl.utils.futures.c<Void> f35478a = androidx.work.impl.utils.futures.c.t();

    /* renamed from: b */
    final Context f35479b;

    /* renamed from: c */
    final o1.u f35480c;

    /* renamed from: d */
    final androidx.work.k f35481d;

    /* renamed from: e */
    final androidx.work.h f35482e;

    /* renamed from: f */
    final q1.c f35483f;

    /* compiled from: WorkForegroundRunnable.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ androidx.work.impl.utils.futures.c f35484a;

        a(androidx.work.impl.utils.futures.c cVar) {
            x.this = r1;
            this.f35484a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x.this.f35478a.isCancelled()) {
                return;
            }
            try {
                androidx.work.g gVar = (androidx.work.g) this.f35484a.get();
                if (gVar != null) {
                    androidx.work.l e10 = androidx.work.l.e();
                    String str = x.f35477g;
                    e10.a(str, "Updating notification for " + x.this.f35480c.f34907c);
                    x xVar = x.this;
                    xVar.f35478a.r(xVar.f35482e.a(xVar.f35479b, xVar.f35481d.getId(), gVar));
                    return;
                }
                throw new IllegalStateException("Worker was marked important (" + x.this.f35480c.f34907c + ") but did not provide ForegroundInfo");
            } catch (Throwable th) {
                x.this.f35478a.q(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public x(Context context, o1.u uVar, androidx.work.k kVar, androidx.work.h hVar, q1.c cVar) {
        this.f35479b = context;
        this.f35480c = uVar;
        this.f35481d = kVar;
        this.f35482e = hVar;
        this.f35483f = cVar;
    }

    public static /* synthetic */ void a(x xVar, androidx.work.impl.utils.futures.c cVar) {
        xVar.c(cVar);
    }

    public /* synthetic */ void c(androidx.work.impl.utils.futures.c cVar) {
        if (!this.f35478a.isCancelled()) {
            cVar.r(this.f35481d.getForegroundInfoAsync());
        } else {
            cVar.cancel(true);
        }
    }

    public com.google.common.util.concurrent.c<Void> b() {
        return this.f35478a;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.f35480c.f34921q && Build.VERSION.SDK_INT < 31) {
            final androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
            this.f35483f.a().execute(new Runnable() { // from class: p1.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.a(x.this, t10);
                }
            });
            t10.a(new a(t10), this.f35483f.a());
            return;
        }
        this.f35478a.p(null);
    }
}
