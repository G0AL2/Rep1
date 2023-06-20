package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzis  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzis extends zzzl implements zzaar {
    private static final zzis zzb;
    private int zze;
    private int zzf;
    private zzyi zzg = zzyi.zzb;

    static {
        zzis zzisVar = new zzis();
        zzb = zzisVar;
        zzzl.zzE(zzis.class, zzisVar);
    }

    private zzis() {
    }

    public static zzir zza() {
        return (zzir) zzb.zzt();
    }

    public static zzis zzc() {
        return zzb;
    }

    public final zzyi zzd() {
        return this.zzg;
    }

    public final int zzf() {
        int i10 = this.zze;
        int i11 = 5;
        if (i10 == 0) {
            i11 = 2;
        } else if (i10 == 2) {
            i11 = 4;
        } else if (i10 != 3) {
            i11 = i10 != 4 ? i10 != 5 ? 0 : 7 : 6;
        }
        if (i11 == 0) {
            return 1;
        }
        return i11;
    }

    public final int zzg() {
        int zzb2 = zziz.zzb(this.zzf);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
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
                    return new zzir(null);
                }
                return new zzis();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
