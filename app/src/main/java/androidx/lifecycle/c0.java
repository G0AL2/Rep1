package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.f0;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: SavedStateViewModelFactory.java */
/* loaded from: classes.dex */
public final class c0 extends f0.c {

    /* renamed from: f  reason: collision with root package name */
    private static final Class<?>[] f3363f = {Application.class, b0.class};

    /* renamed from: g  reason: collision with root package name */
    private static final Class<?>[] f3364g = {b0.class};

    /* renamed from: a  reason: collision with root package name */
    private final Application f3365a;

    /* renamed from: b  reason: collision with root package name */
    private final f0.b f3366b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f3367c;

    /* renamed from: d  reason: collision with root package name */
    private final i f3368d;

    /* renamed from: e  reason: collision with root package name */
    private final SavedStateRegistry f3369e;

    @SuppressLint({"LambdaLast"})
    public c0(Application application, androidx.savedstate.c cVar, Bundle bundle) {
        f0.b b10;
        this.f3369e = cVar.getSavedStateRegistry();
        this.f3368d = cVar.getLifecycle();
        this.f3367c = bundle;
        this.f3365a = application;
        if (application != null) {
            b10 = f0.a.c(application);
        } else {
            b10 = f0.d.b();
        }
        this.f3366b = b10;
    }

    private static <T> Constructor<T> d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.f0.c, androidx.lifecycle.f0.b
    public <T extends e0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.f0.e
    void b(e0 e0Var) {
        SavedStateHandleController.g(e0Var, this.f3369e, this.f3368d);
    }

    @Override // androidx.lifecycle.f0.c
    public <T extends e0> T c(String str, Class<T> cls) {
        Constructor d10;
        T t10;
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        if (isAssignableFrom && this.f3365a != null) {
            d10 = d(cls, f3363f);
        } else {
            d10 = d(cls, f3364g);
        }
        if (d10 == null) {
            return (T) this.f3366b.a(cls);
        }
        SavedStateHandleController j10 = SavedStateHandleController.j(this.f3369e, this.f3368d, str, this.f3367c);
        if (isAssignableFrom) {
            try {
                Application application = this.f3365a;
                if (application != null) {
                    t10 = (T) d10.newInstance(application, j10.k());
                    t10.e("androidx.lifecycle.savedstate.vm.tag", j10);
                    return t10;
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Failed to access " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
            }
        }
        t10 = (T) d10.newInstance(j10.k());
        t10.e("androidx.lifecycle.savedstate.vm.tag", j10);
        return t10;
    }
}
