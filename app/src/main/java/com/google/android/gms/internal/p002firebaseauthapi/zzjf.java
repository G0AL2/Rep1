package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjf */
/* loaded from: classes2.dex */
public final class zzjf extends zzzl implements zzaar {
    private static final zzjf zzb;
    private zzji zze;
    private int zzf;
    private int zzg;

    static {
        zzjf zzjfVar = new zzjf();
        zzb = zzjfVar;
        zzzl.zzE(zzjf.class, zzjfVar);
    }

    private zzjf() {
    }

    public static zzje zzb() {
        return (zzje) zzb.zzt();
    }

    public static zzjf zzd() {
        return zzb;
    }

    public static zzjf zze(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzjf) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public static /* synthetic */ void zzg(zzjf zzjfVar, zzji zzjiVar) {
        zzjiVar.getClass();
        zzjfVar.zze = zzjiVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzji zzf() {
        zzji zzjiVar = this.zze;
        return zzjiVar == null ? zzji.zzd() : zzjiVar;
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
                    return new zzje(null);
                }
                return new zzjf();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
