package tb;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ComponentDiscovery.java */
/* loaded from: classes3.dex */
public final class g<T> {

    /* renamed from: a */
    private final T f37272a;

    /* renamed from: b */
    private final c<T> f37273b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ComponentDiscovery.java */
    /* loaded from: classes3.dex */
    public static class b implements c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f37274a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f37274a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f37274a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // tb.g.c
        /* renamed from: c */
        public List<String> a(Context context) {
            Bundle b10 = b(context);
            if (b10 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b10.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b10.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f37274a = cls;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComponentDiscovery.java */
    /* loaded from: classes3.dex */
    public interface c<T> {
        List<String> a(T t10);
    }

    g(T t10, c<T> cVar) {
        this.f37272a = t10;
        this.f37273b = cVar;
    }

    public static /* synthetic */ i a(String str) {
        return d(str);
    }

    public static g<Context> c(Context context, Class<? extends Service> cls) {
        return new g<>(context, new b(cls));
    }

    public static i d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (i.class.isAssignableFrom(cls)) {
                return (i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new v(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new v(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new v(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new v(String.format("Could not instantiate %s", str), e13);
        }
    }

    public List<sc.b<i>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f37273b.a(this.f37272a)) {
            arrayList.add(new sc.b() { // from class: tb.f
                @Override // sc.b
                public final Object get() {
                    return g.a(str);
                }
            });
        }
        return arrayList;
    }
}
