package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhm */
/* loaded from: classes2.dex */
public final class zzhm extends zzzl implements zzaar {
    private static final zzhm zzb;
    private int zze;
    private int zzf;

    static {
        zzhm zzhmVar = new zzhm();
        zzb = zzhmVar;
        zzzl.zzE(zzhm.class, zzhmVar);
    }

    private zzhm() {
    }

    public static zzhl zzb() {
        return (zzhl) zzb.zzt();
    }

    public static zzhm zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzhm) zzzl.zzw(zzb, zzyiVar, zzyyVar);
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
                    return new zzhl(null);
                }
                return new zzhm();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        return (byte) 1;
    }
}
