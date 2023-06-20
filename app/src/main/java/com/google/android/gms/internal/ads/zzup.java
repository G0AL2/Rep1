package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzup extends zzva implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzut zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzup(int i10, zzck zzckVar, int i11, zzut zzutVar, int i12, boolean z10) {
        super(i10, zzckVar, i11);
        int i13;
        int i14;
        int i15;
        boolean z11;
        this.zzh = zzutVar;
        this.zzg = zzve.zzf(this.zzd.zzd);
        int i16 = 0;
        this.zzi = zzve.zzi(i12, false);
        int i17 = 0;
        while (true) {
            int size = zzutVar.zzq.size();
            i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (i17 >= size) {
                i17 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i14 = 0;
                break;
            }
            i14 = zzve.zza(this.zzd, (String) zzutVar.zzq.get(i17), false);
            if (i14 > 0) {
                break;
            }
            i17++;
        }
        this.zzk = i17;
        this.zzj = i14;
        int i18 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzad zzadVar = this.zzd;
        int i19 = zzadVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzadVar.zze & 1);
        this.zzq = zzadVar.zzz;
        this.zzr = zzadVar.zzA;
        this.zzs = zzadVar.zzi;
        this.zzf = true;
        String[] zzae = zzeg.zzae();
        int i20 = 0;
        while (true) {
            if (i20 >= zzae.length) {
                i20 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                i15 = 0;
                break;
            }
            i15 = zzve.zza(this.zzd, zzae[i20], false);
            if (i15 > 0) {
                break;
            }
            i20++;
        }
        this.zzn = i20;
        this.zzo = i15;
        int i21 = 0;
        while (true) {
            if (i21 < zzutVar.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzutVar.zzu.get(i21))) {
                    i13 = i21;
                    break;
                }
                i21++;
            } else {
                break;
            }
        }
        this.zzt = i13;
        this.zzu = (i12 & 128) == 128;
        this.zzv = (i12 & 64) == 64;
        zzut zzutVar2 = this.zzh;
        if (zzve.zzi(i12, zzutVar2.zzP) && ((z11 = this.zzf) || zzutVar2.zzK)) {
            i16 = (!zzve.zzi(i12, false) || !z11 || this.zzd.zzi == -1 || (!zzutVar2.zzR && z10)) ? 1 : 2;
        }
        this.zze = i16;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzup zzupVar) {
        zzfsr zzfsrVar;
        zzfsr zza;
        zzfsr zzfsrVar2;
        if (this.zzf && this.zzi) {
            zza = zzve.zzb;
        } else {
            zzfsrVar = zzve.zzb;
            zza = zzfsrVar.zza();
        }
        zzfqy zzc = zzfqy.zzj().zzd(this.zzi, zzupVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzupVar.zzk), zzfsr.zzc().zza()).zzb(this.zzj, zzupVar.zzj).zzb(this.zzl, zzupVar.zzl).zzd(this.zzp, zzupVar.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzupVar.zzn), zzfsr.zzc().zza()).zzb(this.zzo, zzupVar.zzo).zzd(this.zzf, zzupVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzupVar.zzt), zzfsr.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzupVar.zzs);
        boolean z10 = this.zzh.zzz;
        zzfsrVar2 = zzve.zzc;
        zzfqy zzc2 = zzc.zzc(valueOf, valueOf2, zzfsrVar2).zzd(this.zzu, zzupVar.zzu).zzd(this.zzv, zzupVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzupVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzupVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzupVar.zzs);
        if (!zzeg.zzS(this.zzg, zzupVar.zzg)) {
            zza = zzve.zzc;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final /* bridge */ /* synthetic */ boolean zzc(zzva zzvaVar) {
        String str;
        zzup zzupVar = (zzup) zzvaVar;
        boolean z10 = this.zzh.zzN;
        zzad zzadVar = this.zzd;
        int i10 = zzadVar.zzz;
        if (i10 != -1) {
            zzad zzadVar2 = zzupVar.zzd;
            if (i10 == zzadVar2.zzz && (str = zzadVar.zzm) != null && TextUtils.equals(str, zzadVar2.zzm)) {
                boolean z11 = this.zzh.zzM;
                int i11 = this.zzd.zzA;
                return i11 != -1 && i11 == zzupVar.zzd.zzA && this.zzu == zzupVar.zzu && this.zzv == zzupVar.zzv;
            }
            return false;
        }
        return false;
    }
}
