package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzha */
/* loaded from: classes2.dex */
public final class zzha extends zzzl implements zzaar {
    private static final zzha zzb;
    private int zze;

    static {
        zzha zzhaVar = new zzha();
        zzb = zzhaVar;
        zzzl.zzE(zzha.class, zzhaVar);
    }

    private zzha() {
    }

    public static zzgz zzb() {
        return (zzgz) zzb.zzt();
    }

    public static zzha zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzl
    public final Object zzj(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgz(null);
                }
                return new zzha();
            }
            return zzzl.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
