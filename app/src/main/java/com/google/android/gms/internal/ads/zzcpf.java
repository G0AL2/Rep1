package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcpf implements zzewk {
    private final zzcop zza;
    private final zzcpf zzb = this;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;
    private final zzgrh zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcpf(zzcop zzcopVar, Context context, String str, zzcpe zzcpeVar) {
        zzgrh zzgrhVar;
        zzgrh zzgrhVar2;
        zzgrh zzgrhVar3;
        zzgrh zzgrhVar4;
        zzgrh zzgrhVar5;
        zzgrh zzgrhVar6;
        zzgrh zzgrhVar7;
        zzgrh zzgrhVar8;
        zzgrh zzgrhVar9;
        zzgrh zzgrhVar10;
        zzgrh zzgrhVar11;
        zzgrh zzgrhVar12;
        zzgrh zzgrhVar13;
        zzgrh zzgrhVar14;
        zzgrh zzgrhVar15;
        this.zza = zzcopVar;
        zzgqu zza = zzgqv.zza(context);
        this.zzc = zza;
        zzgqu zza2 = zzgqv.zza(str);
        this.zzd = zza2;
        zzgrhVar = zzcopVar.zzay;
        zzgrhVar2 = zzcopVar.zzaz;
        zzeze zzezeVar = new zzeze(zza, zzgrhVar, zzgrhVar2);
        this.zze = zzezeVar;
        zzgrhVar3 = zzcopVar.zzay;
        zzgrh zzc = zzgqt.zzc(new zzexi(zzgrhVar3));
        this.zzf = zzc;
        zzgrhVar4 = zzcopVar.zzp;
        zzgrhVar5 = zzcopVar.zzQ;
        zzfcf zza3 = zzfcf.zza();
        zzgrhVar6 = zzcopVar.zzi;
        zzgrh zzc2 = zzgqt.zzc(new zzewc(zza, zzgrhVar4, zzgrhVar5, zzezeVar, zzc, zza3, zzgrhVar6));
        this.zzg = zzc2;
        zzgrhVar7 = zzcopVar.zzQ;
        zzgrhVar8 = zzcopVar.zzi;
        this.zzh = zzgqt.zzc(new zzewi(zzgrhVar7, zza, zza2, zzc2, zzc, zzgrhVar8));
        zzgrhVar9 = zzcopVar.zzay;
        zzgrhVar10 = zzcopVar.zzaz;
        zzezd zzezdVar = new zzezd(zza, zzgrhVar9, zzgrhVar10);
        this.zzi = zzezdVar;
        zzgrhVar11 = zzcopVar.zzp;
        zzgrhVar12 = zzcopVar.zzQ;
        zzfcf zza4 = zzfcf.zza();
        zzgrhVar13 = zzcopVar.zzi;
        zzgrh zzc3 = zzgqt.zzc(new zzexk(zza, zzgrhVar11, zzgrhVar12, zzezdVar, zzc, zza4, zzgrhVar13));
        this.zzj = zzc3;
        zzgrhVar14 = zzcopVar.zzQ;
        zzgrhVar15 = zzcopVar.zzi;
        this.zzk = zzgqt.zzc(new zzexq(zzgrhVar14, zza, zza2, zzc3, zzc, zzgrhVar15));
    }

    @Override // com.google.android.gms.internal.ads.zzewk
    public final zzewh zza() {
        return (zzewh) this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzewk
    public final zzexp zzb() {
        return (zzexp) this.zzk.zzb();
    }
}
