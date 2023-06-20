package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzku  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzku extends zzzl implements zzaar {
    private static final zzku zzb;
    private int zze;
    private zzkx zzf;

    static {
        zzku zzkuVar = new zzku();
        zzb = zzkuVar;
        zzzl.zzE(zzku.class, zzkuVar);
    }

    private zzku() {
    }

    public static zzkt zzb() {
        return (zzkt) zzb.zzt();
    }

    public static zzku zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzku) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzku zzkuVar, zzkx zzkxVar) {
        zzkxVar.getClass();
        zzkuVar.zzf = zzkxVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzkx zze() {
        zzkx zzkxVar = this.zzf;
        return zzkxVar == null ? zzkx.zzb() : zzkxVar;
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
                    return new zzkt(null);
                }
                return new zzku();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
