package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzid */
/* loaded from: classes2.dex */
public final class zzid extends zzzl implements zzaar {
    private static final zzid zzb;
    private zzke zze;

    static {
        zzid zzidVar = new zzid();
        zzb = zzidVar;
        zzzl.zzE(zzid.class, zzidVar);
    }

    private zzid() {
    }

    public static zzic zza() {
        return (zzic) zzb.zzt();
    }

    public static zzid zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzid zzidVar, zzke zzkeVar) {
        zzkeVar.getClass();
        zzidVar.zze = zzkeVar;
    }

    public final zzke zzd() {
        zzke zzkeVar = this.zze;
        return zzkeVar == null ? zzke.zzc() : zzkeVar;
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
                    return new zzic(null);
                }
                return new zzid();
            }
            return zzzl.zzD(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
