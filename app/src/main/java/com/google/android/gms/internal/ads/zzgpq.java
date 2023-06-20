package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgpq extends zzgkq implements zzgmb {
    private static final zzgpq zzb;
    private zzgpp zzA;
    private zzgor zzC;
    private zzgoj zzE;
    private int zze;
    private int zzf;
    private int zzg;
    private zzgon zzk;
    private zzgpe zzo;
    private boolean zzp;
    private boolean zzs;
    private boolean zzt;
    private zzgpm zzv;
    private boolean zzw;
    private byte zzF = 2;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzgkz zzl = zzgkq.zzaJ();
    private zzgkz zzm = zzgkq.zzaJ();
    private String zzn = "";
    private zzgkz zzq = zzgkq.zzaJ();
    private String zzr = "";
    private zzgji zzu = zzgji.zzb;
    private String zzx = "";
    private zzgkz zzy = zzgkq.zzaJ();
    private zzgkz zzz = zzgkq.zzaJ();
    private zzgkz zzB = zzgkq.zzaJ();
    private String zzD = "";

    static {
        zzgpq zzgpqVar = new zzgpq();
        zzb = zzgpqVar;
        zzgkq.zzaP(zzgpq.class, zzgpqVar);
    }

    private zzgpq() {
    }

    public static zzgol zza() {
        return (zzgol) zzb.zzay();
    }

    public static /* synthetic */ void zzg(zzgpq zzgpqVar, String str) {
        str.getClass();
        zzgpqVar.zze |= 4;
        zzgpqVar.zzh = str;
    }

    public static /* synthetic */ void zzh(zzgpq zzgpqVar, String str) {
        str.getClass();
        zzgpqVar.zze |= 8;
        zzgpqVar.zzi = str;
    }

    public static /* synthetic */ void zzi(zzgpq zzgpqVar, zzgon zzgonVar) {
        zzgonVar.getClass();
        zzgpqVar.zzk = zzgonVar;
        zzgpqVar.zze |= 32;
    }

    public static /* synthetic */ void zzj(zzgpq zzgpqVar, zzgpk zzgpkVar) {
        zzgpkVar.getClass();
        zzgkz zzgkzVar = zzgpqVar.zzl;
        if (!zzgkzVar.zzc()) {
            zzgpqVar.zzl = zzgkq.zzaK(zzgkzVar);
        }
        zzgpqVar.zzl.add(zzgpkVar);
    }

    public static /* synthetic */ void zzk(zzgpq zzgpqVar, String str) {
        zzgpqVar.zze |= 64;
        zzgpqVar.zzn = str;
    }

    public static /* synthetic */ void zzl(zzgpq zzgpqVar) {
        zzgpqVar.zze &= -65;
        zzgpqVar.zzn = zzb.zzn;
    }

    public static /* synthetic */ void zzm(zzgpq zzgpqVar, zzgpe zzgpeVar) {
        zzgpeVar.getClass();
        zzgpqVar.zzo = zzgpeVar;
        zzgpqVar.zze |= 128;
    }

    public static /* synthetic */ void zzn(zzgpq zzgpqVar, zzgpm zzgpmVar) {
        zzgpmVar.getClass();
        zzgpqVar.zzv = zzgpmVar;
        zzgpqVar.zze |= Constants.BUFFER_SIZE;
    }

    public static /* synthetic */ void zzo(zzgpq zzgpqVar, Iterable iterable) {
        zzgkz zzgkzVar = zzgpqVar.zzy;
        if (!zzgkzVar.zzc()) {
            zzgpqVar.zzy = zzgkq.zzaK(zzgkzVar);
        }
        zzgir.zzat(iterable, zzgpqVar.zzy);
    }

    public static /* synthetic */ void zzp(zzgpq zzgpqVar, Iterable iterable) {
        zzgkz zzgkzVar = zzgpqVar.zzz;
        if (!zzgkzVar.zzc()) {
            zzgpqVar.zzz = zzgkq.zzaK(zzgkzVar);
        }
        zzgir.zzat(iterable, zzgpqVar.zzz);
    }

    public static /* synthetic */ void zzq(zzgpq zzgpqVar, int i10) {
        zzgpqVar.zzf = i10 - 1;
        zzgpqVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            this.zzF = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgol(null);
                }
                return new zzgpq();
            }
            return zzgkq.zzaO(zzb, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0006\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", zzgpk.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzf", zzgpf.zza, "zzg", zzgok.zza, "zzk", "zzn", "zzo", "zzu", "zzm", zzgpu.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzgqa.class, "zzC", "zzD", "zzE"});
        }
        return Byte.valueOf(this.zzF);
    }

    public final String zzd() {
        return this.zzn;
    }

    public final String zze() {
        return this.zzh;
    }

    public final List zzf() {
        return this.zzl;
    }
}
