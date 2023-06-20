package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgej {
    private static final zzgkt zza = new zzgei();

    public static int zza(int i10) {
        if (i10 != 1) {
            return i10 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int zzb(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return i10 != 5 ? 0 : 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }
}
