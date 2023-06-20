package c4;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.io.IOException;
import y3.k;

/* compiled from: CloseableReference.java */
/* loaded from: classes.dex */
public abstract class a<T> implements Cloneable, Closeable {

    /* renamed from: e  reason: collision with root package name */
    private static Class<a> f5308e = a.class;

    /* renamed from: f  reason: collision with root package name */
    private static int f5309f = 0;

    /* renamed from: g  reason: collision with root package name */
    private static final h<Closeable> f5310g = new C0098a();

    /* renamed from: h  reason: collision with root package name */
    private static final c f5311h = new b();

    /* renamed from: a  reason: collision with root package name */
    protected boolean f5312a = false;

    /* renamed from: b  reason: collision with root package name */
    protected final i<T> f5313b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f5314c;

    /* renamed from: d  reason: collision with root package name */
    protected final Throwable f5315d;

    /* compiled from: CloseableReference.java */
    /* renamed from: c4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0098a implements h<Closeable> {
        C0098a() {
        }

        @Override // c4.h
        /* renamed from: b */
        public void a(Closeable closeable) {
            try {
                y3.b.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: CloseableReference.java */
    /* loaded from: classes.dex */
    static class b implements c {
        b() {
        }

        @Override // c4.a.c
        public void a(i<Object> iVar, Throwable th) {
            Object f10 = iVar.f();
            Class cls = a.f5308e;
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = Integer.valueOf(System.identityHashCode(iVar));
            objArr[2] = f10 == null ? null : f10.getClass().getName();
            z3.a.E(cls, "Finalized without closing: %x %x (type = %s)", objArr);
        }

        @Override // c4.a.c
        public boolean b() {
            return false;
        }
    }

    /* compiled from: CloseableReference.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(i<Object> iVar, Throwable th);

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(i<T> iVar, c cVar, Throwable th) {
        this.f5313b = (i) k.g(iVar);
        iVar.b();
        this.f5314c = cVar;
        this.f5315d = th;
    }

    public static boolean C(a<?> aVar) {
        return aVar != null && aVar.A();
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;)Lc4/a<TT;>; */
    public static a L(Closeable closeable) {
        return T(closeable, f5310g);
    }

    /* JADX WARN: Incorrect types in method signature: <T::Ljava/io/Closeable;>(TT;Lc4/a$c;)Lc4/a<TT;>; */
    public static a O(Closeable closeable, c cVar) {
        if (closeable == null) {
            return null;
        }
        return Z(closeable, f5310g, cVar, cVar.b() ? new Throwable() : null);
    }

    public static <T> a<T> T(T t10, h<T> hVar) {
        return U(t10, hVar, f5311h);
    }

    public static <T> a<T> U(T t10, h<T> hVar, c cVar) {
        if (t10 == null) {
            return null;
        }
        return Z(t10, hVar, cVar, cVar.b() ? new Throwable() : null);
    }

    public static <T> a<T> Z(T t10, h<T> hVar, c cVar, Throwable th) {
        if (t10 == null) {
            return null;
        }
        if ((t10 instanceof Bitmap) || (t10 instanceof d)) {
            int i10 = f5309f;
            if (i10 == 1) {
                return new c4.c(t10, hVar, cVar, th);
            }
            if (i10 == 2) {
                return new g(t10, hVar, cVar, th);
            }
            if (i10 == 3) {
                return new e(t10, hVar, cVar, th);
            }
        }
        return new c4.b(t10, hVar, cVar, th);
    }

    public static void d0(int i10) {
        f5309f = i10;
    }

    public static boolean g0() {
        return f5309f == 3;
    }

    public static <T> a<T> q(a<T> aVar) {
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public static void w(a<?> aVar) {
        if (aVar != null) {
            aVar.close();
        }
    }

    public synchronized boolean A() {
        return !this.f5312a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.f5312a) {
                return;
            }
            this.f5312a = true;
            this.f5313b.d();
        }
    }

    @Override // 
    /* renamed from: d */
    public abstract a<T> clone();

    public synchronized a<T> e() {
        if (A()) {
            return clone();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (this.f5312a) {
                    return;
                }
                this.f5314c.a(this.f5313b, this.f5315d);
                close();
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized T y() {
        k.i(!this.f5312a);
        return (T) k.g(this.f5313b.f());
    }

    public int z() {
        if (A()) {
            return System.identityHashCode(this.f5313b.f());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(T t10, h<T> hVar, c cVar, Throwable th) {
        this.f5313b = new i<>(t10, hVar);
        this.f5314c = cVar;
        this.f5315d = th;
    }
}
