package androidx.work.impl.utils.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractFuture.java */
/* loaded from: classes.dex */
public abstract class a<V> implements com.google.common.util.concurrent.c<V> {

    /* renamed from: d  reason: collision with root package name */
    static final boolean f4663d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f4664e = Logger.getLogger(a.class.getName());

    /* renamed from: f  reason: collision with root package name */
    static final b f4665f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f4666g;

    /* renamed from: a  reason: collision with root package name */
    volatile Object f4667a;

    /* renamed from: b  reason: collision with root package name */
    volatile e f4668b;

    /* renamed from: c  reason: collision with root package name */
    volatile i f4669c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f4670c;

        /* renamed from: d  reason: collision with root package name */
        static final c f4671d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f4672a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f4673b;

        static {
            if (a.f4663d) {
                f4671d = null;
                f4670c = null;
                return;
            }
            f4671d = new c(false, null);
            f4670c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f4672a = z10;
            this.f4673b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f4674b = new d(new C0087a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f4675a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: androidx.work.impl.utils.futures.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0087a extends Throwable {
            C0087a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f4675a = (Throwable) a.e(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f4676d = new e(null, null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f4677a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f4678b;

        /* renamed from: c  reason: collision with root package name */
        e f4679c;

        e(Runnable runnable, Executor executor) {
            this.f4677a = runnable;
            this.f4678b = executor;
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f4680a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f4681b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f4682c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f4683d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f4684e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f4680a = atomicReferenceFieldUpdater;
            this.f4681b = atomicReferenceFieldUpdater2;
            this.f4682c = atomicReferenceFieldUpdater3;
            this.f4683d = atomicReferenceFieldUpdater4;
            this.f4684e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f4683d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f4684e.compareAndSet(aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return this.f4682c.compareAndSet(aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            this.f4681b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            this.f4680a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f4685a;

        /* renamed from: b  reason: collision with root package name */
        final com.google.common.util.concurrent.c<? extends V> f4686b;

        g(a<V> aVar, com.google.common.util.concurrent.c<? extends V> cVar) {
            this.f4685a = aVar;
            this.f4686b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4685a.f4667a != this) {
                return;
            }
            if (a.f4665f.b(this.f4685a, this, a.j(this.f4686b))) {
                a.g(this.f4685a);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f4668b == eVar) {
                    aVar.f4668b = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4667a == obj) {
                    aVar.f4667a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f4669c == iVar) {
                    aVar.f4669c = iVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(i iVar, i iVar2) {
            iVar.f4689b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(i iVar, Thread thread) {
            iVar.f4688a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f4687c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f4688a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f4689b;

        i(boolean z10) {
        }

        void a(i iVar) {
            a.f4665f.d(this, iVar);
        }

        void b() {
            Thread thread = this.f4688a;
            if (thread != null) {
                this.f4688a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.f4665f.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, l6.c.f33710i), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f4665f = hVar;
        if (th != null) {
            f4664e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4666g = new Object();
    }

    private void b(StringBuilder sb2) {
        try {
            Object k10 = k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(s(k10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    private static CancellationException d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private e f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f4668b;
        } while (!f4665f.a(this, eVar2, e.f4676d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f4679c;
            eVar4.f4679c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.work.impl.utils.futures.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.work.impl.utils.futures.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.work.impl.utils.futures.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.work.impl.utils.futures.a<V>, androidx.work.impl.utils.futures.a] */
    static void g(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.n();
            aVar.c();
            e f10 = aVar.f(eVar);
            while (f10 != null) {
                eVar = f10.f4679c;
                Runnable runnable = f10.f4677a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f4685a;
                    if (aVar.f4667a == gVar) {
                        if (f4665f.b(aVar, gVar, j(gVar.f4686b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, f10.f4678b);
                }
                f10 = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f4664e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V i(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (!(obj instanceof d)) {
                if (obj == f4666g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f4675a);
        }
        throw d("Task was cancelled.", ((c) obj).f4673b);
    }

    static Object j(com.google.common.util.concurrent.c<?> cVar) {
        if (cVar instanceof a) {
            Object obj = ((a) cVar).f4667a;
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                return cVar2.f4672a ? cVar2.f4673b != null ? new c(false, cVar2.f4673b) : c.f4671d : obj;
            }
            return obj;
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!f4663d) & isCancelled) {
            return c.f4671d;
        }
        try {
            Object k10 = k(cVar);
            return k10 == null ? f4666g : k10;
        } catch (CancellationException e10) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + cVar, e10));
            }
            return new c(false, e10);
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static <V> V k(Future<V> future) throws ExecutionException {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    private void n() {
        i iVar;
        do {
            iVar = this.f4669c;
        } while (!f4665f.c(this, iVar, i.f4687c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f4689b;
        }
    }

    private void o(i iVar) {
        iVar.f4688a = null;
        while (true) {
            i iVar2 = this.f4669c;
            if (iVar2 == i.f4687c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f4689b;
                if (iVar2.f4688a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f4689b = iVar4;
                    if (iVar3.f4688a == null) {
                        break;
                    }
                } else if (!f4665f.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.c
    public final void a(Runnable runnable, Executor executor) {
        e(runnable);
        e(executor);
        e eVar = this.f4668b;
        if (eVar != e.f4676d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f4679c = eVar;
                if (f4665f.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f4668b;
            } while (eVar != e.f4676d);
            h(runnable, executor);
        }
        h(runnable, executor);
    }

    protected void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f4667a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f4663d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else if (z10) {
            cVar = c.f4670c;
        } else {
            cVar = c.f4671d;
        }
        boolean z11 = false;
        a<V> aVar = this;
        while (true) {
            if (f4665f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.l();
                }
                g(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.c<? extends V> cVar2 = ((g) obj).f4686b;
                if (cVar2 instanceof a) {
                    aVar = (a) cVar2;
                    obj = aVar.f4667a;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    cVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = aVar.f4667a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f4667a;
            if ((obj != null) & (!(obj instanceof g))) {
                return i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                i iVar = this.f4669c;
                if (iVar != i.f4687c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f4665f.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4667a;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    o(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            o(iVar2);
                        } else {
                            iVar = this.f4669c;
                        }
                    } while (iVar != i.f4687c);
                    return i(this.f4667a);
                }
                return i(this.f4667a);
            }
            while (nanos > 0) {
                Object obj3 = this.f4667a;
                if ((obj3 != null) & (!(obj3 instanceof g))) {
                    return i(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z10) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z10) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4667a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f4667a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void l() {
    }

    protected String m() {
        Object obj = this.f4667a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f4686b) + "]";
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean p(V v10) {
        if (v10 == null) {
            v10 = (V) f4666g;
        }
        if (f4665f.b(this, null, v10)) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(Throwable th) {
        if (f4665f.b(this, null, new d((Throwable) e(th)))) {
            g(this);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r(com.google.common.util.concurrent.c<? extends V> cVar) {
        d dVar;
        e(cVar);
        Object obj = this.f4667a;
        if (obj == null) {
            if (cVar.isDone()) {
                if (f4665f.b(this, null, j(cVar))) {
                    g(this);
                    return true;
                }
                return false;
            }
            g gVar = new g(this, cVar);
            if (f4665f.b(this, null, gVar)) {
                try {
                    cVar.a(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f4674b;
                    }
                    f4665f.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f4667a;
        }
        if (obj instanceof c) {
            cVar.cancel(((c) obj).f4672a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            b(sb2);
        } else {
            try {
                str = m();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4667a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return i(obj2);
            }
            i iVar = this.f4669c;
            if (iVar != i.f4687c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f4665f.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4667a;
                            } else {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return i(obj);
                    }
                    iVar = this.f4669c;
                } while (iVar != i.f4687c);
                return i(this.f4667a);
            }
            return i(this.f4667a);
        }
        throw new InterruptedException();
    }
}
