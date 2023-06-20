package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzvd extends zzva {
    private final boolean zze;
    private final zzut zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final boolean zzo;
    private final boolean zzp;
    private final int zzq;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0091 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzvd(int r4, com.google.android.gms.internal.ads.zzck r5, int r6, com.google.android.gms.internal.ads.zzut r7, int r8, int r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvd.<init>(int, com.google.android.gms.internal.ads.zzck, int, com.google.android.gms.internal.ads.zzut, int, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzvd zzvdVar, zzvd zzvdVar2) {
        zzfsr zzfsrVar;
        zzfsr zza;
        zzfsr zzfsrVar2;
        if (zzvdVar.zze && zzvdVar.zzh) {
            zza = zzve.zzb;
        } else {
            zzfsrVar = zzve.zzb;
            zza = zzfsrVar.zza();
        }
        zzfqy zzj = zzfqy.zzj();
        Integer valueOf = Integer.valueOf(zzvdVar.zzi);
        Integer valueOf2 = Integer.valueOf(zzvdVar2.zzi);
        boolean z10 = zzvdVar.zzf.zzz;
        zzfsrVar2 = zzve.zzc;
        return zzj.zzc(valueOf, valueOf2, zzfsrVar2).zzc(Integer.valueOf(zzvdVar.zzj), Integer.valueOf(zzvdVar2.zzj), zza).zzc(Integer.valueOf(zzvdVar.zzi), Integer.valueOf(zzvdVar2.zzi), zza).zza();
    }

    public static /* synthetic */ int zzd(zzvd zzvdVar, zzvd zzvdVar2) {
        zzfqy zzc = zzfqy.zzj().zzd(zzvdVar.zzh, zzvdVar2.zzh).zzb(zzvdVar.zzl, zzvdVar2.zzl).zzd(true, true).zzd(zzvdVar.zze, zzvdVar2.zze).zzd(zzvdVar.zzg, zzvdVar2.zzg).zzc(Integer.valueOf(zzvdVar.zzk), Integer.valueOf(zzvdVar2.zzk), zzfsr.zzc().zza());
        boolean z10 = zzvdVar.zzo;
        zzfqy zzd = zzc.zzd(z10, zzvdVar2.zzo);
        boolean z11 = zzvdVar.zzp;
        zzfqy zzd2 = zzd.zzd(z11, zzvdVar2.zzp);
        if (z10 && z11) {
            zzd2 = zzd2.zzb(zzvdVar.zzq, zzvdVar2.zzq);
        }
        return zzd2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final int zzb() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final /* bridge */ /* synthetic */ boolean zzc(zzva zzvaVar) {
        zzvd zzvdVar = (zzvd) zzvaVar;
        if (zzeg.zzS(this.zzd.zzm, zzvdVar.zzd.zzm)) {
            boolean z10 = this.zzf.zzJ;
            return this.zzo == zzvdVar.zzo && this.zzp == zzvdVar.zzp;
        }
        return false;
    }
}
