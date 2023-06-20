package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhv  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzhv extends zzzl implements zzaar {
    private static final zzhv zzb;
    private int zze;
    private zzyi zzf = zzyi.zzb;

    static {
        zzhv zzhvVar = new zzhv();
        zzb = zzhvVar;
        zzzl.zzE(zzhv.class, zzhvVar);
    }

    private zzhv() {
    }

    public static zzhu zzb() {
        return (zzhu) zzb.zzt();
    }

    public static zzhv zzd(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzhv) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzyi zze() {
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
                    return new zzhu(null);
                }
                return new zzhv();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
