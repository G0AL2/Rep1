package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import c1.b;
import c1.c;
import com.chartboost.sdk.CBLocation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f4077d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f4078e = new Object();

    /* renamed from: c  reason: collision with root package name */
    final Context f4081c;

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends c1.a<?>>> f4080b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f4079a = new HashMap();

    a(Context context) {
        this.f4081c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f4077d == null) {
            synchronized (f4078e) {
                if (f4077d == null) {
                    f4077d = new a(context);
                }
            }
        }
        return f4077d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        try {
            try {
                e1.a.a(CBLocation.LOCATION_STARTUP);
                Bundle bundle = this.f4081c.getPackageManager().getProviderInfo(new ComponentName(this.f4081c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.f4081c.getString(b.f5290a);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (c1.a.class.isAssignableFrom(cls)) {
                                this.f4080b.add(cls);
                                b(cls, hashSet);
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e10) {
                throw new c(e10);
            }
        } finally {
            e1.a.b();
        }
    }

    <T> T b(Class<? extends c1.a<?>> cls, Set<Class<?>> set) {
        T t10;
        synchronized (f4078e) {
            if (e1.a.d()) {
                e1.a.a(cls.getSimpleName());
            }
            if (!set.contains(cls)) {
                if (!this.f4079a.containsKey(cls)) {
                    set.add(cls);
                    try {
                        c1.a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        List<Class<? extends c1.a<?>>> a10 = newInstance.a();
                        if (!a10.isEmpty()) {
                            for (Class<? extends c1.a<?>> cls2 : a10) {
                                if (!this.f4079a.containsKey(cls2)) {
                                    b(cls2, set);
                                }
                            }
                        }
                        t10 = (T) newInstance.b(this.f4081c);
                        set.remove(cls);
                        this.f4079a.put(cls, t10);
                    } catch (Throwable th) {
                        throw new c(th);
                    }
                } else {
                    t10 = (T) this.f4079a.get(cls);
                }
                e1.a.b();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
        }
        return t10;
    }

    public <T> T d(Class<? extends c1.a<T>> cls) {
        return (T) b(cls, new HashSet());
    }
}
