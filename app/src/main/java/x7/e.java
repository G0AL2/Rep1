package x7;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MetadataBackendRegistry.java */
/* loaded from: classes2.dex */
class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f38694a;

    /* renamed from: b  reason: collision with root package name */
    private final c f38695b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, g> f38696c;

    /* compiled from: MetadataBackendRegistry.java */
    /* loaded from: classes2.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f38697a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f38698b = null;

        a(Context context) {
            this.f38697a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle d10 = d(context);
            if (d10 == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d10.keySet()) {
                Object obj = d10.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        private Map<String, String> c() {
            if (this.f38698b == null) {
                this.f38698b = a(this.f38697a);
            }
            return this.f38698b;
        }

        private static Bundle d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        x7.a b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (x7.a) Class.forName(str2).asSubclass(x7.a.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, c cVar) {
        this(new a(context), cVar);
    }

    @Override // x7.b
    public synchronized g get(String str) {
        if (this.f38696c.containsKey(str)) {
            return this.f38696c.get(str);
        }
        x7.a b10 = this.f38694a.b(str);
        if (b10 == null) {
            return null;
        }
        g create = b10.create(this.f38695b.a(str));
        this.f38696c.put(str, create);
        return create;
    }

    e(a aVar, c cVar) {
        this.f38696c = new HashMap();
        this.f38694a = aVar;
        this.f38695b = cVar;
    }
}
