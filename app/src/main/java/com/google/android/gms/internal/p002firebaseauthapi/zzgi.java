package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgi */
/* loaded from: classes2.dex */
public final class zzgi extends zzzl implements zzaar {
    private static final zzgi zzb;
    private zzgo zze;
    private zzjf zzf;

    static {
        zzgi zzgiVar = new zzgi();
        zzb = zzgiVar;
        zzzl.zzE(zzgi.class, zzgiVar);
    }

    private zzgi() {
    }

    public static zzgh zza() {
        return (zzgh) zzb.zzt();
    }

    public static zzgi zzc(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzgi) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public static /* synthetic */ void zzf(zzgi zzgiVar, zzgo zzgoVar) {
        zzgoVar.getClass();
        zzgiVar.zze = zzgoVar;
    }

    public static /* synthetic */ void zzg(zzgi zzgiVar, zzjf zzjfVar) {
        zzjfVar.getClass();
        zzgiVar.zzf = zzjfVar;
    }

    public final zzgo zzd() {
        zzgo zzgoVar = this.zze;
        return zzgoVar == null ? zzgo.zzd() : zzgoVar;
    }

    public final zzjf zze() {
        zzjf zzjfVar = this.zzf;
        return zzjfVar == null ? zzjf.zzd() : zzjfVar;
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
                    return new zzgh(null);
                }
                return new zzgi();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
