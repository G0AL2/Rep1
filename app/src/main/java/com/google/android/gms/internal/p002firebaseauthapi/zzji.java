package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzji */
/* loaded from: classes2.dex */
public final class zzji extends zzzl implements zzaar {
    private static final zzji zzb;
    private int zze;
    private int zzf;

    static {
        zzji zzjiVar = new zzji();
        zzb = zzjiVar;
        zzzl.zzE(zzji.class, zzjiVar);
    }

    private zzji() {
    }

    public static zzjh zzb() {
        return (zzjh) zzb.zzt();
    }

    public static zzji zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzf() {
        int zzb2 = zziz.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
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
                    return new zzjh(null);
                }
                return new zzji();
            }
            return zzzl.zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
