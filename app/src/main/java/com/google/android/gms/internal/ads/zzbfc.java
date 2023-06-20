package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbfc extends zzgkq implements zzgmb {
    private static final zzbfc zzb;
    private int zze;
    private int zzf;
    private int zzh;
    private zzbgm zzj;
    private zzbeu zzl;
    private zzbex zzm;
    private zzbfq zzn;
    private zzbdy zzo;
    private zzbga zzp;
    private zzbhh zzq;
    private zzbeh zzr;
    private String zzg = "";
    private int zzi = 1000;
    private zzgky zzk = zzgkq.zzaI();

    static {
        zzbfc zzbfcVar = new zzbfc();
        zzb = zzbfcVar;
        zzgkq.zzaP(zzbfc.class, zzbfcVar);
    }

    private zzbfc() {
    }

    public static zzbfb zzd() {
        return (zzbfb) zzb.zzay();
    }

    public static /* synthetic */ void zzg(zzbfc zzbfcVar, String str) {
        str.getClass();
        zzbfcVar.zze |= 2;
        zzbfcVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzbfc zzbfcVar, Iterable iterable) {
        zzgky zzgkyVar = zzbfcVar.zzk;
        if (!zzgkyVar.zzc()) {
            int size = zzgkyVar.size();
            zzbfcVar.zzk = zzgkyVar.zza(size == 0 ? 10 : size + size);
        }
        zzgir.zzat(iterable, zzbfcVar.zzk);
    }

    public static /* synthetic */ void zzj(zzbfc zzbfcVar, zzbeu zzbeuVar) {
        zzbeuVar.getClass();
        zzbfcVar.zzl = zzbeuVar;
        zzbfcVar.zze |= 32;
    }

    public static /* synthetic */ void zzk(zzbfc zzbfcVar, zzbdy zzbdyVar) {
        zzbdyVar.getClass();
        zzbfcVar.zzo = zzbdyVar;
        zzbfcVar.zze |= 256;
    }

    public static /* synthetic */ void zzl(zzbfc zzbfcVar, zzbga zzbgaVar) {
        zzbgaVar.getClass();
        zzbfcVar.zzp = zzbgaVar;
        zzbfcVar.zze |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static /* synthetic */ void zzm(zzbfc zzbfcVar, zzbhh zzbhhVar) {
        zzbhhVar.getClass();
        zzbfcVar.zzq = zzbhhVar;
        zzbfcVar.zze |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
    }

    public static /* synthetic */ void zzn(zzbfc zzbfcVar, zzbeh zzbehVar) {
        zzbehVar.getClass();
        zzbfcVar.zzr = zzbehVar;
        zzbfcVar.zze |= 2048;
    }

    public final zzbdy zza() {
        zzbdy zzbdyVar = this.zzo;
        return zzbdyVar == null ? zzbdy.zzc() : zzbdyVar;
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
                    return new zzbfb(null);
                }
                return new zzbfc();
            }
            return zzgkq.zzaO(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzbez.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        return (byte) 1;
    }

    public final zzbeu zzc() {
        zzbeu zzbeuVar = this.zzl;
        return zzbeuVar == null ? zzbeu.zzc() : zzbeuVar;
    }

    public final String zzf() {
        return this.zzg;
    }
}
