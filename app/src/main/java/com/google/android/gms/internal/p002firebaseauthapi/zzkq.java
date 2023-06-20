package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkq */
/* loaded from: classes2.dex */
public final class zzkq extends zzzl implements zzaar {
    private static final zzkq zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzkq zzkqVar = new zzkq();
        zzb = zzkqVar;
        zzzl.zzE(zzkq.class, zzkqVar);
    }

    private zzkq() {
    }

    public static zzkp zzb() {
        return (zzkp) zzb.zzt();
    }

    public static /* synthetic */ void zzd(zzkq zzkqVar, String str) {
        str.getClass();
        zzkqVar.zze = str;
    }

    public final int zza() {
        return this.zzg;
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
                    return new zzkp(null);
                }
                return new zzkq();
            }
            return zzzl.zzD(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
