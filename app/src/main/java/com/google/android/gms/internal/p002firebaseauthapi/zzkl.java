package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkl  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzkl extends zzzl implements zzaar {
    private static final zzkl zzb;
    private zzjz zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzkl zzklVar = new zzkl();
        zzb = zzklVar;
        zzzl.zzE(zzkl.class, zzklVar);
    }

    private zzkl() {
    }

    public static zzkk zzc() {
        return (zzkk) zzb.zzt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzkl zzklVar, zzjz zzjzVar) {
        zzjzVar.getClass();
        zzklVar.zze = zzjzVar;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzjz zzb() {
        zzjz zzjzVar = this.zze;
        return zzjzVar == null ? zzjz.zzc() : zzjzVar;
    }

    public final boolean zzg() {
        return this.zze != null;
    }

    public final int zzh() {
        int i10 = this.zzf;
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

    public final int zzi() {
        int zzb2 = zzlf.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
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
                    return new zzkk(null);
                }
                return new zzkl();
            }
            return zzzl.zzD(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
