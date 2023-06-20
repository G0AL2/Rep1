package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgox extends zzgkq implements zzgmb {
    private static final zzgox zzb;
    private int zze;
    private zzgow zzf;
    private zzgji zzh;
    private zzgji zzi;
    private int zzj;
    private byte zzk = 2;
    private zzgkz zzg = zzgkq.zzaJ();

    static {
        zzgox zzgoxVar = new zzgox();
        zzb = zzgoxVar;
        zzgkq.zzaP(zzgox.class, zzgoxVar);
    }

    private zzgox() {
        zzgji zzgjiVar = zzgji.zzb;
        this.zzh = zzgjiVar;
        this.zzi = zzgjiVar;
    }

    public static zzgou zza() {
        return (zzgou) zzb.zzay();
    }

    public static /* synthetic */ void zzd(zzgox zzgoxVar, zzgot zzgotVar) {
        zzgotVar.getClass();
        zzgkz zzgkzVar = zzgoxVar.zzg;
        if (!zzgkzVar.zzc()) {
            zzgoxVar.zzg = zzgkq.zzaK(zzgkzVar);
        }
        zzgoxVar.zzg.add(zzgotVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzk = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgou(null);
                }
                return new zzgox();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", zzgot.class, "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
