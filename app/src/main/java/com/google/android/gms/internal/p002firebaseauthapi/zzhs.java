package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhs */
/* loaded from: classes2.dex */
public final class zzhs extends zzzl implements zzaar {
    private static final zzhs zzb;
    private int zze;
    private int zzf;

    static {
        zzhs zzhsVar = new zzhs();
        zzb = zzhsVar;
        zzzl.zzE(zzhs.class, zzhsVar);
    }

    private zzhs() {
    }

    public static zzhr zzb() {
        return (zzhr) zzb.zzt();
    }

    public static zzhs zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzhs) zzzl.zzw(zzb, zzyiVar, zzyyVar);
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
                    return new zzhr(null);
                }
                return new zzhs();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
