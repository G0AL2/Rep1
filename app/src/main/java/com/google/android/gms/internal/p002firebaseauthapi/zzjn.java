package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjn */
/* loaded from: classes2.dex */
public final class zzjn extends zzzl implements zzaar {
    private static final zzjn zzb;
    private zzjq zze;

    static {
        zzjn zzjnVar = new zzjn();
        zzb = zzjnVar;
        zzzl.zzE(zzjn.class, zzjnVar);
    }

    private zzjn() {
    }

    public static zzjm zza() {
        return (zzjm) zzb.zzt();
    }

    public static zzjn zzc(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzjn) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public static /* synthetic */ void zze(zzjn zzjnVar, zzjq zzjqVar) {
        zzjqVar.getClass();
        zzjnVar.zze = zzjqVar;
    }

    public final zzjq zzd() {
        zzjq zzjqVar = this.zze;
        return zzjqVar == null ? zzjq.zzc() : zzjqVar;
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
                    return new zzjm(null);
                }
                return new zzjn();
            }
            return zzzl.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
