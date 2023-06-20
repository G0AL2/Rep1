package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjq  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzjq extends zzzl implements zzaar {
    private static final zzjq zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzjq zzjqVar = new zzjq();
        zzb = zzjqVar;
        zzzl.zzE(zzjq.class, zzjqVar);
    }

    private zzjq() {
    }

    public static zzjp zza() {
        return (zzjp) zzb.zzt();
    }

    public static zzjq zzc() {
        return zzb;
    }

    public final int zzd() {
        int i10 = this.zzg;
        int i11 = 3;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 != 1) {
            i11 = i10 != 2 ? i10 != 3 ? 0 : 5 : 4;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zze() {
        int i10 = this.zzf;
        int i11 = i10 != 0 ? i10 != 1 ? 0 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzf() {
        int i10 = this.zze;
        int i11 = i10 != 0 ? i10 != 1 ? 0 : 3 : 2;
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzl
    protected final Object zzj(int i10, Object obj, Object obj2) {
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
                    return new zzjp(null);
                }
                return new zzjq();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
