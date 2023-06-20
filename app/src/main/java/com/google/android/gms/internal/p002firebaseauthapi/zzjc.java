package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjc  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzjc extends zzzl implements zzaar {
    private static final zzjc zzb;
    private int zze;
    private zzji zzf;
    private zzyi zzg = zzyi.zzb;

    static {
        zzjc zzjcVar = new zzjc();
        zzb = zzjcVar;
        zzzl.zzE(zzjc.class, zzjcVar);
    }

    private zzjc() {
    }

    public static zzjb zzb() {
        return (zzjb) zzb.zzt();
    }

    public static zzjc zzd() {
        return zzb;
    }

    public static zzjc zze(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzjc) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzjc zzjcVar, zzji zzjiVar) {
        zzjiVar.getClass();
        zzjcVar.zzf = zzjiVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzji zzf() {
        zzji zzjiVar = this.zzf;
        return zzjiVar == null ? zzji.zzd() : zzjiVar;
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
                    return new zzjb(null);
                }
                return new zzjc();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
