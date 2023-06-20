package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbeh extends zzgkq implements zzgmb {
    private static final zzbeh zzb;
    private zzgkz zze = zzgkq.zzaJ();

    static {
        zzbeh zzbehVar = new zzbeh();
        zzb = zzbehVar;
        zzgkq.zzaP(zzbeh.class, zzbehVar);
    }

    private zzbeh() {
    }

    public static zzbeb zza() {
        return (zzbeb) zzb.zzay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzbeh zzbehVar, zzbea zzbeaVar) {
        zzbeaVar.getClass();
        zzgkz zzgkzVar = zzbehVar.zze;
        if (!zzgkzVar.zzc()) {
            zzbehVar.zze = zzgkq.zzaK(zzgkzVar);
        }
        zzbehVar.zze.add(zzbeaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    protected final Object zzb(int i10, Object obj, Object obj2) {
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
                    return new zzbeb(null);
                }
                return new zzbeh();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzbea.class});
        }
        return (byte) 1;
    }
}
