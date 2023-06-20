package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgme implements zzgmt {
    private final zzgma zza;
    private final zzgnk zzb;
    private final boolean zzc;
    private final zzgkd zzd;

    private zzgme(zzgnk zzgnkVar, zzgkd zzgkdVar, zzgma zzgmaVar) {
        this.zzb = zzgnkVar;
        this.zzc = zzgkdVar.zzh(zzgmaVar);
        this.zzd = zzgkdVar;
        this.zza = zzgmaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgme zzc(zzgnk zzgnkVar, zzgkd zzgkdVar, zzgma zzgmaVar) {
        return new zzgme(zzgnkVar, zzgkdVar, zzgmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final int zza(Object obj) {
        zzgnk zzgnkVar = this.zzb;
        int zzb = zzgnkVar.zzb(zzgnkVar.zzd(obj));
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final Object zze() {
        return this.zza.zzaL().zzan();
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzg(Object obj, Object obj2) {
        zzgmv.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgmv.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzh(Object obj, zzgml zzgmlVar, zzgkc zzgkcVar) throws IOException {
        boolean zzO;
        zzgnk zzgnkVar = this.zzb;
        zzgkd zzgkdVar = this.zzd;
        Object zzc = zzgnkVar.zzc(obj);
        zzgkh zzb = zzgkdVar.zzb(obj);
        while (zzgmlVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzgmlVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzgkdVar.zzc(zzgkcVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzgkdVar.zzf(zzgmlVar, zzc2, zzgkcVar, zzb);
                        } else {
                            zzO = zzgnkVar.zzp(zzc, zzgmlVar);
                        }
                    } else {
                        zzO = zzgmlVar.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    int i10 = 0;
                    Object obj2 = null;
                    zzgji zzgjiVar = null;
                    while (zzgmlVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzgmlVar.zzd();
                        if (zzd2 == 16) {
                            i10 = zzgmlVar.zzj();
                            obj2 = zzgkdVar.zzc(zzgkcVar, this.zza, i10);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzgkdVar.zzf(zzgmlVar, obj2, zzgkcVar, zzb);
                            } else {
                                zzgjiVar = zzgmlVar.zzp();
                            }
                        } else if (!zzgmlVar.zzO()) {
                            break;
                        }
                    }
                    if (zzgmlVar.zzd() != 12) {
                        throw zzglc.zzb();
                    } else if (zzgjiVar != null) {
                        if (obj2 != null) {
                            zzgkdVar.zzg(zzgjiVar, obj2, zzgkcVar, zzb);
                        } else {
                            zzgnkVar.zzk(zzc, i10, zzgjiVar);
                        }
                    }
                }
            } finally {
                zzgnkVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgiu zzgiuVar) throws IOException {
        zzgkq zzgkqVar = (zzgkq) obj;
        if (zzgkqVar.zzc == zzgnl.zzc()) {
            zzgkqVar.zzc = zzgnl.zze();
        }
        zzgkn zzgknVar = (zzgkn) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final boolean zzj(Object obj, Object obj2) {
        if (this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            if (this.zzc) {
                this.zzd.zza(obj);
                this.zzd.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzn(Object obj, zzgjy zzgjyVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
