package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgo */
/* loaded from: classes2.dex */
public final class zzgo extends zzzl implements zzaar {
    private static final zzgo zzb;
    private zzgr zze;
    private int zzf;

    static {
        zzgo zzgoVar = new zzgo();
        zzb = zzgoVar;
        zzzl.zzE(zzgo.class, zzgoVar);
    }

    private zzgo() {
    }

    public static zzgn zzb() {
        return (zzgn) zzb.zzt();
    }

    public static zzgo zzd() {
        return zzb;
    }

    public static zzgo zze(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzgo) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public static /* synthetic */ void zzg(zzgo zzgoVar, zzgr zzgrVar) {
        zzgrVar.getClass();
        zzgoVar.zze = zzgrVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgr zzf() {
        zzgr zzgrVar = this.zze;
        return zzgrVar == null ? zzgr.zzd() : zzgrVar;
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
                    return new zzgn(null);
                }
                return new zzgo();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
