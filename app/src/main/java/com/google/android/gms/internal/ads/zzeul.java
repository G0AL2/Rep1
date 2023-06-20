package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeul implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;

    public zzeul(zzgrh zzgrhVar, zzgrh zzgrhVar2, zzgrh zzgrhVar3, zzgrh zzgrhVar4, zzgrh zzgrhVar5) {
        this.zza = zzgrhVar;
        this.zzb = zzgrhVar2;
        this.zzc = zzgrhVar3;
        this.zzd = zzgrhVar4;
        this.zze = zzgrhVar5;
    }

    public static zzeuj zza(String str, zzbcp zzbcpVar, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, zzfvm zzfvmVar) {
        return new zzeuj(str, zzbcpVar, zzcerVar, scheduledExecutorService, zzfvmVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        return new zzeuj(((zzevl) this.zza).zza(), new zzbcp(), (zzcer) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzfvmVar, null);
    }
}
