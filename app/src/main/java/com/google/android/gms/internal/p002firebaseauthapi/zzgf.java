package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgf */
/* loaded from: classes2.dex */
public final class zzgf extends zzzl implements zzaar {
    private static final zzgf zzb;
    private int zze;
    private zzgl zzf;
    private zzjc zzg;

    static {
        zzgf zzgfVar = new zzgf();
        zzb = zzgfVar;
        zzzl.zzE(zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static zzge zzb() {
        return (zzge) zzb.zzt();
    }

    public static zzgf zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzgf) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public static /* synthetic */ void zzh(zzgf zzgfVar, zzgl zzglVar) {
        zzglVar.getClass();
        zzgfVar.zzf = zzglVar;
    }

    public static /* synthetic */ void zzi(zzgf zzgfVar, zzjc zzjcVar) {
        zzjcVar.getClass();
        zzgfVar.zzg = zzjcVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgl zze() {
        zzgl zzglVar = this.zzf;
        return zzglVar == null ? zzgl.zzd() : zzglVar;
    }

    public final zzjc zzf() {
        zzjc zzjcVar = this.zzg;
        return zzjcVar == null ? zzjc.zzd() : zzjcVar;
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
                    return new zzge(null);
                }
                return new zzgf();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
