package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhg */
/* loaded from: classes2.dex */
public final class zzhg extends zzzl implements zzaar {
    private static final zzhg zzb;
    private int zze;
    private int zzf;

    static {
        zzhg zzhgVar = new zzhg();
        zzb = zzhgVar;
        zzzl.zzE(zzhg.class, zzhgVar);
    }

    private zzhg() {
    }

    public static zzhf zzb() {
        return (zzhf) zzb.zzt();
    }

    public static zzhg zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzhg) zzzl.zzw(zzb, zzyiVar, zzyyVar);
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
                    return new zzhf(null);
                }
                return new zzhg();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
