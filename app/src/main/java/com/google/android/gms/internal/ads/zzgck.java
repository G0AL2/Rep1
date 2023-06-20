package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgck extends zzgkq implements zzgmb {
    private static final zzgck zzb;
    private zzgcn zze;
    private int zzf;

    static {
        zzgck zzgckVar = new zzgck();
        zzb = zzgckVar;
        zzgkq.zzaP(zzgck.class, zzgckVar);
    }

    private zzgck() {
    }

    public static zzgcj zzc() {
        return (zzgcj) zzb.zzay();
    }

    public static zzgck zze(zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        return (zzgck) zzgkq.zzaD(zzb, zzgjiVar, zzgkcVar);
    }

    public static /* synthetic */ void zzg(zzgck zzgckVar, zzgcn zzgcnVar) {
        zzgcnVar.getClass();
        zzgckVar.zze = zzgcnVar;
    }

    public final int zza() {
        return this.zzf;
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
                    return new zzgcj(null);
                }
                return new zzgck();
            }
            return zzgkq.zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgcn zzf() {
        zzgcn zzgcnVar = this.zze;
        return zzgcnVar == null ? zzgcn.zze() : zzgcnVar;
    }
}
