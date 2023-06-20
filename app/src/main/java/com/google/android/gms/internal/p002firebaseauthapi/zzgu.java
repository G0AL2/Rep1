package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgu  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzgu extends zzzl implements zzaar {
    private static final zzgu zzb;
    private int zze;
    private zzha zzf;
    private zzyi zzg = zzyi.zzb;

    static {
        zzgu zzguVar = new zzgu();
        zzb = zzguVar;
        zzzl.zzE(zzgu.class, zzguVar);
    }

    private zzgu() {
    }

    public static zzgt zzb() {
        return (zzgt) zzb.zzt();
    }

    public static zzgu zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzgu) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzgu zzguVar, zzha zzhaVar) {
        zzhaVar.getClass();
        zzguVar.zzf = zzhaVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzha zze() {
        zzha zzhaVar = this.zzf;
        return zzhaVar == null ? zzha.zzd() : zzhaVar;
    }

    public final zzyi zzf() {
        return this.zzg;
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
                    return new zzgt(null);
                }
                return new zzgu();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
