package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ViewModelProvider.java */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f3378a;

    /* renamed from: b  reason: collision with root package name */
    private final g0 f3379b;

    /* compiled from: ViewModelProvider.java */
    /* loaded from: classes.dex */
    public static class a extends d {

        /* renamed from: c  reason: collision with root package name */
        private static a f3380c;

        /* renamed from: b  reason: collision with root package name */
        private Application f3381b;

        public a(Application application) {
            this.f3381b = application;
        }

        public static a c(Application application) {
            if (f3380c == null) {
                f3380c = new a(application);
            }
            return f3380c;
        }

        @Override // androidx.lifecycle.f0.d, androidx.lifecycle.f0.b
        public <T extends e0> T a(Class<T> cls) {
            if (androidx.lifecycle.a.class.isAssignableFrom(cls)) {
                try {
                    return cls.getConstructor(Application.class).newInstance(this.f3381b);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                }
            }
            return (T) super.a(cls);
        }
    }

    /* compiled from: ViewModelProvider.java */
    /* loaded from: classes.dex */
    public interface b {
        <T extends e0> T a(Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewModelProvider.java */
    /* loaded from: classes.dex */
    public static abstract class c extends e implements b {
        public <T extends e0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends e0> T c(String str, Class<T> cls);
    }

    /* compiled from: ViewModelProvider.java */
    /* loaded from: classes.dex */
    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private static d f3382a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static d b() {
            if (f3382a == null) {
                f3382a = new d();
            }
            return f3382a;
        }

        @Override // androidx.lifecycle.f0.b
        public <T extends e0> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewModelProvider.java */
    /* loaded from: classes.dex */
    public static class e {
        e() {
        }

        void b(e0 e0Var) {
        }
    }

    public f0(g0 g0Var, b bVar) {
        this.f3378a = bVar;
        this.f3379b = g0Var;
    }

    public <T extends e0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends e0> T b(String str, Class<T> cls) {
        T t10;
        T t11 = (T) this.f3379b.b(str);
        if (cls.isInstance(t11)) {
            b bVar = this.f3378a;
            if (bVar instanceof e) {
                ((e) bVar).b(t11);
            }
            return t11;
        }
        b bVar2 = this.f3378a;
        if (bVar2 instanceof c) {
            t10 = (T) ((c) bVar2).c(str, cls);
        } else {
            t10 = (T) bVar2.a(cls);
        }
        this.f3379b.d(str, t10);
        return t10;
    }
}
