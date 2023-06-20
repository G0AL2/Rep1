package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgr  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzgr extends zzzl implements zzaar {
    private static final zzgr zzb;
    private int zze;

    static {
        zzgr zzgrVar = new zzgr();
        zzb = zzgrVar;
        zzzl.zzE(zzgr.class, zzgrVar);
    }

    private zzgr() {
    }

    public static zzgq zzb() {
        return (zzgq) zzb.zzt();
    }

    public static zzgr zzd() {
        return zzb;
    }

    public final int zza() {
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
                    return new zzgq(null);
                }
                return new zzgr();
            }
            return zzzl.zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        return (byte) 1;
    }
}
