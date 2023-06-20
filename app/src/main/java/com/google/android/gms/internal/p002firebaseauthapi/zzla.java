package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzla  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzla extends zzzl implements zzaar {
    private static final zzla zzb;
    private int zze;
    private zzld zzf;

    static {
        zzla zzlaVar = new zzla();
        zzb = zzlaVar;
        zzzl.zzE(zzla.class, zzlaVar);
    }

    private zzla() {
    }

    public static zzkz zzb() {
        return (zzkz) zzb.zzt();
    }

    public static zzla zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzla) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzla zzlaVar, zzld zzldVar) {
        zzldVar.getClass();
        zzlaVar.zzf = zzldVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzld zze() {
        zzld zzldVar = this.zzf;
        return zzldVar == null ? zzld.zzc() : zzldVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new zzkz(null);
                }
                return new zzla();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
