package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzim */
/* loaded from: classes2.dex */
public final class zzim extends zzzl implements zzaar {
    private static final zzim zzb;
    private int zze;
    private zzip zzf;
    private zzyi zzg = zzyi.zzb;

    static {
        zzim zzimVar = new zzim();
        zzb = zzimVar;
        zzzl.zzE(zzim.class, zzimVar);
    }

    private zzim() {
    }

    public static zzil zzb() {
        return (zzil) zzb.zzt();
    }

    public static zzim zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzim) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public static /* synthetic */ void zzh(zzim zzimVar, zzip zzipVar) {
        zzipVar.getClass();
        zzimVar.zzf = zzipVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzip zze() {
        zzip zzipVar = this.zzf;
        return zzipVar == null ? zzip.zze() : zzipVar;
    }

    public final zzyi zzf() {
        return this.zzg;
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
                    return new zzil(null);
                }
                return new zzim();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
