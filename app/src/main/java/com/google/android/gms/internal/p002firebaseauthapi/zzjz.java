package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjz  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzjz extends zzzl implements zzaar {
    private static final zzjz zzb;
    private String zze = "";
    private zzyi zzf = zzyi.zzb;
    private int zzg;

    static {
        zzjz zzjzVar = new zzjz();
        zzb = zzjzVar;
        zzzl.zzE(zzjz.class, zzjzVar);
    }

    private zzjz() {
    }

    public static zzjy zza() {
        return (zzjy) zzb.zzt();
    }

    public static zzjz zzc() {
        return zzb;
    }

    public final zzyi zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zze;
    }

    public final int zzh() {
        int i10 = this.zzg;
        int i11 = 4;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 1) {
            i11 = 3;
        } else if (i10 != 2) {
            i11 = i10 != 3 ? i10 != 4 ? 0 : 6 : 5;
        }
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
                    return new zzjy(null);
                }
                return new zzjz();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
