package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgpk extends zzgkq implements zzgmb {
    private static final zzgpk zzb;
    private int zze;
    private int zzf;
    private zzgox zzh;
    private zzgpb zzi;
    private int zzj;
    private int zzm;
    private byte zzo = 2;
    private String zzg = "";
    private zzgkv zzk = zzgkq.zzaG();
    private String zzl = "";
    private zzgkz zzn = zzgkq.zzaJ();

    static {
        zzgpk zzgpkVar = new zzgpk();
        zzb = zzgpkVar;
        zzgkq.zzaP(zzgpk.class, zzgpkVar);
    }

    private zzgpk() {
    }

    public static zzgpj zzc() {
        return (zzgpj) zzb.zzay();
    }

    public static /* synthetic */ void zzf(zzgpk zzgpkVar, int i10) {
        zzgpkVar.zze |= 1;
        zzgpkVar.zzf = i10;
    }

    public static /* synthetic */ void zzg(zzgpk zzgpkVar, String str) {
        str.getClass();
        zzgpkVar.zze |= 2;
        zzgpkVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzgpk zzgpkVar, zzgox zzgoxVar) {
        zzgoxVar.getClass();
        zzgpkVar.zzh = zzgoxVar;
        zzgpkVar.zze |= 4;
    }

    public static /* synthetic */ void zzi(zzgpk zzgpkVar, String str) {
        str.getClass();
        zzgkz zzgkzVar = zzgpkVar.zzn;
        if (!zzgkzVar.zzc()) {
            zzgpkVar.zzn = zzgkq.zzaK(zzgkzVar);
        }
        zzgpkVar.zzn.add(str);
    }

    public static /* synthetic */ void zzj(zzgpk zzgpkVar, int i10) {
        zzgpkVar.zzm = i10 - 1;
        zzgpkVar.zze |= 64;
    }

    public final int zza() {
        return this.zzn.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzo = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgpj(null);
                }
                return new zzgpk();
            }
            return zzgkq.zzaO(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgph.zza, "zzn"});
        }
        return Byte.valueOf(this.zzo);
    }

    public final String zze() {
        return this.zzg;
    }
}
