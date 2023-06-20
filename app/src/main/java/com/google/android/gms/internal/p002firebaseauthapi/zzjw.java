package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjw  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzjw extends zzzl implements zzaar {
    private static final zzjw zzb;
    private int zze;
    private zzjq zzf;
    private zzyi zzg = zzyi.zzb;

    static {
        zzjw zzjwVar = new zzjw();
        zzb = zzjwVar;
        zzzl.zzE(zzjw.class, zzjwVar);
    }

    private zzjw() {
    }

    public static zzjv zzc() {
        return (zzjv) zzb.zzt();
    }

    public static zzjw zze() {
        return zzb;
    }

    public static zzjw zzf(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzjw) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzjw zzjwVar, zzjq zzjqVar) {
        zzjqVar.getClass();
        zzjwVar.zzf = zzjqVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzjq zzb() {
        zzjq zzjqVar = this.zzf;
        return zzjqVar == null ? zzjq.zzc() : zzjqVar;
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
                    return new zzjv(null);
                }
                return new zzjw();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
