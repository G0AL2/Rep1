package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzld */
/* loaded from: classes2.dex */
public final class zzld extends zzzl implements zzaar {
    private static final zzld zzb;
    private String zze = "";
    private zzke zzf;

    static {
        zzld zzldVar = new zzld();
        zzb = zzldVar;
        zzzl.zzE(zzld.class, zzldVar);
    }

    private zzld() {
    }

    public static zzld zzc() {
        return zzb;
    }

    public static zzld zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzld) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public final zzke zza() {
        zzke zzkeVar = this.zzf;
        return zzkeVar == null ? zzke.zzc() : zzkeVar;
    }

    public final String zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzf != null;
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
                    return new zzlc(null);
                }
                return new zzld();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
