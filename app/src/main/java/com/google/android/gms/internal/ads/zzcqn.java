package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcqn implements zzezr {
    private final zzcop zza;
    private final zzcqn zzb = this;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqn(zzcop zzcopVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcqm zzcqmVar) {
        zzgrh zzgrhVar;
        zzgrh zzgrhVar2;
        zzgrh zzgrhVar3;
        zzgrh zzgrhVar4;
        zzgrh zzgrhVar5;
        this.zza = zzcopVar;
        zzgqu zza = zzgqv.zza(context);
        this.zzc = zza;
        zzgqu zza2 = zzgqv.zza(zzqVar);
        this.zzd = zza2;
        zzgqu zza3 = zzgqv.zza(str);
        this.zze = zza3;
        zzgrhVar = zzcopVar.zzo;
        zzgrh zzc = zzgqt.zzc(new zzemi(zzgrhVar));
        this.zzf = zzc;
        zzgrhVar2 = zzcopVar.zzay;
        zzgrh zzc2 = zzgqt.zzc(new zzfap(zzgrhVar2));
        this.zzg = zzc2;
        zzgrhVar3 = zzcopVar.zzp;
        zzgrhVar4 = zzcopVar.zzQ;
        zzgrh zzc3 = zzgqt.zzc(new zzezp(zza, zzgrhVar3, zzgrhVar4, zzc, zzc2, zzfcf.zza()));
        this.zzh = zzc3;
        zzgrhVar5 = zzcopVar.zzi;
        this.zzi = zzgqt.zzc(new zzemq(zza, zza2, zza3, zzc3, zzc, zzc2, zzgrhVar5));
    }

    @Override // com.google.android.gms.internal.ads.zzezr
    public final zzemp zza() {
        return (zzemp) this.zzi.zzb();
    }
}
