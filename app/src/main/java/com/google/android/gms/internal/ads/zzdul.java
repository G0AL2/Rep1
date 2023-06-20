package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdul implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;

    public zzdul(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4, zzgrh zzgrhVar5) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
        this.zze = zzgrhVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcnl) this.zza).zza();
        final String zzb = ((zzead) this.zzb).zzb();
        zzcfo zza2 = ((zzcnv) this.zzc).zza();
        final zzbdw zzbdwVar = (zzbdw) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbdm zzbdmVar = new zzbdm(new zzbds(zza));
        zzbgl zza3 = zzbgm.zza();
        zza3.zza(zza2.zzb);
        zza3.zzc(zza2.zzc);
        zza3.zzb(true != zza2.zzd ? 2 : 0);
        final zzbgm zzbgmVar = (zzbgm) zza3.zzal();
        zzbdmVar.zzb(new zzbdl() { // from class: com.google.android.gms.internal.ads.zzduk
            @Override // com.google.android.gms.internal.ads.zzbdl
            public final void zza(zzbfb zzbfbVar) {
                zzbdw zzbdwVar2 = zzbdw.this;
                String str2 = zzb;
                zzbgm zzbgmVar2 = zzbgmVar;
                String str3 = str;
                zzbdx zzbdxVar = (zzbdx) zzbfbVar.zza().zzaz();
                zzbdxVar.zza(zzbdwVar2);
                zzbfbVar.zze(zzbdxVar);
                zzbet zzbetVar = (zzbet) zzbfbVar.zzb().zzaz();
                zzbetVar.zza(str2);
                zzbetVar.zzb(zzbgmVar2);
                zzbfbVar.zzg(zzbetVar);
                zzbfbVar.zzh(str3);
            }
        });
        return zzbdmVar;
    }
}
