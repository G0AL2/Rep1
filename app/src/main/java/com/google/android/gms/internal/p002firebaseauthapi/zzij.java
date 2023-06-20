package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzij  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzij extends zzzl implements zzaar {
    private static final zzij zzb;
    private zzis zze;
    private zzid zzf;
    private int zzg;

    static {
        zzij zzijVar = new zzij();
        zzb = zzijVar;
        zzzl.zzE(zzij.class, zzijVar);
    }

    private zzij() {
    }

    public static zzii zzb() {
        return (zzii) zzb.zzt();
    }

    public static zzij zzd() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzij zzijVar, zzis zzisVar) {
        zzisVar.getClass();
        zzijVar.zze = zzisVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzij zzijVar, zzid zzidVar) {
        zzidVar.getClass();
        zzijVar.zzf = zzidVar;
    }

    public final zzid zza() {
        zzid zzidVar = this.zzf;
        return zzidVar == null ? zzid.zzc() : zzidVar;
    }

    public final zzis zze() {
        zzis zzisVar = this.zze;
        return zzisVar == null ? zzis.zzc() : zzisVar;
    }

    public final int zzh() {
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
                    return new zzii(null);
                }
                return new zzij();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
