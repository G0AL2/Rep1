package kotlinx.coroutines.internal;

import ee.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: ExceptionsConstuctor.kt */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final int f33499a = d(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantReadWriteLock f33500b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, pe.l<Throwable, Throwable>> f33501c = new WeakHashMap<>();

    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes3.dex */
    public static final class a extends qe.l implements pe.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f33502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f33502a = constructor;
        }

        @Override // pe.l
        /* renamed from: a */
        public final Throwable b(Throwable th) {
            Object a10;
            Object newInstance;
            qe.k.g(th, "e");
            try {
                n.a aVar = ee.n.f29807a;
                newInstance = this.f33502a.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                n.a aVar2 = ee.n.f29807a;
                a10 = ee.n.a(ee.o.a(th2));
            }
            if (newInstance != null) {
                a10 = ee.n.a((Throwable) newInstance);
                if (ee.n.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new ee.r("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes3.dex */
    public static final class b extends qe.l implements pe.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f33503a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f33503a = constructor;
        }

        @Override // pe.l
        /* renamed from: a */
        public final Throwable b(Throwable th) {
            Object a10;
            Object newInstance;
            qe.k.g(th, "e");
            try {
                n.a aVar = ee.n.f29807a;
                newInstance = this.f33503a.newInstance(th);
            } catch (Throwable th2) {
                n.a aVar2 = ee.n.f29807a;
                a10 = ee.n.a(ee.o.a(th2));
            }
            if (newInstance != null) {
                a10 = ee.n.a((Throwable) newInstance);
                if (ee.n.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new ee.r("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes3.dex */
    public static final class c extends qe.l implements pe.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f33504a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f33504a = constructor;
        }

        @Override // pe.l
        /* renamed from: a */
        public final Throwable b(Throwable th) {
            Object a10;
            Object newInstance;
            qe.k.g(th, "e");
            try {
                n.a aVar = ee.n.f29807a;
                newInstance = this.f33504a.newInstance(th.getMessage());
            } catch (Throwable th2) {
                n.a aVar2 = ee.n.f29807a;
                a10 = ee.n.a(ee.o.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                a10 = ee.n.a(th3);
                if (ee.n.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new ee.r("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes3.dex */
    public static final class d extends qe.l implements pe.l<Throwable, Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f33505a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f33505a = constructor;
        }

        @Override // pe.l
        /* renamed from: a */
        public final Throwable b(Throwable th) {
            Object a10;
            Object newInstance;
            qe.k.g(th, "e");
            try {
                n.a aVar = ee.n.f29807a;
                newInstance = this.f33505a.newInstance(new Object[0]);
            } catch (Throwable th2) {
                n.a aVar2 = ee.n.f29807a;
                a10 = ee.n.a(ee.o.a(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                a10 = ee.n.a(th3);
                if (ee.n.c(a10)) {
                    a10 = null;
                }
                return (Throwable) a10;
            }
            throw new ee.r("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class e<T> implements Comparator<T> {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            Constructor constructor = (Constructor) t11;
            qe.k.b(constructor, "it");
            Integer valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t10;
            qe.k.b(constructor2, "it");
            a10 = he.b.a(valueOf, Integer.valueOf(constructor2.getParameterTypes().length));
            return a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionsConstuctor.kt */
    /* renamed from: kotlinx.coroutines.internal.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0434f extends qe.l implements pe.l {

        /* renamed from: a  reason: collision with root package name */
        public static final C0434f f33506a = new C0434f();

        C0434f() {
            super(1);
        }

        @Override // pe.l
        /* renamed from: a */
        public final Void b(Throwable th) {
            qe.k.g(th, "it");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExceptionsConstuctor.kt */
    /* loaded from: classes3.dex */
    public static final class g extends qe.l implements pe.l {

        /* renamed from: a  reason: collision with root package name */
        public static final g f33507a = new g();

        g() {
            super(1);
        }

        @Override // pe.l
        /* renamed from: a */
        public final Void b(Throwable th) {
            qe.k.g(th, "it");
            return null;
        }
    }

    private static final pe.l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2 && qe.k.a(parameterTypes[0], String.class) && qe.k.a(parameterTypes[1], Throwable.class)) {
                    return new a(constructor);
                }
                return null;
            }
            Class<?> cls = parameterTypes[0];
            if (qe.k.a(cls, Throwable.class)) {
                return new b(constructor);
            }
            if (qe.k.a(cls, String.class)) {
                return new c(constructor);
            }
            return null;
        }
        return new d(constructor);
    }

    private static final int b(Class<?> cls, int i10) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            qe.k.b(declaredFields, "declaredFields");
            int i11 = 0;
            for (Field field : declaredFields) {
                qe.k.b(field, "it");
                if (!Modifier.isStatic(field.getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    static /* synthetic */ int c(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return b(cls, i10);
    }

    private static final int d(Class<?> cls, int i10) {
        Integer a10;
        oe.a.b(cls);
        try {
            n.a aVar = ee.n.f29807a;
            a10 = ee.n.a(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th) {
            n.a aVar2 = ee.n.f29807a;
            a10 = ee.n.a(ee.o.a(th));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (ee.n.c(a10)) {
            a10 = valueOf;
        }
        return ((Number) a10).intValue();
    }

    public static final <E extends Throwable> E e(E e10) {
        Object a10;
        List<Constructor> z10;
        ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        qe.k.g(e10, "exception");
        if (e10 instanceof we.x) {
            try {
                n.a aVar = ee.n.f29807a;
                a10 = ee.n.a(((we.x) e10).a());
            } catch (Throwable th) {
                n.a aVar2 = ee.n.f29807a;
                a10 = ee.n.a(ee.o.a(th));
            }
            return (E) (ee.n.c(a10) ? null : a10);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f33500b;
        ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
        readLock2.lock();
        try {
            pe.l<Throwable, Throwable> lVar = f33501c.get(e10.getClass());
            if (lVar != null) {
                return (E) lVar.b(e10);
            }
            int i10 = 0;
            if (f33499a != d(e10.getClass(), 0)) {
                readLock = reentrantReadWriteLock.readLock();
                readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i11 = 0; i11 < readHoldCount; i11++) {
                    readLock.unlock();
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f33501c.put(e10.getClass(), C0434f.f33506a);
                    ee.u uVar = ee.u.f29813a;
                    return null;
                } finally {
                    while (i10 < readHoldCount) {
                        readLock.lock();
                        i10++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = e10.getClass().getConstructors();
            qe.k.b(constructors, "exception.javaClass.constructors");
            z10 = fe.l.z(constructors, new e());
            pe.l<Throwable, Throwable> lVar2 = null;
            for (Constructor constructor : z10) {
                qe.k.b(constructor, "constructor");
                lVar2 = a(constructor);
                if (lVar2 != null) {
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f33500b;
            readLock = reentrantReadWriteLock2.readLock();
            readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i12 = 0; i12 < readHoldCount; i12++) {
                readLock.unlock();
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                f33501c.put(e10.getClass(), lVar2 != null ? lVar2 : g.f33507a);
                ee.u uVar2 = ee.u.f29813a;
                while (i10 < readHoldCount) {
                    readLock.lock();
                    i10++;
                }
                writeLock.unlock();
                if (lVar2 != null) {
                    return (E) lVar2.b(e10);
                }
                return null;
            } finally {
                while (i10 < readHoldCount) {
                    readLock.lock();
                    i10++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock2.unlock();
        }
    }
}
