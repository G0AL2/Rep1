package com.google.common.util.concurrent;

import ib.p;
import ib.r;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
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
import sun.misc.Unsafe;

/* compiled from: AbstractFuture.java */
/* loaded from: classes3.dex */
public abstract class a<V> extends nb.a implements com.google.common.util.concurrent.c<V> {

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f23130d;

    /* renamed from: e  reason: collision with root package name */
    private static final Logger f23131e;

    /* renamed from: f  reason: collision with root package name */
    private static final b f23132f;

    /* renamed from: g  reason: collision with root package name */
    private static final Object f23133g;

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f23134a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f23135b;

    /* renamed from: c  reason: collision with root package name */
    private volatile l f23136c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    public static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, l lVar, l lVar2);

        abstract void d(l lVar, l lVar2);

        abstract void e(l lVar, Thread thread);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f23137c;

        /* renamed from: d  reason: collision with root package name */
        static final c f23138d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f23139a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f23140b;

        static {
            if (a.f23130d) {
                f23138d = null;
                f23137c = null;
                return;
            }
            f23138d = new c(false, null);
            f23137c = new c(true, null);
        }

        c(boolean z10, Throwable th) {
            this.f23139a = z10;
            this.f23140b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        final Throwable f23141a;

        /* compiled from: AbstractFuture.java */
        /* renamed from: com.google.common.util.concurrent.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0304a extends Throwable {
            C0304a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new d(new C0304a("Failure occurred while trying to finish a future."));
        }

        d(Throwable th) {
            this.f23141a = (Throwable) ib.l.j(th);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, Thread> f23146a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<l, l> f23147b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, l> f23148c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f23149d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f23150e;

        f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f23146a = atomicReferenceFieldUpdater;
            this.f23147b = atomicReferenceFieldUpdater2;
            this.f23148c = atomicReferenceFieldUpdater3;
            this.f23149d = atomicReferenceFieldUpdater4;
            this.f23150e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return this.f23149d.compareAndSet(aVar, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return this.f23150e.compareAndSet(aVar, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return this.f23148c.compareAndSet(aVar, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void d(l lVar, l lVar2) {
            this.f23147b.lazySet(lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void e(l lVar, Thread thread) {
            this.f23146a.lazySet(lVar, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final a<V> f23151a;

        /* renamed from: b  reason: collision with root package name */
        final com.google.common.util.concurrent.c<? extends V> f23152b;

        @Override // java.lang.Runnable
        public void run() {
            if (((a) this.f23151a).f23134a != this) {
                return;
            }
            if (a.f23132f.b(this.f23151a, this, a.w(this.f23152b))) {
                a.t(this.f23151a);
            }
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    private static final class h extends b {
        private h() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (((a) aVar).f23135b == eVar) {
                    ((a) aVar).f23135b = eVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (((a) aVar).f23134a == obj) {
                    ((a) aVar).f23134a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            synchronized (aVar) {
                if (((a) aVar).f23136c == lVar) {
                    ((a) aVar).f23136c = lVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.common.util.concurrent.a.b
        void d(l lVar, l lVar2) {
            lVar.f23161b = lVar2;
        }

        @Override // com.google.common.util.concurrent.a.b
        void e(l lVar, Thread thread) {
            lVar.f23160a = thread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    public interface i<V> extends com.google.common.util.concurrent.c<V> {
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    static abstract class j<V> extends a<V> implements i<V> {
        @Override // com.google.common.util.concurrent.a, com.google.common.util.concurrent.c
        public final void a(Runnable runnable, Executor executor) {
            super.a(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get() throws InterruptedException, ExecutionException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (V) super.get(j10, timeUnit);
        }
    }

    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    private static final class k extends b {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f23153a;

        /* renamed from: b  reason: collision with root package name */
        static final long f23154b;

        /* renamed from: c  reason: collision with root package name */
        static final long f23155c;

        /* renamed from: d  reason: collision with root package name */
        static final long f23156d;

        /* renamed from: e  reason: collision with root package name */
        static final long f23157e;

        /* renamed from: f  reason: collision with root package name */
        static final long f23158f;

        /* compiled from: AbstractFuture.java */
        /* renamed from: com.google.common.util.concurrent.a$k$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0305a implements PrivilegedExceptionAction<Unsafe> {
            C0305a() {
            }

            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a */
            public Unsafe run() throws Exception {
                Field[] declaredFields;
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new C0305a());
                }
                try {
                    f23155c = unsafe.objectFieldOffset(a.class.getDeclaredField(l6.c.f33710i));
                    f23154b = unsafe.objectFieldOffset(a.class.getDeclaredField("b"));
                    f23156d = unsafe.objectFieldOffset(a.class.getDeclaredField("a"));
                    f23157e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                    f23158f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    f23153a = unsafe;
                } catch (Exception e10) {
                    r.e(e10);
                    throw new RuntimeException(e10);
                }
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }

        private k() {
            super();
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return f23153a.compareAndSwapObject(aVar, f23154b, eVar, eVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return f23153a.compareAndSwapObject(aVar, f23156d, obj, obj2);
        }

        @Override // com.google.common.util.concurrent.a.b
        boolean c(a<?> aVar, l lVar, l lVar2) {
            return f23153a.compareAndSwapObject(aVar, f23155c, lVar, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void d(l lVar, l lVar2) {
            f23153a.putObject(lVar, f23158f, lVar2);
        }

        @Override // com.google.common.util.concurrent.a.b
        void e(l lVar, Thread thread) {
            f23153a.putObject(lVar, f23157e, thread);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    public static final class l {

        /* renamed from: c  reason: collision with root package name */
        static final l f23159c = new l(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f23160a;

        /* renamed from: b  reason: collision with root package name */
        volatile l f23161b;

        l(boolean z10) {
        }

        void a(l lVar) {
            a.f23132f.d(this, lVar);
        }

        void b() {
            Thread thread = this.f23160a;
            if (thread != null) {
                this.f23160a = null;
                LockSupport.unpark(thread);
            }
        }

        l() {
            a.f23132f.e(this, Thread.currentThread());
        }
    }

    static {
        boolean z10;
        b hVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f23130d = z10;
        f23131e = Logger.getLogger(a.class.getName());
        Throwable th = null;
        try {
            hVar = new k();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, l.class, l6.c.f33710i), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
            } catch (Throwable th3) {
                hVar = new h();
                th = th3;
            }
        }
        f23132f = hVar;
        if (th != null) {
            Logger logger = f23131e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!", th);
            logger.log(level, "SafeAtomicHelper is broken!", th);
        }
        f23133g = new Object();
    }

    protected a() {
    }

    private void A() {
        l lVar;
        do {
            lVar = this.f23136c;
        } while (!f23132f.c(this, lVar, l.f23159c));
        while (lVar != null) {
            lVar.b();
            lVar = lVar.f23161b;
        }
    }

    private void B(l lVar) {
        lVar.f23160a = null;
        while (true) {
            l lVar2 = this.f23136c;
            if (lVar2 == l.f23159c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f23161b;
                if (lVar2.f23160a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f23161b = lVar4;
                    if (lVar3.f23160a == null) {
                        break;
                    }
                } else if (!f23132f.c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    private void m(StringBuilder sb2) {
        try {
            Object x10 = x(this);
            sb2.append("SUCCESS, result=[");
            p(sb2, x10);
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

    private void n(StringBuilder sb2) {
        String sb3;
        int length = sb2.length();
        sb2.append("PENDING");
        Object obj = this.f23134a;
        if (obj instanceof g) {
            sb2.append(", setFuture=[");
            q(sb2, ((g) obj).f23152b);
            sb2.append("]");
        } else {
            try {
                sb3 = p.a(z());
            } catch (RuntimeException | StackOverflowError e10) {
                String valueOf = String.valueOf(e10.getClass());
                StringBuilder sb4 = new StringBuilder(valueOf.length() + 38);
                sb4.append("Exception thrown from implementation: ");
                sb4.append(valueOf);
                sb3 = sb4.toString();
            }
            if (sb3 != null) {
                sb2.append(", info=[");
                sb2.append(sb3);
                sb2.append("]");
            }
        }
        if (isDone()) {
            sb2.delete(length, sb2.length());
            m(sb2);
        }
    }

    private void p(StringBuilder sb2, Object obj) {
        if (obj == null) {
            sb2.append("null");
        } else if (obj == this) {
            sb2.append("this future");
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void q(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    private static CancellationException r(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e s(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f23135b;
        } while (!f23132f.a(this, eVar2, e.f23142d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f23145c;
            eVar4.f23145c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.util.concurrent.a$b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.common.util.concurrent.a<?>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.common.util.concurrent.a] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.common.util.concurrent.a, com.google.common.util.concurrent.a<V>] */
    public static void t(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.A();
            aVar.o();
            e s10 = aVar.s(eVar);
            while (s10 != null) {
                eVar = s10.f23145c;
                Runnable runnable = s10.f23143a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    aVar = gVar.f23151a;
                    if (((a) aVar).f23134a == gVar) {
                        if (f23132f.b(aVar, gVar, w(gVar.f23152b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = s10.f23144b;
                    Objects.requireNonNull(executor);
                    u(runnable2, executor);
                }
                s10 = eVar;
            }
            return;
        }
    }

    private static void u(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f23131e;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.log(level, sb2.toString(), (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V v(Object obj) throws ExecutionException {
        if (!(obj instanceof c)) {
            if (obj instanceof d) {
                throw new ExecutionException(((d) obj).f23141a);
            }
            return obj == f23133g ? (V) com.google.common.util.concurrent.d.a() : obj;
        }
        throw r("Task was cancelled.", ((c) obj).f23140b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object w(com.google.common.util.concurrent.c<?> cVar) {
        Throwable a10;
        if (cVar instanceof i) {
            Object obj = ((a) cVar).f23134a;
            if (obj instanceof c) {
                c cVar2 = (c) obj;
                if (cVar2.f23139a) {
                    obj = cVar2.f23140b != null ? new c(false, cVar2.f23140b) : c.f23138d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((cVar instanceof nb.a) && (a10 = nb.b.a((nb.a) cVar)) != null) {
            return new d(a10);
        } else {
            boolean isCancelled = cVar.isCancelled();
            if ((!f23130d) & isCancelled) {
                c cVar3 = c.f23138d;
                Objects.requireNonNull(cVar3);
                return cVar3;
            }
            try {
                Object x10 = x(cVar);
                if (!isCancelled) {
                    return x10 == null ? f23133g : x10;
                }
                String valueOf = String.valueOf(cVar);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf);
                return new c(false, new IllegalArgumentException(sb2.toString()));
            } catch (CancellationException e10) {
                if (!isCancelled) {
                    String valueOf2 = String.valueOf(cVar);
                    StringBuilder sb3 = new StringBuilder(valueOf2.length() + 77);
                    sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb3.append(valueOf2);
                    return new d(new IllegalArgumentException(sb3.toString(), e10));
                }
                return new c(false, e10);
            } catch (ExecutionException e11) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(cVar);
                    StringBuilder sb4 = new StringBuilder(valueOf3.length() + 84);
                    sb4.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb4.append(valueOf3);
                    return new c(false, new IllegalArgumentException(sb4.toString(), e11));
                }
                return new d(e11.getCause());
            } catch (Throwable th) {
                return new d(th);
            }
        }
    }

    private static <V> V x(Future<V> future) throws ExecutionException {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean C(V v10) {
        if (v10 == null) {
            v10 = (V) f23133g;
        }
        if (f23132f.b(this, null, v10)) {
            t(this);
            return true;
        }
        return false;
    }

    @Override // com.google.common.util.concurrent.c
    public void a(Runnable runnable, Executor executor) {
        e eVar;
        ib.l.k(runnable, "Runnable was null.");
        ib.l.k(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f23135b) != e.f23142d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f23145c = eVar;
                if (f23132f.a(this, eVar, eVar2)) {
                    return;
                }
                eVar = this.f23135b;
            } while (eVar != e.f23142d);
            u(runnable, executor);
        }
        u(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nb.a
    public final Throwable b() {
        if (this instanceof i) {
            Object obj = this.f23134a;
            if (obj instanceof d) {
                return ((d) obj).f23141a;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f23134a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f23130d) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            if (z10) {
                cVar = c.f23137c;
            } else {
                cVar = c.f23138d;
            }
            Objects.requireNonNull(cVar);
        }
        boolean z11 = false;
        a<V> aVar = this;
        while (true) {
            if (f23132f.b(aVar, obj, cVar)) {
                if (z10) {
                    aVar.y();
                }
                t(aVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                com.google.common.util.concurrent.c<? extends V> cVar2 = ((g) obj).f23152b;
                if (cVar2 instanceof i) {
                    aVar = (a) cVar2;
                    obj = aVar.f23134a;
                    if (!(obj == null) && !(obj instanceof g)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    cVar2.cancel(z10);
                    return true;
                }
            } else {
                obj = aVar.f23134a;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j10);
        if (!Thread.interrupted()) {
            Object obj = this.f23134a;
            if ((obj != null) & (!(obj instanceof g))) {
                return v(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                l lVar = this.f23136c;
                if (lVar != l.f23159c) {
                    l lVar2 = new l();
                    do {
                        lVar2.a(lVar);
                        if (f23132f.c(this, lVar, lVar2)) {
                            do {
                                com.google.common.util.concurrent.e.a(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f23134a;
                                    if ((obj2 != null) & (!(obj2 instanceof g))) {
                                        return v(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    B(lVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            B(lVar2);
                        } else {
                            lVar = this.f23136c;
                        }
                    } while (lVar != l.f23159c);
                    Object obj3 = this.f23134a;
                    Objects.requireNonNull(obj3);
                    return v(obj3);
                }
                Object obj32 = this.f23134a;
                Objects.requireNonNull(obj32);
                return v(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.f23134a;
                if ((obj4 != null) & (!(obj4 instanceof g))) {
                    return v(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb2.append("Waited ");
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(lowerCase2);
            String sb3 = sb2.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb3).concat(" (plus ");
                long j11 = -nanos;
                long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
                long nanos2 = j11 - timeUnit.toNanos(convert);
                int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z10 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                    sb4.append(valueOf);
                    sb4.append(convert);
                    sb4.append(" ");
                    sb4.append(lowerCase);
                    String sb5 = sb4.toString();
                    if (z10) {
                        sb5 = String.valueOf(sb5).concat(",");
                    }
                    concat = String.valueOf(sb5).concat(" ");
                }
                if (z10) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb6 = new StringBuilder(valueOf2.length() + 33);
                    sb6.append(valueOf2);
                    sb6.append(nanos2);
                    sb6.append(" nanoseconds ");
                    concat = sb6.toString();
                }
                sb3 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb3).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb7 = new StringBuilder(String.valueOf(sb3).length() + 5 + String.valueOf(aVar).length());
            sb7.append(sb3);
            sb7.append(" for ");
            sb7.append(aVar);
            throw new TimeoutException(sb7.toString());
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f23134a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f23134a;
        return (!(obj instanceof g)) & (obj != null);
    }

    protected void o() {
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb2.append(getClass().getSimpleName());
        } else {
            sb2.append(getClass().getName());
        }
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m(sb2);
        } else {
            n(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected void y() {
    }

    protected String z() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("remaining delay=[");
            sb2.append(delay);
            sb2.append(" ms]");
            return sb2.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractFuture.java */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f23142d = new e();

        /* renamed from: a  reason: collision with root package name */
        final Runnable f23143a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f23144b;

        /* renamed from: c  reason: collision with root package name */
        e f23145c;

        e(Runnable runnable, Executor executor) {
            this.f23143a = runnable;
            this.f23144b = executor;
        }

        e() {
            this.f23143a = null;
            this.f23144b = null;
        }
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f23134a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return v(obj2);
            }
            l lVar = this.f23136c;
            if (lVar != l.f23159c) {
                l lVar2 = new l();
                do {
                    lVar2.a(lVar);
                    if (f23132f.c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f23134a;
                            } else {
                                B(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return v(obj);
                    }
                    lVar = this.f23136c;
                } while (lVar != l.f23159c);
                Object obj3 = this.f23134a;
                Objects.requireNonNull(obj3);
                return v(obj3);
            }
            Object obj32 = this.f23134a;
            Objects.requireNonNull(obj32);
            return v(obj32);
        }
        throw new InterruptedException();
    }
}
