package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgqm {
    public static zzgqm zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzgqh(cls.getSimpleName());
        }
        return new zzgqj(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
