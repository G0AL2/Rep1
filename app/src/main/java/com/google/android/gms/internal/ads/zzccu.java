package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzccu extends zzcdo {
    private final Clock zzb;
    private final zzccu zzc = this;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;
    private final zzgrh zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzccu(Context context, Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcdn zzcdnVar, zzcct zzcctVar) {
        this.zzb = clock;
        zzgqu zza = zzgqv.zza(context);
        this.zzd = zza;
        zzgqu zza2 = zzgqv.zza(zzgVar);
        this.zze = zza2;
        zzgqu zza3 = zzgqv.zza(zzcdnVar);
        this.zzf = zza3;
        this.zzg = zzgqt.zzc(new zzccm(zza, zza2, zza3));
        zzgqu zza4 = zzgqv.zza(clock);
        this.zzh = zza4;
        zzgrh zzc = zzgqt.zzc(new zzcco(zza4, zza2, zza3));
        this.zzi = zzc;
        zzccq zzccqVar = new zzccq(zza4, zzc);
        this.zzj = zzccqVar;
        this.zzk = zzgqt.zzc(new zzcdt(zza, zzccqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    final zzccl zza() {
        return (zzccl) this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzcdo
    public final zzccp zzb() {
        return new zzccp(this.zzb, (zzccn) this.zzi.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcdo
    final zzcds zzc() {
        return (zzcds) this.zzk.zzb();
    }
}
