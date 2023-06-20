package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
final class zzgd {
    private static final Class<?> zza;
    private static final zzgp<?, ?> zzb;
    private static final zzgp<?, ?> zzc;
    private static final zzgp<?, ?> zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzj(false);
        zzc = zzj(true);
        zzd = new zzgr();
    }

    public static zzgp<?, ?> zza() {
        return zzb;
    }

    public static zzgp<?, ?> zzb() {
        return zzc;
    }

    public static zzgp<?, ?> zzc() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB zzd(int i10, List<Integer> list, zzet zzetVar, UB ub2, zzgp<UT, UB> zzgpVar) {
        if (zzetVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzetVar.zza()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) zze(i10, intValue, ub2, zzgpVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return ub2;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzetVar.zza()) {
                    ub2 = (UB) zze(i10, intValue2, ub2, zzgpVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    static <UT, UB> UB zze(int i10, int i11, UB ub2, zzgp<UT, UB> zzgpVar) {
        if (ub2 == null) {
            ub2 = zzgpVar.zzc();
        }
        zzgpVar.zzd(ub2, i10, i11);
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void zzf(zzgp<UT, UB> zzgpVar, T t10, T t11) {
        zzgpVar.zzf(t10, zzgpVar.zzb(zzgpVar.zza(t10), zzgpVar.zza(t11)));
    }

    public static void zzg(Class<?> cls) {
        Class<?> cls2;
        if (!zzeq.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzh(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void zzi(zzfl zzflVar, T t10, T t11, long j10) {
        zzgz.zzp(t10, j10, zzfl.zza(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10)));
    }

    private static zzgp<?, ?> zzj(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgp) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
