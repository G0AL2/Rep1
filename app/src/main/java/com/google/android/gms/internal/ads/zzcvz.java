package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcvz implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;

    public zzcvz(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4, zzgrh zzgrhVar5, zzgrh zzgrhVar6, zzgrh zzgrhVar7, zzgrh zzgrhVar8, zzgrh zzgrhVar9, zzgrh zzgrhVar10) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
        this.zze = zzgrhVar5;
        this.zzf = zzgrhVar6;
        this.zzg = zzgrhVar7;
        this.zzh = zzgrhVar8;
        this.zzi = zzgrhVar9;
        this.zzj = zzgrhVar10;
    }

    public static zzcvy zzc(zzcxw zzcxwVar, Context context, zzfbm zzfbmVar, View view, zzcli zzcliVar, zzcxv zzcxvVar, zzdns zzdnsVar, zzdji zzdjiVar, zzgqo zzgqoVar, Executor executor) {
        return new zzcvy(zzcxwVar, context, zzfbmVar, view, zzcliVar, zzcxvVar, zzdnsVar, zzdjiVar, zzgqoVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final zzcvy zzb() {
        return new zzcvy(((zzczs) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcwf) this.zzc).zza(), ((zzcwe) this.zzd).zza(), ((zzcwq) this.zze).zza(), ((zzcwg) this.zzf).zza(), ((zzdls) this.zzg).zza(), (zzdji) this.zzh.zzb(), zzgqt.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
