package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzig */
/* loaded from: classes2.dex */
public final class zzig extends zzzl implements zzaar {
    private static final zzig zzb;
    private zzij zze;

    static {
        zzig zzigVar = new zzig();
        zzb = zzigVar;
        zzzl.zzE(zzig.class, zzigVar);
    }

    private zzig() {
    }

    public static zzif zza() {
        return (zzif) zzb.zzt();
    }

    public static zzig zzc(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzig) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public static /* synthetic */ void zze(zzig zzigVar, zzij zzijVar) {
        zzijVar.getClass();
        zzigVar.zze = zzijVar;
    }

    public final zzij zzd() {
        zzij zzijVar = this.zze;
        return zzijVar == null ? zzij.zzd() : zzijVar;
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
                    return new zzif(null);
                }
                return new zzig();
            }
            return zzzl.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
