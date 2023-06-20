package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjt  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzjt extends zzzl implements zzaar {
    private static final zzjt zzb;
    private int zze;
    private zzjw zzf;
    private zzyi zzg = zzyi.zzb;

    static {
        zzjt zzjtVar = new zzjt();
        zzb = zzjtVar;
        zzzl.zzE(zzjt.class, zzjtVar);
    }

    private zzjt() {
    }

    public static zzjs zzb() {
        return (zzjs) zzb.zzt();
    }

    public static zzjt zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzjt) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzjt zzjtVar, zzjw zzjwVar) {
        zzjwVar.getClass();
        zzjtVar.zzf = zzjwVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzjw zze() {
        zzjw zzjwVar = this.zzf;
        return zzjwVar == null ? zzjw.zze() : zzjwVar;
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
                    return new zzjs(null);
                }
                return new zzjt();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}
