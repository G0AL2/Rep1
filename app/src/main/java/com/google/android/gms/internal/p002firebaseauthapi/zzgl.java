package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgl  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzgl extends zzzl implements zzaar {
    private static final zzgl zzb;
    private int zze;
    private zzgr zzf;
    private zzyi zzg = zzyi.zzb;

    static {
        zzgl zzglVar = new zzgl();
        zzb = zzglVar;
        zzzl.zzE(zzgl.class, zzglVar);
    }

    private zzgl() {
    }

    public static zzgk zzb() {
        return (zzgk) zzb.zzt();
    }

    public static zzgl zzd() {
        return zzb;
    }

    public static zzgl zze(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzgl) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzgl zzglVar, zzgr zzgrVar) {
        zzgrVar.getClass();
        zzglVar.zzf = zzgrVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgr zzf() {
        zzgr zzgrVar = this.zzf;
        return zzgrVar == null ? zzgr.zzd() : zzgrVar;
    }

    public final zzyi zzg() {
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
                    return new zzgk(null);
                }
                return new zzgl();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
