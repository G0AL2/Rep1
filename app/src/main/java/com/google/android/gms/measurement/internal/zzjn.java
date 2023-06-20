package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzjn extends zzao {
    final /* synthetic */ zzkb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjn(zzkb zzkbVar, zzhd zzhdVar) {
        super(zzhdVar);
        this.zza = zzkbVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzao
    public final void zzc() {
        this.zza.zzs.zzaz().zzk().zza("Tasks have been queued for a long time");
    }
}
