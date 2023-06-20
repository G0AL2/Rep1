package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfz */
/* loaded from: classes2.dex */
public final class zzfz extends zzzl implements zzaar {
    private static final zzfz zzb;
    private int zze;
    private zzgc zzf;

    static {
        zzfz zzfzVar = new zzfz();
        zzb = zzfzVar;
        zzzl.zzE(zzfz.class, zzfzVar);
    }

    private zzfz() {
    }

    public static zzfy zzb() {
        return (zzfy) zzb.zzt();
    }

    public static zzfz zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzfz) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public static /* synthetic */ void zzg(zzfz zzfzVar, zzgc zzgcVar) {
        zzgcVar.getClass();
        zzfzVar.zzf = zzgcVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgc zze() {
        zzgc zzgcVar = this.zzf;
        return zzgcVar == null ? zzgc.zzd() : zzgcVar;
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
                    return new zzfy(null);
                }
                return new zzfz();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
