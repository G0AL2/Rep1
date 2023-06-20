package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbfv extends zzgkq implements zzgmb {
    private static final zzgkw zzb = new zzbft();
    private static final zzbfv zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private zzgkv zzk = zzgkq.zzaG();
    private zzbfq zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;

    static {
        zzbfv zzbfvVar = new zzbfv();
        zze = zzbfvVar;
        zzgkq.zzaP(zzbfv.class, zzbfvVar);
    }

    private zzbfv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzA(zzbfv zzbfvVar, int i10) {
        zzbfvVar.zzn = i10 - 1;
        zzbfvVar.zzf |= 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzB(zzbfv zzbfvVar, int i10) {
        zzbfvVar.zzo = i10 - 1;
        zzbfvVar.zzf |= 128;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzC(zzbfv zzbfvVar, int i10) {
        zzbfvVar.zzq = i10 - 1;
        zzbfvVar.zzf |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static zzbfu zzg() {
        return (zzbfu) zze.zzay();
    }

    public static zzbfv zzi(byte[] bArr) throws zzglc {
        return (zzbfv) zzgkq.zzaC(zze, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzbfv zzbfvVar, long j10) {
        zzbfvVar.zzf |= 1;
        zzbfvVar.zzg = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzbfv zzbfvVar, long j10) {
        zzbfvVar.zzf |= 4;
        zzbfvVar.zzi = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzbfv zzbfvVar, long j10) {
        zzbfvVar.zzf |= 8;
        zzbfvVar.zzj = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzbfv zzbfvVar, Iterable iterable) {
        zzgkv zzgkvVar = zzbfvVar.zzk;
        if (!zzgkvVar.zzc()) {
            zzbfvVar.zzk = zzgkq.zzaH(zzgkvVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzbfvVar.zzk.zzh(((zzbek) it.next()).zza());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzbfv zzbfvVar, zzbfq zzbfqVar) {
        zzbfqVar.getClass();
        zzbfvVar.zzl = zzbfqVar;
        zzbfvVar.zzf |= 16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzbfv zzbfvVar, int i10) {
        zzbfvVar.zzf |= 256;
        zzbfvVar.zzp = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzbfv zzbfvVar, zzbfz zzbfzVar) {
        zzbfvVar.zzr = zzbfzVar.zza();
        zzbfvVar.zzf |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzbfv zzbfvVar, long j10) {
        zzbfvVar.zzf |= 2048;
        zzbfvVar.zzs = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzy(zzbfv zzbfvVar, int i10) {
        zzbfvVar.zzh = i10 - 1;
        zzbfvVar.zzf |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzz(zzbfv zzbfvVar, int i10) {
        zzbfvVar.zzm = i10 - 1;
        zzbfvVar.zzf |= 32;
    }

    public final int zza() {
        return this.zzp;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgkq
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                zzgku zzgkuVar = zzbez.zza;
                return zzgkq.zzaO(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zzf", "zzg", "zzh", zzgkuVar, "zzi", "zzj", "zzk", zzbek.zzc(), "zzl", "zzm", zzgkuVar, "zzn", zzgkuVar, "zzo", zzgkuVar, "zzp", "zzq", zzgkuVar, "zzr", zzbfz.zzc(), "zzs"});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zze;
                }
                return new zzbfu(null);
            } else {
                return new zzbfv();
            }
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final long zze() {
        return this.zzg;
    }

    public final zzbfq zzf() {
        zzbfq zzbfqVar = this.zzl;
        return zzbfqVar == null ? zzbfq.zzd() : zzbfqVar;
    }

    public final zzbfz zzj() {
        zzbfz zzb2 = zzbfz.zzb(this.zzr);
        return zzb2 == null ? zzbfz.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgkx(this.zzk, zzb);
    }

    public final int zzt() {
        int zza = zzbfa.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzbfa.zza(this.zzo);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzbfa.zza(this.zzq);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzbfa.zza(this.zzh);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzbfa.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
