package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcqr implements zzfbf {
    private final zzcop zza;
    private final zzcqr zzb = this;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcqr(zzcop zzcopVar, Context context, String str, zzcqq zzcqqVar) {
        zzgrh zzgrhVar;
        zzgrh zzgrhVar2;
        zzgrh zzgrhVar3;
        zzgrh zzgrhVar4;
        zzgrh zzgrhVar5;
        zzgrh zzgrhVar6;
        this.zza = zzcopVar;
        zzgqu zza = zzgqv.zza(context);
        this.zzc = zza;
        zzgrhVar = zzcopVar.zzay;
        zzgrhVar2 = zzcopVar.zzaz;
        zzezf zzezfVar = new zzezf(zza, zzgrhVar, zzgrhVar2);
        this.zzd = zzezfVar;
        zzgrhVar3 = zzcopVar.zzay;
        zzgrh zzc = zzgqt.zzc(new zzfap(zzgrhVar3));
        this.zze = zzc;
        zzgrh zzc2 = zzgqt.zzc(zzfca.zza());
        this.zzf = zzc2;
        zzgrhVar4 = zzcopVar.zzp;
        zzgrhVar5 = zzcopVar.zzQ;
        zzgrh zzc3 = zzgqt.zzc(new zzfaz(zza, zzgrhVar4, zzgrhVar5, zzezfVar, zzc, zzfcf.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzgqt.zzc(new zzfbj(zzc3, zzc, zzc2));
        zzgqu zzc4 = zzgqv.zzc(str);
        this.zzi = zzc4;
        zzgrhVar6 = zzcopVar.zzi;
        this.zzj = zzgqt.zzc(new zzfbd(zzc4, zzc3, zza, zzc, zzc2, zzgrhVar6));
    }

    @Override // com.google.android.gms.internal.ads.zzfbf
    public final zzfbc zza() {
        return (zzfbc) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfbf
    public final zzfbi zzb() {
        return (zzfbi) this.zzh.zzb();
    }
}
