package s1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: Task.java */
/* loaded from: classes.dex */
public class f<TResult> {

    /* renamed from: l  reason: collision with root package name */
    private static volatile d f36690l;

    /* renamed from: b  reason: collision with root package name */
    private boolean f36695b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36696c;

    /* renamed from: d  reason: collision with root package name */
    private TResult f36697d;

    /* renamed from: e  reason: collision with root package name */
    private Exception f36698e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36699f;

    /* renamed from: g  reason: collision with root package name */
    private h f36700g;

    /* renamed from: i  reason: collision with root package name */
    public static final ExecutorService f36687i = s1.b.a();

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f36688j = s1.b.b();

    /* renamed from: k  reason: collision with root package name */
    public static final Executor f36689k = s1.a.c();

    /* renamed from: m  reason: collision with root package name */
    private static f<?> f36691m = new f<>((Object) null);

    /* renamed from: n  reason: collision with root package name */
    private static f<Boolean> f36692n = new f<>(Boolean.TRUE);

    /* renamed from: o  reason: collision with root package name */
    private static f<Boolean> f36693o = new f<>(Boolean.FALSE);

    /* renamed from: a  reason: collision with root package name */
    private final Object f36694a = new Object();

    /* renamed from: h  reason: collision with root package name */
    private List<s1.d<TResult, Void>> f36701h = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public class a implements s1.d<TResult, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f36702a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s1.d f36703b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Executor f36704c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ s1.c f36705d;

        a(f fVar, g gVar, s1.d dVar, Executor executor, s1.c cVar) {
            this.f36702a = gVar;
            this.f36703b = dVar;
            this.f36704c = executor;
        }

        @Override // s1.d
        /* renamed from: b */
        public Void a(f<TResult> fVar) {
            f.d(this.f36702a, this.f36703b, fVar, this.f36704c, this.f36705d);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f36706a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s1.d f36707b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f36708c;

        b(s1.c cVar, g gVar, s1.d dVar, f fVar) {
            this.f36706a = gVar;
            this.f36707b = dVar;
            this.f36708c = fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f36706a.d(this.f36707b.a(this.f36708c));
            } catch (CancellationException unused) {
                this.f36706a.b();
            } catch (Exception e10) {
                this.f36706a.c(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f36709a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callable f36710b;

        c(s1.c cVar, g gVar, Callable callable) {
            this.f36709a = gVar;
            this.f36710b = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f36709a.d(this.f36710b.call());
            } catch (CancellationException unused) {
                this.f36709a.b();
            } catch (Exception e10) {
                this.f36709a.c(e10);
            }
        }
    }

    /* compiled from: Task.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(f<?> fVar, i iVar);
    }

    static {
        new f(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
    }

    public static <TResult> f<TResult> b(Callable<TResult> callable, Executor executor) {
        return c(callable, executor, null);
    }

    public static <TResult> f<TResult> c(Callable<TResult> callable, Executor executor, s1.c cVar) {
        g gVar = new g();
        try {
            executor.execute(new c(cVar, gVar, callable));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
        return gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void d(g<TContinuationResult> gVar, s1.d<TResult, TContinuationResult> dVar, f<TResult> fVar, Executor executor, s1.c cVar) {
        try {
            executor.execute(new b(cVar, gVar, dVar, fVar));
        } catch (Exception e10) {
            gVar.c(new e(e10));
        }
    }

    public static <TResult> f<TResult> g(Exception exc) {
        g gVar = new g();
        gVar.c(exc);
        return gVar.a();
    }

    public static <TResult> f<TResult> h(TResult tresult) {
        if (tresult == null) {
            return (f<TResult>) f36691m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (f<TResult>) f36692n : (f<TResult>) f36693o;
        }
        g gVar = new g();
        gVar.d(tresult);
        return gVar.a();
    }

    public static d k() {
        return f36690l;
    }

    private void o() {
        synchronized (this.f36694a) {
            for (s1.d<TResult, Void> dVar : this.f36701h) {
                try {
                    dVar.a(this);
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception e11) {
                    throw new RuntimeException(e11);
                }
            }
            this.f36701h = null;
        }
    }

    public <TContinuationResult> f<TContinuationResult> e(s1.d<TResult, TContinuationResult> dVar) {
        return f(dVar, f36688j, null);
    }

    public <TContinuationResult> f<TContinuationResult> f(s1.d<TResult, TContinuationResult> dVar, Executor executor, s1.c cVar) {
        boolean m10;
        g gVar = new g();
        synchronized (this.f36694a) {
            m10 = m();
            if (!m10) {
                this.f36701h.add(new a(this, gVar, dVar, executor, cVar));
            }
        }
        if (m10) {
            d(gVar, dVar, this, executor, cVar);
        }
        return gVar.a();
    }

    public Exception i() {
        Exception exc;
        synchronized (this.f36694a) {
            if (this.f36698e != null) {
                this.f36699f = true;
                h hVar = this.f36700g;
                if (hVar != null) {
                    hVar.a();
                    this.f36700g = null;
                }
            }
            exc = this.f36698e;
        }
        return exc;
    }

    public TResult j() {
        TResult tresult;
        synchronized (this.f36694a) {
            tresult = this.f36697d;
        }
        return tresult;
    }

    public boolean l() {
        boolean z10;
        synchronized (this.f36694a) {
            z10 = this.f36696c;
        }
        return z10;
    }

    public boolean m() {
        boolean z10;
        synchronized (this.f36694a) {
            z10 = this.f36695b;
        }
        return z10;
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f36694a) {
            z10 = i() != null;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        synchronized (this.f36694a) {
            if (this.f36695b) {
                return false;
            }
            this.f36695b = true;
            this.f36696c = true;
            this.f36694a.notifyAll();
            o();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q(Exception exc) {
        synchronized (this.f36694a) {
            if (this.f36695b) {
                return false;
            }
            this.f36695b = true;
            this.f36698e = exc;
            this.f36699f = false;
            this.f36694a.notifyAll();
            o();
            if (!this.f36699f && k() != null) {
                this.f36700g = new h(this);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(TResult tresult) {
        synchronized (this.f36694a) {
            if (this.f36695b) {
                return false;
            }
            this.f36695b = true;
            this.f36697d = tresult;
            this.f36694a.notifyAll();
            o();
            return true;
        }
    }

    private f(TResult tresult) {
        r(tresult);
    }

    private f(boolean z10) {
        if (z10) {
            p();
        } else {
            r(null);
        }
    }
}
