package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkx  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzkx extends zzzl implements zzaar {
    private static final zzkx zzb;
    private String zze = "";

    static {
        zzkx zzkxVar = new zzkx();
        zzb = zzkxVar;
        zzzl.zzE(zzkx.class, zzkxVar);
    }

    private zzkx() {
    }

    public static zzkx zzb() {
        return zzb;
    }

    public static zzkx zzc(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzkx) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    public final String zzd() {
        return this.zze;
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
                    return new zzkw(null);
                }
                return new zzkx();
            }
            return zzzl.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
