package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
abstract class zzgkk {
    private static final Logger zza = Logger.getLogger(zzgjx.class.getName());
    private static final String zzb = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zzgkk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgkc zzb(Class cls) {
        String format;
        ClassLoader classLoader = zzgkk.class.getClassLoader();
        if (cls.equals(zzgkc.class)) {
            format = zzb;
        } else if (cls.getPackage().equals(zzgkk.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (zzgkc) cls.cast(((zzgkk) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                    } catch (InstantiationException e10) {
                        throw new IllegalStateException(e10);
                    } catch (NoSuchMethodException e11) {
                        throw new IllegalStateException(e11);
                    }
                } catch (InvocationTargetException e12) {
                    throw new IllegalStateException(e12);
                }
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzgkk.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzgkk) it.next()).zza()));
                } catch (ServiceConfigurationError e14) {
                    zza.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (zzgkc) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzgkc) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    protected abstract zzgkc zza();
}
