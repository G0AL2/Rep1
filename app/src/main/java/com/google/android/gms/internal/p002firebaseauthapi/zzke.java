package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzke */
/* loaded from: classes2.dex */
public final class zzke extends zzzl implements zzaar {
    private static final zzke zzb;
    private String zze = "";
    private zzyi zzf = zzyi.zzb;
    private int zzg;

    static {
        zzke zzkeVar = new zzke();
        zzb = zzkeVar;
        zzzl.zzE(zzke.class, zzkeVar);
    }

    private zzke() {
    }

    public static zzkd zza() {
        return (zzkd) zzb.zzt();
    }

    public static /* synthetic */ zzke zzb() {
        return zzb;
    }

    public static zzke zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzke zzkeVar, String str) {
        str.getClass();
        zzkeVar.zze = str;
    }

    public static /* synthetic */ void zzg(zzke zzkeVar, zzyi zzyiVar) {
        zzkeVar.zzf = zzyiVar;
    }

    public static /* synthetic */ void zzi(zzke zzkeVar, int i10) {
        zzkeVar.zzg = zzlf.zza(i10);
    }

    public final zzyi zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zze;
    }

    public final int zzh() {
        int zzb2 = zzlf.zzb(this.zzg);
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
                    return new zzkd(null);
                }
                return new zzke();
            }
            return zzzl.zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
