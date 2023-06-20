package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaml extends zzgkq implements zzgmb {
    private static final zzaml zzb;
    private int zze;
    private zzgkz zzf = zzgkq.zzaJ();
    private zzgji zzg = zzgji.zzb;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzaml zzamlVar = new zzaml();
        zzb = zzamlVar;
        zzgkq.zzaP(zzaml.class, zzamlVar);
    }

    private zzaml() {
    }

    public static zzamk zza() {
        return (zzamk) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzaml zzamlVar, zzgji zzgjiVar) {
        zzgkz zzgkzVar = zzamlVar.zzf;
        if (!zzgkzVar.zzc()) {
            zzamlVar.zzf = zzgkq.zzaK(zzgkzVar);
        }
        zzamlVar.zzf.add(zzgjiVar);
    }

    public static /* synthetic */ void zze(zzaml zzamlVar, zzgji zzgjiVar) {
        zzamlVar.zze |= 1;
        zzamlVar.zzg = zzgjiVar;
    }

    public static /* synthetic */ void zzf(zzaml zzamlVar, int i10) {
        zzamlVar.zzi = i10 - 1;
        zzamlVar.zze |= 4;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
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
                    return new zzamk(null);
                }
                return new zzaml();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", zzamf.zza, "zzi", zzamd.zza});
        }
        return (byte) 1;
    }
}
