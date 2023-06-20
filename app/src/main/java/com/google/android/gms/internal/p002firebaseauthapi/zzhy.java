package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhy */
/* loaded from: classes2.dex */
public final class zzhy extends zzzl implements zzaar {
    private static final zzhy zzb;

    static {
        zzhy zzhyVar = new zzhy();
        zzb = zzhyVar;
        zzzl.zzE(zzhy.class, zzhyVar);
    }

    private zzhy() {
    }

    public static zzhy zzb() {
        return zzb;
    }

    public static zzhy zzc(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzhy) zzzl.zzw(zzb, zzyiVar, zzyyVar);
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
                    return new zzhx(null);
                }
                return new zzhy();
            }
            return zzzl.zzD(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
