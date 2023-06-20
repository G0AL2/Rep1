package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlo */
/* loaded from: classes2.dex */
public final class zzlo extends zzzl implements zzaar {
    private static final zzlo zzb;
    private int zze;

    static {
        zzlo zzloVar = new zzlo();
        zzb = zzloVar;
        zzzl.zzE(zzlo.class, zzloVar);
    }

    private zzlo() {
    }

    public static zzlo zzb() {
        return zzb;
    }

    public static zzlo zzc(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzlo) zzzl.zzw(zzb, zzyiVar, zzyyVar);
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
                    return new zzln(null);
                }
                return new zzlo();
            }
            return zzzl.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
