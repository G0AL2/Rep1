package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgx */
/* loaded from: classes2.dex */
public final class zzgx extends zzzl implements zzaar {
    private static final zzgx zzb;
    private zzha zze;
    private int zzf;

    static {
        zzgx zzgxVar = new zzgx();
        zzb = zzgxVar;
        zzzl.zzE(zzgx.class, zzgxVar);
    }

    private zzgx() {
    }

    public static zzgw zzb() {
        return (zzgw) zzb.zzt();
    }

    public static zzgx zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzgx) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public static /* synthetic */ void zzf(zzgx zzgxVar, zzha zzhaVar) {
        zzhaVar.getClass();
        zzgxVar.zze = zzhaVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzha zze() {
        zzha zzhaVar = this.zze;
        return zzhaVar == null ? zzha.zzd() : zzhaVar;
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
                    return new zzgw(null);
                }
                return new zzgx();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
