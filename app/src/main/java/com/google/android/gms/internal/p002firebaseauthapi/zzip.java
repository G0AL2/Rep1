package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzip  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzip extends zzzl implements zzaar {
    private static final zzip zzb;
    private int zze;
    private zzij zzf;
    private zzyi zzg;
    private zzyi zzh;

    static {
        zzip zzipVar = new zzip();
        zzb = zzipVar;
        zzzl.zzE(zzip.class, zzipVar);
    }

    private zzip() {
        zzyi zzyiVar = zzyi.zzb;
        this.zzg = zzyiVar;
        this.zzh = zzyiVar;
    }

    public static zzio zzc() {
        return (zzio) zzb.zzt();
    }

    public static zzip zze() {
        return zzb;
    }

    public static zzip zzf(zzyi zzyiVar, zzyy zzyyVar) throws zzzt {
        return (zzip) zzzl.zzw(zzb, zzyiVar, zzyyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzip zzipVar, zzij zzijVar) {
        zzijVar.getClass();
        zzipVar.zzf = zzijVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzij zzb() {
        zzij zzijVar = this.zzf;
        return zzijVar == null ? zzij.zzd() : zzijVar;
    }

    public final zzyi zzg() {
        return this.zzg;
    }

    public final zzyi zzh() {
        return this.zzh;
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
                    return new zzio(null);
                }
                return new zzip();
            }
            return zzzl.zzD(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
