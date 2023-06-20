package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfw  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzfw extends zzzl implements zzaar {
    private static final zzfw zzb;
    private int zze;
    private zzyi zzf = zzyi.zzb;
    private zzgc zzg;

    static {
        zzfw zzfwVar = new zzfw();
        zzb = zzfwVar;
        zzzl.zzE(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfv zzb() {
        return (zzfv) zzb.zzt();
    }

    public static zzfw zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzfw) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzfw zzfwVar, zzgc zzgcVar) {
        zzgcVar.getClass();
        zzfwVar.zzg = zzgcVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgc zze() {
        zzgc zzgcVar = this.zzg;
        return zzgcVar == null ? zzgc.zzd() : zzgcVar;
    }

    public final zzyi zzf() {
        return this.zzf;
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
                    return new zzfv(null);
                }
                return new zzfw();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
