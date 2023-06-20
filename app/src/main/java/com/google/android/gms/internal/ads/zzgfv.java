package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgfv extends zzgkq implements zzgmb {
    private static final zzgfv zzb;
    private zzgfj zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgfv zzgfvVar = new zzgfv();
        zzb = zzgfvVar;
        zzgkq.zzaP(zzgfv.class, zzgfvVar);
    }

    private zzgfv() {
    }

    public static zzgfu zzd() {
        return (zzgfu) zzb.zzay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzgfv zzgfvVar, zzgfj zzgfjVar) {
        zzgfjVar.getClass();
        zzgfvVar.zze = zzgfjVar;
    }

    public final int zza() {
        return this.zzg;
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
                    return new zzgfu(null);
                }
                return new zzgfv();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzgfj zzc() {
        zzgfj zzgfjVar = this.zze;
        return zzgfjVar == null ? zzgfj.zzd() : zzgfjVar;
    }

    public final boolean zzh() {
        return this.zze != null;
    }

    public final int zzi() {
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

    public final int zzj() {
        int zzb2 = zzggp.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
