package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgpb extends zzgkq implements zzgmb {
    private static final zzgpb zzb;
    private int zze;
    private zzgpa zzf;
    private zzgji zzh;
    private zzgji zzi;
    private int zzj;
    private zzgji zzk;
    private byte zzl = 2;
    private zzgkz zzg = zzgkq.zzaJ();

    static {
        zzgpb zzgpbVar = new zzgpb();
        zzb = zzgpbVar;
        zzgkq.zzaP(zzgpb.class, zzgpbVar);
    }

    private zzgpb() {
        zzgji zzgjiVar = zzgji.zzb;
        this.zzh = zzgjiVar;
        this.zzi = zzgjiVar;
        this.zzk = zzgjiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzl = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgoy(null);
                }
                return new zzgpb();
            }
            return zzgkq.zzaO(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", zzgot.class, "zzh", "zzi", "zzj", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
