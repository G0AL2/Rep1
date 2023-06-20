package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfou {
    public static int zza(int i10, int i11, String str) {
        String zzb;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                zzb = zzfpi.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            } else {
                zzb = zzfpi.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(zzb);
        }
        return i10;
    }

    public static int zzb(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzj(i10, i11, "index"));
        }
        return i10;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfpi.zzb(str, obj2));
    }

    public static void zze(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzf(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzg(int i10, int i11, int i12) {
        String zzj;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 >= 0 && i10 <= i12) {
                zzj = (i11 < 0 || i11 > i12) ? zzj(i11, i12, "end index") : zzfpi.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                zzj = zzj(i10, i12, "start index");
            }
            throw new IndexOutOfBoundsException(zzj);
        }
    }

    public static void zzh(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzi(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzj(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzfpi.zzb("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzfpi.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
