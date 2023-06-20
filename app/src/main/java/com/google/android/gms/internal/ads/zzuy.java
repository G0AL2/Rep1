package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzuy extends zzva implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzuy(int i10, zzck zzckVar, int i11, zzut zzutVar, int i12, String str) {
        super(i10, zzckVar, i11);
        zzfrj zzfrjVar;
        int i13;
        int i14 = 0;
        this.zzf = zzve.zzi(i12, false);
        int i15 = this.zzd.zze;
        int i16 = zzutVar.zzx;
        this.zzg = 1 == (i15 & 1);
        this.zzh = (i15 & 2) != 0;
        if (zzutVar.zzv.isEmpty()) {
            zzfrjVar = zzfrj.zzp("");
        } else {
            zzfrjVar = zzutVar.zzv;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= zzfrjVar.size()) {
                i17 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i13 = 0;
                break;
            }
            i13 = zzve.zza(this.zzd, (String) zzfrjVar.get(i17), false);
            if (i13 > 0) {
                break;
            }
            i17++;
        }
        this.zzi = i17;
        this.zzj = i13;
        int i18 = this.zzd.zzf;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i19 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzve.zza(this.zzd, str, zzve.zzf(str) == null);
        this.zzl = zza;
        boolean z10 = i13 > 0 || (zzutVar.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzve.zzi(i12, zzutVar.zzP) && z10) {
            i14 = 1;
        }
        this.zze = i14;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzuy zzuyVar) {
        zzfqy zzb = zzfqy.zzj().zzd(this.zzf, zzuyVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzuyVar.zzi), zzfsr.zzc().zza()).zzb(this.zzj, zzuyVar.zzj).zzb(this.zzk, zzuyVar.zzk).zzd(this.zzg, zzuyVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzuyVar.zzh), this.zzj == 0 ? zzfsr.zzc() : zzfsr.zzc().zza()).zzb(this.zzl, zzuyVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final /* bridge */ /* synthetic */ boolean zzc(zzva zzvaVar) {
        zzuy zzuyVar = (zzuy) zzvaVar;
        return false;
    }
}
