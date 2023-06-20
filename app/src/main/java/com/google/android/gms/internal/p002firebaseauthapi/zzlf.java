package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlf  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzlf {
    private static final zzzo zza = new zzle();

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
                        return i10 != 4 ? 0 : 6;
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
