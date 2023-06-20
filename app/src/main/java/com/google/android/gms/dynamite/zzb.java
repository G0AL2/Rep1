package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzb {
    private static volatile ClassLoader zza;
    private static volatile Thread zzb;

    public static synchronized ClassLoader zza() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            if (zza == null) {
                zza = zzb();
            }
            classLoader = zza;
        }
        return classLoader;
    }

    private static synchronized ClassLoader zzb() {
        synchronized (zzb.class) {
            ClassLoader classLoader = null;
            if (zzb == null) {
                zzb = zzc();
                if (zzb == null) {
                    return null;
                }
            }
            synchronized (zzb) {
                try {
                    classLoader = zzb.getContextClassLoader();
                } catch (SecurityException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread zzc() {
        SecurityException e10;
        zza zzaVar;
        zza zzaVar2;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i11];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i11++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i10 >= activeCount) {
                            zzaVar2 = null;
                            break;
                        }
                        zzaVar2 = threadArr[i10];
                        if ("GmsDynamite".equals(zzaVar2.getName())) {
                            break;
                        }
                        i10++;
                    }
                } catch (SecurityException e11) {
                    e10 = e11;
                    zzaVar = null;
                }
                if (zzaVar2 == null) {
                    try {
                        zzaVar = new zza(threadGroup, "GmsDynamite");
                    } catch (SecurityException e12) {
                        e10 = e12;
                        zzaVar = zzaVar2;
                    }
                    try {
                        zzaVar.setContextClassLoader(null);
                        zzaVar.start();
                    } catch (SecurityException e13) {
                        e10 = e13;
                        String valueOf = String.valueOf(e10.getMessage());
                        Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                        zzaVar2 = zzaVar;
                        return zzaVar2;
                    }
                    zzaVar2 = zzaVar;
                }
            }
            return zzaVar2;
        }
    }
}
